package kotlinx.coroutines.flow;

import com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$$ExternalSyntheticBackportWithForwarding1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.internal.Concurrent_commonKt;

public final class StateFlowSlot extends AbstractSharedFlowSlot {
    private final AtomicReference _state = new AtomicReference(null);

    @Override
    public boolean allocateLocked(StateFlowImpl stateFlowImpl) {
        if (Concurrent_commonKt.getValue(this._state) != null) {
            return false;
        }
        Concurrent_commonKt.setValue(this._state, StateFlowKt.access$getNONE$p());
        return true;
    }

    @Override
    public Continuation[] freeLocked(StateFlowImpl stateFlowImpl) {
        Concurrent_commonKt.setValue(this._state, null);
        return AbstractSharedFlowKt.EMPTY_RESUMES;
    }

    public final void makePending() {
        AtomicReference atomicReference = this._state;
        while (true) {
            Object value = Concurrent_commonKt.getValue(atomicReference);
            if (value == null || value == StateFlowKt.access$getPENDING$p()) {
                return;
            }
            if (value == StateFlowKt.access$getNONE$p()) {
                if (AsynchronousMediaCodecBufferEnqueuer$$ExternalSyntheticBackportWithForwarding1.m(this._state, value, StateFlowKt.access$getPENDING$p())) {
                    return;
                }
            } else if (AsynchronousMediaCodecBufferEnqueuer$$ExternalSyntheticBackportWithForwarding1.m(this._state, value, StateFlowKt.access$getNONE$p())) {
                Result.Companion companion = Result.Companion;
                ((CancellableContinuationImpl) value).resumeWith(Result.m275constructorimpl(Unit.INSTANCE));
                return;
            }
        }
    }

    public final boolean takePending() {
        Object andSet = this._state.getAndSet(StateFlowKt.access$getNONE$p());
        Intrinsics.checkNotNull(andSet);
        return andSet == StateFlowKt.access$getPENDING$p();
    }

    public final Object awaitPending(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (!AsynchronousMediaCodecBufferEnqueuer$$ExternalSyntheticBackportWithForwarding1.m(this._state, StateFlowKt.access$getNONE$p(), cancellableContinuationImpl)) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m275constructorimpl(Unit.INSTANCE));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
