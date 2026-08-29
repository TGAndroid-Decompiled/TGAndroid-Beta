package a9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class r implements z9.b {
    public volatile Set f266a;
    public volatile Set f267b;

    public final synchronized void a() {
        try {
            for (z9.b bVar : this.f266a) {
                this.f267b.add(bVar.get());
            }
            this.f266a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f267b == null) {
            synchronized (this) {
                try {
                    if (this.f267b == null) {
                        this.f267b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f267b);
    }
}
