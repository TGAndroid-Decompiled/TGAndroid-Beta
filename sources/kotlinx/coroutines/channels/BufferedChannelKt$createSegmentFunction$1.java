package kotlinx.coroutines.channels;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements Function2 {
    public static final BufferedChannelKt$createSegmentFunction$1 INSTANCE = new BufferedChannelKt$createSegmentFunction$1();

    BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override
    public Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (ChannelSegment) obj2);
    }

    public final ChannelSegment invoke(long j, ChannelSegment channelSegment) {
        ChannelSegment createSegment;
        createSegment = BufferedChannelKt.createSegment(j, channelSegment);
        return createSegment;
    }
}
