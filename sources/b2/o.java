package b2;

import java.util.Arrays;
public final class o {
    public static final o h = new o(1, 2, 3, null, -1, -1);
    public static final String f2231i;
    public static final String f2232j;
    public static final String f2233k;
    public static final String f2234l;
    public static final String f2235m;
    public static final String f2236n;
    public final int f2237a;
    public final int f2238b;
    public final int f2239c;
    public final byte[] d;
    public final int e;
    public final int f2240f;
    public int f2241g;

    static {
        String str = e2.m0.f8375a;
        f2231i = Integer.toString(0, 36);
        f2232j = Integer.toString(1, 36);
        f2233k = Integer.toString(2, 36);
        f2234l = Integer.toString(3, 36);
        f2235m = Integer.toString(4, 36);
        f2236n = Integer.toString(5, 36);
    }

    public o(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f2237a = i10;
        this.f2238b = i11;
        this.f2239c = i12;
        this.d = bArr;
        this.e = i13;
        this.f2240f = i14;
    }

    public static String a(int i10) {
        if (i10 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return i2.d.j(i10, "Undefined color range ");
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
                        return i2.d.j(i10, "Undefined color space ");
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
                                    return i2.d.j(i10, "Undefined color transfer ");
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

    public static boolean e(o oVar) {
        if (oVar == null) {
            return true;
        }
        int i10 = oVar.f2237a;
        if (i10 == -1 || i10 == 1 || i10 == 2) {
            int i11 = oVar.f2238b;
            if (i11 == -1 || i11 == 2) {
                int i12 = oVar.f2239c;
                if ((i12 == -1 || i12 == 3) && oVar.d == null) {
                    int i13 = oVar.f2240f;
                    if (i13 == -1 || i13 == 8) {
                        int i14 = oVar.e;
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
        if (this.f2237a != -1 && this.f2238b != -1 && this.f2239c != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f2237a == oVar.f2237a && this.f2238b == oVar.f2238b && this.f2239c == oVar.f2239c && Arrays.equals(this.d, oVar.d) && this.e == oVar.e && this.f2240f == oVar.f2240f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2241g == 0) {
            this.f2241g = ((((Arrays.hashCode(this.d) + ((((((527 + this.f2237a) * 31) + this.f2238b) * 31) + this.f2239c) * 31)) * 31) + this.e) * 31) + this.f2240f;
        }
        return this.f2241g;
    }

    public final String toString() {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f2237a));
        sb2.append(", ");
        sb2.append(a(this.f2238b));
        sb2.append(", ");
        sb2.append(c(this.f2239c));
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
            str = a1.g.m(i10, "bit Luma");
        }
        sb2.append(str);
        sb2.append(", ");
        int i11 = this.f2240f;
        if (i11 != -1) {
            str2 = a1.g.m(i11, "bit Chroma");
        }
        return a1.g.s(sb2, str2, ")");
    }
}
