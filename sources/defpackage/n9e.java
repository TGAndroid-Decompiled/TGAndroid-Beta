package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
public class n9e {
    public static final w8e d;
    public final q8e a;
    public final Character b;
    public volatile n9e c;

    static {
        new c9e("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new c9e("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new n9e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new n9e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new w8e(new q8e("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public n9e(q8e q8eVar, Character ch) {
        this.a = q8eVar;
        if (ch != null) {
            byte[] bArr = q8eVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                u36.j(n2f.a("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        m2f.b(0, i, bArr.length);
        while (i2 < i) {
            q8e q8eVar = this.a;
            b(i2, Math.min(q8eVar.f, i - i2), sb, bArr);
            i2 += q8eVar.f;
        }
    }

    public final void b(int i, int i2, StringBuilder sb, byte[] bArr) {
        m2f.b(i, i + i2, bArr.length);
        q8e q8eVar = this.a;
        int i3 = q8eVar.f;
        int i4 = q8eVar.d;
        if (i2 <= i3) {
            int i5 = 0;
            long j = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                j = (j | (bArr[i + i6] & 255)) << 8;
            }
            int i7 = (i2 + 1) << 3;
            while (i5 < (i2 << 3)) {
                sb.append(q8eVar.b[((int) (j >>> ((i7 - i4) - i5))) & q8eVar.c]);
                i5 += i4;
            }
            if (this.b != null) {
                while (i5 < (q8eVar.f << 3)) {
                    sb.append('=');
                    i5 += i4;
                }
                return;
            }
            return;
        }
        i98.g();
    }

    public final String c(int i, byte[] bArr) {
        m2f.b(0, i, bArr.length);
        q8e q8eVar = this.a;
        int i2 = q8eVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(q8eVar.e * d4f.a(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            bh7.j(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n9e) {
            n9e n9eVar = (n9e) obj;
            if (this.a.equals(n9eVar.a) && Objects.equals(this.b, n9eVar.b)) {
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
        q8e q8eVar = this.a;
        sb.append(q8eVar);
        if (8 % q8eVar.d != 0) {
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

    public n9e(String str, String str2) {
        this(new q8e(str, str2.toCharArray()), (Character) '=');
    }
}
