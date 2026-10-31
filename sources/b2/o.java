package b2;

import java.util.Arrays;
public final class o {
    public static final o h = new o(1, 2, 3, null, -1, -1);
    public static final String f2150i;
    public static final String f2151j;
    public static final String f2152k;
    public static final String f2153l;
    public static final String f2154m;
    public static final String f2155n;
    public final int f2156a;
    public final int f2157b;
    public final int f2158c;
    public final byte[] d;
    public final int e;
    public final int f2159f;
    public int f2160g;

    static {
        String str = e2.l0.f6165a;
        f2150i = Integer.toString(0, 36);
        f2151j = Integer.toString(1, 36);
        f2152k = Integer.toString(2, 36);
        f2153l = Integer.toString(3, 36);
        f2154m = Integer.toString(4, 36);
        f2155n = Integer.toString(5, 36);
    }

    public o(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f2156a = i10;
        this.f2157b = i11;
        this.f2158c = i12;
        this.d = bArr;
        this.e = i13;
        this.f2159f = i14;
    }

    public static String a(int i10) {
        if (i10 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return i0.a.i(i10, "Undefined color range ");
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
                        return i0.a.i(i10, "Undefined color space ");
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
                                    return i0.a.i(i10, "Undefined color transfer ");
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
        int i10 = oVar.f2156a;
        if (i10 == -1 || i10 == 1 || i10 == 2) {
            int i11 = oVar.f2157b;
            if (i11 == -1 || i11 == 2) {
                int i12 = oVar.f2158c;
                if ((i12 == -1 || i12 == 3) && oVar.d == null) {
                    int i13 = oVar.f2159f;
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
        if (this.f2156a != -1 && this.f2157b != -1 && this.f2158c != -1) {
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
            if (this.f2156a == oVar.f2156a && this.f2157b == oVar.f2157b && this.f2158c == oVar.f2158c && Arrays.equals(this.d, oVar.d) && this.e == oVar.e && this.f2159f == oVar.f2159f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2160g == 0) {
            this.f2160g = ((((Arrays.hashCode(this.d) + ((((((527 + this.f2156a) * 31) + this.f2157b) * 31) + this.f2158c) * 31)) * 31) + this.e) * 31) + this.f2159f;
        }
        return this.f2160g;
    }

    public final String toString() {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f2156a));
        sb2.append(", ");
        sb2.append(a(this.f2157b));
        sb2.append(", ");
        sb2.append(c(this.f2158c));
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
            str = a1.g.k(i10, "bit Luma");
        }
        sb2.append(str);
        sb2.append(", ");
        int i11 = this.f2159f;
        if (i11 != -1) {
            str2 = a1.g.k(i11, "bit Chroma");
        }
        return a1.g.r(sb2, str2, ")");
    }
}
