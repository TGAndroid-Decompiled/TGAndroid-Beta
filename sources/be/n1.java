package be;
public final class n1 extends l1 {
    public final v1 e;
    public final o1 f4304f;
    public final q h;
    public final Object f4305n;

    public n1(v1 v1Var, o1 o1Var, q qVar, Object obj) {
        this.e = v1Var;
        this.f4304f = o1Var;
        this.h = qVar;
        this.f4305n = obj;
    }

    @Override
    public final void a(Throwable th2) {
        q D = v1.D(this.h);
        v1 v1Var = this.e;
        o1 o1Var = this.f4304f;
        Object obj = this.f4305n;
        if (D != null) {
            while (f0.n(D.e, false, new n1(v1Var, o1Var, D, obj), 1) == x1.f4338a) {
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
