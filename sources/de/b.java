package de;

import ce.n;
import ce.p;
public abstract class b {
    public p[] f8322a;
    public int f8323b;
    public int f8324c;

    public final void b(p pVar) {
        synchronized (this) {
            try {
                int i10 = this.f8323b - 1;
                this.f8323b = i10;
                if (i10 == 0) {
                    this.f8324c = 0;
                }
                kotlin.jvm.internal.i.c(pVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                n nVar = (n) this;
                pVar.f4602a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
