package gd;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h implements c, Serializable {
    public static final AtomicReferenceFieldUpdater f13510c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "b");
    public volatile rd.a f13511a;
    public volatile Object f13512b;

    @Override
    public final Object getValue() {
        Object obj = this.f13512b;
        j jVar = j.f13516a;
        if (obj != jVar) {
            return obj;
        }
        rd.a aVar = this.f13511a;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13510c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != jVar) {
                    return this.f13512b;
                }
            }
            this.f13511a = null;
            return invoke;
        }
        return this.f13512b;
    }

    public final String toString() {
        if (this.f13512b != j.f13516a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
