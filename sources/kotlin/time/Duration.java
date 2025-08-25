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
    private static final long ZERO = m223constructorimpl(0);

    public static final Duration m221boximpl(long j) {
        return new Duration(j);
    }

    public static boolean m224equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m248unboximpl();
    }

    private static final long m236getValueimpl(long j) {
        return j >> 1;
    }

    public static int m237hashCodeimpl(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    private static final boolean m239isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean m240isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean m242isNegativeimpl(long j) {
        return j < 0;
    }

    public static final boolean m243isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(Object obj) {
        return m224equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m237hashCodeimpl(this.rawValue);
    }

    public final long m248unboximpl() {
        return this.rawValue;
    }

    @Override
    public int compareTo(Object obj) {
        return m247compareToLRDsOJo(((Duration) obj).m248unboximpl());
    }

    private Duration(long j) {
        this.rawValue = j;
    }

    private static final DurationUnit m235getStorageUnitimpl(long j) {
        return m240isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static long m223constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m240isInNanosimpl(j)) {
                if (!new LongRange(-4611686018426999999L, 4611686018426999999L).contains(m236getValueimpl(j))) {
                    throw new AssertionError(m236getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new LongRange(-4611686018427387903L, 4611686018427387903L).contains(m236getValueimpl(j))) {
                    throw new AssertionError(m236getValueimpl(j) + " ms is out of milliseconds range");
                }
                if (new LongRange(-4611686018426L, 4611686018426L).contains(m236getValueimpl(j))) {
                    throw new AssertionError(m236getValueimpl(j) + " ms is denormalized");
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

    public static final long m246unaryMinusUwyO8pc(long j) {
        long durationOf;
        durationOf = DurationKt.durationOf(-m236getValueimpl(j), ((int) j) & 1);
        return durationOf;
    }

    public static final boolean m241isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final boolean m238isFiniteimpl(long j) {
        return !m241isInfiniteimpl(j);
    }

    public static final long m225getAbsoluteValueUwyO8pc(long j) {
        return m242isNegativeimpl(j) ? m246unaryMinusUwyO8pc(j) : j;
    }

    public int m247compareToLRDsOJo(long j) {
        return m222compareToLRDsOJo(this.rawValue, j);
    }

    public static int m222compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m242isNegativeimpl(j) ? -i : i;
    }

    public static final int m226getHoursComponentimpl(long j) {
        if (m241isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m228getInWholeHoursimpl(j) % 24);
    }

    public static final int m232getMinutesComponentimpl(long j) {
        if (m241isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m230getInWholeMinutesimpl(j) % 60);
    }

    public static final int m234getSecondsComponentimpl(long j) {
        if (m241isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m231getInWholeSecondsimpl(j) % 60);
    }

    public static final int m233getNanosecondsComponentimpl(long j) {
        long m236getValueimpl;
        if (m241isInfiniteimpl(j)) {
            return 0;
        }
        if (m239isInMillisimpl(j)) {
            m236getValueimpl = DurationKt.millisToNanos(m236getValueimpl(j) % 1000);
        } else {
            m236getValueimpl = m236getValueimpl(j) % 1000000000;
        }
        return (int) m236getValueimpl;
    }

    public static final long m244toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m236getValueimpl(j), m235getStorageUnitimpl(j), unit);
    }

    public static final long m227getInWholeDaysimpl(long j) {
        return m244toLongimpl(j, DurationUnit.DAYS);
    }

    public static final long m228getInWholeHoursimpl(long j) {
        return m244toLongimpl(j, DurationUnit.HOURS);
    }

    public static final long m230getInWholeMinutesimpl(long j) {
        return m244toLongimpl(j, DurationUnit.MINUTES);
    }

    public static final long m231getInWholeSecondsimpl(long j) {
        return m244toLongimpl(j, DurationUnit.SECONDS);
    }

    public static final long m229getInWholeMillisecondsimpl(long j) {
        return (m239isInMillisimpl(j) && m238isFiniteimpl(j)) ? m236getValueimpl(j) : m244toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    public String toString() {
        return m245toStringimpl(this.rawValue);
    }

    public static String m245toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m242isNegativeimpl = m242isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (m242isNegativeimpl) {
            sb.append('-');
        }
        long m225getAbsoluteValueUwyO8pc = m225getAbsoluteValueUwyO8pc(j);
        long m227getInWholeDaysimpl = m227getInWholeDaysimpl(m225getAbsoluteValueUwyO8pc);
        int m226getHoursComponentimpl = m226getHoursComponentimpl(m225getAbsoluteValueUwyO8pc);
        int m232getMinutesComponentimpl = m232getMinutesComponentimpl(m225getAbsoluteValueUwyO8pc);
        int m234getSecondsComponentimpl = m234getSecondsComponentimpl(m225getAbsoluteValueUwyO8pc);
        int m233getNanosecondsComponentimpl = m233getNanosecondsComponentimpl(m225getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = m227getInWholeDaysimpl != 0;
        boolean z2 = m226getHoursComponentimpl != 0;
        boolean z3 = m232getMinutesComponentimpl != 0;
        boolean z4 = (m234getSecondsComponentimpl == 0 && m233getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(m227getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m226getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m232getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (m234getSecondsComponentimpl != 0 || z || z2 || z3) {
                m220appendFractionalimpl(j, sb, m234getSecondsComponentimpl, m233getNanosecondsComponentimpl, 9, "s", false);
            } else if (m233getNanosecondsComponentimpl >= 1000000) {
                m220appendFractionalimpl(j, sb, m233getNanosecondsComponentimpl / 1000000, m233getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (m233getNanosecondsComponentimpl >= 1000) {
                m220appendFractionalimpl(j, sb, m233getNanosecondsComponentimpl / 1000, m233getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(m233getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (m242isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private static final void m220appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
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
