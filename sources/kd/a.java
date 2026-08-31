package kd;

import kotlin.jvm.internal.j;
import l.d;
public final class a implements Comparable {
    public static final long f11092b;
    public static final long f11093c;
    public static final int d = 0;
    public final long f11094a;

    static {
        int i10 = b.f11095a;
        f11092b = Long.MAX_VALUE;
        f11093c = -9223372036854775805L;
    }

    public static final void a(StringBuilder sb, int i10, int i11, int i12, String str) {
        CharSequence charSequence;
        sb.append(i10);
        if (i11 != 0) {
            sb.append('.');
            String valueOf = String.valueOf(i11);
            j.e(valueOf, "<this>");
            if (i12 >= 0) {
                if (i12 <= valueOf.length()) {
                    charSequence = valueOf.subSequence(0, valueOf.length());
                } else {
                    StringBuilder sb2 = new StringBuilder(i12);
                    int length = i12 - valueOf.length();
                    int i13 = 1;
                    if (1 <= length) {
                        while (true) {
                            sb2.append('0');
                            if (i13 == length) {
                                break;
                            }
                            i13++;
                        }
                    }
                    sb2.append((CharSequence) valueOf);
                    charSequence = sb2;
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
                    sb.append((CharSequence) obj, 0, i16);
                } else {
                    sb.append((CharSequence) obj, 0, ((i14 + 3) / 3) * 3);
                }
            } else {
                throw new IllegalArgumentException(d.k(i12, "Desired length ", " is less than zero."));
            }
        }
        sb.append(str);
    }

    public static final boolean b(long j10) {
        if (j10 != f11092b && j10 != f11093c) {
            return false;
        }
        return true;
    }

    public static final long c(long j10, c unit) {
        c sourceUnit;
        j.e(unit, "unit");
        if (j10 == f11092b) {
            return Long.MAX_VALUE;
        }
        if (j10 == f11093c) {
            return Long.MIN_VALUE;
        }
        long j11 = j10 >> 1;
        if ((((int) j10) & 1) == 0) {
            sourceUnit = c.f11096b;
        } else {
            sourceUnit = c.f11097c;
        }
        j.e(sourceUnit, "sourceUnit");
        return unit.f11101a.convert(j11, sourceUnit.f11101a);
    }

    @Override
    public final int compareTo(Object obj) {
        long j10 = ((a) obj).f11094a;
        long j11 = this.f11094a;
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
            if (this.f11094a != ((a) obj).f11094a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f11094a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        boolean z4;
        int c3;
        long j10;
        int c10;
        int c11;
        int i10;
        long j11;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        long j12 = this.f11094a;
        int i13 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        if (i13 == 0) {
            return "0s";
        }
        if (j12 == f11092b) {
            return "Infinity";
        }
        if (j12 == f11093c) {
            return "-Infinity";
        }
        if (i13 < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z4) {
            sb.append('-');
        }
        if (i13 < 0) {
            j12 = (((int) j12) & 1) + ((-(j12 >> 1)) << 1);
            int i14 = b.f11095a;
        }
        long c12 = c(j12, c.h);
        if (b(j12)) {
            c3 = 0;
        } else {
            c3 = (int) (c(j12, c.f11099f) % 24);
        }
        if (b(j12)) {
            j10 = 0;
            c10 = 0;
        } else {
            j10 = 0;
            c10 = (int) (c(j12, c.f11098e) % 60);
        }
        if (b(j12)) {
            c11 = 0;
        } else {
            c11 = (int) (c(j12, c.d) % 60);
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
        if (c12 != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c3 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c11 == 0 && i11 == 0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z10) {
            sb.append(c12);
            sb.append('d');
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i15 = i12 + 1;
            if (i12 > 0) {
                sb.append(' ');
            }
            sb.append(c3);
            sb.append('h');
            i12 = i15;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i16 = i12 + 1;
            if (i12 > 0) {
                sb.append(' ');
            }
            sb.append(c10);
            sb.append('m');
            i12 = i16;
        }
        if (z13) {
            int i17 = i12 + 1;
            if (i12 > 0) {
                sb.append(' ');
            }
            if (c11 == 0 && !z10 && !z11 && !z12) {
                if (i11 >= 1000000) {
                    a(sb, i11 / 1000000, i11 % 1000000, 6, "ms");
                } else if (i11 >= 1000) {
                    a(sb, i11 / 1000, i11 % 1000, 3, "us");
                } else {
                    sb.append(i11);
                    sb.append("ns");
                }
            } else {
                a(sb, c11, i11, 9, "s");
            }
            i12 = i17;
        }
        if (z4 && i12 > i10) {
            sb.insert(i10, '(').append(')');
        }
        return sb.toString();
    }
}
