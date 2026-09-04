package g9;

import java.math.RoundingMode;
import v7.n7;
public abstract class c {
    public static final int f10494a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (n7.b(d)) {
            if (d == 0.0d || 52 - Long.numberOfTrailingZeros(n7.a(d)) <= Math.getExponent(d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean b(double d) {
        if (d > 0.0d && n7.b(d)) {
            long a2 = n7.a(d);
            if ((a2 & (a2 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static int c(double d) {
        boolean z10;
        boolean b10;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z11 = false;
        if (d > 0.0d && n7.b(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int exponent = Math.getExponent(d);
            if (Math.getExponent(d) >= -1022) {
                switch (b.f10493a[roundingMode.ordinal()]) {
                    case 1:
                        if (!b(d)) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        z11 = !b(d);
                        break;
                    case 4:
                        if (exponent < 0) {
                            z11 = true;
                        }
                        b10 = b(d);
                        z11 &= !b10;
                        break;
                    case 5:
                        if (exponent >= 0) {
                            z11 = true;
                        }
                        b10 = b(d);
                        z11 &= !b10;
                        break;
                    case 6:
                    case 7:
                    case 8:
                        double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                        if (longBitsToDouble * longBitsToDouble > 2.0d) {
                            z11 = true;
                            break;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
                if (z11) {
                    return exponent + 1;
                }
                return exponent;
            }
            return c(d * 4.503599627370496E15d) - 52;
        }
        throw new IllegalArgumentException("x must be positive and finite");
    }
}
