package kotlinx.coroutines.channels;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;

public abstract class BufferedChannelKt {
    public static final Symbol BUFFERED;
    private static final Symbol CHANNEL_CLOSED;
    private static final Symbol CLOSE_HANDLER_CLOSED;
    private static final Symbol CLOSE_HANDLER_INVOKED;
    private static final Symbol DONE_RCV;
    private static final int EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
    private static final Symbol FAILED;
    private static final Symbol INTERRUPTED_RCV;
    private static final Symbol INTERRUPTED_SEND;
    private static final Symbol IN_BUFFER;
    private static final Symbol NO_CLOSE_CAUSE;
    private static final Symbol NO_RECEIVE_RESULT;
    private static final ChannelSegment NULL_SEGMENT = new ChannelSegment(-1, null, null, 0);
    private static final Symbol POISONED;
    private static final Symbol RESUMING_BY_EB;
    private static final Symbol RESUMING_BY_RCV;
    public static final int SEGMENT_SIZE;
    private static final Symbol SUSPEND;
    private static final Symbol SUSPEND_NO_WAITER;

    static {
        int systemProp$default;
        int systemProp$default2;
        systemProp$default = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);
        SEGMENT_SIZE = systemProp$default;
        systemProp$default2 = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);
        EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS = systemProp$default2;
        BUFFERED = new Symbol("BUFFERED");
        IN_BUFFER = new Symbol("SHOULD_BUFFER");
        RESUMING_BY_RCV = new Symbol("S_RESUMING_BY_RCV");
        RESUMING_BY_EB = new Symbol("RESUMING_BY_EB");
        POISONED = new Symbol("POISONED");
        DONE_RCV = new Symbol("DONE_RCV");
        INTERRUPTED_SEND = new Symbol("INTERRUPTED_SEND");
        INTERRUPTED_RCV = new Symbol("INTERRUPTED_RCV");
        CHANNEL_CLOSED = new Symbol("CHANNEL_CLOSED");
        SUSPEND = new Symbol("SUSPEND");
        SUSPEND_NO_WAITER = new Symbol("SUSPEND_NO_WAITER");
        FAILED = new Symbol("FAILED");
        NO_RECEIVE_RESULT = new Symbol("NO_RECEIVE_RESULT");
        CLOSE_HANDLER_CLOSED = new Symbol("CLOSE_HANDLER_CLOSED");
        CLOSE_HANDLER_INVOKED = new Symbol("CLOSE_HANDLER_INVOKED");
        NO_CLOSE_CAUSE = new Symbol("NO_CLOSE_CAUSE");
    }

    public static final long constructEBCompletedAndPauseFlag(long j, boolean z) {
        return (z ? 4611686018427387904L : 0L) + j;
    }

    public static final long constructSendersAndCloseStatus(long j, int i) {
        return (i << 60) + j;
    }

    public static final ChannelSegment createSegment(long j, ChannelSegment channelSegment) {
        return new ChannelSegment(j, channelSegment, channelSegment.getChannel(), 0);
    }

    public static final KFunction createSegmentFunction() {
        return BufferedChannelKt$createSegmentFunction$1.INSTANCE;
    }

    public static final Symbol getCHANNEL_CLOSED() {
        return CHANNEL_CLOSED;
    }

    public static final long initialBufferEnd(int i) {
        if (i == 0) {
            return 0L;
        }
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        return Long.MAX_VALUE;
    }

    public static final boolean tryResume0(CancellableContinuation cancellableContinuation, Object obj, Function1 function1) {
        Object tryResume = cancellableContinuation.tryResume(obj, null, function1);
        if (tryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(tryResume);
        return true;
    }

    public static boolean tryResume0$default(CancellableContinuation cancellableContinuation, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return tryResume0(cancellableContinuation, obj, function1);
    }
}
