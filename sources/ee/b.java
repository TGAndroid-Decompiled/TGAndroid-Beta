package ee;

import de.o;
import de.q;
public abstract class b {
    public q[] f8899a;
    public int f8900b;
    public int f8901c;

    public final void a(q qVar) {
        synchronized (this) {
            try {
                int i10 = this.f8900b - 1;
                this.f8900b = i10;
                if (i10 == 0) {
                    this.f8901c = 0;
                }
                kotlin.jvm.internal.i.c(qVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                o oVar = (o) this;
                qVar.f8347a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
