package defpackage;
public final class gta {
    public ec7 a;
    public ylb b;
    public int c;
    public int d;
    public float e;

    public final void a(ec7 ec7Var) {
        int a;
        int i;
        this.a = ec7Var;
        if (ec7Var == null) {
            this.c = cmb.v0(cmb.z8, this.b);
            this.d = cmb.v0(cmb.r8, this.b);
            this.c = on2.f(this.e, this.c, 603979776);
            this.d = on2.f(this.e, this.d, -1);
            return;
        }
        int c = ec7Var.c(cmb.I.o());
        int d = ec7Var.d(cmb.I.o());
        ylb ylbVar = this.b;
        int f = on2.f(0.75f, d, c);
        if (gm.B(f) > 0.721f) {
            a = cmb.v0(cmb.u6, ylbVar);
        } else {
            a = cmb.a(0.08f, -0.08f, f);
        }
        this.c = a;
        if (gm.B(a) > 0.721f) {
            i = -16777216;
        } else {
            i = -1;
        }
        this.d = i;
        this.c = on2.f(this.e, this.c, 603979776);
        this.d = on2.f(this.e, this.d, -1);
    }
}
