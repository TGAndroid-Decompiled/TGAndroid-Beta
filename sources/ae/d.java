package ae;
public final class d implements k {
    public final c[] f436a;

    public d(c[] cVarArr) {
        this.f436a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f436a) {
            q0 q0Var = cVar.f433f;
            if (q0Var != null) {
                q0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f436a + ']';
    }
}
