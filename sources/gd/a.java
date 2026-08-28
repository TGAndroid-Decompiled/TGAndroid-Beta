package gd;

import j3.r0;
import kotlin.jvm.internal.i;
public final class a implements Comparable {
    public static final long f7736b;
    public static final long f7737c;
    public static final int d = 0;
    public final long f7738a;

    static {
        int i9 = b.f7739a;
        f7736b = Long.MAX_VALUE;
        f7737c = -9223372036854775805L;
    }

    public static final void a(StringBuilder sb2, int i9, int i10, int i11, String str) {
        CharSequence charSequence;
        sb2.append(i9);
        if (i10 != 0) {
            sb2.append('.');
            String valueOf = String.valueOf(i10);
            i.e(valueOf, "<this>");
            if (i11 >= 0) {
                if (i11 <= valueOf.length()) {
                    charSequence = valueOf.subSequence(0, valueOf.length());
                } else {
                    StringBuilder sb3 = new StringBuilder(i11);
                    int length = i11 - valueOf.length();
                    int i12 = 1;
                    if (1 <= length) {
                        while (true) {
                            sb3.append('0');
                            if (i12 == length) {
                                break;
                            }
                            i12++;
                        }
                    }
                    sb3.append((CharSequence) valueOf);
                    charSequence = sb3;
                }
                String obj = charSequence.toString();
                int i13 = -1;
                int length2 = obj.length() - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i14 = length2 - 1;
                        if (obj.charAt(length2) != '0') {
                            i13 = length2;
                            break;
                        } else if (i14 < 0) {
                            break;
                        } else {
                            length2 = i14;
                        }
                    }
                }
                int i15 = i13 + 1;
                if (i15 < 3) {
                    sb2.append((CharSequence) obj, 0, i15);
                } else {
                    sb2.append((CharSequence) obj, 0, ((i13 + 3) / 3) * 3);
                }
            } else {
                throw new IllegalArgumentException(r0.m(i11, "Desired length ", " is less than zero."));
            }
        }
        sb2.append(str);
    }

    public static final boolean b(long j10) {
        if (j10 != f7736b && j10 != f7737c) {
            return false;
        }
        return true;
    }

    public static final long c(long j10, c unit) {
        c sourceUnit;
        i.e(unit, "unit");
        if (j10 == f7736b) {
            return Long.MAX_VALUE;
        }
        if (j10 == f7737c) {
            return Long.MIN_VALUE;
        }
        long j11 = j10 >> 1;
        if ((((int) j10) & 1) == 0) {
            sourceUnit = c.f7740b;
        } else {
            sourceUnit = c.f7741c;
        }
        i.e(sourceUnit, "sourceUnit");
        return unit.f7745a.convert(j11, sourceUnit.f7745a);
    }

    @Override
    public final int compareTo(Object obj) {
        long j10 = ((a) obj).f7738a;
        long j11 = this.f7738a;
        long j12 = j11 ^ j10;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i9 = (((int) j11) & 1) - (1 & ((int) j10));
            if (j11 < 0) {
                return -i9;
            }
            return i9;
        }
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 != 0) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.f7738a != ((a) obj).f7738a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f7738a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        boolean z10;
        int c10;
        long j10;
        int c11;
        int c12;
        int i9;
        long j11;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        long j12 = this.f7738a;
        int i12 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        if (i12 == 0) {
            return "0s";
        }
        if (j12 == f7736b) {
            return "Infinity";
        }
        if (j12 == f7737c) {
            return "-Infinity";
        }
        if (i12 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (i12 < 0) {
            j12 = (((int) j12) & 1) + ((-(j12 >> 1)) << 1);
            int i13 = b.f7739a;
        }
        long c13 = c(j12, c.h);
        if (b(j12)) {
            c10 = 0;
        } else {
            c10 = (int) (c(j12, c.f7743f) % 24);
        }
        if (b(j12)) {
            j10 = 0;
            c11 = 0;
        } else {
            j10 = 0;
            c11 = (int) (c(j12, c.f7742e) % 60);
        }
        if (b(j12)) {
            c12 = 0;
        } else {
            c12 = (int) (c(j12, c.d) % 60);
        }
        if (b(j12)) {
            i10 = 0;
            i9 = 1;
        } else {
            if ((((int) j12) & 1) == 1) {
                i9 = 1;
                j11 = ((j12 >> 1) % 1000) * 1000000;
            } else {
                i9 = 1;
                j11 = (j12 >> 1) % 1000000000;
            }
            i10 = (int) j11;
        }
        if (c13 != j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c11 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c12 == 0 && i10 == 0) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z11) {
            sb2.append(c13);
            sb2.append('d');
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i14 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(c10);
            sb2.append('h');
            i11 = i14;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i15 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(c11);
            sb2.append('m');
            i11 = i15;
        }
        if (z14) {
            int i16 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (c12 == 0 && !z11 && !z12 && !z13) {
                if (i10 >= 1000000) {
                    a(sb2, i10 / 1000000, i10 % 1000000, 6, "ms");
                } else if (i10 >= 1000) {
                    a(sb2, i10 / 1000, i10 % 1000, 3, "us");
                } else {
                    sb2.append(i10);
                    sb2.append("ns");
                }
            } else {
                a(sb2, c12, i10, 9, "s");
            }
            i11 = i16;
        }
        if (z10 && i11 > i9) {
            sb2.insert(i9, '(').append(')');
        }
        return sb2.toString();
    }
}
