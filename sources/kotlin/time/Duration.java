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
    private static final long ZERO = m225constructorimpl(0);

    public static final Duration m223boximpl(long j) {
        return new Duration(j);
    }

    public static boolean m226equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m250unboximpl();
    }

    private static final long m238getValueimpl(long j) {
        return j >> 1;
    }

    public static int m239hashCodeimpl(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    private static final boolean m241isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean m242isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean m244isNegativeimpl(long j) {
        return j < 0;
    }

    public static final boolean m245isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(Object obj) {
        return m226equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m239hashCodeimpl(this.rawValue);
    }

    public final long m250unboximpl() {
        return this.rawValue;
    }

    @Override
    public int compareTo(Object obj) {
        return m249compareToLRDsOJo(((Duration) obj).m250unboximpl());
    }

    private Duration(long j) {
        this.rawValue = j;
    }

    private static final DurationUnit m237getStorageUnitimpl(long j) {
        return m242isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static long m225constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m242isInNanosimpl(j)) {
                if (!new LongRange(-4611686018426999999L, 4611686018426999999L).contains(m238getValueimpl(j))) {
                    throw new AssertionError(m238getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new LongRange(-4611686018427387903L, 4611686018427387903L).contains(m238getValueimpl(j))) {
                    throw new AssertionError(m238getValueimpl(j) + " ms is out of milliseconds range");
                }
                if (new LongRange(-4611686018426L, 4611686018426L).contains(m238getValueimpl(j))) {
                    throw new AssertionError(m238getValueimpl(j) + " ms is denormalized");
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

    public static final long m248unaryMinusUwyO8pc(long j) {
        long durationOf;
        durationOf = DurationKt.durationOf(-m238getValueimpl(j), ((int) j) & 1);
        return durationOf;
    }

    public static final boolean m243isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final boolean m240isFiniteimpl(long j) {
        return !m243isInfiniteimpl(j);
    }

    public static final long m227getAbsoluteValueUwyO8pc(long j) {
        return m244isNegativeimpl(j) ? m248unaryMinusUwyO8pc(j) : j;
    }

    public int m249compareToLRDsOJo(long j) {
        return m224compareToLRDsOJo(this.rawValue, j);
    }

    public static int m224compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m244isNegativeimpl(j) ? -i : i;
    }

    public static final int m228getHoursComponentimpl(long j) {
        if (m243isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m230getInWholeHoursimpl(j) % 24);
    }

    public static final int m234getMinutesComponentimpl(long j) {
        if (m243isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m232getInWholeMinutesimpl(j) % 60);
    }

    public static final int m236getSecondsComponentimpl(long j) {
        if (m243isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m233getInWholeSecondsimpl(j) % 60);
    }

    public static final int m235getNanosecondsComponentimpl(long j) {
        long m238getValueimpl;
        if (m243isInfiniteimpl(j)) {
            return 0;
        }
        if (m241isInMillisimpl(j)) {
            m238getValueimpl = DurationKt.millisToNanos(m238getValueimpl(j) % 1000);
        } else {
            m238getValueimpl = m238getValueimpl(j) % 1000000000;
        }
        return (int) m238getValueimpl;
    }

    public static final long m246toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m238getValueimpl(j), m237getStorageUnitimpl(j), unit);
    }

    public static final long m229getInWholeDaysimpl(long j) {
        return m246toLongimpl(j, DurationUnit.DAYS);
    }

    public static final long m230getInWholeHoursimpl(long j) {
        return m246toLongimpl(j, DurationUnit.HOURS);
    }

    public static final long m232getInWholeMinutesimpl(long j) {
        return m246toLongimpl(j, DurationUnit.MINUTES);
    }

    public static final long m233getInWholeSecondsimpl(long j) {
        return m246toLongimpl(j, DurationUnit.SECONDS);
    }

    public static final long m231getInWholeMillisecondsimpl(long j) {
        return (m241isInMillisimpl(j) && m240isFiniteimpl(j)) ? m238getValueimpl(j) : m246toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    public String toString() {
        return m247toStringimpl(this.rawValue);
    }

    public static String m247toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m244isNegativeimpl = m244isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (m244isNegativeimpl) {
            sb.append('-');
        }
        long m227getAbsoluteValueUwyO8pc = m227getAbsoluteValueUwyO8pc(j);
        long m229getInWholeDaysimpl = m229getInWholeDaysimpl(m227getAbsoluteValueUwyO8pc);
        int m228getHoursComponentimpl = m228getHoursComponentimpl(m227getAbsoluteValueUwyO8pc);
        int m234getMinutesComponentimpl = m234getMinutesComponentimpl(m227getAbsoluteValueUwyO8pc);
        int m236getSecondsComponentimpl = m236getSecondsComponentimpl(m227getAbsoluteValueUwyO8pc);
        int m235getNanosecondsComponentimpl = m235getNanosecondsComponentimpl(m227getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = m229getInWholeDaysimpl != 0;
        boolean z2 = m228getHoursComponentimpl != 0;
        boolean z3 = m234getMinutesComponentimpl != 0;
        boolean z4 = (m236getSecondsComponentimpl == 0 && m235getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(m229getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m228getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m234getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (m236getSecondsComponentimpl != 0 || z || z2 || z3) {
                m222appendFractionalimpl(j, sb, m236getSecondsComponentimpl, m235getNanosecondsComponentimpl, 9, "s", false);
            } else if (m235getNanosecondsComponentimpl >= 1000000) {
                m222appendFractionalimpl(j, sb, m235getNanosecondsComponentimpl / 1000000, m235getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (m235getNanosecondsComponentimpl >= 1000) {
                m222appendFractionalimpl(j, sb, m235getNanosecondsComponentimpl / 1000, m235getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(m235getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (m244isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private static final void m222appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
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
