package be;
public final class d implements k {
    public final c[] f2653a;

    public d(c[] cVarArr) {
        this.f2653a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f2653a) {
            p0 p0Var = cVar.f2651f;
            if (p0Var != null) {
                p0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f2653a + ']';
    }
}
