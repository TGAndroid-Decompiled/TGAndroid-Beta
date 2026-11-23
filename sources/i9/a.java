package i9;

import c8.v0;
import java.math.RoundingMode;
import java.util.Arrays;
public final class a {
    public final String f16164a;
    public final char[] f16165b;
    public final int f16166c;
    public final int d;
    public final int f16167e;
    public final int f16168f;
    public final byte[] f16169g;
    public final boolean h;

    public a(String str, char[] cArr, byte[] bArr, boolean z10) {
        str.getClass();
        this.f16164a = str;
        cArr.getClass();
        this.f16165b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int c10 = v0.c(length);
            this.d = c10;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(c10);
            int i7 = 1 << (3 - numberOfTrailingZeros);
            this.f16167e = i7;
            this.f16168f = c10 >> numberOfTrailingZeros;
            this.f16166c = cArr.length - 1;
            this.f16169g = bArr;
            boolean[] zArr = new boolean[i7];
            for (int i10 = 0; i10 < this.f16168f; i10++) {
                int i11 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[v0.b(i10 * 8, i11)] = true;
            }
            this.h = z10;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.h == aVar.h && Arrays.equals(this.f16165b, aVar.f16165b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = Arrays.hashCode(this.f16165b);
        if (this.h) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return this.f16164a;
    }

    public a(java.lang.String r9, char[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: i9.a.<init>(java.lang.String, char[]):void");
    }
}
