package kotlin.time;

import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class Duration implements Comparable {
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m296constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(4611686018427387903L);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    public static final Duration m294boximpl(long j) {
        return new Duration(j);
    }

    public static boolean m297equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m321unboximpl();
    }

    private static final long m309getValueimpl(long j) {
        return j >> 1;
    }

    public static int m310hashCodeimpl(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    private static final boolean m312isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean m313isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean m315isNegativeimpl(long j) {
        return j < 0;
    }

    public static final boolean m316isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(Object obj) {
        return m297equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m310hashCodeimpl(this.rawValue);
    }

    public final long m321unboximpl() {
        return this.rawValue;
    }

    @Override
    public int compareTo(Object obj) {
        return m320compareToLRDsOJo(((Duration) obj).m321unboximpl());
    }

    private Duration(long j) {
        this.rawValue = j;
    }

    private static final DurationUnit m308getStorageUnitimpl(long j) {
        return m313isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static long m296constructorimpl(long j) {
        if (!DurationJvmKt.getDurationAssertionsEnabled()) {
            return j;
        }
        if (m313isInNanosimpl(j)) {
            long jM309getValueimpl = m309getValueimpl(j);
            if (-4611686018426999999L <= jM309getValueimpl && jM309getValueimpl < 4611686018427000000L) {
                return j;
            }
            throw new AssertionError(m309getValueimpl(j) + " ns is out of nanoseconds range");
        }
        long jM309getValueimpl2 = m309getValueimpl(j);
        if (-4611686018427387903L > jM309getValueimpl2 || jM309getValueimpl2 >= 4611686018427387904L) {
            throw new AssertionError(m309getValueimpl(j) + " ms is out of milliseconds range");
        }
        long jM309getValueimpl3 = m309getValueimpl(j);
        if (-4611686018426L > jM309getValueimpl3 || jM309getValueimpl3 >= 4611686018427L) {
            return j;
        }
        throw new AssertionError(m309getValueimpl(j) + " ms is denormalized");
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final long m319unaryMinusUwyO8pc(long j) {
        return DurationKt.durationOf(-m309getValueimpl(j), ((int) j) & 1);
    }

    public static final boolean m314isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final boolean m311isFiniteimpl(long j) {
        return !m314isInfiniteimpl(j);
    }

    public static final long m298getAbsoluteValueUwyO8pc(long j) {
        return m315isNegativeimpl(j) ? m319unaryMinusUwyO8pc(j) : j;
    }

    public int m320compareToLRDsOJo(long j) {
        return m295compareToLRDsOJo(this.rawValue, j);
    }

    public static int m295compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m315isNegativeimpl(j) ? -i : i;
    }

    public static final int m299getHoursComponentimpl(long j) {
        if (m314isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m301getInWholeHoursimpl(j) % ((long) 24));
    }

    public static final int m305getMinutesComponentimpl(long j) {
        if (m314isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m303getInWholeMinutesimpl(j) % ((long) 60));
    }

    public static final int m307getSecondsComponentimpl(long j) {
        if (m314isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m304getInWholeSecondsimpl(j) % ((long) 60));
    }

    public static final int m306getNanosecondsComponentimpl(long j) {
        long jM309getValueimpl;
        if (m314isInfiniteimpl(j)) {
            return 0;
        }
        if (m312isInMillisimpl(j)) {
            jM309getValueimpl = DurationKt.millisToNanos(m309getValueimpl(j) % ((long) 1000));
        } else {
            jM309getValueimpl = m309getValueimpl(j) % ((long) 1000000000);
        }
        return (int) jM309getValueimpl;
    }

    public static final long m317toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m309getValueimpl(j), m308getStorageUnitimpl(j), unit);
    }

    public static final long m300getInWholeDaysimpl(long j) {
        return m317toLongimpl(j, DurationUnit.DAYS);
    }

    public static final long m301getInWholeHoursimpl(long j) {
        return m317toLongimpl(j, DurationUnit.HOURS);
    }

    public static final long m303getInWholeMinutesimpl(long j) {
        return m317toLongimpl(j, DurationUnit.MINUTES);
    }

    public static final long m304getInWholeSecondsimpl(long j) {
        return m317toLongimpl(j, DurationUnit.SECONDS);
    }

    public static final long m302getInWholeMillisecondsimpl(long j) {
        return (m312isInMillisimpl(j) && m311isFiniteimpl(j)) ? m309getValueimpl(j) : m317toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    public String toString() {
        return m318toStringimpl(this.rawValue);
    }

    public static String m318toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM315isNegativeimpl = m315isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (zM315isNegativeimpl) {
            sb.append('-');
        }
        long jM298getAbsoluteValueUwyO8pc = m298getAbsoluteValueUwyO8pc(j);
        long jM300getInWholeDaysimpl = m300getInWholeDaysimpl(jM298getAbsoluteValueUwyO8pc);
        int iM299getHoursComponentimpl = m299getHoursComponentimpl(jM298getAbsoluteValueUwyO8pc);
        int iM305getMinutesComponentimpl = m305getMinutesComponentimpl(jM298getAbsoluteValueUwyO8pc);
        int iM307getSecondsComponentimpl = m307getSecondsComponentimpl(jM298getAbsoluteValueUwyO8pc);
        int iM306getNanosecondsComponentimpl = m306getNanosecondsComponentimpl(jM298getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = jM300getInWholeDaysimpl != 0;
        boolean z2 = iM299getHoursComponentimpl != 0;
        boolean z3 = iM305getMinutesComponentimpl != 0;
        boolean z4 = (iM307getSecondsComponentimpl == 0 && iM306getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(jM300getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM299getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM305getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM307getSecondsComponentimpl != 0 || z || z2 || z3) {
                m293appendFractionalimpl(j, sb, iM307getSecondsComponentimpl, iM306getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM306getNanosecondsComponentimpl >= 1000000) {
                m293appendFractionalimpl(j, sb, iM306getNanosecondsComponentimpl / 1000000, iM306getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (iM306getNanosecondsComponentimpl >= 1000) {
                m293appendFractionalimpl(j, sb, iM306getNanosecondsComponentimpl / 1000, iM306getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM306getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (zM315isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    private static final void m293appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
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
