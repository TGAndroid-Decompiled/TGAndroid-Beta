package f9;

import java.math.RoundingMode;
import java.util.Arrays;
import v7.n7;
public final class a {
    public final String f6964a;
    public final char[] f6965b;
    public final int f6966c;
    public final int d;
    public final int e;
    public final int f6967f;
    public final byte[] f6968g;
    public final boolean h;

    public a(String str, char[] cArr, byte[] bArr, boolean z10) {
        str.getClass();
        this.f6964a = str;
        cArr.getClass();
        this.f6965b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int c10 = n7.c(length);
            this.d = c10;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(c10);
            int i10 = 1 << (3 - numberOfTrailingZeros);
            this.e = i10;
            this.f6967f = c10 >> numberOfTrailingZeros;
            this.f6966c = cArr.length - 1;
            this.f6968g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f6967f; i11++) {
                int i12 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[n7.b(i11 * 8, i12)] = true;
            }
            this.h = z10;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.h == aVar.h && Arrays.equals(this.f6965b, aVar.f6965b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f6965b);
        if (this.h) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return this.f6964a;
    }

    public a(java.lang.String r9, char[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: f9.a.<init>(java.lang.String, char[]):void");
    }
}
