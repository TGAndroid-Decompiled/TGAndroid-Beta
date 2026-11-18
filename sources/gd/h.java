package gd;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h implements c, Serializable {
    public static final AtomicReferenceFieldUpdater f13478c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "b");
    public volatile rd.a f13479a;
    public volatile Object f13480b;

    @Override
    public final Object getValue() {
        Object obj = this.f13480b;
        j jVar = j.f13484a;
        if (obj != jVar) {
            return obj;
        }
        rd.a aVar = this.f13479a;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13478c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != jVar) {
                    return this.f13480b;
                }
            }
            this.f13479a = null;
            return invoke;
        }
        return this.f13480b;
    }

    public final String toString() {
        if (this.f13480b != j.f13484a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
