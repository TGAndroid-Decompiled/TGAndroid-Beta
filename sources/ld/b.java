package ld;

import kd.m;
import kd.o;
public abstract class b {
    public o[] f16837a;
    public int f16838b;
    public int f16839c;

    public final void a(o oVar) {
        synchronized (this) {
            try {
                int i9 = this.f16838b - 1;
                this.f16838b = i9;
                if (i9 == 0) {
                    this.f16839c = 0;
                }
                kotlin.jvm.internal.i.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                m mVar = (m) this;
                oVar.f14794a.set(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
