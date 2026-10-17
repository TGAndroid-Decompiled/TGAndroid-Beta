package fe;

import ee.m;
import ee.o;
public abstract class b {
    public o[] f10581a;
    public int f10582b;
    public int f10583c;

    public final void b(o oVar) {
        synchronized (this) {
            try {
                int i10 = this.f10582b - 1;
                this.f10582b = i10;
                if (i10 == 0) {
                    this.f10583c = 0;
                }
                kotlin.jvm.internal.i.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                m mVar = (m) this;
                oVar.f8645a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
