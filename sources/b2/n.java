package b2;

import java.util.Arrays;
public final class n {
    public static final n h = new n(1, 2, 3, null, -1, -1);
    public static final String f3838i;
    public static final String f3839j;
    public static final String f3840k;
    public static final String f3841l;
    public static final String f3842m;
    public static final String f3843n;
    public final int f3844a;
    public final int f3845b;
    public final int f3846c;
    public final byte[] d;
    public final int e;
    public final int f3847f;
    public int f3848g;

    static {
        String str = e2.m0.f8254a;
        f3838i = Integer.toString(0, 36);
        f3839j = Integer.toString(1, 36);
        f3840k = Integer.toString(2, 36);
        f3841l = Integer.toString(3, 36);
        f3842m = Integer.toString(4, 36);
        f3843n = Integer.toString(5, 36);
    }

    public n(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f3844a = i10;
        this.f3845b = i11;
        this.f3846c = i12;
        this.d = bArr;
        this.e = i13;
        this.f3847f = i14;
    }

    public static String a(int i10) {
        if (i10 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return i2.e.j(i10, "Undefined color range ");
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
                        return i2.e.j(i10, "Undefined color space ");
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
                                    return i2.e.j(i10, "Undefined color transfer ");
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

    public static boolean e(n nVar) {
        if (nVar == null) {
            return true;
        }
        int i10 = nVar.f3844a;
        if (i10 == -1 || i10 == 1 || i10 == 2) {
            int i11 = nVar.f3845b;
            if (i11 == -1 || i11 == 2) {
                int i12 = nVar.f3846c;
                if ((i12 == -1 || i12 == 3) && nVar.d == null) {
                    int i13 = nVar.f3847f;
                    if (i13 == -1 || i13 == 8) {
                        int i14 = nVar.e;
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
        if (this.f3844a != -1 && this.f3845b != -1 && this.f3846c != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f3844a == nVar.f3844a && this.f3845b == nVar.f3845b && this.f3846c == nVar.f3846c && Arrays.equals(this.d, nVar.d) && this.e == nVar.e && this.f3847f == nVar.f3847f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3848g == 0) {
            this.f3848g = ((((Arrays.hashCode(this.d) + ((((((527 + this.f3844a) * 31) + this.f3845b) * 31) + this.f3846c) * 31)) * 31) + this.e) * 31) + this.f3847f;
        }
        return this.f3848g;
    }

    public final String toString() {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f3844a));
        sb2.append(", ");
        sb2.append(a(this.f3845b));
        sb2.append(", ");
        sb2.append(c(this.f3846c));
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
        int i11 = this.f3847f;
        if (i11 != -1) {
            str2 = a1.g.m(i11, "bit Chroma");
        }
        return a1.g.s(sb2, str2, ")");
    }
}
