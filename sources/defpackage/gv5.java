package defpackage;
public final class gv5 extends ev5 {
    public final ov5 e;
    public final hv5 f;
    public final uh2 h;
    public final Object n;

    public gv5(ov5 ov5Var, hv5 hv5Var, uh2 uh2Var, Object obj) {
        this.e = ov5Var;
        this.f = hv5Var;
        this.h = uh2Var;
        this.n = obj;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void l(Throwable th) {
        uh2 uh2Var = this.h;
        uh2 E = ov5.E(uh2Var);
        ov5 ov5Var = this.e;
        hv5 hv5Var = this.f;
        Object obj = this.n;
        if (E == null || !ov5Var.O(hv5Var, E, obj)) {
            hv5Var.a.c(new c76(2), 2);
            uh2 E2 = ov5.E(uh2Var);
            if (E2 != null && ov5Var.O(hv5Var, E2, obj)) {
                return;
            }
            ov5Var.f(ov5Var.p(hv5Var, obj));
        }
    }
}
