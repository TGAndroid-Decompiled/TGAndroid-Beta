package defpackage;
public abstract class oie {
    public static boolean a(yw7 yw7Var, gk4 gk4Var, int i, u21 u21Var) {
        boolean z;
        boolean z2;
        boolean z3;
        long C = yw7Var.C();
        long j = C >>> 16;
        if (j != i) {
            return false;
        }
        if ((j & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i2 = (int) ((C >> 12) & 15);
        int i3 = (int) ((C >> 8) & 15);
        int i4 = (int) ((C >> 4) & 15);
        int i5 = (int) ((C >> 1) & 7);
        if ((C & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i4 <= 7) {
            if (i4 != gk4Var.g - 1) {
                return false;
            }
        } else if (i4 > 10 || gk4Var.g != 2) {
            return false;
        }
        if ((i5 != 0 && i5 != gk4Var.i) || z2) {
            return false;
        }
        try {
            long I = yw7Var.I();
            if (!z) {
                I *= gk4Var.b;
            }
            long j2 = gk4Var.j;
            if (j2 != 0 && I > j2) {
                return false;
            }
            u21Var.a = I;
            int b = b(i2, yw7Var);
            long j3 = gk4Var.j;
            if (j3 != 0 && I + b < j3) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (b == -1) {
                return false;
            }
            if ((!z3 && b < gk4Var.a) || b > gk4Var.b) {
                return false;
            }
            int i6 = gk4Var.e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != gk4Var.f) {
                        return false;
                    }
                } else if (i3 == 12) {
                    if (yw7Var.A() * 1000 != i6) {
                        return false;
                    }
                } else if (i3 > 14) {
                    return false;
                } else {
                    int H = yw7Var.H();
                    if (i3 == 14) {
                        H *= 10;
                    }
                    if (H != i6) {
                        return false;
                    }
                }
            }
            int A = yw7Var.A();
            int i7 = yw7Var.b;
            byte[] bArr = yw7Var.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = yw7Var.b; i10 < i8; i10++) {
                i9 = hac.l[i9 ^ (bArr[i10] & 255)];
            }
            String str = hac.a;
            if (A != i9) {
                return false;
            }
            if (yw7Var.a() != 0) {
                int j4 = yw7Var.j();
                if ((j4 & 128) != 0) {
                    return false;
                }
                int i11 = (j4 & 126) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    ncd.e("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int b(int i, yw7 yw7Var) {
        int i2;
        int i3;
        int A;
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i2 = i - 2;
                i3 = 576;
                return i3 << i2;
            case 6:
                A = yw7Var.A();
                return A + 1;
            case 7:
                A = yw7Var.H();
                return A + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = i - 8;
                i3 = 256;
                return i3 << i2;
            default:
                return -1;
        }
    }
}
