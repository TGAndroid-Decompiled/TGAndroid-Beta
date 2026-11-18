package gd;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h implements c, Serializable {
    public static final AtomicReferenceFieldUpdater f13481c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "b");
    public volatile rd.a f13482a;
    public volatile Object f13483b;

    @Override
    public final Object getValue() {
        Object obj = this.f13483b;
        j jVar = j.f13487a;
        if (obj != jVar) {
            return obj;
        }
        rd.a aVar = this.f13482a;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13481c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != jVar) {
                    return this.f13483b;
                }
            }
            this.f13482a = null;
            return invoke;
        }
        return this.f13483b;
    }

    public final String toString() {
        if (this.f13483b != j.f13487a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
