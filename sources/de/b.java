package de;

import ce.w;
import ce.y;
public abstract class b {
    public y[] f8333a;
    public int f8334b;
    public int f8335c;

    public final void b(y yVar) {
        synchronized (this) {
            try {
                int i7 = this.f8334b - 1;
                this.f8334b = i7;
                if (i7 == 0) {
                    this.f8335c = 0;
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
