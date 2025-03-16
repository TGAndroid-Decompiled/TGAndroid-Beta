package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;

public class ConflatedBufferedChannel extends BufferedChannel {
    private final int capacity;
    private final BufferOverflow onBufferOverflow;

    public ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, Function1 function1) {
        super(i, function1);
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(BufferedChannel.class).getSimpleName() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    private final Object m257trySendDropLatestMj0NB7M(Object obj, boolean z) {
        Function1 function1;
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object mo248trySendJP2dKIU = super.mo248trySendJP2dKIU(obj);
        if (ChannelResult.m253isSuccessimpl(mo248trySendJP2dKIU) || ChannelResult.m252isClosedimpl(mo248trySendJP2dKIU)) {
            return mo248trySendJP2dKIU;
        }
        if (!z || (function1 = this.onUndeliveredElement) == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, obj, null, 2, null)) == null) {
            return ChannelResult.Companion.m256successJP2dKIU(Unit.INSTANCE);
        }
        throw callUndeliveredElementCatchingException$default;
    }

    private final Object m258trySendDropOldestJP2dKIU(Object obj) {
        ChannelSegment channelSegment;
        Object obj2 = BufferedChannelKt.BUFFERED;
        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.sendSegment$FU.get(this);
        while (true) {
            long andIncrement = BufferedChannel.sendersAndCloseStatus$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / i;
            int i2 = (int) (j % i);
            if (channelSegment2.id != j2) {
                ChannelSegment findSegmentSend = findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    return ChannelResult.Companion.m254closedJP2dKIU(getSendException());
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = updateCellSend(channelSegment, i2, obj, j, obj2, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                return ChannelResult.Companion.m256successJP2dKIU(Unit.INSTANCE);
            }
            if (updateCellSend == 1) {
                return ChannelResult.Companion.m256successJP2dKIU(Unit.INSTANCE);
            }
            if (updateCellSend == 2) {
                if (isClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return ChannelResult.Companion.m254closedJP2dKIU(getSendException());
                }
                Waiter waiter = obj2 instanceof Waiter ? (Waiter) obj2 : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i2);
                }
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment.id * i) + i2);
                return ChannelResult.Companion.m256successJP2dKIU(Unit.INSTANCE);
            }
            if (updateCellSend == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (updateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return ChannelResult.Companion.m254closedJP2dKIU(getSendException());
            }
            if (updateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
    }

    private final Object m259trySendImplMj0NB7M(Object obj, boolean z) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m257trySendDropLatestMj0NB7M(obj, z) : m258trySendDropOldestJP2dKIU(obj);
    }

    @Override
    protected boolean isConflatedDropOldest() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    @Override
    public Object mo248trySendJP2dKIU(Object obj) {
        return m259trySendImplMj0NB7M(obj, false);
    }
}
