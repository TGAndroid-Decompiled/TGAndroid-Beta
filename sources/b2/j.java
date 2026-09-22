package b2;

import java.util.Arrays;
public final class j {
    public static final j h = new j(1, 2, 3, null, -1, -1);
    public static final String f3026i;
    public static final String f3027j;
    public static final String f3028k;
    public static final String f3029l;
    public static final String f3030m;
    public static final String f3031n;
    public final int f3032a;
    public final int f3033b;
    public final int f3034c;
    public final byte[] d;
    public final int e;
    public final int f3035f;
    public int f3036g;

    static {
        String str = e2.d0.f7887a;
        f3026i = Integer.toString(0, 36);
        f3027j = Integer.toString(1, 36);
        f3028k = Integer.toString(2, 36);
        f3029l = Integer.toString(3, 36);
        f3030m = Integer.toString(4, 36);
        f3031n = Integer.toString(5, 36);
    }

    public j(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f3032a = i10;
        this.f3033b = i11;
        this.f3034c = i12;
        this.d = bArr;
        this.e = i13;
        this.f3035f = i14;
    }

    public static String a(int i10) {
        if (i10 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return hg.k0.h(i10, "Undefined color range ");
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
                        return hg.k0.h(i10, "Undefined color space ");
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
                                    return hg.k0.h(i10, "Undefined color transfer ");
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
        int i10 = jVar.f3032a;
        if (i10 == -1 || i10 == 1 || i10 == 2) {
            int i11 = jVar.f3033b;
            if (i11 == -1 || i11 == 2) {
                int i12 = jVar.f3034c;
                if ((i12 == -1 || i12 == 3) && jVar.d == null) {
                    int i13 = jVar.f3035f;
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
        if (this.f3032a != -1 && this.f3033b != -1 && this.f3034c != -1) {
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
            if (this.f3032a == jVar.f3032a && this.f3033b == jVar.f3033b && this.f3034c == jVar.f3034c && Arrays.equals(this.d, jVar.d) && this.e == jVar.e && this.f3035f == jVar.f3035f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3036g == 0) {
            this.f3036g = ((((Arrays.hashCode(this.d) + ((((((527 + this.f3032a) * 31) + this.f3033b) * 31) + this.f3034c) * 31)) * 31) + this.e) * 31) + this.f3035f;
        }
        return this.f3036g;
    }

    public final String toString() {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f3032a));
        sb2.append(", ");
        sb2.append(a(this.f3033b));
        sb2.append(", ");
        sb2.append(c(this.f3034c));
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
        int i11 = this.f3035f;
        if (i11 != -1) {
            str2 = a4.a.m(i11, "bit Chroma");
        }
        return a4.a.s(sb2, str2, ")");
    }
}
