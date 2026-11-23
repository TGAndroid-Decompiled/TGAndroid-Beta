package gd;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h implements c, Serializable {
    public static final AtomicReferenceFieldUpdater f13473c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "b");
    public volatile rd.a f13474a;
    public volatile Object f13475b;

    @Override
    public final Object getValue() {
        Object obj = this.f13475b;
        j jVar = j.f13479a;
        if (obj != jVar) {
            return obj;
        }
        rd.a aVar = this.f13474a;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13473c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != jVar) {
                    return this.f13475b;
                }
            }
            this.f13474a = null;
            return invoke;
        }
        return this.f13475b;
    }

    public final String toString() {
        if (this.f13475b != j.f13479a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
