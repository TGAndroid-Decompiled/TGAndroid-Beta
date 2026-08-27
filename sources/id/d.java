package id;

public final class d implements k {

    public final c[] f11127a;

    public d(c[] cVarArr) {
        this.f11127a = cVarArr;
    }

    @Override
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (c cVar : this.f11127a) {
            p0 p0Var = cVar.f11125f;
            if (p0Var == null) {
                kotlin.jvm.internal.j.h("handle");
                throw null;
            }
            p0Var.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f11127a + ']';
    }
}
