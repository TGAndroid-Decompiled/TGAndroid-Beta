package j3;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
public final class e1 implements g {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final q0 D0;
    public static final e1 V = new e1(new Object());
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String f9064a0;
    public static final String f9065b0;
    public static final String f9066c0;
    public static final String f9067d0;
    public static final String f9068e0;
    public static final String f9069f0;
    public static final String f9070g0;
    public static final String f9071h0;
    public static final String f9072i0;
    public static final String f9073j0;
    public static final String f9074k0;
    public static final String f9075l0;
    public static final String m0;
    public static final String f9076n0;
    public static final String f9077o0;
    public static final String f9078p0;
    public static final String f9079q0;
    public static final String f9080r0;
    public static final String f9081s0;
    public static final String f9082t0;
    public static final String f9083u0;
    public static final String f9084v0;
    public static final String f9085w0;
    public static final String f9086x0;
    public static final String f9087y0;
    public static final String f9088z0;
    public final Integer B;
    public final Boolean C;
    public final Boolean D;
    public final Integer E;
    public final Integer F;
    public final Integer G;
    public final Integer H;
    public final Integer I;
    public final Integer J;
    public final Integer K;
    public final CharSequence L;
    public final CharSequence M;
    public final CharSequence N;
    public final Integer O;
    public final Integer P;
    public final CharSequence Q;
    public final CharSequence R;
    public final CharSequence S;
    public final Integer T;
    public final Bundle U;
    public final CharSequence f9089a;
    public final CharSequence f9090b;
    public final CharSequence f9091c;
    public final CharSequence d;
    public final CharSequence f9092e;
    public final CharSequence f9093f;
    public final CharSequence h;
    public final f2 f9094n;
    public final f2 f9095r;
    public final byte[] f9096s;
    public final Integer v;
    public final Uri f9097w;
    public final Integer f9098x;
    public final Integer f9099y;

    static {
        int i10 = h5.d0.f7237a;
        W = Integer.toString(0, 36);
        X = Integer.toString(1, 36);
        Y = Integer.toString(2, 36);
        Z = Integer.toString(3, 36);
        f9064a0 = Integer.toString(4, 36);
        f9065b0 = Integer.toString(5, 36);
        f9066c0 = Integer.toString(6, 36);
        f9067d0 = Integer.toString(8, 36);
        f9068e0 = Integer.toString(9, 36);
        f9069f0 = Integer.toString(10, 36);
        f9070g0 = Integer.toString(11, 36);
        f9071h0 = Integer.toString(12, 36);
        f9072i0 = Integer.toString(13, 36);
        f9073j0 = Integer.toString(14, 36);
        f9074k0 = Integer.toString(15, 36);
        f9075l0 = Integer.toString(16, 36);
        m0 = Integer.toString(17, 36);
        f9076n0 = Integer.toString(18, 36);
        f9077o0 = Integer.toString(19, 36);
        f9078p0 = Integer.toString(20, 36);
        f9079q0 = Integer.toString(21, 36);
        f9080r0 = Integer.toString(22, 36);
        f9081s0 = Integer.toString(23, 36);
        f9082t0 = Integer.toString(24, 36);
        f9083u0 = Integer.toString(25, 36);
        f9084v0 = Integer.toString(26, 36);
        f9085w0 = Integer.toString(27, 36);
        f9086x0 = Integer.toString(28, 36);
        f9087y0 = Integer.toString(29, 36);
        f9088z0 = Integer.toString(30, 36);
        A0 = Integer.toString(31, 36);
        B0 = Integer.toString(32, 36);
        C0 = Integer.toString(1000, 36);
        D0 = new q0(8);
    }

    public e1(d1 d1Var) {
        Boolean bool = d1Var.f9040p;
        Integer num = d1Var.f9039o;
        Integer num2 = d1Var.F;
        int i10 = 1;
        int i11 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i10 = 0;
                            break;
                        case 21:
                            i10 = 2;
                            break;
                        case 22:
                            i10 = 3;
                            break;
                        case 23:
                            i10 = 4;
                            break;
                        case 24:
                            i10 = 5;
                            break;
                        case 25:
                            i10 = 6;
                            break;
                    }
                    i11 = i10;
                }
                num = Integer.valueOf(i11);
            }
        } else if (num != null) {
            boolean z4 = num.intValue() != -1;
            bool = Boolean.valueOf(z4);
            if (z4 && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i11 = 21;
                        break;
                    case 3:
                        i11 = 22;
                        break;
                    case 4:
                        i11 = 23;
                        break;
                    case 5:
                        i11 = 24;
                        break;
                    case 6:
                        i11 = 25;
                        break;
                    default:
                        i11 = 20;
                        break;
                }
                num2 = Integer.valueOf(i11);
            }
        }
        this.f9089a = d1Var.f9027a;
        this.f9090b = d1Var.f9028b;
        this.f9091c = d1Var.f9029c;
        this.d = d1Var.d;
        this.f9092e = d1Var.f9030e;
        this.f9093f = d1Var.f9031f;
        this.h = d1Var.f9032g;
        this.f9094n = d1Var.h;
        this.f9095r = d1Var.f9033i;
        this.f9096s = d1Var.f9034j;
        this.v = d1Var.f9035k;
        this.f9097w = d1Var.f9036l;
        this.f9098x = d1Var.f9037m;
        this.f9099y = d1Var.f9038n;
        this.B = num;
        this.C = bool;
        this.D = d1Var.f9041q;
        Integer num3 = d1Var.f9042r;
        this.E = num3;
        this.F = num3;
        this.G = d1Var.f9043s;
        this.H = d1Var.f9044t;
        this.I = d1Var.f9045u;
        this.J = d1Var.v;
        this.K = d1Var.f9046w;
        this.L = d1Var.f9047x;
        this.M = d1Var.f9048y;
        this.N = d1Var.f9049z;
        this.O = d1Var.A;
        this.P = d1Var.B;
        this.Q = d1Var.C;
        this.R = d1Var.D;
        this.S = d1Var.E;
        this.T = num2;
        this.U = d1Var.G;
    }

    public final d1 a() {
        ?? obj = new Object();
        obj.f9027a = this.f9089a;
        obj.f9028b = this.f9090b;
        obj.f9029c = this.f9091c;
        obj.d = this.d;
        obj.f9030e = this.f9092e;
        obj.f9031f = this.f9093f;
        obj.f9032g = this.h;
        obj.h = this.f9094n;
        obj.f9033i = this.f9095r;
        obj.f9034j = this.f9096s;
        obj.f9035k = this.v;
        obj.f9036l = this.f9097w;
        obj.f9037m = this.f9098x;
        obj.f9038n = this.f9099y;
        obj.f9039o = this.B;
        obj.f9040p = this.C;
        obj.f9041q = this.D;
        obj.f9042r = this.F;
        obj.f9043s = this.G;
        obj.f9044t = this.H;
        obj.f9045u = this.I;
        obj.v = this.J;
        obj.f9046w = this.K;
        obj.f9047x = this.L;
        obj.f9048y = this.M;
        obj.f9049z = this.N;
        obj.A = this.O;
        obj.B = this.P;
        obj.C = this.Q;
        obj.D = this.R;
        obj.E = this.S;
        obj.F = this.T;
        obj.G = this.U;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (h5.d0.a(this.f9089a, e1Var.f9089a) && h5.d0.a(this.f9090b, e1Var.f9090b) && h5.d0.a(this.f9091c, e1Var.f9091c) && h5.d0.a(this.d, e1Var.d) && h5.d0.a(this.f9092e, e1Var.f9092e) && h5.d0.a(this.f9093f, e1Var.f9093f) && h5.d0.a(this.h, e1Var.h) && h5.d0.a(this.f9094n, e1Var.f9094n) && h5.d0.a(this.f9095r, e1Var.f9095r) && Arrays.equals(this.f9096s, e1Var.f9096s) && h5.d0.a(this.v, e1Var.v) && h5.d0.a(this.f9097w, e1Var.f9097w) && h5.d0.a(this.f9098x, e1Var.f9098x) && h5.d0.a(this.f9099y, e1Var.f9099y) && h5.d0.a(this.B, e1Var.B) && h5.d0.a(this.C, e1Var.C) && h5.d0.a(this.D, e1Var.D) && h5.d0.a(this.F, e1Var.F) && h5.d0.a(this.G, e1Var.G) && h5.d0.a(this.H, e1Var.H) && h5.d0.a(this.I, e1Var.I) && h5.d0.a(this.J, e1Var.J) && h5.d0.a(this.K, e1Var.K) && h5.d0.a(this.L, e1Var.L) && h5.d0.a(this.M, e1Var.M) && h5.d0.a(this.N, e1Var.N) && h5.d0.a(this.O, e1Var.O) && h5.d0.a(this.P, e1Var.P) && h5.d0.a(this.Q, e1Var.Q) && h5.d0.a(this.R, e1Var.R) && h5.d0.a(this.S, e1Var.S) && h5.d0.a(this.T, e1Var.T)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9089a, this.f9090b, this.f9091c, this.d, this.f9092e, this.f9093f, this.h, this.f9094n, this.f9095r, Integer.valueOf(Arrays.hashCode(this.f9096s)), this.v, this.f9097w, this.f9098x, this.f9099y, this.B, this.C, this.D, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T});
    }
}
