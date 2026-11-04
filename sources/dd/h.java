package dd;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h implements c, Serializable {
    public static final AtomicReferenceFieldUpdater f8794c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "b");
    public volatile od.a f8795a;
    public volatile Object f8796b;

    @Override
    public final Object getValue() {
        Object obj = this.f8796b;
        j jVar = j.f8800a;
        if (obj != jVar) {
            return obj;
        }
        od.a aVar = this.f8795a;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8794c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != jVar) {
                    return this.f8796b;
                }
            }
            this.f8795a = null;
            return invoke;
        }
        return this.f8796b;
    }

    public final String toString() {
        if (this.f8796b != j.f8800a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
