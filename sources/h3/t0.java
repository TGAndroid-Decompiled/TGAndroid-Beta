package h3;

import fh.y5;
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
    public final l3.c E;
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
    public final String f9760a;
    public final String f9761b;
    public final String f9762c;
    public final int d;
    public final int f9763e;
    public final int f9764f;
    public final int h;
    public final int f9765n;
    public final String f9766r;
    public final z3.c f9767s;
    public boolean v;
    public long f9768w;
    public int f9769x;
    public String f9770y;
    public static final t0 Y = new t0(new s0());
    public static final String Z = Integer.toString(0, 36);
    public static final String f9735a0 = Integer.toString(1, 36);
    public static final String f9736b0 = Integer.toString(2, 36);
    public static final String f9737c0 = Integer.toString(3, 36);
    public static final String f9738d0 = Integer.toString(4, 36);
    public static final String f9739e0 = Integer.toString(5, 36);
    public static final String f9740f0 = Integer.toString(6, 36);
    public static final String f9741g0 = Integer.toString(7, 36);
    public static final String f9742h0 = Integer.toString(8, 36);
    public static final String f9743i0 = Integer.toString(9, 36);
    public static final String f9744j0 = Integer.toString(10, 36);
    public static final String f9745k0 = Integer.toString(11, 36);
    public static final String f9746l0 = Integer.toString(12, 36);
    public static final String m0 = Integer.toString(13, 36);
    public static final String f9747n0 = Integer.toString(14, 36);
    public static final String f9748o0 = Integer.toString(15, 36);
    public static final String f9749p0 = Integer.toString(16, 36);
    public static final String f9750q0 = Integer.toString(17, 36);
    public static final String f9751r0 = Integer.toString(18, 36);
    public static final String f9752s0 = Integer.toString(19, 36);
    public static final String f9753t0 = Integer.toString(20, 36);
    public static final String f9754u0 = Integer.toString(21, 36);
    public static final String f9755v0 = Integer.toString(22, 36);
    public static final String f9756w0 = Integer.toString(23, 36);
    public static final String f9757x0 = Integer.toString(24, 36);
    public static final String f9758y0 = Integer.toString(25, 36);
    public static final String f9759z0 = Integer.toString(26, 36);
    public static final String A0 = Integer.toString(27, 36);
    public static final String B0 = Integer.toString(28, 36);
    public static final String C0 = Integer.toString(29, 36);
    public static final String D0 = Integer.toString(30, 36);
    public static final String E0 = Integer.toString(31, 36);
    public static final y5 F0 = new y5(14);

    public t0(s0 s0Var) {
        this.f9760a = s0Var.f9693a;
        this.f9761b = s0Var.f9694b;
        this.f9762c = d5.f0.I(s0Var.f9695c);
        this.d = s0Var.d;
        this.f9763e = s0Var.f9696e;
        int i9 = s0Var.f9697f;
        this.f9764f = i9;
        int i10 = s0Var.f9698g;
        this.h = i10;
        this.f9765n = i10 != -1 ? i10 : i9;
        this.f9766r = s0Var.h;
        this.f9767s = s0Var.f9699i;
        this.v = s0Var.f9700j;
        this.f9768w = s0Var.f9701k;
        this.f9769x = s0Var.f9703m;
        this.f9770y = s0Var.f9702l;
        this.A = s0Var.f9704n;
        this.B = s0Var.f9705o;
        this.C = s0Var.f9706p;
        List list = s0Var.f9707q;
        this.D = list == null ? Collections.EMPTY_LIST : list;
        l3.c cVar = s0Var.f9708r;
        this.E = cVar;
        this.F = s0Var.f9709s;
        this.G = s0Var.f9710t;
        this.H = s0Var.f9711u;
        this.I = s0Var.v;
        int i11 = s0Var.f9712w;
        this.J = i11 == -1 ? 0 : i11;
        float f10 = s0Var.f9713x;
        this.K = f10 == -1.0f ? 1.0f : f10;
        this.L = s0Var.f9714y;
        this.M = s0Var.f9715z;
        this.N = s0Var.A;
        this.O = s0Var.B;
        this.P = s0Var.C;
        this.Q = s0Var.D;
        int i12 = s0Var.E;
        this.R = i12 == -1 ? 0 : i12;
        int i13 = s0Var.F;
        this.S = i13 != -1 ? i13 : 0;
        this.T = s0Var.G;
        this.U = s0Var.H;
        this.V = s0Var.I;
        int i14 = s0Var.J;
        if (i14 == 0 && cVar != null) {
            this.W = 1;
        } else {
            this.W = i14;
        }
    }

    public final s0 a() {
        ?? obj = new Object();
        obj.f9693a = this.f9760a;
        obj.f9694b = this.f9761b;
        obj.f9695c = this.f9762c;
        obj.d = this.d;
        obj.f9696e = this.f9763e;
        obj.f9697f = this.f9764f;
        obj.f9698g = this.h;
        obj.h = this.f9766r;
        obj.f9699i = this.f9767s;
        obj.f9704n = this.A;
        obj.f9705o = this.B;
        obj.f9706p = this.C;
        obj.f9707q = this.D;
        obj.f9708r = this.E;
        obj.f9709s = this.F;
        obj.f9710t = this.G;
        obj.f9711u = this.H;
        obj.v = this.I;
        obj.f9712w = this.J;
        obj.f9713x = this.K;
        obj.f9714y = this.L;
        obj.f9715z = this.M;
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
        obj.f9700j = this.v;
        obj.f9701k = this.f9768w;
        obj.f9703m = this.f9769x;
        obj.f9702l = this.f9770y;
        return obj;
    }

    public final boolean b(t0 t0Var) {
        List list = this.D;
        if (list.size() != t0Var.D.size()) {
            return false;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (!Arrays.equals((byte[]) list.get(i9), (byte[]) t0Var.D.get(i9))) {
                return false;
            }
        }
        return true;
    }

    public final t0 c(t0 t0Var) {
        String str;
        String str2;
        l3.c cVar;
        int i9;
        int i10;
        if (this == t0Var) {
            return this;
        }
        int g10 = d5.q.g(this.B);
        String str3 = t0Var.f9760a;
        z3.c cVar2 = t0Var.f9767s;
        String str4 = t0Var.f9761b;
        if (str4 == null) {
            str4 = this.f9761b;
        }
        if ((g10 != 3 && g10 != 1) || (str = t0Var.f9762c) == null) {
            str = this.f9762c;
        }
        int i11 = this.f9764f;
        if (i11 == -1) {
            i11 = t0Var.f9764f;
        }
        int i12 = this.h;
        if (i12 == -1) {
            i12 = t0Var.h;
        }
        String str5 = this.f9766r;
        if (str5 == null) {
            String o6 = d5.f0.o(g10, t0Var.f9766r);
            if (d5.f0.Q(o6).length == 1) {
                str5 = o6;
            }
        }
        z3.c cVar3 = this.f9767s;
        if (cVar3 != null) {
            cVar2 = cVar3.a(cVar2);
        }
        float f10 = this.I;
        if (f10 == -1.0f && g10 == 2) {
            f10 = t0Var.I;
        }
        int i13 = this.d | t0Var.d;
        int i14 = this.f9763e | t0Var.f9763e;
        l3.c cVar4 = t0Var.E;
        ArrayList arrayList = new ArrayList();
        if (cVar4 != null) {
            str2 = cVar4.f16635c;
            l3.b[] bVarArr = cVar4.f16633a;
            int length = bVarArr.length;
            int i15 = 0;
            while (i15 < length) {
                l3.b[] bVarArr2 = bVarArr;
                l3.b bVar = bVarArr2[i15];
                int i16 = length;
                if (bVar.f16632e != null) {
                    arrayList.add(bVar);
                }
                i15++;
                bVarArr = bVarArr2;
                length = i16;
            }
        } else {
            str2 = null;
        }
        l3.c cVar5 = this.E;
        if (cVar5 != null) {
            if (str2 == null) {
                str2 = cVar5.f16635c;
            }
            int size = arrayList.size();
            l3.b[] bVarArr3 = cVar5.f16633a;
            int length2 = bVarArr3.length;
            int i17 = 0;
            while (i17 < length2) {
                int i18 = i17;
                l3.b bVar2 = bVarArr3[i18];
                l3.b[] bVarArr4 = bVarArr3;
                if (bVar2.f16632e != null) {
                    UUID uuid = bVar2.f16630b;
                    i10 = length2;
                    int i19 = 0;
                    while (true) {
                        if (i19 < size) {
                            i9 = size;
                            if (((l3.b) arrayList.get(i19)).f16630b.equals(uuid)) {
                                break;
                            }
                            i19++;
                            size = i9;
                        } else {
                            i9 = size;
                            arrayList.add(bVar2);
                            break;
                        }
                    }
                } else {
                    i9 = size;
                    i10 = length2;
                }
                i17 = i18 + 1;
                bVarArr3 = bVarArr4;
                length2 = i10;
                size = i9;
            }
        }
        if (arrayList.isEmpty()) {
            cVar = null;
        } else {
            cVar = new l3.c(str2, arrayList);
        }
        s0 a2 = a();
        a2.f9693a = str3;
        a2.f9694b = str4;
        a2.f9695c = str;
        a2.d = i13;
        a2.f9696e = i14;
        a2.f9697f = i11;
        a2.f9698g = i12;
        a2.h = str5;
        a2.f9699i = cVar2;
        a2.f9708r = cVar;
        a2.v = f10;
        return new t0(a2);
    }

    public final boolean equals(Object obj) {
        int i9;
        if (this == obj) {
            return true;
        }
        if (obj != null && t0.class == obj.getClass()) {
            t0 t0Var = (t0) obj;
            int i10 = this.X;
            if ((i10 == 0 || (i9 = t0Var.X) == 0 || i10 == i9) && this.d == t0Var.d && this.f9763e == t0Var.f9763e && this.f9764f == t0Var.f9764f && this.h == t0Var.h && this.C == t0Var.C && this.F == t0Var.F && this.G == t0Var.G && this.H == t0Var.H && this.J == t0Var.J && this.M == t0Var.M && this.O == t0Var.O && this.P == t0Var.P && this.Q == t0Var.Q && this.R == t0Var.R && this.S == t0Var.S && this.T == t0Var.T && this.U == t0Var.U && this.V == t0Var.V && this.W == t0Var.W && Float.compare(this.I, t0Var.I) == 0 && Float.compare(this.K, t0Var.K) == 0 && d5.f0.a(this.f9760a, t0Var.f9760a) && d5.f0.a(this.f9761b, t0Var.f9761b) && d5.f0.a(this.f9766r, t0Var.f9766r) && d5.f0.a(this.A, t0Var.A) && d5.f0.a(this.B, t0Var.B) && d5.f0.a(this.f9762c, t0Var.f9762c) && Arrays.equals(this.L, t0Var.L) && d5.f0.a(this.f9767s, t0Var.f9767s) && d5.f0.a(this.N, t0Var.N) && d5.f0.a(this.E, t0Var.E) && b(t0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        if (this.X == 0) {
            int i10 = 0;
            String str = this.f9760a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f9761b;
            if (str2 != null) {
                i9 = str2.hashCode();
            } else {
                i9 = 0;
            }
            int i12 = (i11 + i9) * 31;
            String str3 = this.f9762c;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i13 = (((((((((i12 + hashCode2) * 31) + this.d) * 31) + this.f9763e) * 31) + this.f9764f) * 31) + this.h) * 31;
            String str4 = this.f9766r;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            z3.c cVar = this.f9767s;
            if (cVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = cVar.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            String str5 = this.A;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i16 = (i15 + hashCode5) * 31;
            String str6 = this.B;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.I);
            this.X = ((((((((((((((((((((Float.floatToIntBits(this.K) + ((((floatToIntBits + ((((((((((i16 + i10) * 31) + this.C) * 31) + ((int) this.F)) * 31) + this.G) * 31) + this.H) * 31)) * 31) + this.J) * 31)) * 31) + this.M) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + this.V) * 31) + this.W;
        }
        return this.X;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f9760a);
        sb2.append(", ");
        sb2.append(this.f9761b);
        sb2.append(", ");
        sb2.append(this.A);
        sb2.append(", ");
        sb2.append(this.B);
        sb2.append(", ");
        sb2.append(this.f9766r);
        sb2.append(", ");
        sb2.append(this.f9765n);
        sb2.append(", ");
        sb2.append(this.f9762c);
        sb2.append(", [");
        sb2.append(this.G);
        sb2.append(", ");
        sb2.append(this.H);
        sb2.append(", ");
        sb2.append(this.I);
        sb2.append("], [");
        sb2.append(this.O);
        sb2.append(", ");
        return aa.d.l(this.P, "])", sb2);
    }
}
