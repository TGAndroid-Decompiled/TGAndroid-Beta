package defpackage;
public final class eg7 {
    public final char a;
    public final int b;
    public final eg7 c;
    public final int d;

    public eg7(char c, xs3 xs3Var, int i, eg7 eg7Var) {
        char c2;
        int length;
        int i2;
        if (c == 65535) {
            c2 = 1000;
        } else {
            c2 = c;
        }
        this.a = c2;
        this.b = i;
        this.c = eg7Var;
        if (c2 == 1000) {
            length = 1;
        } else {
            length = String.valueOf(c).getBytes(xs3Var.a[i].charset()).length;
        }
        if (eg7Var == null) {
            i2 = 0;
        } else {
            i2 = eg7Var.b;
        }
        length = i2 != i ? length + 3 : length;
        this.d = eg7Var != null ? length + eg7Var.d : length;
    }
}
