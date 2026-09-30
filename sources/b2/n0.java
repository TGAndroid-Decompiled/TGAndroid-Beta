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
    public static final String f3115a0;
    public static final String f3116b0;
    public static final String f3117c0;
    public static final String f3118d0;
    public static final String f3119e0;
    public static final String f3120f0;
    public static final String f3121g0;
    public static final String f3122h0;
    public static final String f3123i0;
    public static final String f3124j0;
    public static final String f3125k0;
    public static final String f3126l0;
    public static final String m0;
    public static final String f3127n0;
    public static final String f3128o0;
    public static final String f3129p0;
    public static final String f3130q0;
    public static final String f3131r0;
    public static final String f3132s0;
    public static final String f3133t0;
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
    public final CharSequence f3134a;
    public final CharSequence f3135b;
    public final CharSequence f3136c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f3137f;
    public final CharSequence f3138g;
    public final Long h;
    public final c1 f3139i;
    public final c1 f3140j;
    public final byte[] f3141k;
    public final Integer f3142l;
    public final Uri f3143m;
    public final Integer f3144n;
    public final Integer f3145o;
    public final Integer f3146p;
    public final Boolean f3147q;
    public final Boolean f3148r;
    public final Integer f3149s;
    public final Integer f3150t;
    public final Integer f3151u;
    public final Integer v;
    public final Integer f3152w;
    public final Integer f3153x;
    public final Integer f3154y;
    public final CharSequence f3155z;

    static {
        String str = e2.d0.f7870a;
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
        f3115a0 = Integer.toString(16, 36);
        f3116b0 = Integer.toString(17, 36);
        f3117c0 = Integer.toString(18, 36);
        f3118d0 = Integer.toString(19, 36);
        f3119e0 = Integer.toString(20, 36);
        f3120f0 = Integer.toString(21, 36);
        f3121g0 = Integer.toString(22, 36);
        f3122h0 = Integer.toString(23, 36);
        f3123i0 = Integer.toString(24, 36);
        f3124j0 = Integer.toString(25, 36);
        f3125k0 = Integer.toString(26, 36);
        f3126l0 = Integer.toString(27, 36);
        m0 = Integer.toString(28, 36);
        f3127n0 = Integer.toString(29, 36);
        f3128o0 = Integer.toString(30, 36);
        f3129p0 = Integer.toString(31, 36);
        f3130q0 = Integer.toString(32, 36);
        f3131r0 = Integer.toString(33, 36);
        f3132s0 = Integer.toString(34, 36);
        f3133t0 = Integer.toString(1000, 36);
    }

    public n0(m0 m0Var) {
        Boolean bool = m0Var.f3100q;
        Integer num = m0Var.f3099p;
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
        this.f3134a = m0Var.f3087a;
        this.f3135b = m0Var.f3088b;
        this.f3136c = m0Var.f3089c;
        this.d = m0Var.d;
        this.e = m0Var.e;
        this.f3137f = m0Var.f3090f;
        this.f3138g = m0Var.f3091g;
        this.h = m0Var.h;
        this.f3139i = m0Var.f3092i;
        this.f3140j = m0Var.f3093j;
        this.f3141k = m0Var.f3094k;
        this.f3142l = m0Var.f3095l;
        this.f3143m = m0Var.f3096m;
        this.f3144n = m0Var.f3097n;
        this.f3145o = m0Var.f3098o;
        this.f3146p = num;
        this.f3147q = bool;
        this.f3148r = m0Var.f3101r;
        Integer num3 = m0Var.f3102s;
        this.f3149s = num3;
        this.f3150t = num3;
        this.f3151u = m0Var.f3103t;
        this.v = m0Var.f3104u;
        this.f3152w = m0Var.v;
        this.f3153x = m0Var.f3105w;
        this.f3154y = m0Var.f3106x;
        this.f3155z = m0Var.f3107y;
        this.A = m0Var.f3108z;
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
        m0Var.f3087a = bundle.getCharSequence(L);
        m0Var.f3088b = bundle.getCharSequence(M);
        m0Var.f3089c = bundle.getCharSequence(N);
        m0Var.d = bundle.getCharSequence(O);
        m0Var.e = bundle.getCharSequence(P);
        m0Var.f3090f = bundle.getCharSequence(Q);
        m0Var.f3091g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = f3127n0;
        byte[] bArr = null;
        if (bundle.containsKey(str)) {
            num = Integer.valueOf(bundle.getInt(str));
        } else {
            num = null;
        }
        if (byteArray != null) {
            bArr = (byte[]) byteArray.clone();
        }
        m0Var.f3094k = bArr;
        m0Var.f3095l = num;
        m0Var.f3096m = (Uri) bundle.getParcelable(V);
        m0Var.f3107y = bundle.getCharSequence(f3121g0);
        m0Var.f3108z = bundle.getCharSequence(f3122h0);
        m0Var.A = bundle.getCharSequence(f3123i0);
        m0Var.D = bundle.getCharSequence(f3126l0);
        m0Var.E = bundle.getCharSequence(m0);
        m0Var.F = bundle.getCharSequence(f3128o0);
        m0Var.H = bundle.getBundle(f3133t0);
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            m0Var.f3092i = c1.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            m0Var.f3093j = c1.a(bundle2);
        }
        String str4 = f3131r0;
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
            m0Var.f3097n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            m0Var.f3098o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            m0Var.f3099p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = f3130q0;
        if (bundle.containsKey(str8)) {
            m0Var.f3100q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            m0Var.f3101r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f3115a0;
        if (bundle.containsKey(str10)) {
            m0Var.f3102s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = f3116b0;
        if (bundle.containsKey(str11)) {
            m0Var.f3103t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f3117c0;
        if (bundle.containsKey(str12)) {
            m0Var.f3104u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f3118d0;
        if (bundle.containsKey(str13)) {
            m0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f3119e0;
        if (bundle.containsKey(str14)) {
            m0Var.f3105w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f3120f0;
        if (bundle.containsKey(str15)) {
            m0Var.f3106x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f3124j0;
        if (bundle.containsKey(str16)) {
            m0Var.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f3125k0;
        if (bundle.containsKey(str17)) {
            m0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f3129p0;
        if (bundle.containsKey(str18)) {
            m0Var.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f3132s0);
        if (stringArrayList != null) {
            m0Var.I = e9.i0.v(stringArrayList);
        }
        return new n0(m0Var);
    }

    public final m0 a() {
        ?? obj = new Object();
        obj.f3087a = this.f3134a;
        obj.f3088b = this.f3135b;
        obj.f3089c = this.f3136c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f3090f = this.f3137f;
        obj.f3091g = this.f3138g;
        obj.h = this.h;
        obj.f3092i = this.f3139i;
        obj.f3093j = this.f3140j;
        obj.f3094k = this.f3141k;
        obj.f3095l = this.f3142l;
        obj.f3096m = this.f3143m;
        obj.f3097n = this.f3144n;
        obj.f3098o = this.f3145o;
        obj.f3099p = this.f3146p;
        obj.f3100q = this.f3147q;
        obj.f3101r = this.f3148r;
        obj.f3102s = this.f3150t;
        obj.f3103t = this.f3151u;
        obj.f3104u = this.v;
        obj.v = this.f3152w;
        obj.f3105w = this.f3153x;
        obj.f3106x = this.f3154y;
        obj.f3107y = this.f3155z;
        obj.f3108z = this.A;
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
        CharSequence charSequence = this.f3134a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.f3135b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.f3136c;
        if (charSequence3 != null) {
            bundle.putCharSequence(N, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(O, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(P, charSequence5);
        }
        CharSequence charSequence6 = this.f3137f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.f3138g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l4 = this.h;
        if (l4 != null) {
            bundle.putLong(f3131r0, l4.longValue());
        }
        byte[] bArr = this.f3141k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.f3143m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.f3155z;
        if (charSequence8 != null) {
            bundle.putCharSequence(f3121g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(f3122h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(f3123i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(f3126l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(f3128o0, charSequence13);
        }
        c1 c1Var = this.f3139i;
        if (c1Var != null) {
            bundle.putBundle(S, c1Var.c());
        }
        c1 c1Var2 = this.f3140j;
        if (c1Var2 != null) {
            bundle.putBundle(T, c1Var2.c());
        }
        Integer num = this.f3144n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.f3145o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.f3146p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.f3147q;
        if (bool != null) {
            bundle.putBoolean(f3130q0, bool.booleanValue());
        }
        Boolean bool2 = this.f3148r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.f3150t;
        if (num4 != null) {
            bundle.putInt(f3115a0, num4.intValue());
        }
        Integer num5 = this.f3151u;
        if (num5 != null) {
            bundle.putInt(f3116b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(f3117c0, num6.intValue());
        }
        Integer num7 = this.f3152w;
        if (num7 != null) {
            bundle.putInt(f3118d0, num7.intValue());
        }
        Integer num8 = this.f3153x;
        if (num8 != null) {
            bundle.putInt(f3119e0, num8.intValue());
        }
        Integer num9 = this.f3154y;
        if (num9 != null) {
            bundle.putInt(f3120f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(f3124j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(f3125k0, num11.intValue());
        }
        Integer num12 = this.f3142l;
        if (num12 != null) {
            bundle.putInt(f3127n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(f3129p0, num13.intValue());
        }
        e9.i0 i0Var = this.J;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f3132s0, new ArrayList<>(i0Var));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(f3133t0, bundle2);
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
            if (Objects.equals(this.f3134a, n0Var.f3134a) && Objects.equals(this.f3135b, n0Var.f3135b) && Objects.equals(this.f3136c, n0Var.f3136c) && Objects.equals(this.d, n0Var.d) && Objects.equals(this.e, n0Var.e) && Objects.equals(this.f3137f, n0Var.f3137f) && Objects.equals(this.f3138g, n0Var.f3138g) && Objects.equals(this.h, n0Var.h) && Objects.equals(this.f3139i, n0Var.f3139i) && Objects.equals(this.f3140j, n0Var.f3140j) && Arrays.equals(this.f3141k, n0Var.f3141k) && Objects.equals(this.f3142l, n0Var.f3142l) && Objects.equals(this.f3143m, n0Var.f3143m) && Objects.equals(this.f3144n, n0Var.f3144n) && Objects.equals(this.f3145o, n0Var.f3145o) && Objects.equals(this.f3146p, n0Var.f3146p) && Objects.equals(this.f3147q, n0Var.f3147q) && Objects.equals(this.f3148r, n0Var.f3148r) && Objects.equals(this.f3150t, n0Var.f3150t) && Objects.equals(this.f3151u, n0Var.f3151u) && Objects.equals(this.v, n0Var.v) && Objects.equals(this.f3152w, n0Var.f3152w) && Objects.equals(this.f3153x, n0Var.f3153x) && Objects.equals(this.f3154y, n0Var.f3154y) && Objects.equals(this.f3155z, n0Var.f3155z) && Objects.equals(this.A, n0Var.A) && Objects.equals(this.B, n0Var.B) && Objects.equals(this.C, n0Var.C) && Objects.equals(this.D, n0Var.D) && Objects.equals(this.E, n0Var.E) && Objects.equals(this.F, n0Var.F) && Objects.equals(this.G, n0Var.G) && Objects.equals(this.H, n0Var.H) && Objects.equals(this.J, n0Var.J)) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f3141k));
        if (this.I == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f3134a, this.f3135b, this.f3136c, this.d, this.e, this.f3137f, this.f3138g, this.h, this.f3139i, this.f3140j, valueOf, this.f3142l, this.f3143m, this.f3144n, this.f3145o, this.f3146p, this.f3147q, this.f3148r, this.f3150t, this.f3151u, this.v, this.f3152w, this.f3153x, this.f3154y, this.f3155z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(z10), this.J);
    }
}
