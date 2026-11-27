package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
public class cce {
    public static final lbe d;
    public final fbe a;
    public final Character b;
    public volatile cce c;

    static {
        new rbe("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new rbe("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new cce("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new cce("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new lbe(new fbe("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public cce(fbe fbeVar, Character ch) {
        this.a = fbeVar;
        if (ch != null) {
            byte[] bArr = fbeVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                lq5.j(d5f.a("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        c5f.b(0, i, bArr.length);
        while (i2 < i) {
            fbe fbeVar = this.a;
            b(i2, Math.min(fbeVar.f, i - i2), sb, bArr);
            i2 += fbeVar.f;
        }
    }

    public final void b(int i, int i2, StringBuilder sb, byte[] bArr) {
        c5f.b(i, i + i2, bArr.length);
        fbe fbeVar = this.a;
        int i3 = fbeVar.f;
        int i4 = fbeVar.d;
        if (i2 <= i3) {
            int i5 = 0;
            long j = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                j = (j | (bArr[i + i6] & 255)) << 8;
            }
            int i7 = (i2 + 1) << 3;
            while (i5 < (i2 << 3)) {
                sb.append(fbeVar.b[((int) (j >>> ((i7 - i4) - i5))) & fbeVar.c]);
                i5 += i4;
            }
            if (this.b != null) {
                while (i5 < (fbeVar.f << 3)) {
                    sb.append('=');
                    i5 += i4;
                }
                return;
            }
            return;
        }
        iy8.d();
    }

    public final String c(int i, byte[] bArr) {
        c5f.b(0, i, bArr.length);
        fbe fbeVar = this.a;
        int i2 = fbeVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(fbeVar.e * t6f.a(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            hz6.e(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cce) {
            cce cceVar = (cce) obj;
            if (this.a.equals(cceVar.a) && Objects.equals(this.b, cceVar.b)) {
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
        fbe fbeVar = this.a;
        sb.append(fbeVar);
        if (8 % fbeVar.d != 0) {
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

    public cce(String str, String str2) {
        this(new fbe(str, str2.toCharArray()), (Character) '=');
    }
}
