package kotlin.time;

import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.LongRange;
import kotlin.text.StringsKt;

public final class Duration implements Comparable {
    private static final long INFINITE;
    private static final long NEG_INFINITE;
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m229constructorimpl(0);

    public static final Duration m227boximpl(long j) {
        return new Duration(j);
    }

    public static boolean m230equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m254unboximpl();
    }

    private static final long m242getValueimpl(long j) {
        return j >> 1;
    }

    public static int m243hashCodeimpl(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    private static final boolean m245isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean m246isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean m248isNegativeimpl(long j) {
        return j < 0;
    }

    public static final boolean m249isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(Object obj) {
        return m230equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m243hashCodeimpl(this.rawValue);
    }

    public final long m254unboximpl() {
        return this.rawValue;
    }

    @Override
    public int compareTo(Object obj) {
        return m253compareToLRDsOJo(((Duration) obj).m254unboximpl());
    }

    private Duration(long j) {
        this.rawValue = j;
    }

    private static final DurationUnit m241getStorageUnitimpl(long j) {
        return m246isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static long m229constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m246isInNanosimpl(j)) {
                if (!new LongRange(-4611686018426999999L, 4611686018426999999L).contains(m242getValueimpl(j))) {
                    throw new AssertionError(m242getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new LongRange(-4611686018427387903L, 4611686018427387903L).contains(m242getValueimpl(j))) {
                    throw new AssertionError(m242getValueimpl(j) + " ms is out of milliseconds range");
                }
                if (new LongRange(-4611686018426L, 4611686018426L).contains(m242getValueimpl(j))) {
                    throw new AssertionError(m242getValueimpl(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        long durationOfMillis;
        long durationOfMillis2;
        durationOfMillis = DurationKt.durationOfMillis(4611686018427387903L);
        INFINITE = durationOfMillis;
        durationOfMillis2 = DurationKt.durationOfMillis(-4611686018427387903L);
        NEG_INFINITE = durationOfMillis2;
    }

    public static final long m252unaryMinusUwyO8pc(long j) {
        long durationOf;
        durationOf = DurationKt.durationOf(-m242getValueimpl(j), ((int) j) & 1);
        return durationOf;
    }

    public static final boolean m247isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final boolean m244isFiniteimpl(long j) {
        return !m247isInfiniteimpl(j);
    }

    public static final long m231getAbsoluteValueUwyO8pc(long j) {
        return m248isNegativeimpl(j) ? m252unaryMinusUwyO8pc(j) : j;
    }

    public int m253compareToLRDsOJo(long j) {
        return m228compareToLRDsOJo(this.rawValue, j);
    }

    public static int m228compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m248isNegativeimpl(j) ? -i : i;
    }

    public static final int m232getHoursComponentimpl(long j) {
        if (m247isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m234getInWholeHoursimpl(j) % 24);
    }

    public static final int m238getMinutesComponentimpl(long j) {
        if (m247isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m236getInWholeMinutesimpl(j) % 60);
    }

    public static final int m240getSecondsComponentimpl(long j) {
        if (m247isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m237getInWholeSecondsimpl(j) % 60);
    }

    public static final int m239getNanosecondsComponentimpl(long j) {
        long m242getValueimpl;
        if (m247isInfiniteimpl(j)) {
            return 0;
        }
        if (m245isInMillisimpl(j)) {
            m242getValueimpl = DurationKt.millisToNanos(m242getValueimpl(j) % 1000);
        } else {
            m242getValueimpl = m242getValueimpl(j) % 1000000000;
        }
        return (int) m242getValueimpl;
    }

    public static final long m250toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m242getValueimpl(j), m241getStorageUnitimpl(j), unit);
    }

    public static final long m233getInWholeDaysimpl(long j) {
        return m250toLongimpl(j, DurationUnit.DAYS);
    }

    public static final long m234getInWholeHoursimpl(long j) {
        return m250toLongimpl(j, DurationUnit.HOURS);
    }

    public static final long m236getInWholeMinutesimpl(long j) {
        return m250toLongimpl(j, DurationUnit.MINUTES);
    }

    public static final long m237getInWholeSecondsimpl(long j) {
        return m250toLongimpl(j, DurationUnit.SECONDS);
    }

    public static final long m235getInWholeMillisecondsimpl(long j) {
        return (m245isInMillisimpl(j) && m244isFiniteimpl(j)) ? m242getValueimpl(j) : m250toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    public String toString() {
        return m251toStringimpl(this.rawValue);
    }

    public static String m251toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m248isNegativeimpl = m248isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (m248isNegativeimpl) {
            sb.append('-');
        }
        long m231getAbsoluteValueUwyO8pc = m231getAbsoluteValueUwyO8pc(j);
        long m233getInWholeDaysimpl = m233getInWholeDaysimpl(m231getAbsoluteValueUwyO8pc);
        int m232getHoursComponentimpl = m232getHoursComponentimpl(m231getAbsoluteValueUwyO8pc);
        int m238getMinutesComponentimpl = m238getMinutesComponentimpl(m231getAbsoluteValueUwyO8pc);
        int m240getSecondsComponentimpl = m240getSecondsComponentimpl(m231getAbsoluteValueUwyO8pc);
        int m239getNanosecondsComponentimpl = m239getNanosecondsComponentimpl(m231getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = m233getInWholeDaysimpl != 0;
        boolean z2 = m232getHoursComponentimpl != 0;
        boolean z3 = m238getMinutesComponentimpl != 0;
        boolean z4 = (m240getSecondsComponentimpl == 0 && m239getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(m233getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m232getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m238getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (m240getSecondsComponentimpl != 0 || z || z2 || z3) {
                m226appendFractionalimpl(j, sb, m240getSecondsComponentimpl, m239getNanosecondsComponentimpl, 9, "s", false);
            } else if (m239getNanosecondsComponentimpl >= 1000000) {
                m226appendFractionalimpl(j, sb, m239getNanosecondsComponentimpl / 1000000, m239getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (m239getNanosecondsComponentimpl >= 1000) {
                m226appendFractionalimpl(j, sb, m239getNanosecondsComponentimpl / 1000, m239getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(m239getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (m248isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private static final void m226appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String padStart = StringsKt.padStart(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = padStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (padStart.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb.append((CharSequence) padStart, 0, i6);
                Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            } else {
                sb.append((CharSequence) padStart, 0, ((i4 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            }
        }
        sb.append(str);
    }
}
