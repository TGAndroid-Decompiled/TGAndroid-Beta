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
    private static final long ZERO = m222constructorimpl(0);

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

    private static final void m219appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
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

    public static final Duration m220boximpl(long j) {
        return new Duration(j);
    }

    public static int m221compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m241isNegativeimpl(j) ? -i : i;
    }

    public static long m222constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m239isInNanosimpl(j)) {
                if (!new LongRange(-4611686018426999999L, 4611686018426999999L).contains(m235getValueimpl(j))) {
                    throw new AssertionError(m235getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new LongRange(-4611686018427387903L, 4611686018427387903L).contains(m235getValueimpl(j))) {
                    throw new AssertionError(m235getValueimpl(j) + " ms is out of milliseconds range");
                }
                if (new LongRange(-4611686018426L, 4611686018426L).contains(m235getValueimpl(j))) {
                    throw new AssertionError(m235getValueimpl(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    public static boolean m223equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m247unboximpl();
    }

    public static final long m224getAbsoluteValueUwyO8pc(long j) {
        return m241isNegativeimpl(j) ? m245unaryMinusUwyO8pc(j) : j;
    }

    public static final int m225getHoursComponentimpl(long j) {
        if (m240isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m227getInWholeHoursimpl(j) % 24);
    }

    public static final long m226getInWholeDaysimpl(long j) {
        return m243toLongimpl(j, DurationUnit.DAYS);
    }

    public static final long m227getInWholeHoursimpl(long j) {
        return m243toLongimpl(j, DurationUnit.HOURS);
    }

    public static final long m228getInWholeMillisecondsimpl(long j) {
        return (m238isInMillisimpl(j) && m237isFiniteimpl(j)) ? m235getValueimpl(j) : m243toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    public static final long m229getInWholeMinutesimpl(long j) {
        return m243toLongimpl(j, DurationUnit.MINUTES);
    }

    public static final long m230getInWholeSecondsimpl(long j) {
        return m243toLongimpl(j, DurationUnit.SECONDS);
    }

    public static final int m231getMinutesComponentimpl(long j) {
        if (m240isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m229getInWholeMinutesimpl(j) % 60);
    }

    public static final int m232getNanosecondsComponentimpl(long j) {
        if (m240isInfiniteimpl(j)) {
            return 0;
        }
        boolean m238isInMillisimpl = m238isInMillisimpl(j);
        long m235getValueimpl = m235getValueimpl(j);
        return (int) (m238isInMillisimpl ? DurationKt.millisToNanos(m235getValueimpl % 1000) : m235getValueimpl % 1000000000);
    }

    public static final int m233getSecondsComponentimpl(long j) {
        if (m240isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m230getInWholeSecondsimpl(j) % 60);
    }

    private static final DurationUnit m234getStorageUnitimpl(long j) {
        return m239isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    private static final long m235getValueimpl(long j) {
        return j >> 1;
    }

    public static int m236hashCodeimpl(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    public static final boolean m237isFiniteimpl(long j) {
        return !m240isInfiniteimpl(j);
    }

    private static final boolean m238isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean m239isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean m240isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final boolean m241isNegativeimpl(long j) {
        return j < 0;
    }

    public static final boolean m242isPositiveimpl(long j) {
        return j > 0;
    }

    public static final long m243toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m235getValueimpl(j), m234getStorageUnitimpl(j), unit);
    }

    public static String m244toStringimpl(long j) {
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
        boolean m241isNegativeimpl = m241isNegativeimpl(j);
        StringBuilder sb2 = new StringBuilder();
        if (m241isNegativeimpl) {
            sb2.append('-');
        }
        long m224getAbsoluteValueUwyO8pc = m224getAbsoluteValueUwyO8pc(j);
        long m226getInWholeDaysimpl = m226getInWholeDaysimpl(m224getAbsoluteValueUwyO8pc);
        int m225getHoursComponentimpl = m225getHoursComponentimpl(m224getAbsoluteValueUwyO8pc);
        int m231getMinutesComponentimpl = m231getMinutesComponentimpl(m224getAbsoluteValueUwyO8pc);
        int m233getSecondsComponentimpl = m233getSecondsComponentimpl(m224getAbsoluteValueUwyO8pc);
        int m232getNanosecondsComponentimpl = m232getNanosecondsComponentimpl(m224getAbsoluteValueUwyO8pc);
        int i4 = 0;
        boolean z2 = m226getInWholeDaysimpl != 0;
        boolean z3 = m225getHoursComponentimpl != 0;
        boolean z4 = m231getMinutesComponentimpl != 0;
        boolean z5 = (m233getSecondsComponentimpl == 0 && m232getNanosecondsComponentimpl == 0) ? false : true;
        if (z2) {
            sb2.append(m226getInWholeDaysimpl);
            sb2.append('d');
            i4 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i5 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            sb2.append(m225getHoursComponentimpl);
            sb2.append('h');
            i4 = i5;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i6 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            sb2.append(m231getMinutesComponentimpl);
            sb2.append('m');
            i4 = i6;
        }
        if (z5) {
            int i7 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            if (m233getSecondsComponentimpl != 0 || z2 || z3 || z4) {
                i = 9;
                j2 = j;
                sb = sb2;
                i2 = m233getSecondsComponentimpl;
                i3 = m232getNanosecondsComponentimpl;
                str = "s";
                z = false;
            } else {
                if (m232getNanosecondsComponentimpl >= 1000000) {
                    i2 = m232getNanosecondsComponentimpl / 1000000;
                    i3 = m232getNanosecondsComponentimpl % 1000000;
                    str = "ms";
                    z = false;
                    i = 6;
                } else if (m232getNanosecondsComponentimpl >= 1000) {
                    i2 = m232getNanosecondsComponentimpl / 1000;
                    i3 = m232getNanosecondsComponentimpl % 1000;
                    str = "us";
                    z = false;
                    i = 3;
                } else {
                    sb2.append(m232getNanosecondsComponentimpl);
                    sb2.append("ns");
                    i4 = i7;
                }
                j2 = j;
                sb = sb2;
            }
            m219appendFractionalimpl(j2, sb, i2, i3, i, str, z);
            i4 = i7;
        }
        if (m241isNegativeimpl && i4 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final long m245unaryMinusUwyO8pc(long j) {
        long durationOf;
        durationOf = DurationKt.durationOf(-m235getValueimpl(j), ((int) j) & 1);
        return durationOf;
    }

    @Override
    public int compareTo(Object obj) {
        return m246compareToLRDsOJo(((Duration) obj).m247unboximpl());
    }

    public int m246compareToLRDsOJo(long j) {
        return m221compareToLRDsOJo(this.rawValue, j);
    }

    public boolean equals(Object obj) {
        return m223equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m236hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m244toStringimpl(this.rawValue);
    }

    public final long m247unboximpl() {
        return this.rawValue;
    }
}
