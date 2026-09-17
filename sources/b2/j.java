package b2;

import java.util.Arrays;
public final class j {
    public static final j h = new j(1, 2, 3, null, -1, -1);
    public static final String f2073i;
    public static final String f2074j;
    public static final String f2075k;
    public static final String f2076l;
    public static final String f2077m;
    public static final String f2078n;
    public final int f2079a;
    public final int f2080b;
    public final int f2081c;
    public final byte[] d;
    public final int f2082e;
    public final int f2083f;
    public int f2084g;

    static {
        String str = e2.d0.f8737a;
        f2073i = Integer.toString(0, 36);
        f2074j = Integer.toString(1, 36);
        f2075k = Integer.toString(2, 36);
        f2076l = Integer.toString(3, 36);
        f2077m = Integer.toString(4, 36);
        f2078n = Integer.toString(5, 36);
    }

    public j(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f2079a = i10;
        this.f2080b = i11;
        this.f2081c = i12;
        this.d = bArr;
        this.f2082e = i13;
        this.f2083f = i14;
    }

    public static String a(int i10) {
        if (i10 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return i2.g.i(i10, "Undefined color range ");
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
                        return i2.g.i(i10, "Undefined color space ");
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
                                    return i2.g.i(i10, "Undefined color transfer ");
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
        int i10 = jVar.f2079a;
        if (i10 == -1 || i10 == 1 || i10 == 2) {
            int i11 = jVar.f2080b;
            if (i11 == -1 || i11 == 2) {
                int i12 = jVar.f2081c;
                if ((i12 == -1 || i12 == 3) && jVar.d == null) {
                    int i13 = jVar.f2083f;
                    if (i13 == -1 || i13 == 8) {
                        int i14 = jVar.f2082e;
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
        if (this.f2079a != -1 && this.f2080b != -1 && this.f2081c != -1) {
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
            if (this.f2079a == jVar.f2079a && this.f2080b == jVar.f2080b && this.f2081c == jVar.f2081c && Arrays.equals(this.d, jVar.d) && this.f2082e == jVar.f2082e && this.f2083f == jVar.f2083f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2084g == 0) {
            this.f2084g = ((((Arrays.hashCode(this.d) + ((((((527 + this.f2079a) * 31) + this.f2080b) * 31) + this.f2081c) * 31)) * 31) + this.f2082e) * 31) + this.f2083f;
        }
        return this.f2084g;
    }

    public final String toString() {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f2079a));
        sb2.append(", ");
        sb2.append(a(this.f2080b));
        sb2.append(", ");
        sb2.append(c(this.f2081c));
        sb2.append(", ");
        if (this.d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", ");
        String str2 = "NA";
        int i10 = this.f2082e;
        if (i10 == -1) {
            str = "NA";
        } else {
            str = a4.a.m(i10, "bit Luma");
        }
        sb2.append(str);
        sb2.append(", ");
        int i11 = this.f2083f;
        if (i11 != -1) {
            str2 = a4.a.m(i11, "bit Chroma");
        }
        return a4.a.s(sb2, str2, ")");
    }
}
