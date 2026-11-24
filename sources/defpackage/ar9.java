package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class ar9 implements d26, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(ar9.class, Object.class, "b");
    public volatile pr4 a;
    public volatile Object b;

    @Override
    public final Object getValue() {
        Object obj = this.b;
        nf5 nf5Var = nf5.d;
        if (obj != nf5Var) {
            return obj;
        }
        pr4 pr4Var = this.a;
        if (pr4Var != null) {
            Object invoke = pr4Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nf5Var, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != nf5Var) {
                    return this.b;
                }
            }
            this.a = null;
            return invoke;
        }
        return this.b;
    }

    public final String toString() {
        if (this.b != nf5.d) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
