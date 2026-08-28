package hd;
public final class n1 extends l1 {
    public final v1 f10464e;
    public final o1 f10465f;
    public final q h;
    public final Object f10466n;

    public n1(v1 v1Var, o1 o1Var, q qVar, Object obj) {
        this.f10464e = v1Var;
        this.f10465f = o1Var;
        this.h = qVar;
        this.f10466n = obj;
    }

    @Override
    public final void a(Throwable th) {
        q D = v1.D(this.h);
        v1 v1Var = this.f10464e;
        o1 o1Var = this.f10465f;
        Object obj = this.f10466n;
        if (D != null) {
            while (f0.n(D.f10472e, false, new n1(v1Var, o1Var, D, obj), 1) == x1.f10506a) {
                D = v1.D(D);
                if (D == null) {
                    v1Var.f(v1Var.o(o1Var, obj));
                }
            }
            return;
        }
        v1Var.f(v1Var.o(o1Var, obj));
    }
}
