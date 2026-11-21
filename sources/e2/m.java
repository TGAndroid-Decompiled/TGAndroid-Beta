package e2;

import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class m {
    public static final m h = new m(1, 2, 3, null, -1, -1);
    public static final String f10537i;
    public static final String f10538j;
    public static final String f10539k;
    public static final String f10540l;
    public static final String f10541m;
    public static final String f10542n;
    public final int f10543a;
    public final int f10544b;
    public final int f10545c;
    public final byte[] d;
    public final int f10546e;
    public final int f10547f;
    public int f10548g;

    static {
        String str = h2.l0.f13812a;
        f10537i = Integer.toString(0, 36);
        f10538j = Integer.toString(1, 36);
        f10539k = Integer.toString(2, 36);
        f10540l = Integer.toString(3, 36);
        f10541m = Integer.toString(4, 36);
        f10542n = Integer.toString(5, 36);
    }

    public m(int i7, int i10, int i11, byte[] bArr, int i12, int i13) {
        this.f10543a = i7;
        this.f10544b = i10;
        this.f10545c = i11;
        this.d = bArr;
        this.f10546e = i12;
        this.f10547f = i13;
    }

    public static String a(int i7) {
        if (i7 != -1) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return i5.c.i(i7, "Undefined color range ");
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
                        return i5.c.i(i7, "Undefined color space ");
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
                                    return i5.c.i(i7, "Undefined color transfer ");
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
        int i7 = mVar.f10543a;
        if (i7 == -1 || i7 == 1 || i7 == 2) {
            int i10 = mVar.f10544b;
            if (i10 == -1 || i10 == 2) {
                int i11 = mVar.f10545c;
                if ((i11 == -1 || i11 == 3) && mVar.d == null) {
                    int i12 = mVar.f10547f;
                    if (i12 == -1 || i12 == 8) {
                        int i13 = mVar.f10546e;
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
        if (this.f10543a != -1 && this.f10544b != -1 && this.f10545c != -1) {
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
            if (this.f10543a == mVar.f10543a && this.f10544b == mVar.f10544b && this.f10545c == mVar.f10545c && Arrays.equals(this.d, mVar.d) && this.f10546e == mVar.f10546e && this.f10547f == mVar.f10547f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f10548g == 0) {
            this.f10548g = ((((Arrays.hashCode(this.d) + ((((((527 + this.f10543a) * 31) + this.f10544b) * 31) + this.f10545c) * 31)) * 31) + this.f10546e) * 31) + this.f10547f;
        }
        return this.f10548g;
    }

    public final String toString() {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f10543a));
        sb2.append(", ");
        sb2.append(a(this.f10544b));
        sb2.append(", ");
        sb2.append(c(this.f10545c));
        sb2.append(", ");
        if (this.d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", ");
        String str2 = "NA";
        int i7 = this.f10546e;
        if (i7 == -1) {
            str = "NA";
        } else {
            str = e2.i(i7, "bit Luma");
        }
        sb2.append(str);
        sb2.append(", ");
        int i10 = this.f10547f;
        if (i10 != -1) {
            str2 = e2.i(i10, "bit Chroma");
        }
        return a8.p0.s(sb2, str2, ")");
    }
}
