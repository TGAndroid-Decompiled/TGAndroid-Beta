package ge;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import zd.u0;
public abstract class h extends u0 {
    public c f13855c;

    @Override
    public final void c(id.h hVar, Runnable runnable) {
        c cVar = this.f13855c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f13844n;
        cVar.b(runnable, false);
    }
}
