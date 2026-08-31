package ld;
public final class m1 extends k1 {
    public final u1 f12333e;
    public final n1 f12334f;
    public final q h;
    public final Object f12335n;

    public m1(u1 u1Var, n1 n1Var, q qVar, Object obj) {
        this.f12333e = u1Var;
        this.f12334f = n1Var;
        this.h = qVar;
        this.f12335n = obj;
    }

    @Override
    public final void a(Throwable th2) {
        q D = u1.D(this.h);
        u1 u1Var = this.f12333e;
        n1 n1Var = this.f12334f;
        Object obj = this.f12335n;
        if (D != null) {
            while (e0.n(D.f12347e, false, new m1(u1Var, n1Var, D, obj), 1) == w1.f12374a) {
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
