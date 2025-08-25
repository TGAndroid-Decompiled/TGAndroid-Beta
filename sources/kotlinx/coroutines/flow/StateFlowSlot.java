package kotlinx.coroutines.flow;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

public final class StateFlowSlot extends AbstractSharedFlowSlot {
    private static final AtomicReferenceFieldUpdater _state$FU = AtomicReferenceFieldUpdater.newUpdater(StateFlowSlot.class, Object.class, "_state");
    private volatile Object _state;

    @Override
    public boolean allocateLocked(StateFlowImpl stateFlowImpl) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, StateFlowKt.access$getNONE$p());
        return true;
    }

    @Override
    public Continuation[] freeLocked(StateFlowImpl stateFlowImpl) {
        _state$FU.set(this, null);
        return AbstractSharedFlowKt.EMPTY_RESUMES;
    }

    public final void makePending() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null || obj == StateFlowKt.access$getPENDING$p()) {
                return;
            }
            if (obj == StateFlowKt.access$getNONE$p()) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$FU, this, obj, StateFlowKt.access$getPENDING$p())) {
                    return;
                }
            } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$FU, this, obj, StateFlowKt.access$getNONE$p())) {
                Result.Companion companion = Result.Companion;
                ((CancellableContinuationImpl) obj).resumeWith(Result.m211constructorimpl(Unit.INSTANCE));
                return;
            }
        }
    }

    public final boolean takePending() {
        Object andSet = _state$FU.getAndSet(this, StateFlowKt.access$getNONE$p());
        Intrinsics.checkNotNull(andSet);
        return andSet == StateFlowKt.access$getPENDING$p();
    }

    public final Object awaitPending(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$FU, this, StateFlowKt.access$getNONE$p(), cancellableContinuationImpl)) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m211constructorimpl(Unit.INSTANCE));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
