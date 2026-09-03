package i5;

import h5.d0;
import java.util.Arrays;
public final class b implements j3.g {
    public static final b f7239f = new b(1, 2, 3, null);
    public static final String h;
    public static final String f7240n;
    public static final String f7241r;
    public static final String f7242s;
    public static final f0.d v;
    public final int f7243a;
    public final int f7244b;
    public final int f7245c;
    public final byte[] d;
    public int e;

    static {
        int i10 = d0.f6924a;
        h = Integer.toString(0, 36);
        f7240n = Integer.toString(1, 36);
        f7241r = Integer.toString(2, 36);
        f7242s = Integer.toString(3, 36);
        v = new f0.d(18);
    }

    public b(int i10, int i11, int i12, byte[] bArr) {
        this.f7243a = i10;
        this.f7244b = i11;
        this.f7245c = i12;
        this.d = bArr;
    }

    public static String a(int i10) {
        if (i10 != -1) {
            if (i10 != 10) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    return "Undefined color transfer";
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

    public static int b(int i10) {
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

    public static int c(int i10) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f7243a == bVar.f7243a && this.f7244b == bVar.f7244b && this.f7245c == bVar.f7245c && Arrays.equals(this.d, bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + ((((((527 + this.f7243a) * 31) + this.f7244b) * 31) + this.f7245c) * 31);
        }
        return this.e;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        boolean z4 = true;
        int i10 = this.f7243a;
        if (i10 != -1) {
            if (i10 != 6) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        str = "Undefined color space";
                    } else {
                        str = "BT601";
                    }
                } else {
                    str = "BT709";
                }
            } else {
                str = "BT2020";
            }
        } else {
            str = "Unset color space";
        }
        sb.append(str);
        sb.append(", ");
        int i11 = this.f7244b;
        if (i11 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    str2 = "Undefined color range";
                } else {
                    str2 = "Limited range";
                }
            } else {
                str2 = "Full range";
            }
        } else {
            str2 = "Unset color range";
        }
        sb.append(str2);
        sb.append(", ");
        sb.append(a(this.f7245c));
        sb.append(", ");
        if (this.d == null) {
            z4 = false;
        }
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }
}
