package i5;

import h5.d0;
import java.util.Arrays;
public final class b implements j3.g {
    public static final b f7804f = new b(1, 2, 3, null);
    public static final String h;
    public static final String f7805n;
    public static final String f7806r;
    public static final String f7807s;
    public static final f5.u v;
    public final int f7808a;
    public final int f7809b;
    public final int f7810c;
    public final byte[] d;
    public int f7811e;

    static {
        int i10 = d0.f7237a;
        h = Integer.toString(0, 36);
        f7805n = Integer.toString(1, 36);
        f7806r = Integer.toString(2, 36);
        f7807s = Integer.toString(3, 36);
        v = new f5.u(18);
    }

    public b(int i10, int i11, int i12, byte[] bArr) {
        this.f7808a = i10;
        this.f7809b = i11;
        this.f7810c = i12;
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
            if (this.f7808a == bVar.f7808a && this.f7809b == bVar.f7809b && this.f7810c == bVar.f7810c && Arrays.equals(this.d, bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f7811e == 0) {
            this.f7811e = Arrays.hashCode(this.d) + ((((((527 + this.f7808a) * 31) + this.f7809b) * 31) + this.f7810c) * 31);
        }
        return this.f7811e;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        boolean z4 = true;
        int i10 = this.f7808a;
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
        int i11 = this.f7809b;
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
        sb.append(a(this.f7810c));
        sb.append(", ");
        if (this.d == null) {
            z4 = false;
        }
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }
}
