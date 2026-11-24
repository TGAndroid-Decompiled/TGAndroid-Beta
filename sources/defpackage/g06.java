package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class g06 implements mt8 {
    public volatile Set a;
    public volatile Set b;

    public final synchronized void a() {
        for (mt8 mt8Var : this.a) {
            this.b.add(mt8Var.get());
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
