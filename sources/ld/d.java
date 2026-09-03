package ld;
public final class d implements k {
    public final c[] f11977a;

    public d(c[] cVarArr) {
        this.f11977a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f11977a) {
            o0 o0Var = cVar.f11974f;
            if (o0Var != null) {
                o0Var.dispose();
            } else {
                kotlin.jvm.internal.j.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f11977a + ']';
    }
}
