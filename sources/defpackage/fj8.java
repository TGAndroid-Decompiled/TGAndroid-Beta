package defpackage;
public final class fj8 {
    public final wk4 a;
    public final long b;

    public fj8(hj8 hj8Var, wk4 wk4Var) {
        long length;
        long j;
        this.a = wk4Var;
        long length2 = ((hj8Var.b.length() + hj8Var.a.length()) << 1) + 128;
        f06 f06Var = (f06) wk4Var.b;
        if (f06Var == null) {
            j = 1024;
        } else {
            long length3 = (((int[]) f06Var.b).length << 2) + 64;
            if (((int[]) f06Var.c) == null) {
                length = 0;
            } else {
                length = ((int[]) f06Var.c).length << 2;
            }
            j = length + length3;
        }
        this.b = length2 + j;
    }
}
