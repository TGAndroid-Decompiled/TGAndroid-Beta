package kotlinx.coroutines.channels;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

public enum BufferOverflow {
    SUSPEND,
    DROP_OLDEST,
    DROP_LATEST;

    private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
}
