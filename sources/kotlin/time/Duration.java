package kotlin.time;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

public final class Duration implements Comparable {
    public static final int $r8$clinit = 0;
    public static final long INFINITE;
    public static final long NEG_INFINITE;
    public final long rawValue;

    static {
        int i = DurationJvmKt.$r8$clinit;
        INFINITE = Long.MAX_VALUE;
        NEG_INFINITE = -9223372036854775805L;
    }

    public static final void m140appendFractionalimpl(StringBuilder sb, int i, int i2, int i3, String str) {
        CharSequence charSequenceSubSequence;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i2);
            Intrinsics.checkNotNullParameter(strValueOf, "<this>");
            if (i3 < 0) {
                throw new IllegalArgumentException(SurfaceContainer$$ExternalSyntheticOutline0.m(i3, "Desired length ", " is less than zero."));
            }
            if (i3 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i3);
                int length = i3 - strValueOf.length();
                int i4 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i5 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i5 = length2;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length2 = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (i7 < 3) {
                sb.append((CharSequence) string, 0, i7);
            } else {
                sb.append((CharSequence) string, 0, ((i5 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    public static final boolean m141isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final long m142toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        DurationUnit sourceUnit = (((int) j) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        return unit.timeUnit.convert(j2, sourceUnit.timeUnit);
    }

    @Override
    public final int compareTo(Object obj) {
        long j = ((Duration) obj).rawValue;
        long j2 = this.rawValue;
        long j3 = j2 ^ j;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j2) & 1) - (1 & ((int) j));
            return j2 < 0 ? -i : i;
        }
        if (j2 < j) {
            return -1;
        }
        return j2 == j ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Duration) {
            return this.rawValue == ((Duration) obj).rawValue;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.rawValue;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        int i;
        int i2;
        int i3;
        long j = this.rawValue;
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = ((long) (((int) j) & 1)) + ((-(j >> 1)) << 1);
            int i4 = DurationJvmKt.$r8$clinit;
        }
        long jM142toLongimpl = m142toLongimpl(j, DurationUnit.DAYS);
        int iM142toLongimpl = m141isInfiniteimpl(j) ? 0 : (int) (m142toLongimpl(j, DurationUnit.HOURS) % ((long) 24));
        int iM142toLongimpl2 = m141isInfiniteimpl(j) ? 0 : (int) (m142toLongimpl(j, DurationUnit.MINUTES) % ((long) 60));
        int iM142toLongimpl3 = m141isInfiniteimpl(j) ? 0 : (int) (m142toLongimpl(j, DurationUnit.SECONDS) % ((long) 60));
        if (m141isInfiniteimpl(j)) {
            i2 = 0;
            i = 1;
        } else if ((((int) j) & 1) == 1) {
            i = 1;
            i2 = (int) (((j >> 1) % ((long) 1000)) * ((long) 1000000));
        } else {
            i = 1;
            i2 = (int) ((j >> 1) % ((long) 1000000000));
        }
        boolean z2 = jM142toLongimpl != 0;
        boolean z3 = iM142toLongimpl != 0;
        boolean z4 = iM142toLongimpl2 != 0;
        boolean z5 = (iM142toLongimpl3 == 0 && i2 == 0) ? false : true;
        if (z2) {
            sb.append(jM142toLongimpl);
            sb.append('d');
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i5 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            sb.append(iM142toLongimpl);
            sb.append('h');
            i3 = i5;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i6 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            sb.append(iM142toLongimpl2);
            sb.append('m');
            i3 = i6;
        }
        if (z5) {
            int i7 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            if (iM142toLongimpl3 != 0 || z2 || z3 || z4) {
                m140appendFractionalimpl(sb, iM142toLongimpl3, i2, 9, "s");
            } else if (i2 >= 1000000) {
                m140appendFractionalimpl(sb, i2 / 1000000, i2 % 1000000, 6, "ms");
            } else if (i2 >= 1000) {
                m140appendFractionalimpl(sb, i2 / 1000, i2 % 1000, 3, "us");
            } else {
                sb.append(i2);
                sb.append("ns");
            }
            i3 = i7;
        }
        if (z && i3 > i) {
            sb.insert(i, '(').append(')');
        }
        return sb.toString();
    }
}
