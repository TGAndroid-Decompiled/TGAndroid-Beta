package kotlin.time;

import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class Duration implements Comparable {
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m320constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(4611686018427387903L);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    public static final Duration m318boximpl(long j) {
        return new Duration(j);
    }

    public static boolean m321equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m345unboximpl();
    }

    private static final long m333getValueimpl(long j) {
        return j >> 1;
    }

    public static int m334hashCodeimpl(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    private static final boolean m336isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean m337isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean m339isNegativeimpl(long j) {
        return j < 0;
    }

    public static final boolean m340isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(Object obj) {
        return m321equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m334hashCodeimpl(this.rawValue);
    }

    public final long m345unboximpl() {
        return this.rawValue;
    }

    @Override
    public int compareTo(Object obj) {
        return m344compareToLRDsOJo(((Duration) obj).m345unboximpl());
    }

    private Duration(long j) {
        this.rawValue = j;
    }

    private static final DurationUnit m332getStorageUnitimpl(long j) {
        return m337isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static long m320constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m337isInNanosimpl(j)) {
                long jM333getValueimpl = m333getValueimpl(j);
                if (-4611686018426999999L > jM333getValueimpl || jM333getValueimpl >= 4611686018427000000L) {
                    throw new AssertionError(m333getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                long jM333getValueimpl2 = m333getValueimpl(j);
                if (-4611686018427387903L > jM333getValueimpl2 || jM333getValueimpl2 >= 4611686018427387904L) {
                    throw new AssertionError(m333getValueimpl(j) + " ms is out of milliseconds range");
                }
                long jM333getValueimpl3 = m333getValueimpl(j);
                if (-4611686018426L <= jM333getValueimpl3 && jM333getValueimpl3 < 4611686018427L) {
                    throw new AssertionError(m333getValueimpl(j) + " ms is denormalized");
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

    public static final long m343unaryMinusUwyO8pc(long j) {
        return DurationKt.durationOf(-m333getValueimpl(j), ((int) j) & 1);
    }

    public static final boolean m338isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final boolean m335isFiniteimpl(long j) {
        return !m338isInfiniteimpl(j);
    }

    public static final long m322getAbsoluteValueUwyO8pc(long j) {
        return m339isNegativeimpl(j) ? m343unaryMinusUwyO8pc(j) : j;
    }

    public int m344compareToLRDsOJo(long j) {
        return m319compareToLRDsOJo(this.rawValue, j);
    }

    public static int m319compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m339isNegativeimpl(j) ? -i : i;
    }

    public static final int m323getHoursComponentimpl(long j) {
        if (m338isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m325getInWholeHoursimpl(j) % 24);
    }

    public static final int m329getMinutesComponentimpl(long j) {
        if (m338isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m327getInWholeMinutesimpl(j) % 60);
    }

    public static final int m331getSecondsComponentimpl(long j) {
        if (m338isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m328getInWholeSecondsimpl(j) % 60);
    }

    public static final int m330getNanosecondsComponentimpl(long j) {
        long jM333getValueimpl;
        if (m338isInfiniteimpl(j)) {
            return 0;
        }
        if (m336isInMillisimpl(j)) {
            jM333getValueimpl = DurationKt.millisToNanos(m333getValueimpl(j) % 1000);
        } else {
            jM333getValueimpl = m333getValueimpl(j) % 1000000000;
        }
        return (int) jM333getValueimpl;
    }

    public static final long m341toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m333getValueimpl(j), m332getStorageUnitimpl(j), unit);
    }

    public static final long m324getInWholeDaysimpl(long j) {
        return m341toLongimpl(j, DurationUnit.DAYS);
    }

    public static final long m325getInWholeHoursimpl(long j) {
        return m341toLongimpl(j, DurationUnit.HOURS);
    }

    public static final long m327getInWholeMinutesimpl(long j) {
        return m341toLongimpl(j, DurationUnit.MINUTES);
    }

    public static final long m328getInWholeSecondsimpl(long j) {
        return m341toLongimpl(j, DurationUnit.SECONDS);
    }

    public static final long m326getInWholeMillisecondsimpl(long j) {
        return (m336isInMillisimpl(j) && m335isFiniteimpl(j)) ? m333getValueimpl(j) : m341toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    public String toString() {
        return m342toStringimpl(this.rawValue);
    }

    public static String m342toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM339isNegativeimpl = m339isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (zM339isNegativeimpl) {
            sb.append('-');
        }
        long jM322getAbsoluteValueUwyO8pc = m322getAbsoluteValueUwyO8pc(j);
        long jM324getInWholeDaysimpl = m324getInWholeDaysimpl(jM322getAbsoluteValueUwyO8pc);
        int iM323getHoursComponentimpl = m323getHoursComponentimpl(jM322getAbsoluteValueUwyO8pc);
        int iM329getMinutesComponentimpl = m329getMinutesComponentimpl(jM322getAbsoluteValueUwyO8pc);
        int iM331getSecondsComponentimpl = m331getSecondsComponentimpl(jM322getAbsoluteValueUwyO8pc);
        int iM330getNanosecondsComponentimpl = m330getNanosecondsComponentimpl(jM322getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = jM324getInWholeDaysimpl != 0;
        boolean z2 = iM323getHoursComponentimpl != 0;
        boolean z3 = iM329getMinutesComponentimpl != 0;
        boolean z4 = (iM331getSecondsComponentimpl == 0 && iM330getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(jM324getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM323getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM329getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM331getSecondsComponentimpl != 0 || z || z2 || z3) {
                m317appendFractionalimpl(j, sb, iM331getSecondsComponentimpl, iM330getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM330getNanosecondsComponentimpl >= 1000000) {
                m317appendFractionalimpl(j, sb, iM330getNanosecondsComponentimpl / 1000000, iM330getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (iM330getNanosecondsComponentimpl >= 1000) {
                m317appendFractionalimpl(j, sb, iM330getNanosecondsComponentimpl / 1000, iM330getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM330getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (zM339isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    private static final void m317appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
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
