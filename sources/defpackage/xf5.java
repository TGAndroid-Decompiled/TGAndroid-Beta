package defpackage;

import java.util.Collections;
import java.util.List;
public final class xf5 {
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
    public final xvc o;

    public xf5(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, xvc xvcVar) {
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
        this.o = xvcVar;
    }

    public static xf5 a(yw7 yw7Var, boolean z, xvc xvcVar) {
        String str;
        boolean z2;
        List singletonList;
        g40 h;
        int i;
        int i2 = 4;
        try {
            if (z) {
                yw7Var.O(4);
            } else {
                yw7Var.O(21);
            }
            int A = yw7Var.A() & 3;
            int A2 = yw7Var.A();
            int i3 = yw7Var.b;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= A2) {
                    break;
                }
                yw7Var.O(1);
                int H = yw7Var.H();
                for (int i7 = 0; i7 < H; i7++) {
                    int H2 = yw7Var.H();
                    i6 += H2 + 4;
                    yw7Var.O(H2);
                }
                i5++;
            }
            yw7Var.N(i3);
            byte[] bArr = new byte[i6];
            xvc xvcVar2 = xvcVar;
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
                int A3 = yw7Var.A() & 63;
                int H3 = yw7Var.H();
                int i20 = i4;
                xvc xvcVar3 = xvcVar2;
                while (i20 < H3) {
                    boolean z3 = z2;
                    int H4 = yw7Var.H();
                    int i21 = A;
                    System.arraycopy(add.a, i4, bArr, i19, i2);
                    int i22 = i19 + 4;
                    System.arraycopy(yw7Var.a, yw7Var.b, bArr, i22, H4);
                    if (A3 == 32 && i20 == 0) {
                        xvcVar3 = add.j(i22, i22 + H4, bArr);
                    } else {
                        if (A3 == 33 && i20 == 0) {
                            wj7 i23 = add.i(bArr, i22, i22 + H4, xvcVar3);
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
                            tj7 tj7Var = i23.b;
                            if (tj7Var != null) {
                                i = i28;
                                str2 = jl2.a(tj7Var.a, tj7Var.c, tj7Var.d, tj7Var.f, tj7Var.b, tj7Var.e);
                            } else {
                                i = i28;
                            }
                            i17 = i;
                            f = f2;
                            i15 = i27;
                            i14 = i26;
                            i13 = i25;
                        } else if (A3 == 39 && i20 == 0 && (h = add.h(i22, i22 + H4, bArr)) != null && xvcVar3 != null) {
                            i4 = 0;
                            if (h.a == ((sj7) ((mo5) xvcVar3.b).get(0)).b) {
                                i16 = 4;
                            } else {
                                i16 = 5;
                            }
                        }
                        i4 = 0;
                    }
                    i19 = i22 + H4;
                    yw7Var.O(H4);
                    i20++;
                    z2 = z3;
                    A = i21;
                    i2 = 4;
                }
                i18++;
                xvcVar2 = xvcVar3;
                i2 = 4;
            }
            int i29 = A;
            if (i6 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new xf5(singletonList, i29 + 1, i8, i9, i10, i11, i12, i13, i14, i15, i16, f, i17, str2, xvcVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            if (z) {
                str = "L-HEVC config";
            } else {
                str = "HEVC config";
            }
            throw bx7.a("Error parsing".concat(str), e);
        }
    }
}
