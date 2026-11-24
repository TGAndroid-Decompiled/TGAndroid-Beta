package defpackage;
public final class vd7 {
    public final char a;
    public final int b;
    public final vd7 c;
    public final int d;

    public vd7(char c, fs3 fs3Var, int i, vd7 vd7Var) {
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
        this.c = vd7Var;
        if (c2 == 1000) {
            length = 1;
        } else {
            length = String.valueOf(c).getBytes(fs3Var.a[i].charset()).length;
        }
        if (vd7Var == null) {
            i2 = 0;
        } else {
            i2 = vd7Var.b;
        }
        length = i2 != i ? length + 3 : length;
        this.d = vd7Var != null ? length + vd7Var.d : length;
    }
}
