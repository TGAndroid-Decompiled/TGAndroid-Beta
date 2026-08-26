package kotlin.reflect;

import kotlin.enums.EnumEntriesKt;

public final class KVisibility {
    public static final KVisibility[] $VALUES;

    KVisibility EF8;

    static {
        KVisibility[] kVisibilityArr = {new KVisibility("PUBLIC", 0), new KVisibility("PROTECTED", 1), new KVisibility("INTERNAL", 2), new KVisibility("PRIVATE", 3)};
        $VALUES = kVisibilityArr;
        EnumEntriesKt.enumEntries(kVisibilityArr);
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) $VALUES.clone();
    }
}
