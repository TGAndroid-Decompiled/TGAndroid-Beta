package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class AtomicOp extends OpDescriptor {
    private static final AtomicReferenceFieldUpdater _consensus$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(AtomicOp.class, Object.class, "_consensus$volatile");
    private volatile Object _consensus$volatile = AtomicKt.NO_DECISION;

    public abstract void complete(Object obj, Object obj2);

    public abstract Object prepare(Object obj);

    private final Object decide(Object obj) {
        Object obj2 = _consensus$volatile$FU.get(this);
        Object obj3 = AtomicKt.NO_DECISION;
        return obj2 != obj3 ? obj2 : AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_consensus$volatile$FU, this, obj3, obj) ? obj : _consensus$volatile$FU.get(this);
    }

    @Override
    public final Object perform(Object obj) {
        Object obj2 = _consensus$volatile$FU.get(this);
        if (obj2 == AtomicKt.NO_DECISION) {
            obj2 = decide(prepare(obj));
        }
        complete(obj, obj2);
        return obj2;
    }
}
