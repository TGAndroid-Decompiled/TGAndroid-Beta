package kotlin.time;

import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.LongRange;
import kotlin.text.StringsKt__StringsKt;

public final class Duration implements Comparable {
    private static final long INFINITE;
    private static final long NEG_INFINITE;
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m221constructorimpl(0);

    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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

    private Duration(long j) {
        this.rawValue = j;
    }

    private static final void m218appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        String padStart;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            padStart = StringsKt__StringsKt.padStart(String.valueOf(i2), i3, '0');
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
            if (z || i6 >= 3) {
                sb.append((CharSequence) padStart, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) padStart, 0, i6);
            }
            Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
        }
        sb.append(str);
    }

    public static final Duration m219boximpl(long j) {
        return new Duration(j);
    }

    public static int m220compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m240isNegativeimpl(j) ? -i : i;
    }

    public static long m221constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m238isInNanosimpl(j)) {
                if (!new LongRange(-4611686018426999999L, 4611686018426999999L).contains(m234getValueimpl(j))) {
                    throw new AssertionError(m234getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new LongRange(-4611686018427387903L, 4611686018427387903L).contains(m234getValueimpl(j))) {
                    throw new AssertionError(m234getValueimpl(j) + " ms is out of milliseconds range");
                }
                if (new LongRange(-4611686018426L, 4611686018426L).contains(m234getValueimpl(j))) {
                    throw new AssertionError(m234getValueimpl(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    public static boolean m222equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m246unboximpl();
    }

    public static final long m223getAbsoluteValueUwyO8pc(long j) {
        return m240isNegativeimpl(j) ? m244unaryMinusUwyO8pc(j) : j;
    }

    public static final int m224getHoursComponentimpl(long j) {
        if (m239isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m226getInWholeHoursimpl(j) % 24);
    }

    public static final long m225getInWholeDaysimpl(long j) {
        return m242toLongimpl(j, DurationUnit.DAYS);
    }

    public static final long m226getInWholeHoursimpl(long j) {
        return m242toLongimpl(j, DurationUnit.HOURS);
    }

    public static final long m227getInWholeMillisecondsimpl(long j) {
        return (m237isInMillisimpl(j) && m236isFiniteimpl(j)) ? m234getValueimpl(j) : m242toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    public static final long m228getInWholeMinutesimpl(long j) {
        return m242toLongimpl(j, DurationUnit.MINUTES);
    }

    public static final long m229getInWholeSecondsimpl(long j) {
        return m242toLongimpl(j, DurationUnit.SECONDS);
    }

    public static final int m230getMinutesComponentimpl(long j) {
        if (m239isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m228getInWholeMinutesimpl(j) % 60);
    }

    public static final int m231getNanosecondsComponentimpl(long j) {
        if (m239isInfiniteimpl(j)) {
            return 0;
        }
        boolean m237isInMillisimpl = m237isInMillisimpl(j);
        long m234getValueimpl = m234getValueimpl(j);
        return (int) (m237isInMillisimpl ? DurationKt.millisToNanos(m234getValueimpl % 1000) : m234getValueimpl % 1000000000);
    }

    public static final int m232getSecondsComponentimpl(long j) {
        if (m239isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m229getInWholeSecondsimpl(j) % 60);
    }

    private static final DurationUnit m233getStorageUnitimpl(long j) {
        return m238isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    private static final long m234getValueimpl(long j) {
        return j >> 1;
    }

    public static int m235hashCodeimpl(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    public static final boolean m236isFiniteimpl(long j) {
        return !m239isInfiniteimpl(j);
    }

    private static final boolean m237isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean m238isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean m239isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final boolean m240isNegativeimpl(long j) {
        return j < 0;
    }

    public static final boolean m241isPositiveimpl(long j) {
        return j > 0;
    }

    public static final long m242toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m234getValueimpl(j), m233getStorageUnitimpl(j), unit);
    }

    public static String m243toStringimpl(long j) {
        int i;
        long j2;
        StringBuilder sb;
        int i2;
        int i3;
        String str;
        boolean z;
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m240isNegativeimpl = m240isNegativeimpl(j);
        StringBuilder sb2 = new StringBuilder();
        if (m240isNegativeimpl) {
            sb2.append('-');
        }
        long m223getAbsoluteValueUwyO8pc = m223getAbsoluteValueUwyO8pc(j);
        long m225getInWholeDaysimpl = m225getInWholeDaysimpl(m223getAbsoluteValueUwyO8pc);
        int m224getHoursComponentimpl = m224getHoursComponentimpl(m223getAbsoluteValueUwyO8pc);
        int m230getMinutesComponentimpl = m230getMinutesComponentimpl(m223getAbsoluteValueUwyO8pc);
        int m232getSecondsComponentimpl = m232getSecondsComponentimpl(m223getAbsoluteValueUwyO8pc);
        int m231getNanosecondsComponentimpl = m231getNanosecondsComponentimpl(m223getAbsoluteValueUwyO8pc);
        int i4 = 0;
        boolean z2 = m225getInWholeDaysimpl != 0;
        boolean z3 = m224getHoursComponentimpl != 0;
        boolean z4 = m230getMinutesComponentimpl != 0;
        boolean z5 = (m232getSecondsComponentimpl == 0 && m231getNanosecondsComponentimpl == 0) ? false : true;
        if (z2) {
            sb2.append(m225getInWholeDaysimpl);
            sb2.append('d');
            i4 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i5 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            sb2.append(m224getHoursComponentimpl);
            sb2.append('h');
            i4 = i5;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i6 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            sb2.append(m230getMinutesComponentimpl);
            sb2.append('m');
            i4 = i6;
        }
        if (z5) {
            int i7 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            if (m232getSecondsComponentimpl != 0 || z2 || z3 || z4) {
                i = 9;
                j2 = j;
                sb = sb2;
                i2 = m232getSecondsComponentimpl;
                i3 = m231getNanosecondsComponentimpl;
                str = "s";
                z = false;
            } else {
                if (m231getNanosecondsComponentimpl >= 1000000) {
                    i2 = m231getNanosecondsComponentimpl / 1000000;
                    i3 = m231getNanosecondsComponentimpl % 1000000;
                    str = "ms";
                    z = false;
                    i = 6;
                } else if (m231getNanosecondsComponentimpl >= 1000) {
                    i2 = m231getNanosecondsComponentimpl / 1000;
                    i3 = m231getNanosecondsComponentimpl % 1000;
                    str = "us";
                    z = false;
                    i = 3;
                } else {
                    sb2.append(m231getNanosecondsComponentimpl);
                    sb2.append("ns");
                    i4 = i7;
                }
                j2 = j;
                sb = sb2;
            }
            m218appendFractionalimpl(j2, sb, i2, i3, i, str, z);
            i4 = i7;
        }
        if (m240isNegativeimpl && i4 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final long m244unaryMinusUwyO8pc(long j) {
        long durationOf;
        durationOf = DurationKt.durationOf(-m234getValueimpl(j), ((int) j) & 1);
        return durationOf;
    }

    @Override
    public int compareTo(Object obj) {
        return m245compareToLRDsOJo(((Duration) obj).m246unboximpl());
    }

    public int m245compareToLRDsOJo(long j) {
        return m220compareToLRDsOJo(this.rawValue, j);
    }

    public boolean equals(Object obj) {
        return m222equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m235hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m243toStringimpl(this.rawValue);
    }

    public final long m246unboximpl() {
        return this.rawValue;
    }
}
