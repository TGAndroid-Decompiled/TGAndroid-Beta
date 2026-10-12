package ee;

import de.o;
import de.q;
public abstract class b {
    public q[] f8897a;
    public int f8898b;
    public int f8899c;

    public final void a(q qVar) {
        synchronized (this) {
            try {
                int i10 = this.f8898b - 1;
                this.f8898b = i10;
                if (i10 == 0) {
                    this.f8899c = 0;
                }
                kotlin.jvm.internal.i.c(qVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                o oVar = (o) this;
                qVar.f8345a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
