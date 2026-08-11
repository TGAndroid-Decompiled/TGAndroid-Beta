package kotlin.time;

import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class Duration implements Comparable {
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m303constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(4611686018427387903L);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    public static final Duration m301boximpl(long j) {
        return new Duration(j);
    }

    public static boolean m304equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m328unboximpl();
    }

    private static final long m316getValueimpl(long j) {
        return j >> 1;
    }

    public static int m317hashCodeimpl(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    private static final boolean m319isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean m320isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean m322isNegativeimpl(long j) {
        return j < 0;
    }

    public static final boolean m323isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(Object obj) {
        return m304equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m317hashCodeimpl(this.rawValue);
    }

    public final long m328unboximpl() {
        return this.rawValue;
    }

    @Override
    public int compareTo(Object obj) {
        return m327compareToLRDsOJo(((Duration) obj).m328unboximpl());
    }

    private Duration(long j) {
        this.rawValue = j;
    }

    private static final DurationUnit m315getStorageUnitimpl(long j) {
        return m320isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static long m303constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m320isInNanosimpl(j)) {
                long jM316getValueimpl = m316getValueimpl(j);
                if (-4611686018426999999L > jM316getValueimpl || jM316getValueimpl >= 4611686018427000000L) {
                    throw new AssertionError(m316getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                long jM316getValueimpl2 = m316getValueimpl(j);
                if (-4611686018427387903L > jM316getValueimpl2 || jM316getValueimpl2 >= 4611686018427387904L) {
                    throw new AssertionError(m316getValueimpl(j) + " ms is out of milliseconds range");
                }
                long jM316getValueimpl3 = m316getValueimpl(j);
                if (-4611686018426L <= jM316getValueimpl3 && jM316getValueimpl3 < 4611686018427L) {
                    throw new AssertionError(m316getValueimpl(j) + " ms is denormalized");
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

    public static final long m326unaryMinusUwyO8pc(long j) {
        return DurationKt.durationOf(-m316getValueimpl(j), ((int) j) & 1);
    }

    public static final boolean m321isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final boolean m318isFiniteimpl(long j) {
        return !m321isInfiniteimpl(j);
    }

    public static final long m305getAbsoluteValueUwyO8pc(long j) {
        return m322isNegativeimpl(j) ? m326unaryMinusUwyO8pc(j) : j;
    }

    public int m327compareToLRDsOJo(long j) {
        return m302compareToLRDsOJo(this.rawValue, j);
    }

    public static int m302compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m322isNegativeimpl(j) ? -i : i;
    }

    public static final int m306getHoursComponentimpl(long j) {
        if (m321isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m308getInWholeHoursimpl(j) % 24);
    }

    public static final int m312getMinutesComponentimpl(long j) {
        if (m321isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m310getInWholeMinutesimpl(j) % 60);
    }

    public static final int m314getSecondsComponentimpl(long j) {
        if (m321isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m311getInWholeSecondsimpl(j) % 60);
    }

    public static final int m313getNanosecondsComponentimpl(long j) {
        long jM316getValueimpl;
        if (m321isInfiniteimpl(j)) {
            return 0;
        }
        if (m319isInMillisimpl(j)) {
            jM316getValueimpl = DurationKt.millisToNanos(m316getValueimpl(j) % 1000);
        } else {
            jM316getValueimpl = m316getValueimpl(j) % 1000000000;
        }
        return (int) jM316getValueimpl;
    }

    public static final long m324toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m316getValueimpl(j), m315getStorageUnitimpl(j), unit);
    }

    public static final long m307getInWholeDaysimpl(long j) {
        return m324toLongimpl(j, DurationUnit.DAYS);
    }

    public static final long m308getInWholeHoursimpl(long j) {
        return m324toLongimpl(j, DurationUnit.HOURS);
    }

    public static final long m310getInWholeMinutesimpl(long j) {
        return m324toLongimpl(j, DurationUnit.MINUTES);
    }

    public static final long m311getInWholeSecondsimpl(long j) {
        return m324toLongimpl(j, DurationUnit.SECONDS);
    }

    public static final long m309getInWholeMillisecondsimpl(long j) {
        return (m319isInMillisimpl(j) && m318isFiniteimpl(j)) ? m316getValueimpl(j) : m324toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    public String toString() {
        return m325toStringimpl(this.rawValue);
    }

    public static String m325toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM322isNegativeimpl = m322isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (zM322isNegativeimpl) {
            sb.append('-');
        }
        long jM305getAbsoluteValueUwyO8pc = m305getAbsoluteValueUwyO8pc(j);
        long jM307getInWholeDaysimpl = m307getInWholeDaysimpl(jM305getAbsoluteValueUwyO8pc);
        int iM306getHoursComponentimpl = m306getHoursComponentimpl(jM305getAbsoluteValueUwyO8pc);
        int iM312getMinutesComponentimpl = m312getMinutesComponentimpl(jM305getAbsoluteValueUwyO8pc);
        int iM314getSecondsComponentimpl = m314getSecondsComponentimpl(jM305getAbsoluteValueUwyO8pc);
        int iM313getNanosecondsComponentimpl = m313getNanosecondsComponentimpl(jM305getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = jM307getInWholeDaysimpl != 0;
        boolean z2 = iM306getHoursComponentimpl != 0;
        boolean z3 = iM312getMinutesComponentimpl != 0;
        boolean z4 = (iM314getSecondsComponentimpl == 0 && iM313getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(jM307getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM306getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM312getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM314getSecondsComponentimpl != 0 || z || z2 || z3) {
                m300appendFractionalimpl(j, sb, iM314getSecondsComponentimpl, iM313getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM313getNanosecondsComponentimpl >= 1000000) {
                m300appendFractionalimpl(j, sb, iM313getNanosecondsComponentimpl / 1000000, iM313getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (iM313getNanosecondsComponentimpl >= 1000) {
                m300appendFractionalimpl(j, sb, iM313getNanosecondsComponentimpl / 1000, iM313getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM313getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (zM322isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    private static final void m300appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
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
