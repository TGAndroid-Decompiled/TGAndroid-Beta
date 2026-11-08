package j9;

import a8.ia;
import c8.q0;
import c8.t0;
import java.math.RoundingMode;
public abstract class c {
    public static final int f16601a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (q0.b(d)) {
            if (d == 0.0d || 52 - Long.numberOfTrailingZeros(q0.a(d)) <= Math.getExponent(d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean b(double d) {
        if (d > 0.0d && q0.b(d)) {
            long a10 = q0.a(d);
            if ((a10 & (a10 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static int c(double d) {
        boolean z9;
        boolean b10;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z10 = false;
        if (d > 0.0d && q0.b(d)) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.e("x must be positive and finite", z9);
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) >= -1022) {
            switch (b.f16600a[roundingMode.ordinal()]) {
                case 1:
                    t0.b(b(d));
                    break;
                case 2:
                    break;
                case 3:
                    z10 = !b(d);
                    break;
                case 4:
                    if (exponent < 0) {
                        z10 = true;
                    }
                    b10 = b(d);
                    z10 &= !b10;
                    break;
                case 5:
                    if (exponent >= 0) {
                        z10 = true;
                    }
                    b10 = b(d);
                    z10 &= !b10;
                    break;
                case 6:
                case 7:
                case 8:
                    double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                    if (longBitsToDouble * longBitsToDouble > 2.0d) {
                        z10 = true;
                        break;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            if (z10) {
                return exponent + 1;
            }
            return exponent;
        }
        return c(d * 4.503599627370496E15d) - 52;
    }
}
