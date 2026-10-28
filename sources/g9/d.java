package g9;

import a8.yb;
import j$.util.Objects;
public class d {
    public static final b d;
    public final a f12402a;
    public final Character f12403b;
    public volatile d f12404c;

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public d(a aVar, Character ch2) {
        boolean z10;
        this.f12402a = aVar;
        if (ch2 != null) {
            char charValue = ch2.charValue();
            byte[] bArr = aVar.f12401g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z10 = false;
                yb.h(z10, "Padding character %s was already in alphabet", ch2);
                this.f12403b = ch2;
            }
        }
        z10 = true;
        yb.h(z10, "Padding character %s was already in alphabet", ch2);
        this.f12403b = ch2;
    }

    public final void a(StringBuilder sb2, byte[] bArr, int i10, int i11) {
        boolean z10;
        yb.n(i10, i10 + i11, bArr.length);
        a aVar = this.f12402a;
        int i12 = aVar.f12400f;
        int i13 = aVar.d;
        int i14 = 0;
        if (i11 <= i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        long j10 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            j10 = (j10 | (bArr[i10 + i15] & 255)) << 8;
        }
        int i16 = ((i11 + 1) * 8) - i13;
        while (i14 < i11 * 8) {
            sb2.append(aVar.f12398b[((int) (j10 >>> (i16 - i14))) & aVar.f12399c]);
            i14 += i13;
        }
        Character ch2 = this.f12403b;
        if (ch2 != null) {
            while (i14 < aVar.f12400f * 8) {
                sb2.append(ch2.charValue());
                i14 += i13;
            }
        }
    }

    public void b(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        yb.n(0, i10, bArr.length);
        while (i11 < i10) {
            a aVar = this.f12402a;
            a(sb2, bArr, i11, Math.min(aVar.f12400f, i10 - i11));
            i11 += aVar.f12400f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f12402a.equals(dVar.f12402a) && Objects.equals(this.f12403b, dVar.f12403b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12402a.hashCode() ^ Objects.hashCode(this.f12403b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        a aVar = this.f12402a;
        sb2.append(aVar);
        if (8 % aVar.d != 0) {
            Character ch2 = this.f12403b;
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
