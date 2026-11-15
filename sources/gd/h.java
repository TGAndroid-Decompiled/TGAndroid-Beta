package gd;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h implements c, Serializable {
    public static final AtomicReferenceFieldUpdater f13166c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "b");
    public volatile rd.a f13167a;
    public volatile Object f13168b;

    @Override
    public final Object getValue() {
        Object obj = this.f13168b;
        j jVar = j.f13172a;
        if (obj != jVar) {
            return obj;
        }
        rd.a aVar = this.f13167a;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13166c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != jVar) {
                    return this.f13168b;
                }
            }
            this.f13167a = null;
            return invoke;
        }
        return this.f13168b;
    }

    public final String toString() {
        if (this.f13168b != j.f13172a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
