package c3;

import b2.s0;
import java.util.Collections;
import java.util.List;
public final class x {
    public final List f4119a;
    public final int f4120b;
    public final int f4121c;
    public final int d;
    public final int f4122e;
    public final int f4123f;
    public final int f4124g;
    public final int h;
    public final int f4125i;
    public final int f4126j;
    public final int f4127k;
    public final float f4128l;
    public final int f4129m;
    public final String f4130n;
    public final qi.f f4131o;

    public x(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f7, int i20, String str, qi.f fVar) {
        this.f4119a = list;
        this.f4120b = i10;
        this.f4121c = i11;
        this.d = i12;
        this.f4122e = i13;
        this.f4123f = i14;
        this.f4124g = i15;
        this.h = i16;
        this.f4125i = i17;
        this.f4126j = i18;
        this.f4127k = i19;
        this.f4128l = f7;
        this.f4129m = i20;
        this.f4130n = str;
        this.f4131o = fVar;
    }

    public static x a(e2.v vVar, boolean z10, qi.f fVar) {
        String str;
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
            int i12 = vVar.f8591b;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < x11; i15++) {
                vVar.K(1);
                int D = vVar.D();
                for (int i16 = 0; i16 < D; i16++) {
                    int D2 = vVar.D();
                    i14 += D2 + 4;
                    vVar.K(D2);
                }
            }
            vVar.J(i12);
            byte[] bArr = new byte[i14];
            qi.f fVar2 = fVar;
            String str2 = null;
            int i17 = 0;
            int i18 = 0;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            float f7 = 1.0f;
            int i28 = -1;
            while (i17 < x11) {
                int x12 = vVar.x() & 63;
                int D3 = vVar.D();
                qi.f fVar3 = fVar2;
                int i29 = 0;
                while (i29 < D3) {
                    int D4 = vVar.D();
                    int i30 = x10;
                    System.arraycopy(f2.o.f9606a, i13, bArr, i18, i11);
                    int i31 = i18 + 4;
                    System.arraycopy(vVar.f8590a, vVar.f8591b, bArr, i31, D4);
                    if (x12 == 32 && i29 == 0) {
                        fVar3 = f2.o.i(i31, i31 + D4, bArr);
                    } else {
                        if (x12 == 33 && i29 == 0) {
                            f2.k h = f2.o.h(bArr, i31, i31 + D4, fVar3);
                            i19 = h.f9573a + 1;
                            i20 = h.f9578g;
                            int i32 = h.h;
                            i22 = h.f9575c + 8;
                            i23 = h.d + 8;
                            int i33 = h.f9581k;
                            i21 = i32;
                            int i34 = h.f9582l;
                            int i35 = h.f9583m;
                            float f10 = h.f9579i;
                            int i36 = h.f9580j;
                            f2.h hVar = h.f9574b;
                            if (hVar != null) {
                                i10 = i36;
                                str2 = e2.e.a(hVar.f9562a, hVar.f9564c, hVar.d, hVar.f9566f, hVar.f9563b, hVar.f9565e);
                            } else {
                                i10 = i36;
                            }
                            i28 = i10;
                            f7 = f10;
                            i26 = i35;
                            i25 = i34;
                            i24 = i33;
                        } else if (x12 == 39 && i29 == 0 && (g10 = f2.o.g(i31, i31 + D4, bArr)) != null && fVar3 != null) {
                            i13 = 0;
                            if (g10.f6711a == ((f2.g) ((e9.i0) fVar3.f45541a).get(0)).f9561b) {
                                i27 = 4;
                            } else {
                                i27 = 5;
                            }
                        }
                        i13 = 0;
                    }
                    i18 = i31 + D4;
                    vVar.K(D4);
                    i29++;
                    x10 = i30;
                    i11 = 4;
                }
                i17++;
                fVar2 = fVar3;
                i11 = 4;
            }
            int i37 = x10;
            if (i14 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new x(singletonList, i37 + 1, i19, i20, i21, i22, i23, i24, i25, i26, i27, f7, i28, str2, fVar2);
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
