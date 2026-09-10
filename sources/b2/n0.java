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
    public static final String f1816a0;
    public static final String f1817b0;
    public static final String f1818c0;
    public static final String f1819d0;
    public static final String f1820e0;
    public static final String f1821f0;
    public static final String f1822g0;
    public static final String f1823h0;
    public static final String f1824i0;
    public static final String f1825j0;
    public static final String f1826k0;
    public static final String f1827l0;
    public static final String m0;
    public static final String f1828n0;
    public static final String f1829o0;
    public static final String f1830p0;
    public static final String f1831q0;
    public static final String f1832r0;
    public static final String f1833s0;
    public static final String f1834t0;
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
    public final CharSequence f1835a;
    public final CharSequence f1836b;
    public final CharSequence f1837c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f1838f;
    public final CharSequence f1839g;
    public final Long h;
    public final c1 f1840i;
    public final c1 f1841j;
    public final byte[] f1842k;
    public final Integer f1843l;
    public final Uri f1844m;
    public final Integer f1845n;
    public final Integer f1846o;
    public final Integer f1847p;
    public final Boolean f1848q;
    public final Boolean f1849r;
    public final Integer f1850s;
    public final Integer f1851t;
    public final Integer f1852u;
    public final Integer v;
    public final Integer f1853w;
    public final Integer f1854x;
    public final Integer f1855y;
    public final CharSequence f1856z;

    static {
        String str = e2.d0.f7188a;
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
        f1816a0 = Integer.toString(16, 36);
        f1817b0 = Integer.toString(17, 36);
        f1818c0 = Integer.toString(18, 36);
        f1819d0 = Integer.toString(19, 36);
        f1820e0 = Integer.toString(20, 36);
        f1821f0 = Integer.toString(21, 36);
        f1822g0 = Integer.toString(22, 36);
        f1823h0 = Integer.toString(23, 36);
        f1824i0 = Integer.toString(24, 36);
        f1825j0 = Integer.toString(25, 36);
        f1826k0 = Integer.toString(26, 36);
        f1827l0 = Integer.toString(27, 36);
        m0 = Integer.toString(28, 36);
        f1828n0 = Integer.toString(29, 36);
        f1829o0 = Integer.toString(30, 36);
        f1830p0 = Integer.toString(31, 36);
        f1831q0 = Integer.toString(32, 36);
        f1832r0 = Integer.toString(33, 36);
        f1833s0 = Integer.toString(34, 36);
        f1834t0 = Integer.toString(1000, 36);
    }

    public n0(m0 m0Var) {
        Boolean bool = m0Var.f1801q;
        Integer num = m0Var.f1800p;
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
        this.f1835a = m0Var.f1788a;
        this.f1836b = m0Var.f1789b;
        this.f1837c = m0Var.f1790c;
        this.d = m0Var.d;
        this.e = m0Var.e;
        this.f1838f = m0Var.f1791f;
        this.f1839g = m0Var.f1792g;
        this.h = m0Var.h;
        this.f1840i = m0Var.f1793i;
        this.f1841j = m0Var.f1794j;
        this.f1842k = m0Var.f1795k;
        this.f1843l = m0Var.f1796l;
        this.f1844m = m0Var.f1797m;
        this.f1845n = m0Var.f1798n;
        this.f1846o = m0Var.f1799o;
        this.f1847p = num;
        this.f1848q = bool;
        this.f1849r = m0Var.f1802r;
        Integer num3 = m0Var.f1803s;
        this.f1850s = num3;
        this.f1851t = num3;
        this.f1852u = m0Var.f1804t;
        this.v = m0Var.f1805u;
        this.f1853w = m0Var.v;
        this.f1854x = m0Var.f1806w;
        this.f1855y = m0Var.f1807x;
        this.f1856z = m0Var.f1808y;
        this.A = m0Var.f1809z;
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
        m0Var.f1788a = bundle.getCharSequence(L);
        m0Var.f1789b = bundle.getCharSequence(M);
        m0Var.f1790c = bundle.getCharSequence(N);
        m0Var.d = bundle.getCharSequence(O);
        m0Var.e = bundle.getCharSequence(P);
        m0Var.f1791f = bundle.getCharSequence(Q);
        m0Var.f1792g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = f1828n0;
        byte[] bArr = null;
        if (bundle.containsKey(str)) {
            num = Integer.valueOf(bundle.getInt(str));
        } else {
            num = null;
        }
        if (byteArray != null) {
            bArr = (byte[]) byteArray.clone();
        }
        m0Var.f1795k = bArr;
        m0Var.f1796l = num;
        m0Var.f1797m = (Uri) bundle.getParcelable(V);
        m0Var.f1808y = bundle.getCharSequence(f1822g0);
        m0Var.f1809z = bundle.getCharSequence(f1823h0);
        m0Var.A = bundle.getCharSequence(f1824i0);
        m0Var.D = bundle.getCharSequence(f1827l0);
        m0Var.E = bundle.getCharSequence(m0);
        m0Var.F = bundle.getCharSequence(f1829o0);
        m0Var.H = bundle.getBundle(f1834t0);
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            m0Var.f1793i = c1.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            m0Var.f1794j = c1.a(bundle2);
        }
        String str4 = f1832r0;
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
            m0Var.f1798n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            m0Var.f1799o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            m0Var.f1800p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = f1831q0;
        if (bundle.containsKey(str8)) {
            m0Var.f1801q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            m0Var.f1802r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f1816a0;
        if (bundle.containsKey(str10)) {
            m0Var.f1803s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = f1817b0;
        if (bundle.containsKey(str11)) {
            m0Var.f1804t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f1818c0;
        if (bundle.containsKey(str12)) {
            m0Var.f1805u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f1819d0;
        if (bundle.containsKey(str13)) {
            m0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f1820e0;
        if (bundle.containsKey(str14)) {
            m0Var.f1806w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f1821f0;
        if (bundle.containsKey(str15)) {
            m0Var.f1807x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f1825j0;
        if (bundle.containsKey(str16)) {
            m0Var.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f1826k0;
        if (bundle.containsKey(str17)) {
            m0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f1830p0;
        if (bundle.containsKey(str18)) {
            m0Var.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f1833s0);
        if (stringArrayList != null) {
            m0Var.I = e9.i0.v(stringArrayList);
        }
        return new n0(m0Var);
    }

    public final m0 a() {
        ?? obj = new Object();
        obj.f1788a = this.f1835a;
        obj.f1789b = this.f1836b;
        obj.f1790c = this.f1837c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f1791f = this.f1838f;
        obj.f1792g = this.f1839g;
        obj.h = this.h;
        obj.f1793i = this.f1840i;
        obj.f1794j = this.f1841j;
        obj.f1795k = this.f1842k;
        obj.f1796l = this.f1843l;
        obj.f1797m = this.f1844m;
        obj.f1798n = this.f1845n;
        obj.f1799o = this.f1846o;
        obj.f1800p = this.f1847p;
        obj.f1801q = this.f1848q;
        obj.f1802r = this.f1849r;
        obj.f1803s = this.f1851t;
        obj.f1804t = this.f1852u;
        obj.f1805u = this.v;
        obj.v = this.f1853w;
        obj.f1806w = this.f1854x;
        obj.f1807x = this.f1855y;
        obj.f1808y = this.f1856z;
        obj.f1809z = this.A;
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
        CharSequence charSequence = this.f1835a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.f1836b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.f1837c;
        if (charSequence3 != null) {
            bundle.putCharSequence(N, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(O, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(P, charSequence5);
        }
        CharSequence charSequence6 = this.f1838f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.f1839g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l4 = this.h;
        if (l4 != null) {
            bundle.putLong(f1832r0, l4.longValue());
        }
        byte[] bArr = this.f1842k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.f1844m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.f1856z;
        if (charSequence8 != null) {
            bundle.putCharSequence(f1822g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(f1823h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(f1824i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(f1827l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(f1829o0, charSequence13);
        }
        c1 c1Var = this.f1840i;
        if (c1Var != null) {
            bundle.putBundle(S, c1Var.c());
        }
        c1 c1Var2 = this.f1841j;
        if (c1Var2 != null) {
            bundle.putBundle(T, c1Var2.c());
        }
        Integer num = this.f1845n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.f1846o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.f1847p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.f1848q;
        if (bool != null) {
            bundle.putBoolean(f1831q0, bool.booleanValue());
        }
        Boolean bool2 = this.f1849r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.f1851t;
        if (num4 != null) {
            bundle.putInt(f1816a0, num4.intValue());
        }
        Integer num5 = this.f1852u;
        if (num5 != null) {
            bundle.putInt(f1817b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(f1818c0, num6.intValue());
        }
        Integer num7 = this.f1853w;
        if (num7 != null) {
            bundle.putInt(f1819d0, num7.intValue());
        }
        Integer num8 = this.f1854x;
        if (num8 != null) {
            bundle.putInt(f1820e0, num8.intValue());
        }
        Integer num9 = this.f1855y;
        if (num9 != null) {
            bundle.putInt(f1821f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(f1825j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(f1826k0, num11.intValue());
        }
        Integer num12 = this.f1843l;
        if (num12 != null) {
            bundle.putInt(f1828n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(f1830p0, num13.intValue());
        }
        e9.i0 i0Var = this.J;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f1833s0, new ArrayList<>(i0Var));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(f1834t0, bundle2);
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
            if (Objects.equals(this.f1835a, n0Var.f1835a) && Objects.equals(this.f1836b, n0Var.f1836b) && Objects.equals(this.f1837c, n0Var.f1837c) && Objects.equals(this.d, n0Var.d) && Objects.equals(this.e, n0Var.e) && Objects.equals(this.f1838f, n0Var.f1838f) && Objects.equals(this.f1839g, n0Var.f1839g) && Objects.equals(this.h, n0Var.h) && Objects.equals(this.f1840i, n0Var.f1840i) && Objects.equals(this.f1841j, n0Var.f1841j) && Arrays.equals(this.f1842k, n0Var.f1842k) && Objects.equals(this.f1843l, n0Var.f1843l) && Objects.equals(this.f1844m, n0Var.f1844m) && Objects.equals(this.f1845n, n0Var.f1845n) && Objects.equals(this.f1846o, n0Var.f1846o) && Objects.equals(this.f1847p, n0Var.f1847p) && Objects.equals(this.f1848q, n0Var.f1848q) && Objects.equals(this.f1849r, n0Var.f1849r) && Objects.equals(this.f1851t, n0Var.f1851t) && Objects.equals(this.f1852u, n0Var.f1852u) && Objects.equals(this.v, n0Var.v) && Objects.equals(this.f1853w, n0Var.f1853w) && Objects.equals(this.f1854x, n0Var.f1854x) && Objects.equals(this.f1855y, n0Var.f1855y) && Objects.equals(this.f1856z, n0Var.f1856z) && Objects.equals(this.A, n0Var.A) && Objects.equals(this.B, n0Var.B) && Objects.equals(this.C, n0Var.C) && Objects.equals(this.D, n0Var.D) && Objects.equals(this.E, n0Var.E) && Objects.equals(this.F, n0Var.F) && Objects.equals(this.G, n0Var.G) && Objects.equals(this.H, n0Var.H) && Objects.equals(this.J, n0Var.J)) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f1842k));
        if (this.I == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f1835a, this.f1836b, this.f1837c, this.d, this.e, this.f1838f, this.f1839g, this.h, this.f1840i, this.f1841j, valueOf, this.f1843l, this.f1844m, this.f1845n, this.f1846o, this.f1847p, this.f1848q, this.f1849r, this.f1851t, this.f1852u, this.v, this.f1853w, this.f1854x, this.f1855y, this.f1856z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(z10), this.J);
    }
}
