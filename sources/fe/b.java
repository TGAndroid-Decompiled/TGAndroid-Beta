package fe;

import ee.n;
import ee.p;
public abstract class b {
    public p[] f9140a;
    public int f9141b;
    public int f9142c;

    public final void b(p pVar) {
        synchronized (this) {
            try {
                int i10 = this.f9141b - 1;
                this.f9141b = i10;
                if (i10 == 0) {
                    this.f9142c = 0;
                }
                kotlin.jvm.internal.i.c(pVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                n nVar = (n) this;
                pVar.f8765a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
