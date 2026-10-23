package ae;

import i2.o1;
import kotlin.jvm.internal.i;
public final class a implements Comparable {
    public static final long f540b;
    public static final long f541c;
    public static final int d = 0;
    public final long f542a;

    static {
        int i10 = b.f543a;
        f540b = Long.MAX_VALUE;
        f541c = -9223372036854775805L;
    }

    public static final void a(StringBuilder sb2, int i10, int i11, int i12, String str) {
        CharSequence charSequence;
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String valueOf = String.valueOf(i11);
            i.e(valueOf, "<this>");
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
                throw new IllegalArgumentException(o1.l(i12, "Desired length ", " is less than zero."));
            }
        }
        sb2.append(str);
    }

    public static final boolean b(long j10) {
        if (j10 != f540b && j10 != f541c) {
            return false;
        }
        return true;
    }

    public static final long c(long j10, c unit) {
        c sourceUnit;
        i.e(unit, "unit");
        if (j10 == f540b) {
            return Long.MAX_VALUE;
        }
        if (j10 == f541c) {
            return Long.MIN_VALUE;
        }
        long j11 = j10 >> 1;
        if ((((int) j10) & 1) == 0) {
            sourceUnit = c.f544b;
        } else {
            sourceUnit = c.f545c;
        }
        i.e(sourceUnit, "sourceUnit");
        return unit.f548a.convert(j11, sourceUnit.f548a);
    }

    @Override
    public final int compareTo(Object obj) {
        long j10 = ((a) obj).f542a;
        long j11 = this.f542a;
        long j12 = j11 ^ j10;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i10 = (((int) j11) & 1) - (((int) j10) & 1);
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
            if (this.f542a != ((a) obj).f542a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f542a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        boolean z10;
        int c10;
        long j10;
        int c11;
        int c12;
        int i10;
        long j11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j12 = this.f542a;
        int i17 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        if (i17 == 0) {
            return "0s";
        }
        if (j12 == f540b) {
            return "Infinity";
        }
        if (j12 == f541c) {
            return "-Infinity";
        }
        if (i17 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (i17 < 0) {
            j12 = (((int) j12) & 1) + ((-(j12 >> 1)) << 1);
            int i18 = b.f543a;
        }
        long c13 = c(j12, c.h);
        if (b(j12)) {
            c10 = 0;
        } else {
            c10 = (int) (c(j12, c.f546f) % 24);
        }
        if (b(j12)) {
            j10 = 0;
            c11 = 0;
        } else {
            j10 = 0;
            c11 = (int) (c(j12, c.e) % 60);
        }
        if (b(j12)) {
            c12 = 0;
        } else {
            c12 = (int) (c(j12, c.d) % 60);
        }
        if (b(j12)) {
            i10 = 1;
            i11 = 0;
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
        if (c13 != j10) {
            i12 = i10;
        } else {
            i12 = 0;
        }
        if (c10 != 0) {
            i13 = i10;
        } else {
            i13 = 0;
        }
        if (c11 != 0) {
            i14 = i10;
        } else {
            i14 = 0;
        }
        if (c12 == 0 && i11 == 0) {
            i15 = 0;
        } else {
            i15 = i10;
        }
        if (i12 != 0) {
            sb2.append(c13);
            sb2.append('d');
            i16 = i10;
        } else {
            i16 = 0;
        }
        if (i13 != 0 || (i12 != 0 && (i14 != 0 || i15 != 0))) {
            int i19 = i16 + 1;
            if (i16 > 0) {
                sb2.append(' ');
            }
            sb2.append(c10);
            sb2.append('h');
            i16 = i19;
        }
        if (i14 != 0 || (i15 != 0 && (i13 != 0 || i12 != 0))) {
            int i20 = i16 + 1;
            if (i16 > 0) {
                sb2.append(' ');
            }
            sb2.append(c11);
            sb2.append('m');
            i16 = i20;
        }
        if (i15 != 0) {
            int i21 = i16 + 1;
            if (i16 > 0) {
                sb2.append(' ');
            }
            if (c12 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
                if (i11 >= 1000000) {
                    a(sb2, i11 / 1000000, i11 % 1000000, 6, "ms");
                } else if (i11 >= 1000) {
                    a(sb2, i11 / 1000, i11 % 1000, 3, "us");
                } else {
                    sb2.append(i11);
                    sb2.append("ns");
                }
            } else {
                a(sb2, c12, i11, 9, "s");
            }
            i16 = i21;
        }
        if (z10 && i16 > i10) {
            sb2.insert(i10, '(').append(')');
        }
        return sb2.toString();
    }
}
