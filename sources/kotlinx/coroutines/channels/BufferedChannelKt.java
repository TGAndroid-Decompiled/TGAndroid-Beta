package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.Symbol;

public abstract class BufferedChannelKt {
    public static final ChannelSegment NULL_SEGMENT = new ChannelSegment(-1, null, null, 0);
    public static final int SEGMENT_SIZE = AtomicKt.systemProp$default(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS = AtomicKt.systemProp$default(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final Symbol BUFFERED = new Symbol("BUFFERED", 0);
    public static final Symbol IN_BUFFER = new Symbol("SHOULD_BUFFER", 0);
    public static final Symbol RESUMING_BY_RCV = new Symbol("S_RESUMING_BY_RCV", 0);
    public static final Symbol RESUMING_BY_EB = new Symbol("RESUMING_BY_EB", 0);
    public static final Symbol POISONED = new Symbol("POISONED", 0);
    public static final Symbol DONE_RCV = new Symbol("DONE_RCV", 0);
    public static final Symbol INTERRUPTED_SEND = new Symbol("INTERRUPTED_SEND", 0);
    public static final Symbol INTERRUPTED_RCV = new Symbol("INTERRUPTED_RCV", 0);
    public static final Symbol CHANNEL_CLOSED = new Symbol("CHANNEL_CLOSED", 0);
    public static final Symbol SUSPEND = new Symbol("SUSPEND", 0);
    public static final Symbol SUSPEND_NO_WAITER = new Symbol("SUSPEND_NO_WAITER", 0);
    public static final Symbol FAILED = new Symbol("FAILED", 0);
    public static final Symbol CLOSE_HANDLER_CLOSED = new Symbol("CLOSE_HANDLER_CLOSED", 0);
    public static final Symbol CLOSE_HANDLER_INVOKED = new Symbol("CLOSE_HANDLER_INVOKED", 0);
    public static final Symbol NO_CLOSE_CAUSE = new Symbol("NO_CLOSE_CAUSE", 0);
}
