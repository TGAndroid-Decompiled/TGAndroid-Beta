package e3;

import d2.v0;
import java.util.Collections;
import java.util.List;
public final class x {
    public final List f9524a;
    public final int f9525b;
    public final int f9526c;
    public final int d;
    public final int f9527e;
    public final int f9528f;
    public final int f9529g;
    public final int h;
    public final int f9530i;
    public final int f9531j;
    public final int f9532k;
    public final float f9533l;
    public final int f9534m;
    public final String f9535n;
    public final za.p f9536o;

    public x(List list, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, int i19, String str, za.p pVar) {
        this.f9524a = list;
        this.f9525b = i3;
        this.f9526c = i10;
        this.d = i11;
        this.f9527e = i12;
        this.f9528f = i13;
        this.f9529g = i14;
        this.h = i15;
        this.f9530i = i16;
        this.f9531j = i17;
        this.f9532k = i18;
        this.f9533l = f10;
        this.f9534m = i19;
        this.f9535n = str;
        this.f9536o = pVar;
    }

    public static x a(g2.y yVar, boolean z10, za.p pVar) {
        String str;
        boolean z11;
        List singletonList;
        a7.l j10;
        int i3;
        int i10 = 4;
        try {
            if (z10) {
                yVar.O(4);
            } else {
                yVar.O(21);
            }
            int A = yVar.A() & 3;
            int A2 = yVar.A();
            int i11 = yVar.f11924b;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z11 = true;
                if (i13 >= A2) {
                    break;
                }
                yVar.O(1);
                int H = yVar.H();
                for (int i15 = 0; i15 < H; i15++) {
                    int H2 = yVar.H();
                    i14 += H2 + 4;
                    yVar.O(H2);
                }
                i13++;
            }
            yVar.N(i11);
            byte[] bArr = new byte[i14];
            za.p pVar2 = pVar;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            float f10 = 1.0f;
            String str2 = null;
            int i26 = 0;
            int i27 = 0;
            while (i26 < A2) {
                int A3 = yVar.A() & 63;
                int H3 = yVar.H();
                int i28 = i12;
                za.p pVar3 = pVar2;
                while (i28 < H3) {
                    boolean z12 = z11;
                    int H4 = yVar.H();
                    int i29 = A;
                    System.arraycopy(h2.o.f14158a, i12, bArr, i27, i10);
                    int i30 = i27 + 4;
                    System.arraycopy(yVar.f11923a, yVar.f11924b, bArr, i30, H4);
                    if (A3 == 32 && i28 == 0) {
                        pVar3 = h2.o.l(i30, i30 + H4, bArr);
                    } else {
                        if (A3 == 33 && i28 == 0) {
                            h2.k k10 = h2.o.k(bArr, i30, i30 + H4, pVar3);
                            i16 = k10.f14125a + 1;
                            i17 = k10.f14130g;
                            int i31 = k10.h;
                            i19 = k10.f14127c + 8;
                            i20 = k10.d + 8;
                            int i32 = k10.f14133k;
                            i18 = i31;
                            int i33 = k10.f14134l;
                            int i34 = k10.f14135m;
                            float f11 = k10.f14131i;
                            int i35 = k10.f14132j;
                            h2.h hVar = k10.f14126b;
                            if (hVar != null) {
                                i3 = i35;
                                str2 = g2.h.a(hVar.f14114a, hVar.f14116c, hVar.d, hVar.f14118f, hVar.f14115b, hVar.f14117e);
                            } else {
                                i3 = i35;
                            }
                            i25 = i3;
                            f10 = f11;
                            i23 = i34;
                            i22 = i33;
                            i21 = i32;
                        } else if (A3 == 39 && i28 == 0 && (j10 = h2.o.j(i30, i30 + H4, bArr)) != null && pVar3 != null) {
                            i12 = 0;
                            if (j10.f156a == ((h2.g) ((g9.i0) pVar3.f60311a).get(0)).f14113b) {
                                i24 = 4;
                            } else {
                                i24 = 5;
                            }
                        }
                        i12 = 0;
                    }
                    i27 = i30 + H4;
                    yVar.O(H4);
                    i28++;
                    z11 = z12;
                    A = i29;
                    i10 = 4;
                }
                i26++;
                pVar2 = pVar3;
                i10 = 4;
            }
            int i36 = A;
            if (i14 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new x(singletonList, i36 + 1, i16, i17, i18, i19, i20, i21, i22, i23, i24, f10, i25, str2, pVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            if (z10) {
                str = "L-HEVC config";
            } else {
                str = "HEVC config";
            }
            throw v0.a(e10, "Error parsing".concat(str));
        }
    }
}
