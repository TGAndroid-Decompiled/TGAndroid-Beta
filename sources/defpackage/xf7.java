package defpackage;
public final class xf7 {
    public final char a;
    public final int b;
    public final xf7 c;
    public final int d;

    public xf7(char c, pt3 pt3Var, int i, xf7 xf7Var) {
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
        this.c = xf7Var;
        if (c2 == 1000) {
            length = 1;
        } else {
            length = String.valueOf(c).getBytes(pt3Var.a[i].charset()).length;
        }
        if (xf7Var == null) {
            i2 = 0;
        } else {
            i2 = xf7Var.b;
        }
        length = i2 != i ? length + 3 : length;
        this.d = xf7Var != null ? length + xf7Var.d : length;
    }
}
