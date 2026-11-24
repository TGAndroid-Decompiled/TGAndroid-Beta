package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class g26 implements nv8 {
    public volatile Set a;
    public volatile Set b;

    public final synchronized void a() {
        for (nv8 nv8Var : this.a) {
            this.b.add(nv8Var.get());
        }
        this.a = null;
    }

    @Override
    public final Object get() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    a();
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.b);
    }
}
