package step2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OperatorTest {

    @Test
    public void plusTest() {
        int num1 = 6;
        int num2 = 3;

        int result = Operator.PLUS.operate(num1, num2);

        assertThat(result).isEqualTo(9);
    }

    @Test
    public void minusTest() {
        int num1 = 6;
        int num2 = 3;

        int result = Operator.MINUS.operate(num1, num2);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void multipleTest() {
        int num1 = 6;
        int num2 = 3;

        int result = Operator.MULTIPLE.operate(num1, num2);

        assertThat(result).isEqualTo(18);
    }

    @Test
    public void divideTest() {
        int num1 = 6;
        int num2 = 3;

        int result = Operator.DIVIDE.operate(num1, num2);

        assertThat(result).isEqualTo(2);
    }
}
