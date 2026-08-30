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
    public static final String f8500a0;
    public static final String f8501b0;
    public static final String f8502c0;
    public static final String f8503d0;
    public static final String f8504e0;
    public static final String f8505f0;
    public static final String f8506g0;
    public static final String f8507h0;
    public static final String f8508i0;
    public static final String f8509j0;
    public static final String f8510k0;
    public static final String f8511l0;
    public static final String m0;
    public static final String f8512n0;
    public static final String f8513o0;
    public static final String f8514p0;
    public static final String f8515q0;
    public static final String f8516r0;
    public static final String f8517s0;
    public static final String f8518t0;
    public static final String f8519u0;
    public static final String f8520v0;
    public static final String f8521w0;
    public static final String f8522x0;
    public static final String f8523y0;
    public static final String f8524z0;
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
    public final CharSequence f8525a;
    public final CharSequence f8526b;
    public final CharSequence f8527c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f8528f;
    public final CharSequence h;
    public final f2 f8529n;
    public final f2 f8530r;
    public final byte[] f8531s;
    public final Integer v;
    public final Uri f8532w;
    public final Integer f8533x;
    public final Integer f8534y;

    static {
        int i10 = h5.d0.f6937a;
        W = Integer.toString(0, 36);
        X = Integer.toString(1, 36);
        Y = Integer.toString(2, 36);
        Z = Integer.toString(3, 36);
        f8500a0 = Integer.toString(4, 36);
        f8501b0 = Integer.toString(5, 36);
        f8502c0 = Integer.toString(6, 36);
        f8503d0 = Integer.toString(8, 36);
        f8504e0 = Integer.toString(9, 36);
        f8505f0 = Integer.toString(10, 36);
        f8506g0 = Integer.toString(11, 36);
        f8507h0 = Integer.toString(12, 36);
        f8508i0 = Integer.toString(13, 36);
        f8509j0 = Integer.toString(14, 36);
        f8510k0 = Integer.toString(15, 36);
        f8511l0 = Integer.toString(16, 36);
        m0 = Integer.toString(17, 36);
        f8512n0 = Integer.toString(18, 36);
        f8513o0 = Integer.toString(19, 36);
        f8514p0 = Integer.toString(20, 36);
        f8515q0 = Integer.toString(21, 36);
        f8516r0 = Integer.toString(22, 36);
        f8517s0 = Integer.toString(23, 36);
        f8518t0 = Integer.toString(24, 36);
        f8519u0 = Integer.toString(25, 36);
        f8520v0 = Integer.toString(26, 36);
        f8521w0 = Integer.toString(27, 36);
        f8522x0 = Integer.toString(28, 36);
        f8523y0 = Integer.toString(29, 36);
        f8524z0 = Integer.toString(30, 36);
        A0 = Integer.toString(31, 36);
        B0 = Integer.toString(32, 36);
        C0 = Integer.toString(1000, 36);
        D0 = new q0(8);
    }

    public e1(d1 d1Var) {
        Boolean bool = d1Var.f8477p;
        Integer num = d1Var.f8476o;
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
        this.f8525a = d1Var.f8465a;
        this.f8526b = d1Var.f8466b;
        this.f8527c = d1Var.f8467c;
        this.d = d1Var.d;
        this.e = d1Var.e;
        this.f8528f = d1Var.f8468f;
        this.h = d1Var.f8469g;
        this.f8529n = d1Var.h;
        this.f8530r = d1Var.f8470i;
        this.f8531s = d1Var.f8471j;
        this.v = d1Var.f8472k;
        this.f8532w = d1Var.f8473l;
        this.f8533x = d1Var.f8474m;
        this.f8534y = d1Var.f8475n;
        this.B = num;
        this.C = bool;
        this.D = d1Var.f8478q;
        Integer num3 = d1Var.f8479r;
        this.E = num3;
        this.F = num3;
        this.G = d1Var.f8480s;
        this.H = d1Var.f8481t;
        this.I = d1Var.f8482u;
        this.J = d1Var.v;
        this.K = d1Var.f8483w;
        this.L = d1Var.f8484x;
        this.M = d1Var.f8485y;
        this.N = d1Var.f8486z;
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
        obj.f8465a = this.f8525a;
        obj.f8466b = this.f8526b;
        obj.f8467c = this.f8527c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f8468f = this.f8528f;
        obj.f8469g = this.h;
        obj.h = this.f8529n;
        obj.f8470i = this.f8530r;
        obj.f8471j = this.f8531s;
        obj.f8472k = this.v;
        obj.f8473l = this.f8532w;
        obj.f8474m = this.f8533x;
        obj.f8475n = this.f8534y;
        obj.f8476o = this.B;
        obj.f8477p = this.C;
        obj.f8478q = this.D;
        obj.f8479r = this.F;
        obj.f8480s = this.G;
        obj.f8481t = this.H;
        obj.f8482u = this.I;
        obj.v = this.J;
        obj.f8483w = this.K;
        obj.f8484x = this.L;
        obj.f8485y = this.M;
        obj.f8486z = this.N;
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
            if (h5.d0.a(this.f8525a, e1Var.f8525a) && h5.d0.a(this.f8526b, e1Var.f8526b) && h5.d0.a(this.f8527c, e1Var.f8527c) && h5.d0.a(this.d, e1Var.d) && h5.d0.a(this.e, e1Var.e) && h5.d0.a(this.f8528f, e1Var.f8528f) && h5.d0.a(this.h, e1Var.h) && h5.d0.a(this.f8529n, e1Var.f8529n) && h5.d0.a(this.f8530r, e1Var.f8530r) && Arrays.equals(this.f8531s, e1Var.f8531s) && h5.d0.a(this.v, e1Var.v) && h5.d0.a(this.f8532w, e1Var.f8532w) && h5.d0.a(this.f8533x, e1Var.f8533x) && h5.d0.a(this.f8534y, e1Var.f8534y) && h5.d0.a(this.B, e1Var.B) && h5.d0.a(this.C, e1Var.C) && h5.d0.a(this.D, e1Var.D) && h5.d0.a(this.F, e1Var.F) && h5.d0.a(this.G, e1Var.G) && h5.d0.a(this.H, e1Var.H) && h5.d0.a(this.I, e1Var.I) && h5.d0.a(this.J, e1Var.J) && h5.d0.a(this.K, e1Var.K) && h5.d0.a(this.L, e1Var.L) && h5.d0.a(this.M, e1Var.M) && h5.d0.a(this.N, e1Var.N) && h5.d0.a(this.O, e1Var.O) && h5.d0.a(this.P, e1Var.P) && h5.d0.a(this.Q, e1Var.Q) && h5.d0.a(this.R, e1Var.R) && h5.d0.a(this.S, e1Var.S) && h5.d0.a(this.T, e1Var.T)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8525a, this.f8526b, this.f8527c, this.d, this.e, this.f8528f, this.h, this.f8529n, this.f8530r, Integer.valueOf(Arrays.hashCode(this.f8531s)), this.v, this.f8532w, this.f8533x, this.f8534y, this.B, this.C, this.D, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T});
    }
}
