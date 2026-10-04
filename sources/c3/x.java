package c3;

import b2.s0;
import java.util.Collections;
import java.util.List;
public final class x {
    public final List f4118a;
    public final int f4119b;
    public final int f4120c;
    public final int d;
    public final int f4121e;
    public final int f4122f;
    public final int f4123g;
    public final int h;
    public final int f4124i;
    public final int f4125j;
    public final int f4126k;
    public final float f4127l;
    public final int f4128m;
    public final String f4129n;
    public final qi.f f4130o;

    public x(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f7, int i20, String str, qi.f fVar) {
        this.f4118a = list;
        this.f4119b = i10;
        this.f4120c = i11;
        this.d = i12;
        this.f4121e = i13;
        this.f4122f = i14;
        this.f4123g = i15;
        this.h = i16;
        this.f4124i = i17;
        this.f4125j = i18;
        this.f4126k = i19;
        this.f4127l = f7;
        this.f4128m = i20;
        this.f4129n = str;
        this.f4130o = fVar;
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
            int i12 = vVar.f8590b;
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
                    System.arraycopy(f2.o.f9605a, i13, bArr, i18, i11);
                    int i31 = i18 + 4;
                    System.arraycopy(vVar.f8589a, vVar.f8590b, bArr, i31, D4);
                    if (x12 == 32 && i29 == 0) {
                        fVar3 = f2.o.i(i31, i31 + D4, bArr);
                    } else {
                        if (x12 == 33 && i29 == 0) {
                            f2.k h = f2.o.h(bArr, i31, i31 + D4, fVar3);
                            i19 = h.f9572a + 1;
                            i20 = h.f9577g;
                            int i32 = h.h;
                            i22 = h.f9574c + 8;
                            i23 = h.d + 8;
                            int i33 = h.f9580k;
                            i21 = i32;
                            int i34 = h.f9581l;
                            int i35 = h.f9582m;
                            float f10 = h.f9578i;
                            int i36 = h.f9579j;
                            f2.h hVar = h.f9573b;
                            if (hVar != null) {
                                i10 = i36;
                                str2 = e2.e.a(hVar.f9561a, hVar.f9563c, hVar.d, hVar.f9565f, hVar.f9562b, hVar.f9564e);
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
                            if (g10.f6710a == ((f2.g) ((e9.i0) fVar3.f45526a).get(0)).f9560b) {
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
