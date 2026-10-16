package ie;

import be.y0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
public abstract class h extends y0 {
    public c f11410c;

    @Override
    public final void c(kd.h hVar, Runnable runnable) {
        c cVar = this.f11410c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f11401n;
        cVar.b(runnable, k.f11418g);
    }
}
