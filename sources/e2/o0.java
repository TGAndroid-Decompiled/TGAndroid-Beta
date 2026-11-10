package e2;

import a8.ia;
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
    public static final String f10412a0;
    public static final String f10413b0;
    public static final String f10414c0;
    public static final String f10415d0;
    public static final String f10416e0;
    public static final String f10417f0;
    public static final String f10418g0;
    public static final String f10419h0;
    public static final String f10420i0;
    public static final String f10421j0;
    public static final String f10422k0;
    public static final String f10423l0;
    public static final String m0;
    public static final String f10424n0;
    public static final String f10425o0;
    public static final String f10426p0;
    public static final String f10427q0;
    public static final String f10428r0;
    public static final String f10429s0;
    public static final String f10430t0;
    public static final String f10431u0;
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
    public final CharSequence f10432a;
    public final CharSequence f10433b;
    public final CharSequence f10434c;
    public final CharSequence d;
    public final CharSequence f10435e;
    public final CharSequence f10436f;
    public final CharSequence f10437g;
    public final Long h;
    public final d1 f10438i;
    public final d1 f10439j;
    public final byte[] f10440k;
    public k f10441l;
    public final Integer f10442m;
    public final Uri f10443n;
    public final Integer f10444o;
    public final Integer f10445p;
    public final Integer f10446q;
    public final Boolean f10447r;
    public final Boolean f10448s;
    public final Integer f10449t;
    public final Integer f10450u;
    public final Integer v;
    public final Integer f10451w;
    public final Integer f10452x;
    public final Integer f10453y;
    public final Integer f10454z;

    static {
        String str = h2.m0.f14114a;
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
        f10412a0 = Integer.toString(15, 36);
        f10413b0 = Integer.toString(16, 36);
        f10414c0 = Integer.toString(17, 36);
        f10415d0 = Integer.toString(18, 36);
        f10416e0 = Integer.toString(19, 36);
        f10417f0 = Integer.toString(20, 36);
        f10418g0 = Integer.toString(21, 36);
        f10419h0 = Integer.toString(22, 36);
        f10420i0 = Integer.toString(23, 36);
        f10421j0 = Integer.toString(24, 36);
        f10422k0 = Integer.toString(25, 36);
        f10423l0 = Integer.toString(26, 36);
        m0 = Integer.toString(27, 36);
        f10424n0 = Integer.toString(28, 36);
        f10425o0 = Integer.toString(29, 36);
        f10426p0 = Integer.toString(30, 36);
        f10427q0 = Integer.toString(31, 36);
        f10428r0 = Integer.toString(32, 36);
        f10429s0 = Integer.toString(33, 36);
        f10430t0 = Integer.toString(34, 36);
        f10431u0 = Integer.toString(1000, 36);
    }

    public o0(n0 n0Var) {
        Boolean bool = n0Var.f10397r;
        Integer num = n0Var.f10396q;
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
            boolean z9 = num.intValue() != -1;
            bool = Boolean.valueOf(z9);
            if (z9 && num2 == null) {
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
        this.f10432a = n0Var.f10382a;
        this.f10433b = n0Var.f10383b;
        this.f10434c = n0Var.f10384c;
        this.d = n0Var.d;
        this.f10435e = n0Var.f10385e;
        this.f10436f = n0Var.f10386f;
        this.f10437g = n0Var.f10387g;
        this.h = n0Var.h;
        this.f10438i = n0Var.f10388i;
        this.f10439j = n0Var.f10389j;
        this.f10440k = n0Var.f10390k;
        this.f10441l = n0Var.f10391l;
        this.f10442m = n0Var.f10392m;
        this.f10443n = n0Var.f10393n;
        this.f10444o = n0Var.f10394o;
        this.f10445p = n0Var.f10395p;
        this.f10446q = num;
        this.f10447r = bool;
        this.f10448s = n0Var.f10398s;
        Integer num3 = n0Var.f10399t;
        this.f10449t = num3;
        this.f10450u = num3;
        this.v = n0Var.f10400u;
        this.f10451w = n0Var.v;
        this.f10452x = n0Var.f10401w;
        this.f10453y = n0Var.f10402x;
        this.f10454z = n0Var.f10403y;
        this.A = n0Var.f10404z;
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
        boolean z9;
        Bundle bundle2;
        Bundle bundle3;
        Integer num;
        n0 n0Var = new n0();
        n0Var.f10382a = bundle.getCharSequence(M);
        n0Var.f10383b = bundle.getCharSequence(N);
        n0Var.f10384c = bundle.getCharSequence(O);
        n0Var.d = bundle.getCharSequence(P);
        n0Var.f10385e = bundle.getCharSequence(Q);
        n0Var.f10386f = bundle.getCharSequence(R);
        n0Var.f10387g = bundle.getCharSequence(S);
        n0Var.f10393n = (Uri) bundle.getParcelable(W);
        n0Var.f10404z = bundle.getCharSequence(f10419h0);
        n0Var.A = bundle.getCharSequence(f10420i0);
        n0Var.B = bundle.getCharSequence(f10421j0);
        n0Var.E = bundle.getCharSequence(m0);
        n0Var.F = bundle.getCharSequence(f10424n0);
        n0Var.G = bundle.getCharSequence(f10426p0);
        n0Var.I = h2.m0.o(bundle.getBundle(f10431u0));
        String str = V;
        if (bundle.containsKey(str)) {
            String str2 = f10425o0;
            byte[] bArr = null;
            if (bundle.containsKey(str2)) {
                num = Integer.valueOf(bundle.getInt(str2));
            } else {
                num = null;
            }
            if (i7 >= 9) {
                Bundle bundle4 = bundle.getBundle(str);
                if (bundle4 != null) {
                    IBinder binder = bundle4.getBinder(k.f10302e);
                    if (binder != null) {
                        if (binder instanceof h) {
                            bArr = ((h) binder).f10273a.f10305a;
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
            n0Var.f10388i = d1.a(bundle3);
        }
        String str4 = U;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            n0Var.f10389j = d1.a(bundle2);
        }
        String str5 = f10429s0;
        if (bundle.containsKey(str5)) {
            long j3 = bundle.getLong(str5);
            Long valueOf = Long.valueOf(j3);
            if (j3 >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.f(z9);
            n0Var.h = valueOf;
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            n0Var.f10394o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            n0Var.f10395p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = Z;
        if (bundle.containsKey(str8)) {
            n0Var.f10396q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = f10428r0;
        if (bundle.containsKey(str9)) {
            n0Var.f10397r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f10412a0;
        if (bundle.containsKey(str10)) {
            n0Var.f10398s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = f10413b0;
        if (bundle.containsKey(str11)) {
            n0Var.f10399t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f10414c0;
        if (bundle.containsKey(str12)) {
            n0Var.f10400u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f10415d0;
        if (bundle.containsKey(str13)) {
            n0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f10416e0;
        if (bundle.containsKey(str14)) {
            n0Var.f10401w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f10417f0;
        if (bundle.containsKey(str15)) {
            n0Var.f10402x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f10418g0;
        if (bundle.containsKey(str16)) {
            n0Var.f10403y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f10422k0;
        if (bundle.containsKey(str17)) {
            n0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f10423l0;
        if (bundle.containsKey(str18)) {
            n0Var.D = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = f10427q0;
        if (bundle.containsKey(str19)) {
            n0Var.H = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f10430t0);
        if (stringArrayList != null) {
            n0Var.J = h9.i0.q(stringArrayList);
        }
        return new o0(n0Var);
    }

    public final n0 a() {
        ?? obj = new Object();
        obj.f10382a = this.f10432a;
        obj.f10383b = this.f10433b;
        obj.f10384c = this.f10434c;
        obj.d = this.d;
        obj.f10385e = this.f10435e;
        obj.f10386f = this.f10436f;
        obj.f10387g = this.f10437g;
        obj.h = this.h;
        obj.f10388i = this.f10438i;
        obj.f10389j = this.f10439j;
        obj.f10390k = this.f10440k;
        obj.f10391l = this.f10441l;
        obj.f10392m = this.f10442m;
        obj.f10393n = this.f10443n;
        obj.f10394o = this.f10444o;
        obj.f10395p = this.f10445p;
        obj.f10396q = this.f10446q;
        obj.f10397r = this.f10447r;
        obj.f10398s = this.f10448s;
        obj.f10399t = this.f10450u;
        obj.f10400u = this.v;
        obj.v = this.f10451w;
        obj.f10401w = this.f10452x;
        obj.f10402x = this.f10453y;
        obj.f10403y = this.f10454z;
        obj.f10404z = this.A;
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
        CharSequence charSequence = this.f10432a;
        if (charSequence != null) {
            bundle.putCharSequence(M, charSequence);
        }
        CharSequence charSequence2 = this.f10433b;
        if (charSequence2 != null) {
            bundle.putCharSequence(N, charSequence2);
        }
        CharSequence charSequence3 = this.f10434c;
        if (charSequence3 != null) {
            bundle.putCharSequence(O, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(P, charSequence4);
        }
        CharSequence charSequence5 = this.f10435e;
        if (charSequence5 != null) {
            bundle.putCharSequence(Q, charSequence5);
        }
        CharSequence charSequence6 = this.f10436f;
        if (charSequence6 != null) {
            bundle.putCharSequence(R, charSequence6);
        }
        CharSequence charSequence7 = this.f10437g;
        if (charSequence7 != null) {
            bundle.putCharSequence(S, charSequence7);
        }
        Long l10 = this.h;
        if (l10 != null) {
            bundle.putLong(f10429s0, l10.longValue());
        }
        byte[] bArr = this.f10440k;
        if (bArr != null) {
            String str = V;
            if (i7 >= 9) {
                if (this.f10441l == null) {
                    this.f10441l = new k(bArr);
                }
                k kVar = this.f10441l;
                byte[] bArr2 = kVar.f10305a;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(k.f10302e, kVar.f10306b);
                if (Build.VERSION.SDK_INT >= 27 && bArr2.length > 0) {
                    if (kVar.f10307c == null) {
                        kVar.f10307c = i.a(bArr2);
                    }
                    i iVar = kVar.f10307c;
                    if (iVar != null) {
                        bundle2.putParcelable(k.f10303f, iVar.f10280a);
                        bundle.putBundle(str, bundle2);
                    }
                }
                if (kVar.d == null) {
                    kVar.d = new j(bArr2);
                }
                j jVar = kVar.d;
                int i10 = j.f10291b;
                jVar.getClass();
                bundle2.putBinder(k.f10304g, jVar.f10292a);
                bundle.putBundle(str, bundle2);
            } else if (bArr.length <= 500000) {
                bundle.putByteArray(str, bArr);
            }
        }
        Uri uri = this.f10443n;
        if (uri != null) {
            bundle.putParcelable(W, uri);
        }
        CharSequence charSequence8 = this.A;
        if (charSequence8 != null) {
            bundle.putCharSequence(f10419h0, charSequence8);
        }
        CharSequence charSequence9 = this.B;
        if (charSequence9 != null) {
            bundle.putCharSequence(f10420i0, charSequence9);
        }
        CharSequence charSequence10 = this.C;
        if (charSequence10 != null) {
            bundle.putCharSequence(f10421j0, charSequence10);
        }
        CharSequence charSequence11 = this.F;
        if (charSequence11 != null) {
            bundle.putCharSequence(m0, charSequence11);
        }
        CharSequence charSequence12 = this.G;
        if (charSequence12 != null) {
            bundle.putCharSequence(f10424n0, charSequence12);
        }
        CharSequence charSequence13 = this.H;
        if (charSequence13 != null) {
            bundle.putCharSequence(f10426p0, charSequence13);
        }
        d1 d1Var = this.f10438i;
        if (d1Var != null) {
            bundle.putBundle(T, d1Var.c());
        }
        d1 d1Var2 = this.f10439j;
        if (d1Var2 != null) {
            bundle.putBundle(U, d1Var2.c());
        }
        Integer num = this.f10444o;
        if (num != null) {
            bundle.putInt(X, num.intValue());
        }
        Integer num2 = this.f10445p;
        if (num2 != null) {
            bundle.putInt(Y, num2.intValue());
        }
        Integer num3 = this.f10446q;
        if (num3 != null) {
            bundle.putInt(Z, num3.intValue());
        }
        Boolean bool = this.f10447r;
        if (bool != null) {
            bundle.putBoolean(f10428r0, bool.booleanValue());
        }
        Boolean bool2 = this.f10448s;
        if (bool2 != null) {
            bundle.putBoolean(f10412a0, bool2.booleanValue());
        }
        Integer num4 = this.f10450u;
        if (num4 != null) {
            bundle.putInt(f10413b0, num4.intValue());
        }
        Integer num5 = this.v;
        if (num5 != null) {
            bundle.putInt(f10414c0, num5.intValue());
        }
        Integer num6 = this.f10451w;
        if (num6 != null) {
            bundle.putInt(f10415d0, num6.intValue());
        }
        Integer num7 = this.f10452x;
        if (num7 != null) {
            bundle.putInt(f10416e0, num7.intValue());
        }
        Integer num8 = this.f10453y;
        if (num8 != null) {
            bundle.putInt(f10417f0, num8.intValue());
        }
        Integer num9 = this.f10454z;
        if (num9 != null) {
            bundle.putInt(f10418g0, num9.intValue());
        }
        Integer num10 = this.D;
        if (num10 != null) {
            bundle.putInt(f10422k0, num10.intValue());
        }
        Integer num11 = this.E;
        if (num11 != null) {
            bundle.putInt(f10423l0, num11.intValue());
        }
        Integer num12 = this.f10442m;
        if (num12 != null) {
            bundle.putInt(f10425o0, num12.intValue());
        }
        Integer num13 = this.I;
        if (num13 != null) {
            bundle.putInt(f10427q0, num13.intValue());
        }
        h9.i0 i0Var = this.K;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f10430t0, new ArrayList<>(i0Var));
        }
        Bundle bundle3 = this.J;
        if (bundle3 != null) {
            bundle.putBundle(f10431u0, bundle3);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj != null && o0.class == obj.getClass()) {
            o0 o0Var = (o0) obj;
            if (TextUtils.equals(this.f10432a, o0Var.f10432a) && TextUtils.equals(this.f10433b, o0Var.f10433b) && TextUtils.equals(this.f10434c, o0Var.f10434c) && TextUtils.equals(this.d, o0Var.d) && TextUtils.equals(this.f10435e, o0Var.f10435e) && TextUtils.equals(this.f10436f, o0Var.f10436f) && TextUtils.equals(this.f10437g, o0Var.f10437g) && Objects.equals(this.h, o0Var.h) && Objects.equals(this.f10438i, o0Var.f10438i) && Objects.equals(this.f10439j, o0Var.f10439j) && Arrays.equals(this.f10440k, o0Var.f10440k) && Objects.equals(this.f10442m, o0Var.f10442m) && Objects.equals(this.f10443n, o0Var.f10443n) && Objects.equals(this.f10444o, o0Var.f10444o) && Objects.equals(this.f10445p, o0Var.f10445p) && Objects.equals(this.f10446q, o0Var.f10446q) && Objects.equals(this.f10447r, o0Var.f10447r) && Objects.equals(this.f10448s, o0Var.f10448s) && Objects.equals(this.f10450u, o0Var.f10450u) && Objects.equals(this.v, o0Var.v) && Objects.equals(this.f10451w, o0Var.f10451w) && Objects.equals(this.f10452x, o0Var.f10452x) && Objects.equals(this.f10453y, o0Var.f10453y) && Objects.equals(this.f10454z, o0Var.f10454z) && TextUtils.equals(this.A, o0Var.A) && TextUtils.equals(this.B, o0Var.B) && TextUtils.equals(this.C, o0Var.C) && Objects.equals(this.D, o0Var.D) && Objects.equals(this.E, o0Var.E) && TextUtils.equals(this.F, o0Var.F) && TextUtils.equals(this.G, o0Var.G) && TextUtils.equals(this.H, o0Var.H) && Objects.equals(this.I, o0Var.I) && Objects.equals(this.K, o0Var.K)) {
                if (this.J == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (o0Var.J == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z9 == z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z9;
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f10440k));
        if (this.J == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Objects.hash(this.f10432a, this.f10433b, this.f10434c, this.d, this.f10435e, this.f10436f, this.f10437g, this.h, this.f10438i, this.f10439j, valueOf, this.f10442m, this.f10443n, this.f10444o, this.f10445p, this.f10446q, this.f10447r, this.f10448s, this.f10450u, this.v, this.f10451w, this.f10452x, this.f10453y, this.f10454z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, Boolean.valueOf(z9), this.K);
    }
}
