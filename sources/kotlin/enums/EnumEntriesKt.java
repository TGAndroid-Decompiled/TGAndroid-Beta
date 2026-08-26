package kotlin.enums;

import kotlin.jvm.internal.Intrinsics;

public abstract class EnumEntriesKt {
    public static final EnumEntriesList enumEntries(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new EnumEntriesList(entries);
    }
}
