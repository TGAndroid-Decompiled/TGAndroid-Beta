package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
public final class n0 {
    public static final n0 K = new n0(new m0());
    public static final String L;
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
    public static final String f2177a0;
    public static final String f2178b0;
    public static final String f2179c0;
    public static final String f2180d0;
    public static final String f2181e0;
    public static final String f2182f0;
    public static final String f2183g0;
    public static final String f2184h0;
    public static final String f2185i0;
    public static final String f2186j0;
    public static final String f2187k0;
    public static final String f2188l0;
    public static final String m0;
    public static final String f2189n0;
    public static final String f2190o0;
    public static final String f2191p0;
    public static final String f2192q0;
    public static final String f2193r0;
    public static final String f2194s0;
    public static final String f2195t0;
    public final CharSequence A;
    public final CharSequence B;
    public final Integer C;
    public final Integer D;
    public final CharSequence E;
    public final CharSequence F;
    public final CharSequence G;
    public final Integer H;
    public final Bundle I;
    public final e9.i0 J;
    public final CharSequence f2196a;
    public final CharSequence f2197b;
    public final CharSequence f2198c;
    public final CharSequence d;
    public final CharSequence f2199e;
    public final CharSequence f2200f;
    public final CharSequence f2201g;
    public final Long h;
    public final c1 f2202i;
    public final c1 f2203j;
    public final byte[] f2204k;
    public final Integer f2205l;
    public final Uri f2206m;
    public final Integer f2207n;
    public final Integer f2208o;
    public final Integer f2209p;
    public final Boolean f2210q;
    public final Boolean f2211r;
    public final Integer f2212s;
    public final Integer f2213t;
    public final Integer f2214u;
    public final Integer v;
    public final Integer f2215w;
    public final Integer f2216x;
    public final Integer f2217y;
    public final CharSequence f2218z;

    static {
        String str = e2.d0.f8737a;
        L = Integer.toString(0, 36);
        M = Integer.toString(1, 36);
        N = Integer.toString(2, 36);
        O = Integer.toString(3, 36);
        P = Integer.toString(4, 36);
        Q = Integer.toString(5, 36);
        R = Integer.toString(6, 36);
        S = Integer.toString(8, 36);
        T = Integer.toString(9, 36);
        U = Integer.toString(10, 36);
        V = Integer.toString(11, 36);
        W = Integer.toString(12, 36);
        X = Integer.toString(13, 36);
        Y = Integer.toString(14, 36);
        Z = Integer.toString(15, 36);
        f2177a0 = Integer.toString(16, 36);
        f2178b0 = Integer.toString(17, 36);
        f2179c0 = Integer.toString(18, 36);
        f2180d0 = Integer.toString(19, 36);
        f2181e0 = Integer.toString(20, 36);
        f2182f0 = Integer.toString(21, 36);
        f2183g0 = Integer.toString(22, 36);
        f2184h0 = Integer.toString(23, 36);
        f2185i0 = Integer.toString(24, 36);
        f2186j0 = Integer.toString(25, 36);
        f2187k0 = Integer.toString(26, 36);
        f2188l0 = Integer.toString(27, 36);
        m0 = Integer.toString(28, 36);
        f2189n0 = Integer.toString(29, 36);
        f2190o0 = Integer.toString(30, 36);
        f2191p0 = Integer.toString(31, 36);
        f2192q0 = Integer.toString(32, 36);
        f2193r0 = Integer.toString(33, 36);
        f2194s0 = Integer.toString(34, 36);
        f2195t0 = Integer.toString(1000, 36);
    }

    public n0(m0 m0Var) {
        Boolean bool = m0Var.f2161q;
        Integer num = m0Var.f2160p;
        Integer num2 = m0Var.G;
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
        this.f2196a = m0Var.f2147a;
        this.f2197b = m0Var.f2148b;
        this.f2198c = m0Var.f2149c;
        this.d = m0Var.d;
        this.f2199e = m0Var.f2150e;
        this.f2200f = m0Var.f2151f;
        this.f2201g = m0Var.f2152g;
        this.h = m0Var.h;
        this.f2202i = m0Var.f2153i;
        this.f2203j = m0Var.f2154j;
        this.f2204k = m0Var.f2155k;
        this.f2205l = m0Var.f2156l;
        this.f2206m = m0Var.f2157m;
        this.f2207n = m0Var.f2158n;
        this.f2208o = m0Var.f2159o;
        this.f2209p = num;
        this.f2210q = bool;
        this.f2211r = m0Var.f2162r;
        Integer num3 = m0Var.f2163s;
        this.f2212s = num3;
        this.f2213t = num3;
        this.f2214u = m0Var.f2164t;
        this.v = m0Var.f2165u;
        this.f2215w = m0Var.v;
        this.f2216x = m0Var.f2166w;
        this.f2217y = m0Var.f2167x;
        this.f2218z = m0Var.f2168y;
        this.A = m0Var.f2169z;
        this.B = m0Var.A;
        this.C = m0Var.B;
        this.D = m0Var.C;
        this.E = m0Var.D;
        this.F = m0Var.E;
        this.G = m0Var.F;
        this.H = num2;
        this.J = m0Var.I;
        this.I = m0Var.H;
    }

    public static n0 b(Bundle bundle) {
        Integer num;
        boolean z10;
        Bundle bundle2;
        Bundle bundle3;
        m0 m0Var = new m0();
        m0Var.f2147a = bundle.getCharSequence(L);
        m0Var.f2148b = bundle.getCharSequence(M);
        m0Var.f2149c = bundle.getCharSequence(N);
        m0Var.d = bundle.getCharSequence(O);
        m0Var.f2150e = bundle.getCharSequence(P);
        m0Var.f2151f = bundle.getCharSequence(Q);
        m0Var.f2152g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = f2189n0;
        byte[] bArr = null;
        if (bundle.containsKey(str)) {
            num = Integer.valueOf(bundle.getInt(str));
        } else {
            num = null;
        }
        if (byteArray != null) {
            bArr = (byte[]) byteArray.clone();
        }
        m0Var.f2155k = bArr;
        m0Var.f2156l = num;
        m0Var.f2157m = (Uri) bundle.getParcelable(V);
        m0Var.f2168y = bundle.getCharSequence(f2183g0);
        m0Var.f2169z = bundle.getCharSequence(f2184h0);
        m0Var.A = bundle.getCharSequence(f2185i0);
        m0Var.D = bundle.getCharSequence(f2188l0);
        m0Var.E = bundle.getCharSequence(m0);
        m0Var.F = bundle.getCharSequence(f2190o0);
        m0Var.H = bundle.getBundle(f2195t0);
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            m0Var.f2153i = c1.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            m0Var.f2154j = c1.a(bundle2);
        }
        String str4 = f2193r0;
        if (bundle.containsKey(str4)) {
            long j3 = bundle.getLong(str4);
            Long valueOf = Long.valueOf(j3);
            if (j3 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.b(z10);
            m0Var.h = valueOf;
        }
        String str5 = W;
        if (bundle.containsKey(str5)) {
            m0Var.f2158n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            m0Var.f2159o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            m0Var.f2160p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = f2192q0;
        if (bundle.containsKey(str8)) {
            m0Var.f2161q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            m0Var.f2162r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f2177a0;
        if (bundle.containsKey(str10)) {
            m0Var.f2163s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = f2178b0;
        if (bundle.containsKey(str11)) {
            m0Var.f2164t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f2179c0;
        if (bundle.containsKey(str12)) {
            m0Var.f2165u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f2180d0;
        if (bundle.containsKey(str13)) {
            m0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f2181e0;
        if (bundle.containsKey(str14)) {
            m0Var.f2166w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f2182f0;
        if (bundle.containsKey(str15)) {
            m0Var.f2167x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f2186j0;
        if (bundle.containsKey(str16)) {
            m0Var.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f2187k0;
        if (bundle.containsKey(str17)) {
            m0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f2191p0;
        if (bundle.containsKey(str18)) {
            m0Var.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f2194s0);
        if (stringArrayList != null) {
            m0Var.I = e9.i0.v(stringArrayList);
        }
        return new n0(m0Var);
    }

    public final m0 a() {
        ?? obj = new Object();
        obj.f2147a = this.f2196a;
        obj.f2148b = this.f2197b;
        obj.f2149c = this.f2198c;
        obj.d = this.d;
        obj.f2150e = this.f2199e;
        obj.f2151f = this.f2200f;
        obj.f2152g = this.f2201g;
        obj.h = this.h;
        obj.f2153i = this.f2202i;
        obj.f2154j = this.f2203j;
        obj.f2155k = this.f2204k;
        obj.f2156l = this.f2205l;
        obj.f2157m = this.f2206m;
        obj.f2158n = this.f2207n;
        obj.f2159o = this.f2208o;
        obj.f2160p = this.f2209p;
        obj.f2161q = this.f2210q;
        obj.f2162r = this.f2211r;
        obj.f2163s = this.f2213t;
        obj.f2164t = this.f2214u;
        obj.f2165u = this.v;
        obj.v = this.f2215w;
        obj.f2166w = this.f2216x;
        obj.f2167x = this.f2217y;
        obj.f2168y = this.f2218z;
        obj.f2169z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.C = this.D;
        obj.D = this.E;
        obj.E = this.F;
        obj.F = this.G;
        obj.G = this.H;
        obj.I = this.J;
        obj.H = this.I;
        return obj;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f2196a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.f2197b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.f2198c;
        if (charSequence3 != null) {
            bundle.putCharSequence(N, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(O, charSequence4);
        }
        CharSequence charSequence5 = this.f2199e;
        if (charSequence5 != null) {
            bundle.putCharSequence(P, charSequence5);
        }
        CharSequence charSequence6 = this.f2200f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.f2201g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l4 = this.h;
        if (l4 != null) {
            bundle.putLong(f2193r0, l4.longValue());
        }
        byte[] bArr = this.f2204k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.f2206m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.f2218z;
        if (charSequence8 != null) {
            bundle.putCharSequence(f2183g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(f2184h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(f2185i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(f2188l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(f2190o0, charSequence13);
        }
        c1 c1Var = this.f2202i;
        if (c1Var != null) {
            bundle.putBundle(S, c1Var.c());
        }
        c1 c1Var2 = this.f2203j;
        if (c1Var2 != null) {
            bundle.putBundle(T, c1Var2.c());
        }
        Integer num = this.f2207n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.f2208o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.f2209p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.f2210q;
        if (bool != null) {
            bundle.putBoolean(f2192q0, bool.booleanValue());
        }
        Boolean bool2 = this.f2211r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.f2213t;
        if (num4 != null) {
            bundle.putInt(f2177a0, num4.intValue());
        }
        Integer num5 = this.f2214u;
        if (num5 != null) {
            bundle.putInt(f2178b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(f2179c0, num6.intValue());
        }
        Integer num7 = this.f2215w;
        if (num7 != null) {
            bundle.putInt(f2180d0, num7.intValue());
        }
        Integer num8 = this.f2216x;
        if (num8 != null) {
            bundle.putInt(f2181e0, num8.intValue());
        }
        Integer num9 = this.f2217y;
        if (num9 != null) {
            bundle.putInt(f2182f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(f2186j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(f2187k0, num11.intValue());
        }
        Integer num12 = this.f2205l;
        if (num12 != null) {
            bundle.putInt(f2189n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(f2191p0, num13.intValue());
        }
        e9.i0 i0Var = this.J;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f2194s0, new ArrayList<>(i0Var));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(f2195t0, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass()) {
            n0 n0Var = (n0) obj;
            if (Objects.equals(this.f2196a, n0Var.f2196a) && Objects.equals(this.f2197b, n0Var.f2197b) && Objects.equals(this.f2198c, n0Var.f2198c) && Objects.equals(this.d, n0Var.d) && Objects.equals(this.f2199e, n0Var.f2199e) && Objects.equals(this.f2200f, n0Var.f2200f) && Objects.equals(this.f2201g, n0Var.f2201g) && Objects.equals(this.h, n0Var.h) && Objects.equals(this.f2202i, n0Var.f2202i) && Objects.equals(this.f2203j, n0Var.f2203j) && Arrays.equals(this.f2204k, n0Var.f2204k) && Objects.equals(this.f2205l, n0Var.f2205l) && Objects.equals(this.f2206m, n0Var.f2206m) && Objects.equals(this.f2207n, n0Var.f2207n) && Objects.equals(this.f2208o, n0Var.f2208o) && Objects.equals(this.f2209p, n0Var.f2209p) && Objects.equals(this.f2210q, n0Var.f2210q) && Objects.equals(this.f2211r, n0Var.f2211r) && Objects.equals(this.f2213t, n0Var.f2213t) && Objects.equals(this.f2214u, n0Var.f2214u) && Objects.equals(this.v, n0Var.v) && Objects.equals(this.f2215w, n0Var.f2215w) && Objects.equals(this.f2216x, n0Var.f2216x) && Objects.equals(this.f2217y, n0Var.f2217y) && Objects.equals(this.f2218z, n0Var.f2218z) && Objects.equals(this.A, n0Var.A) && Objects.equals(this.B, n0Var.B) && Objects.equals(this.C, n0Var.C) && Objects.equals(this.D, n0Var.D) && Objects.equals(this.E, n0Var.E) && Objects.equals(this.F, n0Var.F) && Objects.equals(this.G, n0Var.G) && Objects.equals(this.H, n0Var.H) && Objects.equals(this.J, n0Var.J)) {
                if (this.I == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (n0Var.I == null) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f2204k));
        if (this.I == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f2196a, this.f2197b, this.f2198c, this.d, this.f2199e, this.f2200f, this.f2201g, this.h, this.f2202i, this.f2203j, valueOf, this.f2205l, this.f2206m, this.f2207n, this.f2208o, this.f2209p, this.f2210q, this.f2211r, this.f2213t, this.f2214u, this.v, this.f2215w, this.f2216x, this.f2217y, this.f2218z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(z10), this.J);
    }
}
