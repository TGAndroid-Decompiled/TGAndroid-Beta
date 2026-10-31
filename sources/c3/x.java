package c3;

import b2.w0;
import e9.n0;
import java.util.Collections;
import java.util.List;
public final class x {
    public final List f3704a;
    public final int f3705b;
    public final int f3706c;
    public final int d;
    public final int e;
    public final int f3707f;
    public final int f3708g;
    public final int h;
    public final int f3709i;
    public final int f3710j;
    public final int f3711k;
    public final float f3712l;
    public final int f3713m;
    public final String f3714n;
    public final xa.n f3715o;

    public x(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f7, int i20, String str, xa.n nVar) {
        this.f3704a = list;
        this.f3705b = i10;
        this.f3706c = i11;
        this.d = i12;
        this.e = i13;
        this.f3707f = i14;
        this.f3708g = i15;
        this.h = i16;
        this.f3709i = i17;
        this.f3710j = i18;
        this.f3711k = i19;
        this.f3712l = f7;
        this.f3713m = i20;
        this.f3714n = str;
        this.f3715o = nVar;
    }

    public static x a(e2.x xVar, boolean z10, xa.n nVar) {
        String str;
        boolean z11;
        List singletonList;
        ae.j j10;
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
            int i12 = xVar.f6208b;
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
            xa.n nVar2 = nVar;
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
                xa.n nVar3 = nVar2;
                while (i29 < H3) {
                    boolean z12 = z11;
                    int H4 = xVar.H();
                    int i30 = A;
                    System.arraycopy(f2.q.f6783a, i13, bArr, i28, i11);
                    int i31 = i28 + 4;
                    System.arraycopy(xVar.f6207a, xVar.f6208b, bArr, i31, H4);
                    if (A3 == 32 && i29 == 0) {
                        nVar3 = f2.q.l(i31, i31 + H4, bArr);
                    } else {
                        if (A3 == 33 && i29 == 0) {
                            f2.m k10 = f2.q.k(bArr, i31, i31 + H4, nVar3);
                            i17 = k10.f6752a + 1;
                            i18 = k10.f6756g;
                            int i32 = k10.h;
                            i20 = k10.f6754c + 8;
                            i21 = k10.d + 8;
                            int i33 = k10.f6759k;
                            i19 = i32;
                            int i34 = k10.f6760l;
                            int i35 = k10.f6761m;
                            float f10 = k10.f6757i;
                            int i36 = k10.f6758j;
                            f2.j jVar = k10.f6753b;
                            if (jVar != null) {
                                i10 = i36;
                                str2 = e2.g.a(jVar.f6743a, jVar.f6745c, jVar.d, jVar.f6746f, jVar.f6744b, jVar.e);
                            } else {
                                i10 = i36;
                            }
                            i26 = i10;
                            f7 = f10;
                            i24 = i35;
                            i23 = i34;
                            i22 = i33;
                        } else if (A3 == 39 && i29 == 0 && (j10 = f2.q.j(i31, i31 + H4, bArr)) != null && nVar3 != null) {
                            i13 = 0;
                            if (j10.f425a == ((f2.i) ((n0) nVar3.f53554a).get(0)).f6742b) {
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
                nVar2 = nVar3;
                i11 = 4;
            }
            int i37 = A;
            if (i15 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new x(singletonList, i37 + 1, i17, i18, i19, i20, i21, i22, i23, i24, i25, f7, i26, str2, nVar2);
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
