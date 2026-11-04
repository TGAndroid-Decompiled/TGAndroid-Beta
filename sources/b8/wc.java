package b8;

import java.math.RoundingMode;
public abstract class wc {
    public static int a(int i3, int i10) {
        boolean z10;
        long j10 = i3 + i10;
        int i11 = (int) j10;
        if (j10 == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return i11;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i3 + ", " + i10 + ")");
    }

    public static int b(int i3, int i10) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i10 != 0) {
            int i11 = i3 / i10;
            int i12 = i3 - (i10 * i11);
            if (i12 != 0) {
                boolean z10 = true;
                int i13 = ((i3 ^ i10) >> 31) | 1;
                switch (i9.d.f14714a[roundingMode.ordinal()]) {
                    case 1:
                        if (i12 != 0) {
                            z10 = false;
                        }
                        yc.b(z10);
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

    public static int c(int i3) {
        boolean z10;
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i3 > 0) {
            boolean z11 = true;
            switch (i9.d.f14714a[roundingMode.ordinal()]) {
                case 1:
                    if (i3 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (((i3 - 1) & i3) != 0) {
                        z11 = false;
                    }
                    yc.b(z10 & z11);
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i3 - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i3);
                    return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i3))) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i3);
        }
        throw new IllegalArgumentException(k2.p1.j(i3, "x (", ") must be > 0"));
    }
}
