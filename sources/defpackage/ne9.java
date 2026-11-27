package defpackage;
public final class ne9 extends iv5 {
    public final jv5 e;

    public ne9(jv5 jv5Var) {
        this.e = jv5Var;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void l(Throwable th) {
        Object v = j().v();
        boolean z = v instanceof yp2;
        jv5 jv5Var = this.e;
        if (z) {
            jv5Var.resumeWith(ixe.a(((yp2) v).a));
        } else {
            jv5Var.resumeWith(yed.a(v));
        }
    }
}
