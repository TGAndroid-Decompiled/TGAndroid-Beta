package de;

import ce.n;
import ce.p;
public abstract class b {
    public p[] f7696a;
    public int f7697b;
    public int f7698c;

    public final void b(p pVar) {
        synchronized (this) {
            try {
                int i10 = this.f7697b - 1;
                this.f7697b = i10;
                if (i10 == 0) {
                    this.f7698c = 0;
                }
                kotlin.jvm.internal.i.c(pVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                n nVar = (n) this;
                pVar.f4253a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
