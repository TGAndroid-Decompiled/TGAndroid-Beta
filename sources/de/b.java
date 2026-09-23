package de;

import ce.n;
import ce.p;
public abstract class b {
    public p[] f7695a;
    public int f7696b;
    public int f7697c;

    public final void b(p pVar) {
        synchronized (this) {
            try {
                int i10 = this.f7696b - 1;
                this.f7696b = i10;
                if (i10 == 0) {
                    this.f7697c = 0;
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
