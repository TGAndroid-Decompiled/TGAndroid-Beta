package defpackage;

import java.util.Arrays;
public final class im5 {
    public final String a;
    public final float b;
    public final int c;
    public final String d;

    public im5(float f, int i, String str, String str2) {
        int i2 = uge.a;
        this.a = str == null ? "" : str;
        this.b = f;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof im5)) {
            return false;
        }
        im5 im5Var = (im5) obj;
        if (vue.a(this.a, im5Var.a) && Float.compare(this.b, im5Var.b) == 0 && this.c == im5Var.c && vue.a(this.d, im5Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    public final String toString() {
        ko9 ko9Var = new ko9(im5.class.getSimpleName(), (byte) 29);
        ko9 ko9Var2 = new ko9((byte) 26, false);
        ((ko9) ko9Var.d).d = ko9Var2;
        ko9Var.d = ko9Var2;
        ko9Var2.c = this.a;
        ko9Var2.b = "text";
        String valueOf = String.valueOf(this.b);
        ko9 ko9Var3 = new ko9((byte) 26, false);
        ((ko9) ko9Var.d).d = ko9Var3;
        ko9Var.d = ko9Var3;
        ko9Var3.c = valueOf;
        ko9Var3.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        ko9 ko9Var4 = new ko9((byte) 26, false);
        ((ko9) ko9Var.d).d = ko9Var4;
        ko9Var4.c = valueOf2;
        ko9Var4.b = "index";
        ko9 ko9Var5 = new ko9((byte) 26, false);
        ko9Var4.d = ko9Var5;
        ko9Var.d = ko9Var5;
        ko9Var5.c = this.d;
        ko9Var5.b = "mid";
        return ko9Var.toString();
    }
}
