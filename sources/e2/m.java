package e2;

import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class m {
    public static final m h = new m(1, 2, 3, null, -1, -1);
    public static final String f10511i;
    public static final String f10512j;
    public static final String f10513k;
    public static final String f10514l;
    public static final String f10515m;
    public static final String f10516n;
    public final int f10517a;
    public final int f10518b;
    public final int f10519c;
    public final byte[] d;
    public final int f10520e;
    public final int f10521f;
    public int f10522g;

    static {
        String str = h2.l0.f13786a;
        f10511i = Integer.toString(0, 36);
        f10512j = Integer.toString(1, 36);
        f10513k = Integer.toString(2, 36);
        f10514l = Integer.toString(3, 36);
        f10515m = Integer.toString(4, 36);
        f10516n = Integer.toString(5, 36);
    }

    public m(int i7, int i10, int i11, byte[] bArr, int i12, int i13) {
        this.f10517a = i7;
        this.f10518b = i10;
        this.f10519c = i11;
        this.d = bArr;
        this.f10520e = i12;
        this.f10521f = i13;
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
        int i7 = mVar.f10517a;
        if (i7 == -1 || i7 == 1 || i7 == 2) {
            int i10 = mVar.f10518b;
            if (i10 == -1 || i10 == 2) {
                int i11 = mVar.f10519c;
                if ((i11 == -1 || i11 == 3) && mVar.d == null) {
                    int i12 = mVar.f10521f;
                    if (i12 == -1 || i12 == 8) {
                        int i13 = mVar.f10520e;
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
        if (this.f10517a != -1 && this.f10518b != -1 && this.f10519c != -1) {
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
            if (this.f10517a == mVar.f10517a && this.f10518b == mVar.f10518b && this.f10519c == mVar.f10519c && Arrays.equals(this.d, mVar.d) && this.f10520e == mVar.f10520e && this.f10521f == mVar.f10521f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f10522g == 0) {
            this.f10522g = ((((Arrays.hashCode(this.d) + ((((((527 + this.f10517a) * 31) + this.f10518b) * 31) + this.f10519c) * 31)) * 31) + this.f10520e) * 31) + this.f10521f;
        }
        return this.f10522g;
    }

    public final String toString() {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f10517a));
        sb2.append(", ");
        sb2.append(a(this.f10518b));
        sb2.append(", ");
        sb2.append(c(this.f10519c));
        sb2.append(", ");
        if (this.d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", ");
        String str2 = "NA";
        int i7 = this.f10520e;
        if (i7 == -1) {
            str = "NA";
        } else {
            str = e2.i(i7, "bit Luma");
        }
        sb2.append(str);
        sb2.append(", ");
        int i10 = this.f10521f;
        if (i10 != -1) {
            str2 = e2.i(i10, "bit Chroma");
        }
        return a8.p0.s(sb2, str2, ")");
    }
}
