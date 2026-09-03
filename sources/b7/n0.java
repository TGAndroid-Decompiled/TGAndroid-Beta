package b7;

import java.math.RoundingMode;
import java.util.Arrays;
public final class n0 {
    public final String f1718a;
    public final char[] f1719b;
    public final int f1720c;
    public final int d;
    public final int e;
    public final int f1721f;
    public final byte[] f1722g;
    public final boolean h;

    public n0(java.lang.String r9, char[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: b7.n0.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            if (this.h == n0Var.h && Arrays.equals(this.f1719b, n0Var.f1719b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f1719b);
        if (true != this.h) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return this.f1718a;
    }

    public n0(String str, char[] cArr, byte[] bArr, boolean z4) {
        int numberOfLeadingZeros;
        this.f1718a = str;
        cArr.getClass();
        this.f1719b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (r0.f1735a[roundingMode.ordinal()]) {
                    case 1:
                        if (((length - 1) & length) != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                    case 2:
                    case 3:
                        numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        break;
                    case 4:
                    case 5:
                        numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        numberOfLeadingZeros = (31 - numberOfLeadingZeros2) + ((((-1257966797) >>> numberOfLeadingZeros2) - length) >>> 31);
                        break;
                    default:
                        throw new AssertionError();
                }
                this.d = numberOfLeadingZeros;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                int i10 = 1 << (3 - numberOfTrailingZeros);
                this.e = i10;
                this.f1721f = numberOfLeadingZeros >> numberOfTrailingZeros;
                this.f1720c = length - 1;
                this.f1722g = bArr;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 < this.f1721f; i11++) {
                    int i12 = this.d;
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    zArr[b.a(i11 * 8, i12)] = true;
                }
                this.h = z4;
                return;
            }
            throw new IllegalArgumentException("x (0) must be > 0");
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(kf.k0.j(cArr.length, "Illegal alphabet length "), e);
        }
    }
}
