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
    public final o3.g F;
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
    public final String f9318a;
    public final String f9319b;
    public final String f9320c;
    public final int d;
    public final int f9321e;
    public final int f9322f;
    public final int h;
    public final int f9323n;
    public final String f9324r;
    public final e4.c f9325s;
    public boolean v;
    public long f9326w;
    public int f9327x;
    public String f9328y;
    public static final n0 Z = new n0(new m0());
    public static final String f9293a0 = Integer.toString(0, 36);
    public static final String f9294b0 = Integer.toString(1, 36);
    public static final String f9295c0 = Integer.toString(2, 36);
    public static final String f9296d0 = Integer.toString(3, 36);
    public static final String f9297e0 = Integer.toString(4, 36);
    public static final String f9298f0 = Integer.toString(5, 36);
    public static final String f9299g0 = Integer.toString(6, 36);
    public static final String f9300h0 = Integer.toString(7, 36);
    public static final String f9301i0 = Integer.toString(8, 36);
    public static final String f9302j0 = Integer.toString(9, 36);
    public static final String f9303k0 = Integer.toString(10, 36);
    public static final String f9304l0 = Integer.toString(11, 36);
    public static final String m0 = Integer.toString(12, 36);
    public static final String f9305n0 = Integer.toString(13, 36);
    public static final String f9306o0 = Integer.toString(14, 36);
    public static final String f9307p0 = Integer.toString(15, 36);
    public static final String f9308q0 = Integer.toString(16, 36);
    public static final String f9309r0 = Integer.toString(17, 36);
    public static final String f9310s0 = Integer.toString(18, 36);
    public static final String f9311t0 = Integer.toString(19, 36);
    public static final String f9312u0 = Integer.toString(20, 36);
    public static final String f9313v0 = Integer.toString(21, 36);
    public static final String f9314w0 = Integer.toString(22, 36);
    public static final String f9315x0 = Integer.toString(23, 36);
    public static final String f9316y0 = Integer.toString(24, 36);
    public static final String f9317z0 = Integer.toString(25, 36);
    public static final String A0 = Integer.toString(26, 36);
    public static final String B0 = Integer.toString(27, 36);
    public static final String C0 = Integer.toString(28, 36);
    public static final String D0 = Integer.toString(29, 36);
    public static final String E0 = Integer.toString(30, 36);
    public static final String F0 = Integer.toString(31, 36);
    public static final f5.u G0 = new f5.u(27);

    public n0(m0 m0Var) {
        this.f9318a = m0Var.f9253a;
        this.f9319b = m0Var.f9254b;
        this.f9320c = h5.d0.H(m0Var.f9255c);
        this.d = m0Var.d;
        this.f9321e = m0Var.f9256e;
        int i10 = m0Var.f9257f;
        this.f9322f = i10;
        int i11 = m0Var.f9258g;
        this.h = i11;
        this.f9323n = i11 != -1 ? i11 : i10;
        this.f9324r = m0Var.h;
        this.f9325s = m0Var.f9259i;
        this.v = m0Var.f9260j;
        this.f9326w = m0Var.f9261k;
        this.f9327x = m0Var.f9263m;
        this.f9328y = m0Var.f9262l;
        this.B = m0Var.f9264n;
        this.C = m0Var.f9265o;
        this.D = m0Var.f9266p;
        List list = m0Var.f9267q;
        this.E = list == null ? Collections.EMPTY_LIST : list;
        o3.g gVar = m0Var.f9268r;
        this.F = gVar;
        this.G = m0Var.f9269s;
        this.H = m0Var.f9270t;
        this.I = m0Var.f9271u;
        this.J = m0Var.v;
        int i12 = m0Var.f9272w;
        this.K = i12 == -1 ? 0 : i12;
        float f10 = m0Var.f9273x;
        this.L = f10 == -1.0f ? 1.0f : f10;
        this.M = m0Var.f9274y;
        this.N = m0Var.f9275z;
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
        if (i15 == 0 && gVar != null) {
            this.X = 1;
        } else {
            this.X = i15;
        }
    }

    public final m0 a() {
        ?? obj = new Object();
        obj.f9253a = this.f9318a;
        obj.f9254b = this.f9319b;
        obj.f9255c = this.f9320c;
        obj.d = this.d;
        obj.f9256e = this.f9321e;
        obj.f9257f = this.f9322f;
        obj.f9258g = this.h;
        obj.h = this.f9324r;
        obj.f9259i = this.f9325s;
        obj.f9264n = this.B;
        obj.f9265o = this.C;
        obj.f9266p = this.D;
        obj.f9267q = this.E;
        obj.f9268r = this.F;
        obj.f9269s = this.G;
        obj.f9270t = this.H;
        obj.f9271u = this.I;
        obj.v = this.J;
        obj.f9272w = this.K;
        obj.f9273x = this.L;
        obj.f9274y = this.M;
        obj.f9275z = this.N;
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
        obj.f9260j = this.v;
        obj.f9261k = this.f9326w;
        obj.f9263m = this.f9327x;
        obj.f9262l = this.f9328y;
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
        o3.g gVar;
        int i10;
        int i11;
        if (this == n0Var) {
            return this;
        }
        int g10 = h5.o.g(this.C);
        String str3 = n0Var.f9318a;
        e4.c cVar = n0Var.f9325s;
        String str4 = n0Var.f9319b;
        if (str4 == null) {
            str4 = this.f9319b;
        }
        if ((g10 != 3 && g10 != 1) || (str = n0Var.f9320c) == null) {
            str = this.f9320c;
        }
        int i12 = this.f9322f;
        if (i12 == -1) {
            i12 = n0Var.f9322f;
        }
        int i13 = this.h;
        if (i13 == -1) {
            i13 = n0Var.h;
        }
        String str5 = this.f9324r;
        if (str5 == null) {
            String p10 = h5.d0.p(g10, n0Var.f9324r);
            if (h5.d0.P(p10).length == 1) {
                str5 = p10;
            }
        }
        e4.c cVar2 = this.f9325s;
        if (cVar2 != null) {
            if (cVar == null) {
                cVar = cVar2;
            } else {
                cVar = cVar2.a(cVar.f4938a);
            }
        }
        float f10 = this.J;
        if (f10 == -1.0f && g10 == 2) {
            f10 = n0Var.J;
        }
        int i14 = this.d | n0Var.d;
        int i15 = this.f9321e | n0Var.f9321e;
        o3.g gVar2 = n0Var.F;
        ArrayList arrayList = new ArrayList();
        if (gVar2 != null) {
            str2 = gVar2.f16403c;
            o3.f[] fVarArr = gVar2.f16401a;
            int length = fVarArr.length;
            int i16 = 0;
            while (i16 < length) {
                o3.f[] fVarArr2 = fVarArr;
                o3.f fVar = fVarArr2[i16];
                int i17 = length;
                if (fVar.f16400e != null) {
                    arrayList.add(fVar);
                }
                i16++;
                fVarArr = fVarArr2;
                length = i17;
            }
        } else {
            str2 = null;
        }
        o3.g gVar3 = this.F;
        if (gVar3 != null) {
            if (str2 == null) {
                str2 = gVar3.f16403c;
            }
            int size = arrayList.size();
            o3.f[] fVarArr3 = gVar3.f16401a;
            int length2 = fVarArr3.length;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = i18;
                o3.f fVar2 = fVarArr3[i19];
                o3.f[] fVarArr4 = fVarArr3;
                if (fVar2.f16400e != null) {
                    UUID uuid = fVar2.f16398b;
                    i11 = length2;
                    int i20 = 0;
                    while (true) {
                        if (i20 < size) {
                            i10 = size;
                            if (((o3.f) arrayList.get(i20)).f16398b.equals(uuid)) {
                                break;
                            }
                            i20++;
                            size = i10;
                        } else {
                            i10 = size;
                            arrayList.add(fVar2);
                            break;
                        }
                    }
                } else {
                    i10 = size;
                    i11 = length2;
                }
                i18 = i19 + 1;
                fVarArr3 = fVarArr4;
                length2 = i11;
                size = i10;
            }
        }
        if (arrayList.isEmpty()) {
            gVar = null;
        } else {
            gVar = new o3.g(str2, arrayList);
        }
        m0 a2 = a();
        a2.f9253a = str3;
        a2.f9254b = str4;
        a2.f9255c = str;
        a2.d = i14;
        a2.f9256e = i15;
        a2.f9257f = i12;
        a2.f9258g = i13;
        a2.h = str5;
        a2.f9259i = cVar;
        a2.f9268r = gVar;
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
            if ((i11 == 0 || (i10 = n0Var.Y) == 0 || i11 == i10) && this.d == n0Var.d && this.f9321e == n0Var.f9321e && this.f9322f == n0Var.f9322f && this.h == n0Var.h && this.D == n0Var.D && this.G == n0Var.G && this.H == n0Var.H && this.I == n0Var.I && this.K == n0Var.K && this.N == n0Var.N && this.P == n0Var.P && this.Q == n0Var.Q && this.R == n0Var.R && this.S == n0Var.S && this.T == n0Var.T && this.U == n0Var.U && this.V == n0Var.V && this.W == n0Var.W && this.X == n0Var.X && Float.compare(this.J, n0Var.J) == 0 && Float.compare(this.L, n0Var.L) == 0 && h5.d0.a(this.f9318a, n0Var.f9318a) && h5.d0.a(this.f9319b, n0Var.f9319b) && h5.d0.a(this.f9324r, n0Var.f9324r) && h5.d0.a(this.B, n0Var.B) && h5.d0.a(this.C, n0Var.C) && h5.d0.a(this.f9320c, n0Var.f9320c) && Arrays.equals(this.M, n0Var.M) && h5.d0.a(this.f9325s, n0Var.f9325s) && h5.d0.a(this.O, n0Var.O) && h5.d0.a(this.F, n0Var.F) && b(n0Var)) {
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
            String str = this.f9318a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = (527 + hashCode) * 31;
            String str2 = this.f9319b;
            if (str2 != null) {
                i10 = str2.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (i12 + i10) * 31;
            String str3 = this.f9320c;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i14 = (((((((((i13 + hashCode2) * 31) + this.d) * 31) + this.f9321e) * 31) + this.f9322f) * 31) + this.h) * 31;
            String str4 = this.f9324r;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i15 = (i14 + hashCode3) * 31;
            e4.c cVar = this.f9325s;
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
        sb.append(this.f9318a);
        sb.append(", ");
        sb.append(this.f9319b);
        sb.append(", ");
        sb.append(this.B);
        sb.append(", ");
        sb.append(this.C);
        sb.append(", ");
        sb.append(this.f9324r);
        sb.append(", ");
        sb.append(this.f9323n);
        sb.append(", ");
        sb.append(this.f9320c);
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
