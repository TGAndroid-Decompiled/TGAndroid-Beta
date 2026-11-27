package defpackage;

import java.util.Arrays;
public final class bm2 {
    public static final bm2 h = new bm2(1, 2, 3, null, -1, -1);
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        String str = gcc.a;
        i = "0";
        j = "1";
        k = "2";
        l = "3";
        m = "4";
        n = "5";
    }

    public bm2(int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
        this.e = i5;
        this.f = i6;
    }

    public static String a(int i2) {
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return uh9.k(i2, "Undefined color range ");
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public static String b(int i2) {
        if (i2 != -1) {
            if (i2 != 6) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return uh9.k(i2, "Undefined color space ");
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static String c(int i2) {
        if (i2 != -1) {
            if (i2 != 10) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 6) {
                                if (i2 != 7) {
                                    return uh9.k(i2, "Undefined color transfer ");
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static boolean e(bm2 bm2Var) {
        if (bm2Var == null) {
            return true;
        }
        int i2 = bm2Var.a;
        if (i2 == -1 || i2 == 1 || i2 == 2) {
            int i3 = bm2Var.b;
            if (i3 == -1 || i3 == 2) {
                int i4 = bm2Var.c;
                if ((i4 == -1 || i4 == 3) && bm2Var.d == null) {
                    int i5 = bm2Var.f;
                    if (i5 == -1 || i5 == 8) {
                        int i6 = bm2Var.e;
                        if (i6 == -1 || i6 == 8) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static int f(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 9) {
            return 6;
        }
        if (i2 != 4 && i2 != 5 && i2 != 6 && i2 != 7) {
            return -1;
        }
        return 2;
    }

    public static int g(int i2) {
        if (i2 != 1) {
            if (i2 != 4) {
                if (i2 != 13) {
                    if (i2 == 16) {
                        return 6;
                    }
                    if (i2 == 18) {
                        return 7;
                    }
                    if (i2 != 6 && i2 != 7) {
                        return -1;
                    }
                    return 3;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    public final boolean d() {
        if (this.a != -1 && this.b != -1 && this.c != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bm2.class == obj.getClass()) {
            bm2 bm2Var = (bm2) obj;
            if (this.a == bm2Var.a && this.b == bm2Var.b && this.c == bm2Var.c && Arrays.equals(this.d, bm2Var.d) && this.e == bm2Var.e && this.f == bm2Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.g;
        if (i2 == 0) {
            int hashCode = ((((Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
            this.g = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final String toString() {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.a));
        sb.append(", ");
        sb.append(a(this.b));
        sb.append(", ");
        sb.append(c(this.c));
        sb.append(", ");
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", ");
        String str2 = "NA";
        int i2 = this.e;
        if (i2 == -1) {
            str = "NA";
        } else {
            str = bp1.n(i2, "bit Luma");
        }
        sb.append(str);
        sb.append(", ");
        int i3 = this.f;
        if (i3 != -1) {
            str2 = bp1.n(i3, "bit Chroma");
        }
        return c00.k(sb, str2, ")");
    }
}
