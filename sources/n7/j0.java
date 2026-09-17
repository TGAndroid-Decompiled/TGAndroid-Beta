package n7;

import java.math.RoundingMode;
import java.util.Arrays;
public final class j0 {
    public final String f16646a;
    public final char[] f16647b;
    public final int f16648c;
    public final int d;
    public final int f16649e;
    public final int f16650f;
    public final byte[] f16651g;
    public final boolean h;

    public j0(java.lang.String r9, char[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: n7.j0.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            if (this.h == j0Var.h && Arrays.equals(this.f16647b, j0Var.f16647b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f16647b);
        if (true != this.h) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return this.f16646a;
    }

    public j0(String str, char[] cArr, byte[] bArr, boolean z10) {
        int numberOfLeadingZeros;
        this.f16646a = str;
        cArr.getClass();
        this.f16647b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (n0.f16665a[roundingMode.ordinal()]) {
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
                this.f16649e = i10;
                this.f16650f = numberOfLeadingZeros >> numberOfTrailingZeros;
                this.f16648c = length - 1;
                this.f16651g = bArr;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 < this.f16650f; i11++) {
                    int i12 = this.d;
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    zArr[a.a(i11 * 8, i12)] = true;
                }
                this.h = z10;
                return;
            }
            throw new IllegalArgumentException("x (0) must be > 0");
        } catch (ArithmeticException e7) {
            throw new IllegalArgumentException(i2.g.i(cArr.length, "Illegal alphabet length "), e7);
        }
    }
}
