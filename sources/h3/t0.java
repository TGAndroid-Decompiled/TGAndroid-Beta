package h3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class t0 implements g {
    public final String A;
    public final String B;
    public final int C;
    public final List D;
    public final l3.d E;
    public final long F;
    public final int G;
    public final int H;
    public final float I;
    public final int J;
    public final float K;
    public final byte[] L;
    public final int M;
    public final e5.b N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public int X;

    public final String f8184a;

    public final String f8185b;

    public final String f8186c;
    public final int d;

    public final int f8187e;

    public final int f8188f;
    public final int h;

    public final int f8189n;

    public final String f8190r;

    public final z3.c f8191s;
    public boolean v;

    public long f8192w;

    public int f8193x;

    public String f8194y;
    public static final t0 Y = new t0(new s0());
    public static final String Z = Integer.toString(0, 36);

    public static final String f8159a0 = Integer.toString(1, 36);

    public static final String f8160b0 = Integer.toString(2, 36);

    public static final String f8161c0 = Integer.toString(3, 36);

    public static final String f8162d0 = Integer.toString(4, 36);

    public static final String f8163e0 = Integer.toString(5, 36);

    public static final String f8164f0 = Integer.toString(6, 36);

    public static final String f8165g0 = Integer.toString(7, 36);

    public static final String f8166h0 = Integer.toString(8, 36);

    public static final String f8167i0 = Integer.toString(9, 36);

    public static final String f8168j0 = Integer.toString(10, 36);

    public static final String f8169k0 = Integer.toString(11, 36);

    public static final String f8170l0 = Integer.toString(12, 36);
    public static final String m0 = Integer.toString(13, 36);

    public static final String f8171n0 = Integer.toString(14, 36);

    public static final String f8172o0 = Integer.toString(15, 36);

    public static final String f8173p0 = Integer.toString(16, 36);

    public static final String f8174q0 = Integer.toString(17, 36);

    public static final String f8175r0 = Integer.toString(18, 36);

    public static final String f8176s0 = Integer.toString(19, 36);

    public static final String f8177t0 = Integer.toString(20, 36);

    public static final String f8178u0 = Integer.toString(21, 36);

    public static final String f8179v0 = Integer.toString(22, 36);

    public static final String f8180w0 = Integer.toString(23, 36);

    public static final String f8181x0 = Integer.toString(24, 36);

    public static final String f8182y0 = Integer.toString(25, 36);

    public static final String f8183z0 = Integer.toString(26, 36);
    public static final String A0 = Integer.toString(27, 36);
    public static final String B0 = Integer.toString(28, 36);
    public static final String C0 = Integer.toString(29, 36);
    public static final String D0 = Integer.toString(30, 36);
    public static final String E0 = Integer.toString(31, 36);
    public static final f9.z F0 = new f9.z(18);

    public t0(s0 s0Var) {
        this.f8184a = s0Var.f8123a;
        this.f8185b = s0Var.f8124b;
        this.f8186c = d5.g0.I(s0Var.f8125c);
        this.d = s0Var.d;
        this.f8187e = s0Var.f8126e;
        int i10 = s0Var.f8127f;
        this.f8188f = i10;
        int i11 = s0Var.f8128g;
        this.h = i11;
        this.f8189n = i11 != -1 ? i11 : i10;
        this.f8190r = s0Var.h;
        this.f8191s = s0Var.f8129i;
        this.v = s0Var.f8130j;
        this.f8192w = s0Var.f8131k;
        this.f8193x = s0Var.f8133m;
        this.f8194y = s0Var.f8132l;
        this.A = s0Var.f8134n;
        this.B = s0Var.f8135o;
        this.C = s0Var.f8136p;
        List list = s0Var.f8137q;
        this.D = list == null ? Collections.EMPTY_LIST : list;
        l3.d dVar = s0Var.f8138r;
        this.E = dVar;
        this.F = s0Var.f8139s;
        this.G = s0Var.f8140t;
        this.H = s0Var.f8141u;
        this.I = s0Var.v;
        int i12 = s0Var.f8142w;
        this.J = i12 == -1 ? 0 : i12;
        float f10 = s0Var.f8143x;
        this.K = f10 == -1.0f ? 1.0f : f10;
        this.L = s0Var.f8144y;
        this.M = s0Var.f8145z;
        this.N = s0Var.A;
        this.O = s0Var.B;
        this.P = s0Var.C;
        this.Q = s0Var.D;
        int i13 = s0Var.E;
        this.R = i13 == -1 ? 0 : i13;
        int i14 = s0Var.F;
        this.S = i14 != -1 ? i14 : 0;
        this.T = s0Var.G;
        this.U = s0Var.H;
        this.V = s0Var.I;
        int i15 = s0Var.J;
        if (i15 != 0 || dVar == null) {
            this.W = i15;
        } else {
            this.W = 1;
        }
    }

    public final s0 a() {
        s0 s0Var = new s0();
        s0Var.f8123a = this.f8184a;
        s0Var.f8124b = this.f8185b;
        s0Var.f8125c = this.f8186c;
        s0Var.d = this.d;
        s0Var.f8126e = this.f8187e;
        s0Var.f8127f = this.f8188f;
        s0Var.f8128g = this.h;
        s0Var.h = this.f8190r;
        s0Var.f8129i = this.f8191s;
        s0Var.f8134n = this.A;
        s0Var.f8135o = this.B;
        s0Var.f8136p = this.C;
        s0Var.f8137q = this.D;
        s0Var.f8138r = this.E;
        s0Var.f8139s = this.F;
        s0Var.f8140t = this.G;
        s0Var.f8141u = this.H;
        s0Var.v = this.I;
        s0Var.f8142w = this.J;
        s0Var.f8143x = this.K;
        s0Var.f8144y = this.L;
        s0Var.f8145z = this.M;
        s0Var.A = this.N;
        s0Var.B = this.O;
        s0Var.C = this.P;
        s0Var.D = this.Q;
        s0Var.E = this.R;
        s0Var.F = this.S;
        s0Var.G = this.T;
        s0Var.H = this.U;
        s0Var.I = this.V;
        s0Var.J = this.W;
        s0Var.f8130j = this.v;
        s0Var.f8131k = this.f8192w;
        s0Var.f8133m = this.f8193x;
        s0Var.f8132l = this.f8194y;
        return s0Var;
    }

    public final boolean b(t0 t0Var) {
        List list = this.D;
        if (list.size() != t0Var.D.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) t0Var.D.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final t0 c(t0 t0Var) {
        String str;
        String str2;
        int i10;
        int i11;
        if (this == t0Var) {
            return this;
        }
        int iG = d5.q.g(this.B);
        String str3 = t0Var.f8184a;
        z3.c cVarA = t0Var.f8191s;
        String str4 = t0Var.f8185b;
        if (str4 == null) {
            str4 = this.f8185b;
        }
        if ((iG != 3 && iG != 1) || (str = t0Var.f8186c) == null) {
            str = this.f8186c;
        }
        int i12 = this.f8188f;
        if (i12 == -1) {
            i12 = t0Var.f8188f;
        }
        int i13 = this.h;
        if (i13 == -1) {
            i13 = t0Var.h;
        }
        String str5 = this.f8190r;
        if (str5 == null) {
            String strO = d5.g0.o(iG, t0Var.f8190r);
            if (d5.g0.Q(strO).length == 1) {
                str5 = strO;
            }
        }
        z3.c cVar = this.f8191s;
        if (cVar != null) {
            cVarA = cVar.a(cVarA);
        }
        float f10 = this.I;
        if (f10 == -1.0f && iG == 2) {
            f10 = t0Var.I;
        }
        int i14 = this.d | t0Var.d;
        int i15 = this.f8187e | t0Var.f8187e;
        l3.d dVar = t0Var.E;
        ArrayList arrayList = new ArrayList();
        if (dVar != null) {
            str2 = dVar.f15392c;
            l3.c[] cVarArr = dVar.f15390a;
            int length = cVarArr.length;
            int i16 = 0;
            while (i16 < length) {
                l3.c[] cVarArr2 = cVarArr;
                l3.c cVar2 = cVarArr2[i16];
                int i17 = length;
                if (cVar2.f15389e != null) {
                    arrayList.add(cVar2);
                }
                i16++;
                cVarArr = cVarArr2;
                length = i17;
            }
        } else {
            str2 = null;
        }
        l3.d dVar2 = this.E;
        if (dVar2 != null) {
            if (str2 == null) {
                str2 = dVar2.f15392c;
            }
            int size = arrayList.size();
            l3.c[] cVarArr3 = dVar2.f15390a;
            int length2 = cVarArr3.length;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = i18;
                l3.c cVar3 = cVarArr3[i19];
                l3.c[] cVarArr4 = cVarArr3;
                if (cVar3.f15389e != null) {
                    UUID uuid = cVar3.f15387b;
                    i11 = length2;
                    int i20 = 0;
                    while (true) {
                        if (i20 >= size) {
                            i10 = size;
                            arrayList.add(cVar3);
                            break;
                        }
                        i10 = size;
                        if (((l3.c) arrayList.get(i20)).f15387b.equals(uuid)) {
                            break;
                        }
                        i20++;
                        size = i10;
                    }
                } else {
                    i10 = size;
                    i11 = length2;
                }
                i18 = i19 + 1;
                cVarArr3 = cVarArr4;
                length2 = i11;
                size = i10;
            }
        }
        l3.d dVar3 = arrayList.isEmpty() ? null : new l3.d(str2, arrayList);
        s0 s0VarA = a();
        s0VarA.f8123a = str3;
        s0VarA.f8124b = str4;
        s0VarA.f8125c = str;
        s0VarA.d = i14;
        s0VarA.f8126e = i15;
        s0VarA.f8127f = i12;
        s0VarA.f8128g = i13;
        s0VarA.h = str5;
        s0VarA.f8129i = cVarA;
        s0VarA.f8138r = dVar3;
        s0VarA.v = f10;
        return new t0(s0VarA);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && t0.class == obj.getClass()) {
            t0 t0Var = (t0) obj;
            int i11 = this.X;
            if ((i11 == 0 || (i10 = t0Var.X) == 0 || i11 == i10) && this.d == t0Var.d && this.f8187e == t0Var.f8187e && this.f8188f == t0Var.f8188f && this.h == t0Var.h && this.C == t0Var.C && this.F == t0Var.F && this.G == t0Var.G && this.H == t0Var.H && this.J == t0Var.J && this.M == t0Var.M && this.O == t0Var.O && this.P == t0Var.P && this.Q == t0Var.Q && this.R == t0Var.R && this.S == t0Var.S && this.T == t0Var.T && this.U == t0Var.U && this.V == t0Var.V && this.W == t0Var.W && Float.compare(this.I, t0Var.I) == 0 && Float.compare(this.K, t0Var.K) == 0 && d5.g0.a(this.f8184a, t0Var.f8184a) && d5.g0.a(this.f8185b, t0Var.f8185b) && d5.g0.a(this.f8190r, t0Var.f8190r) && d5.g0.a(this.A, t0Var.A) && d5.g0.a(this.B, t0Var.B) && d5.g0.a(this.f8186c, t0Var.f8186c) && Arrays.equals(this.L, t0Var.L) && d5.g0.a(this.f8191s, t0Var.f8191s) && d5.g0.a(this.N, t0Var.N) && d5.g0.a(this.E, t0Var.E) && b(t0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.X == 0) {
            String str = this.f8184a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f8185b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f8186c;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d) * 31) + this.f8187e) * 31) + this.f8188f) * 31) + this.h) * 31;
            String str4 = this.f8190r;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            z3.c cVar = this.f8191s;
            int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            String str5 = this.A;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.B;
            this.X = ((((((((((((((((((((Float.floatToIntBits(this.K) + ((((Float.floatToIntBits(this.I) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.C) * 31) + ((int) this.F)) * 31) + this.G) * 31) + this.H) * 31)) * 31) + this.J) * 31)) * 31) + this.M) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + this.V) * 31) + this.W;
        }
        return this.X;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f8184a);
        sb2.append(", ");
        sb2.append(this.f8185b);
        sb2.append(", ");
        sb2.append(this.A);
        sb2.append(", ");
        sb2.append(this.B);
        sb2.append(", ");
        sb2.append(this.f8190r);
        sb2.append(", ");
        sb2.append(this.f8189n);
        sb2.append(", ");
        sb2.append(this.f8186c);
        sb2.append(", [");
        sb2.append(this.G);
        sb2.append(", ");
        sb2.append(this.H);
        sb2.append(", ");
        sb2.append(this.I);
        sb2.append("], [");
        sb2.append(this.O);
        sb2.append(", ");
        return a9.p.k(this.P, "])", sb2);
    }
}
