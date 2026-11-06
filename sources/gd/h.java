package gd;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h implements c, Serializable {
    public static final AtomicReferenceFieldUpdater f13822c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "b");
    public volatile rd.a f13823a;
    public volatile Object f13824b;

    @Override
    public final Object getValue() {
        Object obj = this.f13824b;
        j jVar = j.f13828a;
        if (obj != jVar) {
            return obj;
        }
        rd.a aVar = this.f13823a;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13822c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != jVar) {
                    return this.f13824b;
                }
            }
            this.f13823a = null;
            return invoke;
        }
        return this.f13824b;
    }

    public final String toString() {
        if (this.f13824b != j.f13828a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
