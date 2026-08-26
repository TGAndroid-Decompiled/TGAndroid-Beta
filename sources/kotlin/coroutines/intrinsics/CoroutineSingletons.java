package kotlin.coroutines.intrinsics;

import kotlin.enums.EnumEntriesKt;

public final class CoroutineSingletons {
    public static final CoroutineSingletons[] $VALUES;
    public static final CoroutineSingletons COROUTINE_SUSPENDED;

    static {
        CoroutineSingletons coroutineSingletons = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
        COROUTINE_SUSPENDED = coroutineSingletons;
        CoroutineSingletons[] coroutineSingletonsArr = {coroutineSingletons, new CoroutineSingletons("UNDECIDED", 1), new CoroutineSingletons("RESUMED", 2)};
        $VALUES = coroutineSingletonsArr;
        EnumEntriesKt.enumEntries(coroutineSingletonsArr);
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) $VALUES.clone();
    }
}
