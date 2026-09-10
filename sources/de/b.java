package de;

import ce.o;
import ce.q;
public abstract class b {
    public q[] f6483a;
    public int f6484b;
    public int f6485c;

    public final void b(q qVar) {
        synchronized (this) {
            try {
                int i10 = this.f6484b - 1;
                this.f6484b = i10;
                if (i10 == 0) {
                    this.f6485c = 0;
                }
                kotlin.jvm.internal.i.c(qVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                o oVar = (o) this;
                qVar.f4674a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
