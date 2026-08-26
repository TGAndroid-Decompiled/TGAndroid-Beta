package kotlinx.coroutines.sync;

import androidx.datastore.core.SingleProcessDataStore$actor$1;
import com.google.common.base.Joiner;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.Segment;

public class SemaphoreImpl {
    private volatile int _availablePermits$volatile;
    private volatile long deqIdx$volatile;
    private volatile long enqIdx$volatile;
    private volatile Object head$volatile;
    public final SingleProcessDataStore$actor$1 onCancellationRelease;
    private volatile Object tail$volatile;
    public static final AtomicReferenceFieldUpdater head$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head$volatile");
    public static final AtomicLongFieldUpdater deqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx$volatile");
    public static final AtomicReferenceFieldUpdater tail$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail$volatile");
    public static final AtomicLongFieldUpdater enqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx$volatile");
    public static final AtomicIntegerFieldUpdater _availablePermits$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits$volatile");

    public SemaphoreImpl(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
        this.head$volatile = semaphoreSegment;
        this.tail$volatile = semaphoreSegment;
        this._availablePermits$volatile = 1 - i;
        this.onCancellationRelease = new SingleProcessDataStore$actor$1(this, 1);
    }

    public final void acquire(MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner) throws IllegalAccessException, InvocationTargetException {
        Object objFindSegmentInternal;
        CancellableContinuationImpl cancellableContinuationImpl;
        while (true) {
            int andDecrement = _availablePermits$volatile$FU.getAndDecrement(this);
            if (andDecrement <= 1) {
                Unit unit = Unit.INSTANCE;
                CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationWithOwner.cont;
                MutexImpl mutexImpl = MutexImpl.this;
                if (andDecrement > 0) {
                    MutexImpl.owner$volatile$FU.set(mutexImpl, null);
                    cancellableContinuationImpl2.resume(new MutexImpl$CancellableContinuationWithOwner$resume$2(mutexImpl, cancellableContinuationWithOwner, 0), unit);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tail$volatile$FU;
                SemaphoreSegment semaphoreSegment = (SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
                long andIncrement = enqIdx$volatile$FU.getAndIncrement(this);
                SemaphoreImpl$addAcquireToQueue$createNewSegment$1 semaphoreImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
                long j = andIncrement / ((long) SemaphoreKt.SEGMENT_SIZE);
                while (true) {
                    objFindSegmentInternal = AtomicKt.findSegmentInternal(semaphoreSegment, j, semaphoreImpl$addAcquireToQueue$createNewSegment$1);
                    if (AtomicKt.m149isClosedimpl(objFindSegmentInternal)) {
                        cancellableContinuationImpl = cancellableContinuationImpl2;
                        break;
                    }
                    Segment segmentM148getSegmentimpl = AtomicKt.m148getSegmentimpl(objFindSegmentInternal);
                    while (true) {
                        Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                        cancellableContinuationImpl = cancellableContinuationImpl2;
                        if (segment.id >= segmentM148getSegmentimpl.id) {
                            break;
                        }
                        if (!segmentM148getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM148getSegmentimpl)) {
                                if (!segment.decPointers$kotlinx_coroutines_core()) {
                                    break;
                                }
                                segment.remove();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == segment);
                        if (segmentM148getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                            segmentM148getSegmentimpl.remove();
                        }
                        cancellableContinuationImpl2 = cancellableContinuationImpl;
                    }
                    cancellableContinuationImpl2 = cancellableContinuationImpl;
                }
                SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) AtomicKt.m148getSegmentimpl(objFindSegmentInternal);
                int i = (int) (andIncrement % ((long) SemaphoreKt.SEGMENT_SIZE));
                AtomicReferenceArray atomicReferenceArray = semaphoreSegment2.acquirers;
                do {
                    if (atomicReferenceArray.compareAndSet(i, null, cancellableContinuationWithOwner)) {
                        cancellableContinuationWithOwner.invokeOnCancellation(semaphoreSegment2, i);
                        return;
                    }
                } while (atomicReferenceArray.get(i) == null);
                Joiner joiner = SemaphoreKt.PERMIT;
                Joiner joiner2 = SemaphoreKt.TAKEN;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, joiner, joiner2)) {
                        MutexImpl.owner$volatile$FU.set(mutexImpl, null);
                        cancellableContinuationImpl.resume(new MutexImpl$CancellableContinuationWithOwner$resume$2(mutexImpl, cancellableContinuationWithOwner, 0), unit);
                        return;
                    } else {
                        CancellableContinuationImpl cancellableContinuationImpl3 = cancellableContinuationImpl;
                        if (atomicReferenceArray.get(i) != joiner) {
                            break;
                        } else {
                            cancellableContinuationImpl = cancellableContinuationImpl3;
                        }
                    }
                }
            }
        }
    }

    public final void release() {
        boolean z;
        int i;
        Object objFindSegmentInternal;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _availablePermits$volatile$FU;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z = true;
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = head$volatile$FU;
            SemaphoreSegment semaphoreSegment = (SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = deqIdx$volatile$FU.getAndIncrement(this);
            long j = andIncrement2 / ((long) SemaphoreKt.SEGMENT_SIZE);
            SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
            while (true) {
                objFindSegmentInternal = AtomicKt.findSegmentInternal(semaphoreSegment, j, semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1);
                if (!AtomicKt.m149isClosedimpl(objFindSegmentInternal)) {
                    Segment segmentM148getSegmentimpl = AtomicKt.m148getSegmentimpl(objFindSegmentInternal);
                    while (true) {
                        Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                        if (segment.id >= segmentM148getSegmentimpl.id) {
                            break;
                        }
                        if (!segmentM148getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM148getSegmentimpl)) {
                                if (!segment.decPointers$kotlinx_coroutines_core()) {
                                    break;
                                }
                                segment.remove();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == segment);
                        if (segmentM148getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                            segmentM148getSegmentimpl.remove();
                        }
                    }
                } else {
                    break;
                }
            }
            SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) AtomicKt.m148getSegmentimpl(objFindSegmentInternal);
            semaphoreSegment2.cleanPrev();
            boolean z2 = false;
            if (semaphoreSegment2.id > j) {
                z = false;
            } else {
                int i2 = (int) (andIncrement2 % ((long) SemaphoreKt.SEGMENT_SIZE));
                Joiner joiner = SemaphoreKt.PERMIT;
                AtomicReferenceArray atomicReferenceArray = semaphoreSegment2.acquirers;
                Object andSet = atomicReferenceArray.getAndSet(i2, joiner);
                if (andSet == null) {
                    int i3 = SemaphoreKt.MAX_SPIN_CYCLES;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            Joiner joiner2 = SemaphoreKt.PERMIT;
                            Joiner joiner3 = SemaphoreKt.BROKEN;
                            do {
                                if (atomicReferenceArray.compareAndSet(i2, joiner2, joiner3)) {
                                    z2 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i2) == joiner2);
                            z = true ^ z2;
                            break;
                        }
                        if (atomicReferenceArray.get(i2) == SemaphoreKt.TAKEN) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else if (andSet == SemaphoreKt.CANCELLED) {
                    z = false;
                } else {
                    if (!(andSet instanceof CancellableContinuation)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    CancellableContinuation cancellableContinuation = (CancellableContinuation) andSet;
                    Joiner joinerTryResume = cancellableContinuation.tryResume(this.onCancellationRelease, Unit.INSTANCE);
                    if (joinerTryResume != null) {
                        cancellableContinuation.completeResume(joinerTryResume);
                    } else {
                        z = false;
                    }
                }
            }
        } while (!z);
    }
}
