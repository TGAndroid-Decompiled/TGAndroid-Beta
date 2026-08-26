package kotlin.time;

import kotlin.jvm.internal.Intrinsics;

public abstract class DurationKt {
    public static final long toDuration(int i, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (unit.compareTo(DurationUnit.SECONDS) <= 0) {
            long jConvertDurationUnitOverflow = DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(i, unit, DurationUnit.NANOSECONDS) << 1;
            int i2 = Duration.$r8$clinit;
            int i3 = DurationJvmKt.$r8$clinit;
            return jConvertDurationUnitOverflow;
        }
        long j = i;
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long jConvertDurationUnitOverflow2 = DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(4611686018426999999L, durationUnit, unit);
        if ((-jConvertDurationUnitOverflow2) <= j && j <= jConvertDurationUnitOverflow2) {
            long jConvertDurationUnitOverflow3 = DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(j, unit, durationUnit) << 1;
            int i4 = Duration.$r8$clinit;
            int i5 = DurationJvmKt.$r8$clinit;
            return jConvertDurationUnitOverflow3;
        }
        DurationUnit targetUnit = DurationUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long jConvert = targetUnit.timeUnit.convert(j, unit.timeUnit);
        long j2 = -4611686018427387903L;
        if (jConvert < -4611686018427387903L) {
            jConvert = j2;
        } else {
            j2 = 4611686018427387903L;
            if (jConvert > 4611686018427387903L) {
                jConvert = j2;
            }
        }
        long j3 = (jConvert << 1) + 1;
        int i6 = Duration.$r8$clinit;
        int i7 = DurationJvmKt.$r8$clinit;
        return j3;
    }
}
