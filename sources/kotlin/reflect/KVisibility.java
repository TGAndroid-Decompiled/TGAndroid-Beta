package kotlin.reflect;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

public final class KVisibility {
    private static final EnumEntries $ENTRIES;
    private static final KVisibility[] $VALUES;
    public static final KVisibility PUBLIC = new KVisibility("PUBLIC", 0);
    public static final KVisibility PROTECTED = new KVisibility("PROTECTED", 1);
    public static final KVisibility INTERNAL = new KVisibility("INTERNAL", 2);
    public static final KVisibility PRIVATE = new KVisibility("PRIVATE", 3);

    private static final KVisibility[] $values() {
        return new KVisibility[]{PUBLIC, PROTECTED, INTERNAL, PRIVATE};
    }

    private KVisibility(String str, int i) {
    }

    static {
        KVisibility[] kVisibilityArr$values = $values();
        $VALUES = kVisibilityArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(kVisibilityArr$values);
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) $VALUES.clone();
    }
}
