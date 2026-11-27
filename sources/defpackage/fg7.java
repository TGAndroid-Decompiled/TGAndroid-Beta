package defpackage;
public final class fg7 {
    public final char a;
    public final int b;
    public final fg7 c;
    public final int d;

    public fg7(char c, xs3 xs3Var, int i, fg7 fg7Var) {
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
        this.c = fg7Var;
        if (c2 == 1000) {
            length = 1;
        } else {
            length = String.valueOf(c).getBytes(xs3Var.a[i].charset()).length;
        }
        if (fg7Var == null) {
            i2 = 0;
        } else {
            i2 = fg7Var.b;
        }
        length = i2 != i ? length + 3 : length;
        this.d = fg7Var != null ? length + fg7Var.d : length;
    }
}
