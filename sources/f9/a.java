package f9;

import java.math.RoundingMode;
import java.util.Arrays;
import v7.m7;
public final class a {
    public final String f9063a;
    public final char[] f9064b;
    public final int f9065c;
    public final int d;
    public final int e;
    public final int f9066f;
    public final byte[] f9067g;
    public final boolean h;

    public a(String str, char[] cArr, byte[] bArr, boolean z10) {
        str.getClass();
        this.f9063a = str;
        cArr.getClass();
        this.f9064b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int c10 = m7.c(length);
            this.d = c10;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(c10);
            int i10 = 1 << (3 - numberOfTrailingZeros);
            this.e = i10;
            this.f9066f = c10 >> numberOfTrailingZeros;
            this.f9065c = cArr.length - 1;
            this.f9067g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f9066f; i11++) {
                int i12 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[m7.b(i11 * 8, i12)] = true;
            }
            this.h = z10;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.h == aVar.h && Arrays.equals(this.f9064b, aVar.f9064b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f9064b);
        if (this.h) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return this.f9063a;
    }

    public a(java.lang.String r9, char[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: f9.a.<init>(java.lang.String, char[]):void");
    }
}
