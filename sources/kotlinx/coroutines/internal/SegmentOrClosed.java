package kotlinx.coroutines.internal;

import kotlin.jvm.internal.Intrinsics;

public abstract class SegmentOrClosed {
    public static Object m364constructorimpl(Object obj) {
        return obj;
    }

    public static final boolean m366isClosedimpl(Object obj) {
        return obj == ConcurrentLinkedListKt.CLOSED;
    }

    public static final Segment m365getSegmentimpl(Object obj) {
        if (obj == ConcurrentLinkedListKt.CLOSED) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (Segment) obj;
    }
}
