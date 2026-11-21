package i9;

import c8.u0;
import java.math.RoundingMode;
import java.util.Arrays;
public final class a {
    public final String f16195a;
    public final char[] f16196b;
    public final int f16197c;
    public final int d;
    public final int f16198e;
    public final int f16199f;
    public final byte[] f16200g;
    public final boolean h;

    public a(String str, char[] cArr, byte[] bArr, boolean z10) {
        str.getClass();
        this.f16195a = str;
        cArr.getClass();
        this.f16196b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int c10 = u0.c(length);
            this.d = c10;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(c10);
            int i7 = 1 << (3 - numberOfTrailingZeros);
            this.f16198e = i7;
            this.f16199f = c10 >> numberOfTrailingZeros;
            this.f16197c = cArr.length - 1;
            this.f16200g = bArr;
            boolean[] zArr = new boolean[i7];
            for (int i10 = 0; i10 < this.f16199f; i10++) {
                int i11 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[u0.b(i10 * 8, i11)] = true;
            }
            this.h = z10;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.h == aVar.h && Arrays.equals(this.f16196b, aVar.f16196b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = Arrays.hashCode(this.f16196b);
        if (this.h) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return this.f16195a;
    }

    public a(java.lang.String r9, char[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: i9.a.<init>(java.lang.String, char[]):void");
    }
}
