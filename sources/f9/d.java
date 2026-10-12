package f9;

import j$.util.Objects;
import v7.u6;
public class d {
    public static final b d;
    public final a f9068a;
    public final Character f9069b;
    public volatile d f9070c;

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public d(a aVar, Character ch2) {
        boolean z10;
        this.f9068a = aVar;
        if (ch2 != null) {
            char charValue = ch2.charValue();
            byte[] bArr = aVar.f9067g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z10 = false;
                u6.h(z10, "Padding character %s was already in alphabet", ch2);
                this.f9069b = ch2;
            }
        }
        z10 = true;
        u6.h(z10, "Padding character %s was already in alphabet", ch2);
        this.f9069b = ch2;
    }

    public final void a(StringBuilder sb2, byte[] bArr, int i10, int i11) {
        boolean z10;
        u6.n(i10, i10 + i11, bArr.length);
        a aVar = this.f9068a;
        int i12 = aVar.f9066f;
        int i13 = aVar.d;
        int i14 = 0;
        if (i11 <= i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        long j10 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            j10 = (j10 | (bArr[i10 + i15] & 255)) << 8;
        }
        int i16 = ((i11 + 1) * 8) - i13;
        while (i14 < i11 * 8) {
            sb2.append(aVar.f9064b[((int) (j10 >>> (i16 - i14))) & aVar.f9065c]);
            i14 += i13;
        }
        Character ch2 = this.f9069b;
        if (ch2 != null) {
            while (i14 < aVar.f9066f * 8) {
                sb2.append(ch2.charValue());
                i14 += i13;
            }
        }
    }

    public void b(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        u6.n(0, i10, bArr.length);
        while (i11 < i10) {
            a aVar = this.f9068a;
            a(sb2, bArr, i11, Math.min(aVar.f9066f, i10 - i11));
            i11 += aVar.f9066f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f9068a.equals(dVar.f9068a) && Objects.equals(this.f9069b, dVar.f9069b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9068a.hashCode() ^ Objects.hashCode(this.f9069b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        a aVar = this.f9068a;
        sb2.append(aVar);
        if (8 % aVar.d != 0) {
            Character ch2 = this.f9069b;
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
