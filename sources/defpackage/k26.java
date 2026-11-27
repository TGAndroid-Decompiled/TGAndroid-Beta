package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
public final class k26 implements vw8 {
    public volatile Set a;
    public volatile Set b;

    public final synchronized void a() {
        for (vw8 vw8Var : this.a) {
            this.b.add(vw8Var.get());
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
