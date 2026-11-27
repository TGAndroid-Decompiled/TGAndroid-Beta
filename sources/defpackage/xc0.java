package defpackage;
public final class xc0 implements ra1 {
    public final wc0[] a;

    public xc0(wc0[] wc0VarArr) {
        this.a = wc0VarArr;
    }

    @Override
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (wc0 wc0Var : this.a) {
            ep3 ep3Var = wc0Var.f;
            if (ep3Var != null) {
                ep3Var.dispose();
            } else {
                ur5.e("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
