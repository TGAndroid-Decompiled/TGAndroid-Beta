package de;

import ce.w;
import ce.y;
public abstract class b {
    public y[] f8059a;
    public int f8060b;
    public int f8061c;

    public final void b(y yVar) {
        synchronized (this) {
            try {
                int i7 = this.f8060b - 1;
                this.f8060b = i7;
                if (i7 == 0) {
                    this.f8061c = 0;
                }
                kotlin.jvm.internal.j.c(yVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                w wVar = (w) this;
                yVar.f4985a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
