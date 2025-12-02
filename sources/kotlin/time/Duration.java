package kotlin.time;

import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class Duration implements Comparable {
    private static final long INFINITE;
    private static final long NEG_INFINITE;
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m288constructorimpl(0);

    public static final Duration m286boximpl(long j) {
        return new Duration(j);
    }

    public static boolean m289equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m313unboximpl();
    }

    private static final long m301getValueimpl(long j) {
        return j >> 1;
    }

    public static int m302hashCodeimpl(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    private static final boolean m304isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean m305isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean m307isNegativeimpl(long j) {
        return j < 0;
    }

    public static final boolean m308isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(Object obj) {
        return m289equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m302hashCodeimpl(this.rawValue);
    }

    public final long m313unboximpl() {
        return this.rawValue;
    }

    @Override
    public int compareTo(Object obj) {
        return m312compareToLRDsOJo(((Duration) obj).m313unboximpl());
    }

    private Duration(long j) {
        this.rawValue = j;
    }

    private static final DurationUnit m300getStorageUnitimpl(long j) {
        return m305isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static long m288constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m305isInNanosimpl(j)) {
                long m301getValueimpl = m301getValueimpl(j);
                if (-4611686018426999999L > m301getValueimpl || m301getValueimpl >= 4611686018427000000L) {
                    throw new AssertionError(m301getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                long m301getValueimpl2 = m301getValueimpl(j);
                if (-4611686018427387903L > m301getValueimpl2 || m301getValueimpl2 >= 4611686018427387904L) {
                    throw new AssertionError(m301getValueimpl(j) + " ms is out of milliseconds range");
                }
                long m301getValueimpl3 = m301getValueimpl(j);
                if (-4611686018426L <= m301getValueimpl3 && m301getValueimpl3 < 4611686018427L) {
                    throw new AssertionError(m301getValueimpl(j) + " ms is denormalized");
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

    public static final long m311unaryMinusUwyO8pc(long j) {
        long durationOf;
        durationOf = DurationKt.durationOf(-m301getValueimpl(j), ((int) j) & 1);
        return durationOf;
    }

    public static final boolean m306isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final boolean m303isFiniteimpl(long j) {
        return !m306isInfiniteimpl(j);
    }

    public static final long m290getAbsoluteValueUwyO8pc(long j) {
        return m307isNegativeimpl(j) ? m311unaryMinusUwyO8pc(j) : j;
    }

    public int m312compareToLRDsOJo(long j) {
        return m287compareToLRDsOJo(this.rawValue, j);
    }

    public static int m287compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m307isNegativeimpl(j) ? -i : i;
    }

    public static final int m291getHoursComponentimpl(long j) {
        if (m306isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m293getInWholeHoursimpl(j) % 24);
    }

    public static final int m297getMinutesComponentimpl(long j) {
        if (m306isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m295getInWholeMinutesimpl(j) % 60);
    }

    public static final int m299getSecondsComponentimpl(long j) {
        if (m306isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m296getInWholeSecondsimpl(j) % 60);
    }

    public static final int m298getNanosecondsComponentimpl(long j) {
        long m301getValueimpl;
        if (m306isInfiniteimpl(j)) {
            return 0;
        }
        if (m304isInMillisimpl(j)) {
            m301getValueimpl = DurationKt.millisToNanos(m301getValueimpl(j) % 1000);
        } else {
            m301getValueimpl = m301getValueimpl(j) % 1000000000;
        }
        return (int) m301getValueimpl;
    }

    public static final long m309toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m301getValueimpl(j), m300getStorageUnitimpl(j), unit);
    }

    public static final long m292getInWholeDaysimpl(long j) {
        return m309toLongimpl(j, DurationUnit.DAYS);
    }

    public static final long m293getInWholeHoursimpl(long j) {
        return m309toLongimpl(j, DurationUnit.HOURS);
    }

    public static final long m295getInWholeMinutesimpl(long j) {
        return m309toLongimpl(j, DurationUnit.MINUTES);
    }

    public static final long m296getInWholeSecondsimpl(long j) {
        return m309toLongimpl(j, DurationUnit.SECONDS);
    }

    public static final long m294getInWholeMillisecondsimpl(long j) {
        return (m304isInMillisimpl(j) && m303isFiniteimpl(j)) ? m301getValueimpl(j) : m309toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    public String toString() {
        return m310toStringimpl(this.rawValue);
    }

    public static String m310toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m307isNegativeimpl = m307isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (m307isNegativeimpl) {
            sb.append('-');
        }
        long m290getAbsoluteValueUwyO8pc = m290getAbsoluteValueUwyO8pc(j);
        long m292getInWholeDaysimpl = m292getInWholeDaysimpl(m290getAbsoluteValueUwyO8pc);
        int m291getHoursComponentimpl = m291getHoursComponentimpl(m290getAbsoluteValueUwyO8pc);
        int m297getMinutesComponentimpl = m297getMinutesComponentimpl(m290getAbsoluteValueUwyO8pc);
        int m299getSecondsComponentimpl = m299getSecondsComponentimpl(m290getAbsoluteValueUwyO8pc);
        int m298getNanosecondsComponentimpl = m298getNanosecondsComponentimpl(m290getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = m292getInWholeDaysimpl != 0;
        boolean z2 = m291getHoursComponentimpl != 0;
        boolean z3 = m297getMinutesComponentimpl != 0;
        boolean z4 = (m299getSecondsComponentimpl == 0 && m298getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(m292getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m291getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m297getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (m299getSecondsComponentimpl != 0 || z || z2 || z3) {
                m285appendFractionalimpl(j, sb, m299getSecondsComponentimpl, m298getNanosecondsComponentimpl, 9, "s", false);
            } else if (m298getNanosecondsComponentimpl >= 1000000) {
                m285appendFractionalimpl(j, sb, m298getNanosecondsComponentimpl / 1000000, m298getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (m298getNanosecondsComponentimpl >= 1000) {
                m285appendFractionalimpl(j, sb, m298getNanosecondsComponentimpl / 1000, m298getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(m298getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (m307isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    private static final void m285appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
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
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) padStart, 0, ((i4 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }
}
