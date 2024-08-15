package kotlinx.coroutines.internal;
public final class LockFreeLinkedListKt {
    private static final Object CONDITION_FALSE = new Symbol("CONDITION_FALSE");
    private static final Object LIST_EMPTY = new Symbol("LIST_EMPTY");

    public static final Object getCONDITION_FALSE() {
        return CONDITION_FALSE;
    }

    public static final LockFreeLinkedListNode unwrap(Object obj) {
        Removed removed = obj instanceof Removed ? (Removed) obj : null;
        LockFreeLinkedListNode lockFreeLinkedListNode = removed != null ? removed.ref : null;
        return lockFreeLinkedListNode == null ? (LockFreeLinkedListNode) obj : lockFreeLinkedListNode;
    }
}
