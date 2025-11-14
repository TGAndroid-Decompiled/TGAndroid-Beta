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
    private static final long ZERO = m240constructorimpl(0);

    public static final Duration m238boximpl(long j) {
        return new Duration(j);
    }

    public static boolean m241equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m265unboximpl();
    }

    private static final long m253getValueimpl(long j) {
        return j >> 1;
    }

    public static int m254hashCodeimpl(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    private static final boolean m256isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean m257isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean m259isNegativeimpl(long j) {
        return j < 0;
    }

    public static final boolean m260isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(Object obj) {
        return m241equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m254hashCodeimpl(this.rawValue);
    }

    public final long m265unboximpl() {
        return this.rawValue;
    }

    @Override
    public int compareTo(Object obj) {
        return m264compareToLRDsOJo(((Duration) obj).m265unboximpl());
    }

    private Duration(long j) {
        this.rawValue = j;
    }

    private static final DurationUnit m252getStorageUnitimpl(long j) {
        return m257isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static long m240constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m257isInNanosimpl(j)) {
                if (!new LongRange(-4611686018426999999L, 4611686018426999999L).contains(m253getValueimpl(j))) {
                    throw new AssertionError(m253getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new LongRange(-4611686018427387903L, 4611686018427387903L).contains(m253getValueimpl(j))) {
                    throw new AssertionError(m253getValueimpl(j) + " ms is out of milliseconds range");
                }
                if (new LongRange(-4611686018426L, 4611686018426L).contains(m253getValueimpl(j))) {
                    throw new AssertionError(m253getValueimpl(j) + " ms is denormalized");
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

    public static final long m263unaryMinusUwyO8pc(long j) {
        long durationOf;
        durationOf = DurationKt.durationOf(-m253getValueimpl(j), ((int) j) & 1);
        return durationOf;
    }

    public static final boolean m258isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final boolean m255isFiniteimpl(long j) {
        return !m258isInfiniteimpl(j);
    }

    public static final long m242getAbsoluteValueUwyO8pc(long j) {
        return m259isNegativeimpl(j) ? m263unaryMinusUwyO8pc(j) : j;
    }

    public int m264compareToLRDsOJo(long j) {
        return m239compareToLRDsOJo(this.rawValue, j);
    }

    public static int m239compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m259isNegativeimpl(j) ? -i : i;
    }

    public static final int m243getHoursComponentimpl(long j) {
        if (m258isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m245getInWholeHoursimpl(j) % 24);
    }

    public static final int m249getMinutesComponentimpl(long j) {
        if (m258isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m247getInWholeMinutesimpl(j) % 60);
    }

    public static final int m251getSecondsComponentimpl(long j) {
        if (m258isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m248getInWholeSecondsimpl(j) % 60);
    }

    public static final int m250getNanosecondsComponentimpl(long j) {
        long m253getValueimpl;
        if (m258isInfiniteimpl(j)) {
            return 0;
        }
        if (m256isInMillisimpl(j)) {
            m253getValueimpl = DurationKt.millisToNanos(m253getValueimpl(j) % 1000);
        } else {
            m253getValueimpl = m253getValueimpl(j) % 1000000000;
        }
        return (int) m253getValueimpl;
    }

    public static final long m261toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m253getValueimpl(j), m252getStorageUnitimpl(j), unit);
    }

    public static final long m244getInWholeDaysimpl(long j) {
        return m261toLongimpl(j, DurationUnit.DAYS);
    }

    public static final long m245getInWholeHoursimpl(long j) {
        return m261toLongimpl(j, DurationUnit.HOURS);
    }

    public static final long m247getInWholeMinutesimpl(long j) {
        return m261toLongimpl(j, DurationUnit.MINUTES);
    }

    public static final long m248getInWholeSecondsimpl(long j) {
        return m261toLongimpl(j, DurationUnit.SECONDS);
    }

    public static final long m246getInWholeMillisecondsimpl(long j) {
        return (m256isInMillisimpl(j) && m255isFiniteimpl(j)) ? m253getValueimpl(j) : m261toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    public String toString() {
        return m262toStringimpl(this.rawValue);
    }

    public static String m262toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m259isNegativeimpl = m259isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (m259isNegativeimpl) {
            sb.append('-');
        }
        long m242getAbsoluteValueUwyO8pc = m242getAbsoluteValueUwyO8pc(j);
        long m244getInWholeDaysimpl = m244getInWholeDaysimpl(m242getAbsoluteValueUwyO8pc);
        int m243getHoursComponentimpl = m243getHoursComponentimpl(m242getAbsoluteValueUwyO8pc);
        int m249getMinutesComponentimpl = m249getMinutesComponentimpl(m242getAbsoluteValueUwyO8pc);
        int m251getSecondsComponentimpl = m251getSecondsComponentimpl(m242getAbsoluteValueUwyO8pc);
        int m250getNanosecondsComponentimpl = m250getNanosecondsComponentimpl(m242getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = m244getInWholeDaysimpl != 0;
        boolean z2 = m243getHoursComponentimpl != 0;
        boolean z3 = m249getMinutesComponentimpl != 0;
        boolean z4 = (m251getSecondsComponentimpl == 0 && m250getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(m244getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m243getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m249getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (m251getSecondsComponentimpl != 0 || z || z2 || z3) {
                m237appendFractionalimpl(j, sb, m251getSecondsComponentimpl, m250getNanosecondsComponentimpl, 9, "s", false);
            } else if (m250getNanosecondsComponentimpl >= 1000000) {
                m237appendFractionalimpl(j, sb, m250getNanosecondsComponentimpl / 1000000, m250getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (m250getNanosecondsComponentimpl >= 1000) {
                m237appendFractionalimpl(j, sb, m250getNanosecondsComponentimpl / 1000, m250getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(m250getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (m259isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private static final void m237appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
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
