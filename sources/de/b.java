package de;

import ce.n;
import ce.p;
public abstract class b {
    public p[] f6792a;
    public int f6793b;
    public int f6794c;

    public final void b(p pVar) {
        synchronized (this) {
            try {
                int i10 = this.f6793b - 1;
                this.f6793b = i10;
                if (i10 == 0) {
                    this.f6794c = 0;
                }
                kotlin.jvm.internal.i.c(pVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                n nVar = (n) this;
                pVar.f4795a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
