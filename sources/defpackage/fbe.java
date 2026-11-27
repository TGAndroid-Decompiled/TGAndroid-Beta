package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;
public final class fbe {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    public fbe(String str, char[] cArr, byte[] bArr, boolean z) {
        int numberOfLeadingZeros;
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (jce.a[roundingMode.ordinal()]) {
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
                int i = 1 << (3 - numberOfTrailingZeros);
                this.e = i;
                this.f = numberOfLeadingZeros >> numberOfTrailingZeros;
                this.c = length - 1;
                this.g = bArr;
                boolean[] zArr = new boolean[i];
                for (int i2 = 0; i2 < this.f; i2++) {
                    int i3 = this.d;
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    zArr[t6f.a(i2 << 3, i3)] = true;
                }
                this.h = z;
                return;
            }
            throw new IllegalArgumentException("x (0) must be > 0");
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(uh9.k(cArr.length, "Illegal alphabet length "), e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fbe) {
            fbe fbeVar = (fbe) obj;
            if (this.h == fbeVar.h && Arrays.equals(this.b, fbeVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.b);
        if (true != this.h) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode + i;
    }

    public final String toString() {
        return this.a;
    }

    public fbe(java.lang.String r10, char[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbe.<init>(java.lang.String, char[]):void");
    }
}
