package b2;

import java.util.Arrays;
public final class j {
    public static final j h = new j(1, 2, 3, null, -1, -1);
    public static final String f1720i;
    public static final String f1721j;
    public static final String f1722k;
    public static final String f1723l;
    public static final String f1724m;
    public static final String f1725n;
    public final int f1726a;
    public final int f1727b;
    public final int f1728c;
    public final byte[] d;
    public final int e;
    public final int f1729f;
    public int f1730g;

    static {
        String str = e2.d0.f7188a;
        f1720i = Integer.toString(0, 36);
        f1721j = Integer.toString(1, 36);
        f1722k = Integer.toString(2, 36);
        f1723l = Integer.toString(3, 36);
        f1724m = Integer.toString(4, 36);
        f1725n = Integer.toString(5, 36);
    }

    public j(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f1726a = i10;
        this.f1727b = i11;
        this.f1728c = i12;
        this.d = bArr;
        this.e = i13;
        this.f1729f = i14;
    }

    public static String a(int i10) {
        if (i10 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return hc.b.j(i10, "Undefined color range ");
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public static String b(int i10) {
        if (i10 != -1) {
            if (i10 != 6) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return hc.b.j(i10, "Undefined color space ");
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static String c(int i10) {
        if (i10 != -1) {
            if (i10 != 10) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    return hc.b.j(i10, "Undefined color transfer ");
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

    public static boolean e(j jVar) {
        if (jVar == null) {
            return true;
        }
        int i10 = jVar.f1726a;
        if (i10 == -1 || i10 == 1 || i10 == 2) {
            int i11 = jVar.f1727b;
            if (i11 == -1 || i11 == 2) {
                int i12 = jVar.f1728c;
                if ((i12 == -1 || i12 == 3) && jVar.d == null) {
                    int i13 = jVar.f1729f;
                    if (i13 == -1 || i13 == 8) {
                        int i14 = jVar.e;
                        if (i14 == -1 || i14 == 8) {
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

    public static int f(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 9) {
            return 6;
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return -1;
        }
        return 2;
    }

    public static int g(int i10) {
        if (i10 != 1) {
            if (i10 != 4) {
                if (i10 != 13) {
                    if (i10 == 16) {
                        return 6;
                    }
                    if (i10 == 18) {
                        return 7;
                    }
                    if (i10 != 6 && i10 != 7) {
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
        if (this.f1726a != -1 && this.f1727b != -1 && this.f1728c != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f1726a == jVar.f1726a && this.f1727b == jVar.f1727b && this.f1728c == jVar.f1728c && Arrays.equals(this.d, jVar.d) && this.e == jVar.e && this.f1729f == jVar.f1729f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1730g == 0) {
            this.f1730g = ((((Arrays.hashCode(this.d) + ((((((527 + this.f1726a) * 31) + this.f1727b) * 31) + this.f1728c) * 31)) * 31) + this.e) * 31) + this.f1729f;
        }
        return this.f1730g;
    }

    public final String toString() {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f1726a));
        sb2.append(", ");
        sb2.append(a(this.f1727b));
        sb2.append(", ");
        sb2.append(c(this.f1728c));
        sb2.append(", ");
        if (this.d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", ");
        String str2 = "NA";
        int i10 = this.e;
        if (i10 == -1) {
            str = "NA";
        } else {
            str = a4.a.m(i10, "bit Luma");
        }
        sb2.append(str);
        sb2.append(", ");
        int i11 = this.f1729f;
        if (i11 != -1) {
            str2 = a4.a.m(i11, "bit Chroma");
        }
        return a4.a.s(sb2, str2, ")");
    }
}
