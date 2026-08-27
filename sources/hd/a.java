package hd;

import kotlin.jvm.internal.j;

public final class a implements Comparable {

    public static final long f8908b;

    public static final long f8909c;
    public static final int d = 0;

    public final long f8910a;

    static {
        int i10 = b.f8911a;
        f8908b = Long.MAX_VALUE;
        f8909c = -9223372036854775805L;
    }

    public static final void a(StringBuilder sb2, int i10, int i11, int i12, String str) {
        CharSequence charSequenceSubSequence;
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strValueOf = String.valueOf(i11);
            j.e(strValueOf, "<this>");
            if (i12 < 0) {
                throw new IllegalArgumentException(i0.a.l(i12, "Desired length ", " is less than zero."));
            }
            if (i12 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb3 = new StringBuilder(i12);
                int length = i12 - strValueOf.length();
                int i13 = 1;
                if (1 <= length) {
                    while (true) {
                        sb3.append('0');
                        if (i13 == length) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                sb3.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb3;
            }
            String string = charSequenceSubSequence.toString();
            int i14 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i15 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i14 = length2;
                        break;
                    } else if (i15 < 0) {
                        break;
                    } else {
                        length2 = i15;
                    }
                }
            }
            int i16 = i14 + 1;
            if (i16 < 3) {
                sb2.append((CharSequence) string, 0, i16);
            } else {
                sb2.append((CharSequence) string, 0, ((i14 + 3) / 3) * 3);
            }
        }
        sb2.append(str);
    }

    public static final boolean b(long j10) {
        return j10 == f8908b || j10 == f8909c;
    }

    public static final long c(long j10, c unit) {
        j.e(unit, "unit");
        if (j10 == f8908b) {
            return Long.MAX_VALUE;
        }
        if (j10 == f8909c) {
            return Long.MIN_VALUE;
        }
        long j11 = j10 >> 1;
        c sourceUnit = (((int) j10) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS;
        j.e(sourceUnit, "sourceUnit");
        return unit.f8917a.convert(j11, sourceUnit.f8917a);
    }

    @Override
    public final int compareTo(Object obj) {
        long j10 = ((a) obj).f8910a;
        long j11 = this.f8910a;
        long j12 = j11 ^ j10;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i10 = (((int) j11) & 1) - (1 & ((int) j10));
            return j11 < 0 ? -i10 : i10;
        }
        if (j11 < j10) {
            return -1;
        }
        return j11 == j10 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f8910a == ((a) obj).f8910a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f8910a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        int i10;
        long j10;
        int i11;
        int i12;
        long j11 = this.f8910a;
        if (j11 == 0) {
            return "0s";
        }
        if (j11 == f8908b) {
            return "Infinity";
        }
        if (j11 == f8909c) {
            return "-Infinity";
        }
        boolean z10 = j11 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (j11 < 0) {
            j11 = ((long) (((int) j11) & 1)) + ((-(j11 >> 1)) << 1);
            int i13 = b.f8911a;
        }
        long jC = c(j11, c.DAYS);
        int iC = b(j11) ? 0 : (int) (c(j11, c.HOURS) % ((long) 24));
        int iC2 = b(j11) ? 0 : (int) (c(j11, c.MINUTES) % ((long) 60));
        int iC3 = b(j11) ? 0 : (int) (c(j11, c.SECONDS) % ((long) 60));
        if (b(j11)) {
            i11 = 0;
            i10 = 1;
        } else {
            if ((((int) j11) & 1) == 1) {
                i10 = 1;
                j10 = ((j11 >> 1) % ((long) 1000)) * ((long) 1000000);
            } else {
                i10 = 1;
                j10 = (j11 >> 1) % ((long) 1000000000);
            }
            i11 = (int) j10;
        }
        boolean z11 = jC != 0;
        boolean z12 = iC != 0;
        boolean z13 = iC2 != 0;
        boolean z14 = (iC3 == 0 && i11 == 0) ? false : true;
        if (z11) {
            sb2.append(jC);
            sb2.append('d');
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i14 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            sb2.append(iC);
            sb2.append('h');
            i12 = i14;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i15 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            sb2.append(iC2);
            sb2.append('m');
            i12 = i15;
        }
        if (z14) {
            int i16 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            if (iC3 != 0 || z11 || z12 || z13) {
                a(sb2, iC3, i11, 9, "s");
            } else if (i11 >= 1000000) {
                a(sb2, i11 / 1000000, i11 % 1000000, 6, "ms");
            } else if (i11 >= 1000) {
                a(sb2, i11 / 1000, i11 % 1000, 3, "us");
            } else {
                sb2.append(i11);
                sb2.append("ns");
            }
            i12 = i16;
        }
        if (z10 && i12 > i10) {
            sb2.insert(i10, '(').append(')');
        }
        return sb2.toString();
    }
}
