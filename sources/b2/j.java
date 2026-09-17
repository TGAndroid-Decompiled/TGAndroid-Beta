package b2;

import java.util.Arrays;
public final class j {
    public static final j h = new j(1, 2, 3, null, -1, -1);
    public static final String f2100i;
    public static final String f2101j;
    public static final String f2102k;
    public static final String f2103l;
    public static final String f2104m;
    public static final String f2105n;
    public final int f2106a;
    public final int f2107b;
    public final int f2108c;
    public final byte[] d;
    public final int f2109e;
    public final int f2110f;
    public int f2111g;

    static {
        String str = e2.d0.f8765a;
        f2100i = Integer.toString(0, 36);
        f2101j = Integer.toString(1, 36);
        f2102k = Integer.toString(2, 36);
        f2103l = Integer.toString(3, 36);
        f2104m = Integer.toString(4, 36);
        f2105n = Integer.toString(5, 36);
    }

    public j(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f2106a = i10;
        this.f2107b = i11;
        this.f2108c = i12;
        this.d = bArr;
        this.f2109e = i13;
        this.f2110f = i14;
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
        int i10 = jVar.f2106a;
        if (i10 == -1 || i10 == 1 || i10 == 2) {
            int i11 = jVar.f2107b;
            if (i11 == -1 || i11 == 2) {
                int i12 = jVar.f2108c;
                if ((i12 == -1 || i12 == 3) && jVar.d == null) {
                    int i13 = jVar.f2110f;
                    if (i13 == -1 || i13 == 8) {
                        int i14 = jVar.f2109e;
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
        if (this.f2106a != -1 && this.f2107b != -1 && this.f2108c != -1) {
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
            if (this.f2106a == jVar.f2106a && this.f2107b == jVar.f2107b && this.f2108c == jVar.f2108c && Arrays.equals(this.d, jVar.d) && this.f2109e == jVar.f2109e && this.f2110f == jVar.f2110f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2111g == 0) {
            this.f2111g = ((((Arrays.hashCode(this.d) + ((((((527 + this.f2106a) * 31) + this.f2107b) * 31) + this.f2108c) * 31)) * 31) + this.f2109e) * 31) + this.f2110f;
        }
        return this.f2111g;
    }

    public final String toString() {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f2106a));
        sb2.append(", ");
        sb2.append(a(this.f2107b));
        sb2.append(", ");
        sb2.append(c(this.f2108c));
        sb2.append(", ");
        if (this.d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", ");
        String str2 = "NA";
        int i10 = this.f2109e;
        if (i10 == -1) {
            str = "NA";
        } else {
            str = a4.a.m(i10, "bit Luma");
        }
        sb2.append(str);
        sb2.append(", ");
        int i11 = this.f2110f;
        if (i11 != -1) {
            str2 = a4.a.m(i11, "bit Chroma");
        }
        return a4.a.s(sb2, str2, ")");
    }
}
