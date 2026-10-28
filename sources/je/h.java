package je;

import ce.y0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
public abstract class h extends y0 {
    public c f15599c;

    @Override
    public final void c(ld.h hVar, Runnable runnable) {
        c cVar = this.f15599c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f15590n;
        cVar.b(runnable, k.f15607g);
    }
}
