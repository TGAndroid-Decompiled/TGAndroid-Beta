package kotlinx.coroutines.internal;

import kotlin.jvm.functions.Function2;

public abstract class ConcurrentLinkedListKt {
    private static final Symbol CLOSED = new Symbol("CLOSED");

    public static final Object findSegmentInternal(Segment segment, long j, Function2 function2) {
        while (true) {
            if (segment.id >= j && !segment.isRemoved()) {
                return SegmentOrClosed.m347constructorimpl(segment);
            }
            Object nextOrClosed = segment.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return SegmentOrClosed.m347constructorimpl(CLOSED);
            }
            Segment segment2 = (Segment) ((ConcurrentLinkedListNode) nextOrClosed);
            if (segment2 == null) {
                segment2 = (Segment) function2.invoke(Long.valueOf(segment.id + 1), segment);
                if (segment.trySetNext(segment2)) {
                    if (segment.isRemoved()) {
                        segment.remove();
                    }
                }
            }
            segment = segment2;
        }
    }

    public static final ConcurrentLinkedListNode close(ConcurrentLinkedListNode concurrentLinkedListNode) {
        while (true) {
            Object nextOrClosed = concurrentLinkedListNode.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return concurrentLinkedListNode;
            }
            ConcurrentLinkedListNode concurrentLinkedListNode2 = (ConcurrentLinkedListNode) nextOrClosed;
            if (concurrentLinkedListNode2 != null) {
                concurrentLinkedListNode = concurrentLinkedListNode2;
            } else if (concurrentLinkedListNode.markAsClosed()) {
                return concurrentLinkedListNode;
            }
        }
    }
}
