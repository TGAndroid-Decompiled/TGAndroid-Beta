package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
public final class nt6 {
    public static final nt6 M = new nt6(new lt6());
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
    public final po5 L;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final s29 i;
    public final s29 j;
    public final byte[] k;
    public l31 l;
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
        String str = gcc.a;
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

    public nt6(lt6 lt6Var) {
        Boolean bool = lt6Var.r;
        Integer num = lt6Var.q;
        Integer num2 = lt6Var.I;
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
        this.a = lt6Var.a;
        this.b = lt6Var.b;
        this.c = lt6Var.c;
        this.d = lt6Var.d;
        this.e = lt6Var.e;
        this.f = lt6Var.f;
        this.g = lt6Var.g;
        this.h = lt6Var.h;
        this.i = lt6Var.i;
        this.j = lt6Var.j;
        this.k = lt6Var.k;
        this.l = lt6Var.l;
        this.m = lt6Var.m;
        this.n = lt6Var.n;
        this.o = lt6Var.o;
        this.p = lt6Var.p;
        this.q = num;
        this.r = bool;
        this.s = lt6Var.s;
        Integer num3 = lt6Var.t;
        this.t = num3;
        this.u = num3;
        this.v = lt6Var.u;
        this.w = lt6Var.v;
        this.x = lt6Var.w;
        this.y = lt6Var.x;
        this.z = lt6Var.y;
        this.A = lt6Var.z;
        this.B = lt6Var.A;
        this.C = lt6Var.B;
        this.D = lt6Var.C;
        this.E = lt6Var.D;
        this.F = lt6Var.E;
        this.G = lt6Var.F;
        this.H = lt6Var.G;
        this.I = lt6Var.H;
        this.J = num2;
        this.L = lt6Var.K;
        this.K = lt6Var.J;
    }

    public static nt6 b(int i, Bundle bundle) {
        boolean z;
        Bundle bundle2;
        Bundle bundle3;
        Integer num;
        lt6 lt6Var = new lt6();
        lt6Var.a = bundle.getCharSequence(N);
        lt6Var.b = bundle.getCharSequence(O);
        lt6Var.c = bundle.getCharSequence(P);
        lt6Var.d = bundle.getCharSequence(Q);
        lt6Var.e = bundle.getCharSequence(R);
        lt6Var.f = bundle.getCharSequence(S);
        lt6Var.g = bundle.getCharSequence(T);
        lt6Var.n = (Uri) bundle.getParcelable(X);
        lt6Var.z = bundle.getCharSequence(i0);
        lt6Var.A = bundle.getCharSequence(j0);
        lt6Var.B = bundle.getCharSequence(k0);
        lt6Var.C = bundle.getCharSequence(v0);
        lt6Var.F = bundle.getCharSequence(n0);
        lt6Var.G = bundle.getCharSequence(o0);
        lt6Var.H = bundle.getCharSequence(q0);
        lt6Var.J = gcc.o(bundle.getBundle(w0));
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
                    IBinder binder = bundle4.getBinder(l31.e);
                    if (binder != null) {
                        if (binder instanceof i31) {
                            int i2 = i31.b;
                            bArr = ((i31) binder).a.a;
                        } else if (Build.VERSION.SDK_INT < 27 || (bArr = j31.b(bundle4)) == null) {
                            bArr = k31.a(bundle4);
                        }
                    }
                    lt6Var.b(bArr, num);
                }
            } else {
                lt6Var.b(bundle.getByteArray(str), num);
            }
        }
        String str3 = U;
        if (bundle.containsKey(str3) && (bundle3 = bundle.getBundle(str3)) != null) {
            lt6Var.i = s29.a(bundle3);
        }
        String str4 = V;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            lt6Var.j = s29.a(bundle2);
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
            yve.f(z);
            lt6Var.h = valueOf;
        }
        String str6 = Y;
        if (bundle.containsKey(str6)) {
            lt6Var.o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Z;
        if (bundle.containsKey(str7)) {
            lt6Var.p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = a0;
        if (bundle.containsKey(str8)) {
            lt6Var.q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = s0;
        if (bundle.containsKey(str9)) {
            lt6Var.r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = b0;
        if (bundle.containsKey(str10)) {
            lt6Var.s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = c0;
        if (bundle.containsKey(str11)) {
            lt6Var.t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = d0;
        if (bundle.containsKey(str12)) {
            lt6Var.u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = e0;
        if (bundle.containsKey(str13)) {
            lt6Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f0;
        if (bundle.containsKey(str14)) {
            lt6Var.w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = g0;
        if (bundle.containsKey(str15)) {
            lt6Var.x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = h0;
        if (bundle.containsKey(str16)) {
            lt6Var.y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = l0;
        if (bundle.containsKey(str17)) {
            lt6Var.D = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = m0;
        if (bundle.containsKey(str18)) {
            lt6Var.E = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = r0;
        if (bundle.containsKey(str19)) {
            lt6Var.I = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(u0);
        if (stringArrayList != null) {
            lt6Var.K = po5.q(stringArrayList);
        }
        return new nt6(lt6Var);
    }

    public final lt6 a() {
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
                l31 l31Var = this.l;
                if (l31Var == null) {
                    l31Var = new l31(bArr);
                    this.l = l31Var;
                }
                byte[] bArr2 = l31Var.a;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(l31.e, l31Var.b);
                if (Build.VERSION.SDK_INT >= 27 && bArr2.length > 0) {
                    j31 j31Var = l31Var.c;
                    if (j31Var == null) {
                        j31Var = j31.a(bArr2);
                        l31Var.c = j31Var;
                    }
                    if (j31Var != null) {
                        bundle2.putParcelable(l31.f, j31Var.a);
                        bundle.putBundle(str, bundle2);
                    }
                }
                k31 k31Var = l31Var.d;
                if (k31Var == null) {
                    k31Var = new k31(bArr2);
                    l31Var.d = k31Var;
                }
                int i2 = k31.b;
                bundle2.putBinder(l31.g, k31Var.a);
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
        s29 s29Var = this.i;
        if (s29Var != null) {
            bundle.putBundle(U, s29Var.c());
        }
        s29 s29Var2 = this.j;
        if (s29Var2 != null) {
            bundle.putBundle(V, s29Var2.c());
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
        po5 po5Var = this.L;
        if (!po5Var.isEmpty()) {
            bundle.putStringArrayList(u0, new ArrayList<>(po5Var));
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
        if (obj != null && nt6.class == obj.getClass()) {
            nt6 nt6Var = (nt6) obj;
            if (TextUtils.equals(this.a, nt6Var.a) && TextUtils.equals(this.b, nt6Var.b) && TextUtils.equals(this.c, nt6Var.c) && TextUtils.equals(this.d, nt6Var.d) && TextUtils.equals(this.e, nt6Var.e) && TextUtils.equals(this.f, nt6Var.f) && TextUtils.equals(this.g, nt6Var.g) && Objects.equals(this.h, nt6Var.h) && Objects.equals(this.i, nt6Var.i) && Objects.equals(this.j, nt6Var.j) && Arrays.equals(this.k, nt6Var.k) && Objects.equals(this.m, nt6Var.m) && Objects.equals(this.n, nt6Var.n) && Objects.equals(this.o, nt6Var.o) && Objects.equals(this.p, nt6Var.p) && Objects.equals(this.q, nt6Var.q) && Objects.equals(this.r, nt6Var.r) && Objects.equals(this.s, nt6Var.s) && Objects.equals(this.u, nt6Var.u) && Objects.equals(this.v, nt6Var.v) && Objects.equals(this.w, nt6Var.w) && Objects.equals(this.x, nt6Var.x) && Objects.equals(this.y, nt6Var.y) && Objects.equals(this.z, nt6Var.z) && TextUtils.equals(this.A, nt6Var.A) && TextUtils.equals(this.B, nt6Var.B) && TextUtils.equals(this.C, nt6Var.C) && TextUtils.equals(this.D, nt6Var.D) && Objects.equals(this.E, nt6Var.E) && Objects.equals(this.F, nt6Var.F) && TextUtils.equals(this.G, nt6Var.G) && TextUtils.equals(this.H, nt6Var.H) && TextUtils.equals(this.I, nt6Var.I) && Objects.equals(this.J, nt6Var.J) && Objects.equals(this.L, nt6Var.L)) {
                if (this.K == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (nt6Var.K == null) {
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
