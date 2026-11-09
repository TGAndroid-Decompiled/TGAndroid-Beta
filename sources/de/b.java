package de;

import ce.w;
import ce.y;
public abstract class b {
    public y[] f8667a;
    public int f8668b;
    public int f8669c;

    public final void b(y yVar) {
        synchronized (this) {
            try {
                int i7 = this.f8668b - 1;
                this.f8668b = i7;
                if (i7 == 0) {
                    this.f8669c = 0;
                }
                kotlin.jvm.internal.j.c(yVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                w wVar = (w) this;
                yVar.f6155a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
