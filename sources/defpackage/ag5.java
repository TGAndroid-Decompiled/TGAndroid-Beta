package defpackage;

import java.util.Collections;
import java.util.List;
public final class ag5 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final lyc o;

    public ag5(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, lyc lycVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = lycVar;
    }

    public static ag5 a(ey7 ey7Var, boolean z, lyc lycVar) {
        String str;
        boolean z2;
        List singletonList;
        h30 h;
        int i;
        int i2 = 4;
        try {
            if (z) {
                ey7Var.O(4);
            } else {
                ey7Var.O(21);
            }
            int A = ey7Var.A() & 3;
            int A2 = ey7Var.A();
            int i3 = ey7Var.b;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= A2) {
                    break;
                }
                ey7Var.O(1);
                int H = ey7Var.H();
                for (int i7 = 0; i7 < H; i7++) {
                    int H2 = ey7Var.H();
                    i6 += H2 + 4;
                    ey7Var.O(H2);
                }
                i5++;
            }
            ey7Var.N(i3);
            byte[] bArr = new byte[i6];
            lyc lycVar2 = lycVar;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            float f = 1.0f;
            String str2 = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < A2) {
                int A3 = ey7Var.A() & 63;
                int H3 = ey7Var.H();
                int i20 = i4;
                lyc lycVar3 = lycVar2;
                while (i20 < H3) {
                    boolean z3 = z2;
                    int H4 = ey7Var.H();
                    int i21 = A;
                    System.arraycopy(rfd.a, i4, bArr, i19, i2);
                    int i22 = i19 + 4;
                    System.arraycopy(ey7Var.a, ey7Var.b, bArr, i22, H4);
                    if (A3 == 32 && i20 == 0) {
                        lycVar3 = rfd.j(i22, i22 + H4, bArr);
                    } else {
                        if (A3 == 33 && i20 == 0) {
                            dk7 i23 = rfd.i(bArr, i22, i22 + H4, lycVar3);
                            i8 = i23.a + 1;
                            i9 = i23.g;
                            int i24 = i23.h;
                            i11 = i23.c + 8;
                            i12 = i23.d + 8;
                            int i25 = i23.k;
                            i10 = i24;
                            int i26 = i23.l;
                            int i27 = i23.m;
                            float f2 = i23.i;
                            int i28 = i23.j;
                            ak7 ak7Var = i23.b;
                            if (ak7Var != null) {
                                i = i28;
                                str2 = rk2.a(ak7Var.a, ak7Var.c, ak7Var.d, ak7Var.f, ak7Var.b, ak7Var.e);
                            } else {
                                i = i28;
                            }
                            i17 = i;
                            f = f2;
                            i15 = i27;
                            i14 = i26;
                            i13 = i25;
                        } else if (A3 == 39 && i20 == 0 && (h = rfd.h(i22, i22 + H4, bArr)) != null && lycVar3 != null) {
                            i4 = 0;
                            if (h.a == ((zj7) ((po5) lycVar3.b).get(0)).b) {
                                i16 = 4;
                            } else {
                                i16 = 5;
                            }
                        }
                        i4 = 0;
                    }
                    i19 = i22 + H4;
                    ey7Var.O(H4);
                    i20++;
                    z2 = z3;
                    A = i21;
                    i2 = 4;
                }
                i18++;
                lycVar2 = lycVar3;
                i2 = 4;
            }
            int i29 = A;
            if (i6 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new ag5(singletonList, i29 + 1, i8, i9, i10, i11, i12, i13, i14, i15, i16, f, i17, str2, lycVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            if (z) {
                str = "L-HEVC config";
            } else {
                str = "HEVC config";
            }
            throw hy7.a("Error parsing".concat(str), e);
        }
    }
}
