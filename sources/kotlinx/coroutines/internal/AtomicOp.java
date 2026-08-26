package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class AtomicOp extends OpDescriptor {
    public static final AtomicReferenceFieldUpdater _consensus$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(AtomicOp.class, Object.class, "_consensus$volatile");
    private volatile Object _consensus$volatile = AtomicKt.NO_DECISION;

    public abstract void complete(Object obj, Object obj2);

    @Override
    public final Object perform(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _consensus$volatile$FU;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Symbol symbol = AtomicKt.NO_DECISION;
        if (obj2 == symbol) {
            Symbol symbolPrepare = prepare(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == symbol) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, symbol, symbolPrepare)) {
                    if (atomicReferenceFieldUpdater.get(this) != symbol) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                    }
                }
                obj2 = symbolPrepare;
            }
        }
        complete(obj, obj2);
        return obj2;
    }

    public abstract Symbol prepare(Object obj);
}
