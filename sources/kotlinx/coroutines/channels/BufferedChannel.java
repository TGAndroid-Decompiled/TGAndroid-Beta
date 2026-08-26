package kotlinx.coroutines.channels;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.datastore.core.SingleProcessDataStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

public class BufferedChannel {
    private volatile Object _closeCause$volatile;
    private volatile long bufferEnd$volatile;
    private volatile Object bufferEndSegment$volatile;
    public final int capacity;
    private volatile Object closeHandler$volatile;
    private volatile long completedExpandBuffersAndPauseFlag$volatile;
    private volatile Object receiveSegment$volatile;
    private volatile long receivers$volatile;
    private volatile Object sendSegment$volatile;
    private volatile long sendersAndCloseStatus$volatile;
    public static final AtomicLongFieldUpdater sendersAndCloseStatus$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");
    public static final AtomicLongFieldUpdater receivers$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");
    public static final AtomicLongFieldUpdater bufferEnd$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");
    public static final AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final AtomicReferenceFieldUpdater sendSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");
    public static final AtomicReferenceFieldUpdater receiveSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");
    public static final AtomicReferenceFieldUpdater bufferEndSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");
    public static final AtomicReferenceFieldUpdater _closeCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");
    public static final AtomicReferenceFieldUpdater closeHandler$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");

    public BufferedChannel(int i) {
        this.capacity = i;
        if (i < 0) {
            throw new IllegalArgumentException(SurfaceContainer$$ExternalSyntheticOutline0.m(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        ChannelSegment channelSegment = BufferedChannelKt.NULL_SEGMENT;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = bufferEnd$volatile$FU.get(this);
        ChannelSegment channelSegment2 = new ChannelSegment(0L, null, this, 3);
        this.sendSegment$volatile = channelSegment2;
        this.receiveSegment$volatile = channelSegment2;
        if (isRendezvousOrUnlimited()) {
            channelSegment2 = BufferedChannelKt.NULL_SEGMENT;
            Intrinsics.checkNotNull(channelSegment2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = channelSegment2;
        this._closeCause$volatile = BufferedChannelKt.NO_CLOSE_CAUSE;
    }

    public static void incCompletedExpandBufferAttempts$default(BufferedChannel bufferedChannel) {
        bufferedChannel.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$volatile$FU;
        if ((atomicLongFieldUpdater.addAndGet(bufferedChannel, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bufferedChannel) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean tryResumeSender(Object obj) {
        if (!(obj instanceof CancellableContinuation)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
        ChannelSegment channelSegment = BufferedChannelKt.NULL_SEGMENT;
        Symbol symbolTryResume = cancellableContinuation.tryResume(null, Unit.INSTANCE);
        if (symbolTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(symbolTryResume);
        return true;
    }

    public final boolean bufferOrRendezvousSend(long j) {
        return j < bufferEnd$volatile$FU.get(this) || j < receivers$volatile$FU.get(this) + ((long) this.capacity);
    }

    public final ChannelSegment completeClose(long j) {
        Object objM145plusFjFbRPM;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = bufferEndSegment$volatile$FU.get(this);
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        if (channelSegment.id > ((ChannelSegment) obj).id) {
            obj = channelSegment;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        if (channelSegment2.id > ((ChannelSegment) obj).id) {
            obj = channelSegment2;
        }
        ConcurrentLinkedListNode concurrentLinkedListNode = (ConcurrentLinkedListNode) obj;
        loop0: while (true) {
            concurrentLinkedListNode.getClass();
            Object obj2 = ConcurrentLinkedListNode._next$volatile$FU.get(concurrentLinkedListNode);
            Symbol symbol = AtomicKt.CLOSED;
            objM145plusFjFbRPM = null;
            if (obj2 == symbol) {
                break;
            }
            ConcurrentLinkedListNode concurrentLinkedListNode2 = (ConcurrentLinkedListNode) obj2;
            if (concurrentLinkedListNode2 == null) {
                do {
                    atomicReferenceFieldUpdater = ConcurrentLinkedListNode._next$volatile$FU;
                    if (atomicReferenceFieldUpdater.compareAndSet(concurrentLinkedListNode, null, symbol)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(concurrentLinkedListNode) == null);
            } else {
                concurrentLinkedListNode = concurrentLinkedListNode2;
            }
        }
        ChannelSegment channelSegment3 = (ChannelSegment) concurrentLinkedListNode;
        loop2: for (ChannelSegment channelSegment4 = channelSegment3; channelSegment4 != null; channelSegment4 = (ChannelSegment) ((ConcurrentLinkedListNode) ConcurrentLinkedListNode._prev$volatile$FU.get(channelSegment4))) {
            for (int i = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i; i--) {
                if ((channelSegment4.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i) < j) {
                    break loop2;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = channelSegment4.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                        if (!(state$kotlinx_coroutines_core instanceof WaiterEB)) {
                            if (!(state$kotlinx_coroutines_core instanceof Waiter)) {
                                break;
                            }
                            if (channelSegment4.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.CHANNEL_CLOSED)) {
                                objM145plusFjFbRPM = AtomicKt.m145plusFjFbRPM(objM145plusFjFbRPM, state$kotlinx_coroutines_core);
                                channelSegment4.onCancelledRequest(i, true);
                                break;
                            }
                        } else {
                            if (channelSegment4.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.CHANNEL_CLOSED)) {
                                objM145plusFjFbRPM = AtomicKt.m145plusFjFbRPM(objM145plusFjFbRPM, ((WaiterEB) state$kotlinx_coroutines_core).waiter);
                                channelSegment4.onCancelledRequest(i, true);
                                break;
                            }
                        }
                    } else {
                        if (channelSegment4.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.CHANNEL_CLOSED)) {
                            channelSegment4.onSlotCleaned();
                            break;
                        }
                    }
                }
            }
        }
        if (objM145plusFjFbRPM != null) {
            if (!(objM145plusFjFbRPM instanceof ArrayList)) {
                resumeWaiterOnClosedChannel((Waiter) objM145plusFjFbRPM, true);
                return channelSegment3;
            }
            ArrayList arrayList = (ArrayList) objM145plusFjFbRPM;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                resumeWaiterOnClosedChannel((Waiter) arrayList.get(size), true);
            }
        }
        return channelSegment3;
    }

    public final void completeCloseOrCancel() {
        isClosed(sendersAndCloseStatus$volatile$FU.get(this), false);
    }

    public final void expandBuffer() {
        Object objFindSegmentInternal;
        if (isRendezvousOrUnlimited()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
        ChannelSegment channelSegment = (ChannelSegment) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = bufferEnd$volatile$FU.getAndIncrement(this);
            long j = andIncrement / ((long) BufferedChannelKt.SEGMENT_SIZE);
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (channelSegment.id < j && channelSegment.getNext() != null) {
                    moveSegmentBufferEndToSpecifiedOrLast(j, channelSegment);
                }
                incCompletedExpandBufferAttempts$default(this);
                return;
            }
            if (channelSegment.id != j) {
                BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
                while (true) {
                    objFindSegmentInternal = AtomicKt.findSegmentInternal(channelSegment, j, bufferedChannelKt$createSegmentFunction$1);
                    if (!AtomicKt.m144isClosedimpl(objFindSegmentInternal)) {
                        Segment segmentM143getSegmentimpl = AtomicKt.m143getSegmentimpl(objFindSegmentInternal);
                        while (true) {
                            Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                            if (segment.id >= segmentM143getSegmentimpl.id) {
                                break;
                            }
                            if (!segmentM143getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM143getSegmentimpl)) {
                                    if (!segment.decPointers$kotlinx_coroutines_core()) {
                                        break;
                                    }
                                    segment.remove();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == segment);
                            if (segmentM143getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                                segmentM143getSegmentimpl.remove();
                            }
                        }
                    } else {
                        break;
                    }
                }
                ChannelSegment channelSegment2 = null;
                if (AtomicKt.m144isClosedimpl(objFindSegmentInternal)) {
                    completeCloseOrCancel();
                    moveSegmentBufferEndToSpecifiedOrLast(j, channelSegment);
                    incCompletedExpandBufferAttempts$default(this);
                } else {
                    ChannelSegment channelSegment3 = (ChannelSegment) AtomicKt.m143getSegmentimpl(objFindSegmentInternal);
                    long j2 = channelSegment3.id;
                    if (j2 > j) {
                        long j3 = j2 * ((long) BufferedChannelKt.SEGMENT_SIZE);
                        if (bufferEnd$volatile$FU.compareAndSet(this, 1 + andIncrement, j3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$volatile$FU;
                            if ((atomicLongFieldUpdater.addAndGet(this, j3 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            incCompletedExpandBufferAttempts$default(this);
                        }
                    } else {
                        channelSegment2 = channelSegment3;
                    }
                }
                if (channelSegment2 == null) {
                    continue;
                } else {
                    channelSegment = channelSegment2;
                }
            }
            int i = (int) (andIncrement % ((long) BufferedChannelKt.SEGMENT_SIZE));
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            boolean z = state$kotlinx_coroutines_core instanceof Waiter;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = receivers$volatile$FU;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
                while (true) {
                    Object state$kotlinx_coroutines_core2 = channelSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core2 instanceof Waiter) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, new WaiterEB((Waiter) state$kotlinx_coroutines_core2))) {
                                incCompletedExpandBufferAttempts$default(this);
                                return;
                            }
                        } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, BufferedChannelKt.RESUMING_BY_EB)) {
                            if (!tryResumeSender(state$kotlinx_coroutines_core2)) {
                                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_SEND);
                                channelSegment.onSlotCleaned();
                                break;
                            } else {
                                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.BUFFERED);
                                incCompletedExpandBufferAttempts$default(this);
                                return;
                            }
                        }
                    } else {
                        if (state$kotlinx_coroutines_core2 == BufferedChannelKt.INTERRUPTED_SEND) {
                            break;
                        }
                        if (state$kotlinx_coroutines_core2 == null) {
                            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, BufferedChannelKt.IN_BUFFER)) {
                                incCompletedExpandBufferAttempts$default(this);
                                return;
                            }
                        } else if (state$kotlinx_coroutines_core2 == BufferedChannelKt.BUFFERED || state$kotlinx_coroutines_core2 == BufferedChannelKt.POISONED || state$kotlinx_coroutines_core2 == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core2 == BufferedChannelKt.INTERRUPTED_RCV || state$kotlinx_coroutines_core2 == BufferedChannelKt.CHANNEL_CLOSED) {
                            incCompletedExpandBufferAttempts$default(this);
                            return;
                        } else if (state$kotlinx_coroutines_core2 != BufferedChannelKt.RESUMING_BY_RCV) {
                            throw new IllegalStateException(("Unexpected cell state: " + state$kotlinx_coroutines_core2).toString());
                        }
                    }
                }
                incCompletedExpandBufferAttempts$default(this);
            } else if (tryResumeSender(state$kotlinx_coroutines_core)) {
                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.BUFFERED);
                incCompletedExpandBufferAttempts$default(this);
                return;
            } else {
                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_SEND);
                channelSegment.onSlotCleaned();
                incCompletedExpandBufferAttempts$default(this);
            }
        }
    }

    public final ChannelSegment findSegmentReceive(long j, ChannelSegment channelSegment) {
        Object objFindSegmentInternal;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        ChannelSegment channelSegment2 = BufferedChannelKt.NULL_SEGMENT;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
        loop0: while (true) {
            objFindSegmentInternal = AtomicKt.findSegmentInternal(channelSegment, j, bufferedChannelKt$createSegmentFunction$1);
            if (!AtomicKt.m144isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM143getSegmentimpl = AtomicKt.m143getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$volatile$FU;
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM143getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM143getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM143getSegmentimpl)) {
                            if (!segment.decPointers$kotlinx_coroutines_core()) {
                                break loop0;
                            }
                            segment.remove();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == segment);
                    if (segmentM143getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM143getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (AtomicKt.m144isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE) < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
                return null;
            }
        } else {
            ChannelSegment channelSegment3 = (ChannelSegment) AtomicKt.m143getSegmentimpl(objFindSegmentInternal);
            boolean zIsRendezvousOrUnlimited = isRendezvousOrUnlimited();
            long j3 = channelSegment3.id;
            if (!zIsRendezvousOrUnlimited && j <= bufferEnd$volatile$FU.get(this) / ((long) BufferedChannelKt.SEGMENT_SIZE)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bufferEndSegment$volatile$FU;
                    Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                    if (segment2.id >= j3 || !channelSegment3.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, segment2, channelSegment3)) {
                            if (!segment2.decPointers$kotlinx_coroutines_core()) {
                                break loop3;
                            }
                            segment2.remove();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == segment2);
                    if (channelSegment3.decPointers$kotlinx_coroutines_core()) {
                        channelSegment3.remove();
                    }
                }
            }
            if (j3 <= j) {
                return channelSegment3;
            }
            long j4 = j3 * ((long) BufferedChannelKt.SEGMENT_SIZE);
            do {
                atomicLongFieldUpdater = receivers$volatile$FU;
                j2 = atomicLongFieldUpdater.get(this);
                if (j2 >= j4) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j4));
            if (j3 * ((long) BufferedChannelKt.SEGMENT_SIZE) < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment3.cleanPrev();
            }
        }
        return null;
    }

    public final Throwable getSendException() {
        Throwable th = (Throwable) _closeCause$volatile$FU.get(this);
        return th == null ? new ClosedSendChannelException("Channel was closed") : th;
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L;
    }

    public final boolean isClosed(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
            if (i == 2) {
                completeClose(1152921504606846975L & j);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$volatile$FU;
                        ChannelSegment channelSegmentFindSegmentReceive = (ChannelSegment) atomicReferenceFieldUpdater.get(this);
                        long j2 = atomicLongFieldUpdater.get(this);
                        if (getSendersCounter$kotlinx_coroutines_core() <= j2) {
                            break;
                        }
                        long j3 = BufferedChannelKt.SEGMENT_SIZE;
                        long j4 = j2 / j3;
                        if (channelSegmentFindSegmentReceive.id != j4 && (channelSegmentFindSegmentReceive = findSegmentReceive(j4, channelSegmentFindSegmentReceive)) == null) {
                            if (((ChannelSegment) atomicReferenceFieldUpdater.get(this)).id < j4) {
                                break;
                            }
                        } else {
                            channelSegmentFindSegmentReceive.cleanPrev();
                            int i2 = (int) (j2 % j3);
                            while (true) {
                                Object state$kotlinx_coroutines_core = channelSegmentFindSegmentReceive.getState$kotlinx_coroutines_core(i2);
                                if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                                    if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED && (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND || state$kotlinx_coroutines_core == BufferedChannelKt.CHANNEL_CLOSED || state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.POISONED || (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB && (state$kotlinx_coroutines_core == BufferedChannelKt.RESUMING_BY_RCV || j2 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (channelSegmentFindSegmentReceive.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED)) {
                                    expandBuffer();
                                    break;
                                }
                            }
                            receivers$volatile$FU.compareAndSet(this, j2, j2 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(SurfaceContainer$$ExternalSyntheticOutline0.m(i, "unexpected close status: ").toString());
                }
                ChannelSegment channelSegmentCompleteClose = completeClose(1152921504606846975L & j);
                Object objM145plusFjFbRPM = null;
                loop0: do {
                    for (int i3 = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i3; i3--) {
                        long j5 = (channelSegmentCompleteClose.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i3);
                        while (true) {
                            Object state$kotlinx_coroutines_core2 = channelSegmentCompleteClose.getState$kotlinx_coroutines_core(i3);
                            if (state$kotlinx_coroutines_core2 == BufferedChannelKt.DONE_RCV) {
                                break loop0;
                            }
                            if (state$kotlinx_coroutines_core2 != BufferedChannelKt.BUFFERED) {
                                if (state$kotlinx_coroutines_core2 != BufferedChannelKt.IN_BUFFER && state$kotlinx_coroutines_core2 != null) {
                                    if (!(state$kotlinx_coroutines_core2 instanceof Waiter) && !(state$kotlinx_coroutines_core2 instanceof WaiterEB)) {
                                        Symbol symbol = BufferedChannelKt.RESUMING_BY_EB;
                                        if (state$kotlinx_coroutines_core2 == symbol || state$kotlinx_coroutines_core2 == BufferedChannelKt.RESUMING_BY_RCV) {
                                            break loop0;
                                        }
                                        if (state$kotlinx_coroutines_core2 != symbol) {
                                            break;
                                        }
                                    } else {
                                        if (j5 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        Waiter waiter = state$kotlinx_coroutines_core2 instanceof WaiterEB ? ((WaiterEB) state$kotlinx_coroutines_core2).waiter : (Waiter) state$kotlinx_coroutines_core2;
                                        if (channelSegmentCompleteClose.casState$kotlinx_coroutines_core(i3, state$kotlinx_coroutines_core2, BufferedChannelKt.CHANNEL_CLOSED)) {
                                            objM145plusFjFbRPM = AtomicKt.m145plusFjFbRPM(objM145plusFjFbRPM, waiter);
                                            channelSegmentCompleteClose.setElementLazy(i3, null);
                                            channelSegmentCompleteClose.onSlotCleaned();
                                            break;
                                        }
                                    }
                                } else {
                                    if (channelSegmentCompleteClose.casState$kotlinx_coroutines_core(i3, state$kotlinx_coroutines_core2, BufferedChannelKt.CHANNEL_CLOSED)) {
                                        channelSegmentCompleteClose.onSlotCleaned();
                                        break;
                                    }
                                }
                            } else {
                                if (j5 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (channelSegmentCompleteClose.casState$kotlinx_coroutines_core(i3, state$kotlinx_coroutines_core2, BufferedChannelKt.CHANNEL_CLOSED)) {
                                    channelSegmentCompleteClose.setElementLazy(i3, null);
                                    channelSegmentCompleteClose.onSlotCleaned();
                                    break;
                                }
                            }
                        }
                    }
                    channelSegmentCompleteClose = (ChannelSegment) ((ConcurrentLinkedListNode) ConcurrentLinkedListNode._prev$volatile$FU.get(channelSegmentCompleteClose));
                } while (channelSegmentCompleteClose != null);
                if (objM145plusFjFbRPM != null) {
                    if (objM145plusFjFbRPM instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM145plusFjFbRPM;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            resumeWaiterOnClosedChannel((Waiter) arrayList.get(size), false);
                        }
                    } else {
                        resumeWaiterOnClosedChannel((Waiter) objM145plusFjFbRPM, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean isRendezvousOrUnlimited() {
        long j = bufferEnd$volatile$FU.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final void moveSegmentBufferEndToSpecifiedOrLast(long j, ChannelSegment channelSegment) {
        ChannelSegment channelSegment2;
        ChannelSegment channelSegment3;
        while (channelSegment.id < j && (channelSegment3 = (ChannelSegment) channelSegment.getNext()) != null) {
            channelSegment = channelSegment3;
        }
        while (true) {
            if (!channelSegment.isRemoved() || (channelSegment2 = (ChannelSegment) channelSegment.getNext()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= channelSegment.id) {
                        return;
                    }
                    if (!channelSegment.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, segment, channelSegment)) {
                            if (segment.decPointers$kotlinx_coroutines_core()) {
                                segment.remove();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == segment);
                    if (channelSegment.decPointers$kotlinx_coroutines_core()) {
                        channelSegment.remove();
                    }
                }
            } else {
                channelSegment = channelSegment2;
            }
        }
    }

    public final void resumeWaiterOnClosedChannel(Waiter waiter, boolean z) {
        Throwable sendException;
        if (!(waiter instanceof CancellableContinuation)) {
            throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
        }
        Continuation continuation = (Continuation) waiter;
        if (z) {
            sendException = (Throwable) _closeCause$volatile$FU.get(this);
            if (sendException == null) {
                sendException = new ClosedReceiveChannelException("Channel was closed");
            }
        } else {
            sendException = getSendException();
        }
        continuation.resumeWith(ResultKt.createFailure(sendException));
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i = (int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.capacity + ',');
        sb.append("data=[");
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ChannelSegment[]{receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j2 = ((ChannelSegment) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        long j3 = receivers$volatile$FU.get(this);
        long sendersCounter$kotlinx_coroutines_core = getSendersCounter$kotlinx_coroutines_core();
        loop2: do {
            int i2 = BufferedChannelKt.SEGMENT_SIZE;
            for (int i3 = 0; i3 < i2; i3++) {
                long j4 = (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i3);
                if (j4 >= sendersCounter$kotlinx_coroutines_core && j4 >= j3) {
                    break loop2;
                }
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i3);
                Object obj2 = channelSegment.data.get(i3 * 2);
                if (state$kotlinx_coroutines_core instanceof CancellableContinuation) {
                    string = (j4 >= j3 || j4 < sendersCounter$kotlinx_coroutines_core) ? (j4 >= sendersCounter$kotlinx_coroutines_core || j4 < j3) ? "cont" : "send" : "receive";
                } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                    string = "EB(" + state$kotlinx_coroutines_core + ')';
                } else if (Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_RCV) ? true : Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
                    string = "resuming_sender";
                } else {
                    if (!(state$kotlinx_coroutines_core == null ? true : state$kotlinx_coroutines_core.equals(BufferedChannelKt.IN_BUFFER) ? true : Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV) ? true : Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.POISONED) ? true : Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_RCV) ? true : Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_SEND) ? true : Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.CHANNEL_CLOSED))) {
                        string = state$kotlinx_coroutines_core.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            channelSegment = (ChannelSegment) channelSegment.getNext();
        } while (channelSegment != null);
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(StringsKt__StringsKt.getLastIndex(sb)) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean tryResumeReceiver(Object obj, SingleProcessDataStore.Message message) {
        if (!(obj instanceof CancellableContinuation)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
        ChannelSegment channelSegment = BufferedChannelKt.NULL_SEGMENT;
        Symbol symbolTryResume = cancellableContinuation.tryResume(null, message);
        if (symbolTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(symbolTryResume);
        return true;
    }

    public final Object updateCellReceive(ChannelSegment channelSegment, int i, long j, Object obj) {
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        AtomicReferenceArray atomicReferenceArray = channelSegment.data;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        if (state$kotlinx_coroutines_core == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return BufferedChannelKt.SUSPEND_NO_WAITER;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, obj)) {
                    expandBuffer();
                    return BufferedChannelKt.SUSPEND;
                }
            }
        } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED && channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
            expandBuffer();
            Object obj2 = atomicReferenceArray.get(i * 2);
            channelSegment.setElementLazy(i, null);
            return obj2;
        }
        while (true) {
            Object state$kotlinx_coroutines_core2 = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core2 == null || state$kotlinx_coroutines_core2 == BufferedChannelKt.IN_BUFFER) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, BufferedChannelKt.POISONED)) {
                        expandBuffer();
                        return BufferedChannelKt.FAILED;
                    }
                } else {
                    if (obj == null) {
                        return BufferedChannelKt.SUSPEND_NO_WAITER;
                    }
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, obj)) {
                        expandBuffer();
                        return BufferedChannelKt.SUSPEND;
                    }
                }
            } else if (state$kotlinx_coroutines_core2 != BufferedChannelKt.BUFFERED) {
                Symbol symbol = BufferedChannelKt.INTERRUPTED_SEND;
                if (state$kotlinx_coroutines_core2 == symbol) {
                    return BufferedChannelKt.FAILED;
                }
                if (state$kotlinx_coroutines_core2 == BufferedChannelKt.POISONED) {
                    return BufferedChannelKt.FAILED;
                }
                if (state$kotlinx_coroutines_core2 == BufferedChannelKt.CHANNEL_CLOSED) {
                    expandBuffer();
                    return BufferedChannelKt.FAILED;
                }
                if (state$kotlinx_coroutines_core2 != BufferedChannelKt.RESUMING_BY_EB && channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, BufferedChannelKt.RESUMING_BY_RCV)) {
                    boolean z = state$kotlinx_coroutines_core2 instanceof WaiterEB;
                    if (z) {
                        state$kotlinx_coroutines_core2 = ((WaiterEB) state$kotlinx_coroutines_core2).waiter;
                    }
                    if (tryResumeSender(state$kotlinx_coroutines_core2)) {
                        channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.DONE_RCV);
                        expandBuffer();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        channelSegment.setElementLazy(i, null);
                        return obj3;
                    }
                    channelSegment.setState$kotlinx_coroutines_core(i, symbol);
                    channelSegment.onSlotCleaned();
                    if (z) {
                        expandBuffer();
                    }
                    return BufferedChannelKt.FAILED;
                }
            } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, BufferedChannelKt.DONE_RCV)) {
                expandBuffer();
                Object obj4 = atomicReferenceArray.get(i * 2);
                channelSegment.setElementLazy(i, null);
                return obj4;
            }
        }
    }

    public final int updateCellSendSlow(ChannelSegment channelSegment, int i, SingleProcessDataStore.Message message, long j, Symbol symbol, boolean z) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core == null) {
                if (!bufferOrRendezvousSend(j) || z) {
                    if (z) {
                        if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.INTERRUPTED_SEND)) {
                            channelSegment.onSlotCleaned();
                            return 4;
                        }
                    } else {
                        if (symbol == null) {
                            return 3;
                        }
                        if (channelSegment.casState$kotlinx_coroutines_core(i, null, symbol)) {
                            return 2;
                        }
                    }
                } else if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.BUFFERED)) {
                    break;
                }
            } else {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                    Symbol symbol2 = BufferedChannelKt.INTERRUPTED_RCV;
                    if (state$kotlinx_coroutines_core == symbol2) {
                        channelSegment.setElementLazy(i, null);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                        channelSegment.setElementLazy(i, null);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.CHANNEL_CLOSED) {
                        channelSegment.setElementLazy(i, null);
                        completeCloseOrCancel();
                        return 4;
                    }
                    channelSegment.setElementLazy(i, null);
                    if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                        state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                    }
                    if (tryResumeReceiver(state$kotlinx_coroutines_core, message)) {
                        channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.DONE_RCV);
                        return 0;
                    }
                    if (channelSegment.data.getAndSet((i * 2) + 1, symbol2) != symbol2) {
                        channelSegment.onCancelledRequest(i, true);
                    }
                    return 5;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        BufferedChannel bufferedChannel = this;
        if (bufferedChannel.isRendezvousOrUnlimited()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = bufferEnd$volatile$FU;
            if (atomicLongFieldUpdater.get(bufferedChannel) > j) {
                break;
            } else {
                bufferedChannel = this;
            }
        }
        int i = BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = completedExpandBuffersAndPauseFlag$volatile$FU;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(bufferedChannel);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(bufferedChannel)) && j2 == atomicLongFieldUpdater.get(bufferedChannel)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(bufferedChannel);
                    if (atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        bufferedChannel = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(bufferedChannel);
                    long j5 = atomicLongFieldUpdater2.get(bufferedChannel);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(bufferedChannel)) {
                        break;
                    }
                    if (!z) {
                        atomicLongFieldUpdater2.compareAndSet(this, j5, 4611686018427387904L + j6);
                    }
                    bufferedChannel = this;
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(bufferedChannel);
                    if (atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        bufferedChannel = this;
                    }
                }
            }
        }
    }
}
