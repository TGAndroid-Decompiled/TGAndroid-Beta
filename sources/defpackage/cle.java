package defpackage;

import java.math.RoundingMode;
public abstract class cle {
    public static int a(int i, int i2) {
        boolean z;
        long j = i + i2;
        int i3 = (int) j;
        if (j == i3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return i3;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i + ", " + i2 + ")");
    }

    public static int b(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 != 0) {
            int i3 = i / i2;
            int i4 = i - (i2 * i3);
            if (i4 != 0) {
                boolean z = true;
                int i5 = ((i ^ i2) >> 31) | 1;
                switch (dp5.a[roundingMode.ordinal()]) {
                    case 1:
                        if (i4 != 0) {
                            z = false;
                        }
                        ioe.b(z);
                        return i3;
                    case 2:
                        return i3;
                    case 3:
                        if (i5 >= 0) {
                            return i3;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i5 <= 0) {
                            return i3;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int abs = Math.abs(i4);
                        int abs2 = abs - (Math.abs(i2) - abs);
                        if (abs2 == 0) {
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                            return i3;
                        } else if (abs2 <= 0) {
                            return i3;
                        }
                        break;
                    default:
                        wn4.f();
                        return 0;
                }
                return i3 + i5;
            }
            return i3;
        }
        throw new ArithmeticException("/ by zero");
    }
}
