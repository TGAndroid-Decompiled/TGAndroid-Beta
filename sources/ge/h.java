package ge;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import zd.u0;
public abstract class h extends u0 {
    public c f13197c;

    @Override
    public final void c(id.h hVar, Runnable runnable) {
        c cVar = this.f13197c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f13186n;
        cVar.b(runnable, false);
    }
}
