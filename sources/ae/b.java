package ae;

import zd.u;
import zd.w;
public abstract class b {
    public w[] f384a;
    public int f385b;
    public int f386c;

    public final void a(w wVar) {
        synchronized (this) {
            try {
                int i3 = this.f385b - 1;
                this.f385b = i3;
                if (i3 == 0) {
                    this.f386c = 0;
                }
                kotlin.jvm.internal.j.c(wVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                u uVar = (u) this;
                wVar.f60444a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
