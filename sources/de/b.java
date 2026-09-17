package de;

import ce.n;
import ce.p;
public abstract class b {
    public p[] f6820a;
    public int f6821b;
    public int f6822c;

    public final void b(p pVar) {
        synchronized (this) {
            try {
                int i10 = this.f6821b - 1;
                this.f6821b = i10;
                if (i10 == 0) {
                    this.f6822c = 0;
                }
                kotlin.jvm.internal.i.c(pVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                n nVar = (n) this;
                pVar.f4822a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
