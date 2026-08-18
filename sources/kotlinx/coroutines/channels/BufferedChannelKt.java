package kotlinx.coroutines.channels;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;

public abstract class BufferedChannelKt {
    private static final ChannelSegment NULL_SEGMENT = new ChannelSegment(-1, null, null, 0);
    public static final int SEGMENT_SIZE = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);
    private static final int EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);
    public static final Symbol BUFFERED = new Symbol("BUFFERED");
    private static final Symbol IN_BUFFER = new Symbol("SHOULD_BUFFER");
    private static final Symbol RESUMING_BY_RCV = new Symbol("S_RESUMING_BY_RCV");
    private static final Symbol RESUMING_BY_EB = new Symbol("RESUMING_BY_EB");
    private static final Symbol POISONED = new Symbol("POISONED");
    private static final Symbol DONE_RCV = new Symbol("DONE_RCV");
    private static final Symbol INTERRUPTED_SEND = new Symbol("INTERRUPTED_SEND");
    private static final Symbol INTERRUPTED_RCV = new Symbol("INTERRUPTED_RCV");
    private static final Symbol CHANNEL_CLOSED = new Symbol("CHANNEL_CLOSED");
    private static final Symbol SUSPEND = new Symbol("SUSPEND");
    private static final Symbol SUSPEND_NO_WAITER = new Symbol("SUSPEND_NO_WAITER");
    private static final Symbol FAILED = new Symbol("FAILED");
    private static final Symbol NO_RECEIVE_RESULT = new Symbol("NO_RECEIVE_RESULT");
    private static final Symbol CLOSE_HANDLER_CLOSED = new Symbol("CLOSE_HANDLER_CLOSED");
    private static final Symbol CLOSE_HANDLER_INVOKED = new Symbol("CLOSE_HANDLER_INVOKED");
    private static final Symbol NO_CLOSE_CAUSE = new Symbol("NO_CLOSE_CAUSE");

    public static final long constructEBCompletedAndPauseFlag(long j, boolean z) {
        return (z ? 4611686018427387904L : 0L) + j;
    }

    public static final long constructSendersAndCloseStatus(long j, int i) {
        return (((long) i) << 60) + j;
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

    class AnonymousClass1 extends FunctionReferenceImpl implements Function2 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).longValue(), (ChannelSegment) obj2);
        }

        public final ChannelSegment invoke(long j, ChannelSegment channelSegment) {
            return BufferedChannelKt.createSegment(j, channelSegment);
        }
    }

    public static final KFunction createSegmentFunction() {
        return AnonymousClass1.INSTANCE;
    }

    public static final ChannelSegment createSegment(long j, ChannelSegment channelSegment) {
        return new ChannelSegment(j, channelSegment, channelSegment.getChannel(), 0);
    }

    static boolean tryResume0$default(CancellableContinuation cancellableContinuation, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return tryResume0(cancellableContinuation, obj, function1);
    }

    public static final boolean tryResume0(CancellableContinuation cancellableContinuation, Object obj, Function1 function1) {
        Object objTryResume = cancellableContinuation.tryResume(obj, null, function1);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    public static final Symbol getCHANNEL_CLOSED() {
        return CHANNEL_CLOSED;
    }
}
