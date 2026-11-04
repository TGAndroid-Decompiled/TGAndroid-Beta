package d2;

import java.util.Arrays;
public final class n {
    public static final n h = new n(1, 2, 3, null, -1, -1);
    public static final String f8222i;
    public static final String f8223j;
    public static final String f8224k;
    public static final String f8225l;
    public static final String f8226m;
    public static final String f8227n;
    public final int f8228a;
    public final int f8229b;
    public final int f8230c;
    public final byte[] d;
    public final int f8231e;
    public final int f8232f;
    public int f8233g;

    static {
        String str = g2.n0.f11873a;
        f8222i = Integer.toString(0, 36);
        f8223j = Integer.toString(1, 36);
        f8224k = Integer.toString(2, 36);
        f8225l = Integer.toString(3, 36);
        f8226m = Integer.toString(4, 36);
        f8227n = Integer.toString(5, 36);
    }

    public n(int i3, int i10, int i11, byte[] bArr, int i12, int i13) {
        this.f8228a = i3;
        this.f8229b = i10;
        this.f8230c = i11;
        this.d = bArr;
        this.f8231e = i12;
        this.f8232f = i13;
    }

    public static String a(int i3) {
        if (i3 != -1) {
            if (i3 != 1) {
                if (i3 != 2) {
                    return k2.p1.i(i3, "Undefined color range ");
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public static String b(int i3) {
        if (i3 != -1) {
            if (i3 != 6) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        return k2.p1.i(i3, "Undefined color space ");
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static String c(int i3) {
        if (i3 != -1) {
            if (i3 != 10) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 6) {
                                if (i3 != 7) {
                                    return k2.p1.i(i3, "Undefined color transfer ");
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
        int i3 = nVar.f8228a;
        if (i3 == -1 || i3 == 1 || i3 == 2) {
            int i10 = nVar.f8229b;
            if (i10 == -1 || i10 == 2) {
                int i11 = nVar.f8230c;
                if ((i11 == -1 || i11 == 3) && nVar.d == null) {
                    int i12 = nVar.f8232f;
                    if (i12 == -1 || i12 == 8) {
                        int i13 = nVar.f8231e;
                        if (i13 == -1 || i13 == 8) {
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

    public static int f(int i3) {
        if (i3 == 1) {
            return 1;
        }
        if (i3 == 9) {
            return 6;
        }
        if (i3 != 4 && i3 != 5 && i3 != 6 && i3 != 7) {
            return -1;
        }
        return 2;
    }

    public static int g(int i3) {
        if (i3 != 1) {
            if (i3 != 4) {
                if (i3 != 13) {
                    if (i3 == 16) {
                        return 6;
                    }
                    if (i3 == 18) {
                        return 7;
                    }
                    if (i3 != 6 && i3 != 7) {
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
        if (this.f8228a != -1 && this.f8229b != -1 && this.f8230c != -1) {
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
            if (this.f8228a == nVar.f8228a && this.f8229b == nVar.f8229b && this.f8230c == nVar.f8230c && Arrays.equals(this.d, nVar.d) && this.f8231e == nVar.f8231e && this.f8232f == nVar.f8232f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8233g == 0) {
            this.f8233g = ((((Arrays.hashCode(this.d) + ((((((527 + this.f8228a) * 31) + this.f8229b) * 31) + this.f8230c) * 31)) * 31) + this.f8231e) * 31) + this.f8232f;
        }
        return this.f8233g;
    }

    public final String toString() {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f8228a));
        sb2.append(", ");
        sb2.append(a(this.f8229b));
        sb2.append(", ");
        sb2.append(c(this.f8230c));
        sb2.append(", ");
        if (this.d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", ");
        String str2 = "NA";
        int i3 = this.f8231e;
        if (i3 == -1) {
            str = "NA";
        } else {
            str = com.google.android.recaptcha.internal.a.h(i3, "bit Luma");
        }
        sb2.append(str);
        sb2.append(", ");
        int i10 = this.f8232f;
        if (i10 != -1) {
            str2 = com.google.android.recaptcha.internal.a.h(i10, "bit Chroma");
        }
        return a1.g.s(sb2, str2, ")");
    }
}
