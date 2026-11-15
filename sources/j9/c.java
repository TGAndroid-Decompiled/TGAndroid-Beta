package j9;

import a8.ja;
import c8.r0;
import c8.u0;
import java.math.RoundingMode;
public abstract class c {
    public static final int f16954a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (r0.b(d)) {
            if (d == 0.0d || 52 - Long.numberOfTrailingZeros(r0.a(d)) <= Math.getExponent(d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean b(double d) {
        if (d > 0.0d && r0.b(d)) {
            long a10 = r0.a(d);
            if ((a10 & (a10 - 1)) == 0) {
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
        if (d > 0.0d && r0.b(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.e("x must be positive and finite", z10);
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) >= -1022) {
            switch (b.f16953a[roundingMode.ordinal()]) {
                case 1:
                    u0.b(b(d));
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
}
