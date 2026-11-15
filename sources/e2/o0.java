package e2;

import a8.ja;
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
    public static final String f10243a0;
    public static final String f10244b0;
    public static final String f10245c0;
    public static final String f10246d0;
    public static final String f10247e0;
    public static final String f10248f0;
    public static final String f10249g0;
    public static final String f10250h0;
    public static final String f10251i0;
    public static final String f10252j0;
    public static final String f10253k0;
    public static final String f10254l0;
    public static final String m0;
    public static final String f10255n0;
    public static final String f10256o0;
    public static final String f10257p0;
    public static final String f10258q0;
    public static final String f10259r0;
    public static final String f10260s0;
    public static final String f10261t0;
    public static final String f10262u0;
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
    public final CharSequence f10263a;
    public final CharSequence f10264b;
    public final CharSequence f10265c;
    public final CharSequence d;
    public final CharSequence f10266e;
    public final CharSequence f10267f;
    public final CharSequence f10268g;
    public final Long h;
    public final d1 f10269i;
    public final d1 f10270j;
    public final byte[] f10271k;
    public k f10272l;
    public final Integer f10273m;
    public final Uri f10274n;
    public final Integer f10275o;
    public final Integer f10276p;
    public final Integer f10277q;
    public final Boolean f10278r;
    public final Boolean f10279s;
    public final Integer f10280t;
    public final Integer f10281u;
    public final Integer v;
    public final Integer f10282w;
    public final Integer f10283x;
    public final Integer f10284y;
    public final Integer f10285z;

    static {
        String str = h2.l0.f13471a;
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
        f10243a0 = Integer.toString(15, 36);
        f10244b0 = Integer.toString(16, 36);
        f10245c0 = Integer.toString(17, 36);
        f10246d0 = Integer.toString(18, 36);
        f10247e0 = Integer.toString(19, 36);
        f10248f0 = Integer.toString(20, 36);
        f10249g0 = Integer.toString(21, 36);
        f10250h0 = Integer.toString(22, 36);
        f10251i0 = Integer.toString(23, 36);
        f10252j0 = Integer.toString(24, 36);
        f10253k0 = Integer.toString(25, 36);
        f10254l0 = Integer.toString(26, 36);
        m0 = Integer.toString(27, 36);
        f10255n0 = Integer.toString(28, 36);
        f10256o0 = Integer.toString(29, 36);
        f10257p0 = Integer.toString(30, 36);
        f10258q0 = Integer.toString(31, 36);
        f10259r0 = Integer.toString(32, 36);
        f10260s0 = Integer.toString(33, 36);
        f10261t0 = Integer.toString(34, 36);
        f10262u0 = Integer.toString(1000, 36);
    }

    public o0(n0 n0Var) {
        Boolean bool = n0Var.f10228r;
        Integer num = n0Var.f10227q;
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
        this.f10263a = n0Var.f10213a;
        this.f10264b = n0Var.f10214b;
        this.f10265c = n0Var.f10215c;
        this.d = n0Var.d;
        this.f10266e = n0Var.f10216e;
        this.f10267f = n0Var.f10217f;
        this.f10268g = n0Var.f10218g;
        this.h = n0Var.h;
        this.f10269i = n0Var.f10219i;
        this.f10270j = n0Var.f10220j;
        this.f10271k = n0Var.f10221k;
        this.f10272l = n0Var.f10222l;
        this.f10273m = n0Var.f10223m;
        this.f10274n = n0Var.f10224n;
        this.f10275o = n0Var.f10225o;
        this.f10276p = n0Var.f10226p;
        this.f10277q = num;
        this.f10278r = bool;
        this.f10279s = n0Var.f10229s;
        Integer num3 = n0Var.f10230t;
        this.f10280t = num3;
        this.f10281u = num3;
        this.v = n0Var.f10231u;
        this.f10282w = n0Var.v;
        this.f10283x = n0Var.f10232w;
        this.f10284y = n0Var.f10233x;
        this.f10285z = n0Var.f10234y;
        this.A = n0Var.f10235z;
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
        n0Var.f10213a = bundle.getCharSequence(M);
        n0Var.f10214b = bundle.getCharSequence(N);
        n0Var.f10215c = bundle.getCharSequence(O);
        n0Var.d = bundle.getCharSequence(P);
        n0Var.f10216e = bundle.getCharSequence(Q);
        n0Var.f10217f = bundle.getCharSequence(R);
        n0Var.f10218g = bundle.getCharSequence(S);
        n0Var.f10224n = (Uri) bundle.getParcelable(W);
        n0Var.f10235z = bundle.getCharSequence(f10250h0);
        n0Var.A = bundle.getCharSequence(f10251i0);
        n0Var.B = bundle.getCharSequence(f10252j0);
        n0Var.E = bundle.getCharSequence(m0);
        n0Var.F = bundle.getCharSequence(f10255n0);
        n0Var.G = bundle.getCharSequence(f10257p0);
        n0Var.I = h2.l0.o(bundle.getBundle(f10262u0));
        String str = V;
        if (bundle.containsKey(str)) {
            String str2 = f10256o0;
            byte[] bArr = null;
            if (bundle.containsKey(str2)) {
                num = Integer.valueOf(bundle.getInt(str2));
            } else {
                num = null;
            }
            if (i7 >= 9) {
                Bundle bundle4 = bundle.getBundle(str);
                if (bundle4 != null) {
                    IBinder binder = bundle4.getBinder(k.f10133e);
                    if (binder != null) {
                        if (binder instanceof h) {
                            bArr = ((h) binder).f10104a.f10136a;
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
            n0Var.f10219i = d1.a(bundle3);
        }
        String str4 = U;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            n0Var.f10220j = d1.a(bundle2);
        }
        String str5 = f10260s0;
        if (bundle.containsKey(str5)) {
            long j3 = bundle.getLong(str5);
            Long valueOf = Long.valueOf(j3);
            if (j3 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ja.f(z10);
            n0Var.h = valueOf;
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            n0Var.f10225o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            n0Var.f10226p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = Z;
        if (bundle.containsKey(str8)) {
            n0Var.f10227q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = f10259r0;
        if (bundle.containsKey(str9)) {
            n0Var.f10228r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f10243a0;
        if (bundle.containsKey(str10)) {
            n0Var.f10229s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = f10244b0;
        if (bundle.containsKey(str11)) {
            n0Var.f10230t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f10245c0;
        if (bundle.containsKey(str12)) {
            n0Var.f10231u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f10246d0;
        if (bundle.containsKey(str13)) {
            n0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f10247e0;
        if (bundle.containsKey(str14)) {
            n0Var.f10232w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f10248f0;
        if (bundle.containsKey(str15)) {
            n0Var.f10233x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f10249g0;
        if (bundle.containsKey(str16)) {
            n0Var.f10234y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f10253k0;
        if (bundle.containsKey(str17)) {
            n0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f10254l0;
        if (bundle.containsKey(str18)) {
            n0Var.D = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = f10258q0;
        if (bundle.containsKey(str19)) {
            n0Var.H = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f10261t0);
        if (stringArrayList != null) {
            n0Var.J = h9.i0.q(stringArrayList);
        }
        return new o0(n0Var);
    }

    public final n0 a() {
        ?? obj = new Object();
        obj.f10213a = this.f10263a;
        obj.f10214b = this.f10264b;
        obj.f10215c = this.f10265c;
        obj.d = this.d;
        obj.f10216e = this.f10266e;
        obj.f10217f = this.f10267f;
        obj.f10218g = this.f10268g;
        obj.h = this.h;
        obj.f10219i = this.f10269i;
        obj.f10220j = this.f10270j;
        obj.f10221k = this.f10271k;
        obj.f10222l = this.f10272l;
        obj.f10223m = this.f10273m;
        obj.f10224n = this.f10274n;
        obj.f10225o = this.f10275o;
        obj.f10226p = this.f10276p;
        obj.f10227q = this.f10277q;
        obj.f10228r = this.f10278r;
        obj.f10229s = this.f10279s;
        obj.f10230t = this.f10281u;
        obj.f10231u = this.v;
        obj.v = this.f10282w;
        obj.f10232w = this.f10283x;
        obj.f10233x = this.f10284y;
        obj.f10234y = this.f10285z;
        obj.f10235z = this.A;
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
        CharSequence charSequence = this.f10263a;
        if (charSequence != null) {
            bundle.putCharSequence(M, charSequence);
        }
        CharSequence charSequence2 = this.f10264b;
        if (charSequence2 != null) {
            bundle.putCharSequence(N, charSequence2);
        }
        CharSequence charSequence3 = this.f10265c;
        if (charSequence3 != null) {
            bundle.putCharSequence(O, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(P, charSequence4);
        }
        CharSequence charSequence5 = this.f10266e;
        if (charSequence5 != null) {
            bundle.putCharSequence(Q, charSequence5);
        }
        CharSequence charSequence6 = this.f10267f;
        if (charSequence6 != null) {
            bundle.putCharSequence(R, charSequence6);
        }
        CharSequence charSequence7 = this.f10268g;
        if (charSequence7 != null) {
            bundle.putCharSequence(S, charSequence7);
        }
        Long l10 = this.h;
        if (l10 != null) {
            bundle.putLong(f10260s0, l10.longValue());
        }
        byte[] bArr = this.f10271k;
        if (bArr != null) {
            String str = V;
            if (i7 >= 9) {
                if (this.f10272l == null) {
                    this.f10272l = new k(bArr);
                }
                k kVar = this.f10272l;
                byte[] bArr2 = kVar.f10136a;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(k.f10133e, kVar.f10137b);
                if (Build.VERSION.SDK_INT >= 27 && bArr2.length > 0) {
                    if (kVar.f10138c == null) {
                        kVar.f10138c = i.a(bArr2);
                    }
                    i iVar = kVar.f10138c;
                    if (iVar != null) {
                        bundle2.putParcelable(k.f10134f, iVar.f10111a);
                        bundle.putBundle(str, bundle2);
                    }
                }
                if (kVar.d == null) {
                    kVar.d = new j(bArr2);
                }
                j jVar = kVar.d;
                int i10 = j.f10122b;
                jVar.getClass();
                bundle2.putBinder(k.f10135g, jVar.f10123a);
                bundle.putBundle(str, bundle2);
            } else if (bArr.length <= 500000) {
                bundle.putByteArray(str, bArr);
            }
        }
        Uri uri = this.f10274n;
        if (uri != null) {
            bundle.putParcelable(W, uri);
        }
        CharSequence charSequence8 = this.A;
        if (charSequence8 != null) {
            bundle.putCharSequence(f10250h0, charSequence8);
        }
        CharSequence charSequence9 = this.B;
        if (charSequence9 != null) {
            bundle.putCharSequence(f10251i0, charSequence9);
        }
        CharSequence charSequence10 = this.C;
        if (charSequence10 != null) {
            bundle.putCharSequence(f10252j0, charSequence10);
        }
        CharSequence charSequence11 = this.F;
        if (charSequence11 != null) {
            bundle.putCharSequence(m0, charSequence11);
        }
        CharSequence charSequence12 = this.G;
        if (charSequence12 != null) {
            bundle.putCharSequence(f10255n0, charSequence12);
        }
        CharSequence charSequence13 = this.H;
        if (charSequence13 != null) {
            bundle.putCharSequence(f10257p0, charSequence13);
        }
        d1 d1Var = this.f10269i;
        if (d1Var != null) {
            bundle.putBundle(T, d1Var.c());
        }
        d1 d1Var2 = this.f10270j;
        if (d1Var2 != null) {
            bundle.putBundle(U, d1Var2.c());
        }
        Integer num = this.f10275o;
        if (num != null) {
            bundle.putInt(X, num.intValue());
        }
        Integer num2 = this.f10276p;
        if (num2 != null) {
            bundle.putInt(Y, num2.intValue());
        }
        Integer num3 = this.f10277q;
        if (num3 != null) {
            bundle.putInt(Z, num3.intValue());
        }
        Boolean bool = this.f10278r;
        if (bool != null) {
            bundle.putBoolean(f10259r0, bool.booleanValue());
        }
        Boolean bool2 = this.f10279s;
        if (bool2 != null) {
            bundle.putBoolean(f10243a0, bool2.booleanValue());
        }
        Integer num4 = this.f10281u;
        if (num4 != null) {
            bundle.putInt(f10244b0, num4.intValue());
        }
        Integer num5 = this.v;
        if (num5 != null) {
            bundle.putInt(f10245c0, num5.intValue());
        }
        Integer num6 = this.f10282w;
        if (num6 != null) {
            bundle.putInt(f10246d0, num6.intValue());
        }
        Integer num7 = this.f10283x;
        if (num7 != null) {
            bundle.putInt(f10247e0, num7.intValue());
        }
        Integer num8 = this.f10284y;
        if (num8 != null) {
            bundle.putInt(f10248f0, num8.intValue());
        }
        Integer num9 = this.f10285z;
        if (num9 != null) {
            bundle.putInt(f10249g0, num9.intValue());
        }
        Integer num10 = this.D;
        if (num10 != null) {
            bundle.putInt(f10253k0, num10.intValue());
        }
        Integer num11 = this.E;
        if (num11 != null) {
            bundle.putInt(f10254l0, num11.intValue());
        }
        Integer num12 = this.f10273m;
        if (num12 != null) {
            bundle.putInt(f10256o0, num12.intValue());
        }
        Integer num13 = this.I;
        if (num13 != null) {
            bundle.putInt(f10258q0, num13.intValue());
        }
        h9.i0 i0Var = this.K;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f10261t0, new ArrayList<>(i0Var));
        }
        Bundle bundle3 = this.J;
        if (bundle3 != null) {
            bundle.putBundle(f10262u0, bundle3);
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
            if (TextUtils.equals(this.f10263a, o0Var.f10263a) && TextUtils.equals(this.f10264b, o0Var.f10264b) && TextUtils.equals(this.f10265c, o0Var.f10265c) && TextUtils.equals(this.d, o0Var.d) && TextUtils.equals(this.f10266e, o0Var.f10266e) && TextUtils.equals(this.f10267f, o0Var.f10267f) && TextUtils.equals(this.f10268g, o0Var.f10268g) && Objects.equals(this.h, o0Var.h) && Objects.equals(this.f10269i, o0Var.f10269i) && Objects.equals(this.f10270j, o0Var.f10270j) && Arrays.equals(this.f10271k, o0Var.f10271k) && Objects.equals(this.f10273m, o0Var.f10273m) && Objects.equals(this.f10274n, o0Var.f10274n) && Objects.equals(this.f10275o, o0Var.f10275o) && Objects.equals(this.f10276p, o0Var.f10276p) && Objects.equals(this.f10277q, o0Var.f10277q) && Objects.equals(this.f10278r, o0Var.f10278r) && Objects.equals(this.f10279s, o0Var.f10279s) && Objects.equals(this.f10281u, o0Var.f10281u) && Objects.equals(this.v, o0Var.v) && Objects.equals(this.f10282w, o0Var.f10282w) && Objects.equals(this.f10283x, o0Var.f10283x) && Objects.equals(this.f10284y, o0Var.f10284y) && Objects.equals(this.f10285z, o0Var.f10285z) && TextUtils.equals(this.A, o0Var.A) && TextUtils.equals(this.B, o0Var.B) && TextUtils.equals(this.C, o0Var.C) && Objects.equals(this.D, o0Var.D) && Objects.equals(this.E, o0Var.E) && TextUtils.equals(this.F, o0Var.F) && TextUtils.equals(this.G, o0Var.G) && TextUtils.equals(this.H, o0Var.H) && Objects.equals(this.I, o0Var.I) && Objects.equals(this.K, o0Var.K)) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f10271k));
        if (this.J == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f10263a, this.f10264b, this.f10265c, this.d, this.f10266e, this.f10267f, this.f10268g, this.h, this.f10269i, this.f10270j, valueOf, this.f10273m, this.f10274n, this.f10275o, this.f10276p, this.f10277q, this.f10278r, this.f10279s, this.f10281u, this.v, this.f10282w, this.f10283x, this.f10284y, this.f10285z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, Boolean.valueOf(z10), this.K);
    }
}
