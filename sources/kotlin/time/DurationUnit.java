package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.enums.EnumEntriesKt;

public final class DurationUnit {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);

    public final TimeUnit timeUnit;

    static {
        EnumEntriesKt.enumEntries(durationUnitArr);
    }

    public DurationUnit(TimeUnit timeUnit) {
        super(str, i);
        this.timeUnit = timeUnit;
    }

    public static DurationUnit valueOf(String str) {
        return (DurationUnit) Enum.valueOf(DurationUnit.class, str);
    }

    public static DurationUnit[] values() {
        return (DurationUnit[]) $VALUES.clone();
    }
}
