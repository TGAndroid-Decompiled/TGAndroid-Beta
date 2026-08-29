package j3;

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
    public final n3.c E;
    public final long F;
    public final int G;
    public final int H;
    public final float I;
    public final int J;
    public final float K;
    public final byte[] L;
    public final int M;
    public final g5.b N;
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
    public final String f10797a;
    public final String f10798b;
    public final String f10799c;
    public final int d;
    public final int f10800e;
    public final int f10801f;
    public final int h;
    public final int f10802n;
    public final String f10803r;
    public final b4.c f10804s;
    public boolean v;
    public long f10805w;
    public int f10806x;
    public String f10807y;
    public static final t0 Y = new t0(new s0());
    public static final String Z = Integer.toString(0, 36);
    public static final String f10772a0 = Integer.toString(1, 36);
    public static final String f10773b0 = Integer.toString(2, 36);
    public static final String f10774c0 = Integer.toString(3, 36);
    public static final String f10775d0 = Integer.toString(4, 36);
    public static final String f10776e0 = Integer.toString(5, 36);
    public static final String f10777f0 = Integer.toString(6, 36);
    public static final String f10778g0 = Integer.toString(7, 36);
    public static final String f10779h0 = Integer.toString(8, 36);
    public static final String f10780i0 = Integer.toString(9, 36);
    public static final String f10781j0 = Integer.toString(10, 36);
    public static final String f10782k0 = Integer.toString(11, 36);
    public static final String f10783l0 = Integer.toString(12, 36);
    public static final String m0 = Integer.toString(13, 36);
    public static final String f10784n0 = Integer.toString(14, 36);
    public static final String f10785o0 = Integer.toString(15, 36);
    public static final String f10786p0 = Integer.toString(16, 36);
    public static final String f10787q0 = Integer.toString(17, 36);
    public static final String f10788r0 = Integer.toString(18, 36);
    public static final String f10789s0 = Integer.toString(19, 36);
    public static final String f10790t0 = Integer.toString(20, 36);
    public static final String f10791u0 = Integer.toString(21, 36);
    public static final String f10792v0 = Integer.toString(22, 36);
    public static final String f10793w0 = Integer.toString(23, 36);
    public static final String f10794x0 = Integer.toString(24, 36);
    public static final String f10795y0 = Integer.toString(25, 36);
    public static final String f10796z0 = Integer.toString(26, 36);
    public static final String A0 = Integer.toString(27, 36);
    public static final String B0 = Integer.toString(28, 36);
    public static final String C0 = Integer.toString(29, 36);
    public static final String D0 = Integer.toString(30, 36);
    public static final String E0 = Integer.toString(31, 36);
    public static final d0 F0 = new d0(1);

    public t0(s0 s0Var) {
        this.f10797a = s0Var.f10730a;
        this.f10798b = s0Var.f10731b;
        this.f10799c = f5.d0.I(s0Var.f10732c);
        this.d = s0Var.d;
        this.f10800e = s0Var.f10733e;
        int i10 = s0Var.f10734f;
        this.f10801f = i10;
        int i11 = s0Var.f10735g;
        this.h = i11;
        this.f10802n = i11 != -1 ? i11 : i10;
        this.f10803r = s0Var.h;
        this.f10804s = s0Var.f10736i;
        this.v = s0Var.f10737j;
        this.f10805w = s0Var.f10738k;
        this.f10806x = s0Var.f10740m;
        this.f10807y = s0Var.f10739l;
        this.A = s0Var.f10741n;
        this.B = s0Var.f10742o;
        this.C = s0Var.f10743p;
        List list = s0Var.f10744q;
        this.D = list == null ? Collections.EMPTY_LIST : list;
        n3.c cVar = s0Var.f10745r;
        this.E = cVar;
        this.F = s0Var.f10746s;
        this.G = s0Var.f10747t;
        this.H = s0Var.f10748u;
        this.I = s0Var.v;
        int i12 = s0Var.f10749w;
        this.J = i12 == -1 ? 0 : i12;
        float f9 = s0Var.f10750x;
        this.K = f9 == -1.0f ? 1.0f : f9;
        this.L = s0Var.f10751y;
        this.M = s0Var.f10752z;
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
        if (i15 == 0 && cVar != null) {
            this.W = 1;
        } else {
            this.W = i15;
        }
    }

    public final s0 a() {
        ?? obj = new Object();
        obj.f10730a = this.f10797a;
        obj.f10731b = this.f10798b;
        obj.f10732c = this.f10799c;
        obj.d = this.d;
        obj.f10733e = this.f10800e;
        obj.f10734f = this.f10801f;
        obj.f10735g = this.h;
        obj.h = this.f10803r;
        obj.f10736i = this.f10804s;
        obj.f10741n = this.A;
        obj.f10742o = this.B;
        obj.f10743p = this.C;
        obj.f10744q = this.D;
        obj.f10745r = this.E;
        obj.f10746s = this.F;
        obj.f10747t = this.G;
        obj.f10748u = this.H;
        obj.v = this.I;
        obj.f10749w = this.J;
        obj.f10750x = this.K;
        obj.f10751y = this.L;
        obj.f10752z = this.M;
        obj.A = this.N;
        obj.B = this.O;
        obj.C = this.P;
        obj.D = this.Q;
        obj.E = this.R;
        obj.F = this.S;
        obj.G = this.T;
        obj.H = this.U;
        obj.I = this.V;
        obj.J = this.W;
        obj.f10737j = this.v;
        obj.f10738k = this.f10805w;
        obj.f10740m = this.f10806x;
        obj.f10739l = this.f10807y;
        return obj;
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
        n3.c cVar;
        int i10;
        int i11;
        if (this == t0Var) {
            return this;
        }
        int g10 = f5.o.g(this.B);
        String str3 = t0Var.f10797a;
        b4.c cVar2 = t0Var.f10804s;
        String str4 = t0Var.f10798b;
        if (str4 == null) {
            str4 = this.f10798b;
        }
        if ((g10 != 3 && g10 != 1) || (str = t0Var.f10799c) == null) {
            str = this.f10799c;
        }
        int i12 = this.f10801f;
        if (i12 == -1) {
            i12 = t0Var.f10801f;
        }
        int i13 = this.h;
        if (i13 == -1) {
            i13 = t0Var.h;
        }
        String str5 = this.f10803r;
        if (str5 == null) {
            String o10 = f5.d0.o(g10, t0Var.f10803r);
            if (f5.d0.Q(o10).length == 1) {
                str5 = o10;
            }
        }
        b4.c cVar3 = this.f10804s;
        if (cVar3 != null) {
            cVar2 = cVar3.a(cVar2);
        }
        float f9 = this.I;
        if (f9 == -1.0f && g10 == 2) {
            f9 = t0Var.I;
        }
        int i14 = this.d | t0Var.d;
        int i15 = this.f10800e | t0Var.f10800e;
        n3.c cVar4 = t0Var.E;
        ArrayList arrayList = new ArrayList();
        if (cVar4 != null) {
            str2 = cVar4.f17102c;
            n3.b[] bVarArr = cVar4.f17100a;
            int length = bVarArr.length;
            int i16 = 0;
            while (i16 < length) {
                n3.b[] bVarArr2 = bVarArr;
                n3.b bVar = bVarArr2[i16];
                int i17 = length;
                if (bVar.f17099e != null) {
                    arrayList.add(bVar);
                }
                i16++;
                bVarArr = bVarArr2;
                length = i17;
            }
        } else {
            str2 = null;
        }
        n3.c cVar5 = this.E;
        if (cVar5 != null) {
            if (str2 == null) {
                str2 = cVar5.f17102c;
            }
            int size = arrayList.size();
            n3.b[] bVarArr3 = cVar5.f17100a;
            int length2 = bVarArr3.length;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = i18;
                n3.b bVar2 = bVarArr3[i19];
                n3.b[] bVarArr4 = bVarArr3;
                if (bVar2.f17099e != null) {
                    UUID uuid = bVar2.f17097b;
                    i11 = length2;
                    int i20 = 0;
                    while (true) {
                        if (i20 < size) {
                            i10 = size;
                            if (((n3.b) arrayList.get(i20)).f17097b.equals(uuid)) {
                                break;
                            }
                            i20++;
                            size = i10;
                        } else {
                            i10 = size;
                            arrayList.add(bVar2);
                            break;
                        }
                    }
                } else {
                    i10 = size;
                    i11 = length2;
                }
                i18 = i19 + 1;
                bVarArr3 = bVarArr4;
                length2 = i11;
                size = i10;
            }
        }
        if (arrayList.isEmpty()) {
            cVar = null;
        } else {
            cVar = new n3.c(str2, arrayList);
        }
        s0 a2 = a();
        a2.f10730a = str3;
        a2.f10731b = str4;
        a2.f10732c = str;
        a2.d = i14;
        a2.f10733e = i15;
        a2.f10734f = i12;
        a2.f10735g = i13;
        a2.h = str5;
        a2.f10736i = cVar2;
        a2.f10745r = cVar;
        a2.v = f9;
        return new t0(a2);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && t0.class == obj.getClass()) {
            t0 t0Var = (t0) obj;
            int i11 = this.X;
            if ((i11 == 0 || (i10 = t0Var.X) == 0 || i11 == i10) && this.d == t0Var.d && this.f10800e == t0Var.f10800e && this.f10801f == t0Var.f10801f && this.h == t0Var.h && this.C == t0Var.C && this.F == t0Var.F && this.G == t0Var.G && this.H == t0Var.H && this.J == t0Var.J && this.M == t0Var.M && this.O == t0Var.O && this.P == t0Var.P && this.Q == t0Var.Q && this.R == t0Var.R && this.S == t0Var.S && this.T == t0Var.T && this.U == t0Var.U && this.V == t0Var.V && this.W == t0Var.W && Float.compare(this.I, t0Var.I) == 0 && Float.compare(this.K, t0Var.K) == 0 && f5.d0.a(this.f10797a, t0Var.f10797a) && f5.d0.a(this.f10798b, t0Var.f10798b) && f5.d0.a(this.f10803r, t0Var.f10803r) && f5.d0.a(this.A, t0Var.A) && f5.d0.a(this.B, t0Var.B) && f5.d0.a(this.f10799c, t0Var.f10799c) && Arrays.equals(this.L, t0Var.L) && f5.d0.a(this.f10804s, t0Var.f10804s) && f5.d0.a(this.N, t0Var.N) && f5.d0.a(this.E, t0Var.E) && b(t0Var)) {
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
        if (this.X == 0) {
            int i11 = 0;
            String str = this.f10797a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = (527 + hashCode) * 31;
            String str2 = this.f10798b;
            if (str2 != null) {
                i10 = str2.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (i12 + i10) * 31;
            String str3 = this.f10799c;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i14 = (((((((((i13 + hashCode2) * 31) + this.d) * 31) + this.f10800e) * 31) + this.f10801f) * 31) + this.h) * 31;
            String str4 = this.f10803r;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i15 = (i14 + hashCode3) * 31;
            b4.c cVar = this.f10804s;
            if (cVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = cVar.hashCode();
            }
            int i16 = (i15 + hashCode4) * 31;
            String str5 = this.A;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i17 = (i16 + hashCode5) * 31;
            String str6 = this.B;
            if (str6 != null) {
                i11 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.I);
            this.X = ((((((((((((((((((((Float.floatToIntBits(this.K) + ((((floatToIntBits + ((((((((((i17 + i11) * 31) + this.C) * 31) + ((int) this.F)) * 31) + this.G) * 31) + this.H) * 31)) * 31) + this.J) * 31)) * 31) + this.M) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + this.V) * 31) + this.W;
        }
        return this.X;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f10797a);
        sb2.append(", ");
        sb2.append(this.f10798b);
        sb2.append(", ");
        sb2.append(this.A);
        sb2.append(", ");
        sb2.append(this.B);
        sb2.append(", ");
        sb2.append(this.f10803r);
        sb2.append(", ");
        sb2.append(this.f10802n);
        sb2.append(", ");
        sb2.append(this.f10799c);
        sb2.append(", [");
        sb2.append(this.G);
        sb2.append(", ");
        sb2.append(this.H);
        sb2.append(", ");
        sb2.append(this.I);
        sb2.append("], [");
        sb2.append(this.O);
        sb2.append(", ");
        return a4.w.l(this.P, "])", sb2);
    }
}
