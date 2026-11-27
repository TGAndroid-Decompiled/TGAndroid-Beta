package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class rs9 implements h26, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(rs9.class, Object.class, "b");
    public volatile sr4 a;
    public volatile Object b;

    @Override
    public final Object getValue() {
        Object obj = this.b;
        qf5 qf5Var = qf5.d;
        if (obj != qf5Var) {
            return obj;
        }
        sr4 sr4Var = this.a;
        if (sr4Var != null) {
            Object invoke = sr4Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, qf5Var, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != qf5Var) {
                    return this.b;
                }
            }
            this.a = null;
            return invoke;
        }
        return this.b;
    }

    public final String toString() {
        if (this.b != qf5.d) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
