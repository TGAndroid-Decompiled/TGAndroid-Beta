package kotlinx.coroutines.channels;

import kotlin.enums.EnumEntriesKt;

public final class BufferOverflow {
    public static final BufferOverflow[] $VALUES;

    BufferOverflow EF7;

    static {
        BufferOverflow[] bufferOverflowArr = {new BufferOverflow("SUSPEND", 0), new BufferOverflow("DROP_OLDEST", 1), new BufferOverflow("DROP_LATEST", 2)};
        $VALUES = bufferOverflowArr;
        EnumEntriesKt.enumEntries(bufferOverflowArr);
    }

    public static BufferOverflow valueOf(String str) {
        return (BufferOverflow) Enum.valueOf(BufferOverflow.class, str);
    }

    public static BufferOverflow[] values() {
        return (BufferOverflow[]) $VALUES.clone();
    }
}
