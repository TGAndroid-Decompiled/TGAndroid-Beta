package c3;

import b2.w0;
import e9.n0;
import java.util.Collections;
import java.util.List;
public final class x {
    public final List f4676a;
    public final int f4677b;
    public final int f4678c;
    public final int d;
    public final int e;
    public final int f4679f;
    public final int f4680g;
    public final int h;
    public final int f4681i;
    public final int f4682j;
    public final int f4683k;
    public final float f4684l;
    public final int f4685m;
    public final String f4686n;
    public final qi.e f4687o;

    public x(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f7, int i20, String str, qi.e eVar) {
        this.f4676a = list;
        this.f4677b = i10;
        this.f4678c = i11;
        this.d = i12;
        this.e = i13;
        this.f4679f = i14;
        this.f4680g = i15;
        this.h = i16;
        this.f4681i = i17;
        this.f4682j = i18;
        this.f4683k = i19;
        this.f4684l = f7;
        this.f4685m = i20;
        this.f4686n = str;
        this.f4687o = eVar;
    }

    public static x a(e2.x xVar, boolean z10, qi.e eVar) {
        String str;
        boolean z11;
        List singletonList;
        com.google.android.gms.internal.cast.a j10;
        int i10;
        int i11 = 4;
        try {
            if (z10) {
                xVar.O(4);
            } else {
                xVar.O(21);
            }
            int A = xVar.A() & 3;
            int A2 = xVar.A();
            int i12 = xVar.f8295b;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                z11 = true;
                if (i14 >= A2) {
                    break;
                }
                xVar.O(1);
                int H = xVar.H();
                for (int i16 = 0; i16 < H; i16++) {
                    int H2 = xVar.H();
                    i15 += H2 + 4;
                    xVar.O(H2);
                }
                i14++;
            }
            xVar.N(i12);
            byte[] bArr = new byte[i15];
            qi.e eVar2 = eVar;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            float f7 = 1.0f;
            String str2 = null;
            int i27 = 0;
            int i28 = 0;
            while (i27 < A2) {
                int A3 = xVar.A() & 63;
                int H3 = xVar.H();
                int i29 = i13;
                qi.e eVar3 = eVar2;
                while (i29 < H3) {
                    boolean z12 = z11;
                    int H4 = xVar.H();
                    int i30 = A;
                    System.arraycopy(f2.q.f10338a, i13, bArr, i28, i11);
                    int i31 = i28 + 4;
                    System.arraycopy(xVar.f8294a, xVar.f8295b, bArr, i31, H4);
                    if (A3 == 32 && i29 == 0) {
                        eVar3 = f2.q.l(i31, i31 + H4, bArr);
                    } else {
                        if (A3 == 33 && i29 == 0) {
                            f2.m k10 = f2.q.k(bArr, i31, i31 + H4, eVar3);
                            i17 = k10.f10307a + 1;
                            i18 = k10.f10311g;
                            int i32 = k10.h;
                            i20 = k10.f10309c + 8;
                            i21 = k10.d + 8;
                            int i33 = k10.f10314k;
                            i19 = i32;
                            int i34 = k10.f10315l;
                            int i35 = k10.f10316m;
                            float f10 = k10.f10312i;
                            int i36 = k10.f10313j;
                            f2.j jVar = k10.f10308b;
                            if (jVar != null) {
                                i10 = i36;
                                str2 = e2.g.a(jVar.f10298a, jVar.f10300c, jVar.d, jVar.f10301f, jVar.f10299b, jVar.e);
                            } else {
                                i10 = i36;
                            }
                            i26 = i10;
                            f7 = f10;
                            i24 = i35;
                            i23 = i34;
                            i22 = i33;
                        } else if (A3 == 39 && i29 == 0 && (j10 = f2.q.j(i31, i31 + H4, bArr)) != null && eVar3 != null) {
                            i13 = 0;
                            if (j10.f6566a == ((f2.i) ((n0) eVar3.f44797a).get(0)).f10297b) {
                                i25 = 4;
                            } else {
                                i25 = 5;
                            }
                        }
                        i13 = 0;
                    }
                    i28 = i31 + H4;
                    xVar.O(H4);
                    i29++;
                    z11 = z12;
                    A = i30;
                    i11 = 4;
                }
                i27++;
                eVar2 = eVar3;
                i11 = 4;
            }
            int i37 = A;
            if (i15 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new x(singletonList, i37 + 1, i17, i18, i19, i20, i21, i22, i23, i24, i25, f7, i26, str2, eVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            if (z10) {
                str = "L-HEVC config";
            } else {
                str = "HEVC config";
            }
            throw w0.a(e, "Error parsing".concat(str));
        }
    }
}
