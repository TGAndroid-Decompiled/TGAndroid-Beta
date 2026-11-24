package defpackage;

import java.math.RoundingMode;
public abstract class mge {
    public static boolean a(double d) {
        if (rge.b(d)) {
            if (d == 0.0d || 52 - Long.numberOfTrailingZeros(rge.a(d)) <= Math.getExponent(d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean b(double d) {
        if (d > 0.0d && rge.b(d)) {
            long a = rge.a(d);
            if ((a & (a - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static int c(double d) {
        boolean z;
        boolean b;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z2 = false;
        if (d > 0.0d && rge.b(d)) {
            z = true;
        } else {
            z = false;
        }
        jte.e("x must be positive and finite", z);
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) >= -1022) {
            switch (nq3.a[roundingMode.ordinal()]) {
                case 1:
                    lqe.b(b(d));
                    break;
                case 2:
                    break;
                case 3:
                    z2 = !b(d);
                    break;
                case 4:
                    if (exponent < 0) {
                        z2 = true;
                    }
                    b = b(d);
                    z2 &= !b;
                    break;
                case 5:
                    if (exponent >= 0) {
                        z2 = true;
                    }
                    b = b(d);
                    z2 &= !b;
                    break;
                case 6:
                case 7:
                case 8:
                    double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                    if (longBitsToDouble * longBitsToDouble > 2.0d) {
                        z2 = true;
                        break;
                    }
                    break;
                default:
                    zo4.f();
                    return 0;
            }
            if (z2) {
                return exponent + 1;
            }
            return exponent;
        }
        return c(d * 4.503599627370496E15d) - 52;
    }
}
