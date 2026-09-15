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
    public static final String f3118a0;
    public static final String f3119b0;
    public static final String f3120c0;
    public static final String f3121d0;
    public static final String f3122e0;
    public static final String f3123f0;
    public static final String f3124g0;
    public static final String f3125h0;
    public static final String f3126i0;
    public static final String f3127j0;
    public static final String f3128k0;
    public static final String f3129l0;
    public static final String m0;
    public static final String f3130n0;
    public static final String f3131o0;
    public static final String f3132p0;
    public static final String f3133q0;
    public static final String f3134r0;
    public static final String f3135s0;
    public static final String f3136t0;
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
    public final CharSequence f3137a;
    public final CharSequence f3138b;
    public final CharSequence f3139c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f3140f;
    public final CharSequence f3141g;
    public final Long h;
    public final c1 f3142i;
    public final c1 f3143j;
    public final byte[] f3144k;
    public final Integer f3145l;
    public final Uri f3146m;
    public final Integer f3147n;
    public final Integer f3148o;
    public final Integer f3149p;
    public final Boolean f3150q;
    public final Boolean f3151r;
    public final Integer f3152s;
    public final Integer f3153t;
    public final Integer f3154u;
    public final Integer v;
    public final Integer f3155w;
    public final Integer f3156x;
    public final Integer f3157y;
    public final CharSequence f3158z;

    static {
        String str = e2.d0.f7883a;
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
        f3118a0 = Integer.toString(16, 36);
        f3119b0 = Integer.toString(17, 36);
        f3120c0 = Integer.toString(18, 36);
        f3121d0 = Integer.toString(19, 36);
        f3122e0 = Integer.toString(20, 36);
        f3123f0 = Integer.toString(21, 36);
        f3124g0 = Integer.toString(22, 36);
        f3125h0 = Integer.toString(23, 36);
        f3126i0 = Integer.toString(24, 36);
        f3127j0 = Integer.toString(25, 36);
        f3128k0 = Integer.toString(26, 36);
        f3129l0 = Integer.toString(27, 36);
        m0 = Integer.toString(28, 36);
        f3130n0 = Integer.toString(29, 36);
        f3131o0 = Integer.toString(30, 36);
        f3132p0 = Integer.toString(31, 36);
        f3133q0 = Integer.toString(32, 36);
        f3134r0 = Integer.toString(33, 36);
        f3135s0 = Integer.toString(34, 36);
        f3136t0 = Integer.toString(1000, 36);
    }

    public n0(m0 m0Var) {
        Boolean bool = m0Var.f3103q;
        Integer num = m0Var.f3102p;
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
        this.f3137a = m0Var.f3090a;
        this.f3138b = m0Var.f3091b;
        this.f3139c = m0Var.f3092c;
        this.d = m0Var.d;
        this.e = m0Var.e;
        this.f3140f = m0Var.f3093f;
        this.f3141g = m0Var.f3094g;
        this.h = m0Var.h;
        this.f3142i = m0Var.f3095i;
        this.f3143j = m0Var.f3096j;
        this.f3144k = m0Var.f3097k;
        this.f3145l = m0Var.f3098l;
        this.f3146m = m0Var.f3099m;
        this.f3147n = m0Var.f3100n;
        this.f3148o = m0Var.f3101o;
        this.f3149p = num;
        this.f3150q = bool;
        this.f3151r = m0Var.f3104r;
        Integer num3 = m0Var.f3105s;
        this.f3152s = num3;
        this.f3153t = num3;
        this.f3154u = m0Var.f3106t;
        this.v = m0Var.f3107u;
        this.f3155w = m0Var.v;
        this.f3156x = m0Var.f3108w;
        this.f3157y = m0Var.f3109x;
        this.f3158z = m0Var.f3110y;
        this.A = m0Var.f3111z;
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
        m0Var.f3090a = bundle.getCharSequence(L);
        m0Var.f3091b = bundle.getCharSequence(M);
        m0Var.f3092c = bundle.getCharSequence(N);
        m0Var.d = bundle.getCharSequence(O);
        m0Var.e = bundle.getCharSequence(P);
        m0Var.f3093f = bundle.getCharSequence(Q);
        m0Var.f3094g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = f3130n0;
        byte[] bArr = null;
        if (bundle.containsKey(str)) {
            num = Integer.valueOf(bundle.getInt(str));
        } else {
            num = null;
        }
        if (byteArray != null) {
            bArr = (byte[]) byteArray.clone();
        }
        m0Var.f3097k = bArr;
        m0Var.f3098l = num;
        m0Var.f3099m = (Uri) bundle.getParcelable(V);
        m0Var.f3110y = bundle.getCharSequence(f3124g0);
        m0Var.f3111z = bundle.getCharSequence(f3125h0);
        m0Var.A = bundle.getCharSequence(f3126i0);
        m0Var.D = bundle.getCharSequence(f3129l0);
        m0Var.E = bundle.getCharSequence(m0);
        m0Var.F = bundle.getCharSequence(f3131o0);
        m0Var.H = bundle.getBundle(f3136t0);
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            m0Var.f3095i = c1.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            m0Var.f3096j = c1.a(bundle2);
        }
        String str4 = f3134r0;
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
            m0Var.f3100n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            m0Var.f3101o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            m0Var.f3102p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = f3133q0;
        if (bundle.containsKey(str8)) {
            m0Var.f3103q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            m0Var.f3104r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f3118a0;
        if (bundle.containsKey(str10)) {
            m0Var.f3105s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = f3119b0;
        if (bundle.containsKey(str11)) {
            m0Var.f3106t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f3120c0;
        if (bundle.containsKey(str12)) {
            m0Var.f3107u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f3121d0;
        if (bundle.containsKey(str13)) {
            m0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f3122e0;
        if (bundle.containsKey(str14)) {
            m0Var.f3108w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f3123f0;
        if (bundle.containsKey(str15)) {
            m0Var.f3109x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f3127j0;
        if (bundle.containsKey(str16)) {
            m0Var.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f3128k0;
        if (bundle.containsKey(str17)) {
            m0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f3132p0;
        if (bundle.containsKey(str18)) {
            m0Var.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f3135s0);
        if (stringArrayList != null) {
            m0Var.I = e9.i0.v(stringArrayList);
        }
        return new n0(m0Var);
    }

    public final m0 a() {
        ?? obj = new Object();
        obj.f3090a = this.f3137a;
        obj.f3091b = this.f3138b;
        obj.f3092c = this.f3139c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f3093f = this.f3140f;
        obj.f3094g = this.f3141g;
        obj.h = this.h;
        obj.f3095i = this.f3142i;
        obj.f3096j = this.f3143j;
        obj.f3097k = this.f3144k;
        obj.f3098l = this.f3145l;
        obj.f3099m = this.f3146m;
        obj.f3100n = this.f3147n;
        obj.f3101o = this.f3148o;
        obj.f3102p = this.f3149p;
        obj.f3103q = this.f3150q;
        obj.f3104r = this.f3151r;
        obj.f3105s = this.f3153t;
        obj.f3106t = this.f3154u;
        obj.f3107u = this.v;
        obj.v = this.f3155w;
        obj.f3108w = this.f3156x;
        obj.f3109x = this.f3157y;
        obj.f3110y = this.f3158z;
        obj.f3111z = this.A;
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
        CharSequence charSequence = this.f3137a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.f3138b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.f3139c;
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
        CharSequence charSequence6 = this.f3140f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.f3141g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l4 = this.h;
        if (l4 != null) {
            bundle.putLong(f3134r0, l4.longValue());
        }
        byte[] bArr = this.f3144k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.f3146m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.f3158z;
        if (charSequence8 != null) {
            bundle.putCharSequence(f3124g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(f3125h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(f3126i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(f3129l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(f3131o0, charSequence13);
        }
        c1 c1Var = this.f3142i;
        if (c1Var != null) {
            bundle.putBundle(S, c1Var.c());
        }
        c1 c1Var2 = this.f3143j;
        if (c1Var2 != null) {
            bundle.putBundle(T, c1Var2.c());
        }
        Integer num = this.f3147n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.f3148o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.f3149p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.f3150q;
        if (bool != null) {
            bundle.putBoolean(f3133q0, bool.booleanValue());
        }
        Boolean bool2 = this.f3151r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.f3153t;
        if (num4 != null) {
            bundle.putInt(f3118a0, num4.intValue());
        }
        Integer num5 = this.f3154u;
        if (num5 != null) {
            bundle.putInt(f3119b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(f3120c0, num6.intValue());
        }
        Integer num7 = this.f3155w;
        if (num7 != null) {
            bundle.putInt(f3121d0, num7.intValue());
        }
        Integer num8 = this.f3156x;
        if (num8 != null) {
            bundle.putInt(f3122e0, num8.intValue());
        }
        Integer num9 = this.f3157y;
        if (num9 != null) {
            bundle.putInt(f3123f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(f3127j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(f3128k0, num11.intValue());
        }
        Integer num12 = this.f3145l;
        if (num12 != null) {
            bundle.putInt(f3130n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(f3132p0, num13.intValue());
        }
        e9.i0 i0Var = this.J;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f3135s0, new ArrayList<>(i0Var));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(f3136t0, bundle2);
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
            if (Objects.equals(this.f3137a, n0Var.f3137a) && Objects.equals(this.f3138b, n0Var.f3138b) && Objects.equals(this.f3139c, n0Var.f3139c) && Objects.equals(this.d, n0Var.d) && Objects.equals(this.e, n0Var.e) && Objects.equals(this.f3140f, n0Var.f3140f) && Objects.equals(this.f3141g, n0Var.f3141g) && Objects.equals(this.h, n0Var.h) && Objects.equals(this.f3142i, n0Var.f3142i) && Objects.equals(this.f3143j, n0Var.f3143j) && Arrays.equals(this.f3144k, n0Var.f3144k) && Objects.equals(this.f3145l, n0Var.f3145l) && Objects.equals(this.f3146m, n0Var.f3146m) && Objects.equals(this.f3147n, n0Var.f3147n) && Objects.equals(this.f3148o, n0Var.f3148o) && Objects.equals(this.f3149p, n0Var.f3149p) && Objects.equals(this.f3150q, n0Var.f3150q) && Objects.equals(this.f3151r, n0Var.f3151r) && Objects.equals(this.f3153t, n0Var.f3153t) && Objects.equals(this.f3154u, n0Var.f3154u) && Objects.equals(this.v, n0Var.v) && Objects.equals(this.f3155w, n0Var.f3155w) && Objects.equals(this.f3156x, n0Var.f3156x) && Objects.equals(this.f3157y, n0Var.f3157y) && Objects.equals(this.f3158z, n0Var.f3158z) && Objects.equals(this.A, n0Var.A) && Objects.equals(this.B, n0Var.B) && Objects.equals(this.C, n0Var.C) && Objects.equals(this.D, n0Var.D) && Objects.equals(this.E, n0Var.E) && Objects.equals(this.F, n0Var.F) && Objects.equals(this.G, n0Var.G) && Objects.equals(this.H, n0Var.H) && Objects.equals(this.J, n0Var.J)) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f3144k));
        if (this.I == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f3137a, this.f3138b, this.f3139c, this.d, this.e, this.f3140f, this.f3141g, this.h, this.f3142i, this.f3143j, valueOf, this.f3145l, this.f3146m, this.f3147n, this.f3148o, this.f3149p, this.f3150q, this.f3151r, this.f3153t, this.f3154u, this.v, this.f3155w, this.f3156x, this.f3157y, this.f3158z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(z10), this.J);
    }
}
