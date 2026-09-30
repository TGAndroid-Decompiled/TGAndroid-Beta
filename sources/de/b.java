package de;

import ce.n;
import ce.p;
public abstract class b {
    public p[] f7694a;
    public int f7695b;
    public int f7696c;

    public final void b(p pVar) {
        synchronized (this) {
            try {
                int i10 = this.f7695b - 1;
                this.f7695b = i10;
                if (i10 == 0) {
                    this.f7696c = 0;
                }
                kotlin.jvm.internal.i.c(pVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                n nVar = (n) this;
                pVar.f4251a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
