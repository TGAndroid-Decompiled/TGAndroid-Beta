package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class lt2 implements f8a {
    public final AtomicReference a;

    public lt2(l8a l8aVar) {
        this.a = new AtomicReference(l8aVar);
    }

    @Override
    public final Iterator iterator() {
        f8a f8aVar = (f8a) this.a.getAndSet(null);
        if (f8aVar != null) {
            return f8aVar.iterator();
        }
        grb.i("This sequence can be consumed only once.");
        return null;
    }
}
