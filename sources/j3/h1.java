package j3;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
public final class h1 implements g {
    public static final String A0;
    public static final String B0;
    public static final d0 C0;
    public static final h1 U = new h1(new Object());
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String f10478a0;
    public static final String f10479b0;
    public static final String f10480c0;
    public static final String f10481d0;
    public static final String f10482e0;
    public static final String f10483f0;
    public static final String f10484g0;
    public static final String f10485h0;
    public static final String f10486i0;
    public static final String f10487j0;
    public static final String f10488k0;
    public static final String f10489l0;
    public static final String m0;
    public static final String f10490n0;
    public static final String f10491o0;
    public static final String f10492p0;
    public static final String f10493q0;
    public static final String f10494r0;
    public static final String f10495s0;
    public static final String f10496t0;
    public static final String f10497u0;
    public static final String f10498v0;
    public static final String f10499w0;
    public static final String f10500x0;
    public static final String f10501y0;
    public static final String f10502z0;
    public final Integer A;
    public final Boolean B;
    public final Boolean C;
    public final Integer D;
    public final Integer E;
    public final Integer F;
    public final Integer G;
    public final Integer H;
    public final Integer I;
    public final Integer J;
    public final CharSequence K;
    public final CharSequence L;
    public final CharSequence M;
    public final Integer N;
    public final Integer O;
    public final CharSequence P;
    public final CharSequence Q;
    public final CharSequence R;
    public final Integer S;
    public final Bundle T;
    public final CharSequence f10503a;
    public final CharSequence f10504b;
    public final CharSequence f10505c;
    public final CharSequence d;
    public final CharSequence f10506e;
    public final CharSequence f10507f;
    public final CharSequence h;
    public final g2 f10508n;
    public final g2 f10509r;
    public final byte[] f10510s;
    public final Integer v;
    public final Uri f10511w;
    public final Integer f10512x;
    public final Integer f10513y;

    static {
        int i10 = f5.d0.f6579a;
        V = Integer.toString(0, 36);
        W = Integer.toString(1, 36);
        X = Integer.toString(2, 36);
        Y = Integer.toString(3, 36);
        Z = Integer.toString(4, 36);
        f10478a0 = Integer.toString(5, 36);
        f10479b0 = Integer.toString(6, 36);
        f10480c0 = Integer.toString(8, 36);
        f10481d0 = Integer.toString(9, 36);
        f10482e0 = Integer.toString(10, 36);
        f10483f0 = Integer.toString(11, 36);
        f10484g0 = Integer.toString(12, 36);
        f10485h0 = Integer.toString(13, 36);
        f10486i0 = Integer.toString(14, 36);
        f10487j0 = Integer.toString(15, 36);
        f10488k0 = Integer.toString(16, 36);
        f10489l0 = Integer.toString(17, 36);
        m0 = Integer.toString(18, 36);
        f10490n0 = Integer.toString(19, 36);
        f10491o0 = Integer.toString(20, 36);
        f10492p0 = Integer.toString(21, 36);
        f10493q0 = Integer.toString(22, 36);
        f10494r0 = Integer.toString(23, 36);
        f10495s0 = Integer.toString(24, 36);
        f10496t0 = Integer.toString(25, 36);
        f10497u0 = Integer.toString(26, 36);
        f10498v0 = Integer.toString(27, 36);
        f10499w0 = Integer.toString(28, 36);
        f10500x0 = Integer.toString(29, 36);
        f10501y0 = Integer.toString(30, 36);
        f10502z0 = Integer.toString(31, 36);
        A0 = Integer.toString(32, 36);
        B0 = Integer.toString(1000, 36);
        C0 = new d0(7);
    }

    public h1(g1 g1Var) {
        Boolean bool = g1Var.f10461p;
        Integer num = g1Var.f10460o;
        Integer num2 = g1Var.F;
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
            boolean z10 = num.intValue() != -1;
            bool = Boolean.valueOf(z10);
            if (z10 && num2 == null) {
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
        this.f10503a = g1Var.f10448a;
        this.f10504b = g1Var.f10449b;
        this.f10505c = g1Var.f10450c;
        this.d = g1Var.d;
        this.f10506e = g1Var.f10451e;
        this.f10507f = g1Var.f10452f;
        this.h = g1Var.f10453g;
        this.f10508n = g1Var.h;
        this.f10509r = g1Var.f10454i;
        this.f10510s = g1Var.f10455j;
        this.v = g1Var.f10456k;
        this.f10511w = g1Var.f10457l;
        this.f10512x = g1Var.f10458m;
        this.f10513y = g1Var.f10459n;
        this.A = num;
        this.B = bool;
        this.C = g1Var.f10462q;
        Integer num3 = g1Var.f10463r;
        this.D = num3;
        this.E = num3;
        this.F = g1Var.f10464s;
        this.G = g1Var.f10465t;
        this.H = g1Var.f10466u;
        this.I = g1Var.v;
        this.J = g1Var.f10467w;
        this.K = g1Var.f10468x;
        this.L = g1Var.f10469y;
        this.M = g1Var.f10470z;
        this.N = g1Var.A;
        this.O = g1Var.B;
        this.P = g1Var.C;
        this.Q = g1Var.D;
        this.R = g1Var.E;
        this.S = num2;
        this.T = g1Var.G;
    }

    public final g1 a() {
        ?? obj = new Object();
        obj.f10448a = this.f10503a;
        obj.f10449b = this.f10504b;
        obj.f10450c = this.f10505c;
        obj.d = this.d;
        obj.f10451e = this.f10506e;
        obj.f10452f = this.f10507f;
        obj.f10453g = this.h;
        obj.h = this.f10508n;
        obj.f10454i = this.f10509r;
        obj.f10455j = this.f10510s;
        obj.f10456k = this.v;
        obj.f10457l = this.f10511w;
        obj.f10458m = this.f10512x;
        obj.f10459n = this.f10513y;
        obj.f10460o = this.A;
        obj.f10461p = this.B;
        obj.f10462q = this.C;
        obj.f10463r = this.E;
        obj.f10464s = this.F;
        obj.f10465t = this.G;
        obj.f10466u = this.H;
        obj.v = this.I;
        obj.f10467w = this.J;
        obj.f10468x = this.K;
        obj.f10469y = this.L;
        obj.f10470z = this.M;
        obj.A = this.N;
        obj.B = this.O;
        obj.C = this.P;
        obj.D = this.Q;
        obj.E = this.R;
        obj.F = this.S;
        obj.G = this.T;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1.class == obj.getClass()) {
            h1 h1Var = (h1) obj;
            if (f5.d0.a(this.f10503a, h1Var.f10503a) && f5.d0.a(this.f10504b, h1Var.f10504b) && f5.d0.a(this.f10505c, h1Var.f10505c) && f5.d0.a(this.d, h1Var.d) && f5.d0.a(this.f10506e, h1Var.f10506e) && f5.d0.a(this.f10507f, h1Var.f10507f) && f5.d0.a(this.h, h1Var.h) && f5.d0.a(this.f10508n, h1Var.f10508n) && f5.d0.a(this.f10509r, h1Var.f10509r) && Arrays.equals(this.f10510s, h1Var.f10510s) && f5.d0.a(this.v, h1Var.v) && f5.d0.a(this.f10511w, h1Var.f10511w) && f5.d0.a(this.f10512x, h1Var.f10512x) && f5.d0.a(this.f10513y, h1Var.f10513y) && f5.d0.a(this.A, h1Var.A) && f5.d0.a(this.B, h1Var.B) && f5.d0.a(this.C, h1Var.C) && f5.d0.a(this.E, h1Var.E) && f5.d0.a(this.F, h1Var.F) && f5.d0.a(this.G, h1Var.G) && f5.d0.a(this.H, h1Var.H) && f5.d0.a(this.I, h1Var.I) && f5.d0.a(this.J, h1Var.J) && f5.d0.a(this.K, h1Var.K) && f5.d0.a(this.L, h1Var.L) && f5.d0.a(this.M, h1Var.M) && f5.d0.a(this.N, h1Var.N) && f5.d0.a(this.O, h1Var.O) && f5.d0.a(this.P, h1Var.P) && f5.d0.a(this.Q, h1Var.Q) && f5.d0.a(this.R, h1Var.R) && f5.d0.a(this.S, h1Var.S)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10503a, this.f10504b, this.f10505c, this.d, this.f10506e, this.f10507f, this.h, this.f10508n, this.f10509r, Integer.valueOf(Arrays.hashCode(this.f10510s)), this.v, this.f10511w, this.f10512x, this.f10513y, this.A, this.B, this.C, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S});
    }
}
