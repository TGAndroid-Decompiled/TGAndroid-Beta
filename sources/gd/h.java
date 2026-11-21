package gd;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h implements c, Serializable {
    public static final AtomicReferenceFieldUpdater f13507c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "b");
    public volatile rd.a f13508a;
    public volatile Object f13509b;

    @Override
    public final Object getValue() {
        Object obj = this.f13509b;
        j jVar = j.f13513a;
        if (obj != jVar) {
            return obj;
        }
        rd.a aVar = this.f13508a;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13507c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != jVar) {
                    return this.f13509b;
                }
            }
            this.f13508a = null;
            return invoke;
        }
        return this.f13509b;
    }

    public final String toString() {
        if (this.f13509b != j.f13513a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
