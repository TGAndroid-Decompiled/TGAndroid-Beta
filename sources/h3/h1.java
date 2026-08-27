package h3;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

public final class h1 implements g {
    public static final String A0;
    public static final String B0;
    public static final f9.z C0;
    public static final h1 U = new h1(new g1());
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;

    public static final String f7871a0;

    public static final String f7872b0;

    public static final String f7873c0;

    public static final String f7874d0;

    public static final String f7875e0;

    public static final String f7876f0;

    public static final String f7877g0;

    public static final String f7878h0;

    public static final String f7879i0;

    public static final String f7880j0;

    public static final String f7881k0;

    public static final String f7882l0;
    public static final String m0;

    public static final String f7883n0;

    public static final String f7884o0;

    public static final String f7885p0;

    public static final String f7886q0;

    public static final String f7887r0;

    public static final String f7888s0;

    public static final String f7889t0;

    public static final String f7890u0;

    public static final String f7891v0;

    public static final String f7892w0;

    public static final String f7893x0;

    public static final String f7894y0;

    public static final String f7895z0;
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

    public final CharSequence f7896a;

    public final CharSequence f7897b;

    public final CharSequence f7898c;
    public final CharSequence d;

    public final CharSequence f7899e;

    public final CharSequence f7900f;
    public final CharSequence h;

    public final g2 f7901n;

    public final g2 f7902r;

    public final byte[] f7903s;
    public final Integer v;

    public final Uri f7904w;

    public final Integer f7905x;

    public final Integer f7906y;

    static {
        int i10 = d5.g0.f4795a;
        V = Integer.toString(0, 36);
        W = Integer.toString(1, 36);
        X = Integer.toString(2, 36);
        Y = Integer.toString(3, 36);
        Z = Integer.toString(4, 36);
        f7871a0 = Integer.toString(5, 36);
        f7872b0 = Integer.toString(6, 36);
        f7873c0 = Integer.toString(8, 36);
        f7874d0 = Integer.toString(9, 36);
        f7875e0 = Integer.toString(10, 36);
        f7876f0 = Integer.toString(11, 36);
        f7877g0 = Integer.toString(12, 36);
        f7878h0 = Integer.toString(13, 36);
        f7879i0 = Integer.toString(14, 36);
        f7880j0 = Integer.toString(15, 36);
        f7881k0 = Integer.toString(16, 36);
        f7882l0 = Integer.toString(17, 36);
        m0 = Integer.toString(18, 36);
        f7883n0 = Integer.toString(19, 36);
        f7884o0 = Integer.toString(20, 36);
        f7885p0 = Integer.toString(21, 36);
        f7886q0 = Integer.toString(22, 36);
        f7887r0 = Integer.toString(23, 36);
        f7888s0 = Integer.toString(24, 36);
        f7889t0 = Integer.toString(25, 36);
        f7890u0 = Integer.toString(26, 36);
        f7891v0 = Integer.toString(27, 36);
        f7892w0 = Integer.toString(28, 36);
        f7893x0 = Integer.toString(29, 36);
        f7894y0 = Integer.toString(30, 36);
        f7895z0 = Integer.toString(31, 36);
        A0 = Integer.toString(32, 36);
        B0 = Integer.toString(1000, 36);
        C0 = new f9.z(24);
    }

    public h1(g1 g1Var) {
        Boolean boolValueOf = g1Var.f7854p;
        Integer numValueOf = g1Var.f7853o;
        Integer numValueOf2 = g1Var.F;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
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
                    i12 = i10;
                }
                numValueOf = Integer.valueOf(i12);
            }
        } else if (numValueOf != null) {
            boolean z10 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z10);
            if (z10 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
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
                numValueOf2 = Integer.valueOf(i11);
            }
        }
        this.f7896a = g1Var.f7841a;
        this.f7897b = g1Var.f7842b;
        this.f7898c = g1Var.f7843c;
        this.d = g1Var.d;
        this.f7899e = g1Var.f7844e;
        this.f7900f = g1Var.f7845f;
        this.h = g1Var.f7846g;
        this.f7901n = g1Var.h;
        this.f7902r = g1Var.f7847i;
        this.f7903s = g1Var.f7848j;
        this.v = g1Var.f7849k;
        this.f7904w = g1Var.f7850l;
        this.f7905x = g1Var.f7851m;
        this.f7906y = g1Var.f7852n;
        this.A = numValueOf;
        this.B = boolValueOf;
        this.C = g1Var.f7855q;
        Integer num = g1Var.f7856r;
        this.D = num;
        this.E = num;
        this.F = g1Var.f7857s;
        this.G = g1Var.f7858t;
        this.H = g1Var.f7859u;
        this.I = g1Var.v;
        this.J = g1Var.f7860w;
        this.K = g1Var.f7861x;
        this.L = g1Var.f7862y;
        this.M = g1Var.f7863z;
        this.N = g1Var.A;
        this.O = g1Var.B;
        this.P = g1Var.C;
        this.Q = g1Var.D;
        this.R = g1Var.E;
        this.S = numValueOf2;
        this.T = g1Var.G;
    }

    public final g1 a() {
        g1 g1Var = new g1();
        g1Var.f7841a = this.f7896a;
        g1Var.f7842b = this.f7897b;
        g1Var.f7843c = this.f7898c;
        g1Var.d = this.d;
        g1Var.f7844e = this.f7899e;
        g1Var.f7845f = this.f7900f;
        g1Var.f7846g = this.h;
        g1Var.h = this.f7901n;
        g1Var.f7847i = this.f7902r;
        g1Var.f7848j = this.f7903s;
        g1Var.f7849k = this.v;
        g1Var.f7850l = this.f7904w;
        g1Var.f7851m = this.f7905x;
        g1Var.f7852n = this.f7906y;
        g1Var.f7853o = this.A;
        g1Var.f7854p = this.B;
        g1Var.f7855q = this.C;
        g1Var.f7856r = this.E;
        g1Var.f7857s = this.F;
        g1Var.f7858t = this.G;
        g1Var.f7859u = this.H;
        g1Var.v = this.I;
        g1Var.f7860w = this.J;
        g1Var.f7861x = this.K;
        g1Var.f7862y = this.L;
        g1Var.f7863z = this.M;
        g1Var.A = this.N;
        g1Var.B = this.O;
        g1Var.C = this.P;
        g1Var.D = this.Q;
        g1Var.E = this.R;
        g1Var.F = this.S;
        g1Var.G = this.T;
        return g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1.class == obj.getClass()) {
            h1 h1Var = (h1) obj;
            if (d5.g0.a(this.f7896a, h1Var.f7896a) && d5.g0.a(this.f7897b, h1Var.f7897b) && d5.g0.a(this.f7898c, h1Var.f7898c) && d5.g0.a(this.d, h1Var.d) && d5.g0.a(this.f7899e, h1Var.f7899e) && d5.g0.a(this.f7900f, h1Var.f7900f) && d5.g0.a(this.h, h1Var.h) && d5.g0.a(this.f7901n, h1Var.f7901n) && d5.g0.a(this.f7902r, h1Var.f7902r) && Arrays.equals(this.f7903s, h1Var.f7903s) && d5.g0.a(this.v, h1Var.v) && d5.g0.a(this.f7904w, h1Var.f7904w) && d5.g0.a(this.f7905x, h1Var.f7905x) && d5.g0.a(this.f7906y, h1Var.f7906y) && d5.g0.a(this.A, h1Var.A) && d5.g0.a(this.B, h1Var.B) && d5.g0.a(this.C, h1Var.C) && d5.g0.a(this.E, h1Var.E) && d5.g0.a(this.F, h1Var.F) && d5.g0.a(this.G, h1Var.G) && d5.g0.a(this.H, h1Var.H) && d5.g0.a(this.I, h1Var.I) && d5.g0.a(this.J, h1Var.J) && d5.g0.a(this.K, h1Var.K) && d5.g0.a(this.L, h1Var.L) && d5.g0.a(this.M, h1Var.M) && d5.g0.a(this.N, h1Var.N) && d5.g0.a(this.O, h1Var.O) && d5.g0.a(this.P, h1Var.P) && d5.g0.a(this.Q, h1Var.Q) && d5.g0.a(this.R, h1Var.R) && d5.g0.a(this.S, h1Var.S)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7896a, this.f7897b, this.f7898c, this.d, this.f7899e, this.f7900f, this.h, this.f7901n, this.f7902r, Integer.valueOf(Arrays.hashCode(this.f7903s)), this.v, this.f7904w, this.f7905x, this.f7906y, this.A, this.B, this.C, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S});
    }
}
