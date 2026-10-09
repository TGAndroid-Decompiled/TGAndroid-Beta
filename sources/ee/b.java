package ee;

import de.o;
import de.q;
public abstract class b {
    public q[] f8900a;
    public int f8901b;
    public int f8902c;

    public final void a(q qVar) {
        synchronized (this) {
            try {
                int i10 = this.f8901b - 1;
                this.f8901b = i10;
                if (i10 == 0) {
                    this.f8902c = 0;
                }
                kotlin.jvm.internal.i.c(qVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                o oVar = (o) this;
                qVar.f8348a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
