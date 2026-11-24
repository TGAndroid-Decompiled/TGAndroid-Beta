package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
public class m7e {
    public static final v6e d;
    public final p6e a;
    public final Character b;
    public volatile m7e c;

    static {
        new b7e("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new b7e("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new m7e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new m7e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new v6e(new p6e("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public m7e(p6e p6eVar, Character ch) {
        this.a = p6eVar;
        if (ch != null) {
            byte[] bArr = p6eVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                w26.j(l0f.a("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        k0f.b(0, i, bArr.length);
        while (i2 < i) {
            p6e p6eVar = this.a;
            b(i2, Math.min(p6eVar.f, i - i2), sb, bArr);
            i2 += p6eVar.f;
        }
    }

    public final void b(int i, int i2, StringBuilder sb, byte[] bArr) {
        k0f.b(i, i + i2, bArr.length);
        p6e p6eVar = this.a;
        int i3 = p6eVar.f;
        int i4 = p6eVar.d;
        if (i2 <= i3) {
            int i5 = 0;
            long j = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                j = (j | (bArr[i + i6] & 255)) << 8;
            }
            int i7 = (i2 + 1) << 3;
            while (i5 < (i2 << 3)) {
                sb.append(p6eVar.b[((int) (j >>> ((i7 - i4) - i5))) & p6eVar.c]);
                i5 += i4;
            }
            if (this.b != null) {
                while (i5 < (p6eVar.f << 3)) {
                    sb.append('=');
                    i5 += i4;
                }
                return;
            }
            return;
        }
        sc8.e();
    }

    public final String c(int i, byte[] bArr) {
        k0f.b(0, i, bArr.length);
        p6e p6eVar = this.a;
        int i2 = p6eVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(p6eVar.e * b2f.a(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            fi7.g(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m7e) {
            m7e m7eVar = (m7e) obj;
            if (this.a.equals(m7eVar.a) && Objects.equals(this.b, m7eVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Objects.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        p6e p6eVar = this.a;
        sb.append(p6eVar);
        if (8 % p6eVar.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public m7e(String str, String str2) {
        this(new p6e(str, str2.toCharArray()), (Character) '=');
    }
}
