package ce;
public final class d implements k {
    public final c[] f6209a;

    public d(c[] cVarArr) {
        this.f6209a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f6209a) {
            p0 p0Var = cVar.f6207f;
            if (p0Var != null) {
                p0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f6209a + ']';
    }
}
