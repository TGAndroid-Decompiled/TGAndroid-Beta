package fe;

import ee.m;
import ee.o;
public abstract class b {
    public o[] f10597a;
    public int f10598b;
    public int f10599c;

    public final void b(o oVar) {
        synchronized (this) {
            try {
                int i10 = this.f10598b - 1;
                this.f10598b = i10;
                if (i10 == 0) {
                    this.f10599c = 0;
                }
                kotlin.jvm.internal.i.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                m mVar = (m) this;
                oVar.f8650a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
