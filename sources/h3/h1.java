package h3;

import android.net.Uri;
import android.os.Bundle;
import fh.y5;
import java.util.Arrays;
public final class h1 implements g {
    public static final String A0;
    public static final String B0;
    public static final y5 C0;
    public static final h1 U = new h1(new Object());
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String f9441a0;
    public static final String f9442b0;
    public static final String f9443c0;
    public static final String f9444d0;
    public static final String f9445e0;
    public static final String f9446f0;
    public static final String f9447g0;
    public static final String f9448h0;
    public static final String f9449i0;
    public static final String f9450j0;
    public static final String f9451k0;
    public static final String f9452l0;
    public static final String m0;
    public static final String f9453n0;
    public static final String f9454o0;
    public static final String f9455p0;
    public static final String f9456q0;
    public static final String f9457r0;
    public static final String f9458s0;
    public static final String f9459t0;
    public static final String f9460u0;
    public static final String f9461v0;
    public static final String f9462w0;
    public static final String f9463x0;
    public static final String f9464y0;
    public static final String f9465z0;
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
    public final CharSequence f9466a;
    public final CharSequence f9467b;
    public final CharSequence f9468c;
    public final CharSequence d;
    public final CharSequence f9469e;
    public final CharSequence f9470f;
    public final CharSequence h;
    public final g2 f9471n;
    public final g2 f9472r;
    public final byte[] f9473s;
    public final Integer v;
    public final Uri f9474w;
    public final Integer f9475x;
    public final Integer f9476y;

    static {
        int i9 = d5.f0.f4349a;
        V = Integer.toString(0, 36);
        W = Integer.toString(1, 36);
        X = Integer.toString(2, 36);
        Y = Integer.toString(3, 36);
        Z = Integer.toString(4, 36);
        f9441a0 = Integer.toString(5, 36);
        f9442b0 = Integer.toString(6, 36);
        f9443c0 = Integer.toString(8, 36);
        f9444d0 = Integer.toString(9, 36);
        f9445e0 = Integer.toString(10, 36);
        f9446f0 = Integer.toString(11, 36);
        f9447g0 = Integer.toString(12, 36);
        f9448h0 = Integer.toString(13, 36);
        f9449i0 = Integer.toString(14, 36);
        f9450j0 = Integer.toString(15, 36);
        f9451k0 = Integer.toString(16, 36);
        f9452l0 = Integer.toString(17, 36);
        m0 = Integer.toString(18, 36);
        f9453n0 = Integer.toString(19, 36);
        f9454o0 = Integer.toString(20, 36);
        f9455p0 = Integer.toString(21, 36);
        f9456q0 = Integer.toString(22, 36);
        f9457r0 = Integer.toString(23, 36);
        f9458s0 = Integer.toString(24, 36);
        f9459t0 = Integer.toString(25, 36);
        f9460u0 = Integer.toString(26, 36);
        f9461v0 = Integer.toString(27, 36);
        f9462w0 = Integer.toString(28, 36);
        f9463x0 = Integer.toString(29, 36);
        f9464y0 = Integer.toString(30, 36);
        f9465z0 = Integer.toString(31, 36);
        A0 = Integer.toString(32, 36);
        B0 = Integer.toString(1000, 36);
        C0 = new y5(20);
    }

    public h1(g1 g1Var) {
        Boolean bool = g1Var.f9424p;
        Integer num = g1Var.f9423o;
        Integer num2 = g1Var.F;
        int i9 = 1;
        int i10 = 0;
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
                            i9 = 0;
                            break;
                        case 21:
                            i9 = 2;
                            break;
                        case 22:
                            i9 = 3;
                            break;
                        case 23:
                            i9 = 4;
                            break;
                        case 24:
                            i9 = 5;
                            break;
                        case 25:
                            i9 = 6;
                            break;
                    }
                    i10 = i9;
                }
                num = Integer.valueOf(i10);
            }
        } else if (num != null) {
            boolean z10 = num.intValue() != -1;
            bool = Boolean.valueOf(z10);
            if (z10 && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i10 = 21;
                        break;
                    case 3:
                        i10 = 22;
                        break;
                    case 4:
                        i10 = 23;
                        break;
                    case 5:
                        i10 = 24;
                        break;
                    case 6:
                        i10 = 25;
                        break;
                    default:
                        i10 = 20;
                        break;
                }
                num2 = Integer.valueOf(i10);
            }
        }
        this.f9466a = g1Var.f9411a;
        this.f9467b = g1Var.f9412b;
        this.f9468c = g1Var.f9413c;
        this.d = g1Var.d;
        this.f9469e = g1Var.f9414e;
        this.f9470f = g1Var.f9415f;
        this.h = g1Var.f9416g;
        this.f9471n = g1Var.h;
        this.f9472r = g1Var.f9417i;
        this.f9473s = g1Var.f9418j;
        this.v = g1Var.f9419k;
        this.f9474w = g1Var.f9420l;
        this.f9475x = g1Var.f9421m;
        this.f9476y = g1Var.f9422n;
        this.A = num;
        this.B = bool;
        this.C = g1Var.f9425q;
        Integer num3 = g1Var.f9426r;
        this.D = num3;
        this.E = num3;
        this.F = g1Var.f9427s;
        this.G = g1Var.f9428t;
        this.H = g1Var.f9429u;
        this.I = g1Var.v;
        this.J = g1Var.f9430w;
        this.K = g1Var.f9431x;
        this.L = g1Var.f9432y;
        this.M = g1Var.f9433z;
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
        obj.f9411a = this.f9466a;
        obj.f9412b = this.f9467b;
        obj.f9413c = this.f9468c;
        obj.d = this.d;
        obj.f9414e = this.f9469e;
        obj.f9415f = this.f9470f;
        obj.f9416g = this.h;
        obj.h = this.f9471n;
        obj.f9417i = this.f9472r;
        obj.f9418j = this.f9473s;
        obj.f9419k = this.v;
        obj.f9420l = this.f9474w;
        obj.f9421m = this.f9475x;
        obj.f9422n = this.f9476y;
        obj.f9423o = this.A;
        obj.f9424p = this.B;
        obj.f9425q = this.C;
        obj.f9426r = this.E;
        obj.f9427s = this.F;
        obj.f9428t = this.G;
        obj.f9429u = this.H;
        obj.v = this.I;
        obj.f9430w = this.J;
        obj.f9431x = this.K;
        obj.f9432y = this.L;
        obj.f9433z = this.M;
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
            if (d5.f0.a(this.f9466a, h1Var.f9466a) && d5.f0.a(this.f9467b, h1Var.f9467b) && d5.f0.a(this.f9468c, h1Var.f9468c) && d5.f0.a(this.d, h1Var.d) && d5.f0.a(this.f9469e, h1Var.f9469e) && d5.f0.a(this.f9470f, h1Var.f9470f) && d5.f0.a(this.h, h1Var.h) && d5.f0.a(this.f9471n, h1Var.f9471n) && d5.f0.a(this.f9472r, h1Var.f9472r) && Arrays.equals(this.f9473s, h1Var.f9473s) && d5.f0.a(this.v, h1Var.v) && d5.f0.a(this.f9474w, h1Var.f9474w) && d5.f0.a(this.f9475x, h1Var.f9475x) && d5.f0.a(this.f9476y, h1Var.f9476y) && d5.f0.a(this.A, h1Var.A) && d5.f0.a(this.B, h1Var.B) && d5.f0.a(this.C, h1Var.C) && d5.f0.a(this.E, h1Var.E) && d5.f0.a(this.F, h1Var.F) && d5.f0.a(this.G, h1Var.G) && d5.f0.a(this.H, h1Var.H) && d5.f0.a(this.I, h1Var.I) && d5.f0.a(this.J, h1Var.J) && d5.f0.a(this.K, h1Var.K) && d5.f0.a(this.L, h1Var.L) && d5.f0.a(this.M, h1Var.M) && d5.f0.a(this.N, h1Var.N) && d5.f0.a(this.O, h1Var.O) && d5.f0.a(this.P, h1Var.P) && d5.f0.a(this.Q, h1Var.Q) && d5.f0.a(this.R, h1Var.R) && d5.f0.a(this.S, h1Var.S)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9466a, this.f9467b, this.f9468c, this.d, this.f9469e, this.f9470f, this.h, this.f9471n, this.f9472r, Integer.valueOf(Arrays.hashCode(this.f9473s)), this.v, this.f9474w, this.f9475x, this.f9476y, this.A, this.B, this.C, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S});
    }
}
