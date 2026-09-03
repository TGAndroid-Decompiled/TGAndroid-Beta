package c9;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class r implements ba.b {
    public volatile Set f2203a;
    public volatile Set f2204b;

    public final synchronized void a() {
        try {
            for (ba.b bVar : this.f2203a) {
                this.f2204b.add(bVar.get());
            }
            this.f2203a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final Object get() {
        if (this.f2204b == null) {
            synchronized (this) {
                try {
                    if (this.f2204b == null) {
                        this.f2204b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f2204b);
    }
}
