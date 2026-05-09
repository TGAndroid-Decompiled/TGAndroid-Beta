package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
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

    @Override
    protected boolean isConflatedDropOldest() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    @Override
    public Object mo347trySendJP2dKIU(Object obj) {
        return m358trySendImplMj0NB7M(obj, false);
    }

    private final Object m358trySendImplMj0NB7M(Object obj, boolean z) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m357trySendDropLatestMj0NB7M(obj, z) : m348trySendDropOldestJP2dKIU(obj);
    }

    private final Object m357trySendDropLatestMj0NB7M(Object obj, boolean z) {
        Function1 function1;
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        Object objMo347trySendJP2dKIU = super.mo347trySendJP2dKIU(obj);
        if (ChannelResult.m353isSuccessimpl(objMo347trySendJP2dKIU) || ChannelResult.m352isClosedimpl(objMo347trySendJP2dKIU)) {
            return objMo347trySendJP2dKIU;
        }
        if (z && (function1 = this.onUndeliveredElement) != null && (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, obj, null, 2, null)) != null) {
            throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        }
        return ChannelResult.Companion.m356successJP2dKIU(Unit.INSTANCE);
    }
}
