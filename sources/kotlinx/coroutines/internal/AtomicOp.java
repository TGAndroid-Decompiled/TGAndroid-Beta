package kotlinx.coroutines.internal;

import com.google.common.base.Joiner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class AtomicOp extends OpDescriptor {
    public static final AtomicReferenceFieldUpdater _consensus$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(AtomicOp.class, Object.class, "_consensus$volatile");
    private volatile Object _consensus$volatile = AtomicKt.NO_DECISION;

    public abstract void complete(Object obj, Object obj2);

    @Override
    public final Object perform(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _consensus$volatile$FU;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Joiner joiner = AtomicKt.NO_DECISION;
        if (obj2 == joiner) {
            Joiner joinerPrepare = prepare(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == joiner) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, joiner, joinerPrepare)) {
                    if (atomicReferenceFieldUpdater.get(this) != joiner) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                    }
                }
                obj2 = joinerPrepare;
            }
        }
        complete(obj, obj2);
        return obj2;
    }

    public abstract Joiner prepare(Object obj);
}
