package kotlin.time;

import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class Duration implements Comparable {
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m313constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(4611686018427387903L);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    public static final Duration m311boximpl(long j) {
        return new Duration(j);
    }

    public static boolean m314equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m338unboximpl();
    }

    private static final long m326getValueimpl(long j) {
        return j >> 1;
    }

    public static int m327hashCodeimpl(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    private static final boolean m329isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean m330isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean m332isNegativeimpl(long j) {
        return j < 0;
    }

    public static final boolean m333isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(Object obj) {
        return m314equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m327hashCodeimpl(this.rawValue);
    }

    public final long m338unboximpl() {
        return this.rawValue;
    }

    @Override
    public int compareTo(Object obj) {
        return m337compareToLRDsOJo(((Duration) obj).m338unboximpl());
    }

    private Duration(long j) {
        this.rawValue = j;
    }

    private static final DurationUnit m325getStorageUnitimpl(long j) {
        return m330isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static long m313constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m330isInNanosimpl(j)) {
                long jM326getValueimpl = m326getValueimpl(j);
                if (-4611686018426999999L > jM326getValueimpl || jM326getValueimpl >= 4611686018427000000L) {
                    throw new AssertionError(m326getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                long jM326getValueimpl2 = m326getValueimpl(j);
                if (-4611686018427387903L > jM326getValueimpl2 || jM326getValueimpl2 >= 4611686018427387904L) {
                    throw new AssertionError(m326getValueimpl(j) + " ms is out of milliseconds range");
                }
                long jM326getValueimpl3 = m326getValueimpl(j);
                if (-4611686018426L <= jM326getValueimpl3 && jM326getValueimpl3 < 4611686018427L) {
                    throw new AssertionError(m326getValueimpl(j) + " ms is denormalized");
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

    public static final long m336unaryMinusUwyO8pc(long j) {
        return DurationKt.durationOf(-m326getValueimpl(j), ((int) j) & 1);
    }

    public static final boolean m331isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final boolean m328isFiniteimpl(long j) {
        return !m331isInfiniteimpl(j);
    }

    public static final long m315getAbsoluteValueUwyO8pc(long j) {
        return m332isNegativeimpl(j) ? m336unaryMinusUwyO8pc(j) : j;
    }

    public int m337compareToLRDsOJo(long j) {
        return m312compareToLRDsOJo(this.rawValue, j);
    }

    public static int m312compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m332isNegativeimpl(j) ? -i : i;
    }

    public static final int m316getHoursComponentimpl(long j) {
        if (m331isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m318getInWholeHoursimpl(j) % 24);
    }

    public static final int m322getMinutesComponentimpl(long j) {
        if (m331isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m320getInWholeMinutesimpl(j) % 60);
    }

    public static final int m324getSecondsComponentimpl(long j) {
        if (m331isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m321getInWholeSecondsimpl(j) % 60);
    }

    public static final int m323getNanosecondsComponentimpl(long j) {
        long jM326getValueimpl;
        if (m331isInfiniteimpl(j)) {
            return 0;
        }
        if (m329isInMillisimpl(j)) {
            jM326getValueimpl = DurationKt.millisToNanos(m326getValueimpl(j) % 1000);
        } else {
            jM326getValueimpl = m326getValueimpl(j) % 1000000000;
        }
        return (int) jM326getValueimpl;
    }

    public static final long m334toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m326getValueimpl(j), m325getStorageUnitimpl(j), unit);
    }

    public static final long m317getInWholeDaysimpl(long j) {
        return m334toLongimpl(j, DurationUnit.DAYS);
    }

    public static final long m318getInWholeHoursimpl(long j) {
        return m334toLongimpl(j, DurationUnit.HOURS);
    }

    public static final long m320getInWholeMinutesimpl(long j) {
        return m334toLongimpl(j, DurationUnit.MINUTES);
    }

    public static final long m321getInWholeSecondsimpl(long j) {
        return m334toLongimpl(j, DurationUnit.SECONDS);
    }

    public static final long m319getInWholeMillisecondsimpl(long j) {
        return (m329isInMillisimpl(j) && m328isFiniteimpl(j)) ? m326getValueimpl(j) : m334toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    public String toString() {
        return m335toStringimpl(this.rawValue);
    }

    public static String m335toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM332isNegativeimpl = m332isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (zM332isNegativeimpl) {
            sb.append('-');
        }
        long jM315getAbsoluteValueUwyO8pc = m315getAbsoluteValueUwyO8pc(j);
        long jM317getInWholeDaysimpl = m317getInWholeDaysimpl(jM315getAbsoluteValueUwyO8pc);
        int iM316getHoursComponentimpl = m316getHoursComponentimpl(jM315getAbsoluteValueUwyO8pc);
        int iM322getMinutesComponentimpl = m322getMinutesComponentimpl(jM315getAbsoluteValueUwyO8pc);
        int iM324getSecondsComponentimpl = m324getSecondsComponentimpl(jM315getAbsoluteValueUwyO8pc);
        int iM323getNanosecondsComponentimpl = m323getNanosecondsComponentimpl(jM315getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = jM317getInWholeDaysimpl != 0;
        boolean z2 = iM316getHoursComponentimpl != 0;
        boolean z3 = iM322getMinutesComponentimpl != 0;
        boolean z4 = (iM324getSecondsComponentimpl == 0 && iM323getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(jM317getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM316getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM322getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM324getSecondsComponentimpl != 0 || z || z2 || z3) {
                m310appendFractionalimpl(j, sb, iM324getSecondsComponentimpl, iM323getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM323getNanosecondsComponentimpl >= 1000000) {
                m310appendFractionalimpl(j, sb, iM323getNanosecondsComponentimpl / 1000000, iM323getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (iM323getNanosecondsComponentimpl >= 1000) {
                m310appendFractionalimpl(j, sb, iM323getNanosecondsComponentimpl / 1000, iM323getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM323getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (zM332isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    private static final void m310appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
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
