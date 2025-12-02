package kotlinx.coroutines.internal;

public abstract class LockFreeLinkedListKt {
    private static final Object CONDITION_FALSE = new Symbol("CONDITION_FALSE");

    public static final Object getCONDITION_FALSE() {
        return CONDITION_FALSE;
    }
}
