package be;
public final class d implements k {
    public final c[] f2657a;

    public d(c[] cVarArr) {
        this.f2657a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f2657a) {
            p0 p0Var = cVar.f2655f;
            if (p0Var != null) {
                p0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f2657a + ']';
    }
}
