package c3;

import b2.s0;
import java.util.Collections;
import java.util.List;
public final class x {
    public final List f4168a;
    public final int f4169b;
    public final int f4170c;
    public final int d;
    public final int f4171e;
    public final int f4172f;
    public final int f4173g;
    public final int h;
    public final int f4174i;
    public final int f4175j;
    public final int f4176k;
    public final float f4177l;
    public final int f4178m;
    public final String f4179n;
    public final pi.f f4180o;

    public x(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f7, int i20, String str, pi.f fVar) {
        this.f4168a = list;
        this.f4169b = i10;
        this.f4170c = i11;
        this.d = i12;
        this.f4171e = i13;
        this.f4172f = i14;
        this.f4173g = i15;
        this.h = i16;
        this.f4174i = i17;
        this.f4175j = i18;
        this.f4176k = i19;
        this.f4177l = f7;
        this.f4178m = i20;
        this.f4179n = str;
        this.f4180o = fVar;
    }

    public static x a(e2.v vVar, boolean z10, pi.f fVar) {
        String str;
        boolean z11;
        List singletonList;
        com.google.android.gms.internal.cast.a g10;
        int i10;
        int i11 = 4;
        try {
            if (z10) {
                vVar.K(4);
            } else {
                vVar.K(21);
            }
            int x10 = vVar.x() & 3;
            int x11 = vVar.x();
            int i12 = vVar.f8584b;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                z11 = true;
                if (i14 >= x11) {
                    break;
                }
                vVar.K(1);
                int D = vVar.D();
                for (int i16 = 0; i16 < D; i16++) {
                    int D2 = vVar.D();
                    i15 += D2 + 4;
                    vVar.K(D2);
                }
                i14++;
            }
            vVar.J(i12);
            byte[] bArr = new byte[i15];
            pi.f fVar2 = fVar;
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
            while (i27 < x11) {
                int x12 = vVar.x() & 63;
                int D3 = vVar.D();
                int i29 = i13;
                pi.f fVar3 = fVar2;
                while (i29 < D3) {
                    boolean z12 = z11;
                    int D4 = vVar.D();
                    int i30 = x10;
                    System.arraycopy(f2.p.f9616a, i13, bArr, i28, i11);
                    int i31 = i28 + 4;
                    System.arraycopy(vVar.f8583a, vVar.f8584b, bArr, i31, D4);
                    if (x12 == 32 && i29 == 0) {
                        fVar3 = f2.p.i(i31, i31 + D4, bArr);
                    } else {
                        if (x12 == 33 && i29 == 0) {
                            f2.l h = f2.p.h(bArr, i31, i31 + D4, fVar3);
                            i17 = h.f9583a + 1;
                            i18 = h.f9588g;
                            int i32 = h.h;
                            i20 = h.f9585c + 8;
                            i21 = h.d + 8;
                            int i33 = h.f9591k;
                            i19 = i32;
                            int i34 = h.f9592l;
                            int i35 = h.f9593m;
                            float f10 = h.f9589i;
                            int i36 = h.f9590j;
                            f2.i iVar = h.f9584b;
                            if (iVar != null) {
                                i10 = i36;
                                str2 = e2.e.a(iVar.f9572a, iVar.f9574c, iVar.d, iVar.f9576f, iVar.f9573b, iVar.f9575e);
                            } else {
                                i10 = i36;
                            }
                            i26 = i10;
                            f7 = f10;
                            i24 = i35;
                            i23 = i34;
                            i22 = i33;
                        } else if (x12 == 39 && i29 == 0 && (g10 = f2.p.g(i31, i31 + D4, bArr)) != null && fVar3 != null) {
                            i13 = 0;
                            if (g10.f6762a == ((f2.h) ((e9.i0) fVar3.f45972a).get(0)).f9571b) {
                                i25 = 4;
                            } else {
                                i25 = 5;
                            }
                        }
                        i13 = 0;
                    }
                    i28 = i31 + D4;
                    vVar.K(D4);
                    i29++;
                    z11 = z12;
                    x10 = i30;
                    i11 = 4;
                }
                i27++;
                fVar2 = fVar3;
                i11 = 4;
            }
            int i37 = x10;
            if (i15 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new x(singletonList, i37 + 1, i17, i18, i19, i20, i21, i22, i23, i24, i25, f7, i26, str2, fVar2);
        } catch (ArrayIndexOutOfBoundsException e7) {
            if (z10) {
                str = "L-HEVC config";
            } else {
                str = "HEVC config";
            }
            throw s0.a(e7, "Error parsing".concat(str));
        }
    }
}
