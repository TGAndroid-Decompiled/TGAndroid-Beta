package n7;

import java.math.RoundingMode;
import java.util.Arrays;
public final class j0 {
    public final String f17283a;
    public final char[] f17284b;
    public final int f17285c;
    public final int d;
    public final int e;
    public final int f17286f;
    public final byte[] f17287g;
    public final boolean h;

    public j0(java.lang.String r9, char[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: n7.j0.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            if (this.h == j0Var.h && Arrays.equals(this.f17284b, j0Var.f17284b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f17284b);
        if (true != this.h) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return this.f17283a;
    }

    public j0(String str, char[] cArr, byte[] bArr, boolean z10) {
        int numberOfLeadingZeros;
        this.f17283a = str;
        cArr.getClass();
        this.f17284b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (n0.f17299a[roundingMode.ordinal()]) {
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
                this.f17286f = numberOfLeadingZeros >> numberOfTrailingZeros;
                this.f17285c = length - 1;
                this.f17287g = bArr;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 < this.f17286f; i11++) {
                    int i12 = this.d;
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    zArr[a.a(i11 * 8, i12)] = true;
                }
                this.h = z10;
                return;
            }
            throw new IllegalArgumentException("x (0) must be > 0");
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(i2.e.j(cArr.length, "Illegal alphabet length "), e);
        }
    }
}
