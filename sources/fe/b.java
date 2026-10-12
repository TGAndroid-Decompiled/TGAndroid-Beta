package fe;

import ee.n;
import ee.p;
public abstract class b {
    public p[] f9137a;
    public int f9138b;
    public int f9139c;

    public final void b(p pVar) {
        synchronized (this) {
            try {
                int i10 = this.f9138b - 1;
                this.f9138b = i10;
                if (i10 == 0) {
                    this.f9139c = 0;
                }
                kotlin.jvm.internal.i.c(pVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                n nVar = (n) this;
                pVar.f8762a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
