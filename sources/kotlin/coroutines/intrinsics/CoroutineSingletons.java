package kotlin.coroutines.intrinsics;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

public enum CoroutineSingletons {
    COROUTINE_SUSPENDED,
    UNDECIDED,
    RESUMED;

    private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
}
