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
    public static final String f3122a0;
    public static final String f3123b0;
    public static final String f3124c0;
    public static final String f3125d0;
    public static final String f3126e0;
    public static final String f3127f0;
    public static final String f3128g0;
    public static final String f3129h0;
    public static final String f3130i0;
    public static final String f3131j0;
    public static final String f3132k0;
    public static final String f3133l0;
    public static final String m0;
    public static final String f3134n0;
    public static final String f3135o0;
    public static final String f3136p0;
    public static final String f3137q0;
    public static final String f3138r0;
    public static final String f3139s0;
    public static final String f3140t0;
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
    public final CharSequence f3141a;
    public final CharSequence f3142b;
    public final CharSequence f3143c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f3144f;
    public final CharSequence f3145g;
    public final Long h;
    public final c1 f3146i;
    public final c1 f3147j;
    public final byte[] f3148k;
    public final Integer f3149l;
    public final Uri f3150m;
    public final Integer f3151n;
    public final Integer f3152o;
    public final Integer f3153p;
    public final Boolean f3154q;
    public final Boolean f3155r;
    public final Integer f3156s;
    public final Integer f3157t;
    public final Integer f3158u;
    public final Integer v;
    public final Integer f3159w;
    public final Integer f3160x;
    public final Integer f3161y;
    public final CharSequence f3162z;

    static {
        String str = e2.d0.f7887a;
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
        f3122a0 = Integer.toString(16, 36);
        f3123b0 = Integer.toString(17, 36);
        f3124c0 = Integer.toString(18, 36);
        f3125d0 = Integer.toString(19, 36);
        f3126e0 = Integer.toString(20, 36);
        f3127f0 = Integer.toString(21, 36);
        f3128g0 = Integer.toString(22, 36);
        f3129h0 = Integer.toString(23, 36);
        f3130i0 = Integer.toString(24, 36);
        f3131j0 = Integer.toString(25, 36);
        f3132k0 = Integer.toString(26, 36);
        f3133l0 = Integer.toString(27, 36);
        m0 = Integer.toString(28, 36);
        f3134n0 = Integer.toString(29, 36);
        f3135o0 = Integer.toString(30, 36);
        f3136p0 = Integer.toString(31, 36);
        f3137q0 = Integer.toString(32, 36);
        f3138r0 = Integer.toString(33, 36);
        f3139s0 = Integer.toString(34, 36);
        f3140t0 = Integer.toString(1000, 36);
    }

    public n0(m0 m0Var) {
        Boolean bool = m0Var.f3107q;
        Integer num = m0Var.f3106p;
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
        this.f3141a = m0Var.f3094a;
        this.f3142b = m0Var.f3095b;
        this.f3143c = m0Var.f3096c;
        this.d = m0Var.d;
        this.e = m0Var.e;
        this.f3144f = m0Var.f3097f;
        this.f3145g = m0Var.f3098g;
        this.h = m0Var.h;
        this.f3146i = m0Var.f3099i;
        this.f3147j = m0Var.f3100j;
        this.f3148k = m0Var.f3101k;
        this.f3149l = m0Var.f3102l;
        this.f3150m = m0Var.f3103m;
        this.f3151n = m0Var.f3104n;
        this.f3152o = m0Var.f3105o;
        this.f3153p = num;
        this.f3154q = bool;
        this.f3155r = m0Var.f3108r;
        Integer num3 = m0Var.f3109s;
        this.f3156s = num3;
        this.f3157t = num3;
        this.f3158u = m0Var.f3110t;
        this.v = m0Var.f3111u;
        this.f3159w = m0Var.v;
        this.f3160x = m0Var.f3112w;
        this.f3161y = m0Var.f3113x;
        this.f3162z = m0Var.f3114y;
        this.A = m0Var.f3115z;
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
        m0Var.f3094a = bundle.getCharSequence(L);
        m0Var.f3095b = bundle.getCharSequence(M);
        m0Var.f3096c = bundle.getCharSequence(N);
        m0Var.d = bundle.getCharSequence(O);
        m0Var.e = bundle.getCharSequence(P);
        m0Var.f3097f = bundle.getCharSequence(Q);
        m0Var.f3098g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = f3134n0;
        byte[] bArr = null;
        if (bundle.containsKey(str)) {
            num = Integer.valueOf(bundle.getInt(str));
        } else {
            num = null;
        }
        if (byteArray != null) {
            bArr = (byte[]) byteArray.clone();
        }
        m0Var.f3101k = bArr;
        m0Var.f3102l = num;
        m0Var.f3103m = (Uri) bundle.getParcelable(V);
        m0Var.f3114y = bundle.getCharSequence(f3128g0);
        m0Var.f3115z = bundle.getCharSequence(f3129h0);
        m0Var.A = bundle.getCharSequence(f3130i0);
        m0Var.D = bundle.getCharSequence(f3133l0);
        m0Var.E = bundle.getCharSequence(m0);
        m0Var.F = bundle.getCharSequence(f3135o0);
        m0Var.H = bundle.getBundle(f3140t0);
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            m0Var.f3099i = c1.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            m0Var.f3100j = c1.a(bundle2);
        }
        String str4 = f3138r0;
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
            m0Var.f3104n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            m0Var.f3105o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            m0Var.f3106p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = f3137q0;
        if (bundle.containsKey(str8)) {
            m0Var.f3107q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            m0Var.f3108r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f3122a0;
        if (bundle.containsKey(str10)) {
            m0Var.f3109s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = f3123b0;
        if (bundle.containsKey(str11)) {
            m0Var.f3110t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f3124c0;
        if (bundle.containsKey(str12)) {
            m0Var.f3111u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f3125d0;
        if (bundle.containsKey(str13)) {
            m0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f3126e0;
        if (bundle.containsKey(str14)) {
            m0Var.f3112w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f3127f0;
        if (bundle.containsKey(str15)) {
            m0Var.f3113x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f3131j0;
        if (bundle.containsKey(str16)) {
            m0Var.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f3132k0;
        if (bundle.containsKey(str17)) {
            m0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f3136p0;
        if (bundle.containsKey(str18)) {
            m0Var.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f3139s0);
        if (stringArrayList != null) {
            m0Var.I = e9.i0.v(stringArrayList);
        }
        return new n0(m0Var);
    }

    public final m0 a() {
        ?? obj = new Object();
        obj.f3094a = this.f3141a;
        obj.f3095b = this.f3142b;
        obj.f3096c = this.f3143c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f3097f = this.f3144f;
        obj.f3098g = this.f3145g;
        obj.h = this.h;
        obj.f3099i = this.f3146i;
        obj.f3100j = this.f3147j;
        obj.f3101k = this.f3148k;
        obj.f3102l = this.f3149l;
        obj.f3103m = this.f3150m;
        obj.f3104n = this.f3151n;
        obj.f3105o = this.f3152o;
        obj.f3106p = this.f3153p;
        obj.f3107q = this.f3154q;
        obj.f3108r = this.f3155r;
        obj.f3109s = this.f3157t;
        obj.f3110t = this.f3158u;
        obj.f3111u = this.v;
        obj.v = this.f3159w;
        obj.f3112w = this.f3160x;
        obj.f3113x = this.f3161y;
        obj.f3114y = this.f3162z;
        obj.f3115z = this.A;
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
        CharSequence charSequence = this.f3141a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.f3142b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.f3143c;
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
        CharSequence charSequence6 = this.f3144f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.f3145g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l4 = this.h;
        if (l4 != null) {
            bundle.putLong(f3138r0, l4.longValue());
        }
        byte[] bArr = this.f3148k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.f3150m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.f3162z;
        if (charSequence8 != null) {
            bundle.putCharSequence(f3128g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(f3129h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(f3130i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(f3133l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(f3135o0, charSequence13);
        }
        c1 c1Var = this.f3146i;
        if (c1Var != null) {
            bundle.putBundle(S, c1Var.c());
        }
        c1 c1Var2 = this.f3147j;
        if (c1Var2 != null) {
            bundle.putBundle(T, c1Var2.c());
        }
        Integer num = this.f3151n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.f3152o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.f3153p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.f3154q;
        if (bool != null) {
            bundle.putBoolean(f3137q0, bool.booleanValue());
        }
        Boolean bool2 = this.f3155r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.f3157t;
        if (num4 != null) {
            bundle.putInt(f3122a0, num4.intValue());
        }
        Integer num5 = this.f3158u;
        if (num5 != null) {
            bundle.putInt(f3123b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(f3124c0, num6.intValue());
        }
        Integer num7 = this.f3159w;
        if (num7 != null) {
            bundle.putInt(f3125d0, num7.intValue());
        }
        Integer num8 = this.f3160x;
        if (num8 != null) {
            bundle.putInt(f3126e0, num8.intValue());
        }
        Integer num9 = this.f3161y;
        if (num9 != null) {
            bundle.putInt(f3127f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(f3131j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(f3132k0, num11.intValue());
        }
        Integer num12 = this.f3149l;
        if (num12 != null) {
            bundle.putInt(f3134n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(f3136p0, num13.intValue());
        }
        e9.i0 i0Var = this.J;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f3139s0, new ArrayList<>(i0Var));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(f3140t0, bundle2);
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
            if (Objects.equals(this.f3141a, n0Var.f3141a) && Objects.equals(this.f3142b, n0Var.f3142b) && Objects.equals(this.f3143c, n0Var.f3143c) && Objects.equals(this.d, n0Var.d) && Objects.equals(this.e, n0Var.e) && Objects.equals(this.f3144f, n0Var.f3144f) && Objects.equals(this.f3145g, n0Var.f3145g) && Objects.equals(this.h, n0Var.h) && Objects.equals(this.f3146i, n0Var.f3146i) && Objects.equals(this.f3147j, n0Var.f3147j) && Arrays.equals(this.f3148k, n0Var.f3148k) && Objects.equals(this.f3149l, n0Var.f3149l) && Objects.equals(this.f3150m, n0Var.f3150m) && Objects.equals(this.f3151n, n0Var.f3151n) && Objects.equals(this.f3152o, n0Var.f3152o) && Objects.equals(this.f3153p, n0Var.f3153p) && Objects.equals(this.f3154q, n0Var.f3154q) && Objects.equals(this.f3155r, n0Var.f3155r) && Objects.equals(this.f3157t, n0Var.f3157t) && Objects.equals(this.f3158u, n0Var.f3158u) && Objects.equals(this.v, n0Var.v) && Objects.equals(this.f3159w, n0Var.f3159w) && Objects.equals(this.f3160x, n0Var.f3160x) && Objects.equals(this.f3161y, n0Var.f3161y) && Objects.equals(this.f3162z, n0Var.f3162z) && Objects.equals(this.A, n0Var.A) && Objects.equals(this.B, n0Var.B) && Objects.equals(this.C, n0Var.C) && Objects.equals(this.D, n0Var.D) && Objects.equals(this.E, n0Var.E) && Objects.equals(this.F, n0Var.F) && Objects.equals(this.G, n0Var.G) && Objects.equals(this.H, n0Var.H) && Objects.equals(this.J, n0Var.J)) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f3148k));
        if (this.I == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f3141a, this.f3142b, this.f3143c, this.d, this.e, this.f3144f, this.f3145g, this.h, this.f3146i, this.f3147j, valueOf, this.f3149l, this.f3150m, this.f3151n, this.f3152o, this.f3153p, this.f3154q, this.f3155r, this.f3157t, this.f3158u, this.v, this.f3159w, this.f3160x, this.f3161y, this.f3162z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(z10), this.J);
    }
}
