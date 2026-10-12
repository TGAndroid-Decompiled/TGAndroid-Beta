package b2;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import v7.u6;
public final class s0 {
    public static final s0 L = new s0(new r0());
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
    public static final String f2323a0;
    public static final String f2324b0;
    public static final String f2325c0;
    public static final String f2326d0;
    public static final String f2327e0;
    public static final String f2328f0;
    public static final String f2329g0;
    public static final String f2330h0;
    public static final String f2331i0;
    public static final String f2332j0;
    public static final String f2333k0;
    public static final String f2334l0;
    public static final String m0;
    public static final String f2335n0;
    public static final String f2336o0;
    public static final String f2337p0;
    public static final String f2338q0;
    public static final String f2339r0;
    public static final String f2340s0;
    public static final String f2341t0;
    public static final String f2342u0;
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
    public final e9.n0 K;
    public final CharSequence f2343a;
    public final CharSequence f2344b;
    public final CharSequence f2345c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f2346f;
    public final CharSequence f2347g;
    public final Long h;
    public final h1 f2348i;
    public final h1 f2349j;
    public final byte[] f2350k;
    public m f2351l;
    public final Integer f2352m;
    public final Uri f2353n;
    public final Integer f2354o;
    public final Integer f2355p;
    public final Integer f2356q;
    public final Boolean f2357r;
    public final Boolean f2358s;
    public final Integer f2359t;
    public final Integer f2360u;
    public final Integer v;
    public final Integer f2361w;
    public final Integer f2362x;
    public final Integer f2363y;
    public final Integer f2364z;

    static {
        String str = e2.m0.f8372a;
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
        f2323a0 = Integer.toString(15, 36);
        f2324b0 = Integer.toString(16, 36);
        f2325c0 = Integer.toString(17, 36);
        f2326d0 = Integer.toString(18, 36);
        f2327e0 = Integer.toString(19, 36);
        f2328f0 = Integer.toString(20, 36);
        f2329g0 = Integer.toString(21, 36);
        f2330h0 = Integer.toString(22, 36);
        f2331i0 = Integer.toString(23, 36);
        f2332j0 = Integer.toString(24, 36);
        f2333k0 = Integer.toString(25, 36);
        f2334l0 = Integer.toString(26, 36);
        m0 = Integer.toString(27, 36);
        f2335n0 = Integer.toString(28, 36);
        f2336o0 = Integer.toString(29, 36);
        f2337p0 = Integer.toString(30, 36);
        f2338q0 = Integer.toString(31, 36);
        f2339r0 = Integer.toString(32, 36);
        f2340s0 = Integer.toString(33, 36);
        f2341t0 = Integer.toString(34, 36);
        f2342u0 = Integer.toString(1000, 36);
    }

    public s0(r0 r0Var) {
        Boolean bool = r0Var.f2309r;
        Integer num = r0Var.f2308q;
        Integer num2 = r0Var.H;
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
        this.f2343a = r0Var.f2295a;
        this.f2344b = r0Var.f2296b;
        this.f2345c = r0Var.f2297c;
        this.d = r0Var.d;
        this.e = r0Var.e;
        this.f2346f = r0Var.f2298f;
        this.f2347g = r0Var.f2299g;
        this.h = r0Var.h;
        this.f2348i = r0Var.f2300i;
        this.f2349j = r0Var.f2301j;
        this.f2350k = r0Var.f2302k;
        this.f2351l = r0Var.f2303l;
        this.f2352m = r0Var.f2304m;
        this.f2353n = r0Var.f2305n;
        this.f2354o = r0Var.f2306o;
        this.f2355p = r0Var.f2307p;
        this.f2356q = num;
        this.f2357r = bool;
        this.f2358s = r0Var.f2310s;
        Integer num3 = r0Var.f2311t;
        this.f2359t = num3;
        this.f2360u = num3;
        this.v = r0Var.f2312u;
        this.f2361w = r0Var.v;
        this.f2362x = r0Var.f2313w;
        this.f2363y = r0Var.f2314x;
        this.f2364z = r0Var.f2315y;
        this.A = r0Var.f2316z;
        this.B = r0Var.A;
        this.C = r0Var.B;
        this.D = r0Var.C;
        this.E = r0Var.D;
        this.F = r0Var.E;
        this.G = r0Var.F;
        this.H = r0Var.G;
        this.I = num2;
        this.K = r0Var.J;
        this.J = r0Var.I;
    }

    public static s0 b(int i10, Bundle bundle) {
        boolean z10;
        Bundle bundle2;
        Bundle bundle3;
        Integer num;
        r0 r0Var = new r0();
        r0Var.f2295a = bundle.getCharSequence(M);
        r0Var.f2296b = bundle.getCharSequence(N);
        r0Var.f2297c = bundle.getCharSequence(O);
        r0Var.d = bundle.getCharSequence(P);
        r0Var.e = bundle.getCharSequence(Q);
        r0Var.f2298f = bundle.getCharSequence(R);
        r0Var.f2299g = bundle.getCharSequence(S);
        r0Var.f2305n = (Uri) bundle.getParcelable(W);
        r0Var.f2316z = bundle.getCharSequence(f2330h0);
        r0Var.A = bundle.getCharSequence(f2331i0);
        r0Var.B = bundle.getCharSequence(f2332j0);
        r0Var.E = bundle.getCharSequence(m0);
        r0Var.F = bundle.getCharSequence(f2335n0);
        r0Var.G = bundle.getCharSequence(f2337p0);
        r0Var.I = e2.m0.o(bundle.getBundle(f2342u0));
        String str = V;
        if (bundle.containsKey(str)) {
            String str2 = f2336o0;
            byte[] bArr = null;
            if (bundle.containsKey(str2)) {
                num = Integer.valueOf(bundle.getInt(str2));
            } else {
                num = null;
            }
            if (i10 >= 9) {
                Bundle bundle4 = bundle.getBundle(str);
                if (bundle4 != null) {
                    IBinder binder = bundle4.getBinder(m.e);
                    if (binder != null) {
                        if (binder instanceof j) {
                            bArr = ((j) binder).f2166a.f2204a;
                        } else if (Build.VERSION.SDK_INT < 27 || (bArr = k.b(bundle4)) == null) {
                            bArr = l.a(bundle4);
                        }
                    }
                    r0Var.b(bArr, num);
                }
            } else {
                r0Var.b(bundle.getByteArray(str), num);
            }
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle3 = bundle.getBundle(str3)) != null) {
            r0Var.f2300i = h1.a(bundle3);
        }
        String str4 = U;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            r0Var.f2301j = h1.a(bundle2);
        }
        String str5 = f2340s0;
        if (bundle.containsKey(str5)) {
            long j10 = bundle.getLong(str5);
            Long valueOf = Long.valueOf(j10);
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.g(z10);
            r0Var.h = valueOf;
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            r0Var.f2306o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            r0Var.f2307p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = Z;
        if (bundle.containsKey(str8)) {
            r0Var.f2308q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = f2339r0;
        if (bundle.containsKey(str9)) {
            r0Var.f2309r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f2323a0;
        if (bundle.containsKey(str10)) {
            r0Var.f2310s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = f2324b0;
        if (bundle.containsKey(str11)) {
            r0Var.f2311t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f2325c0;
        if (bundle.containsKey(str12)) {
            r0Var.f2312u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f2326d0;
        if (bundle.containsKey(str13)) {
            r0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f2327e0;
        if (bundle.containsKey(str14)) {
            r0Var.f2313w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f2328f0;
        if (bundle.containsKey(str15)) {
            r0Var.f2314x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f2329g0;
        if (bundle.containsKey(str16)) {
            r0Var.f2315y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f2333k0;
        if (bundle.containsKey(str17)) {
            r0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f2334l0;
        if (bundle.containsKey(str18)) {
            r0Var.D = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = f2338q0;
        if (bundle.containsKey(str19)) {
            r0Var.H = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f2341t0);
        if (stringArrayList != null) {
            r0Var.J = e9.n0.u(stringArrayList);
        }
        return new s0(r0Var);
    }

    public final r0 a() {
        ?? obj = new Object();
        obj.f2295a = this.f2343a;
        obj.f2296b = this.f2344b;
        obj.f2297c = this.f2345c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f2298f = this.f2346f;
        obj.f2299g = this.f2347g;
        obj.h = this.h;
        obj.f2300i = this.f2348i;
        obj.f2301j = this.f2349j;
        obj.f2302k = this.f2350k;
        obj.f2303l = this.f2351l;
        obj.f2304m = this.f2352m;
        obj.f2305n = this.f2353n;
        obj.f2306o = this.f2354o;
        obj.f2307p = this.f2355p;
        obj.f2308q = this.f2356q;
        obj.f2309r = this.f2357r;
        obj.f2310s = this.f2358s;
        obj.f2311t = this.f2360u;
        obj.f2312u = this.v;
        obj.v = this.f2361w;
        obj.f2313w = this.f2362x;
        obj.f2314x = this.f2363y;
        obj.f2315y = this.f2364z;
        obj.f2316z = this.A;
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

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f2343a;
        if (charSequence != null) {
            bundle.putCharSequence(M, charSequence);
        }
        CharSequence charSequence2 = this.f2344b;
        if (charSequence2 != null) {
            bundle.putCharSequence(N, charSequence2);
        }
        CharSequence charSequence3 = this.f2345c;
        if (charSequence3 != null) {
            bundle.putCharSequence(O, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(P, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(Q, charSequence5);
        }
        CharSequence charSequence6 = this.f2346f;
        if (charSequence6 != null) {
            bundle.putCharSequence(R, charSequence6);
        }
        CharSequence charSequence7 = this.f2347g;
        if (charSequence7 != null) {
            bundle.putCharSequence(S, charSequence7);
        }
        Long l4 = this.h;
        if (l4 != null) {
            bundle.putLong(f2340s0, l4.longValue());
        }
        byte[] bArr = this.f2350k;
        if (bArr != null) {
            String str = V;
            if (i10 >= 9) {
                if (this.f2351l == null) {
                    this.f2351l = new m(bArr);
                }
                m mVar = this.f2351l;
                byte[] bArr2 = mVar.f2204a;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(m.e, mVar.f2205b);
                if (Build.VERSION.SDK_INT >= 27 && bArr2.length > 0) {
                    if (mVar.f2206c == null) {
                        mVar.f2206c = k.a(bArr2);
                    }
                    k kVar = mVar.f2206c;
                    if (kVar != null) {
                        bundle2.putParcelable(m.f2202f, kVar.f2179a);
                        bundle.putBundle(str, bundle2);
                    }
                }
                if (mVar.d == null) {
                    mVar.d = new l(bArr2);
                }
                l lVar = mVar.d;
                int i11 = l.f2195b;
                lVar.getClass();
                bundle2.putBinder(m.f2203g, lVar.f2196a);
                bundle.putBundle(str, bundle2);
            } else if (bArr.length <= 500000) {
                bundle.putByteArray(str, bArr);
            }
        }
        Uri uri = this.f2353n;
        if (uri != null) {
            bundle.putParcelable(W, uri);
        }
        CharSequence charSequence8 = this.A;
        if (charSequence8 != null) {
            bundle.putCharSequence(f2330h0, charSequence8);
        }
        CharSequence charSequence9 = this.B;
        if (charSequence9 != null) {
            bundle.putCharSequence(f2331i0, charSequence9);
        }
        CharSequence charSequence10 = this.C;
        if (charSequence10 != null) {
            bundle.putCharSequence(f2332j0, charSequence10);
        }
        CharSequence charSequence11 = this.F;
        if (charSequence11 != null) {
            bundle.putCharSequence(m0, charSequence11);
        }
        CharSequence charSequence12 = this.G;
        if (charSequence12 != null) {
            bundle.putCharSequence(f2335n0, charSequence12);
        }
        CharSequence charSequence13 = this.H;
        if (charSequence13 != null) {
            bundle.putCharSequence(f2337p0, charSequence13);
        }
        h1 h1Var = this.f2348i;
        if (h1Var != null) {
            bundle.putBundle(T, h1Var.c());
        }
        h1 h1Var2 = this.f2349j;
        if (h1Var2 != null) {
            bundle.putBundle(U, h1Var2.c());
        }
        Integer num = this.f2354o;
        if (num != null) {
            bundle.putInt(X, num.intValue());
        }
        Integer num2 = this.f2355p;
        if (num2 != null) {
            bundle.putInt(Y, num2.intValue());
        }
        Integer num3 = this.f2356q;
        if (num3 != null) {
            bundle.putInt(Z, num3.intValue());
        }
        Boolean bool = this.f2357r;
        if (bool != null) {
            bundle.putBoolean(f2339r0, bool.booleanValue());
        }
        Boolean bool2 = this.f2358s;
        if (bool2 != null) {
            bundle.putBoolean(f2323a0, bool2.booleanValue());
        }
        Integer num4 = this.f2360u;
        if (num4 != null) {
            bundle.putInt(f2324b0, num4.intValue());
        }
        Integer num5 = this.v;
        if (num5 != null) {
            bundle.putInt(f2325c0, num5.intValue());
        }
        Integer num6 = this.f2361w;
        if (num6 != null) {
            bundle.putInt(f2326d0, num6.intValue());
        }
        Integer num7 = this.f2362x;
        if (num7 != null) {
            bundle.putInt(f2327e0, num7.intValue());
        }
        Integer num8 = this.f2363y;
        if (num8 != null) {
            bundle.putInt(f2328f0, num8.intValue());
        }
        Integer num9 = this.f2364z;
        if (num9 != null) {
            bundle.putInt(f2329g0, num9.intValue());
        }
        Integer num10 = this.D;
        if (num10 != null) {
            bundle.putInt(f2333k0, num10.intValue());
        }
        Integer num11 = this.E;
        if (num11 != null) {
            bundle.putInt(f2334l0, num11.intValue());
        }
        Integer num12 = this.f2352m;
        if (num12 != null) {
            bundle.putInt(f2336o0, num12.intValue());
        }
        Integer num13 = this.I;
        if (num13 != null) {
            bundle.putInt(f2338q0, num13.intValue());
        }
        e9.n0 n0Var = this.K;
        if (!n0Var.isEmpty()) {
            bundle.putStringArrayList(f2341t0, new ArrayList<>(n0Var));
        }
        Bundle bundle3 = this.J;
        if (bundle3 != null) {
            bundle.putBundle(f2342u0, bundle3);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj != null && s0.class == obj.getClass()) {
            s0 s0Var = (s0) obj;
            if (TextUtils.equals(this.f2343a, s0Var.f2343a) && TextUtils.equals(this.f2344b, s0Var.f2344b) && TextUtils.equals(this.f2345c, s0Var.f2345c) && TextUtils.equals(this.d, s0Var.d) && TextUtils.equals(this.e, s0Var.e) && TextUtils.equals(this.f2346f, s0Var.f2346f) && TextUtils.equals(this.f2347g, s0Var.f2347g) && Objects.equals(this.h, s0Var.h) && Objects.equals(this.f2348i, s0Var.f2348i) && Objects.equals(this.f2349j, s0Var.f2349j) && Arrays.equals(this.f2350k, s0Var.f2350k) && Objects.equals(this.f2352m, s0Var.f2352m) && Objects.equals(this.f2353n, s0Var.f2353n) && Objects.equals(this.f2354o, s0Var.f2354o) && Objects.equals(this.f2355p, s0Var.f2355p) && Objects.equals(this.f2356q, s0Var.f2356q) && Objects.equals(this.f2357r, s0Var.f2357r) && Objects.equals(this.f2358s, s0Var.f2358s) && Objects.equals(this.f2360u, s0Var.f2360u) && Objects.equals(this.v, s0Var.v) && Objects.equals(this.f2361w, s0Var.f2361w) && Objects.equals(this.f2362x, s0Var.f2362x) && Objects.equals(this.f2363y, s0Var.f2363y) && Objects.equals(this.f2364z, s0Var.f2364z) && TextUtils.equals(this.A, s0Var.A) && TextUtils.equals(this.B, s0Var.B) && TextUtils.equals(this.C, s0Var.C) && Objects.equals(this.D, s0Var.D) && Objects.equals(this.E, s0Var.E) && TextUtils.equals(this.F, s0Var.F) && TextUtils.equals(this.G, s0Var.G) && TextUtils.equals(this.H, s0Var.H) && Objects.equals(this.I, s0Var.I) && Objects.equals(this.K, s0Var.K)) {
                if (this.J == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (s0Var.J == null) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f2350k));
        if (this.J == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f2343a, this.f2344b, this.f2345c, this.d, this.e, this.f2346f, this.f2347g, this.h, this.f2348i, this.f2349j, valueOf, this.f2352m, this.f2353n, this.f2354o, this.f2355p, this.f2356q, this.f2357r, this.f2358s, this.f2360u, this.v, this.f2361w, this.f2362x, this.f2363y, this.f2364z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, Boolean.valueOf(z10), this.K);
    }
}
