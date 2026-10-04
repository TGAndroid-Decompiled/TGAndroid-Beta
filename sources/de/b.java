package de;

import ce.n;
import ce.p;
public abstract class b {
    public p[] f8321a;
    public int f8322b;
    public int f8323c;

    public final void b(p pVar) {
        synchronized (this) {
            try {
                int i10 = this.f8322b - 1;
                this.f8322b = i10;
                if (i10 == 0) {
                    this.f8323c = 0;
                }
                kotlin.jvm.internal.i.c(pVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                n nVar = (n) this;
                pVar.f4601a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
