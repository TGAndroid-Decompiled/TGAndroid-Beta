package kotlinx.coroutines;

import kotlin.enums.EnumEntriesKt;

public final class CoroutineStart {
    public static final CoroutineStart[] $VALUES;
    public static final CoroutineStart DEFAULT;

    static {
        CoroutineStart coroutineStart = new CoroutineStart("DEFAULT", 0);
        DEFAULT = coroutineStart;
        CoroutineStart[] coroutineStartArr = {coroutineStart, new CoroutineStart("LAZY", 1), new CoroutineStart("ATOMIC", 2), new CoroutineStart("UNDISPATCHED", 3)};
        $VALUES = coroutineStartArr;
        EnumEntriesKt.enumEntries(coroutineStartArr);
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) $VALUES.clone();
    }
}
