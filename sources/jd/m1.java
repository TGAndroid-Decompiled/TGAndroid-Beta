package jd;
public final class m1 extends k1 {
    public final u1 f11497e;
    public final n1 f11498f;
    public final q h;
    public final Object f11499n;

    public m1(u1 u1Var, n1 n1Var, q qVar, Object obj) {
        this.f11497e = u1Var;
        this.f11498f = n1Var;
        this.h = qVar;
        this.f11499n = obj;
    }

    @Override
    public final void a(Throwable th2) {
        q D = u1.D(this.h);
        u1 u1Var = this.f11497e;
        n1 n1Var = this.f11498f;
        Object obj = this.f11499n;
        if (D != null) {
            while (e0.n(D.f11511e, false, new m1(u1Var, n1Var, D, obj), 1) == w1.f11538a) {
                D = u1.D(D);
                if (D == null) {
                    u1Var.f(u1Var.o(n1Var, obj));
                }
            }
            return;
        }
        u1Var.f(u1Var.o(n1Var, obj));
    }
}
