package ae;
public final class o1 extends m1 {
    public final w1 f484e;
    public final p1 f485f;
    public final q h;
    public final Object f486n;

    public o1(w1 w1Var, p1 p1Var, q qVar, Object obj) {
        this.f484e = w1Var;
        this.f485f = p1Var;
        this.h = qVar;
        this.f486n = obj;
    }

    @Override
    public final void a(Throwable th2) {
        q D = w1.D(this.h);
        w1 w1Var = this.f484e;
        p1 p1Var = this.f485f;
        Object obj = this.f486n;
        if (D != null) {
            while (g0.n(D.f491e, false, new o1(w1Var, p1Var, D, obj), 1) == y1.f525a) {
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
