package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
public final class jt6 {
    public static final jt6 M = new jt6(new ht6());
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
    public final mo5 L;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final g19 i;
    public final g19 j;
    public final byte[] k;
    public k41 l;
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
        String str = hac.a;
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

    public jt6(ht6 ht6Var) {
        Boolean bool = ht6Var.r;
        Integer num = ht6Var.q;
        Integer num2 = ht6Var.I;
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
        this.a = ht6Var.a;
        this.b = ht6Var.b;
        this.c = ht6Var.c;
        this.d = ht6Var.d;
        this.e = ht6Var.e;
        this.f = ht6Var.f;
        this.g = ht6Var.g;
        this.h = ht6Var.h;
        this.i = ht6Var.i;
        this.j = ht6Var.j;
        this.k = ht6Var.k;
        this.l = ht6Var.l;
        this.m = ht6Var.m;
        this.n = ht6Var.n;
        this.o = ht6Var.o;
        this.p = ht6Var.p;
        this.q = num;
        this.r = bool;
        this.s = ht6Var.s;
        Integer num3 = ht6Var.t;
        this.t = num3;
        this.u = num3;
        this.v = ht6Var.u;
        this.w = ht6Var.v;
        this.x = ht6Var.w;
        this.y = ht6Var.x;
        this.z = ht6Var.y;
        this.A = ht6Var.z;
        this.B = ht6Var.A;
        this.C = ht6Var.B;
        this.D = ht6Var.C;
        this.E = ht6Var.D;
        this.F = ht6Var.E;
        this.G = ht6Var.F;
        this.H = ht6Var.G;
        this.I = ht6Var.H;
        this.J = num2;
        this.L = ht6Var.K;
        this.K = ht6Var.J;
    }

    public static jt6 b(int i, Bundle bundle) {
        boolean z;
        Bundle bundle2;
        Bundle bundle3;
        Integer num;
        ht6 ht6Var = new ht6();
        ht6Var.a = bundle.getCharSequence(N);
        ht6Var.b = bundle.getCharSequence(O);
        ht6Var.c = bundle.getCharSequence(P);
        ht6Var.d = bundle.getCharSequence(Q);
        ht6Var.e = bundle.getCharSequence(R);
        ht6Var.f = bundle.getCharSequence(S);
        ht6Var.g = bundle.getCharSequence(T);
        ht6Var.n = (Uri) bundle.getParcelable(X);
        ht6Var.z = bundle.getCharSequence(i0);
        ht6Var.A = bundle.getCharSequence(j0);
        ht6Var.B = bundle.getCharSequence(k0);
        ht6Var.C = bundle.getCharSequence(v0);
        ht6Var.F = bundle.getCharSequence(n0);
        ht6Var.G = bundle.getCharSequence(o0);
        ht6Var.H = bundle.getCharSequence(q0);
        ht6Var.J = hac.o(bundle.getBundle(w0));
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
                    IBinder binder = bundle4.getBinder(k41.e);
                    if (binder != null) {
                        if (binder instanceof h41) {
                            int i2 = h41.b;
                            bArr = ((h41) binder).a.a;
                        } else if (Build.VERSION.SDK_INT < 27 || (bArr = i41.b(bundle4)) == null) {
                            bArr = j41.a(bundle4);
                        }
                    }
                    ht6Var.b(bArr, num);
                }
            } else {
                ht6Var.b(bundle.getByteArray(str), num);
            }
        }
        String str3 = U;
        if (bundle.containsKey(str3) && (bundle3 = bundle.getBundle(str3)) != null) {
            ht6Var.i = g19.a(bundle3);
        }
        String str4 = V;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            ht6Var.j = g19.a(bundle2);
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
            jte.f(z);
            ht6Var.h = valueOf;
        }
        String str6 = Y;
        if (bundle.containsKey(str6)) {
            ht6Var.o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Z;
        if (bundle.containsKey(str7)) {
            ht6Var.p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = a0;
        if (bundle.containsKey(str8)) {
            ht6Var.q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = s0;
        if (bundle.containsKey(str9)) {
            ht6Var.r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = b0;
        if (bundle.containsKey(str10)) {
            ht6Var.s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = c0;
        if (bundle.containsKey(str11)) {
            ht6Var.t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = d0;
        if (bundle.containsKey(str12)) {
            ht6Var.u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = e0;
        if (bundle.containsKey(str13)) {
            ht6Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f0;
        if (bundle.containsKey(str14)) {
            ht6Var.w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = g0;
        if (bundle.containsKey(str15)) {
            ht6Var.x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = h0;
        if (bundle.containsKey(str16)) {
            ht6Var.y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = l0;
        if (bundle.containsKey(str17)) {
            ht6Var.D = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = m0;
        if (bundle.containsKey(str18)) {
            ht6Var.E = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = r0;
        if (bundle.containsKey(str19)) {
            ht6Var.I = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(u0);
        if (stringArrayList != null) {
            ht6Var.K = mo5.q(stringArrayList);
        }
        return new jt6(ht6Var);
    }

    public final ht6 a() {
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
                k41 k41Var = this.l;
                if (k41Var == null) {
                    k41Var = new k41(bArr);
                    this.l = k41Var;
                }
                byte[] bArr2 = k41Var.a;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(k41.e, k41Var.b);
                if (Build.VERSION.SDK_INT >= 27 && bArr2.length > 0) {
                    i41 i41Var = k41Var.c;
                    if (i41Var == null) {
                        i41Var = i41.a(bArr2);
                        k41Var.c = i41Var;
                    }
                    if (i41Var != null) {
                        bundle2.putParcelable(k41.f, i41Var.a);
                        bundle.putBundle(str, bundle2);
                    }
                }
                j41 j41Var = k41Var.d;
                if (j41Var == null) {
                    j41Var = new j41(bArr2);
                    k41Var.d = j41Var;
                }
                int i2 = j41.b;
                bundle2.putBinder(k41.g, j41Var.a);
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
        g19 g19Var = this.i;
        if (g19Var != null) {
            bundle.putBundle(U, g19Var.c());
        }
        g19 g19Var2 = this.j;
        if (g19Var2 != null) {
            bundle.putBundle(V, g19Var2.c());
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
        mo5 mo5Var = this.L;
        if (!mo5Var.isEmpty()) {
            bundle.putStringArrayList(u0, new ArrayList<>(mo5Var));
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
        if (obj != null && jt6.class == obj.getClass()) {
            jt6 jt6Var = (jt6) obj;
            if (TextUtils.equals(this.a, jt6Var.a) && TextUtils.equals(this.b, jt6Var.b) && TextUtils.equals(this.c, jt6Var.c) && TextUtils.equals(this.d, jt6Var.d) && TextUtils.equals(this.e, jt6Var.e) && TextUtils.equals(this.f, jt6Var.f) && TextUtils.equals(this.g, jt6Var.g) && Objects.equals(this.h, jt6Var.h) && Objects.equals(this.i, jt6Var.i) && Objects.equals(this.j, jt6Var.j) && Arrays.equals(this.k, jt6Var.k) && Objects.equals(this.m, jt6Var.m) && Objects.equals(this.n, jt6Var.n) && Objects.equals(this.o, jt6Var.o) && Objects.equals(this.p, jt6Var.p) && Objects.equals(this.q, jt6Var.q) && Objects.equals(this.r, jt6Var.r) && Objects.equals(this.s, jt6Var.s) && Objects.equals(this.u, jt6Var.u) && Objects.equals(this.v, jt6Var.v) && Objects.equals(this.w, jt6Var.w) && Objects.equals(this.x, jt6Var.x) && Objects.equals(this.y, jt6Var.y) && Objects.equals(this.z, jt6Var.z) && TextUtils.equals(this.A, jt6Var.A) && TextUtils.equals(this.B, jt6Var.B) && TextUtils.equals(this.C, jt6Var.C) && TextUtils.equals(this.D, jt6Var.D) && Objects.equals(this.E, jt6Var.E) && Objects.equals(this.F, jt6Var.F) && TextUtils.equals(this.G, jt6Var.G) && TextUtils.equals(this.H, jt6Var.H) && TextUtils.equals(this.I, jt6Var.I) && Objects.equals(this.J, jt6Var.J) && Objects.equals(this.L, jt6Var.L)) {
                if (this.K == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (jt6Var.K == null) {
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
