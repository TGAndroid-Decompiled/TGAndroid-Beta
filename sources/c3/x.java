package c3;

import b2.x0;
import java.util.Collections;
import java.util.List;
public final class x {
    public final List f6109a;
    public final int f6110b;
    public final int f6111c;
    public final int d;
    public final int e;
    public final int f6112f;
    public final int f6113g;
    public final int h;
    public final int f6114i;
    public final int f6115j;
    public final int f6116k;
    public final float f6117l;
    public final int f6118m;
    public final String f6119n;
    public final com.google.firebase.messaging.q f6120o;

    public x(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f7, int i20, String str, com.google.firebase.messaging.q qVar) {
        this.f6109a = list;
        this.f6110b = i10;
        this.f6111c = i11;
        this.d = i12;
        this.e = i13;
        this.f6112f = i14;
        this.f6113g = i15;
        this.h = i16;
        this.f6114i = i17;
        this.f6115j = i18;
        this.f6116k = i19;
        this.f6117l = f7;
        this.f6118m = i20;
        this.f6119n = str;
        this.f6120o = qVar;
    }

    public static x a(e2.x xVar, boolean z10, com.google.firebase.messaging.q qVar) {
        String str;
        boolean z11;
        List singletonList;
        ag.j j10;
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
            int i12 = xVar.f9732b;
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
            com.google.firebase.messaging.q qVar2 = qVar;
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
                com.google.firebase.messaging.q qVar3 = qVar2;
                while (i29 < H3) {
                    boolean z12 = z11;
                    int H4 = xVar.H();
                    int i30 = A;
                    System.arraycopy(f2.q.f10110a, i13, bArr, i28, i11);
                    int i31 = i28 + 4;
                    System.arraycopy(xVar.f9731a, xVar.f9732b, bArr, i31, H4);
                    if (A3 == 32 && i29 == 0) {
                        qVar3 = f2.q.l(i31, i31 + H4, bArr);
                    } else {
                        if (A3 == 33 && i29 == 0) {
                            f2.m k10 = f2.q.k(bArr, i31, i31 + H4, qVar3);
                            i17 = k10.f10079a + 1;
                            i18 = k10.f10083g;
                            int i32 = k10.h;
                            i20 = k10.f10081c + 8;
                            i21 = k10.d + 8;
                            int i33 = k10.f10086k;
                            i19 = i32;
                            int i34 = k10.f10087l;
                            int i35 = k10.f10088m;
                            float f10 = k10.f10084i;
                            int i36 = k10.f10085j;
                            f2.j jVar = k10.f10080b;
                            if (jVar != null) {
                                i10 = i36;
                                str2 = e2.g.a(jVar.f10070a, jVar.f10072c, jVar.d, jVar.f10073f, jVar.f10071b, jVar.e);
                            } else {
                                i10 = i36;
                            }
                            i26 = i10;
                            f7 = f10;
                            i24 = i35;
                            i23 = i34;
                            i22 = i33;
                        } else if (A3 == 39 && i29 == 0 && (j10 = f2.q.j(i31, i31 + H4, bArr)) != null && qVar3 != null) {
                            i13 = 0;
                            if (j10.f1303a == ((f2.i) ((f9.i0) qVar3.f7757a).get(0)).f10069b) {
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
                qVar2 = qVar3;
                i11 = 4;
            }
            int i37 = A;
            if (i15 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new x(singletonList, i37 + 1, i17, i18, i19, i20, i21, i22, i23, i24, i25, f7, i26, str2, qVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            if (z10) {
                str = "L-HEVC config";
            } else {
                str = "HEVC config";
            }
            throw x0.a(e, "Error parsing".concat(str));
        }
    }
}
