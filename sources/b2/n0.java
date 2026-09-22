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
    public static final String f3120a0;
    public static final String f3121b0;
    public static final String f3122c0;
    public static final String f3123d0;
    public static final String f3124e0;
    public static final String f3125f0;
    public static final String f3126g0;
    public static final String f3127h0;
    public static final String f3128i0;
    public static final String f3129j0;
    public static final String f3130k0;
    public static final String f3131l0;
    public static final String m0;
    public static final String f3132n0;
    public static final String f3133o0;
    public static final String f3134p0;
    public static final String f3135q0;
    public static final String f3136r0;
    public static final String f3137s0;
    public static final String f3138t0;
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
    public final CharSequence f3139a;
    public final CharSequence f3140b;
    public final CharSequence f3141c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f3142f;
    public final CharSequence f3143g;
    public final Long h;
    public final c1 f3144i;
    public final c1 f3145j;
    public final byte[] f3146k;
    public final Integer f3147l;
    public final Uri f3148m;
    public final Integer f3149n;
    public final Integer f3150o;
    public final Integer f3151p;
    public final Boolean f3152q;
    public final Boolean f3153r;
    public final Integer f3154s;
    public final Integer f3155t;
    public final Integer f3156u;
    public final Integer v;
    public final Integer f3157w;
    public final Integer f3158x;
    public final Integer f3159y;
    public final CharSequence f3160z;

    static {
        String str = e2.d0.f7885a;
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
        f3120a0 = Integer.toString(16, 36);
        f3121b0 = Integer.toString(17, 36);
        f3122c0 = Integer.toString(18, 36);
        f3123d0 = Integer.toString(19, 36);
        f3124e0 = Integer.toString(20, 36);
        f3125f0 = Integer.toString(21, 36);
        f3126g0 = Integer.toString(22, 36);
        f3127h0 = Integer.toString(23, 36);
        f3128i0 = Integer.toString(24, 36);
        f3129j0 = Integer.toString(25, 36);
        f3130k0 = Integer.toString(26, 36);
        f3131l0 = Integer.toString(27, 36);
        m0 = Integer.toString(28, 36);
        f3132n0 = Integer.toString(29, 36);
        f3133o0 = Integer.toString(30, 36);
        f3134p0 = Integer.toString(31, 36);
        f3135q0 = Integer.toString(32, 36);
        f3136r0 = Integer.toString(33, 36);
        f3137s0 = Integer.toString(34, 36);
        f3138t0 = Integer.toString(1000, 36);
    }

    public n0(m0 m0Var) {
        Boolean bool = m0Var.f3105q;
        Integer num = m0Var.f3104p;
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
        this.f3139a = m0Var.f3092a;
        this.f3140b = m0Var.f3093b;
        this.f3141c = m0Var.f3094c;
        this.d = m0Var.d;
        this.e = m0Var.e;
        this.f3142f = m0Var.f3095f;
        this.f3143g = m0Var.f3096g;
        this.h = m0Var.h;
        this.f3144i = m0Var.f3097i;
        this.f3145j = m0Var.f3098j;
        this.f3146k = m0Var.f3099k;
        this.f3147l = m0Var.f3100l;
        this.f3148m = m0Var.f3101m;
        this.f3149n = m0Var.f3102n;
        this.f3150o = m0Var.f3103o;
        this.f3151p = num;
        this.f3152q = bool;
        this.f3153r = m0Var.f3106r;
        Integer num3 = m0Var.f3107s;
        this.f3154s = num3;
        this.f3155t = num3;
        this.f3156u = m0Var.f3108t;
        this.v = m0Var.f3109u;
        this.f3157w = m0Var.v;
        this.f3158x = m0Var.f3110w;
        this.f3159y = m0Var.f3111x;
        this.f3160z = m0Var.f3112y;
        this.A = m0Var.f3113z;
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
        m0Var.f3092a = bundle.getCharSequence(L);
        m0Var.f3093b = bundle.getCharSequence(M);
        m0Var.f3094c = bundle.getCharSequence(N);
        m0Var.d = bundle.getCharSequence(O);
        m0Var.e = bundle.getCharSequence(P);
        m0Var.f3095f = bundle.getCharSequence(Q);
        m0Var.f3096g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = f3132n0;
        byte[] bArr = null;
        if (bundle.containsKey(str)) {
            num = Integer.valueOf(bundle.getInt(str));
        } else {
            num = null;
        }
        if (byteArray != null) {
            bArr = (byte[]) byteArray.clone();
        }
        m0Var.f3099k = bArr;
        m0Var.f3100l = num;
        m0Var.f3101m = (Uri) bundle.getParcelable(V);
        m0Var.f3112y = bundle.getCharSequence(f3126g0);
        m0Var.f3113z = bundle.getCharSequence(f3127h0);
        m0Var.A = bundle.getCharSequence(f3128i0);
        m0Var.D = bundle.getCharSequence(f3131l0);
        m0Var.E = bundle.getCharSequence(m0);
        m0Var.F = bundle.getCharSequence(f3133o0);
        m0Var.H = bundle.getBundle(f3138t0);
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            m0Var.f3097i = c1.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            m0Var.f3098j = c1.a(bundle2);
        }
        String str4 = f3136r0;
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
            m0Var.f3102n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            m0Var.f3103o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            m0Var.f3104p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = f3135q0;
        if (bundle.containsKey(str8)) {
            m0Var.f3105q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            m0Var.f3106r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f3120a0;
        if (bundle.containsKey(str10)) {
            m0Var.f3107s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = f3121b0;
        if (bundle.containsKey(str11)) {
            m0Var.f3108t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f3122c0;
        if (bundle.containsKey(str12)) {
            m0Var.f3109u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f3123d0;
        if (bundle.containsKey(str13)) {
            m0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f3124e0;
        if (bundle.containsKey(str14)) {
            m0Var.f3110w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f3125f0;
        if (bundle.containsKey(str15)) {
            m0Var.f3111x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f3129j0;
        if (bundle.containsKey(str16)) {
            m0Var.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f3130k0;
        if (bundle.containsKey(str17)) {
            m0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f3134p0;
        if (bundle.containsKey(str18)) {
            m0Var.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f3137s0);
        if (stringArrayList != null) {
            m0Var.I = e9.i0.v(stringArrayList);
        }
        return new n0(m0Var);
    }

    public final m0 a() {
        ?? obj = new Object();
        obj.f3092a = this.f3139a;
        obj.f3093b = this.f3140b;
        obj.f3094c = this.f3141c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f3095f = this.f3142f;
        obj.f3096g = this.f3143g;
        obj.h = this.h;
        obj.f3097i = this.f3144i;
        obj.f3098j = this.f3145j;
        obj.f3099k = this.f3146k;
        obj.f3100l = this.f3147l;
        obj.f3101m = this.f3148m;
        obj.f3102n = this.f3149n;
        obj.f3103o = this.f3150o;
        obj.f3104p = this.f3151p;
        obj.f3105q = this.f3152q;
        obj.f3106r = this.f3153r;
        obj.f3107s = this.f3155t;
        obj.f3108t = this.f3156u;
        obj.f3109u = this.v;
        obj.v = this.f3157w;
        obj.f3110w = this.f3158x;
        obj.f3111x = this.f3159y;
        obj.f3112y = this.f3160z;
        obj.f3113z = this.A;
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
        CharSequence charSequence = this.f3139a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.f3140b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.f3141c;
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
        CharSequence charSequence6 = this.f3142f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.f3143g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l4 = this.h;
        if (l4 != null) {
            bundle.putLong(f3136r0, l4.longValue());
        }
        byte[] bArr = this.f3146k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.f3148m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.f3160z;
        if (charSequence8 != null) {
            bundle.putCharSequence(f3126g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(f3127h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(f3128i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(f3131l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(f3133o0, charSequence13);
        }
        c1 c1Var = this.f3144i;
        if (c1Var != null) {
            bundle.putBundle(S, c1Var.c());
        }
        c1 c1Var2 = this.f3145j;
        if (c1Var2 != null) {
            bundle.putBundle(T, c1Var2.c());
        }
        Integer num = this.f3149n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.f3150o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.f3151p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.f3152q;
        if (bool != null) {
            bundle.putBoolean(f3135q0, bool.booleanValue());
        }
        Boolean bool2 = this.f3153r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.f3155t;
        if (num4 != null) {
            bundle.putInt(f3120a0, num4.intValue());
        }
        Integer num5 = this.f3156u;
        if (num5 != null) {
            bundle.putInt(f3121b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(f3122c0, num6.intValue());
        }
        Integer num7 = this.f3157w;
        if (num7 != null) {
            bundle.putInt(f3123d0, num7.intValue());
        }
        Integer num8 = this.f3158x;
        if (num8 != null) {
            bundle.putInt(f3124e0, num8.intValue());
        }
        Integer num9 = this.f3159y;
        if (num9 != null) {
            bundle.putInt(f3125f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(f3129j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(f3130k0, num11.intValue());
        }
        Integer num12 = this.f3147l;
        if (num12 != null) {
            bundle.putInt(f3132n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(f3134p0, num13.intValue());
        }
        e9.i0 i0Var = this.J;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f3137s0, new ArrayList<>(i0Var));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(f3138t0, bundle2);
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
            if (Objects.equals(this.f3139a, n0Var.f3139a) && Objects.equals(this.f3140b, n0Var.f3140b) && Objects.equals(this.f3141c, n0Var.f3141c) && Objects.equals(this.d, n0Var.d) && Objects.equals(this.e, n0Var.e) && Objects.equals(this.f3142f, n0Var.f3142f) && Objects.equals(this.f3143g, n0Var.f3143g) && Objects.equals(this.h, n0Var.h) && Objects.equals(this.f3144i, n0Var.f3144i) && Objects.equals(this.f3145j, n0Var.f3145j) && Arrays.equals(this.f3146k, n0Var.f3146k) && Objects.equals(this.f3147l, n0Var.f3147l) && Objects.equals(this.f3148m, n0Var.f3148m) && Objects.equals(this.f3149n, n0Var.f3149n) && Objects.equals(this.f3150o, n0Var.f3150o) && Objects.equals(this.f3151p, n0Var.f3151p) && Objects.equals(this.f3152q, n0Var.f3152q) && Objects.equals(this.f3153r, n0Var.f3153r) && Objects.equals(this.f3155t, n0Var.f3155t) && Objects.equals(this.f3156u, n0Var.f3156u) && Objects.equals(this.v, n0Var.v) && Objects.equals(this.f3157w, n0Var.f3157w) && Objects.equals(this.f3158x, n0Var.f3158x) && Objects.equals(this.f3159y, n0Var.f3159y) && Objects.equals(this.f3160z, n0Var.f3160z) && Objects.equals(this.A, n0Var.A) && Objects.equals(this.B, n0Var.B) && Objects.equals(this.C, n0Var.C) && Objects.equals(this.D, n0Var.D) && Objects.equals(this.E, n0Var.E) && Objects.equals(this.F, n0Var.F) && Objects.equals(this.G, n0Var.G) && Objects.equals(this.H, n0Var.H) && Objects.equals(this.J, n0Var.J)) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f3146k));
        if (this.I == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f3139a, this.f3140b, this.f3141c, this.d, this.e, this.f3142f, this.f3143g, this.h, this.f3144i, this.f3145j, valueOf, this.f3147l, this.f3148m, this.f3149n, this.f3150o, this.f3151p, this.f3152q, this.f3153r, this.f3155t, this.f3156u, this.v, this.f3157w, this.f3158x, this.f3159y, this.f3160z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(z10), this.J);
    }
}
