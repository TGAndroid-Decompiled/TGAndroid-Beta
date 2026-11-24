package defpackage;
public final class za9 extends ft5 {
    public final gt5 e;

    public za9(gt5 gt5Var) {
        this.e = gt5Var;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void l(Throwable th) {
        Object v = j().v();
        boolean z = v instanceof fp2;
        gt5 gt5Var = this.e;
        if (z) {
            gt5Var.resumeWith(qse.a(((fp2) v).a));
        } else {
            gt5Var.resumeWith(fad.a(v));
        }
    }
}
