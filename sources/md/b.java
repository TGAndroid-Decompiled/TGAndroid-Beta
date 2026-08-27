package md;

import ld.o;

public abstract class b {

    public o[] f18021a;

    public int f18022b;

    public int f18023c;

    public final void a(o oVar) {
        synchronized (this) {
            try {
                int i10 = this.f18022b - 1;
                this.f18022b = i10;
                if (i10 == 0) {
                    this.f18023c = 0;
                }
                kotlin.jvm.internal.j.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                oVar.f15572a.set(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
