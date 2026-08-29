package id;

import j7.l1;
import kotlin.jvm.internal.j;
public final class a implements Comparable {
    public static final long f8872b;
    public static final long f8873c;
    public static final int d = 0;
    public final long f8874a;

    static {
        int i10 = b.f8875a;
        f8872b = Long.MAX_VALUE;
        f8873c = -9223372036854775805L;
    }

    public static final void a(StringBuilder sb2, int i10, int i11, int i12, String str) {
        CharSequence charSequence;
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String valueOf = String.valueOf(i11);
            j.e(valueOf, "<this>");
            if (i12 >= 0) {
                if (i12 <= valueOf.length()) {
                    charSequence = valueOf.subSequence(0, valueOf.length());
                } else {
                    StringBuilder sb3 = new StringBuilder(i12);
                    int length = i12 - valueOf.length();
                    int i13 = 1;
                    if (1 <= length) {
                        while (true) {
                            sb3.append('0');
                            if (i13 == length) {
                                break;
                            }
                            i13++;
                        }
                    }
                    sb3.append((CharSequence) valueOf);
                    charSequence = sb3;
                }
                String obj = charSequence.toString();
                int i14 = -1;
                int length2 = obj.length() - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i15 = length2 - 1;
                        if (obj.charAt(length2) != '0') {
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
                    sb2.append((CharSequence) obj, 0, i16);
                } else {
                    sb2.append((CharSequence) obj, 0, ((i14 + 3) / 3) * 3);
                }
            } else {
                throw new IllegalArgumentException(l1.l(i12, "Desired length ", " is less than zero."));
            }
        }
        sb2.append(str);
    }

    public static final boolean b(long j10) {
        if (j10 != f8872b && j10 != f8873c) {
            return false;
        }
        return true;
    }

    public static final long c(long j10, c unit) {
        c sourceUnit;
        j.e(unit, "unit");
        if (j10 == f8872b) {
            return Long.MAX_VALUE;
        }
        if (j10 == f8873c) {
            return Long.MIN_VALUE;
        }
        long j11 = j10 >> 1;
        if ((((int) j10) & 1) == 0) {
            sourceUnit = c.f8876b;
        } else {
            sourceUnit = c.f8877c;
        }
        j.e(sourceUnit, "sourceUnit");
        return unit.f8881a.convert(j11, sourceUnit.f8881a);
    }

    @Override
    public final int compareTo(Object obj) {
        long j10 = ((a) obj).f8874a;
        long j11 = this.f8874a;
        long j12 = j11 ^ j10;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i10 = (((int) j11) & 1) - (1 & ((int) j10));
            if (j11 < 0) {
                return -i10;
            }
            return i10;
        }
        int i11 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i11 < 0) {
            return -1;
        }
        if (i11 != 0) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.f8874a != ((a) obj).f8874a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f8874a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        boolean z10;
        int c3;
        long j10;
        int c6;
        int c10;
        int i10;
        long j11;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        long j12 = this.f8874a;
        int i13 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        if (i13 == 0) {
            return "0s";
        }
        if (j12 == f8872b) {
            return "Infinity";
        }
        if (j12 == f8873c) {
            return "-Infinity";
        }
        if (i13 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (i13 < 0) {
            j12 = (((int) j12) & 1) + ((-(j12 >> 1)) << 1);
            int i14 = b.f8875a;
        }
        long c11 = c(j12, c.h);
        if (b(j12)) {
            c3 = 0;
        } else {
            c3 = (int) (c(j12, c.f8879f) % 24);
        }
        if (b(j12)) {
            j10 = 0;
            c6 = 0;
        } else {
            j10 = 0;
            c6 = (int) (c(j12, c.f8878e) % 60);
        }
        if (b(j12)) {
            c10 = 0;
        } else {
            c10 = (int) (c(j12, c.d) % 60);
        }
        if (b(j12)) {
            i11 = 0;
            i10 = 1;
        } else {
            if ((((int) j12) & 1) == 1) {
                i10 = 1;
                j11 = ((j12 >> 1) % 1000) * 1000000;
            } else {
                i10 = 1;
                j11 = (j12 >> 1) % 1000000000;
            }
            i11 = (int) j11;
        }
        if (c11 != j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c3 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c6 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c10 == 0 && i11 == 0) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z11) {
            sb2.append(c11);
            sb2.append('d');
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i15 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            sb2.append(c3);
            sb2.append('h');
            i12 = i15;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i16 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            sb2.append(c6);
            sb2.append('m');
            i12 = i16;
        }
        if (z14) {
            int i17 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            if (c10 == 0 && !z11 && !z12 && !z13) {
                if (i11 >= 1000000) {
                    a(sb2, i11 / 1000000, i11 % 1000000, 6, "ms");
                } else if (i11 >= 1000) {
                    a(sb2, i11 / 1000, i11 % 1000, 3, "us");
                } else {
                    sb2.append(i11);
                    sb2.append("ns");
                }
            } else {
                a(sb2, c10, i11, 9, "s");
            }
            i12 = i17;
        }
        if (z10 && i12 > i10) {
            sb2.insert(i10, '(').append(')');
        }
        return sb2.toString();
    }
}
