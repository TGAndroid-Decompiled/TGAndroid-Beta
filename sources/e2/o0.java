package e2;

import a8.la;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
public final class o0 {
    public static final o0 L = new o0(new n0());
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
    public static final String f10558a0;
    public static final String f10559b0;
    public static final String f10560c0;
    public static final String f10561d0;
    public static final String f10562e0;
    public static final String f10563f0;
    public static final String f10564g0;
    public static final String f10565h0;
    public static final String f10566i0;
    public static final String f10567j0;
    public static final String f10568k0;
    public static final String f10569l0;
    public static final String m0;
    public static final String f10570n0;
    public static final String f10571o0;
    public static final String f10572p0;
    public static final String f10573q0;
    public static final String f10574r0;
    public static final String f10575s0;
    public static final String f10576t0;
    public static final String f10577u0;
    public final CharSequence A;
    public final CharSequence B;
    public final CharSequence C;
    public final Integer D;
    public final Integer E;
    public final CharSequence F;
    public final CharSequence G;
    public final CharSequence H;
    public final Integer I;
    public final Bundle J;
    public final h9.i0 K;
    public final CharSequence f10578a;
    public final CharSequence f10579b;
    public final CharSequence f10580c;
    public final CharSequence d;
    public final CharSequence f10581e;
    public final CharSequence f10582f;
    public final CharSequence f10583g;
    public final Long h;
    public final d1 f10584i;
    public final d1 f10585j;
    public final byte[] f10586k;
    public k f10587l;
    public final Integer f10588m;
    public final Uri f10589n;
    public final Integer f10590o;
    public final Integer f10591p;
    public final Integer f10592q;
    public final Boolean f10593r;
    public final Boolean f10594s;
    public final Integer f10595t;
    public final Integer f10596u;
    public final Integer v;
    public final Integer f10597w;
    public final Integer f10598x;
    public final Integer f10599y;
    public final Integer f10600z;

    static {
        String str = h2.l0.f13783a;
        M = Integer.toString(0, 36);
        N = Integer.toString(1, 36);
        O = Integer.toString(2, 36);
        P = Integer.toString(3, 36);
        Q = Integer.toString(4, 36);
        R = Integer.toString(5, 36);
        S = Integer.toString(6, 36);
        T = Integer.toString(8, 36);
        U = Integer.toString(9, 36);
        V = Integer.toString(10, 36);
        W = Integer.toString(11, 36);
        X = Integer.toString(12, 36);
        Y = Integer.toString(13, 36);
        Z = Integer.toString(14, 36);
        f10558a0 = Integer.toString(15, 36);
        f10559b0 = Integer.toString(16, 36);
        f10560c0 = Integer.toString(17, 36);
        f10561d0 = Integer.toString(18, 36);
        f10562e0 = Integer.toString(19, 36);
        f10563f0 = Integer.toString(20, 36);
        f10564g0 = Integer.toString(21, 36);
        f10565h0 = Integer.toString(22, 36);
        f10566i0 = Integer.toString(23, 36);
        f10567j0 = Integer.toString(24, 36);
        f10568k0 = Integer.toString(25, 36);
        f10569l0 = Integer.toString(26, 36);
        m0 = Integer.toString(27, 36);
        f10570n0 = Integer.toString(28, 36);
        f10571o0 = Integer.toString(29, 36);
        f10572p0 = Integer.toString(30, 36);
        f10573q0 = Integer.toString(31, 36);
        f10574r0 = Integer.toString(32, 36);
        f10575s0 = Integer.toString(33, 36);
        f10576t0 = Integer.toString(34, 36);
        f10577u0 = Integer.toString(1000, 36);
    }

    public o0(n0 n0Var) {
        Boolean bool = n0Var.f10543r;
        Integer num = n0Var.f10542q;
        Integer num2 = n0Var.H;
        int i7 = 1;
        int i10 = 0;
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
                            i7 = 0;
                            break;
                        case 21:
                            i7 = 2;
                            break;
                        case 22:
                            i7 = 3;
                            break;
                        case 23:
                            i7 = 4;
                            break;
                        case 24:
                            i7 = 5;
                            break;
                        case 25:
                            i7 = 6;
                            break;
                    }
                    i10 = i7;
                }
                num = Integer.valueOf(i10);
            }
        } else if (num != null) {
            boolean z10 = num.intValue() != -1;
            bool = Boolean.valueOf(z10);
            if (z10 && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i10 = 21;
                        break;
                    case 3:
                        i10 = 22;
                        break;
                    case 4:
                        i10 = 23;
                        break;
                    case 5:
                        i10 = 24;
                        break;
                    case 6:
                        i10 = 25;
                        break;
                    default:
                        i10 = 20;
                        break;
                }
                num2 = Integer.valueOf(i10);
            }
        }
        this.f10578a = n0Var.f10528a;
        this.f10579b = n0Var.f10529b;
        this.f10580c = n0Var.f10530c;
        this.d = n0Var.d;
        this.f10581e = n0Var.f10531e;
        this.f10582f = n0Var.f10532f;
        this.f10583g = n0Var.f10533g;
        this.h = n0Var.h;
        this.f10584i = n0Var.f10534i;
        this.f10585j = n0Var.f10535j;
        this.f10586k = n0Var.f10536k;
        this.f10587l = n0Var.f10537l;
        this.f10588m = n0Var.f10538m;
        this.f10589n = n0Var.f10539n;
        this.f10590o = n0Var.f10540o;
        this.f10591p = n0Var.f10541p;
        this.f10592q = num;
        this.f10593r = bool;
        this.f10594s = n0Var.f10544s;
        Integer num3 = n0Var.f10545t;
        this.f10595t = num3;
        this.f10596u = num3;
        this.v = n0Var.f10546u;
        this.f10597w = n0Var.v;
        this.f10598x = n0Var.f10547w;
        this.f10599y = n0Var.f10548x;
        this.f10600z = n0Var.f10549y;
        this.A = n0Var.f10550z;
        this.B = n0Var.A;
        this.C = n0Var.B;
        this.D = n0Var.C;
        this.E = n0Var.D;
        this.F = n0Var.E;
        this.G = n0Var.F;
        this.H = n0Var.G;
        this.I = num2;
        this.K = n0Var.J;
        this.J = n0Var.I;
    }

    public static o0 b(int i7, Bundle bundle) {
        boolean z10;
        Bundle bundle2;
        Bundle bundle3;
        Integer num;
        n0 n0Var = new n0();
        n0Var.f10528a = bundle.getCharSequence(M);
        n0Var.f10529b = bundle.getCharSequence(N);
        n0Var.f10530c = bundle.getCharSequence(O);
        n0Var.d = bundle.getCharSequence(P);
        n0Var.f10531e = bundle.getCharSequence(Q);
        n0Var.f10532f = bundle.getCharSequence(R);
        n0Var.f10533g = bundle.getCharSequence(S);
        n0Var.f10539n = (Uri) bundle.getParcelable(W);
        n0Var.f10550z = bundle.getCharSequence(f10565h0);
        n0Var.A = bundle.getCharSequence(f10566i0);
        n0Var.B = bundle.getCharSequence(f10567j0);
        n0Var.E = bundle.getCharSequence(m0);
        n0Var.F = bundle.getCharSequence(f10570n0);
        n0Var.G = bundle.getCharSequence(f10572p0);
        n0Var.I = h2.l0.o(bundle.getBundle(f10577u0));
        String str = V;
        if (bundle.containsKey(str)) {
            String str2 = f10571o0;
            byte[] bArr = null;
            if (bundle.containsKey(str2)) {
                num = Integer.valueOf(bundle.getInt(str2));
            } else {
                num = null;
            }
            if (i7 >= 9) {
                Bundle bundle4 = bundle.getBundle(str);
                if (bundle4 != null) {
                    IBinder binder = bundle4.getBinder(k.f10448e);
                    if (binder != null) {
                        if (binder instanceof h) {
                            bArr = ((h) binder).f10419a.f10451a;
                        } else if (Build.VERSION.SDK_INT < 27 || (bArr = i.b(bundle4)) == null) {
                            bArr = j.a(bundle4);
                        }
                    }
                    n0Var.b(bArr, num);
                }
            } else {
                n0Var.b(bundle.getByteArray(str), num);
            }
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle3 = bundle.getBundle(str3)) != null) {
            n0Var.f10534i = d1.a(bundle3);
        }
        String str4 = U;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            n0Var.f10535j = d1.a(bundle2);
        }
        String str5 = f10575s0;
        if (bundle.containsKey(str5)) {
            long j3 = bundle.getLong(str5);
            Long valueOf = Long.valueOf(j3);
            if (j3 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.f(z10);
            n0Var.h = valueOf;
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            n0Var.f10540o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            n0Var.f10541p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = Z;
        if (bundle.containsKey(str8)) {
            n0Var.f10542q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = f10574r0;
        if (bundle.containsKey(str9)) {
            n0Var.f10543r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f10558a0;
        if (bundle.containsKey(str10)) {
            n0Var.f10544s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = f10559b0;
        if (bundle.containsKey(str11)) {
            n0Var.f10545t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f10560c0;
        if (bundle.containsKey(str12)) {
            n0Var.f10546u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f10561d0;
        if (bundle.containsKey(str13)) {
            n0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f10562e0;
        if (bundle.containsKey(str14)) {
            n0Var.f10547w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f10563f0;
        if (bundle.containsKey(str15)) {
            n0Var.f10548x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f10564g0;
        if (bundle.containsKey(str16)) {
            n0Var.f10549y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f10568k0;
        if (bundle.containsKey(str17)) {
            n0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f10569l0;
        if (bundle.containsKey(str18)) {
            n0Var.D = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = f10573q0;
        if (bundle.containsKey(str19)) {
            n0Var.H = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f10576t0);
        if (stringArrayList != null) {
            n0Var.J = h9.i0.q(stringArrayList);
        }
        return new o0(n0Var);
    }

    public final n0 a() {
        ?? obj = new Object();
        obj.f10528a = this.f10578a;
        obj.f10529b = this.f10579b;
        obj.f10530c = this.f10580c;
        obj.d = this.d;
        obj.f10531e = this.f10581e;
        obj.f10532f = this.f10582f;
        obj.f10533g = this.f10583g;
        obj.h = this.h;
        obj.f10534i = this.f10584i;
        obj.f10535j = this.f10585j;
        obj.f10536k = this.f10586k;
        obj.f10537l = this.f10587l;
        obj.f10538m = this.f10588m;
        obj.f10539n = this.f10589n;
        obj.f10540o = this.f10590o;
        obj.f10541p = this.f10591p;
        obj.f10542q = this.f10592q;
        obj.f10543r = this.f10593r;
        obj.f10544s = this.f10594s;
        obj.f10545t = this.f10596u;
        obj.f10546u = this.v;
        obj.v = this.f10597w;
        obj.f10547w = this.f10598x;
        obj.f10548x = this.f10599y;
        obj.f10549y = this.f10600z;
        obj.f10550z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.C = this.D;
        obj.D = this.E;
        obj.E = this.F;
        obj.F = this.G;
        obj.G = this.H;
        obj.H = this.I;
        obj.J = this.K;
        obj.I = this.J;
        return obj;
    }

    public final Bundle c(int i7) {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f10578a;
        if (charSequence != null) {
            bundle.putCharSequence(M, charSequence);
        }
        CharSequence charSequence2 = this.f10579b;
        if (charSequence2 != null) {
            bundle.putCharSequence(N, charSequence2);
        }
        CharSequence charSequence3 = this.f10580c;
        if (charSequence3 != null) {
            bundle.putCharSequence(O, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(P, charSequence4);
        }
        CharSequence charSequence5 = this.f10581e;
        if (charSequence5 != null) {
            bundle.putCharSequence(Q, charSequence5);
        }
        CharSequence charSequence6 = this.f10582f;
        if (charSequence6 != null) {
            bundle.putCharSequence(R, charSequence6);
        }
        CharSequence charSequence7 = this.f10583g;
        if (charSequence7 != null) {
            bundle.putCharSequence(S, charSequence7);
        }
        Long l10 = this.h;
        if (l10 != null) {
            bundle.putLong(f10575s0, l10.longValue());
        }
        byte[] bArr = this.f10586k;
        if (bArr != null) {
            String str = V;
            if (i7 >= 9) {
                if (this.f10587l == null) {
                    this.f10587l = new k(bArr);
                }
                k kVar = this.f10587l;
                byte[] bArr2 = kVar.f10451a;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(k.f10448e, kVar.f10452b);
                if (Build.VERSION.SDK_INT >= 27 && bArr2.length > 0) {
                    if (kVar.f10453c == null) {
                        kVar.f10453c = i.a(bArr2);
                    }
                    i iVar = kVar.f10453c;
                    if (iVar != null) {
                        bundle2.putParcelable(k.f10449f, iVar.f10426a);
                        bundle.putBundle(str, bundle2);
                    }
                }
                if (kVar.d == null) {
                    kVar.d = new j(bArr2);
                }
                j jVar = kVar.d;
                int i10 = j.f10437b;
                jVar.getClass();
                bundle2.putBinder(k.f10450g, jVar.f10438a);
                bundle.putBundle(str, bundle2);
            } else if (bArr.length <= 500000) {
                bundle.putByteArray(str, bArr);
            }
        }
        Uri uri = this.f10589n;
        if (uri != null) {
            bundle.putParcelable(W, uri);
        }
        CharSequence charSequence8 = this.A;
        if (charSequence8 != null) {
            bundle.putCharSequence(f10565h0, charSequence8);
        }
        CharSequence charSequence9 = this.B;
        if (charSequence9 != null) {
            bundle.putCharSequence(f10566i0, charSequence9);
        }
        CharSequence charSequence10 = this.C;
        if (charSequence10 != null) {
            bundle.putCharSequence(f10567j0, charSequence10);
        }
        CharSequence charSequence11 = this.F;
        if (charSequence11 != null) {
            bundle.putCharSequence(m0, charSequence11);
        }
        CharSequence charSequence12 = this.G;
        if (charSequence12 != null) {
            bundle.putCharSequence(f10570n0, charSequence12);
        }
        CharSequence charSequence13 = this.H;
        if (charSequence13 != null) {
            bundle.putCharSequence(f10572p0, charSequence13);
        }
        d1 d1Var = this.f10584i;
        if (d1Var != null) {
            bundle.putBundle(T, d1Var.c());
        }
        d1 d1Var2 = this.f10585j;
        if (d1Var2 != null) {
            bundle.putBundle(U, d1Var2.c());
        }
        Integer num = this.f10590o;
        if (num != null) {
            bundle.putInt(X, num.intValue());
        }
        Integer num2 = this.f10591p;
        if (num2 != null) {
            bundle.putInt(Y, num2.intValue());
        }
        Integer num3 = this.f10592q;
        if (num3 != null) {
            bundle.putInt(Z, num3.intValue());
        }
        Boolean bool = this.f10593r;
        if (bool != null) {
            bundle.putBoolean(f10574r0, bool.booleanValue());
        }
        Boolean bool2 = this.f10594s;
        if (bool2 != null) {
            bundle.putBoolean(f10558a0, bool2.booleanValue());
        }
        Integer num4 = this.f10596u;
        if (num4 != null) {
            bundle.putInt(f10559b0, num4.intValue());
        }
        Integer num5 = this.v;
        if (num5 != null) {
            bundle.putInt(f10560c0, num5.intValue());
        }
        Integer num6 = this.f10597w;
        if (num6 != null) {
            bundle.putInt(f10561d0, num6.intValue());
        }
        Integer num7 = this.f10598x;
        if (num7 != null) {
            bundle.putInt(f10562e0, num7.intValue());
        }
        Integer num8 = this.f10599y;
        if (num8 != null) {
            bundle.putInt(f10563f0, num8.intValue());
        }
        Integer num9 = this.f10600z;
        if (num9 != null) {
            bundle.putInt(f10564g0, num9.intValue());
        }
        Integer num10 = this.D;
        if (num10 != null) {
            bundle.putInt(f10568k0, num10.intValue());
        }
        Integer num11 = this.E;
        if (num11 != null) {
            bundle.putInt(f10569l0, num11.intValue());
        }
        Integer num12 = this.f10588m;
        if (num12 != null) {
            bundle.putInt(f10571o0, num12.intValue());
        }
        Integer num13 = this.I;
        if (num13 != null) {
            bundle.putInt(f10573q0, num13.intValue());
        }
        h9.i0 i0Var = this.K;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f10576t0, new ArrayList<>(i0Var));
        }
        Bundle bundle3 = this.J;
        if (bundle3 != null) {
            bundle.putBundle(f10577u0, bundle3);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj != null && o0.class == obj.getClass()) {
            o0 o0Var = (o0) obj;
            if (TextUtils.equals(this.f10578a, o0Var.f10578a) && TextUtils.equals(this.f10579b, o0Var.f10579b) && TextUtils.equals(this.f10580c, o0Var.f10580c) && TextUtils.equals(this.d, o0Var.d) && TextUtils.equals(this.f10581e, o0Var.f10581e) && TextUtils.equals(this.f10582f, o0Var.f10582f) && TextUtils.equals(this.f10583g, o0Var.f10583g) && Objects.equals(this.h, o0Var.h) && Objects.equals(this.f10584i, o0Var.f10584i) && Objects.equals(this.f10585j, o0Var.f10585j) && Arrays.equals(this.f10586k, o0Var.f10586k) && Objects.equals(this.f10588m, o0Var.f10588m) && Objects.equals(this.f10589n, o0Var.f10589n) && Objects.equals(this.f10590o, o0Var.f10590o) && Objects.equals(this.f10591p, o0Var.f10591p) && Objects.equals(this.f10592q, o0Var.f10592q) && Objects.equals(this.f10593r, o0Var.f10593r) && Objects.equals(this.f10594s, o0Var.f10594s) && Objects.equals(this.f10596u, o0Var.f10596u) && Objects.equals(this.v, o0Var.v) && Objects.equals(this.f10597w, o0Var.f10597w) && Objects.equals(this.f10598x, o0Var.f10598x) && Objects.equals(this.f10599y, o0Var.f10599y) && Objects.equals(this.f10600z, o0Var.f10600z) && TextUtils.equals(this.A, o0Var.A) && TextUtils.equals(this.B, o0Var.B) && TextUtils.equals(this.C, o0Var.C) && Objects.equals(this.D, o0Var.D) && Objects.equals(this.E, o0Var.E) && TextUtils.equals(this.F, o0Var.F) && TextUtils.equals(this.G, o0Var.G) && TextUtils.equals(this.H, o0Var.H) && Objects.equals(this.I, o0Var.I) && Objects.equals(this.K, o0Var.K)) {
                if (this.J == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (o0Var.J == null) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f10586k));
        if (this.J == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f10578a, this.f10579b, this.f10580c, this.d, this.f10581e, this.f10582f, this.f10583g, this.h, this.f10584i, this.f10585j, valueOf, this.f10588m, this.f10589n, this.f10590o, this.f10591p, this.f10592q, this.f10593r, this.f10594s, this.f10596u, this.v, this.f10597w, this.f10598x, this.f10599y, this.f10600z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, Boolean.valueOf(z10), this.K);
    }
}
