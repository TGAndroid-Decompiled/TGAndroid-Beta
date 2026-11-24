package defpackage;

import j$.util.Objects;
public class vf0 {
    public static final tf0 d;
    public final sf0 a;
    public final Character b;
    public volatile vf0 c;

    static {
        new uf0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new uf0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new vf0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new vf0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new tf0(new sf0("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public vf0(sf0 sf0Var, Character ch) {
        boolean z;
        sf0Var.getClass();
        this.a = sf0Var;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = sf0Var.g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                gre.h(z, "Padding character %s was already in alphabet", ch);
                this.b = ch;
            }
        }
        z = true;
        gre.h(z, "Padding character %s was already in alphabet", ch);
        this.b = ch;
    }

    public final void a(int i, int i2, StringBuilder sb, byte[] bArr) {
        boolean z;
        gre.n(i, i + i2, bArr.length);
        sf0 sf0Var = this.a;
        int i3 = sf0Var.f;
        int i4 = sf0Var.d;
        int i5 = 0;
        if (i2 <= i3) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & 255)) << 8;
        }
        int i7 = ((i2 + 1) << 3) - i4;
        while (i5 < (i2 << 3)) {
            sb.append(sf0Var.b[((int) (j >>> (i7 - i5))) & sf0Var.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < (sf0Var.f << 3)) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void b(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        gre.n(0, i, bArr.length);
        while (i2 < i) {
            sf0 sf0Var = this.a;
            a(i2, Math.min(sf0Var.f, i - i2), sb, bArr);
            i2 += sf0Var.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vf0) {
            vf0 vf0Var = (vf0) obj;
            if (this.a.equals(vf0Var.a) && Objects.equals(this.b, vf0Var.b)) {
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
        sf0 sf0Var = this.a;
        sb.append(sf0Var);
        if (8 % sf0Var.d != 0) {
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

    public vf0(String str, String str2) {
        this(new sf0(str, str2.toCharArray()), (Character) '=');
    }
}
