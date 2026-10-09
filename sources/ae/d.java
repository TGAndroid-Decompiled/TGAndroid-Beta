package ae;
public final class d implements k {
    public final c[] f434a;

    public d(c[] cVarArr) {
        this.f434a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f434a) {
            q0 q0Var = cVar.f431f;
            if (q0Var != null) {
                q0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f434a + ']';
    }
}
