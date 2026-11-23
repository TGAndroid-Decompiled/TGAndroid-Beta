package e2;

import a8.ma;
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
    public static final String f10553a0;
    public static final String f10554b0;
    public static final String f10555c0;
    public static final String f10556d0;
    public static final String f10557e0;
    public static final String f10558f0;
    public static final String f10559g0;
    public static final String f10560h0;
    public static final String f10561i0;
    public static final String f10562j0;
    public static final String f10563k0;
    public static final String f10564l0;
    public static final String m0;
    public static final String f10565n0;
    public static final String f10566o0;
    public static final String f10567p0;
    public static final String f10568q0;
    public static final String f10569r0;
    public static final String f10570s0;
    public static final String f10571t0;
    public static final String f10572u0;
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
    public final CharSequence f10573a;
    public final CharSequence f10574b;
    public final CharSequence f10575c;
    public final CharSequence d;
    public final CharSequence f10576e;
    public final CharSequence f10577f;
    public final CharSequence f10578g;
    public final Long h;
    public final d1 f10579i;
    public final d1 f10580j;
    public final byte[] f10581k;
    public k f10582l;
    public final Integer f10583m;
    public final Uri f10584n;
    public final Integer f10585o;
    public final Integer f10586p;
    public final Integer f10587q;
    public final Boolean f10588r;
    public final Boolean f10589s;
    public final Integer f10590t;
    public final Integer f10591u;
    public final Integer v;
    public final Integer f10592w;
    public final Integer f10593x;
    public final Integer f10594y;
    public final Integer f10595z;

    static {
        String str = h2.l0.f13778a;
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
        f10553a0 = Integer.toString(15, 36);
        f10554b0 = Integer.toString(16, 36);
        f10555c0 = Integer.toString(17, 36);
        f10556d0 = Integer.toString(18, 36);
        f10557e0 = Integer.toString(19, 36);
        f10558f0 = Integer.toString(20, 36);
        f10559g0 = Integer.toString(21, 36);
        f10560h0 = Integer.toString(22, 36);
        f10561i0 = Integer.toString(23, 36);
        f10562j0 = Integer.toString(24, 36);
        f10563k0 = Integer.toString(25, 36);
        f10564l0 = Integer.toString(26, 36);
        m0 = Integer.toString(27, 36);
        f10565n0 = Integer.toString(28, 36);
        f10566o0 = Integer.toString(29, 36);
        f10567p0 = Integer.toString(30, 36);
        f10568q0 = Integer.toString(31, 36);
        f10569r0 = Integer.toString(32, 36);
        f10570s0 = Integer.toString(33, 36);
        f10571t0 = Integer.toString(34, 36);
        f10572u0 = Integer.toString(1000, 36);
    }

    public o0(n0 n0Var) {
        Boolean bool = n0Var.f10538r;
        Integer num = n0Var.f10537q;
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
        this.f10573a = n0Var.f10523a;
        this.f10574b = n0Var.f10524b;
        this.f10575c = n0Var.f10525c;
        this.d = n0Var.d;
        this.f10576e = n0Var.f10526e;
        this.f10577f = n0Var.f10527f;
        this.f10578g = n0Var.f10528g;
        this.h = n0Var.h;
        this.f10579i = n0Var.f10529i;
        this.f10580j = n0Var.f10530j;
        this.f10581k = n0Var.f10531k;
        this.f10582l = n0Var.f10532l;
        this.f10583m = n0Var.f10533m;
        this.f10584n = n0Var.f10534n;
        this.f10585o = n0Var.f10535o;
        this.f10586p = n0Var.f10536p;
        this.f10587q = num;
        this.f10588r = bool;
        this.f10589s = n0Var.f10539s;
        Integer num3 = n0Var.f10540t;
        this.f10590t = num3;
        this.f10591u = num3;
        this.v = n0Var.f10541u;
        this.f10592w = n0Var.v;
        this.f10593x = n0Var.f10542w;
        this.f10594y = n0Var.f10543x;
        this.f10595z = n0Var.f10544y;
        this.A = n0Var.f10545z;
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
        n0Var.f10523a = bundle.getCharSequence(M);
        n0Var.f10524b = bundle.getCharSequence(N);
        n0Var.f10525c = bundle.getCharSequence(O);
        n0Var.d = bundle.getCharSequence(P);
        n0Var.f10526e = bundle.getCharSequence(Q);
        n0Var.f10527f = bundle.getCharSequence(R);
        n0Var.f10528g = bundle.getCharSequence(S);
        n0Var.f10534n = (Uri) bundle.getParcelable(W);
        n0Var.f10545z = bundle.getCharSequence(f10560h0);
        n0Var.A = bundle.getCharSequence(f10561i0);
        n0Var.B = bundle.getCharSequence(f10562j0);
        n0Var.E = bundle.getCharSequence(m0);
        n0Var.F = bundle.getCharSequence(f10565n0);
        n0Var.G = bundle.getCharSequence(f10567p0);
        n0Var.I = h2.l0.o(bundle.getBundle(f10572u0));
        String str = V;
        if (bundle.containsKey(str)) {
            String str2 = f10566o0;
            byte[] bArr = null;
            if (bundle.containsKey(str2)) {
                num = Integer.valueOf(bundle.getInt(str2));
            } else {
                num = null;
            }
            if (i7 >= 9) {
                Bundle bundle4 = bundle.getBundle(str);
                if (bundle4 != null) {
                    IBinder binder = bundle4.getBinder(k.f10443e);
                    if (binder != null) {
                        if (binder instanceof h) {
                            bArr = ((h) binder).f10414a.f10446a;
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
            n0Var.f10529i = d1.a(bundle3);
        }
        String str4 = U;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            n0Var.f10530j = d1.a(bundle2);
        }
        String str5 = f10570s0;
        if (bundle.containsKey(str5)) {
            long j3 = bundle.getLong(str5);
            Long valueOf = Long.valueOf(j3);
            if (j3 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ma.f(z10);
            n0Var.h = valueOf;
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            n0Var.f10535o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            n0Var.f10536p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = Z;
        if (bundle.containsKey(str8)) {
            n0Var.f10537q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = f10569r0;
        if (bundle.containsKey(str9)) {
            n0Var.f10538r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f10553a0;
        if (bundle.containsKey(str10)) {
            n0Var.f10539s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = f10554b0;
        if (bundle.containsKey(str11)) {
            n0Var.f10540t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f10555c0;
        if (bundle.containsKey(str12)) {
            n0Var.f10541u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f10556d0;
        if (bundle.containsKey(str13)) {
            n0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f10557e0;
        if (bundle.containsKey(str14)) {
            n0Var.f10542w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f10558f0;
        if (bundle.containsKey(str15)) {
            n0Var.f10543x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f10559g0;
        if (bundle.containsKey(str16)) {
            n0Var.f10544y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f10563k0;
        if (bundle.containsKey(str17)) {
            n0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f10564l0;
        if (bundle.containsKey(str18)) {
            n0Var.D = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = f10568q0;
        if (bundle.containsKey(str19)) {
            n0Var.H = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f10571t0);
        if (stringArrayList != null) {
            n0Var.J = h9.i0.q(stringArrayList);
        }
        return new o0(n0Var);
    }

    public final n0 a() {
        ?? obj = new Object();
        obj.f10523a = this.f10573a;
        obj.f10524b = this.f10574b;
        obj.f10525c = this.f10575c;
        obj.d = this.d;
        obj.f10526e = this.f10576e;
        obj.f10527f = this.f10577f;
        obj.f10528g = this.f10578g;
        obj.h = this.h;
        obj.f10529i = this.f10579i;
        obj.f10530j = this.f10580j;
        obj.f10531k = this.f10581k;
        obj.f10532l = this.f10582l;
        obj.f10533m = this.f10583m;
        obj.f10534n = this.f10584n;
        obj.f10535o = this.f10585o;
        obj.f10536p = this.f10586p;
        obj.f10537q = this.f10587q;
        obj.f10538r = this.f10588r;
        obj.f10539s = this.f10589s;
        obj.f10540t = this.f10591u;
        obj.f10541u = this.v;
        obj.v = this.f10592w;
        obj.f10542w = this.f10593x;
        obj.f10543x = this.f10594y;
        obj.f10544y = this.f10595z;
        obj.f10545z = this.A;
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
        CharSequence charSequence = this.f10573a;
        if (charSequence != null) {
            bundle.putCharSequence(M, charSequence);
        }
        CharSequence charSequence2 = this.f10574b;
        if (charSequence2 != null) {
            bundle.putCharSequence(N, charSequence2);
        }
        CharSequence charSequence3 = this.f10575c;
        if (charSequence3 != null) {
            bundle.putCharSequence(O, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(P, charSequence4);
        }
        CharSequence charSequence5 = this.f10576e;
        if (charSequence5 != null) {
            bundle.putCharSequence(Q, charSequence5);
        }
        CharSequence charSequence6 = this.f10577f;
        if (charSequence6 != null) {
            bundle.putCharSequence(R, charSequence6);
        }
        CharSequence charSequence7 = this.f10578g;
        if (charSequence7 != null) {
            bundle.putCharSequence(S, charSequence7);
        }
        Long l10 = this.h;
        if (l10 != null) {
            bundle.putLong(f10570s0, l10.longValue());
        }
        byte[] bArr = this.f10581k;
        if (bArr != null) {
            String str = V;
            if (i7 >= 9) {
                if (this.f10582l == null) {
                    this.f10582l = new k(bArr);
                }
                k kVar = this.f10582l;
                byte[] bArr2 = kVar.f10446a;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(k.f10443e, kVar.f10447b);
                if (Build.VERSION.SDK_INT >= 27 && bArr2.length > 0) {
                    if (kVar.f10448c == null) {
                        kVar.f10448c = i.a(bArr2);
                    }
                    i iVar = kVar.f10448c;
                    if (iVar != null) {
                        bundle2.putParcelable(k.f10444f, iVar.f10421a);
                        bundle.putBundle(str, bundle2);
                    }
                }
                if (kVar.d == null) {
                    kVar.d = new j(bArr2);
                }
                j jVar = kVar.d;
                int i10 = j.f10432b;
                jVar.getClass();
                bundle2.putBinder(k.f10445g, jVar.f10433a);
                bundle.putBundle(str, bundle2);
            } else if (bArr.length <= 500000) {
                bundle.putByteArray(str, bArr);
            }
        }
        Uri uri = this.f10584n;
        if (uri != null) {
            bundle.putParcelable(W, uri);
        }
        CharSequence charSequence8 = this.A;
        if (charSequence8 != null) {
            bundle.putCharSequence(f10560h0, charSequence8);
        }
        CharSequence charSequence9 = this.B;
        if (charSequence9 != null) {
            bundle.putCharSequence(f10561i0, charSequence9);
        }
        CharSequence charSequence10 = this.C;
        if (charSequence10 != null) {
            bundle.putCharSequence(f10562j0, charSequence10);
        }
        CharSequence charSequence11 = this.F;
        if (charSequence11 != null) {
            bundle.putCharSequence(m0, charSequence11);
        }
        CharSequence charSequence12 = this.G;
        if (charSequence12 != null) {
            bundle.putCharSequence(f10565n0, charSequence12);
        }
        CharSequence charSequence13 = this.H;
        if (charSequence13 != null) {
            bundle.putCharSequence(f10567p0, charSequence13);
        }
        d1 d1Var = this.f10579i;
        if (d1Var != null) {
            bundle.putBundle(T, d1Var.c());
        }
        d1 d1Var2 = this.f10580j;
        if (d1Var2 != null) {
            bundle.putBundle(U, d1Var2.c());
        }
        Integer num = this.f10585o;
        if (num != null) {
            bundle.putInt(X, num.intValue());
        }
        Integer num2 = this.f10586p;
        if (num2 != null) {
            bundle.putInt(Y, num2.intValue());
        }
        Integer num3 = this.f10587q;
        if (num3 != null) {
            bundle.putInt(Z, num3.intValue());
        }
        Boolean bool = this.f10588r;
        if (bool != null) {
            bundle.putBoolean(f10569r0, bool.booleanValue());
        }
        Boolean bool2 = this.f10589s;
        if (bool2 != null) {
            bundle.putBoolean(f10553a0, bool2.booleanValue());
        }
        Integer num4 = this.f10591u;
        if (num4 != null) {
            bundle.putInt(f10554b0, num4.intValue());
        }
        Integer num5 = this.v;
        if (num5 != null) {
            bundle.putInt(f10555c0, num5.intValue());
        }
        Integer num6 = this.f10592w;
        if (num6 != null) {
            bundle.putInt(f10556d0, num6.intValue());
        }
        Integer num7 = this.f10593x;
        if (num7 != null) {
            bundle.putInt(f10557e0, num7.intValue());
        }
        Integer num8 = this.f10594y;
        if (num8 != null) {
            bundle.putInt(f10558f0, num8.intValue());
        }
        Integer num9 = this.f10595z;
        if (num9 != null) {
            bundle.putInt(f10559g0, num9.intValue());
        }
        Integer num10 = this.D;
        if (num10 != null) {
            bundle.putInt(f10563k0, num10.intValue());
        }
        Integer num11 = this.E;
        if (num11 != null) {
            bundle.putInt(f10564l0, num11.intValue());
        }
        Integer num12 = this.f10583m;
        if (num12 != null) {
            bundle.putInt(f10566o0, num12.intValue());
        }
        Integer num13 = this.I;
        if (num13 != null) {
            bundle.putInt(f10568q0, num13.intValue());
        }
        h9.i0 i0Var = this.K;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f10571t0, new ArrayList<>(i0Var));
        }
        Bundle bundle3 = this.J;
        if (bundle3 != null) {
            bundle.putBundle(f10572u0, bundle3);
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
            if (TextUtils.equals(this.f10573a, o0Var.f10573a) && TextUtils.equals(this.f10574b, o0Var.f10574b) && TextUtils.equals(this.f10575c, o0Var.f10575c) && TextUtils.equals(this.d, o0Var.d) && TextUtils.equals(this.f10576e, o0Var.f10576e) && TextUtils.equals(this.f10577f, o0Var.f10577f) && TextUtils.equals(this.f10578g, o0Var.f10578g) && Objects.equals(this.h, o0Var.h) && Objects.equals(this.f10579i, o0Var.f10579i) && Objects.equals(this.f10580j, o0Var.f10580j) && Arrays.equals(this.f10581k, o0Var.f10581k) && Objects.equals(this.f10583m, o0Var.f10583m) && Objects.equals(this.f10584n, o0Var.f10584n) && Objects.equals(this.f10585o, o0Var.f10585o) && Objects.equals(this.f10586p, o0Var.f10586p) && Objects.equals(this.f10587q, o0Var.f10587q) && Objects.equals(this.f10588r, o0Var.f10588r) && Objects.equals(this.f10589s, o0Var.f10589s) && Objects.equals(this.f10591u, o0Var.f10591u) && Objects.equals(this.v, o0Var.v) && Objects.equals(this.f10592w, o0Var.f10592w) && Objects.equals(this.f10593x, o0Var.f10593x) && Objects.equals(this.f10594y, o0Var.f10594y) && Objects.equals(this.f10595z, o0Var.f10595z) && TextUtils.equals(this.A, o0Var.A) && TextUtils.equals(this.B, o0Var.B) && TextUtils.equals(this.C, o0Var.C) && Objects.equals(this.D, o0Var.D) && Objects.equals(this.E, o0Var.E) && TextUtils.equals(this.F, o0Var.F) && TextUtils.equals(this.G, o0Var.G) && TextUtils.equals(this.H, o0Var.H) && Objects.equals(this.I, o0Var.I) && Objects.equals(this.K, o0Var.K)) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f10581k));
        if (this.J == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f10573a, this.f10574b, this.f10575c, this.d, this.f10576e, this.f10577f, this.f10578g, this.h, this.f10579i, this.f10580j, valueOf, this.f10583m, this.f10584n, this.f10585o, this.f10586p, this.f10587q, this.f10588r, this.f10589s, this.f10591u, this.v, this.f10592w, this.f10593x, this.f10594y, this.f10595z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, Boolean.valueOf(z10), this.K);
    }
}
