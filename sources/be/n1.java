package be;
public final class n1 extends l1 {
    public final v1 e;
    public final o1 f2691f;
    public final q h;
    public final Object f2692n;

    public n1(v1 v1Var, o1 o1Var, q qVar, Object obj) {
        this.e = v1Var;
        this.f2691f = o1Var;
        this.h = qVar;
        this.f2692n = obj;
    }

    @Override
    public final void a(Throwable th2) {
        q D = v1.D(this.h);
        v1 v1Var = this.e;
        o1 o1Var = this.f2691f;
        Object obj = this.f2692n;
        if (D != null) {
            while (f0.n(D.e, false, new n1(v1Var, o1Var, D, obj), 1) == x1.f2725a) {
                D = v1.D(D);
                if (D == null) {
                    v1Var.b(v1Var.o(o1Var, obj));
                }
            }
            return;
        }
        v1Var.b(v1Var.o(o1Var, obj));
    }
}
