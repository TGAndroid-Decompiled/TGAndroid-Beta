package i9;

import c8.r0;
import java.math.RoundingMode;
import java.util.Arrays;
public final class a {
    public final String f15402a;
    public final char[] f15403b;
    public final int f15404c;
    public final int d;
    public final int f15405e;
    public final int f15406f;
    public final byte[] f15407g;
    public final boolean h;

    public a(String str, char[] cArr, byte[] bArr, boolean z9) {
        str.getClass();
        this.f15402a = str;
        cArr.getClass();
        this.f15403b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int c10 = r0.c(length);
            this.d = c10;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(c10);
            int i7 = 1 << (3 - numberOfTrailingZeros);
            this.f15405e = i7;
            this.f15406f = c10 >> numberOfTrailingZeros;
            this.f15404c = cArr.length - 1;
            this.f15407g = bArr;
            boolean[] zArr = new boolean[i7];
            for (int i10 = 0; i10 < this.f15406f; i10++) {
                int i11 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[r0.b(i10 * 8, i11)] = true;
            }
            this.h = z9;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.h == aVar.h && Arrays.equals(this.f15403b, aVar.f15403b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = Arrays.hashCode(this.f15403b);
        if (this.h) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return this.f15402a;
    }

    public a(java.lang.String r9, char[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: i9.a.<init>(java.lang.String, char[]):void");
    }
}
