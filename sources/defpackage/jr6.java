package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
public final class jr6 {
    public static final jr6 M = new jr6(new hr6());
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
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public final CharSequence A;
    public final CharSequence B;
    public final CharSequence C;
    public final CharSequence D;
    public final Integer E;
    public final Integer F;
    public final CharSequence G;
    public final CharSequence H;
    public final CharSequence I;
    public final Integer J;
    public final Bundle K;
    public final mm5 L;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final fz8 i;
    public final fz8 j;
    public final byte[] k;
    public c31 l;
    public final Integer m;
    public final Uri n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Boolean r;
    public final Boolean s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final Integer z;

    static {
        String str = g8c.a;
        N = "0";
        O = "1";
        P = "2";
        Q = "3";
        R = "4";
        S = "5";
        T = "6";
        U = "8";
        V = "9";
        W = "a";
        X = "b";
        Y = "c";
        Z = "d";
        a0 = "e";
        b0 = "f";
        c0 = "g";
        d0 = "h";
        e0 = "i";
        f0 = "j";
        g0 = "k";
        h0 = "l";
        i0 = "m";
        j0 = "n";
        k0 = "o";
        l0 = "p";
        m0 = "q";
        n0 = "r";
        o0 = "s";
        p0 = "t";
        q0 = "u";
        r0 = "v";
        s0 = "w";
        t0 = "x";
        u0 = "y";
        v0 = "z";
        w0 = "rs";
    }

    public jr6(hr6 hr6Var) {
        Boolean bool = hr6Var.r;
        Integer num = hr6Var.q;
        Integer num2 = hr6Var.I;
        int i = 1;
        int i2 = 0;
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
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                num = Integer.valueOf(i2);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        }
        this.a = hr6Var.a;
        this.b = hr6Var.b;
        this.c = hr6Var.c;
        this.d = hr6Var.d;
        this.e = hr6Var.e;
        this.f = hr6Var.f;
        this.g = hr6Var.g;
        this.h = hr6Var.h;
        this.i = hr6Var.i;
        this.j = hr6Var.j;
        this.k = hr6Var.k;
        this.l = hr6Var.l;
        this.m = hr6Var.m;
        this.n = hr6Var.n;
        this.o = hr6Var.o;
        this.p = hr6Var.p;
        this.q = num;
        this.r = bool;
        this.s = hr6Var.s;
        Integer num3 = hr6Var.t;
        this.t = num3;
        this.u = num3;
        this.v = hr6Var.u;
        this.w = hr6Var.v;
        this.x = hr6Var.w;
        this.y = hr6Var.x;
        this.z = hr6Var.y;
        this.A = hr6Var.z;
        this.B = hr6Var.A;
        this.C = hr6Var.B;
        this.D = hr6Var.C;
        this.E = hr6Var.D;
        this.F = hr6Var.E;
        this.G = hr6Var.F;
        this.H = hr6Var.G;
        this.I = hr6Var.H;
        this.J = num2;
        this.L = hr6Var.K;
        this.K = hr6Var.J;
    }

    public static jr6 b(int i, Bundle bundle) {
        boolean z;
        Bundle bundle2;
        Bundle bundle3;
        Integer num;
        hr6 hr6Var = new hr6();
        hr6Var.a = bundle.getCharSequence(N);
        hr6Var.b = bundle.getCharSequence(O);
        hr6Var.c = bundle.getCharSequence(P);
        hr6Var.d = bundle.getCharSequence(Q);
        hr6Var.e = bundle.getCharSequence(R);
        hr6Var.f = bundle.getCharSequence(S);
        hr6Var.g = bundle.getCharSequence(T);
        hr6Var.n = (Uri) bundle.getParcelable(X);
        hr6Var.z = bundle.getCharSequence(i0);
        hr6Var.A = bundle.getCharSequence(j0);
        hr6Var.B = bundle.getCharSequence(k0);
        hr6Var.C = bundle.getCharSequence(v0);
        hr6Var.F = bundle.getCharSequence(n0);
        hr6Var.G = bundle.getCharSequence(o0);
        hr6Var.H = bundle.getCharSequence(q0);
        hr6Var.J = g8c.o(bundle.getBundle(w0));
        String str = W;
        if (bundle.containsKey(str)) {
            String str2 = p0;
            byte[] bArr = null;
            if (bundle.containsKey(str2)) {
                num = Integer.valueOf(bundle.getInt(str2));
            } else {
                num = null;
            }
            if (i >= 9) {
                Bundle bundle4 = bundle.getBundle(str);
                if (bundle4 != null) {
                    IBinder binder = bundle4.getBinder(c31.e);
                    if (binder != null) {
                        if (binder instanceof z21) {
                            int i2 = z21.b;
                            bArr = ((z21) binder).a.a;
                        } else if (Build.VERSION.SDK_INT < 27 || (bArr = a31.b(bundle4)) == null) {
                            bArr = b31.a(bundle4);
                        }
                    }
                    hr6Var.b(bArr, num);
                }
            } else {
                hr6Var.b(bundle.getByteArray(str), num);
            }
        }
        String str3 = U;
        if (bundle.containsKey(str3) && (bundle3 = bundle.getBundle(str3)) != null) {
            hr6Var.i = fz8.a(bundle3);
        }
        String str4 = V;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            hr6Var.j = fz8.a(bundle2);
        }
        String str5 = t0;
        if (bundle.containsKey(str5)) {
            long j = bundle.getLong(str5);
            Long valueOf = Long.valueOf(j);
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            gre.f(z);
            hr6Var.h = valueOf;
        }
        String str6 = Y;
        if (bundle.containsKey(str6)) {
            hr6Var.o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Z;
        if (bundle.containsKey(str7)) {
            hr6Var.p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = a0;
        if (bundle.containsKey(str8)) {
            hr6Var.q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = s0;
        if (bundle.containsKey(str9)) {
            hr6Var.r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = b0;
        if (bundle.containsKey(str10)) {
            hr6Var.s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = c0;
        if (bundle.containsKey(str11)) {
            hr6Var.t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = d0;
        if (bundle.containsKey(str12)) {
            hr6Var.u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = e0;
        if (bundle.containsKey(str13)) {
            hr6Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f0;
        if (bundle.containsKey(str14)) {
            hr6Var.w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = g0;
        if (bundle.containsKey(str15)) {
            hr6Var.x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = h0;
        if (bundle.containsKey(str16)) {
            hr6Var.y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = l0;
        if (bundle.containsKey(str17)) {
            hr6Var.D = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = m0;
        if (bundle.containsKey(str18)) {
            hr6Var.E = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = r0;
        if (bundle.containsKey(str19)) {
            hr6Var.I = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(u0);
        if (stringArrayList != null) {
            hr6Var.K = mm5.q(stringArrayList);
        }
        return new jr6(hr6Var);
    }

    public final hr6 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        obj.m = this.m;
        obj.n = this.n;
        obj.o = this.o;
        obj.p = this.p;
        obj.q = this.q;
        obj.r = this.r;
        obj.s = this.s;
        obj.t = this.u;
        obj.u = this.v;
        obj.v = this.w;
        obj.w = this.x;
        obj.x = this.y;
        obj.y = this.z;
        obj.z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.D = this.E;
        obj.C = this.D;
        obj.E = this.F;
        obj.F = this.G;
        obj.G = this.H;
        obj.H = this.I;
        obj.I = this.J;
        obj.K = this.L;
        obj.J = this.K;
        return obj;
    }

    public final Bundle c(int i) {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(N, charSequence);
        }
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            bundle.putCharSequence(O, charSequence2);
        }
        CharSequence charSequence3 = this.c;
        if (charSequence3 != null) {
            bundle.putCharSequence(P, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(Q, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(R, charSequence5);
        }
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null) {
            bundle.putCharSequence(S, charSequence6);
        }
        CharSequence charSequence7 = this.g;
        if (charSequence7 != null) {
            bundle.putCharSequence(T, charSequence7);
        }
        Long l = this.h;
        if (l != null) {
            bundle.putLong(t0, l.longValue());
        }
        byte[] bArr = this.k;
        if (bArr != null) {
            String str = W;
            if (i >= 9) {
                c31 c31Var = this.l;
                if (c31Var == null) {
                    c31Var = new c31(bArr);
                    this.l = c31Var;
                }
                byte[] bArr2 = c31Var.a;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(c31.e, c31Var.b);
                if (Build.VERSION.SDK_INT >= 27 && bArr2.length > 0) {
                    a31 a31Var = c31Var.c;
                    if (a31Var == null) {
                        a31Var = a31.a(bArr2);
                        c31Var.c = a31Var;
                    }
                    if (a31Var != null) {
                        bundle2.putParcelable(c31.f, a31Var.a);
                        bundle.putBundle(str, bundle2);
                    }
                }
                b31 b31Var = c31Var.d;
                if (b31Var == null) {
                    b31Var = new b31(bArr2);
                    c31Var.d = b31Var;
                }
                int i2 = b31.b;
                bundle2.putBinder(c31.g, b31Var.a);
                bundle.putBundle(str, bundle2);
            } else if (bArr.length <= 500000) {
                bundle.putByteArray(str, bArr);
            }
        }
        Uri uri = this.n;
        if (uri != null) {
            bundle.putParcelable(X, uri);
        }
        CharSequence charSequence8 = this.A;
        if (charSequence8 != null) {
            bundle.putCharSequence(i0, charSequence8);
        }
        CharSequence charSequence9 = this.B;
        if (charSequence9 != null) {
            bundle.putCharSequence(j0, charSequence9);
        }
        CharSequence charSequence10 = this.C;
        if (charSequence10 != null) {
            bundle.putCharSequence(k0, charSequence10);
        }
        CharSequence charSequence11 = this.G;
        if (charSequence11 != null) {
            bundle.putCharSequence(n0, charSequence11);
        }
        CharSequence charSequence12 = this.H;
        if (charSequence12 != null) {
            bundle.putCharSequence(o0, charSequence12);
        }
        CharSequence charSequence13 = this.I;
        if (charSequence13 != null) {
            bundle.putCharSequence(q0, charSequence13);
        }
        fz8 fz8Var = this.i;
        if (fz8Var != null) {
            bundle.putBundle(U, fz8Var.c());
        }
        fz8 fz8Var2 = this.j;
        if (fz8Var2 != null) {
            bundle.putBundle(V, fz8Var2.c());
        }
        Integer num = this.o;
        if (num != null) {
            bundle.putInt(Y, num.intValue());
        }
        Integer num2 = this.p;
        if (num2 != null) {
            bundle.putInt(Z, num2.intValue());
        }
        Integer num3 = this.q;
        if (num3 != null) {
            bundle.putInt(a0, num3.intValue());
        }
        Boolean bool = this.r;
        if (bool != null) {
            bundle.putBoolean(s0, bool.booleanValue());
        }
        Boolean bool2 = this.s;
        if (bool2 != null) {
            bundle.putBoolean(b0, bool2.booleanValue());
        }
        Integer num4 = this.u;
        if (num4 != null) {
            bundle.putInt(c0, num4.intValue());
        }
        Integer num5 = this.v;
        if (num5 != null) {
            bundle.putInt(d0, num5.intValue());
        }
        Integer num6 = this.w;
        if (num6 != null) {
            bundle.putInt(e0, num6.intValue());
        }
        Integer num7 = this.x;
        if (num7 != null) {
            bundle.putInt(f0, num7.intValue());
        }
        Integer num8 = this.y;
        if (num8 != null) {
            bundle.putInt(g0, num8.intValue());
        }
        Integer num9 = this.z;
        if (num9 != null) {
            bundle.putInt(h0, num9.intValue());
        }
        Integer num10 = this.E;
        if (num10 != null) {
            bundle.putInt(l0, num10.intValue());
        }
        CharSequence charSequence14 = this.D;
        if (charSequence14 != null) {
            bundle.putCharSequence(v0, charSequence14);
        }
        Integer num11 = this.F;
        if (num11 != null) {
            bundle.putInt(m0, num11.intValue());
        }
        Integer num12 = this.m;
        if (num12 != null) {
            bundle.putInt(p0, num12.intValue());
        }
        Integer num13 = this.J;
        if (num13 != null) {
            bundle.putInt(r0, num13.intValue());
        }
        mm5 mm5Var = this.L;
        if (!mm5Var.isEmpty()) {
            bundle.putStringArrayList(u0, new ArrayList<>(mm5Var));
        }
        Bundle bundle3 = this.K;
        if (bundle3 != null) {
            bundle.putBundle(w0, bundle3);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && jr6.class == obj.getClass()) {
            jr6 jr6Var = (jr6) obj;
            if (TextUtils.equals(this.a, jr6Var.a) && TextUtils.equals(this.b, jr6Var.b) && TextUtils.equals(this.c, jr6Var.c) && TextUtils.equals(this.d, jr6Var.d) && TextUtils.equals(this.e, jr6Var.e) && TextUtils.equals(this.f, jr6Var.f) && TextUtils.equals(this.g, jr6Var.g) && Objects.equals(this.h, jr6Var.h) && Objects.equals(this.i, jr6Var.i) && Objects.equals(this.j, jr6Var.j) && Arrays.equals(this.k, jr6Var.k) && Objects.equals(this.m, jr6Var.m) && Objects.equals(this.n, jr6Var.n) && Objects.equals(this.o, jr6Var.o) && Objects.equals(this.p, jr6Var.p) && Objects.equals(this.q, jr6Var.q) && Objects.equals(this.r, jr6Var.r) && Objects.equals(this.s, jr6Var.s) && Objects.equals(this.u, jr6Var.u) && Objects.equals(this.v, jr6Var.v) && Objects.equals(this.w, jr6Var.w) && Objects.equals(this.x, jr6Var.x) && Objects.equals(this.y, jr6Var.y) && Objects.equals(this.z, jr6Var.z) && TextUtils.equals(this.A, jr6Var.A) && TextUtils.equals(this.B, jr6Var.B) && TextUtils.equals(this.C, jr6Var.C) && TextUtils.equals(this.D, jr6Var.D) && Objects.equals(this.E, jr6Var.E) && Objects.equals(this.F, jr6Var.F) && TextUtils.equals(this.G, jr6Var.G) && TextUtils.equals(this.H, jr6Var.H) && TextUtils.equals(this.I, jr6Var.I) && Objects.equals(this.J, jr6Var.J) && Objects.equals(this.L, jr6Var.L)) {
                if (this.K == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (jr6Var.K == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z;
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.k));
        if (this.K == null) {
            z = true;
        } else {
            z = false;
        }
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, valueOf, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, Boolean.valueOf(z), this.L);
    }
}
