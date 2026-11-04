package de;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import wd.u0;
public abstract class h extends u0 {
    public c f8825c;

    @Override
    public final void c(fd.h hVar, Runnable runnable) {
        c cVar = this.f8825c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f8814n;
        cVar.b(runnable, false);
    }
}
