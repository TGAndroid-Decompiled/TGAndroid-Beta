package kotlinx.coroutines.sync;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;

public class SemaphoreImpl {
    private volatile int _availablePermits$volatile;
    private volatile long deqIdx$volatile;
    private volatile long enqIdx$volatile;
    private volatile Object head$volatile;
    private final Function1 onCancellationRelease;
    private final int permits;
    private volatile Object tail$volatile;
    private static final AtomicReferenceFieldUpdater head$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head$volatile");
    private static final AtomicLongFieldUpdater deqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx$volatile");
    private static final AtomicReferenceFieldUpdater tail$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail$volatile");
    private static final AtomicLongFieldUpdater enqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx$volatile");
    private static final AtomicIntegerFieldUpdater _availablePermits$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits$volatile");

    public SemaphoreImpl(int i, int i2) {
        this.permits = i;
        if (i <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
        this.head$volatile = semaphoreSegment;
        this.tail$volatile = semaphoreSegment;
        this._availablePermits$volatile = i - i2;
        this.onCancellationRelease = new Function1() {
            {
                super(1);
            }

            @Override
            public Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Throwable th) {
                this.this$0.release();
            }
        };
    }

    public int getAvailablePermits() {
        return Math.max(_availablePermits$volatile$FU.get(this), 0);
    }

    public boolean tryAcquire() {
        while (true) {
            int i = _availablePermits$volatile$FU.get(this);
            if (i > this.permits) {
                coerceAvailablePermitsAtMaximum();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (_availablePermits$volatile$FU.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    protected final void acquire(CancellableContinuation cancellableContinuation) {
        while (decPermits() <= 0) {
            Intrinsics.checkNotNull(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((Waiter) cancellableContinuation)) {
                return;
            }
        }
        cancellableContinuation.resume(Unit.INSTANCE, this.onCancellationRelease);
    }

    private final int decPermits() {
        int andDecrement;
        do {
            andDecrement = _availablePermits$volatile$FU.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    public void release() {
        do {
            int andIncrement = _availablePermits$volatile$FU.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                coerceAvailablePermitsAtMaximum();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!tryResumeNextFromQueue());
    }

    private final void coerceAvailablePermitsAtMaximum() {
        int i;
        do {
            i = _availablePermits$volatile$FU.get(this);
            if (i <= this.permits) {
                return;
            }
        } while (!_availablePermits$volatile$FU.compareAndSet(this, i, this.permits));
    }

    private final boolean addAcquireToQueue(Waiter waiter) {
        Object objFindSegmentInternal;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) tail$volatile$FU.get(this);
        long andIncrement = enqIdx$volatile$FU.getAndIncrement(this);
        SemaphoreImpl$addAcquireToQueue$createNewSegment$1 semaphoreImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tail$volatile$FU;
        long j = andIncrement / SemaphoreKt.SEGMENT_SIZE;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j, semaphoreImpl$addAcquireToQueue$createNewSegment$1);
            if (!SegmentOrClosed.m336isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM335getSegmentimpl = SegmentOrClosed.m335getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM335getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM335getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, segmentM335getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (segmentM335getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM335getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m335getSegmentimpl(objFindSegmentInternal);
        int i = (int) (andIncrement % SemaphoreKt.SEGMENT_SIZE);
        if (!ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(semaphoreSegment2.getAcquirers(), i, null, waiter)) {
            if (!ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(semaphoreSegment2.getAcquirers(), i, SemaphoreKt.PERMIT, SemaphoreKt.TAKEN)) {
                return false;
            }
            if (waiter instanceof CancellableContinuation) {
                Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                ((CancellableContinuation) waiter).resume(Unit.INSTANCE, this.onCancellationRelease);
                return true;
            }
            throw new IllegalStateException(("unexpected: " + waiter).toString());
        }
        waiter.invokeOnCancellation(semaphoreSegment2, i);
        return true;
    }

    private final boolean tryResumeNextFromQueue() {
        Object objFindSegmentInternal;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) head$volatile$FU.get(this);
        long andIncrement = deqIdx$volatile$FU.getAndIncrement(this);
        long j = andIncrement / SemaphoreKt.SEGMENT_SIZE;
        SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = head$volatile$FU;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j, semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (SegmentOrClosed.m336isClosedimpl(objFindSegmentInternal)) {
                break;
            }
            Segment segmentM335getSegmentimpl = SegmentOrClosed.m335getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= segmentM335getSegmentimpl.id) {
                    break loop0;
                }
                if (!segmentM335getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, segmentM335getSegmentimpl)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                } else if (segmentM335getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM335getSegmentimpl.remove();
                }
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m335getSegmentimpl(objFindSegmentInternal);
        semaphoreSegment2.cleanPrev();
        if (semaphoreSegment2.id > j) {
            return false;
        }
        int i = (int) (andIncrement % SemaphoreKt.SEGMENT_SIZE);
        Object andSet = semaphoreSegment2.getAcquirers().getAndSet(i, SemaphoreKt.PERMIT);
        if (andSet == null) {
            int i2 = SemaphoreKt.MAX_SPIN_CYCLES;
            for (int i3 = 0; i3 < i2; i3++) {
                if (semaphoreSegment2.getAcquirers().get(i) == SemaphoreKt.TAKEN) {
                    return true;
                }
            }
            return !ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(semaphoreSegment2.getAcquirers(), i, SemaphoreKt.PERMIT, SemaphoreKt.BROKEN);
        }
        if (andSet == SemaphoreKt.CANCELLED) {
            return false;
        }
        return tryResumeAcquire(andSet);
    }

    private final boolean tryResumeAcquire(Object obj) {
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            Object objTryResume = cancellableContinuation.tryResume(Unit.INSTANCE, null, this.onCancellationRelease);
            if (objTryResume == null) {
                return false;
            }
            cancellableContinuation.completeResume(objTryResume);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + obj).toString());
    }
}
