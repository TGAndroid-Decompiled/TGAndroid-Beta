package f9;

import java.math.RoundingMode;
import java.util.Arrays;
import v7.m7;
public final class a {
    public final String f10523a;
    public final char[] f10524b;
    public final int f10525c;
    public final int d;
    public final int e;
    public final int f10526f;
    public final byte[] f10527g;
    public final boolean h;

    public a(String str, char[] cArr, byte[] bArr, boolean z10) {
        str.getClass();
        this.f10523a = str;
        cArr.getClass();
        this.f10524b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int c10 = m7.c(length);
            this.d = c10;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(c10);
            int i10 = 1 << (3 - numberOfTrailingZeros);
            this.e = i10;
            this.f10526f = c10 >> numberOfTrailingZeros;
            this.f10525c = cArr.length - 1;
            this.f10527g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f10526f; i11++) {
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
            if (this.h == aVar.h && Arrays.equals(this.f10524b, aVar.f10524b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f10524b);
        if (this.h) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return this.f10523a;
    }

    public a(java.lang.String r9, char[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: f9.a.<init>(java.lang.String, char[]):void");
    }
}
