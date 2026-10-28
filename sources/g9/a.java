package g9;

import a8.mc;
import java.math.RoundingMode;
import java.util.Arrays;
public final class a {
    public final String f12397a;
    public final char[] f12398b;
    public final int f12399c;
    public final int d;
    public final int e;
    public final int f12400f;
    public final byte[] f12401g;
    public final boolean h;

    public a(String str, char[] cArr, byte[] bArr, boolean z10) {
        str.getClass();
        this.f12397a = str;
        cArr.getClass();
        this.f12398b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int c10 = mc.c(length);
            this.d = c10;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(c10);
            int i10 = 1 << (3 - numberOfTrailingZeros);
            this.e = i10;
            this.f12400f = c10 >> numberOfTrailingZeros;
            this.f12399c = cArr.length - 1;
            this.f12401g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f12400f; i11++) {
                int i12 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[mc.b(i11 * 8, i12)] = true;
            }
            this.h = z10;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.h == aVar.h && Arrays.equals(this.f12398b, aVar.f12398b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f12398b);
        if (this.h) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return this.f12397a;
    }

    public a(java.lang.String r9, char[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: g9.a.<init>(java.lang.String, char[]):void");
    }
}
