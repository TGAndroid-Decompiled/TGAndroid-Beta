package defpackage;

import j$.util.Objects;
public class vg0 {
    public static final tg0 d;
    public final sg0 a;
    public final Character b;
    public volatile vg0 c;

    static {
        new ug0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new ug0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new vg0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new vg0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new tg0(new sg0("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public vg0(sg0 sg0Var, Character ch) {
        boolean z;
        sg0Var.getClass();
        this.a = sg0Var;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = sg0Var.g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                jte.h(z, "Padding character %s was already in alphabet", ch);
                this.b = ch;
            }
        }
        z = true;
        jte.h(z, "Padding character %s was already in alphabet", ch);
        this.b = ch;
    }

    public final void a(int i, int i2, StringBuilder sb, byte[] bArr) {
        boolean z;
        jte.n(i, i + i2, bArr.length);
        sg0 sg0Var = this.a;
        int i3 = sg0Var.f;
        int i4 = sg0Var.d;
        int i5 = 0;
        if (i2 <= i3) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & 255)) << 8;
        }
        int i7 = ((i2 + 1) << 3) - i4;
        while (i5 < (i2 << 3)) {
            sb.append(sg0Var.b[((int) (j >>> (i7 - i5))) & sg0Var.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < (sg0Var.f << 3)) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void b(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        jte.n(0, i, bArr.length);
        while (i2 < i) {
            sg0 sg0Var = this.a;
            a(i2, Math.min(sg0Var.f, i - i2), sb, bArr);
            i2 += sg0Var.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vg0) {
            vg0 vg0Var = (vg0) obj;
            if (this.a.equals(vg0Var.a) && Objects.equals(this.b, vg0Var.b)) {
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
        sg0 sg0Var = this.a;
        sb.append(sg0Var);
        if (8 % sg0Var.d != 0) {
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

    public vg0(String str, String str2) {
        this(new sg0(str, str2.toCharArray()), (Character) '=');
    }
}
