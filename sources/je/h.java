package je;

import ce.y0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
public abstract class h extends y0 {
    public c f15600c;

    @Override
    public final void c(ld.h hVar, Runnable runnable) {
        c cVar = this.f15600c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f15591n;
        cVar.b(runnable, k.f15608g);
    }
}
