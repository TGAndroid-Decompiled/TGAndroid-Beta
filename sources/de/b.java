package de;

import ce.w;
import ce.y;
public abstract class b {
    public y[] f8332a;
    public int f8333b;
    public int f8334c;

    public final void b(y yVar) {
        synchronized (this) {
            try {
                int i7 = this.f8333b - 1;
                this.f8333b = i7;
                if (i7 == 0) {
                    this.f8334c = 0;
                }
                kotlin.jvm.internal.j.c(yVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                w wVar = (w) this;
                yVar.f5263a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
