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
    public static final String f3123a0;
    public static final String f3124b0;
    public static final String f3125c0;
    public static final String f3126d0;
    public static final String f3127e0;
    public static final String f3128f0;
    public static final String f3129g0;
    public static final String f3130h0;
    public static final String f3131i0;
    public static final String f3132j0;
    public static final String f3133k0;
    public static final String f3134l0;
    public static final String m0;
    public static final String f3135n0;
    public static final String f3136o0;
    public static final String f3137p0;
    public static final String f3138q0;
    public static final String f3139r0;
    public static final String f3140s0;
    public static final String f3141t0;
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
    public final CharSequence f3142a;
    public final CharSequence f3143b;
    public final CharSequence f3144c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f3145f;
    public final CharSequence f3146g;
    public final Long h;
    public final c1 f3147i;
    public final c1 f3148j;
    public final byte[] f3149k;
    public final Integer f3150l;
    public final Uri f3151m;
    public final Integer f3152n;
    public final Integer f3153o;
    public final Integer f3154p;
    public final Boolean f3155q;
    public final Boolean f3156r;
    public final Integer f3157s;
    public final Integer f3158t;
    public final Integer f3159u;
    public final Integer v;
    public final Integer f3160w;
    public final Integer f3161x;
    public final Integer f3162y;
    public final CharSequence f3163z;

    static {
        String str = e2.d0.f7888a;
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
        f3123a0 = Integer.toString(16, 36);
        f3124b0 = Integer.toString(17, 36);
        f3125c0 = Integer.toString(18, 36);
        f3126d0 = Integer.toString(19, 36);
        f3127e0 = Integer.toString(20, 36);
        f3128f0 = Integer.toString(21, 36);
        f3129g0 = Integer.toString(22, 36);
        f3130h0 = Integer.toString(23, 36);
        f3131i0 = Integer.toString(24, 36);
        f3132j0 = Integer.toString(25, 36);
        f3133k0 = Integer.toString(26, 36);
        f3134l0 = Integer.toString(27, 36);
        m0 = Integer.toString(28, 36);
        f3135n0 = Integer.toString(29, 36);
        f3136o0 = Integer.toString(30, 36);
        f3137p0 = Integer.toString(31, 36);
        f3138q0 = Integer.toString(32, 36);
        f3139r0 = Integer.toString(33, 36);
        f3140s0 = Integer.toString(34, 36);
        f3141t0 = Integer.toString(1000, 36);
    }

    public n0(m0 m0Var) {
        Boolean bool = m0Var.f3108q;
        Integer num = m0Var.f3107p;
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
        this.f3142a = m0Var.f3095a;
        this.f3143b = m0Var.f3096b;
        this.f3144c = m0Var.f3097c;
        this.d = m0Var.d;
        this.e = m0Var.e;
        this.f3145f = m0Var.f3098f;
        this.f3146g = m0Var.f3099g;
        this.h = m0Var.h;
        this.f3147i = m0Var.f3100i;
        this.f3148j = m0Var.f3101j;
        this.f3149k = m0Var.f3102k;
        this.f3150l = m0Var.f3103l;
        this.f3151m = m0Var.f3104m;
        this.f3152n = m0Var.f3105n;
        this.f3153o = m0Var.f3106o;
        this.f3154p = num;
        this.f3155q = bool;
        this.f3156r = m0Var.f3109r;
        Integer num3 = m0Var.f3110s;
        this.f3157s = num3;
        this.f3158t = num3;
        this.f3159u = m0Var.f3111t;
        this.v = m0Var.f3112u;
        this.f3160w = m0Var.v;
        this.f3161x = m0Var.f3113w;
        this.f3162y = m0Var.f3114x;
        this.f3163z = m0Var.f3115y;
        this.A = m0Var.f3116z;
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
        m0Var.f3095a = bundle.getCharSequence(L);
        m0Var.f3096b = bundle.getCharSequence(M);
        m0Var.f3097c = bundle.getCharSequence(N);
        m0Var.d = bundle.getCharSequence(O);
        m0Var.e = bundle.getCharSequence(P);
        m0Var.f3098f = bundle.getCharSequence(Q);
        m0Var.f3099g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = f3135n0;
        byte[] bArr = null;
        if (bundle.containsKey(str)) {
            num = Integer.valueOf(bundle.getInt(str));
        } else {
            num = null;
        }
        if (byteArray != null) {
            bArr = (byte[]) byteArray.clone();
        }
        m0Var.f3102k = bArr;
        m0Var.f3103l = num;
        m0Var.f3104m = (Uri) bundle.getParcelable(V);
        m0Var.f3115y = bundle.getCharSequence(f3129g0);
        m0Var.f3116z = bundle.getCharSequence(f3130h0);
        m0Var.A = bundle.getCharSequence(f3131i0);
        m0Var.D = bundle.getCharSequence(f3134l0);
        m0Var.E = bundle.getCharSequence(m0);
        m0Var.F = bundle.getCharSequence(f3136o0);
        m0Var.H = bundle.getBundle(f3141t0);
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            m0Var.f3100i = c1.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            m0Var.f3101j = c1.a(bundle2);
        }
        String str4 = f3139r0;
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
            m0Var.f3105n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            m0Var.f3106o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            m0Var.f3107p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = f3138q0;
        if (bundle.containsKey(str8)) {
            m0Var.f3108q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            m0Var.f3109r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f3123a0;
        if (bundle.containsKey(str10)) {
            m0Var.f3110s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = f3124b0;
        if (bundle.containsKey(str11)) {
            m0Var.f3111t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f3125c0;
        if (bundle.containsKey(str12)) {
            m0Var.f3112u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f3126d0;
        if (bundle.containsKey(str13)) {
            m0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f3127e0;
        if (bundle.containsKey(str14)) {
            m0Var.f3113w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f3128f0;
        if (bundle.containsKey(str15)) {
            m0Var.f3114x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f3132j0;
        if (bundle.containsKey(str16)) {
            m0Var.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f3133k0;
        if (bundle.containsKey(str17)) {
            m0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f3137p0;
        if (bundle.containsKey(str18)) {
            m0Var.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f3140s0);
        if (stringArrayList != null) {
            m0Var.I = e9.i0.v(stringArrayList);
        }
        return new n0(m0Var);
    }

    public final m0 a() {
        ?? obj = new Object();
        obj.f3095a = this.f3142a;
        obj.f3096b = this.f3143b;
        obj.f3097c = this.f3144c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f3098f = this.f3145f;
        obj.f3099g = this.f3146g;
        obj.h = this.h;
        obj.f3100i = this.f3147i;
        obj.f3101j = this.f3148j;
        obj.f3102k = this.f3149k;
        obj.f3103l = this.f3150l;
        obj.f3104m = this.f3151m;
        obj.f3105n = this.f3152n;
        obj.f3106o = this.f3153o;
        obj.f3107p = this.f3154p;
        obj.f3108q = this.f3155q;
        obj.f3109r = this.f3156r;
        obj.f3110s = this.f3158t;
        obj.f3111t = this.f3159u;
        obj.f3112u = this.v;
        obj.v = this.f3160w;
        obj.f3113w = this.f3161x;
        obj.f3114x = this.f3162y;
        obj.f3115y = this.f3163z;
        obj.f3116z = this.A;
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
        CharSequence charSequence = this.f3142a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.f3143b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.f3144c;
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
        CharSequence charSequence6 = this.f3145f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.f3146g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l4 = this.h;
        if (l4 != null) {
            bundle.putLong(f3139r0, l4.longValue());
        }
        byte[] bArr = this.f3149k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.f3151m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.f3163z;
        if (charSequence8 != null) {
            bundle.putCharSequence(f3129g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(f3130h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(f3131i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(f3134l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(f3136o0, charSequence13);
        }
        c1 c1Var = this.f3147i;
        if (c1Var != null) {
            bundle.putBundle(S, c1Var.c());
        }
        c1 c1Var2 = this.f3148j;
        if (c1Var2 != null) {
            bundle.putBundle(T, c1Var2.c());
        }
        Integer num = this.f3152n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.f3153o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.f3154p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.f3155q;
        if (bool != null) {
            bundle.putBoolean(f3138q0, bool.booleanValue());
        }
        Boolean bool2 = this.f3156r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.f3158t;
        if (num4 != null) {
            bundle.putInt(f3123a0, num4.intValue());
        }
        Integer num5 = this.f3159u;
        if (num5 != null) {
            bundle.putInt(f3124b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(f3125c0, num6.intValue());
        }
        Integer num7 = this.f3160w;
        if (num7 != null) {
            bundle.putInt(f3126d0, num7.intValue());
        }
        Integer num8 = this.f3161x;
        if (num8 != null) {
            bundle.putInt(f3127e0, num8.intValue());
        }
        Integer num9 = this.f3162y;
        if (num9 != null) {
            bundle.putInt(f3128f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(f3132j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(f3133k0, num11.intValue());
        }
        Integer num12 = this.f3150l;
        if (num12 != null) {
            bundle.putInt(f3135n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(f3137p0, num13.intValue());
        }
        e9.i0 i0Var = this.J;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f3140s0, new ArrayList<>(i0Var));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(f3141t0, bundle2);
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
            if (Objects.equals(this.f3142a, n0Var.f3142a) && Objects.equals(this.f3143b, n0Var.f3143b) && Objects.equals(this.f3144c, n0Var.f3144c) && Objects.equals(this.d, n0Var.d) && Objects.equals(this.e, n0Var.e) && Objects.equals(this.f3145f, n0Var.f3145f) && Objects.equals(this.f3146g, n0Var.f3146g) && Objects.equals(this.h, n0Var.h) && Objects.equals(this.f3147i, n0Var.f3147i) && Objects.equals(this.f3148j, n0Var.f3148j) && Arrays.equals(this.f3149k, n0Var.f3149k) && Objects.equals(this.f3150l, n0Var.f3150l) && Objects.equals(this.f3151m, n0Var.f3151m) && Objects.equals(this.f3152n, n0Var.f3152n) && Objects.equals(this.f3153o, n0Var.f3153o) && Objects.equals(this.f3154p, n0Var.f3154p) && Objects.equals(this.f3155q, n0Var.f3155q) && Objects.equals(this.f3156r, n0Var.f3156r) && Objects.equals(this.f3158t, n0Var.f3158t) && Objects.equals(this.f3159u, n0Var.f3159u) && Objects.equals(this.v, n0Var.v) && Objects.equals(this.f3160w, n0Var.f3160w) && Objects.equals(this.f3161x, n0Var.f3161x) && Objects.equals(this.f3162y, n0Var.f3162y) && Objects.equals(this.f3163z, n0Var.f3163z) && Objects.equals(this.A, n0Var.A) && Objects.equals(this.B, n0Var.B) && Objects.equals(this.C, n0Var.C) && Objects.equals(this.D, n0Var.D) && Objects.equals(this.E, n0Var.E) && Objects.equals(this.F, n0Var.F) && Objects.equals(this.G, n0Var.G) && Objects.equals(this.H, n0Var.H) && Objects.equals(this.J, n0Var.J)) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f3149k));
        if (this.I == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f3142a, this.f3143b, this.f3144c, this.d, this.e, this.f3145f, this.f3146g, this.h, this.f3147i, this.f3148j, valueOf, this.f3150l, this.f3151m, this.f3152n, this.f3153o, this.f3154p, this.f3155q, this.f3156r, this.f3158t, this.f3159u, this.v, this.f3160w, this.f3161x, this.f3162y, this.f3163z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(z10), this.J);
    }
}
