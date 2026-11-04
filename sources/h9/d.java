package h9;

import b8.zb;
import j$.util.Objects;
public class d {
    public static final b d;
    public final a f14361a;
    public final Character f14362b;
    public volatile d f14363c;

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public d(a aVar, Character ch2) {
        boolean z10;
        this.f14361a = aVar;
        if (ch2 != null) {
            char charValue = ch2.charValue();
            byte[] bArr = aVar.f14359g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z10 = false;
                zb.h(z10, "Padding character %s was already in alphabet", ch2);
                this.f14362b = ch2;
            }
        }
        z10 = true;
        zb.h(z10, "Padding character %s was already in alphabet", ch2);
        this.f14362b = ch2;
    }

    public final void a(StringBuilder sb2, byte[] bArr, int i3, int i10) {
        boolean z10;
        zb.n(i3, i3 + i10, bArr.length);
        a aVar = this.f14361a;
        int i11 = aVar.f14358f;
        int i12 = aVar.d;
        int i13 = 0;
        if (i10 <= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        long j10 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            j10 = (j10 | (bArr[i3 + i14] & 255)) << 8;
        }
        int i15 = ((i10 + 1) * 8) - i12;
        while (i13 < i10 * 8) {
            sb2.append(aVar.f14355b[((int) (j10 >>> (i15 - i13))) & aVar.f14356c]);
            i13 += i12;
        }
        Character ch2 = this.f14362b;
        if (ch2 != null) {
            while (i13 < aVar.f14358f * 8) {
                sb2.append(ch2.charValue());
                i13 += i12;
            }
        }
    }

    public void b(StringBuilder sb2, byte[] bArr, int i3) {
        int i10 = 0;
        zb.n(0, i3, bArr.length);
        while (i10 < i3) {
            a aVar = this.f14361a;
            a(sb2, bArr, i10, Math.min(aVar.f14358f, i3 - i10));
            i10 += aVar.f14358f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f14361a.equals(dVar.f14361a) && Objects.equals(this.f14362b, dVar.f14362b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14361a.hashCode() ^ Objects.hashCode(this.f14362b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        a aVar = this.f14361a;
        sb2.append(aVar);
        if (8 % aVar.d != 0) {
            Character ch2 = this.f14362b;
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
