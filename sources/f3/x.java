package f3;

import e2.t0;
import java.util.Collections;
import java.util.List;
public final class x {
    public final List f11093a;
    public final int f11094b;
    public final int f11095c;
    public final int d;
    public final int f11096e;
    public final int f11097f;
    public final int f11098g;
    public final int h;
    public final int f11099i;
    public final int f11100j;
    public final int f11101k;
    public final float f11102l;
    public final int f11103m;
    public final String f11104n;
    public final ui.e f11105o;

    public x(List list, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, int i19, String str, ui.e eVar) {
        this.f11093a = list;
        this.f11094b = i7;
        this.f11095c = i10;
        this.d = i11;
        this.f11096e = i12;
        this.f11097f = i13;
        this.f11098g = i14;
        this.h = i15;
        this.f11099i = i16;
        this.f11100j = i17;
        this.f11101k = i18;
        this.f11102l = f10;
        this.f11103m = i19;
        this.f11104n = str;
        this.f11105o = eVar;
    }

    public static x a(h2.x xVar, boolean z9, ui.e eVar) {
        String str;
        boolean z10;
        List singletonList;
        b7.l j3;
        int i7;
        int i10 = 4;
        try {
            if (z9) {
                xVar.O(4);
            } else {
                xVar.O(21);
            }
            int A = xVar.A() & 3;
            int A2 = xVar.A();
            int i11 = xVar.f14165b;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z10 = true;
                if (i13 >= A2) {
                    break;
                }
                xVar.O(1);
                int H = xVar.H();
                for (int i15 = 0; i15 < H; i15++) {
                    int H2 = xVar.H();
                    i14 += H2 + 4;
                    xVar.O(H2);
                }
                i13++;
            }
            xVar.N(i11);
            byte[] bArr = new byte[i14];
            ui.e eVar2 = eVar;
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
                int A3 = xVar.A() & 63;
                int H3 = xVar.H();
                int i28 = i12;
                ui.e eVar3 = eVar2;
                while (i28 < H3) {
                    boolean z11 = z10;
                    int H4 = xVar.H();
                    int i29 = A;
                    System.arraycopy(i2.o.f15207a, i12, bArr, i27, i10);
                    int i30 = i27 + 4;
                    System.arraycopy(xVar.f14164a, xVar.f14165b, bArr, i30, H4);
                    if (A3 == 32 && i28 == 0) {
                        eVar3 = i2.o.l(i30, i30 + H4, bArr);
                    } else {
                        if (A3 == 33 && i28 == 0) {
                            i2.k k10 = i2.o.k(bArr, i30, i30 + H4, eVar3);
                            i16 = k10.f15174a + 1;
                            i17 = k10.f15179g;
                            int i31 = k10.h;
                            i19 = k10.f15176c + 8;
                            i20 = k10.d + 8;
                            int i32 = k10.f15182k;
                            i18 = i31;
                            int i33 = k10.f15183l;
                            int i34 = k10.f15184m;
                            float f11 = k10.f15180i;
                            int i35 = k10.f15181j;
                            i2.h hVar = k10.f15175b;
                            if (hVar != null) {
                                i7 = i35;
                                str2 = h2.g.a(hVar.f15163a, hVar.f15165c, hVar.d, hVar.f15167f, hVar.f15164b, hVar.f15166e);
                            } else {
                                i7 = i35;
                            }
                            i25 = i7;
                            f10 = f11;
                            i23 = i34;
                            i22 = i33;
                            i21 = i32;
                        } else if (A3 == 39 && i28 == 0 && (j3 = i2.o.j(i30, i30 + H4, bArr)) != null && eVar3 != null) {
                            i12 = 0;
                            if (j3.f3009a == ((i2.g) ((h9.i0) eVar3.f56939b).get(0)).f15162b) {
                                i24 = 4;
                            } else {
                                i24 = 5;
                            }
                        }
                        i12 = 0;
                    }
                    i27 = i30 + H4;
                    xVar.O(H4);
                    i28++;
                    z10 = z11;
                    A = i29;
                    i10 = 4;
                }
                i26++;
                eVar2 = eVar3;
                i10 = 4;
            }
            int i36 = A;
            if (i14 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new x(singletonList, i36 + 1, i16, i17, i18, i19, i20, i21, i22, i23, i24, f10, i25, str2, eVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            if (z9) {
                str = "L-HEVC config";
            } else {
                str = "HEVC config";
            }
            throw t0.a(e10, "Error parsing".concat(str));
        }
    }
}
