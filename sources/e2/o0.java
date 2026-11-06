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
    public static final String f10407a0;
    public static final String f10408b0;
    public static final String f10409c0;
    public static final String f10410d0;
    public static final String f10411e0;
    public static final String f10412f0;
    public static final String f10413g0;
    public static final String f10414h0;
    public static final String f10415i0;
    public static final String f10416j0;
    public static final String f10417k0;
    public static final String f10418l0;
    public static final String m0;
    public static final String f10419n0;
    public static final String f10420o0;
    public static final String f10421p0;
    public static final String f10422q0;
    public static final String f10423r0;
    public static final String f10424s0;
    public static final String f10425t0;
    public static final String f10426u0;
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
    public final CharSequence f10427a;
    public final CharSequence f10428b;
    public final CharSequence f10429c;
    public final CharSequence d;
    public final CharSequence f10430e;
    public final CharSequence f10431f;
    public final CharSequence f10432g;
    public final Long h;
    public final d1 f10433i;
    public final d1 f10434j;
    public final byte[] f10435k;
    public k f10436l;
    public final Integer f10437m;
    public final Uri f10438n;
    public final Integer f10439o;
    public final Integer f10440p;
    public final Integer f10441q;
    public final Boolean f10442r;
    public final Boolean f10443s;
    public final Integer f10444t;
    public final Integer f10445u;
    public final Integer v;
    public final Integer f10446w;
    public final Integer f10447x;
    public final Integer f10448y;
    public final Integer f10449z;

    static {
        String str = h2.m0.f14112a;
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
        f10407a0 = Integer.toString(15, 36);
        f10408b0 = Integer.toString(16, 36);
        f10409c0 = Integer.toString(17, 36);
        f10410d0 = Integer.toString(18, 36);
        f10411e0 = Integer.toString(19, 36);
        f10412f0 = Integer.toString(20, 36);
        f10413g0 = Integer.toString(21, 36);
        f10414h0 = Integer.toString(22, 36);
        f10415i0 = Integer.toString(23, 36);
        f10416j0 = Integer.toString(24, 36);
        f10417k0 = Integer.toString(25, 36);
        f10418l0 = Integer.toString(26, 36);
        m0 = Integer.toString(27, 36);
        f10419n0 = Integer.toString(28, 36);
        f10420o0 = Integer.toString(29, 36);
        f10421p0 = Integer.toString(30, 36);
        f10422q0 = Integer.toString(31, 36);
        f10423r0 = Integer.toString(32, 36);
        f10424s0 = Integer.toString(33, 36);
        f10425t0 = Integer.toString(34, 36);
        f10426u0 = Integer.toString(1000, 36);
    }

    public o0(n0 n0Var) {
        Boolean bool = n0Var.f10392r;
        Integer num = n0Var.f10391q;
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
        this.f10427a = n0Var.f10377a;
        this.f10428b = n0Var.f10378b;
        this.f10429c = n0Var.f10379c;
        this.d = n0Var.d;
        this.f10430e = n0Var.f10380e;
        this.f10431f = n0Var.f10381f;
        this.f10432g = n0Var.f10382g;
        this.h = n0Var.h;
        this.f10433i = n0Var.f10383i;
        this.f10434j = n0Var.f10384j;
        this.f10435k = n0Var.f10385k;
        this.f10436l = n0Var.f10386l;
        this.f10437m = n0Var.f10387m;
        this.f10438n = n0Var.f10388n;
        this.f10439o = n0Var.f10389o;
        this.f10440p = n0Var.f10390p;
        this.f10441q = num;
        this.f10442r = bool;
        this.f10443s = n0Var.f10393s;
        Integer num3 = n0Var.f10394t;
        this.f10444t = num3;
        this.f10445u = num3;
        this.v = n0Var.f10395u;
        this.f10446w = n0Var.v;
        this.f10447x = n0Var.f10396w;
        this.f10448y = n0Var.f10397x;
        this.f10449z = n0Var.f10398y;
        this.A = n0Var.f10399z;
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
        n0Var.f10377a = bundle.getCharSequence(M);
        n0Var.f10378b = bundle.getCharSequence(N);
        n0Var.f10379c = bundle.getCharSequence(O);
        n0Var.d = bundle.getCharSequence(P);
        n0Var.f10380e = bundle.getCharSequence(Q);
        n0Var.f10381f = bundle.getCharSequence(R);
        n0Var.f10382g = bundle.getCharSequence(S);
        n0Var.f10388n = (Uri) bundle.getParcelable(W);
        n0Var.f10399z = bundle.getCharSequence(f10414h0);
        n0Var.A = bundle.getCharSequence(f10415i0);
        n0Var.B = bundle.getCharSequence(f10416j0);
        n0Var.E = bundle.getCharSequence(m0);
        n0Var.F = bundle.getCharSequence(f10419n0);
        n0Var.G = bundle.getCharSequence(f10421p0);
        n0Var.I = h2.m0.o(bundle.getBundle(f10426u0));
        String str = V;
        if (bundle.containsKey(str)) {
            String str2 = f10420o0;
            byte[] bArr = null;
            if (bundle.containsKey(str2)) {
                num = Integer.valueOf(bundle.getInt(str2));
            } else {
                num = null;
            }
            if (i7 >= 9) {
                Bundle bundle4 = bundle.getBundle(str);
                if (bundle4 != null) {
                    IBinder binder = bundle4.getBinder(k.f10297e);
                    if (binder != null) {
                        if (binder instanceof h) {
                            bArr = ((h) binder).f10268a.f10300a;
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
            n0Var.f10383i = d1.a(bundle3);
        }
        String str4 = U;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            n0Var.f10384j = d1.a(bundle2);
        }
        String str5 = f10424s0;
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
            n0Var.f10389o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            n0Var.f10390p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = Z;
        if (bundle.containsKey(str8)) {
            n0Var.f10391q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = f10423r0;
        if (bundle.containsKey(str9)) {
            n0Var.f10392r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f10407a0;
        if (bundle.containsKey(str10)) {
            n0Var.f10393s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = f10408b0;
        if (bundle.containsKey(str11)) {
            n0Var.f10394t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f10409c0;
        if (bundle.containsKey(str12)) {
            n0Var.f10395u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f10410d0;
        if (bundle.containsKey(str13)) {
            n0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f10411e0;
        if (bundle.containsKey(str14)) {
            n0Var.f10396w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f10412f0;
        if (bundle.containsKey(str15)) {
            n0Var.f10397x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f10413g0;
        if (bundle.containsKey(str16)) {
            n0Var.f10398y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f10417k0;
        if (bundle.containsKey(str17)) {
            n0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f10418l0;
        if (bundle.containsKey(str18)) {
            n0Var.D = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = f10422q0;
        if (bundle.containsKey(str19)) {
            n0Var.H = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f10425t0);
        if (stringArrayList != null) {
            n0Var.J = h9.i0.q(stringArrayList);
        }
        return new o0(n0Var);
    }

    public final n0 a() {
        ?? obj = new Object();
        obj.f10377a = this.f10427a;
        obj.f10378b = this.f10428b;
        obj.f10379c = this.f10429c;
        obj.d = this.d;
        obj.f10380e = this.f10430e;
        obj.f10381f = this.f10431f;
        obj.f10382g = this.f10432g;
        obj.h = this.h;
        obj.f10383i = this.f10433i;
        obj.f10384j = this.f10434j;
        obj.f10385k = this.f10435k;
        obj.f10386l = this.f10436l;
        obj.f10387m = this.f10437m;
        obj.f10388n = this.f10438n;
        obj.f10389o = this.f10439o;
        obj.f10390p = this.f10440p;
        obj.f10391q = this.f10441q;
        obj.f10392r = this.f10442r;
        obj.f10393s = this.f10443s;
        obj.f10394t = this.f10445u;
        obj.f10395u = this.v;
        obj.v = this.f10446w;
        obj.f10396w = this.f10447x;
        obj.f10397x = this.f10448y;
        obj.f10398y = this.f10449z;
        obj.f10399z = this.A;
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
        CharSequence charSequence = this.f10427a;
        if (charSequence != null) {
            bundle.putCharSequence(M, charSequence);
        }
        CharSequence charSequence2 = this.f10428b;
        if (charSequence2 != null) {
            bundle.putCharSequence(N, charSequence2);
        }
        CharSequence charSequence3 = this.f10429c;
        if (charSequence3 != null) {
            bundle.putCharSequence(O, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(P, charSequence4);
        }
        CharSequence charSequence5 = this.f10430e;
        if (charSequence5 != null) {
            bundle.putCharSequence(Q, charSequence5);
        }
        CharSequence charSequence6 = this.f10431f;
        if (charSequence6 != null) {
            bundle.putCharSequence(R, charSequence6);
        }
        CharSequence charSequence7 = this.f10432g;
        if (charSequence7 != null) {
            bundle.putCharSequence(S, charSequence7);
        }
        Long l10 = this.h;
        if (l10 != null) {
            bundle.putLong(f10424s0, l10.longValue());
        }
        byte[] bArr = this.f10435k;
        if (bArr != null) {
            String str = V;
            if (i7 >= 9) {
                if (this.f10436l == null) {
                    this.f10436l = new k(bArr);
                }
                k kVar = this.f10436l;
                byte[] bArr2 = kVar.f10300a;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(k.f10297e, kVar.f10301b);
                if (Build.VERSION.SDK_INT >= 27 && bArr2.length > 0) {
                    if (kVar.f10302c == null) {
                        kVar.f10302c = i.a(bArr2);
                    }
                    i iVar = kVar.f10302c;
                    if (iVar != null) {
                        bundle2.putParcelable(k.f10298f, iVar.f10275a);
                        bundle.putBundle(str, bundle2);
                    }
                }
                if (kVar.d == null) {
                    kVar.d = new j(bArr2);
                }
                j jVar = kVar.d;
                int i10 = j.f10286b;
                jVar.getClass();
                bundle2.putBinder(k.f10299g, jVar.f10287a);
                bundle.putBundle(str, bundle2);
            } else if (bArr.length <= 500000) {
                bundle.putByteArray(str, bArr);
            }
        }
        Uri uri = this.f10438n;
        if (uri != null) {
            bundle.putParcelable(W, uri);
        }
        CharSequence charSequence8 = this.A;
        if (charSequence8 != null) {
            bundle.putCharSequence(f10414h0, charSequence8);
        }
        CharSequence charSequence9 = this.B;
        if (charSequence9 != null) {
            bundle.putCharSequence(f10415i0, charSequence9);
        }
        CharSequence charSequence10 = this.C;
        if (charSequence10 != null) {
            bundle.putCharSequence(f10416j0, charSequence10);
        }
        CharSequence charSequence11 = this.F;
        if (charSequence11 != null) {
            bundle.putCharSequence(m0, charSequence11);
        }
        CharSequence charSequence12 = this.G;
        if (charSequence12 != null) {
            bundle.putCharSequence(f10419n0, charSequence12);
        }
        CharSequence charSequence13 = this.H;
        if (charSequence13 != null) {
            bundle.putCharSequence(f10421p0, charSequence13);
        }
        d1 d1Var = this.f10433i;
        if (d1Var != null) {
            bundle.putBundle(T, d1Var.c());
        }
        d1 d1Var2 = this.f10434j;
        if (d1Var2 != null) {
            bundle.putBundle(U, d1Var2.c());
        }
        Integer num = this.f10439o;
        if (num != null) {
            bundle.putInt(X, num.intValue());
        }
        Integer num2 = this.f10440p;
        if (num2 != null) {
            bundle.putInt(Y, num2.intValue());
        }
        Integer num3 = this.f10441q;
        if (num3 != null) {
            bundle.putInt(Z, num3.intValue());
        }
        Boolean bool = this.f10442r;
        if (bool != null) {
            bundle.putBoolean(f10423r0, bool.booleanValue());
        }
        Boolean bool2 = this.f10443s;
        if (bool2 != null) {
            bundle.putBoolean(f10407a0, bool2.booleanValue());
        }
        Integer num4 = this.f10445u;
        if (num4 != null) {
            bundle.putInt(f10408b0, num4.intValue());
        }
        Integer num5 = this.v;
        if (num5 != null) {
            bundle.putInt(f10409c0, num5.intValue());
        }
        Integer num6 = this.f10446w;
        if (num6 != null) {
            bundle.putInt(f10410d0, num6.intValue());
        }
        Integer num7 = this.f10447x;
        if (num7 != null) {
            bundle.putInt(f10411e0, num7.intValue());
        }
        Integer num8 = this.f10448y;
        if (num8 != null) {
            bundle.putInt(f10412f0, num8.intValue());
        }
        Integer num9 = this.f10449z;
        if (num9 != null) {
            bundle.putInt(f10413g0, num9.intValue());
        }
        Integer num10 = this.D;
        if (num10 != null) {
            bundle.putInt(f10417k0, num10.intValue());
        }
        Integer num11 = this.E;
        if (num11 != null) {
            bundle.putInt(f10418l0, num11.intValue());
        }
        Integer num12 = this.f10437m;
        if (num12 != null) {
            bundle.putInt(f10420o0, num12.intValue());
        }
        Integer num13 = this.I;
        if (num13 != null) {
            bundle.putInt(f10422q0, num13.intValue());
        }
        h9.i0 i0Var = this.K;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f10425t0, new ArrayList<>(i0Var));
        }
        Bundle bundle3 = this.J;
        if (bundle3 != null) {
            bundle.putBundle(f10426u0, bundle3);
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
            if (TextUtils.equals(this.f10427a, o0Var.f10427a) && TextUtils.equals(this.f10428b, o0Var.f10428b) && TextUtils.equals(this.f10429c, o0Var.f10429c) && TextUtils.equals(this.d, o0Var.d) && TextUtils.equals(this.f10430e, o0Var.f10430e) && TextUtils.equals(this.f10431f, o0Var.f10431f) && TextUtils.equals(this.f10432g, o0Var.f10432g) && Objects.equals(this.h, o0Var.h) && Objects.equals(this.f10433i, o0Var.f10433i) && Objects.equals(this.f10434j, o0Var.f10434j) && Arrays.equals(this.f10435k, o0Var.f10435k) && Objects.equals(this.f10437m, o0Var.f10437m) && Objects.equals(this.f10438n, o0Var.f10438n) && Objects.equals(this.f10439o, o0Var.f10439o) && Objects.equals(this.f10440p, o0Var.f10440p) && Objects.equals(this.f10441q, o0Var.f10441q) && Objects.equals(this.f10442r, o0Var.f10442r) && Objects.equals(this.f10443s, o0Var.f10443s) && Objects.equals(this.f10445u, o0Var.f10445u) && Objects.equals(this.v, o0Var.v) && Objects.equals(this.f10446w, o0Var.f10446w) && Objects.equals(this.f10447x, o0Var.f10447x) && Objects.equals(this.f10448y, o0Var.f10448y) && Objects.equals(this.f10449z, o0Var.f10449z) && TextUtils.equals(this.A, o0Var.A) && TextUtils.equals(this.B, o0Var.B) && TextUtils.equals(this.C, o0Var.C) && Objects.equals(this.D, o0Var.D) && Objects.equals(this.E, o0Var.E) && TextUtils.equals(this.F, o0Var.F) && TextUtils.equals(this.G, o0Var.G) && TextUtils.equals(this.H, o0Var.H) && Objects.equals(this.I, o0Var.I) && Objects.equals(this.K, o0Var.K)) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f10435k));
        if (this.J == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Objects.hash(this.f10427a, this.f10428b, this.f10429c, this.d, this.f10430e, this.f10431f, this.f10432g, this.h, this.f10433i, this.f10434j, valueOf, this.f10437m, this.f10438n, this.f10439o, this.f10440p, this.f10441q, this.f10442r, this.f10443s, this.f10445u, this.v, this.f10446w, this.f10447x, this.f10448y, this.f10449z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, Boolean.valueOf(z9), this.K);
    }
}
