package kotlin.time;

import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class Duration implements Comparable {
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m290constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(4611686018427387903L);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    public static final Duration m288boximpl(long j) {
        return new Duration(j);
    }

    public static boolean m291equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m315unboximpl();
    }

    private static final long m303getValueimpl(long j) {
        return j >> 1;
    }

    public static int m304hashCodeimpl(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    private static final boolean m306isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean m307isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean m309isNegativeimpl(long j) {
        return j < 0;
    }

    public static final boolean m310isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(Object obj) {
        return m291equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m304hashCodeimpl(this.rawValue);
    }

    public final long m315unboximpl() {
        return this.rawValue;
    }

    @Override
    public int compareTo(Object obj) {
        return m314compareToLRDsOJo(((Duration) obj).m315unboximpl());
    }

    private Duration(long j) {
        this.rawValue = j;
    }

    private static final DurationUnit m302getStorageUnitimpl(long j) {
        return m307isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static long m290constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m307isInNanosimpl(j)) {
                long jM303getValueimpl = m303getValueimpl(j);
                if (-4611686018426999999L > jM303getValueimpl || jM303getValueimpl >= 4611686018427000000L) {
                    throw new AssertionError(m303getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                long jM303getValueimpl2 = m303getValueimpl(j);
                if (-4611686018427387903L > jM303getValueimpl2 || jM303getValueimpl2 >= 4611686018427387904L) {
                    throw new AssertionError(m303getValueimpl(j) + " ms is out of milliseconds range");
                }
                long jM303getValueimpl3 = m303getValueimpl(j);
                if (-4611686018426L <= jM303getValueimpl3 && jM303getValueimpl3 < 4611686018427L) {
                    throw new AssertionError(m303getValueimpl(j) + " ms is denormalized");
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

    public static final long m313unaryMinusUwyO8pc(long j) {
        return DurationKt.durationOf(-m303getValueimpl(j), ((int) j) & 1);
    }

    public static final boolean m308isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final boolean m305isFiniteimpl(long j) {
        return !m308isInfiniteimpl(j);
    }

    public static final long m292getAbsoluteValueUwyO8pc(long j) {
        return m309isNegativeimpl(j) ? m313unaryMinusUwyO8pc(j) : j;
    }

    public int m314compareToLRDsOJo(long j) {
        return m289compareToLRDsOJo(this.rawValue, j);
    }

    public static int m289compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m309isNegativeimpl(j) ? -i : i;
    }

    public static final int m293getHoursComponentimpl(long j) {
        if (m308isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m295getInWholeHoursimpl(j) % 24);
    }

    public static final int m299getMinutesComponentimpl(long j) {
        if (m308isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m297getInWholeMinutesimpl(j) % 60);
    }

    public static final int m301getSecondsComponentimpl(long j) {
        if (m308isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m298getInWholeSecondsimpl(j) % 60);
    }

    public static final int m300getNanosecondsComponentimpl(long j) {
        long jM303getValueimpl;
        if (m308isInfiniteimpl(j)) {
            return 0;
        }
        if (m306isInMillisimpl(j)) {
            jM303getValueimpl = DurationKt.millisToNanos(m303getValueimpl(j) % 1000);
        } else {
            jM303getValueimpl = m303getValueimpl(j) % 1000000000;
        }
        return (int) jM303getValueimpl;
    }

    public static final long m311toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m303getValueimpl(j), m302getStorageUnitimpl(j), unit);
    }

    public static final long m294getInWholeDaysimpl(long j) {
        return m311toLongimpl(j, DurationUnit.DAYS);
    }

    public static final long m295getInWholeHoursimpl(long j) {
        return m311toLongimpl(j, DurationUnit.HOURS);
    }

    public static final long m297getInWholeMinutesimpl(long j) {
        return m311toLongimpl(j, DurationUnit.MINUTES);
    }

    public static final long m298getInWholeSecondsimpl(long j) {
        return m311toLongimpl(j, DurationUnit.SECONDS);
    }

    public static final long m296getInWholeMillisecondsimpl(long j) {
        return (m306isInMillisimpl(j) && m305isFiniteimpl(j)) ? m303getValueimpl(j) : m311toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    public String toString() {
        return m312toStringimpl(this.rawValue);
    }

    public static String m312toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM309isNegativeimpl = m309isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (zM309isNegativeimpl) {
            sb.append('-');
        }
        long jM292getAbsoluteValueUwyO8pc = m292getAbsoluteValueUwyO8pc(j);
        long jM294getInWholeDaysimpl = m294getInWholeDaysimpl(jM292getAbsoluteValueUwyO8pc);
        int iM293getHoursComponentimpl = m293getHoursComponentimpl(jM292getAbsoluteValueUwyO8pc);
        int iM299getMinutesComponentimpl = m299getMinutesComponentimpl(jM292getAbsoluteValueUwyO8pc);
        int iM301getSecondsComponentimpl = m301getSecondsComponentimpl(jM292getAbsoluteValueUwyO8pc);
        int iM300getNanosecondsComponentimpl = m300getNanosecondsComponentimpl(jM292getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = jM294getInWholeDaysimpl != 0;
        boolean z2 = iM293getHoursComponentimpl != 0;
        boolean z3 = iM299getMinutesComponentimpl != 0;
        boolean z4 = (iM301getSecondsComponentimpl == 0 && iM300getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(jM294getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM293getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM299getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM301getSecondsComponentimpl != 0 || z || z2 || z3) {
                m287appendFractionalimpl(j, sb, iM301getSecondsComponentimpl, iM300getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM300getNanosecondsComponentimpl >= 1000000) {
                m287appendFractionalimpl(j, sb, iM300getNanosecondsComponentimpl / 1000000, iM300getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (iM300getNanosecondsComponentimpl >= 1000) {
                m287appendFractionalimpl(j, sb, iM300getNanosecondsComponentimpl / 1000, iM300getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM300getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (zM309isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    private static final void m287appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strPadStart = StringsKt.padStart(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = strPadStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
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
                sb.append((CharSequence) strPadStart, 0, i6);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) strPadStart, 0, ((i4 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }
}
