package hd;
public final class d implements k {
    public final c[] f10418a;

    public d(c[] cVarArr) {
        this.f10418a = cVarArr;
    }

    @Override
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (c cVar : this.f10418a) {
            p0 p0Var = cVar.f10416f;
            if (p0Var != null) {
                p0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f10418a + ']';
    }
}
