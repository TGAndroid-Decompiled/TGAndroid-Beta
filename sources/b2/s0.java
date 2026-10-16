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
    public static final String f2327a0;
    public static final String f2328b0;
    public static final String f2329c0;
    public static final String f2330d0;
    public static final String f2331e0;
    public static final String f2332f0;
    public static final String f2333g0;
    public static final String f2334h0;
    public static final String f2335i0;
    public static final String f2336j0;
    public static final String f2337k0;
    public static final String f2338l0;
    public static final String m0;
    public static final String f2339n0;
    public static final String f2340o0;
    public static final String f2341p0;
    public static final String f2342q0;
    public static final String f2343r0;
    public static final String f2344s0;
    public static final String f2345t0;
    public static final String f2346u0;
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
    public final CharSequence f2347a;
    public final CharSequence f2348b;
    public final CharSequence f2349c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f2350f;
    public final CharSequence f2351g;
    public final Long h;
    public final h1 f2352i;
    public final h1 f2353j;
    public final byte[] f2354k;
    public m f2355l;
    public final Integer f2356m;
    public final Uri f2357n;
    public final Integer f2358o;
    public final Integer f2359p;
    public final Integer f2360q;
    public final Boolean f2361r;
    public final Boolean f2362s;
    public final Integer f2363t;
    public final Integer f2364u;
    public final Integer v;
    public final Integer f2365w;
    public final Integer f2366x;
    public final Integer f2367y;
    public final Integer f2368z;

    static {
        String str = e2.m0.f8375a;
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
        f2327a0 = Integer.toString(15, 36);
        f2328b0 = Integer.toString(16, 36);
        f2329c0 = Integer.toString(17, 36);
        f2330d0 = Integer.toString(18, 36);
        f2331e0 = Integer.toString(19, 36);
        f2332f0 = Integer.toString(20, 36);
        f2333g0 = Integer.toString(21, 36);
        f2334h0 = Integer.toString(22, 36);
        f2335i0 = Integer.toString(23, 36);
        f2336j0 = Integer.toString(24, 36);
        f2337k0 = Integer.toString(25, 36);
        f2338l0 = Integer.toString(26, 36);
        m0 = Integer.toString(27, 36);
        f2339n0 = Integer.toString(28, 36);
        f2340o0 = Integer.toString(29, 36);
        f2341p0 = Integer.toString(30, 36);
        f2342q0 = Integer.toString(31, 36);
        f2343r0 = Integer.toString(32, 36);
        f2344s0 = Integer.toString(33, 36);
        f2345t0 = Integer.toString(34, 36);
        f2346u0 = Integer.toString(1000, 36);
    }

    public s0(r0 r0Var) {
        Boolean bool = r0Var.f2313r;
        Integer num = r0Var.f2312q;
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
        this.f2347a = r0Var.f2299a;
        this.f2348b = r0Var.f2300b;
        this.f2349c = r0Var.f2301c;
        this.d = r0Var.d;
        this.e = r0Var.e;
        this.f2350f = r0Var.f2302f;
        this.f2351g = r0Var.f2303g;
        this.h = r0Var.h;
        this.f2352i = r0Var.f2304i;
        this.f2353j = r0Var.f2305j;
        this.f2354k = r0Var.f2306k;
        this.f2355l = r0Var.f2307l;
        this.f2356m = r0Var.f2308m;
        this.f2357n = r0Var.f2309n;
        this.f2358o = r0Var.f2310o;
        this.f2359p = r0Var.f2311p;
        this.f2360q = num;
        this.f2361r = bool;
        this.f2362s = r0Var.f2314s;
        Integer num3 = r0Var.f2315t;
        this.f2363t = num3;
        this.f2364u = num3;
        this.v = r0Var.f2316u;
        this.f2365w = r0Var.v;
        this.f2366x = r0Var.f2317w;
        this.f2367y = r0Var.f2318x;
        this.f2368z = r0Var.f2319y;
        this.A = r0Var.f2320z;
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
        r0Var.f2299a = bundle.getCharSequence(M);
        r0Var.f2300b = bundle.getCharSequence(N);
        r0Var.f2301c = bundle.getCharSequence(O);
        r0Var.d = bundle.getCharSequence(P);
        r0Var.e = bundle.getCharSequence(Q);
        r0Var.f2302f = bundle.getCharSequence(R);
        r0Var.f2303g = bundle.getCharSequence(S);
        r0Var.f2309n = (Uri) bundle.getParcelable(W);
        r0Var.f2320z = bundle.getCharSequence(f2334h0);
        r0Var.A = bundle.getCharSequence(f2335i0);
        r0Var.B = bundle.getCharSequence(f2336j0);
        r0Var.E = bundle.getCharSequence(m0);
        r0Var.F = bundle.getCharSequence(f2339n0);
        r0Var.G = bundle.getCharSequence(f2341p0);
        r0Var.I = e2.m0.o(bundle.getBundle(f2346u0));
        String str = V;
        if (bundle.containsKey(str)) {
            String str2 = f2340o0;
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
                            bArr = ((j) binder).f2170a.f2208a;
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
            r0Var.f2304i = h1.a(bundle3);
        }
        String str4 = U;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            r0Var.f2305j = h1.a(bundle2);
        }
        String str5 = f2344s0;
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
            r0Var.f2310o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            r0Var.f2311p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = Z;
        if (bundle.containsKey(str8)) {
            r0Var.f2312q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = f2343r0;
        if (bundle.containsKey(str9)) {
            r0Var.f2313r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f2327a0;
        if (bundle.containsKey(str10)) {
            r0Var.f2314s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = f2328b0;
        if (bundle.containsKey(str11)) {
            r0Var.f2315t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f2329c0;
        if (bundle.containsKey(str12)) {
            r0Var.f2316u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f2330d0;
        if (bundle.containsKey(str13)) {
            r0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f2331e0;
        if (bundle.containsKey(str14)) {
            r0Var.f2317w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f2332f0;
        if (bundle.containsKey(str15)) {
            r0Var.f2318x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f2333g0;
        if (bundle.containsKey(str16)) {
            r0Var.f2319y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f2337k0;
        if (bundle.containsKey(str17)) {
            r0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f2338l0;
        if (bundle.containsKey(str18)) {
            r0Var.D = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = f2342q0;
        if (bundle.containsKey(str19)) {
            r0Var.H = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f2345t0);
        if (stringArrayList != null) {
            r0Var.J = e9.n0.u(stringArrayList);
        }
        return new s0(r0Var);
    }

    public final r0 a() {
        ?? obj = new Object();
        obj.f2299a = this.f2347a;
        obj.f2300b = this.f2348b;
        obj.f2301c = this.f2349c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f2302f = this.f2350f;
        obj.f2303g = this.f2351g;
        obj.h = this.h;
        obj.f2304i = this.f2352i;
        obj.f2305j = this.f2353j;
        obj.f2306k = this.f2354k;
        obj.f2307l = this.f2355l;
        obj.f2308m = this.f2356m;
        obj.f2309n = this.f2357n;
        obj.f2310o = this.f2358o;
        obj.f2311p = this.f2359p;
        obj.f2312q = this.f2360q;
        obj.f2313r = this.f2361r;
        obj.f2314s = this.f2362s;
        obj.f2315t = this.f2364u;
        obj.f2316u = this.v;
        obj.v = this.f2365w;
        obj.f2317w = this.f2366x;
        obj.f2318x = this.f2367y;
        obj.f2319y = this.f2368z;
        obj.f2320z = this.A;
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
        CharSequence charSequence = this.f2347a;
        if (charSequence != null) {
            bundle.putCharSequence(M, charSequence);
        }
        CharSequence charSequence2 = this.f2348b;
        if (charSequence2 != null) {
            bundle.putCharSequence(N, charSequence2);
        }
        CharSequence charSequence3 = this.f2349c;
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
        CharSequence charSequence6 = this.f2350f;
        if (charSequence6 != null) {
            bundle.putCharSequence(R, charSequence6);
        }
        CharSequence charSequence7 = this.f2351g;
        if (charSequence7 != null) {
            bundle.putCharSequence(S, charSequence7);
        }
        Long l4 = this.h;
        if (l4 != null) {
            bundle.putLong(f2344s0, l4.longValue());
        }
        byte[] bArr = this.f2354k;
        if (bArr != null) {
            String str = V;
            if (i10 >= 9) {
                if (this.f2355l == null) {
                    this.f2355l = new m(bArr);
                }
                m mVar = this.f2355l;
                byte[] bArr2 = mVar.f2208a;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(m.e, mVar.f2209b);
                if (Build.VERSION.SDK_INT >= 27 && bArr2.length > 0) {
                    if (mVar.f2210c == null) {
                        mVar.f2210c = k.a(bArr2);
                    }
                    k kVar = mVar.f2210c;
                    if (kVar != null) {
                        bundle2.putParcelable(m.f2206f, kVar.f2183a);
                        bundle.putBundle(str, bundle2);
                    }
                }
                if (mVar.d == null) {
                    mVar.d = new l(bArr2);
                }
                l lVar = mVar.d;
                int i11 = l.f2199b;
                lVar.getClass();
                bundle2.putBinder(m.f2207g, lVar.f2200a);
                bundle.putBundle(str, bundle2);
            } else if (bArr.length <= 500000) {
                bundle.putByteArray(str, bArr);
            }
        }
        Uri uri = this.f2357n;
        if (uri != null) {
            bundle.putParcelable(W, uri);
        }
        CharSequence charSequence8 = this.A;
        if (charSequence8 != null) {
            bundle.putCharSequence(f2334h0, charSequence8);
        }
        CharSequence charSequence9 = this.B;
        if (charSequence9 != null) {
            bundle.putCharSequence(f2335i0, charSequence9);
        }
        CharSequence charSequence10 = this.C;
        if (charSequence10 != null) {
            bundle.putCharSequence(f2336j0, charSequence10);
        }
        CharSequence charSequence11 = this.F;
        if (charSequence11 != null) {
            bundle.putCharSequence(m0, charSequence11);
        }
        CharSequence charSequence12 = this.G;
        if (charSequence12 != null) {
            bundle.putCharSequence(f2339n0, charSequence12);
        }
        CharSequence charSequence13 = this.H;
        if (charSequence13 != null) {
            bundle.putCharSequence(f2341p0, charSequence13);
        }
        h1 h1Var = this.f2352i;
        if (h1Var != null) {
            bundle.putBundle(T, h1Var.c());
        }
        h1 h1Var2 = this.f2353j;
        if (h1Var2 != null) {
            bundle.putBundle(U, h1Var2.c());
        }
        Integer num = this.f2358o;
        if (num != null) {
            bundle.putInt(X, num.intValue());
        }
        Integer num2 = this.f2359p;
        if (num2 != null) {
            bundle.putInt(Y, num2.intValue());
        }
        Integer num3 = this.f2360q;
        if (num3 != null) {
            bundle.putInt(Z, num3.intValue());
        }
        Boolean bool = this.f2361r;
        if (bool != null) {
            bundle.putBoolean(f2343r0, bool.booleanValue());
        }
        Boolean bool2 = this.f2362s;
        if (bool2 != null) {
            bundle.putBoolean(f2327a0, bool2.booleanValue());
        }
        Integer num4 = this.f2364u;
        if (num4 != null) {
            bundle.putInt(f2328b0, num4.intValue());
        }
        Integer num5 = this.v;
        if (num5 != null) {
            bundle.putInt(f2329c0, num5.intValue());
        }
        Integer num6 = this.f2365w;
        if (num6 != null) {
            bundle.putInt(f2330d0, num6.intValue());
        }
        Integer num7 = this.f2366x;
        if (num7 != null) {
            bundle.putInt(f2331e0, num7.intValue());
        }
        Integer num8 = this.f2367y;
        if (num8 != null) {
            bundle.putInt(f2332f0, num8.intValue());
        }
        Integer num9 = this.f2368z;
        if (num9 != null) {
            bundle.putInt(f2333g0, num9.intValue());
        }
        Integer num10 = this.D;
        if (num10 != null) {
            bundle.putInt(f2337k0, num10.intValue());
        }
        Integer num11 = this.E;
        if (num11 != null) {
            bundle.putInt(f2338l0, num11.intValue());
        }
        Integer num12 = this.f2356m;
        if (num12 != null) {
            bundle.putInt(f2340o0, num12.intValue());
        }
        Integer num13 = this.I;
        if (num13 != null) {
            bundle.putInt(f2342q0, num13.intValue());
        }
        e9.n0 n0Var = this.K;
        if (!n0Var.isEmpty()) {
            bundle.putStringArrayList(f2345t0, new ArrayList<>(n0Var));
        }
        Bundle bundle3 = this.J;
        if (bundle3 != null) {
            bundle.putBundle(f2346u0, bundle3);
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
            if (TextUtils.equals(this.f2347a, s0Var.f2347a) && TextUtils.equals(this.f2348b, s0Var.f2348b) && TextUtils.equals(this.f2349c, s0Var.f2349c) && TextUtils.equals(this.d, s0Var.d) && TextUtils.equals(this.e, s0Var.e) && TextUtils.equals(this.f2350f, s0Var.f2350f) && TextUtils.equals(this.f2351g, s0Var.f2351g) && Objects.equals(this.h, s0Var.h) && Objects.equals(this.f2352i, s0Var.f2352i) && Objects.equals(this.f2353j, s0Var.f2353j) && Arrays.equals(this.f2354k, s0Var.f2354k) && Objects.equals(this.f2356m, s0Var.f2356m) && Objects.equals(this.f2357n, s0Var.f2357n) && Objects.equals(this.f2358o, s0Var.f2358o) && Objects.equals(this.f2359p, s0Var.f2359p) && Objects.equals(this.f2360q, s0Var.f2360q) && Objects.equals(this.f2361r, s0Var.f2361r) && Objects.equals(this.f2362s, s0Var.f2362s) && Objects.equals(this.f2364u, s0Var.f2364u) && Objects.equals(this.v, s0Var.v) && Objects.equals(this.f2365w, s0Var.f2365w) && Objects.equals(this.f2366x, s0Var.f2366x) && Objects.equals(this.f2367y, s0Var.f2367y) && Objects.equals(this.f2368z, s0Var.f2368z) && TextUtils.equals(this.A, s0Var.A) && TextUtils.equals(this.B, s0Var.B) && TextUtils.equals(this.C, s0Var.C) && Objects.equals(this.D, s0Var.D) && Objects.equals(this.E, s0Var.E) && TextUtils.equals(this.F, s0Var.F) && TextUtils.equals(this.G, s0Var.G) && TextUtils.equals(this.H, s0Var.H) && Objects.equals(this.I, s0Var.I) && Objects.equals(this.K, s0Var.K)) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f2354k));
        if (this.J == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f2347a, this.f2348b, this.f2349c, this.d, this.e, this.f2350f, this.f2351g, this.h, this.f2352i, this.f2353j, valueOf, this.f2356m, this.f2357n, this.f2358o, this.f2359p, this.f2360q, this.f2361r, this.f2362s, this.f2364u, this.v, this.f2365w, this.f2366x, this.f2367y, this.f2368z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, Boolean.valueOf(z10), this.K);
    }
}
