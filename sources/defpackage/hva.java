package defpackage;
public final class hva {
    public kc7 a;
    public vnb b;
    public int c;
    public int d;
    public float e;

    public final void a(kc7 kc7Var) {
        int a;
        int i;
        this.a = kc7Var;
        if (kc7Var == null) {
            this.c = aob.v0(aob.A8, this.b);
            this.d = aob.v0(aob.s8, this.b);
            this.c = vm2.f(this.e, this.c, 603979776);
            this.d = vm2.f(this.e, this.d, -1);
            return;
        }
        int c = kc7Var.c(aob.I.o());
        int d = kc7Var.d(aob.I.o());
        vnb vnbVar = this.b;
        int f = vm2.f(0.75f, d, c);
        if (hl.B(f) > 0.721f) {
            a = aob.v0(aob.v6, vnbVar);
        } else {
            a = aob.a(0.08f, -0.08f, f);
        }
        this.c = a;
        if (hl.B(a) > 0.721f) {
            i = -16777216;
        } else {
            i = -1;
        }
        this.d = i;
        this.c = vm2.f(this.e, this.c, 603979776);
        this.d = vm2.f(this.e, this.d, -1);
    }
}
