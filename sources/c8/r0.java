package c8;

import java.math.RoundingMode;
public abstract class r0 {
    public static int a(int i7, int i10) {
        boolean z9;
        long j3 = i7 + i10;
        int i11 = (int) j3;
        if (j3 == i11) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return i11;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i7 + ", " + i10 + ")");
    }

    public static int b(int i7, int i10) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i10 != 0) {
            int i11 = i7 / i10;
            int i12 = i7 - (i10 * i11);
            if (i12 != 0) {
                boolean z9 = true;
                int i13 = ((i7 ^ i10) >> 31) | 1;
                switch (j9.d.f16602a[roundingMode.ordinal()]) {
                    case 1:
                        if (i12 != 0) {
                            z9 = false;
                        }
                        t0.b(z9);
                        return i11;
                    case 2:
                        return i11;
                    case 3:
                        if (i13 >= 0) {
                            return i11;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i13 <= 0) {
                            return i11;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int abs = Math.abs(i12);
                        int abs2 = abs - (Math.abs(i10) - abs);
                        if (abs2 == 0) {
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                            return i11;
                        } else if (abs2 <= 0) {
                            return i11;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
                return i11 + i13;
            }
            return i11;
        }
        throw new ArithmeticException("/ by zero");
    }

    public static int c(int i7) {
        boolean z9;
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i7 > 0) {
            boolean z10 = true;
            switch (j9.d.f16602a[roundingMode.ordinal()]) {
                case 1:
                    if (i7 > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (((i7 - 1) & i7) != 0) {
                        z10 = false;
                    }
                    t0.b(z9 & z10);
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i7 - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i7);
                    return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i7))) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i7);
        }
        throw new IllegalArgumentException(jg.g.k(i7, "x (", ") must be > 0"));
    }
}
