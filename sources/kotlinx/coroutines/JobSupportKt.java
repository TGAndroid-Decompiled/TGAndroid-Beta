package kotlinx.coroutines;

import kotlinx.coroutines.internal.Symbol;

public final class JobSupportKt {
    private static final Empty EMPTY_ACTIVE;
    private static final Symbol COMPLETING_ALREADY = new Symbol("COMPLETING_ALREADY");
    public static final Symbol COMPLETING_WAITING_CHILDREN = new Symbol("COMPLETING_WAITING_CHILDREN");
    private static final Symbol COMPLETING_RETRY = new Symbol("COMPLETING_RETRY");
    private static final Symbol TOO_LATE_TO_CANCEL = new Symbol("TOO_LATE_TO_CANCEL");
    private static final Symbol SEALED = new Symbol("SEALED");

    public static final Object boxIncomplete(Object obj) {
        return obj instanceof Incomplete ? new IncompleteStateBox((Incomplete) obj) : obj;
    }

    static {
        new Empty(false);
        EMPTY_ACTIVE = new Empty(true);
    }
}
