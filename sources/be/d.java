package be;
public final class d implements k {
    public final c[] f4266a;

    public d(c[] cVarArr) {
        this.f4266a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f4266a) {
            p0 p0Var = cVar.f4264f;
            if (p0Var != null) {
                p0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f4266a + ']';
    }
}
