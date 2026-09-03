package j3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
public final class n0 implements g {
    public final String B;
    public final String C;
    public final int D;
    public final List E;
    public final o3.h F;
    public final long G;
    public final int H;
    public final int I;
    public final float J;
    public final int K;
    public final float L;
    public final byte[] M;
    public final int N;
    public final i5.b O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public int Y;
    public final String f8717a;
    public final String f8718b;
    public final String f8719c;
    public final int d;
    public final int e;
    public final int f8720f;
    public final int h;
    public final int f8721n;
    public final String f8722r;
    public final e4.c f8723s;
    public boolean v;
    public long f8724w;
    public int f8725x;
    public String f8726y;
    public static final n0 Z = new n0(new m0());
    public static final String f8692a0 = Integer.toString(0, 36);
    public static final String f8693b0 = Integer.toString(1, 36);
    public static final String f8694c0 = Integer.toString(2, 36);
    public static final String f8695d0 = Integer.toString(3, 36);
    public static final String f8696e0 = Integer.toString(4, 36);
    public static final String f8697f0 = Integer.toString(5, 36);
    public static final String f8698g0 = Integer.toString(6, 36);
    public static final String f8699h0 = Integer.toString(7, 36);
    public static final String f8700i0 = Integer.toString(8, 36);
    public static final String f8701j0 = Integer.toString(9, 36);
    public static final String f8702k0 = Integer.toString(10, 36);
    public static final String f8703l0 = Integer.toString(11, 36);
    public static final String m0 = Integer.toString(12, 36);
    public static final String f8704n0 = Integer.toString(13, 36);
    public static final String f8705o0 = Integer.toString(14, 36);
    public static final String f8706p0 = Integer.toString(15, 36);
    public static final String f8707q0 = Integer.toString(16, 36);
    public static final String f8708r0 = Integer.toString(17, 36);
    public static final String f8709s0 = Integer.toString(18, 36);
    public static final String f8710t0 = Integer.toString(19, 36);
    public static final String f8711u0 = Integer.toString(20, 36);
    public static final String f8712v0 = Integer.toString(21, 36);
    public static final String f8713w0 = Integer.toString(22, 36);
    public static final String f8714x0 = Integer.toString(23, 36);
    public static final String f8715y0 = Integer.toString(24, 36);
    public static final String f8716z0 = Integer.toString(25, 36);
    public static final String A0 = Integer.toString(26, 36);
    public static final String B0 = Integer.toString(27, 36);
    public static final String C0 = Integer.toString(28, 36);
    public static final String D0 = Integer.toString(29, 36);
    public static final String E0 = Integer.toString(30, 36);
    public static final String F0 = Integer.toString(31, 36);
    public static final f0.d G0 = new f0.d(27);

    public n0(m0 m0Var) {
        this.f8717a = m0Var.f8655a;
        this.f8718b = m0Var.f8656b;
        this.f8719c = h5.d0.H(m0Var.f8657c);
        this.d = m0Var.d;
        this.e = m0Var.e;
        int i10 = m0Var.f8658f;
        this.f8720f = i10;
        int i11 = m0Var.f8659g;
        this.h = i11;
        this.f8721n = i11 != -1 ? i11 : i10;
        this.f8722r = m0Var.h;
        this.f8723s = m0Var.f8660i;
        this.v = m0Var.f8661j;
        this.f8724w = m0Var.f8662k;
        this.f8725x = m0Var.f8664m;
        this.f8726y = m0Var.f8663l;
        this.B = m0Var.f8665n;
        this.C = m0Var.f8666o;
        this.D = m0Var.f8667p;
        List list = m0Var.f8668q;
        this.E = list == null ? Collections.EMPTY_LIST : list;
        o3.h hVar = m0Var.f8669r;
        this.F = hVar;
        this.G = m0Var.f8670s;
        this.H = m0Var.f8671t;
        this.I = m0Var.f8672u;
        this.J = m0Var.v;
        int i12 = m0Var.f8673w;
        this.K = i12 == -1 ? 0 : i12;
        float f10 = m0Var.f8674x;
        this.L = f10 == -1.0f ? 1.0f : f10;
        this.M = m0Var.f8675y;
        this.N = m0Var.f8676z;
        this.O = m0Var.A;
        this.P = m0Var.B;
        this.Q = m0Var.C;
        this.R = m0Var.D;
        int i13 = m0Var.E;
        this.S = i13 == -1 ? 0 : i13;
        int i14 = m0Var.F;
        this.T = i14 != -1 ? i14 : 0;
        this.U = m0Var.G;
        this.V = m0Var.H;
        this.W = m0Var.I;
        int i15 = m0Var.J;
        if (i15 == 0 && hVar != null) {
            this.X = 1;
        } else {
            this.X = i15;
        }
    }

    public final m0 a() {
        ?? obj = new Object();
        obj.f8655a = this.f8717a;
        obj.f8656b = this.f8718b;
        obj.f8657c = this.f8719c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f8658f = this.f8720f;
        obj.f8659g = this.h;
        obj.h = this.f8722r;
        obj.f8660i = this.f8723s;
        obj.f8665n = this.B;
        obj.f8666o = this.C;
        obj.f8667p = this.D;
        obj.f8668q = this.E;
        obj.f8669r = this.F;
        obj.f8670s = this.G;
        obj.f8671t = this.H;
        obj.f8672u = this.I;
        obj.v = this.J;
        obj.f8673w = this.K;
        obj.f8674x = this.L;
        obj.f8675y = this.M;
        obj.f8676z = this.N;
        obj.A = this.O;
        obj.B = this.P;
        obj.C = this.Q;
        obj.D = this.R;
        obj.E = this.S;
        obj.F = this.T;
        obj.G = this.U;
        obj.H = this.V;
        obj.I = this.W;
        obj.J = this.X;
        obj.f8661j = this.v;
        obj.f8662k = this.f8724w;
        obj.f8664m = this.f8725x;
        obj.f8663l = this.f8726y;
        return obj;
    }

    public final boolean b(n0 n0Var) {
        List list = this.E;
        if (list.size() != n0Var.E.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) n0Var.E.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final n0 c(n0 n0Var) {
        String str;
        String str2;
        o3.h hVar;
        int i10;
        int i11;
        if (this == n0Var) {
            return this;
        }
        int g10 = h5.o.g(this.C);
        String str3 = n0Var.f8717a;
        e4.c cVar = n0Var.f8723s;
        String str4 = n0Var.f8718b;
        if (str4 == null) {
            str4 = this.f8718b;
        }
        if ((g10 != 3 && g10 != 1) || (str = n0Var.f8719c) == null) {
            str = this.f8719c;
        }
        int i12 = this.f8720f;
        if (i12 == -1) {
            i12 = n0Var.f8720f;
        }
        int i13 = this.h;
        if (i13 == -1) {
            i13 = n0Var.h;
        }
        String str5 = this.f8722r;
        if (str5 == null) {
            String p10 = h5.d0.p(g10, n0Var.f8722r);
            if (h5.d0.P(p10).length == 1) {
                str5 = p10;
            }
        }
        e4.c cVar2 = this.f8723s;
        if (cVar2 != null) {
            if (cVar == null) {
                cVar = cVar2;
            } else {
                cVar = cVar2.a(cVar.f5109a);
            }
        }
        float f10 = this.J;
        if (f10 == -1.0f && g10 == 2) {
            f10 = n0Var.J;
        }
        int i14 = this.d | n0Var.d;
        int i15 = this.e | n0Var.e;
        o3.h hVar2 = n0Var.F;
        ArrayList arrayList = new ArrayList();
        if (hVar2 != null) {
            str2 = hVar2.f16247c;
            o3.g[] gVarArr = hVar2.f16245a;
            int length = gVarArr.length;
            int i16 = 0;
            while (i16 < length) {
                o3.g[] gVarArr2 = gVarArr;
                o3.g gVar = gVarArr2[i16];
                int i17 = length;
                if (gVar.e != null) {
                    arrayList.add(gVar);
                }
                i16++;
                gVarArr = gVarArr2;
                length = i17;
            }
        } else {
            str2 = null;
        }
        o3.h hVar3 = this.F;
        if (hVar3 != null) {
            if (str2 == null) {
                str2 = hVar3.f16247c;
            }
            int size = arrayList.size();
            o3.g[] gVarArr3 = hVar3.f16245a;
            int length2 = gVarArr3.length;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = i18;
                o3.g gVar2 = gVarArr3[i19];
                o3.g[] gVarArr4 = gVarArr3;
                if (gVar2.e != null) {
                    UUID uuid = gVar2.f16243b;
                    i11 = length2;
                    int i20 = 0;
                    while (true) {
                        if (i20 < size) {
                            i10 = size;
                            if (((o3.g) arrayList.get(i20)).f16243b.equals(uuid)) {
                                break;
                            }
                            i20++;
                            size = i10;
                        } else {
                            i10 = size;
                            arrayList.add(gVar2);
                            break;
                        }
                    }
                } else {
                    i10 = size;
                    i11 = length2;
                }
                i18 = i19 + 1;
                gVarArr3 = gVarArr4;
                length2 = i11;
                size = i10;
            }
        }
        if (arrayList.isEmpty()) {
            hVar = null;
        } else {
            hVar = new o3.h(str2, arrayList);
        }
        m0 a2 = a();
        a2.f8655a = str3;
        a2.f8656b = str4;
        a2.f8657c = str;
        a2.d = i14;
        a2.e = i15;
        a2.f8658f = i12;
        a2.f8659g = i13;
        a2.h = str5;
        a2.f8660i = cVar;
        a2.f8669r = hVar;
        a2.v = f10;
        return new n0(a2);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass()) {
            n0 n0Var = (n0) obj;
            int i11 = this.Y;
            if ((i11 == 0 || (i10 = n0Var.Y) == 0 || i11 == i10) && this.d == n0Var.d && this.e == n0Var.e && this.f8720f == n0Var.f8720f && this.h == n0Var.h && this.D == n0Var.D && this.G == n0Var.G && this.H == n0Var.H && this.I == n0Var.I && this.K == n0Var.K && this.N == n0Var.N && this.P == n0Var.P && this.Q == n0Var.Q && this.R == n0Var.R && this.S == n0Var.S && this.T == n0Var.T && this.U == n0Var.U && this.V == n0Var.V && this.W == n0Var.W && this.X == n0Var.X && Float.compare(this.J, n0Var.J) == 0 && Float.compare(this.L, n0Var.L) == 0 && h5.d0.a(this.f8717a, n0Var.f8717a) && h5.d0.a(this.f8718b, n0Var.f8718b) && h5.d0.a(this.f8722r, n0Var.f8722r) && h5.d0.a(this.B, n0Var.B) && h5.d0.a(this.C, n0Var.C) && h5.d0.a(this.f8719c, n0Var.f8719c) && Arrays.equals(this.M, n0Var.M) && h5.d0.a(this.f8723s, n0Var.f8723s) && h5.d0.a(this.O, n0Var.O) && h5.d0.a(this.F, n0Var.F) && b(n0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        if (this.Y == 0) {
            int i11 = 0;
            String str = this.f8717a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = (527 + hashCode) * 31;
            String str2 = this.f8718b;
            if (str2 != null) {
                i10 = str2.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (i12 + i10) * 31;
            String str3 = this.f8719c;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i14 = (((((((((i13 + hashCode2) * 31) + this.d) * 31) + this.e) * 31) + this.f8720f) * 31) + this.h) * 31;
            String str4 = this.f8722r;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i15 = (i14 + hashCode3) * 31;
            e4.c cVar = this.f8723s;
            if (cVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = cVar.hashCode();
            }
            int i16 = (i15 + hashCode4) * 31;
            String str5 = this.B;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i17 = (i16 + hashCode5) * 31;
            String str6 = this.C;
            if (str6 != null) {
                i11 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.J);
            this.Y = ((((((((((((((((((((Float.floatToIntBits(this.L) + ((((floatToIntBits + ((((((((((i17 + i11) * 31) + this.D) * 31) + ((int) this.G)) * 31) + this.H) * 31) + this.I) * 31)) * 31) + this.K) * 31)) * 31) + this.N) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + this.V) * 31) + this.W) * 31) + this.X;
        }
        return this.Y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f8717a);
        sb.append(", ");
        sb.append(this.f8718b);
        sb.append(", ");
        sb.append(this.B);
        sb.append(", ");
        sb.append(this.C);
        sb.append(", ");
        sb.append(this.f8722r);
        sb.append(", ");
        sb.append(this.f8721n);
        sb.append(", ");
        sb.append(this.f8719c);
        sb.append(", [");
        sb.append(this.H);
        sb.append(", ");
        sb.append(this.I);
        sb.append(", ");
        sb.append(this.J);
        sb.append(", ");
        sb.append(this.O);
        sb.append("], [");
        sb.append(this.P);
        sb.append(", ");
        return android.support.v4.media.a.m(this.Q, "])", sb);
    }
}
