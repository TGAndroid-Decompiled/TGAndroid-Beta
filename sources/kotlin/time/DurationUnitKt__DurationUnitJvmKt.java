package kotlin.time;

import kotlin.jvm.internal.Intrinsics;

public abstract class DurationUnitKt__DurationUnitJvmKt {
    public static final long convertDurationUnitOverflow(long j, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.timeUnit.convert(j, sourceUnit.timeUnit);
    }
}
