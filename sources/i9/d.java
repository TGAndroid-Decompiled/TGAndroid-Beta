package i9;

import a8.ma;
import j$.util.Objects;
public class d {
    public static final b d;
    public final a f16268a;
    public final Character f16269b;
    public volatile d f16270c;

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public d(a aVar, Character ch2) {
        boolean z10;
        this.f16268a = aVar;
        if (ch2 != null) {
            char charValue = ch2.charValue();
            byte[] bArr = aVar.f16266g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z10 = false;
                ma.h(z10, "Padding character %s was already in alphabet", ch2);
                this.f16269b = ch2;
            }
        }
        z10 = true;
        ma.h(z10, "Padding character %s was already in alphabet", ch2);
        this.f16269b = ch2;
    }

    public final void a(StringBuilder sb2, byte[] bArr, int i7, int i10) {
        boolean z10;
        ma.n(i7, i7 + i10, bArr.length);
        a aVar = this.f16268a;
        int i11 = aVar.f16265f;
        int i12 = aVar.d;
        int i13 = 0;
        if (i10 <= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        long j3 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            j3 = (j3 | (bArr[i7 + i14] & 255)) << 8;
        }
        int i15 = ((i10 + 1) * 8) - i12;
        while (i13 < i10 * 8) {
            sb2.append(aVar.f16262b[((int) (j3 >>> (i15 - i13))) & aVar.f16263c]);
            i13 += i12;
        }
        Character ch2 = this.f16269b;
        if (ch2 != null) {
            while (i13 < aVar.f16265f * 8) {
                sb2.append(ch2.charValue());
                i13 += i12;
            }
        }
    }

    public void b(StringBuilder sb2, byte[] bArr, int i7) {
        int i10 = 0;
        ma.n(0, i7, bArr.length);
        while (i10 < i7) {
            a aVar = this.f16268a;
            a(sb2, bArr, i10, Math.min(aVar.f16265f, i7 - i10));
            i10 += aVar.f16265f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f16268a.equals(dVar.f16268a) && Objects.equals(this.f16269b, dVar.f16269b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16268a.hashCode() ^ Objects.hashCode(this.f16269b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        a aVar = this.f16268a;
        sb2.append(aVar);
        if (8 % aVar.d != 0) {
            Character ch2 = this.f16269b;
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
