package defpackage;

import j$.util.Objects;
public class xf0 {
    public static final vf0 d;
    public final uf0 a;
    public final Character b;
    public volatile xf0 c;

    static {
        new wf0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new wf0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new xf0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new xf0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new vf0(new uf0("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public xf0(uf0 uf0Var, Character ch) {
        boolean z;
        uf0Var.getClass();
        this.a = uf0Var;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = uf0Var.g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                yve.h(z, "Padding character %s was already in alphabet", ch);
                this.b = ch;
            }
        }
        z = true;
        yve.h(z, "Padding character %s was already in alphabet", ch);
        this.b = ch;
    }

    public final void a(int i, int i2, StringBuilder sb, byte[] bArr) {
        boolean z;
        yve.n(i, i + i2, bArr.length);
        uf0 uf0Var = this.a;
        int i3 = uf0Var.f;
        int i4 = uf0Var.d;
        int i5 = 0;
        if (i2 <= i3) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & 255)) << 8;
        }
        int i7 = ((i2 + 1) << 3) - i4;
        while (i5 < (i2 << 3)) {
            sb.append(uf0Var.b[((int) (j >>> (i7 - i5))) & uf0Var.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < (uf0Var.f << 3)) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void b(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        yve.n(0, i, bArr.length);
        while (i2 < i) {
            uf0 uf0Var = this.a;
            a(i2, Math.min(uf0Var.f, i - i2), sb, bArr);
            i2 += uf0Var.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xf0) {
            xf0 xf0Var = (xf0) obj;
            if (this.a.equals(xf0Var.a) && Objects.equals(this.b, xf0Var.b)) {
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
        uf0 uf0Var = this.a;
        sb.append(uf0Var);
        if (8 % uf0Var.d != 0) {
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

    public xf0(String str, String str2) {
        this(new uf0(str, str2.toCharArray()), (Character) '=');
    }
}
