package gd;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class a implements b {
    public final AtomicReference f7264a;

    public a(e eVar) {
        this.f7264a = new AtomicReference(eVar);
    }

    @Override
    public final Iterator iterator() {
        b bVar = (b) this.f7264a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
