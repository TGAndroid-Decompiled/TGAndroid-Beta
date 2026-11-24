package defpackage;
public final class zc9 extends ev5 {
    public final fv5 e;

    public zc9(fv5 fv5Var) {
        this.e = fv5Var;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void l(Throwable th) {
        Object v = j().v();
        boolean z = v instanceof qq2;
        fv5 fv5Var = this.e;
        if (z) {
            fv5Var.resumeWith(tue.a(((qq2) v).a));
        } else {
            fv5Var.resumeWith(hcd.a(v));
        }
    }
}
