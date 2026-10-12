package c3;

import b2.s0;
import java.util.Collections;
import java.util.List;
public final class x {
    public final List f4167a;
    public final int f4168b;
    public final int f4169c;
    public final int d;
    public final int f4170e;
    public final int f4171f;
    public final int f4172g;
    public final int h;
    public final int f4173i;
    public final int f4174j;
    public final int f4175k;
    public final float f4176l;
    public final int f4177m;
    public final String f4178n;
    public final oi.f f4179o;

    public x(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f7, int i20, String str, oi.f fVar) {
        this.f4167a = list;
        this.f4168b = i10;
        this.f4169c = i11;
        this.d = i12;
        this.f4170e = i13;
        this.f4171f = i14;
        this.f4172g = i15;
        this.h = i16;
        this.f4173i = i17;
        this.f4174j = i18;
        this.f4175k = i19;
        this.f4176l = f7;
        this.f4177m = i20;
        this.f4178n = str;
        this.f4179o = fVar;
    }

    public static x a(e2.v vVar, boolean z10, oi.f fVar) {
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
            int i12 = vVar.f8582b;
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
            oi.f fVar2 = fVar;
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
                oi.f fVar3 = fVar2;
                while (i29 < D3) {
                    boolean z12 = z11;
                    int D4 = vVar.D();
                    int i30 = x10;
                    System.arraycopy(f2.p.f9614a, i13, bArr, i28, i11);
                    int i31 = i28 + 4;
                    System.arraycopy(vVar.f8581a, vVar.f8582b, bArr, i31, D4);
                    if (x12 == 32 && i29 == 0) {
                        fVar3 = f2.p.i(i31, i31 + D4, bArr);
                    } else {
                        if (x12 == 33 && i29 == 0) {
                            f2.l h = f2.p.h(bArr, i31, i31 + D4, fVar3);
                            i17 = h.f9581a + 1;
                            i18 = h.f9586g;
                            int i32 = h.h;
                            i20 = h.f9583c + 8;
                            i21 = h.d + 8;
                            int i33 = h.f9589k;
                            i19 = i32;
                            int i34 = h.f9590l;
                            int i35 = h.f9591m;
                            float f10 = h.f9587i;
                            int i36 = h.f9588j;
                            f2.i iVar = h.f9582b;
                            if (iVar != null) {
                                i10 = i36;
                                str2 = e2.e.a(iVar.f9570a, iVar.f9572c, iVar.d, iVar.f9574f, iVar.f9571b, iVar.f9573e);
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
                            if (g10.f6761a == ((f2.h) ((e9.i0) fVar3.f16926a).get(0)).f9569b) {
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
