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
    public static final String f3450a0;
    public static final String f3451b0;
    public static final String f3452c0;
    public static final String f3453d0;
    public static final String f3454e0;
    public static final String f3455f0;
    public static final String f3456g0;
    public static final String f3457h0;
    public static final String f3458i0;
    public static final String f3459j0;
    public static final String f3460k0;
    public static final String f3461l0;
    public static final String m0;
    public static final String f3462n0;
    public static final String f3463o0;
    public static final String f3464p0;
    public static final String f3465q0;
    public static final String f3466r0;
    public static final String f3467s0;
    public static final String f3468t0;
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
    public final CharSequence f3469a;
    public final CharSequence f3470b;
    public final CharSequence f3471c;
    public final CharSequence d;
    public final CharSequence f3472e;
    public final CharSequence f3473f;
    public final CharSequence f3474g;
    public final Long h;
    public final c1 f3475i;
    public final c1 f3476j;
    public final byte[] f3477k;
    public final Integer f3478l;
    public final Uri f3479m;
    public final Integer f3480n;
    public final Integer f3481o;
    public final Integer f3482p;
    public final Boolean f3483q;
    public final Boolean f3484r;
    public final Integer f3485s;
    public final Integer f3486t;
    public final Integer f3487u;
    public final Integer v;
    public final Integer f3488w;
    public final Integer f3489x;
    public final Integer f3490y;
    public final CharSequence f3491z;

    static {
        String str = e2.d0.f8532a;
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
        f3450a0 = Integer.toString(16, 36);
        f3451b0 = Integer.toString(17, 36);
        f3452c0 = Integer.toString(18, 36);
        f3453d0 = Integer.toString(19, 36);
        f3454e0 = Integer.toString(20, 36);
        f3455f0 = Integer.toString(21, 36);
        f3456g0 = Integer.toString(22, 36);
        f3457h0 = Integer.toString(23, 36);
        f3458i0 = Integer.toString(24, 36);
        f3459j0 = Integer.toString(25, 36);
        f3460k0 = Integer.toString(26, 36);
        f3461l0 = Integer.toString(27, 36);
        m0 = Integer.toString(28, 36);
        f3462n0 = Integer.toString(29, 36);
        f3463o0 = Integer.toString(30, 36);
        f3464p0 = Integer.toString(31, 36);
        f3465q0 = Integer.toString(32, 36);
        f3466r0 = Integer.toString(33, 36);
        f3467s0 = Integer.toString(34, 36);
        f3468t0 = Integer.toString(1000, 36);
    }

    public n0(m0 m0Var) {
        Boolean bool = m0Var.f3434q;
        Integer num = m0Var.f3433p;
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
        this.f3469a = m0Var.f3420a;
        this.f3470b = m0Var.f3421b;
        this.f3471c = m0Var.f3422c;
        this.d = m0Var.d;
        this.f3472e = m0Var.f3423e;
        this.f3473f = m0Var.f3424f;
        this.f3474g = m0Var.f3425g;
        this.h = m0Var.h;
        this.f3475i = m0Var.f3426i;
        this.f3476j = m0Var.f3427j;
        this.f3477k = m0Var.f3428k;
        this.f3478l = m0Var.f3429l;
        this.f3479m = m0Var.f3430m;
        this.f3480n = m0Var.f3431n;
        this.f3481o = m0Var.f3432o;
        this.f3482p = num;
        this.f3483q = bool;
        this.f3484r = m0Var.f3435r;
        Integer num3 = m0Var.f3436s;
        this.f3485s = num3;
        this.f3486t = num3;
        this.f3487u = m0Var.f3437t;
        this.v = m0Var.f3438u;
        this.f3488w = m0Var.v;
        this.f3489x = m0Var.f3439w;
        this.f3490y = m0Var.f3440x;
        this.f3491z = m0Var.f3441y;
        this.A = m0Var.f3442z;
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
        m0Var.f3420a = bundle.getCharSequence(L);
        m0Var.f3421b = bundle.getCharSequence(M);
        m0Var.f3422c = bundle.getCharSequence(N);
        m0Var.d = bundle.getCharSequence(O);
        m0Var.f3423e = bundle.getCharSequence(P);
        m0Var.f3424f = bundle.getCharSequence(Q);
        m0Var.f3425g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = f3462n0;
        byte[] bArr = null;
        if (bundle.containsKey(str)) {
            num = Integer.valueOf(bundle.getInt(str));
        } else {
            num = null;
        }
        if (byteArray != null) {
            bArr = (byte[]) byteArray.clone();
        }
        m0Var.f3428k = bArr;
        m0Var.f3429l = num;
        m0Var.f3430m = (Uri) bundle.getParcelable(V);
        m0Var.f3441y = bundle.getCharSequence(f3456g0);
        m0Var.f3442z = bundle.getCharSequence(f3457h0);
        m0Var.A = bundle.getCharSequence(f3458i0);
        m0Var.D = bundle.getCharSequence(f3461l0);
        m0Var.E = bundle.getCharSequence(m0);
        m0Var.F = bundle.getCharSequence(f3463o0);
        m0Var.H = bundle.getBundle(f3468t0);
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            m0Var.f3426i = c1.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            m0Var.f3427j = c1.a(bundle2);
        }
        String str4 = f3466r0;
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
            m0Var.f3431n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            m0Var.f3432o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            m0Var.f3433p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = f3465q0;
        if (bundle.containsKey(str8)) {
            m0Var.f3434q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            m0Var.f3435r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f3450a0;
        if (bundle.containsKey(str10)) {
            m0Var.f3436s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = f3451b0;
        if (bundle.containsKey(str11)) {
            m0Var.f3437t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f3452c0;
        if (bundle.containsKey(str12)) {
            m0Var.f3438u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f3453d0;
        if (bundle.containsKey(str13)) {
            m0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f3454e0;
        if (bundle.containsKey(str14)) {
            m0Var.f3439w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f3455f0;
        if (bundle.containsKey(str15)) {
            m0Var.f3440x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f3459j0;
        if (bundle.containsKey(str16)) {
            m0Var.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f3460k0;
        if (bundle.containsKey(str17)) {
            m0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f3464p0;
        if (bundle.containsKey(str18)) {
            m0Var.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f3467s0);
        if (stringArrayList != null) {
            m0Var.I = e9.i0.v(stringArrayList);
        }
        return new n0(m0Var);
    }

    public final m0 a() {
        ?? obj = new Object();
        obj.f3420a = this.f3469a;
        obj.f3421b = this.f3470b;
        obj.f3422c = this.f3471c;
        obj.d = this.d;
        obj.f3423e = this.f3472e;
        obj.f3424f = this.f3473f;
        obj.f3425g = this.f3474g;
        obj.h = this.h;
        obj.f3426i = this.f3475i;
        obj.f3427j = this.f3476j;
        obj.f3428k = this.f3477k;
        obj.f3429l = this.f3478l;
        obj.f3430m = this.f3479m;
        obj.f3431n = this.f3480n;
        obj.f3432o = this.f3481o;
        obj.f3433p = this.f3482p;
        obj.f3434q = this.f3483q;
        obj.f3435r = this.f3484r;
        obj.f3436s = this.f3486t;
        obj.f3437t = this.f3487u;
        obj.f3438u = this.v;
        obj.v = this.f3488w;
        obj.f3439w = this.f3489x;
        obj.f3440x = this.f3490y;
        obj.f3441y = this.f3491z;
        obj.f3442z = this.A;
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
        CharSequence charSequence = this.f3469a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.f3470b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.f3471c;
        if (charSequence3 != null) {
            bundle.putCharSequence(N, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(O, charSequence4);
        }
        CharSequence charSequence5 = this.f3472e;
        if (charSequence5 != null) {
            bundle.putCharSequence(P, charSequence5);
        }
        CharSequence charSequence6 = this.f3473f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.f3474g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l4 = this.h;
        if (l4 != null) {
            bundle.putLong(f3466r0, l4.longValue());
        }
        byte[] bArr = this.f3477k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.f3479m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.f3491z;
        if (charSequence8 != null) {
            bundle.putCharSequence(f3456g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(f3457h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(f3458i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(f3461l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(f3463o0, charSequence13);
        }
        c1 c1Var = this.f3475i;
        if (c1Var != null) {
            bundle.putBundle(S, c1Var.c());
        }
        c1 c1Var2 = this.f3476j;
        if (c1Var2 != null) {
            bundle.putBundle(T, c1Var2.c());
        }
        Integer num = this.f3480n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.f3481o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.f3482p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.f3483q;
        if (bool != null) {
            bundle.putBoolean(f3465q0, bool.booleanValue());
        }
        Boolean bool2 = this.f3484r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.f3486t;
        if (num4 != null) {
            bundle.putInt(f3450a0, num4.intValue());
        }
        Integer num5 = this.f3487u;
        if (num5 != null) {
            bundle.putInt(f3451b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(f3452c0, num6.intValue());
        }
        Integer num7 = this.f3488w;
        if (num7 != null) {
            bundle.putInt(f3453d0, num7.intValue());
        }
        Integer num8 = this.f3489x;
        if (num8 != null) {
            bundle.putInt(f3454e0, num8.intValue());
        }
        Integer num9 = this.f3490y;
        if (num9 != null) {
            bundle.putInt(f3455f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(f3459j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(f3460k0, num11.intValue());
        }
        Integer num12 = this.f3478l;
        if (num12 != null) {
            bundle.putInt(f3462n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(f3464p0, num13.intValue());
        }
        e9.i0 i0Var = this.J;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f3467s0, new ArrayList<>(i0Var));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(f3468t0, bundle2);
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
            if (Objects.equals(this.f3469a, n0Var.f3469a) && Objects.equals(this.f3470b, n0Var.f3470b) && Objects.equals(this.f3471c, n0Var.f3471c) && Objects.equals(this.d, n0Var.d) && Objects.equals(this.f3472e, n0Var.f3472e) && Objects.equals(this.f3473f, n0Var.f3473f) && Objects.equals(this.f3474g, n0Var.f3474g) && Objects.equals(this.h, n0Var.h) && Objects.equals(this.f3475i, n0Var.f3475i) && Objects.equals(this.f3476j, n0Var.f3476j) && Arrays.equals(this.f3477k, n0Var.f3477k) && Objects.equals(this.f3478l, n0Var.f3478l) && Objects.equals(this.f3479m, n0Var.f3479m) && Objects.equals(this.f3480n, n0Var.f3480n) && Objects.equals(this.f3481o, n0Var.f3481o) && Objects.equals(this.f3482p, n0Var.f3482p) && Objects.equals(this.f3483q, n0Var.f3483q) && Objects.equals(this.f3484r, n0Var.f3484r) && Objects.equals(this.f3486t, n0Var.f3486t) && Objects.equals(this.f3487u, n0Var.f3487u) && Objects.equals(this.v, n0Var.v) && Objects.equals(this.f3488w, n0Var.f3488w) && Objects.equals(this.f3489x, n0Var.f3489x) && Objects.equals(this.f3490y, n0Var.f3490y) && Objects.equals(this.f3491z, n0Var.f3491z) && Objects.equals(this.A, n0Var.A) && Objects.equals(this.B, n0Var.B) && Objects.equals(this.C, n0Var.C) && Objects.equals(this.D, n0Var.D) && Objects.equals(this.E, n0Var.E) && Objects.equals(this.F, n0Var.F) && Objects.equals(this.G, n0Var.G) && Objects.equals(this.H, n0Var.H) && Objects.equals(this.J, n0Var.J)) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f3477k));
        if (this.I == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f3469a, this.f3470b, this.f3471c, this.d, this.f3472e, this.f3473f, this.f3474g, this.h, this.f3475i, this.f3476j, valueOf, this.f3478l, this.f3479m, this.f3480n, this.f3481o, this.f3482p, this.f3483q, this.f3484r, this.f3486t, this.f3487u, this.v, this.f3488w, this.f3489x, this.f3490y, this.f3491z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(z10), this.J);
    }
}
