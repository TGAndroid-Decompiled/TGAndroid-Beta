package ld;
public final class d implements k {
    public final c[] f11867a;

    public d(c[] cVarArr) {
        this.f11867a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f11867a) {
            o0 o0Var = cVar.f11864f;
            if (o0Var != null) {
                o0Var.dispose();
            } else {
                kotlin.jvm.internal.j.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f11867a + ']';
    }
}
