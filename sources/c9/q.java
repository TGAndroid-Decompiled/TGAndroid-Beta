package c9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class q implements ba.b {
    public volatile Set f2369a;
    public volatile Set f2370b;

    public final synchronized void a() {
        try {
            for (ba.b bVar : this.f2369a) {
                this.f2370b.add(bVar.get());
            }
            this.f2369a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f2370b == null) {
            synchronized (this) {
                try {
                    if (this.f2370b == null) {
                        this.f2370b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f2370b);
    }
}
