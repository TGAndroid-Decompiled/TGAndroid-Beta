package kotlin.time;

import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class Duration implements Comparable {
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m304constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(4611686018427387903L);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    public static final Duration m302boximpl(long j) {
        return new Duration(j);
    }

    public static boolean m305equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m329unboximpl();
    }

    private static final long m317getValueimpl(long j) {
        return j >> 1;
    }

    public static int m318hashCodeimpl(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    private static final boolean m320isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean m321isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean m323isNegativeimpl(long j) {
        return j < 0;
    }

    public static final boolean m324isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(Object obj) {
        return m305equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m318hashCodeimpl(this.rawValue);
    }

    public final long m329unboximpl() {
        return this.rawValue;
    }

    @Override
    public int compareTo(Object obj) {
        return m328compareToLRDsOJo(((Duration) obj).m329unboximpl());
    }

    private Duration(long j) {
        this.rawValue = j;
    }

    private static final DurationUnit m316getStorageUnitimpl(long j) {
        return m321isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static long m304constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m321isInNanosimpl(j)) {
                long jM317getValueimpl = m317getValueimpl(j);
                if (-4611686018426999999L > jM317getValueimpl || jM317getValueimpl >= 4611686018427000000L) {
                    throw new AssertionError(m317getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                long jM317getValueimpl2 = m317getValueimpl(j);
                if (-4611686018427387903L > jM317getValueimpl2 || jM317getValueimpl2 >= 4611686018427387904L) {
                    throw new AssertionError(m317getValueimpl(j) + " ms is out of milliseconds range");
                }
                long jM317getValueimpl3 = m317getValueimpl(j);
                if (-4611686018426L <= jM317getValueimpl3 && jM317getValueimpl3 < 4611686018427L) {
                    throw new AssertionError(m317getValueimpl(j) + " ms is denormalized");
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

    public static final long m327unaryMinusUwyO8pc(long j) {
        return DurationKt.durationOf(-m317getValueimpl(j), ((int) j) & 1);
    }

    public static final boolean m322isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final boolean m319isFiniteimpl(long j) {
        return !m322isInfiniteimpl(j);
    }

    public static final long m306getAbsoluteValueUwyO8pc(long j) {
        return m323isNegativeimpl(j) ? m327unaryMinusUwyO8pc(j) : j;
    }

    public int m328compareToLRDsOJo(long j) {
        return m303compareToLRDsOJo(this.rawValue, j);
    }

    public static int m303compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m323isNegativeimpl(j) ? -i : i;
    }

    public static final int m307getHoursComponentimpl(long j) {
        if (m322isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m309getInWholeHoursimpl(j) % 24);
    }

    public static final int m313getMinutesComponentimpl(long j) {
        if (m322isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m311getInWholeMinutesimpl(j) % 60);
    }

    public static final int m315getSecondsComponentimpl(long j) {
        if (m322isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m312getInWholeSecondsimpl(j) % 60);
    }

    public static final int m314getNanosecondsComponentimpl(long j) {
        long jM317getValueimpl;
        if (m322isInfiniteimpl(j)) {
            return 0;
        }
        if (m320isInMillisimpl(j)) {
            jM317getValueimpl = DurationKt.millisToNanos(m317getValueimpl(j) % 1000);
        } else {
            jM317getValueimpl = m317getValueimpl(j) % 1000000000;
        }
        return (int) jM317getValueimpl;
    }

    public static final long m325toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m317getValueimpl(j), m316getStorageUnitimpl(j), unit);
    }

    public static final long m308getInWholeDaysimpl(long j) {
        return m325toLongimpl(j, DurationUnit.DAYS);
    }

    public static final long m309getInWholeHoursimpl(long j) {
        return m325toLongimpl(j, DurationUnit.HOURS);
    }

    public static final long m311getInWholeMinutesimpl(long j) {
        return m325toLongimpl(j, DurationUnit.MINUTES);
    }

    public static final long m312getInWholeSecondsimpl(long j) {
        return m325toLongimpl(j, DurationUnit.SECONDS);
    }

    public static final long m310getInWholeMillisecondsimpl(long j) {
        return (m320isInMillisimpl(j) && m319isFiniteimpl(j)) ? m317getValueimpl(j) : m325toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    public String toString() {
        return m326toStringimpl(this.rawValue);
    }

    public static String m326toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM323isNegativeimpl = m323isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (zM323isNegativeimpl) {
            sb.append('-');
        }
        long jM306getAbsoluteValueUwyO8pc = m306getAbsoluteValueUwyO8pc(j);
        long jM308getInWholeDaysimpl = m308getInWholeDaysimpl(jM306getAbsoluteValueUwyO8pc);
        int iM307getHoursComponentimpl = m307getHoursComponentimpl(jM306getAbsoluteValueUwyO8pc);
        int iM313getMinutesComponentimpl = m313getMinutesComponentimpl(jM306getAbsoluteValueUwyO8pc);
        int iM315getSecondsComponentimpl = m315getSecondsComponentimpl(jM306getAbsoluteValueUwyO8pc);
        int iM314getNanosecondsComponentimpl = m314getNanosecondsComponentimpl(jM306getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = jM308getInWholeDaysimpl != 0;
        boolean z2 = iM307getHoursComponentimpl != 0;
        boolean z3 = iM313getMinutesComponentimpl != 0;
        boolean z4 = (iM315getSecondsComponentimpl == 0 && iM314getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(jM308getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM307getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM313getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM315getSecondsComponentimpl != 0 || z || z2 || z3) {
                m301appendFractionalimpl(j, sb, iM315getSecondsComponentimpl, iM314getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM314getNanosecondsComponentimpl >= 1000000) {
                m301appendFractionalimpl(j, sb, iM314getNanosecondsComponentimpl / 1000000, iM314getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (iM314getNanosecondsComponentimpl >= 1000) {
                m301appendFractionalimpl(j, sb, iM314getNanosecondsComponentimpl / 1000, iM314getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM314getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (zM323isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    private static final void m301appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
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
