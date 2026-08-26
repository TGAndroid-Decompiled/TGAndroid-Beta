package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.Segment;

public final class SemaphoreSegment extends Segment {
    public final AtomicReferenceArray acquirers;

    public SemaphoreSegment(long j, SemaphoreSegment semaphoreSegment, int i) {
        super(j, semaphoreSegment, i);
        this.acquirers = new AtomicReferenceArray(SemaphoreKt.SEGMENT_SIZE);
    }

    @Override
    public final int getNumberOfSlots() {
        return SemaphoreKt.SEGMENT_SIZE;
    }

    @Override
    public final void onCancellation(int i, CoroutineContext coroutineContext) {
        this.acquirers.set(i, SemaphoreKt.CANCELLED);
        onSlotCleaned();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + ']';
    }
}
