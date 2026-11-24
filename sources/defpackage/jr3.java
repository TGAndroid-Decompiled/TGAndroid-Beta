package defpackage;
public final class jr3 implements Comparable {
    public static final long b;
    public static final long c;
    public static final int d = 0;
    public final long a;

    static {
        int i = lr3.a;
        b = vee.a(4611686018427387903L);
        c = vee.a(-4611686018427387903L);
    }

    public static final void a(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        CharSequence charSequence;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String valueOf = String.valueOf(i2);
            valueOf.getClass();
            if (i3 >= 0) {
                if (i3 <= valueOf.length()) {
                    charSequence = valueOf.subSequence(0, valueOf.length());
                } else {
                    StringBuilder sb2 = new StringBuilder(i3);
                    int length = i3 - valueOf.length();
                    int i4 = 1;
                    if (1 <= length) {
                        while (true) {
                            sb2.append('0');
                            if (i4 == length) {
                                break;
                            }
                            i4++;
                        }
                    }
                    sb2.append((CharSequence) valueOf);
                    charSequence = sb2;
                }
                String obj = charSequence.toString();
                int i5 = -1;
                int length2 = obj.length() - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i6 = length2 - 1;
                        if (obj.charAt(length2) != '0') {
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
                if (!z && i7 < 3) {
                    sb.append((CharSequence) obj, 0, i7);
                } else {
                    sb.append((CharSequence) obj, 0, ((i5 + 3) / 3) * 3);
                }
            } else {
                w26.j(tb4.n(i3, "Desired length ", " is less than zero."));
                return;
            }
        }
        sb.append(str);
    }

    public static int b(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            if (j < 0) {
                return -i;
            }
            return i;
        }
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        if (i2 != 0) {
            return 1;
        }
        return 0;
    }

    public static final boolean c(long j) {
        if (j != b && j != c) {
            return false;
        }
        return true;
    }

    public static final long d(long j, nr3 nr3Var) {
        nr3 nr3Var2;
        if (j == b) {
            return Long.MAX_VALUE;
        }
        if (j == c) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            nr3Var2 = nr3.NANOSECONDS;
        } else {
            nr3Var2 = nr3.MILLISECONDS;
        }
        return nr3Var.a.convert(j2, nr3Var2.a);
    }

    @Override
    public final int compareTo(Object obj) {
        return b(this.a, ((jr3) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jr3) {
            if (this.a != ((jr3) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        boolean z;
        int d2;
        int d3;
        int d4;
        long j;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j2 = this.a;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 == 0) {
            return "0s";
        }
        if (j2 == b) {
            return "Infinity";
        }
        if (j2 == c) {
            return "-Infinity";
        }
        int i3 = 0;
        if (i2 < 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (i2 < 0) {
            j2 = (((int) j2) & 1) + ((-(j2 >> 1)) << 1);
            int i4 = lr3.a;
        }
        long d5 = d(j2, nr3.DAYS);
        if (c(j2)) {
            d2 = 0;
        } else {
            d2 = (int) (d(j2, nr3.HOURS) % 24);
        }
        if (c(j2)) {
            d3 = 0;
        } else {
            d3 = (int) (d(j2, nr3.MINUTES) % 60);
        }
        if (c(j2)) {
            d4 = 0;
        } else {
            d4 = (int) (d(j2, nr3.SECONDS) % 60);
        }
        if (c(j2)) {
            i = 0;
        } else {
            int i5 = ((int) j2) & 1;
            long j3 = j2 >> 1;
            if (i5 == 1) {
                j = (j3 % 1000) * 1000000;
            } else {
                j = j3 % 1000000000;
            }
            i = (int) j;
        }
        if (d5 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (d2 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (d3 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (d4 == 0 && i == 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z2) {
            sb.append(d5);
            sb.append('d');
            i3 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i6 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            sb.append(d2);
            sb.append('h');
            i3 = i6;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i7 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            sb.append(d3);
            sb.append('m');
            i3 = i7;
        }
        if (z5) {
            int i8 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            if (d4 == 0 && !z2 && !z3 && !z4) {
                if (i >= 1000000) {
                    a(sb, i / 1000000, i % 1000000, 6, "ms", false);
                } else if (i >= 1000) {
                    a(sb, i / 1000, i % 1000, 3, "us", false);
                } else {
                    sb.append(i);
                    sb.append("ns");
                }
            } else {
                a(sb, d4, i, 9, "s", false);
            }
            i3 = i8;
        }
        if (z && i3 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
