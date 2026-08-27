package id;

public final class n1 extends l1 {

    public final v1 f11173e;

    public final o1 f11174f;
    public final q h;

    public final Object f11175n;

    public n1(v1 v1Var, o1 o1Var, q qVar, Object obj) {
        this.f11173e = v1Var;
        this.f11174f = o1Var;
        this.h = qVar;
        this.f11175n = obj;
    }

    @Override
    public final void a(Throwable th) {
        q qVarD = v1.D(this.h);
        v1 v1Var = this.f11173e;
        o1 o1Var = this.f11174f;
        Object obj = this.f11175n;
        if (qVarD != null) {
            while (f0.n(qVarD.f11181e, false, new n1(v1Var, o1Var, qVarD, obj), 1) == x1.f11215a) {
                qVarD = v1.D(qVarD);
                if (qVarD == null) {
                }
            }
            return;
        }
        v1Var.f(v1Var.o(o1Var, obj));
    }
}
