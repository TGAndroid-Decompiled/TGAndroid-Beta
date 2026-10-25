package ge;

import fe.m;
import fe.o;
public abstract class b {
    public o[] f12472a;
    public int f12473b;
    public int f12474c;

    public final void a(o oVar) {
        synchronized (this) {
            try {
                int i10 = this.f12473b - 1;
                this.f12473b = i10;
                if (i10 == 0) {
                    this.f12474c = 0;
                }
                kotlin.jvm.internal.i.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                m mVar = (m) this;
                oVar.f10466a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
