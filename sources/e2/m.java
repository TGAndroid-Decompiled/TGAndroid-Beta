package e2;

import java.util.Arrays;
public final class m {
    public static final m h = new m(1, 2, 3, null, -1, -1);
    public static final String f10357i;
    public static final String f10358j;
    public static final String f10359k;
    public static final String f10360l;
    public static final String f10361m;
    public static final String f10362n;
    public final int f10363a;
    public final int f10364b;
    public final int f10365c;
    public final byte[] d;
    public final int f10366e;
    public final int f10367f;
    public int f10368g;

    static {
        String str = h2.m0.f14112a;
        f10357i = Integer.toString(0, 36);
        f10358j = Integer.toString(1, 36);
        f10359k = Integer.toString(2, 36);
        f10360l = Integer.toString(3, 36);
        f10361m = Integer.toString(4, 36);
        f10362n = Integer.toString(5, 36);
    }

    public m(int i7, int i10, int i11, byte[] bArr, int i12, int i13) {
        this.f10363a = i7;
        this.f10364b = i10;
        this.f10365c = i11;
        this.d = bArr;
        this.f10366e = i12;
        this.f10367f = i13;
    }

    public static String a(int i7) {
        if (i7 != -1) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return jg.g.j(i7, "Undefined color range ");
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public static String b(int i7) {
        if (i7 != -1) {
            if (i7 != 6) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        return jg.g.j(i7, "Undefined color space ");
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static String c(int i7) {
        if (i7 != -1) {
            if (i7 != 10) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    return jg.g.j(i7, "Undefined color transfer ");
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

    public static boolean e(m mVar) {
        if (mVar == null) {
            return true;
        }
        int i7 = mVar.f10363a;
        if (i7 == -1 || i7 == 1 || i7 == 2) {
            int i10 = mVar.f10364b;
            if (i10 == -1 || i10 == 2) {
                int i11 = mVar.f10365c;
                if ((i11 == -1 || i11 == 3) && mVar.d == null) {
                    int i12 = mVar.f10367f;
                    if (i12 == -1 || i12 == 8) {
                        int i13 = mVar.f10366e;
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

    public static int f(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 9) {
            return 6;
        }
        if (i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            return -1;
        }
        return 2;
    }

    public static int g(int i7) {
        if (i7 != 1) {
            if (i7 != 4) {
                if (i7 != 13) {
                    if (i7 == 16) {
                        return 6;
                    }
                    if (i7 == 18) {
                        return 7;
                    }
                    if (i7 != 6 && i7 != 7) {
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
        if (this.f10363a != -1 && this.f10364b != -1 && this.f10365c != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f10363a == mVar.f10363a && this.f10364b == mVar.f10364b && this.f10365c == mVar.f10365c && Arrays.equals(this.d, mVar.d) && this.f10366e == mVar.f10366e && this.f10367f == mVar.f10367f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f10368g == 0) {
            this.f10368g = ((((Arrays.hashCode(this.d) + ((((((527 + this.f10363a) * 31) + this.f10364b) * 31) + this.f10365c) * 31)) * 31) + this.f10366e) * 31) + this.f10367f;
        }
        return this.f10368g;
    }

    public final String toString() {
        boolean z9;
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f10363a));
        sb2.append(", ");
        sb2.append(a(this.f10364b));
        sb2.append(", ");
        sb2.append(c(this.f10365c));
        sb2.append(", ");
        if (this.d != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        sb2.append(z9);
        sb2.append(", ");
        String str2 = "NA";
        int i7 = this.f10366e;
        if (i7 == -1) {
            str = "NA";
        } else {
            str = com.google.android.recaptcha.internal.a.i(i7, "bit Luma");
        }
        sb2.append(str);
        sb2.append(", ");
        int i10 = this.f10367f;
        if (i10 != -1) {
            str2 = com.google.android.recaptcha.internal.a.i(i10, "bit Chroma");
        }
        return a8.p0.s(sb2, str2, ")");
    }
}
