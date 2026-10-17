package be;
public final class d implements k {
    public final c[] f4269a;

    public d(c[] cVarArr) {
        this.f4269a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f4269a) {
            p0 p0Var = cVar.f4267f;
            if (p0Var != null) {
                p0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f4269a + ']';
    }
}
