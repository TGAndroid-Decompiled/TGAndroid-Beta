package defpackage;
public final class fra {
    public da7 a;
    public wjb b;
    public int c;
    public int d;
    public float e;

    public final void a(da7 da7Var) {
        int a;
        int i;
        this.a = da7Var;
        if (da7Var == null) {
            this.c = bkb.v0(bkb.z8, this.b);
            this.d = bkb.v0(bkb.r8, this.b);
            this.c = bm2.f(this.e, this.c, 603979776);
            this.d = bm2.f(this.e, this.d, -1);
            return;
        }
        int c = da7Var.c(bkb.I.o());
        int d = da7Var.d(bkb.I.o());
        wjb wjbVar = this.b;
        int f = bm2.f(0.75f, d, c);
        if (gl.B(f) > 0.721f) {
            a = bkb.v0(bkb.u6, wjbVar);
        } else {
            a = bkb.a(0.08f, -0.08f, f);
        }
        this.c = a;
        if (gl.B(a) > 0.721f) {
            i = -16777216;
        } else {
            i = -1;
        }
        this.d = i;
        this.c = bm2.f(this.e, this.c, 603979776);
        this.d = bm2.f(this.e, this.d, -1);
    }
}
