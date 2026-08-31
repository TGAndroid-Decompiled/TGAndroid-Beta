package ld;
public final class d implements k {
    public final c[] f12290a;

    public d(c[] cVarArr) {
        this.f12290a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f12290a) {
            o0 o0Var = cVar.f12287f;
            if (o0Var != null) {
                o0Var.dispose();
            } else {
                kotlin.jvm.internal.j.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f12290a + ']';
    }
}
