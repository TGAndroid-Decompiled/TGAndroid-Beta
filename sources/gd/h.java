package gd;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h implements c, Serializable {
    public static final AtomicReferenceFieldUpdater f13824c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "b");
    public volatile rd.a f13825a;
    public volatile Object f13826b;

    @Override
    public final Object getValue() {
        Object obj = this.f13826b;
        j jVar = j.f13830a;
        if (obj != jVar) {
            return obj;
        }
        rd.a aVar = this.f13825a;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13824c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != jVar) {
                    return this.f13826b;
                }
            }
            this.f13825a = null;
            return invoke;
        }
        return this.f13826b;
    }

    public final String toString() {
        if (this.f13826b != j.f13830a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
