package ie;

import be.y0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
public abstract class h extends y0 {
    public c f12799c;

    @Override
    public final void c(kd.h hVar, Runnable runnable) {
        c cVar = this.f12799c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f12790n;
        cVar.b(runnable, k.f12807g);
    }
}
