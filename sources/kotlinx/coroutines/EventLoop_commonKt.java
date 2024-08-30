package kotlinx.coroutines;

import kotlinx.coroutines.internal.Symbol;

public abstract class EventLoop_commonKt {
    private static final Symbol DISPOSED_TASK = new Symbol("REMOVED_TASK");
    private static final Symbol CLOSED_EMPTY = new Symbol("CLOSED_EMPTY");
}
