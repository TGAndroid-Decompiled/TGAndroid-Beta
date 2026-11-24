package defpackage;
public final class vc0 implements ja1 {
    public final uc0[] a;

    public vc0(uc0[] uc0VarArr) {
        this.a = uc0VarArr;
    }

    @Override
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (uc0 uc0Var : this.a) {
            no3 no3Var = uc0Var.f;
            if (no3Var != null) {
                no3Var.dispose();
            } else {
                rp5.e("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
