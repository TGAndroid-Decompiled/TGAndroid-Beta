package be;
public final class d implements k {
    public final c[] f4270a;

    public d(c[] cVarArr) {
        this.f4270a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f4270a) {
            p0 p0Var = cVar.f4268f;
            if (p0Var != null) {
                p0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f4270a + ']';
    }
}
