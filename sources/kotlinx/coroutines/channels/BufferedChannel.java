package kotlinx.coroutines.channels;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectInstance;

public class BufferedChannel implements Channel {
    private volatile Object _closeCause$volatile;
    private volatile long bufferEnd$volatile;
    private volatile Object bufferEndSegment$volatile;
    private final int capacity;
    private volatile Object closeHandler$volatile;
    private volatile long completedExpandBuffersAndPauseFlag$volatile;
    public final Function1 onUndeliveredElement;
    private final Function3 onUndeliveredElementReceiveCancellationConstructor;
    private volatile Object receiveSegment$volatile;
    private volatile long receivers$volatile;
    private volatile Object sendSegment$volatile;
    private volatile long sendersAndCloseStatus$volatile;
    private static final AtomicLongFieldUpdater sendersAndCloseStatus$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");
    private static final AtomicLongFieldUpdater receivers$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");
    private static final AtomicLongFieldUpdater bufferEnd$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");
    private static final AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
    private static final AtomicReferenceFieldUpdater sendSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");
    private static final AtomicReferenceFieldUpdater receiveSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");
    private static final AtomicReferenceFieldUpdater bufferEndSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");
    private static final AtomicReferenceFieldUpdater _closeCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");
    private static final AtomicReferenceFieldUpdater closeHandler$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");

    protected boolean isConflatedDropOldest() {
        return false;
    }

    protected void onClosedIdempotent() {
    }

    protected void onReceiveDequeued() {
    }

    protected void onReceiveEnqueued() {
    }

    @Override
    public Object receive(Continuation continuation) {
        return receive$suspendImpl(this, continuation);
    }

    public BufferedChannel(int i, Function1 function1) {
        this.capacity = i;
        this.onUndeliveredElement = function1;
        if (i >= 0) {
            this.bufferEnd$volatile = BufferedChannelKt.initialBufferEnd(i);
            this.completedExpandBuffersAndPauseFlag$volatile = getBufferEndCounter();
            ChannelSegment channelSegment = new ChannelSegment(0L, null, this, 3);
            this.sendSegment$volatile = channelSegment;
            this.receiveSegment$volatile = channelSegment;
            if (isRendezvousOrUnlimited()) {
                channelSegment = BufferedChannelKt.NULL_SEGMENT;
                Intrinsics.checkNotNull(channelSegment, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = channelSegment;
            this.onUndeliveredElementReceiveCancellationConstructor = function1 != null ? new Function3() {
                {
                    super(3);
                }

                @Override
                public Object invoke(Object obj, Object obj2, Object obj3) {
                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                    return invoke((SelectInstance) null, obj2, obj3);
                }

                public final Function1 invoke(SelectInstance selectInstance, Object obj, Object obj2) {
                    return new Function1(obj2, this.this$0, selectInstance) {
                        final Object $element;
                        final BufferedChannel this$0;

                        {
                            super(1);
                        }

                        @Override
                        public Object invoke(Object obj3) {
                            invoke((Throwable) obj3);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Throwable th) {
                            if (this.$element == BufferedChannelKt.getCHANNEL_CLOSED()) {
                                return;
                            }
                            Function1 function12 = this.this$0.onUndeliveredElement;
                            throw null;
                        }
                    };
                }
            } : null;
            this._closeCause$volatile = BufferedChannelKt.NO_CLOSE_CAUSE;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i + ", should be >=0").toString());
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L;
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return receivers$volatile$FU.get(this);
    }

    private final long getBufferEndCounter() {
        return bufferEnd$volatile$FU.get(this);
    }

    private final boolean isRendezvousOrUnlimited() {
        long bufferEndCounter = getBufferEndCounter();
        return bufferEndCounter == 0 || bufferEndCounter == Long.MAX_VALUE;
    }

    public final void prepareSenderForSuspension(Waiter waiter, ChannelSegment channelSegment, int i) {
        waiter.invokeOnCancellation(channelSegment, i + BufferedChannelKt.SEGMENT_SIZE);
    }

    @Override
    public java.lang.Object mo330trySendJP2dKIU(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.mo330trySendJP2dKIU(java.lang.Object):java.lang.Object");
    }

    private final Object receiveOnNoWaiterSuspend(ChannelSegment channelSegment, int i, long j, Continuation continuation) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            Object objUpdateCellReceive = updateCellReceive(channelSegment, i, j, orCreateCancellableContinuation);
            if (objUpdateCellReceive != BufferedChannelKt.SUSPEND) {
                Function1 function1BindCancellationFun = null;
                function1BindCancellationFun = null;
                if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                    if (j < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$volatile$FU.get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            onClosedReceiveOnNoWaiterSuspend(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = receivers$volatile$FU.getAndIncrement(this);
                        int i2 = BufferedChannelKt.SEGMENT_SIZE;
                        long j2 = andIncrement / i2;
                        int i3 = (int) (andIncrement % i2);
                        if (channelSegment2.id != j2) {
                            ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j2, channelSegment2);
                            if (channelSegmentFindSegmentReceive != null) {
                                channelSegment2 = channelSegmentFindSegmentReceive;
                            }
                        }
                        objUpdateCellReceive = updateCellReceive(channelSegment2, i3, andIncrement, orCreateCancellableContinuation);
                        if (objUpdateCellReceive != BufferedChannelKt.SUSPEND) {
                            if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                                if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                    channelSegment2.cleanPrev();
                                }
                            } else {
                                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                    throw new IllegalStateException("unexpected");
                                }
                                channelSegment2.cleanPrev();
                                Function1 function1 = this.onUndeliveredElement;
                                if (function1 != null) {
                                    function1BindCancellationFun = OnUndeliveredElementKt.bindCancellationFun(function1, objUpdateCellReceive, orCreateCancellableContinuation.getContext());
                                }
                            }
                        } else {
                            CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation instanceof Waiter ? orCreateCancellableContinuation : null;
                            if (cancellableContinuationImpl != null) {
                                prepareReceiverForSuspension(cancellableContinuationImpl, channelSegment2, i3);
                            }
                        }
                    }
                } else {
                    channelSegment.cleanPrev();
                    Function1 function12 = this.onUndeliveredElement;
                    if (function12 != null) {
                        function1BindCancellationFun = OnUndeliveredElementKt.bindCancellationFun(function12, objUpdateCellReceive, orCreateCancellableContinuation.getContext());
                    }
                }
                orCreateCancellableContinuation.resume(objUpdateCellReceive, function1BindCancellationFun);
            } else {
                prepareReceiverForSuspension(orCreateCancellableContinuation, channelSegment, i);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    protected final Object m331trySendDropOldestJP2dKIU(Object obj) {
        ChannelSegment channelSegment;
        Object obj2 = BufferedChannelKt.BUFFERED;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / i;
            int i2 = (int) (j % i);
            if (channelSegment2.id != j2) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j2, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return ChannelResult.Companion.m337closedJP2dKIU(getSendException());
                }
            } else {
                channelSegment = channelSegment2;
            }
            int iUpdateCellSend = updateCellSend(channelSegment, i2, obj, j, obj2, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return ChannelResult.Companion.m339successJP2dKIU(Unit.INSTANCE);
            }
            if (iUpdateCellSend == 1) {
                return ChannelResult.Companion.m339successJP2dKIU(Unit.INSTANCE);
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return ChannelResult.Companion.m337closedJP2dKIU(getSendException());
                }
                Waiter waiter = obj2 instanceof Waiter ? (Waiter) obj2 : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i2);
                }
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment.id * i) + i2);
                return ChannelResult.Companion.m339successJP2dKIU(Unit.INSTANCE);
            }
            if (iUpdateCellSend == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iUpdateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return ChannelResult.Companion.m337closedJP2dKIU(getSendException());
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
    }

    public final int updateCellSend(ChannelSegment channelSegment, int i, Object obj, long j, Object obj2, boolean z) {
        channelSegment.storeElement$kotlinx_coroutines_core(i, obj);
        if (z) {
            return updateCellSendSlow(channelSegment, i, obj, j, obj2, z);
        }
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if (state$kotlinx_coroutines_core == null) {
            if (bufferOrRendezvousSend(j)) {
                if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof Waiter) {
            channelSegment.cleanElement$kotlinx_coroutines_core(i);
            if (tryResumeReceiver(state$kotlinx_coroutines_core, obj)) {
                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.DONE_RCV);
                onReceiveDequeued();
                return 0;
            }
            if (channelSegment.getAndSetState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_RCV) != BufferedChannelKt.INTERRUPTED_RCV) {
                channelSegment.onCancelledRequest(i, true);
            }
            return 5;
        }
        return updateCellSendSlow(channelSegment, i, obj, j, obj2, z);
    }

    private final int updateCellSendSlow(ChannelSegment channelSegment, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core != null) {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.INTERRUPTED_RCV) {
                        if (state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                            channelSegment.cleanElement$kotlinx_coroutines_core(i);
                            return 5;
                        }
                        if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                            channelSegment.cleanElement$kotlinx_coroutines_core(i);
                            completeCloseOrCancel();
                            return 4;
                        }
                        channelSegment.cleanElement$kotlinx_coroutines_core(i);
                        if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                            state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                        }
                        if (tryResumeReceiver(state$kotlinx_coroutines_core, obj)) {
                            channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.DONE_RCV);
                            onReceiveDequeued();
                            return 0;
                        }
                        if (channelSegment.getAndSetState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_RCV) != BufferedChannelKt.INTERRUPTED_RCV) {
                            channelSegment.onCancelledRequest(i, true);
                        }
                        return 5;
                    }
                    channelSegment.cleanElement$kotlinx_coroutines_core(i);
                    return 5;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else if (!bufferOrRendezvousSend(j) || z) {
                if (z) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.INTERRUPTED_SEND)) {
                        channelSegment.onCancelledRequest(i, false);
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (channelSegment.casState$kotlinx_coroutines_core(i, null, obj2)) {
                        return 2;
                    }
                }
            } else if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.BUFFERED)) {
                return 1;
            }
        }
    }

    private final boolean shouldSendSuspend(long j) {
        if (isClosedForSend0(j)) {
            return false;
        }
        return !bufferOrRendezvousSend(j & 1152921504606846975L);
    }

    private final boolean bufferOrRendezvousSend(long j) {
        return j < getBufferEndCounter() || j < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.capacity);
    }

    private final boolean tryResumeReceiver(Object obj, Object obj2) {
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            Function1 function1 = this.onUndeliveredElement;
            return BufferedChannelKt.tryResume0(cancellableContinuation, obj2, function1 != null ? OnUndeliveredElementKt.bindCancellationFun(function1, obj2, cancellableContinuation.getContext()) : null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    static Object receive$suspendImpl(BufferedChannel bufferedChannel, Continuation continuation) throws Throwable {
        ChannelSegment channelSegment = (ChannelSegment) receiveSegment$volatile$FU.get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = receivers$volatile$FU.getAndIncrement(bufferedChannel);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / i;
            int i2 = (int) (andIncrement % i);
            if (channelSegment.id != j) {
                ChannelSegment channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            }
            Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i2, andIncrement, null);
            if (objUpdateCellReceive != BufferedChannelKt.SUSPEND) {
                if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                        return bufferedChannel.receiveOnNoWaiterSuspend(channelSegment, i2, andIncrement, continuation);
                    }
                    channelSegment.cleanPrev();
                    return objUpdateCellReceive;
                }
                if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        throw StackTraceRecoveryKt.recoverStackTrace(bufferedChannel.getReceiveException());
    }

    public final void prepareReceiverForSuspension(Waiter waiter, ChannelSegment channelSegment, int i) {
        onReceiveEnqueued();
        waiter.invokeOnCancellation(channelSegment, i);
    }

    public final void onClosedReceiveOnNoWaiterSuspend(CancellableContinuation cancellableContinuation) {
        Result.Companion companion = Result.Companion;
        cancellableContinuation.resumeWith(Result.m290constructorimpl(ResultKt.createFailure(getReceiveException())));
    }

    @Override
    public Object mo329tryReceivePtdJZtk() {
        ChannelSegment channelSegment;
        long j = receivers$volatile$FU.get(this);
        long j2 = sendersAndCloseStatus$volatile$FU.get(this);
        if (isClosedForReceive0(j2)) {
            return ChannelResult.Companion.m337closedJP2dKIU(getCloseCause());
        }
        if (j < (j2 & 1152921504606846975L)) {
            Object obj = BufferedChannelKt.INTERRUPTED_RCV;
            ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$volatile$FU.get(this);
            while (!isClosedForReceive()) {
                long andIncrement = receivers$volatile$FU.getAndIncrement(this);
                int i = BufferedChannelKt.SEGMENT_SIZE;
                long j3 = andIncrement / i;
                int i2 = (int) (andIncrement % i);
                if (channelSegment2.id != j3) {
                    ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j3, channelSegment2);
                    if (channelSegmentFindSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = channelSegmentFindSegmentReceive;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                Object objUpdateCellReceive = updateCellReceive(channelSegment, i2, andIncrement, obj);
                if (objUpdateCellReceive != BufferedChannelKt.SUSPEND) {
                    if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                            throw new IllegalStateException("unexpected");
                        }
                        channelSegment.cleanPrev();
                        return ChannelResult.Companion.m339successJP2dKIU(objUpdateCellReceive);
                    }
                    if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                } else {
                    Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                    if (waiter != null) {
                        prepareReceiverForSuspension(waiter, channelSegment, i2);
                    }
                    waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                    channelSegment.onSlotCleaned();
                    return ChannelResult.Companion.m338failurePtdJZtk();
                }
            }
            return ChannelResult.Companion.m337closedJP2dKIU(getCloseCause());
        }
        return ChannelResult.Companion.m338failurePtdJZtk();
    }

    protected final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long j) {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        ChannelSegment channelSegment = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        while (true) {
            long j2 = receivers$volatile$FU.get(this);
            if (j < Math.max(this.capacity + j2, getBufferEndCounter())) {
                return;
            }
            if (receivers$volatile$FU.compareAndSet(this, j2, j2 + 1)) {
                int i = BufferedChannelKt.SEGMENT_SIZE;
                long j3 = j2 / i;
                int i2 = (int) (j2 % i);
                if (channelSegment.id != j3) {
                    ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j3, channelSegment);
                    if (channelSegmentFindSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = channelSegmentFindSegmentReceive;
                    }
                }
                Object objUpdateCellReceive = updateCellReceive(channelSegment, i2, j2, null);
                if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                    channelSegment.cleanPrev();
                    Function1 function1 = this.onUndeliveredElement;
                    if (function1 != null && (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, objUpdateCellReceive, null, 2, null)) != null) {
                        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
                    }
                } else if (j2 < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            }
        }
    }

    public final Object updateCellReceive(ChannelSegment channelSegment, int i, long j, Object obj) {
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if (state$kotlinx_coroutines_core == null) {
            if (j >= (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
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
            return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
        }
        return updateCellReceiveSlow(channelSegment, i, j, obj);
    }

    private final Object updateCellReceiveSlow(ChannelSegment channelSegment, int i, long j, Object obj) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core == null || state$kotlinx_coroutines_core == BufferedChannelKt.IN_BUFFER) {
                if (j < (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED)) {
                        expandBuffer();
                        return BufferedChannelKt.FAILED;
                    }
                } else {
                    if (obj == null) {
                        return BufferedChannelKt.SUSPEND_NO_WAITER;
                    }
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, obj)) {
                        expandBuffer();
                        return BufferedChannelKt.SUSPEND;
                    }
                }
            } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
                    expandBuffer();
                    return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
                }
            } else {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.INTERRUPTED_SEND && state$kotlinx_coroutines_core != BufferedChannelKt.POISONED) {
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.getCHANNEL_CLOSED()) {
                        if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB && channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_RCV)) {
                            boolean z = state$kotlinx_coroutines_core instanceof WaiterEB;
                            if (z) {
                                state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                            }
                            if (tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i)) {
                                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.DONE_RCV);
                                expandBuffer();
                                return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
                            }
                            channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_SEND);
                            channelSegment.onCancelledRequest(i, false);
                            if (z) {
                                expandBuffer();
                            }
                            return BufferedChannelKt.FAILED;
                        }
                    } else {
                        expandBuffer();
                        return BufferedChannelKt.FAILED;
                    }
                }
                return BufferedChannelKt.FAILED;
            }
        }
    }

    private final boolean tryResumeSender(Object obj, ChannelSegment channelSegment, int i) {
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.tryResume0$default((CancellableContinuation) obj, Unit.INSTANCE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final void expandBuffer() {
        if (isRendezvousOrUnlimited()) {
            return;
        }
        ChannelSegment channelSegment = (ChannelSegment) bufferEndSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = bufferEnd$volatile$FU.getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / i;
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (channelSegment.id < j && channelSegment.getNext() != null) {
                    moveSegmentBufferEndToSpecifiedOrLast(j, channelSegment);
                }
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            if (channelSegment.id != j) {
                ChannelSegment channelSegmentFindSegmentBufferEnd = findSegmentBufferEnd(j, channelSegment, andIncrement);
                if (channelSegmentFindSegmentBufferEnd == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentBufferEnd;
                }
            }
            if (updateCellExpandBuffer(channelSegment, (int) (andIncrement % i), andIncrement)) {
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
    }

    private final boolean updateCellExpandBuffer(ChannelSegment channelSegment, int i, long j) {
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if ((state$kotlinx_coroutines_core instanceof Waiter) && j >= receivers$volatile$FU.get(this) && channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
            if (!tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i)) {
                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_SEND);
                channelSegment.onCancelledRequest(i, false);
                return false;
            }
            channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.BUFFERED);
            return true;
        }
        return updateCellExpandBufferSlow(channelSegment, i, j);
    }

    private final boolean updateCellExpandBufferSlow(ChannelSegment channelSegment, int i, long j) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core instanceof Waiter) {
                if (j >= receivers$volatile$FU.get(this)) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
                        if (!tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i)) {
                            channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_SEND);
                            channelSegment.onCancelledRequest(i, false);
                            return false;
                        }
                        channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.BUFFERED);
                        return true;
                    }
                } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, new WaiterEB((Waiter) state$kotlinx_coroutines_core))) {
                    return true;
                }
            } else {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == null) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.IN_BUFFER)) {
                        return true;
                    }
                } else {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED || state$kotlinx_coroutines_core == BufferedChannelKt.POISONED || state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        return true;
                    }
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV) {
                        throw new IllegalStateException(("Unexpected cell state: " + state$kotlinx_coroutines_core).toString());
                    }
                }
            }
        }
    }

    static void incCompletedExpandBufferAttempts$default(BufferedChannel bufferedChannel, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i & 1) != 0) {
            j = 1;
        }
        bufferedChannel.incCompletedExpandBufferAttempts(j);
    }

    private final void incCompletedExpandBufferAttempts(long j) {
        if ((completedExpandBuffersAndPauseFlag$volatile$FU.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((completedExpandBuffersAndPauseFlag$volatile$FU.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long j) {
        long j2;
        long j3;
        if (isRendezvousOrUnlimited()) {
            return;
        }
        while (getBufferEndCounter() <= j) {
        }
        int i = BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
        for (int i2 = 0; i2 < i; i2++) {
            long bufferEndCounter = getBufferEndCounter();
            if (bufferEndCounter == (completedExpandBuffersAndPauseFlag$volatile$FU.get(this) & 4611686018427387903L) && bufferEndCounter == getBufferEndCounter()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$volatile$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, BufferedChannelKt.constructEBCompletedAndPauseFlag(j2 & 4611686018427387903L, true)));
        while (true) {
            long bufferEndCounter2 = getBufferEndCounter();
            long j4 = completedExpandBuffersAndPauseFlag$volatile$FU.get(this);
            long j5 = j4 & 4611686018427387903L;
            boolean z = (4611686018427387904L & j4) != 0;
            if (bufferEndCounter2 == j5 && bufferEndCounter2 == getBufferEndCounter()) {
                break;
            } else if (!z) {
                completedExpandBuffersAndPauseFlag$volatile$FU.compareAndSet(this, j4, BufferedChannelKt.constructEBCompletedAndPauseFlag(j5, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = completedExpandBuffersAndPauseFlag$volatile$FU;
        do {
            j3 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, BufferedChannelKt.constructEBCompletedAndPauseFlag(j3 & 4611686018427387903L, false)));
    }

    protected final Throwable getCloseCause() {
        return (Throwable) _closeCause$volatile$FU.get(this);
    }

    protected final Throwable getSendException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedSendChannelException("Channel was closed") : closeCause;
    }

    private final Throwable getReceiveException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedReceiveChannelException("Channel was closed") : closeCause;
    }

    @Override
    public boolean close(Throwable th) {
        return closeOrCancelImpl(th, false);
    }

    protected boolean closeOrCancelImpl(Throwable th, boolean z) {
        if (z) {
            markCancellationStarted();
        }
        boolean zM = AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_closeCause$volatile$FU, this, BufferedChannelKt.NO_CLOSE_CAUSE, th);
        if (z) {
            markCancelled();
        } else {
            markClosed();
        }
        completeCloseOrCancel();
        onClosedIdempotent();
        if (zM) {
            invokeCloseHandler();
        }
        return zM;
    }

    private final void invokeCloseHandler() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.CLOSE_HANDLER_CLOSED : BufferedChannelKt.CLOSE_HANDLER_INVOKED));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(getCloseCause());
    }

    private final void markClosed() {
        long j;
        long jConstructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                jConstructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(j & 1152921504606846975L, 2);
            } else if (i != 1) {
                return;
            } else {
                jConstructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(j & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, jConstructSendersAndCloseStatus));
    }

    private final void markCancelled() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 3)));
    }

    private final void markCancellationStarted() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 1)));
    }

    private final void completeCloseOrCancel() {
        isClosedForSend();
    }

    private final ChannelSegment completeClose(long j) {
        ChannelSegment channelSegmentCloseLinkedList = closeLinkedList();
        if (isConflatedDropOldest()) {
            long jMarkAllEmptyCellsAsClosed = markAllEmptyCellsAsClosed(channelSegmentCloseLinkedList);
            if (jMarkAllEmptyCellsAsClosed != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(jMarkAllEmptyCellsAsClosed);
            }
        }
        cancelSuspendedReceiveRequests(channelSegmentCloseLinkedList, j);
        return channelSegmentCloseLinkedList;
    }

    private final void completeCancel(long j) {
        removeUnprocessedElements(completeClose(j));
    }

    private final ChannelSegment closeLinkedList() {
        Object obj = bufferEndSegment$volatile$FU.get(this);
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        if (channelSegment.id > ((ChannelSegment) obj).id) {
            obj = channelSegment;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        if (channelSegment2.id > ((ChannelSegment) obj).id) {
            obj = channelSegment2;
        }
        return (ChannelSegment) ConcurrentLinkedListKt.close((ConcurrentLinkedListNode) obj);
    }

    private final long markAllEmptyCellsAsClosed(kotlinx.coroutines.channels.ChannelSegment r9) {
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.markAllEmptyCellsAsClosed(kotlinx.coroutines.channels.ChannelSegment):long");
    }

    private final void removeUnprocessedElements(kotlinx.coroutines.channels.ChannelSegment r13) {
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.removeUnprocessedElements(kotlinx.coroutines.channels.ChannelSegment):void");
    }

    private final void cancelSuspendedReceiveRequests(ChannelSegment channelSegment, long j) {
        Object objM345constructorimpl$default = InlineList.m345constructorimpl$default(null, 1, null);
        loop0: while (channelSegment != null) {
            for (int i = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i; i--) {
                if ((channelSegment.id * BufferedChannelKt.SEGMENT_SIZE) + i < j) {
                    break loop0;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core == null || state$kotlinx_coroutines_core == BufferedChannelKt.IN_BUFFER) {
                        if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            channelSegment.onSlotCleaned();
                            break;
                        }
                    } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                        if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            objM345constructorimpl$default = InlineList.m346plusFjFbRPM(objM345constructorimpl$default, ((WaiterEB) state$kotlinx_coroutines_core).waiter);
                            channelSegment.onCancelledRequest(i, true);
                            break;
                        }
                    } else {
                        if (!(state$kotlinx_coroutines_core instanceof Waiter)) {
                            break;
                        }
                        if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            objM345constructorimpl$default = InlineList.m346plusFjFbRPM(objM345constructorimpl$default, state$kotlinx_coroutines_core);
                            channelSegment.onCancelledRequest(i, true);
                            break;
                        }
                    }
                }
            }
            channelSegment = (ChannelSegment) channelSegment.getPrev();
        }
        if (objM345constructorimpl$default != null) {
            if (objM345constructorimpl$default instanceof ArrayList) {
                Intrinsics.checkNotNull(objM345constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                ArrayList arrayList = (ArrayList) objM345constructorimpl$default;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    resumeReceiverOnClosedChannel((Waiter) arrayList.get(size));
                }
                return;
            }
            resumeReceiverOnClosedChannel((Waiter) objM345constructorimpl$default);
        }
    }

    private final void resumeReceiverOnClosedChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, true);
    }

    private final void resumeSenderOnCancelledChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, false);
    }

    private final void resumeWaiterOnClosedChannel(Waiter waiter, boolean z) {
        if (waiter instanceof CancellableContinuation) {
            Continuation continuation = (Continuation) waiter;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m290constructorimpl(ResultKt.createFailure(z ? getReceiveException() : getSendException())));
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
        }
    }

    public boolean isClosedForSend() {
        return isClosedForSend0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    public final boolean isClosedForSend0(long j) {
        return isClosed(j, false);
    }

    public boolean isClosedForReceive() {
        return isClosedForReceive0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    private final boolean isClosedForReceive0(long j) {
        return isClosed(j, true);
    }

    private final boolean isClosed(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            completeClose(j & 1152921504606846975L);
            if (z && hasElements$kotlinx_coroutines_core()) {
                return false;
            }
        } else if (i == 3) {
            completeCancel(j & 1152921504606846975L);
        } else {
            throw new IllegalStateException(("unexpected close status: " + i).toString());
        }
        return true;
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            ChannelSegment channelSegmentFindSegmentReceive = (ChannelSegment) receiveSegment$volatile$FU.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = receiversCounter$kotlinx_coroutines_core / i;
            if (channelSegmentFindSegmentReceive.id == j || (channelSegmentFindSegmentReceive = findSegmentReceive(j, channelSegmentFindSegmentReceive)) != null) {
                channelSegmentFindSegmentReceive.cleanPrev();
                if (isCellNonEmpty(channelSegmentFindSegmentReceive, (int) (receiversCounter$kotlinx_coroutines_core % i), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                receivers$volatile$FU.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, 1 + receiversCounter$kotlinx_coroutines_core);
            } else if (((ChannelSegment) receiveSegment$volatile$FU.get(this)).id < j) {
                return false;
            }
        }
    }

    private final boolean isCellNonEmpty(ChannelSegment channelSegment, int i, long j) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                    return true;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED() || state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.RESUMING_BY_EB) {
                    return true;
                }
                return state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV && j == getReceiversCounter$kotlinx_coroutines_core();
            }
        } while (!channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED));
        expandBuffer();
        return false;
    }

    public final ChannelSegment findSegmentSend(long j, ChannelSegment channelSegment) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$volatile$FU;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, function2);
            if (!SegmentOrClosed.m349isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM348getSegmentimpl = SegmentOrClosed.m348getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM348getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM348getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, segmentM348getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (segmentM348getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM348getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m349isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (channelSegment.id * BufferedChannelKt.SEGMENT_SIZE >= getReceiversCounter$kotlinx_coroutines_core()) {
                return null;
            }
            channelSegment.cleanPrev();
            return null;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) SegmentOrClosed.m348getSegmentimpl(objFindSegmentInternal);
        long j2 = channelSegment2.id;
        if (j2 <= j) {
            return channelSegment2;
        }
        int i = BufferedChannelKt.SEGMENT_SIZE;
        updateSendersCounterIfLower(j2 * i);
        if (channelSegment2.id * i >= getReceiversCounter$kotlinx_coroutines_core()) {
            return null;
        }
        channelSegment2.cleanPrev();
        return null;
    }

    public final ChannelSegment findSegmentReceive(long j, ChannelSegment channelSegment) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$volatile$FU;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, function2);
            if (!SegmentOrClosed.m349isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM348getSegmentimpl = SegmentOrClosed.m348getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM348getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM348getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, segmentM348getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (segmentM348getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM348getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m349isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (channelSegment.id * BufferedChannelKt.SEGMENT_SIZE >= getSendersCounter$kotlinx_coroutines_core()) {
                return null;
            }
            channelSegment.cleanPrev();
            return null;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) SegmentOrClosed.m348getSegmentimpl(objFindSegmentInternal);
        if (!isRendezvousOrUnlimited() && j <= getBufferEndCounter() / BufferedChannelKt.SEGMENT_SIZE) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bufferEndSegment$volatile$FU;
            while (true) {
                Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                if (segment2.id >= channelSegment2.id || !channelSegment2.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, segment2, channelSegment2)) {
                    if (segment2.decPointers$kotlinx_coroutines_core()) {
                        segment2.remove();
                    }
                } else if (channelSegment2.decPointers$kotlinx_coroutines_core()) {
                    channelSegment2.remove();
                }
            }
        }
        long j2 = channelSegment2.id;
        if (j2 <= j) {
            return channelSegment2;
        }
        int i = BufferedChannelKt.SEGMENT_SIZE;
        updateReceiversCounterIfLower(j2 * i);
        if (channelSegment2.id * i >= getSendersCounter$kotlinx_coroutines_core()) {
            return null;
        }
        channelSegment2.cleanPrev();
        return null;
    }

    private final ChannelSegment findSegmentBufferEnd(long j, ChannelSegment channelSegment, long j2) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, function2);
            if (!SegmentOrClosed.m349isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM348getSegmentimpl = SegmentOrClosed.m348getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM348getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM348getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, segmentM348getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (segmentM348getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM348getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m349isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            moveSegmentBufferEndToSpecifiedOrLast(j, channelSegment);
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
            return null;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) SegmentOrClosed.m348getSegmentimpl(objFindSegmentInternal);
        if (channelSegment2.id <= j) {
            return channelSegment2;
        }
        long j3 = channelSegment2.id;
        int i = BufferedChannelKt.SEGMENT_SIZE;
        if (bufferEnd$volatile$FU.compareAndSet(this, j2 + 1, j3 * i)) {
            incCompletedExpandBufferAttempts((channelSegment2.id * i) - j2);
            return null;
        }
        incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        return null;
    }

    private final void moveSegmentBufferEndToSpecifiedOrLast(long r6, kotlinx.coroutines.channels.ChannelSegment r8) {
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.moveSegmentBufferEndToSpecifiedOrLast(long, kotlinx.coroutines.channels.ChannelSegment):void");
    }

    private final void updateSendersCounterIfLower(long j) {
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            j3 = 1152921504606846975L & j2;
            if (j3 >= j) {
                return;
            }
        } while (!sendersAndCloseStatus$volatile$FU.compareAndSet(this, j2, BufferedChannelKt.constructSendersAndCloseStatus(j3, (int) (j2 >> 60))));
    }

    private final void updateReceiversCounterIfLower(long j) {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j) {
                return;
            }
        } while (!receivers$volatile$FU.compareAndSet(this, j2, j));
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toString():java.lang.String");
    }
}
