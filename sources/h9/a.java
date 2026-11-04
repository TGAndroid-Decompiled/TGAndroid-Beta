package h9;

import b8.wc;
import java.math.RoundingMode;
import java.util.Arrays;
public final class a {
    public final String f14354a;
    public final char[] f14355b;
    public final int f14356c;
    public final int d;
    public final int f14357e;
    public final int f14358f;
    public final byte[] f14359g;
    public final boolean h;

    public a(String str, char[] cArr, byte[] bArr, boolean z10) {
        str.getClass();
        this.f14354a = str;
        cArr.getClass();
        this.f14355b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int c2 = wc.c(length);
            this.d = c2;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(c2);
            int i3 = 1 << (3 - numberOfTrailingZeros);
            this.f14357e = i3;
            this.f14358f = c2 >> numberOfTrailingZeros;
            this.f14356c = cArr.length - 1;
            this.f14359g = bArr;
            boolean[] zArr = new boolean[i3];
            for (int i10 = 0; i10 < this.f14358f; i10++) {
                int i11 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[wc.b(i10 * 8, i11)] = true;
            }
            this.h = z10;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.h == aVar.h && Arrays.equals(this.f14355b, aVar.f14355b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int hashCode = Arrays.hashCode(this.f14355b);
        if (this.h) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        return hashCode + i3;
    }

    public final String toString() {
        return this.f14354a;
    }

    public a(java.lang.String r9, char[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: h9.a.<init>(java.lang.String, char[]):void");
    }
}
