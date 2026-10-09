package ae;
public final class o1 extends m1 {
    public final w1 f482e;
    public final p1 f483f;
    public final q h;
    public final Object f484n;

    public o1(w1 w1Var, p1 p1Var, q qVar, Object obj) {
        this.f482e = w1Var;
        this.f483f = p1Var;
        this.h = qVar;
        this.f484n = obj;
    }

    @Override
    public final void a(Throwable th2) {
        q D = w1.D(this.h);
        w1 w1Var = this.f482e;
        p1 p1Var = this.f483f;
        Object obj = this.f484n;
        if (D != null) {
            while (g0.n(D.f489e, false, new o1(w1Var, p1Var, D, obj), 1) == y1.f523a) {
                D = w1.D(D);
                if (D == null) {
                    w1Var.f(w1Var.o(p1Var, obj));
                }
            }
            return;
        }
        w1Var.f(w1Var.o(p1Var, obj));
    }
}
