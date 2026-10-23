package ie;

import be.y0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
public abstract class h extends y0 {
    public c f12827c;

    @Override
    public final void c(kd.h hVar, Runnable runnable) {
        c cVar = this.f12827c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f12818n;
        cVar.b(runnable, k.f12835g);
    }
}
