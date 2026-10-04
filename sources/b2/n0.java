package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
public final class n0 {
    public static final n0 K = new n0(new m0());
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String f3371a0;
    public static final String f3372b0;
    public static final String f3373c0;
    public static final String f3374d0;
    public static final String f3375e0;
    public static final String f3376f0;
    public static final String f3377g0;
    public static final String f3378h0;
    public static final String f3379i0;
    public static final String f3380j0;
    public static final String f3381k0;
    public static final String f3382l0;
    public static final String m0;
    public static final String f3383n0;
    public static final String f3384o0;
    public static final String f3385p0;
    public static final String f3386q0;
    public static final String f3387r0;
    public static final String f3388s0;
    public static final String f3389t0;
    public final CharSequence A;
    public final CharSequence B;
    public final Integer C;
    public final Integer D;
    public final CharSequence E;
    public final CharSequence F;
    public final CharSequence G;
    public final Integer H;
    public final Bundle I;
    public final e9.i0 J;
    public final CharSequence f3390a;
    public final CharSequence f3391b;
    public final CharSequence f3392c;
    public final CharSequence d;
    public final CharSequence f3393e;
    public final CharSequence f3394f;
    public final CharSequence f3395g;
    public final Long h;
    public final c1 f3396i;
    public final c1 f3397j;
    public final byte[] f3398k;
    public final Integer f3399l;
    public final Uri f3400m;
    public final Integer f3401n;
    public final Integer f3402o;
    public final Integer f3403p;
    public final Boolean f3404q;
    public final Boolean f3405r;
    public final Integer f3406s;
    public final Integer f3407t;
    public final Integer f3408u;
    public final Integer v;
    public final Integer f3409w;
    public final Integer f3410x;
    public final Integer f3411y;
    public final CharSequence f3412z;

    static {
        String str = e2.d0.f8537a;
        L = Integer.toString(0, 36);
        M = Integer.toString(1, 36);
        N = Integer.toString(2, 36);
        O = Integer.toString(3, 36);
        P = Integer.toString(4, 36);
        Q = Integer.toString(5, 36);
        R = Integer.toString(6, 36);
        S = Integer.toString(8, 36);
        T = Integer.toString(9, 36);
        U = Integer.toString(10, 36);
        V = Integer.toString(11, 36);
        W = Integer.toString(12, 36);
        X = Integer.toString(13, 36);
        Y = Integer.toString(14, 36);
        Z = Integer.toString(15, 36);
        f3371a0 = Integer.toString(16, 36);
        f3372b0 = Integer.toString(17, 36);
        f3373c0 = Integer.toString(18, 36);
        f3374d0 = Integer.toString(19, 36);
        f3375e0 = Integer.toString(20, 36);
        f3376f0 = Integer.toString(21, 36);
        f3377g0 = Integer.toString(22, 36);
        f3378h0 = Integer.toString(23, 36);
        f3379i0 = Integer.toString(24, 36);
        f3380j0 = Integer.toString(25, 36);
        f3381k0 = Integer.toString(26, 36);
        f3382l0 = Integer.toString(27, 36);
        m0 = Integer.toString(28, 36);
        f3383n0 = Integer.toString(29, 36);
        f3384o0 = Integer.toString(30, 36);
        f3385p0 = Integer.toString(31, 36);
        f3386q0 = Integer.toString(32, 36);
        f3387r0 = Integer.toString(33, 36);
        f3388s0 = Integer.toString(34, 36);
        f3389t0 = Integer.toString(1000, 36);
    }

    public n0(m0 m0Var) {
        Boolean bool = m0Var.f3355q;
        Integer num = m0Var.f3354p;
        Integer num2 = m0Var.G;
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
        this.f3390a = m0Var.f3341a;
        this.f3391b = m0Var.f3342b;
        this.f3392c = m0Var.f3343c;
        this.d = m0Var.d;
        this.f3393e = m0Var.f3344e;
        this.f3394f = m0Var.f3345f;
        this.f3395g = m0Var.f3346g;
        this.h = m0Var.h;
        this.f3396i = m0Var.f3347i;
        this.f3397j = m0Var.f3348j;
        this.f3398k = m0Var.f3349k;
        this.f3399l = m0Var.f3350l;
        this.f3400m = m0Var.f3351m;
        this.f3401n = m0Var.f3352n;
        this.f3402o = m0Var.f3353o;
        this.f3403p = num;
        this.f3404q = bool;
        this.f3405r = m0Var.f3356r;
        Integer num3 = m0Var.f3357s;
        this.f3406s = num3;
        this.f3407t = num3;
        this.f3408u = m0Var.f3358t;
        this.v = m0Var.f3359u;
        this.f3409w = m0Var.v;
        this.f3410x = m0Var.f3360w;
        this.f3411y = m0Var.f3361x;
        this.f3412z = m0Var.f3362y;
        this.A = m0Var.f3363z;
        this.B = m0Var.A;
        this.C = m0Var.B;
        this.D = m0Var.C;
        this.E = m0Var.D;
        this.F = m0Var.E;
        this.G = m0Var.F;
        this.H = num2;
        this.J = m0Var.I;
        this.I = m0Var.H;
    }

    public static n0 b(Bundle bundle) {
        Integer num;
        boolean z10;
        Bundle bundle2;
        Bundle bundle3;
        m0 m0Var = new m0();
        m0Var.f3341a = bundle.getCharSequence(L);
        m0Var.f3342b = bundle.getCharSequence(M);
        m0Var.f3343c = bundle.getCharSequence(N);
        m0Var.d = bundle.getCharSequence(O);
        m0Var.f3344e = bundle.getCharSequence(P);
        m0Var.f3345f = bundle.getCharSequence(Q);
        m0Var.f3346g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = f3383n0;
        byte[] bArr = null;
        if (bundle.containsKey(str)) {
            num = Integer.valueOf(bundle.getInt(str));
        } else {
            num = null;
        }
        if (byteArray != null) {
            bArr = (byte[]) byteArray.clone();
        }
        m0Var.f3349k = bArr;
        m0Var.f3350l = num;
        m0Var.f3351m = (Uri) bundle.getParcelable(V);
        m0Var.f3362y = bundle.getCharSequence(f3377g0);
        m0Var.f3363z = bundle.getCharSequence(f3378h0);
        m0Var.A = bundle.getCharSequence(f3379i0);
        m0Var.D = bundle.getCharSequence(f3382l0);
        m0Var.E = bundle.getCharSequence(m0);
        m0Var.F = bundle.getCharSequence(f3384o0);
        m0Var.H = bundle.getBundle(f3389t0);
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            m0Var.f3347i = c1.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            m0Var.f3348j = c1.a(bundle2);
        }
        String str4 = f3387r0;
        if (bundle.containsKey(str4)) {
            long j3 = bundle.getLong(str4);
            Long valueOf = Long.valueOf(j3);
            if (j3 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.b(z10);
            m0Var.h = valueOf;
        }
        String str5 = W;
        if (bundle.containsKey(str5)) {
            m0Var.f3352n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            m0Var.f3353o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            m0Var.f3354p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = f3386q0;
        if (bundle.containsKey(str8)) {
            m0Var.f3355q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            m0Var.f3356r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f3371a0;
        if (bundle.containsKey(str10)) {
            m0Var.f3357s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = f3372b0;
        if (bundle.containsKey(str11)) {
            m0Var.f3358t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f3373c0;
        if (bundle.containsKey(str12)) {
            m0Var.f3359u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f3374d0;
        if (bundle.containsKey(str13)) {
            m0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f3375e0;
        if (bundle.containsKey(str14)) {
            m0Var.f3360w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f3376f0;
        if (bundle.containsKey(str15)) {
            m0Var.f3361x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f3380j0;
        if (bundle.containsKey(str16)) {
            m0Var.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f3381k0;
        if (bundle.containsKey(str17)) {
            m0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f3385p0;
        if (bundle.containsKey(str18)) {
            m0Var.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f3388s0);
        if (stringArrayList != null) {
            m0Var.I = e9.i0.v(stringArrayList);
        }
        return new n0(m0Var);
    }

    public final m0 a() {
        ?? obj = new Object();
        obj.f3341a = this.f3390a;
        obj.f3342b = this.f3391b;
        obj.f3343c = this.f3392c;
        obj.d = this.d;
        obj.f3344e = this.f3393e;
        obj.f3345f = this.f3394f;
        obj.f3346g = this.f3395g;
        obj.h = this.h;
        obj.f3347i = this.f3396i;
        obj.f3348j = this.f3397j;
        obj.f3349k = this.f3398k;
        obj.f3350l = this.f3399l;
        obj.f3351m = this.f3400m;
        obj.f3352n = this.f3401n;
        obj.f3353o = this.f3402o;
        obj.f3354p = this.f3403p;
        obj.f3355q = this.f3404q;
        obj.f3356r = this.f3405r;
        obj.f3357s = this.f3407t;
        obj.f3358t = this.f3408u;
        obj.f3359u = this.v;
        obj.v = this.f3409w;
        obj.f3360w = this.f3410x;
        obj.f3361x = this.f3411y;
        obj.f3362y = this.f3412z;
        obj.f3363z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.C = this.D;
        obj.D = this.E;
        obj.E = this.F;
        obj.F = this.G;
        obj.G = this.H;
        obj.I = this.J;
        obj.H = this.I;
        return obj;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f3390a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.f3391b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.f3392c;
        if (charSequence3 != null) {
            bundle.putCharSequence(N, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(O, charSequence4);
        }
        CharSequence charSequence5 = this.f3393e;
        if (charSequence5 != null) {
            bundle.putCharSequence(P, charSequence5);
        }
        CharSequence charSequence6 = this.f3394f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.f3395g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l4 = this.h;
        if (l4 != null) {
            bundle.putLong(f3387r0, l4.longValue());
        }
        byte[] bArr = this.f3398k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.f3400m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.f3412z;
        if (charSequence8 != null) {
            bundle.putCharSequence(f3377g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(f3378h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(f3379i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(f3382l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(f3384o0, charSequence13);
        }
        c1 c1Var = this.f3396i;
        if (c1Var != null) {
            bundle.putBundle(S, c1Var.c());
        }
        c1 c1Var2 = this.f3397j;
        if (c1Var2 != null) {
            bundle.putBundle(T, c1Var2.c());
        }
        Integer num = this.f3401n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.f3402o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.f3403p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.f3404q;
        if (bool != null) {
            bundle.putBoolean(f3386q0, bool.booleanValue());
        }
        Boolean bool2 = this.f3405r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.f3407t;
        if (num4 != null) {
            bundle.putInt(f3371a0, num4.intValue());
        }
        Integer num5 = this.f3408u;
        if (num5 != null) {
            bundle.putInt(f3372b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(f3373c0, num6.intValue());
        }
        Integer num7 = this.f3409w;
        if (num7 != null) {
            bundle.putInt(f3374d0, num7.intValue());
        }
        Integer num8 = this.f3410x;
        if (num8 != null) {
            bundle.putInt(f3375e0, num8.intValue());
        }
        Integer num9 = this.f3411y;
        if (num9 != null) {
            bundle.putInt(f3376f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(f3380j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(f3381k0, num11.intValue());
        }
        Integer num12 = this.f3399l;
        if (num12 != null) {
            bundle.putInt(f3383n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(f3385p0, num13.intValue());
        }
        e9.i0 i0Var = this.J;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f3388s0, new ArrayList<>(i0Var));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(f3389t0, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass()) {
            n0 n0Var = (n0) obj;
            if (Objects.equals(this.f3390a, n0Var.f3390a) && Objects.equals(this.f3391b, n0Var.f3391b) && Objects.equals(this.f3392c, n0Var.f3392c) && Objects.equals(this.d, n0Var.d) && Objects.equals(this.f3393e, n0Var.f3393e) && Objects.equals(this.f3394f, n0Var.f3394f) && Objects.equals(this.f3395g, n0Var.f3395g) && Objects.equals(this.h, n0Var.h) && Objects.equals(this.f3396i, n0Var.f3396i) && Objects.equals(this.f3397j, n0Var.f3397j) && Arrays.equals(this.f3398k, n0Var.f3398k) && Objects.equals(this.f3399l, n0Var.f3399l) && Objects.equals(this.f3400m, n0Var.f3400m) && Objects.equals(this.f3401n, n0Var.f3401n) && Objects.equals(this.f3402o, n0Var.f3402o) && Objects.equals(this.f3403p, n0Var.f3403p) && Objects.equals(this.f3404q, n0Var.f3404q) && Objects.equals(this.f3405r, n0Var.f3405r) && Objects.equals(this.f3407t, n0Var.f3407t) && Objects.equals(this.f3408u, n0Var.f3408u) && Objects.equals(this.v, n0Var.v) && Objects.equals(this.f3409w, n0Var.f3409w) && Objects.equals(this.f3410x, n0Var.f3410x) && Objects.equals(this.f3411y, n0Var.f3411y) && Objects.equals(this.f3412z, n0Var.f3412z) && Objects.equals(this.A, n0Var.A) && Objects.equals(this.B, n0Var.B) && Objects.equals(this.C, n0Var.C) && Objects.equals(this.D, n0Var.D) && Objects.equals(this.E, n0Var.E) && Objects.equals(this.F, n0Var.F) && Objects.equals(this.G, n0Var.G) && Objects.equals(this.H, n0Var.H) && Objects.equals(this.J, n0Var.J)) {
                if (this.I == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (n0Var.I == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z10;
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f3398k));
        if (this.I == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f3390a, this.f3391b, this.f3392c, this.d, this.f3393e, this.f3394f, this.f3395g, this.h, this.f3396i, this.f3397j, valueOf, this.f3399l, this.f3400m, this.f3401n, this.f3402o, this.f3403p, this.f3404q, this.f3405r, this.f3407t, this.f3408u, this.v, this.f3409w, this.f3410x, this.f3411y, this.f3412z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(z10), this.J);
    }
}
