package i9;

import a8.ia;
import j$.util.Objects;
public class d {
    public static final b d;
    public final a f15409a;
    public final Character f15410b;
    public volatile d f15411c;

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public d(a aVar, Character ch2) {
        boolean z9;
        this.f15409a = aVar;
        if (ch2 != null) {
            char charValue = ch2.charValue();
            byte[] bArr = aVar.f15407g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z9 = false;
                ia.h(z9, "Padding character %s was already in alphabet", ch2);
                this.f15410b = ch2;
            }
        }
        z9 = true;
        ia.h(z9, "Padding character %s was already in alphabet", ch2);
        this.f15410b = ch2;
    }

    public final void a(StringBuilder sb2, byte[] bArr, int i7, int i10) {
        boolean z9;
        ia.n(i7, i7 + i10, bArr.length);
        a aVar = this.f15409a;
        int i11 = aVar.f15406f;
        int i12 = aVar.d;
        int i13 = 0;
        if (i10 <= i11) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        long j3 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            j3 = (j3 | (bArr[i7 + i14] & 255)) << 8;
        }
        int i15 = ((i10 + 1) * 8) - i12;
        while (i13 < i10 * 8) {
            sb2.append(aVar.f15403b[((int) (j3 >>> (i15 - i13))) & aVar.f15404c]);
            i13 += i12;
        }
        Character ch2 = this.f15410b;
        if (ch2 != null) {
            while (i13 < aVar.f15406f * 8) {
                sb2.append(ch2.charValue());
                i13 += i12;
            }
        }
    }

    public void b(StringBuilder sb2, byte[] bArr, int i7) {
        int i10 = 0;
        ia.n(0, i7, bArr.length);
        while (i10 < i7) {
            a aVar = this.f15409a;
            a(sb2, bArr, i10, Math.min(aVar.f15406f, i7 - i10));
            i10 += aVar.f15406f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f15409a.equals(dVar.f15409a) && Objects.equals(this.f15410b, dVar.f15410b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15409a.hashCode() ^ Objects.hashCode(this.f15410b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        a aVar = this.f15409a;
        sb2.append(aVar);
        if (8 % aVar.d != 0) {
            Character ch2 = this.f15410b;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public d(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }
}
