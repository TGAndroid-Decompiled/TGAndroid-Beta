package i9;

import b8.vc;
import b8.yc;
import b8.zb;
import java.math.RoundingMode;
public abstract class c {
    public static final int f14713a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (vc.b(d)) {
            if (d == 0.0d || 52 - Long.numberOfTrailingZeros(vc.a(d)) <= Math.getExponent(d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean b(double d) {
        if (d > 0.0d && vc.b(d)) {
            long a10 = vc.a(d);
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
        if (d > 0.0d && vc.b(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.e("x must be positive and finite", z10);
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) >= -1022) {
            switch (b.f14712a[roundingMode.ordinal()]) {
                case 1:
                    yc.b(b(d));
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
