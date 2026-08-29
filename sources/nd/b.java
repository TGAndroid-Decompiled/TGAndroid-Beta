package nd;

import md.m;
import md.o;
public abstract class b {
    public o[] f17304a;
    public int f17305b;
    public int f17306c;

    public final void a(o oVar) {
        synchronized (this) {
            try {
                int i10 = this.f17305b - 1;
                this.f17305b = i10;
                if (i10 == 0) {
                    this.f17306c = 0;
                }
                kotlin.jvm.internal.j.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                m mVar = (m) this;
                oVar.f17012a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
