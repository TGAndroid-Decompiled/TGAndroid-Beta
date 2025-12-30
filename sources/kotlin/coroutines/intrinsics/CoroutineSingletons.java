package kotlin.coroutines.intrinsics;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

public final class CoroutineSingletons {
    private static final EnumEntries $ENTRIES;
    private static final CoroutineSingletons[] $VALUES;
    public static final CoroutineSingletons COROUTINE_SUSPENDED = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
    public static final CoroutineSingletons UNDECIDED = new CoroutineSingletons("UNDECIDED", 1);
    public static final CoroutineSingletons RESUMED = new CoroutineSingletons("RESUMED", 2);

    private static final CoroutineSingletons[] $values() {
        return new CoroutineSingletons[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    private CoroutineSingletons(String str, int i) {
    }

    static {
        CoroutineSingletons[] coroutineSingletonsArr$values = $values();
        $VALUES = coroutineSingletonsArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(coroutineSingletonsArr$values);
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) $VALUES.clone();
    }
}
