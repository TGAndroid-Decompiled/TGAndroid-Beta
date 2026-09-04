package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
public final class k0 {
    public static final k0 f2120g;
    public static final String h;
    public static final String f2121i;
    public static final String f2122j;
    public static final String f2123k;
    public static final String f2124l;
    public static final String f2125m;
    public final String f2126a;
    public final f0 f2127b;
    public final e0 f2128c;
    public final n0 d;
    public final a0 f2129e;
    public final g0 f2130f;

    static {
        y yVar = new y();
        e9.g0 g0Var = e9.i0.f8957b;
        e9.a1 a1Var = e9.a1.f8920e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.f8920e;
        d0 d0Var = new d0();
        f2120g = new k0("", new z(yVar), null, new e0(d0Var), n0.K, g0.d);
        h = Integer.toString(0, 36);
        f2121i = Integer.toString(1, 36);
        f2122j = Integer.toString(2, 36);
        f2123k = Integer.toString(3, 36);
        f2124l = Integer.toString(4, 36);
        f2125m = Integer.toString(5, 36);
    }

    public k0(String str, a0 a0Var, f0 f0Var, e0 e0Var, n0 n0Var, g0 g0Var) {
        this.f2126a = str;
        this.f2127b = f0Var;
        this.f2128c = e0Var;
        this.d = n0Var;
        this.f2129e = a0Var;
        this.f2130f = g0Var;
    }

    public static k0 a(Bundle bundle) {
        e0 e0Var;
        n0 b10;
        boolean z10;
        boolean z11;
        boolean z12;
        a0 a0Var;
        g0 g0Var;
        Map a2;
        byte[] bArr;
        c0 c0Var;
        x xVar;
        e9.a1 i10;
        e9.a1 j3;
        f0 f0Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(f2121i);
        if (bundle2 == null) {
            e0Var = e0.f2010f;
        } else {
            d0 d0Var = new d0();
            String str = e0.f2011g;
            e0 e0Var2 = e0.f2010f;
            d0Var.f1991a = bundle2.getLong(str, e0Var2.f2015a);
            d0Var.f1992b = bundle2.getLong(e0.h, e0Var2.f2016b);
            d0Var.f1993c = bundle2.getLong(e0.f2012i, e0Var2.f2017c);
            d0Var.d = bundle2.getFloat(e0.f2013j, e0Var2.d);
            d0Var.f1994e = bundle2.getFloat(e0.f2014k, e0Var2.f2018e);
            e0Var = new e0(d0Var);
        }
        e0 e0Var3 = e0Var;
        Bundle bundle3 = bundle.getBundle(f2122j);
        if (bundle3 == null) {
            b10 = n0.K;
        } else {
            b10 = n0.b(bundle3);
        }
        n0 n0Var = b10;
        Bundle bundle4 = bundle.getBundle(f2123k);
        if (bundle4 == null) {
            a0Var = a0.f1951r;
        } else {
            y yVar = new y();
            String str2 = z.f2427j;
            z zVar = z.f2426i;
            long j10 = zVar.f2435a;
            long j11 = zVar.d;
            long j12 = zVar.f2436b;
            long Q = e2.d0.Q(bundle4.getLong(str2, j10));
            boolean z13 = true;
            if (Q >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.b(z10);
            yVar.f2420a = Q;
            long Q2 = e2.d0.Q(bundle4.getLong(z.f2428k, zVar.f2437c));
            if (Q2 != Long.MIN_VALUE && Q2 < 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.b(z11);
            yVar.f2421b = Q2;
            yVar.f2422c = bundle4.getBoolean(z.f2429l, zVar.f2438e);
            yVar.d = bundle4.getBoolean(z.f2430m, zVar.f2439f);
            yVar.f2423e = bundle4.getBoolean(z.f2431n, zVar.f2440g);
            yVar.f2424f = bundle4.getBoolean(z.f2434q, zVar.h);
            long j13 = bundle4.getLong(z.f2432o, j12);
            if (j13 != j12) {
                if (j13 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e2.d.b(z12);
                yVar.f2420a = j13;
            }
            long j14 = bundle4.getLong(z.f2433p, j11);
            if (j14 != j11) {
                if (j14 != Long.MIN_VALUE && j14 < 0) {
                    z13 = false;
                }
                e2.d.b(z13);
                yVar.f2421b = j14;
            }
            a0Var = new z(yVar);
        }
        a0 a0Var2 = a0Var;
        Bundle bundle5 = bundle.getBundle(f2124l);
        if (bundle5 == null) {
            g0Var = g0.d;
        } else {
            aa.a aVar = new aa.a(4);
            aVar.f372c = (Uri) bundle5.getParcelable(g0.f2042e);
            aVar.f371b = bundle5.getString(g0.f2043f);
            aVar.d = bundle5.getBundle(g0.f2044g);
            g0Var = new g0(aVar);
        }
        g0 g0Var2 = g0Var;
        Bundle bundle6 = bundle.getBundle(f2125m);
        if (bundle6 == null) {
            f0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(f0.f2026k);
            if (bundle7 == null) {
                c0Var = null;
            } else {
                String string2 = bundle7.getString(c0.f1976i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(c0.f1977j);
                String str3 = c0.f1978k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    a2 = e9.f1.h;
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str4 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str4);
                            if (string3 != null) {
                                hashMap.put(str4, string3);
                            }
                        }
                    }
                    a2 = e9.k0.a(hashMap);
                }
                boolean z14 = bundle7.getBoolean(c0.f1979l, false);
                boolean z15 = bundle7.getBoolean(c0.f1980m, false);
                boolean z16 = bundle7.getBoolean(c0.f1981n, false);
                String str5 = c0.f1982o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                e9.i0 v = e9.i0.v(arrayList);
                byte[] byteArray = bundle7.getByteArray(c0.f1983p);
                b0 b0Var = new b0();
                b0Var.f1970a = fromString;
                b0Var.f1971b = uri;
                b0Var.f1972c = e9.k0.a(a2);
                b0Var.d = z14;
                b0Var.f1974f = z16;
                b0Var.f1973e = z15;
                b0Var.f1975g = e9.i0.v(v);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                b0Var.h = bArr;
                c0Var = new c0(b0Var);
            }
            Bundle bundle10 = bundle6.getBundle(f0.f2027l);
            if (bundle10 == null) {
                xVar = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(x.f2409b);
                uri2.getClass();
                ?? obj = new Object();
                obj.f2408a = uri2;
                xVar = new x(obj);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(f0.f2028m);
            if (parcelableArrayList == null) {
                e9.g0 g0Var3 = e9.i0.f8957b;
                i10 = e9.a1.f8920e;
            } else {
                e9.f0 u10 = e9.i0.u();
                int i11 = 0;
                while (i11 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i11);
                    bundle11.getClass();
                    u10.b(new e1(bundle11.getInt(e1.d, 0), bundle11.getInt(e1.f2019e, 0), bundle11.getInt(e1.f2020f, 0)));
                    i11++;
                    parcelableArrayList = parcelableArrayList;
                }
                i10 = u10.i();
            }
            e9.a1 a1Var = i10;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(f0.f2030o);
            if (parcelableArrayList2 == null) {
                e9.g0 g0Var4 = e9.i0.f8957b;
                j3 = e9.a1.f8920e;
            } else {
                j3 = e2.d.j(new androidx.emoji2.text.w(6), parcelableArrayList2);
            }
            e9.a1 a1Var2 = j3;
            long j15 = bundle6.getLong(f0.f2031p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(f0.f2024i);
            uri3.getClass();
            f0Var = new f0(uri3, bundle6.getString(f0.f2025j), c0Var, xVar, a1Var, bundle6.getString(f0.f2029n), a1Var2, j15);
        }
        return new k0(string, a0Var2, f0Var, e0Var3, n0Var, g0Var2);
    }

    public final Bundle b(boolean z10) {
        f0 f0Var;
        Bundle bundle = new Bundle();
        String str = this.f2126a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        e0 e0Var = e0.f2010f;
        e0 e0Var2 = this.f2128c;
        if (!e0Var2.equals(e0Var)) {
            bundle.putBundle(f2121i, e0Var2.b());
        }
        n0 n0Var = n0.K;
        n0 n0Var2 = this.d;
        if (!n0Var2.equals(n0Var)) {
            bundle.putBundle(f2122j, n0Var2.c());
        }
        z zVar = z.f2426i;
        a0 a0Var = this.f2129e;
        if (!a0Var.equals(zVar)) {
            Bundle bundle2 = new Bundle();
            long j3 = a0Var.f2435a;
            if (j3 != zVar.f2435a) {
                bundle2.putLong(z.f2427j, j3);
            }
            long j10 = a0Var.f2437c;
            if (j10 != zVar.f2437c) {
                bundle2.putLong(z.f2428k, j10);
            }
            long j11 = a0Var.f2436b;
            if (j11 != zVar.f2436b) {
                bundle2.putLong(z.f2432o, j11);
            }
            long j12 = a0Var.d;
            if (j12 != zVar.d) {
                bundle2.putLong(z.f2433p, j12);
            }
            boolean z11 = a0Var.f2438e;
            if (z11 != zVar.f2438e) {
                bundle2.putBoolean(z.f2429l, z11);
            }
            boolean z12 = a0Var.f2439f;
            if (z12 != zVar.f2439f) {
                bundle2.putBoolean(z.f2430m, z12);
            }
            boolean z13 = a0Var.f2440g;
            if (z13 != zVar.f2440g) {
                bundle2.putBoolean(z.f2431n, z13);
            }
            boolean z14 = a0Var.h;
            if (z14 != zVar.h) {
                bundle2.putBoolean(z.f2434q, z14);
            }
            bundle.putBundle(f2123k, bundle2);
        }
        g0 g0Var = g0.d;
        g0 g0Var2 = this.f2130f;
        if (!g0Var2.equals(g0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = g0Var2.f2045a;
            if (uri != null) {
                bundle3.putParcelable(g0.f2042e, uri);
            }
            String str2 = g0Var2.f2046b;
            if (str2 != null) {
                bundle3.putString(g0.f2043f, str2);
            }
            Bundle bundle4 = g0Var2.f2047c;
            if (bundle4 != null) {
                bundle3.putBundle(g0.f2044g, bundle4);
            }
            bundle.putBundle(f2124l, bundle3);
        }
        if (z10 && (f0Var = this.f2127b) != null) {
            e9.i0 i0Var = f0Var.f2037g;
            List list = f0Var.f2035e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(f0.f2024i, f0Var.f2032a);
            String str3 = f0Var.f2033b;
            if (str3 != null) {
                bundle5.putString(f0.f2025j, str3);
            }
            c0 c0Var = f0Var.f2034c;
            if (c0Var != null) {
                String str4 = f0.f2026k;
                e9.i0 i0Var2 = c0Var.f1989g;
                e9.k0 k0Var = c0Var.f1986c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(c0.f1976i, c0Var.f1984a.toString());
                Uri uri2 = c0Var.f1985b;
                if (uri2 != null) {
                    bundle6.putParcelable(c0.f1977j, uri2);
                }
                if (!k0Var.isEmpty()) {
                    String str5 = c0.f1978k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : k0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = c0Var.d;
                if (z15) {
                    bundle6.putBoolean(c0.f1979l, z15);
                }
                boolean z16 = c0Var.f1987e;
                if (z16) {
                    bundle6.putBoolean(c0.f1980m, z16);
                }
                boolean z17 = c0Var.f1988f;
                if (z17) {
                    bundle6.putBoolean(c0.f1981n, z17);
                }
                if (!i0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(c0.f1982o, new ArrayList<>(i0Var2));
                }
                byte[] bArr = c0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(c0.f1983p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            x xVar = f0Var.d;
            if (xVar != null) {
                String str6 = f0.f2027l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(x.f2409b, xVar.f2410a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(f0.f2028m, e2.d.p(list, new androidx.emoji2.text.w(4)));
            }
            String str7 = f0Var.f2036f;
            if (str7 != null) {
                bundle5.putString(f0.f2029n, str7);
            }
            if (!i0Var.isEmpty()) {
                bundle5.putParcelableArrayList(f0.f2030o, e2.d.p(i0Var, new androidx.emoji2.text.w(5)));
            }
            long j13 = f0Var.h;
            if (j13 != -9223372036854775807L) {
                bundle5.putLong(f0.f2031p, j13);
            }
            bundle.putBundle(f2125m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                if (Objects.equals(this.f2126a, k0Var.f2126a) && this.f2129e.equals(k0Var.f2129e) && Objects.equals(this.f2127b, k0Var.f2127b) && Objects.equals(this.f2128c, k0Var.f2128c) && Objects.equals(this.d, k0Var.d) && Objects.equals(this.f2130f, k0Var.f2130f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2126a.hashCode() * 31;
        f0 f0Var = this.f2127b;
        if (f0Var != null) {
            i10 = f0Var.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f2128c.hashCode();
        int hashCode3 = this.f2129e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f2130f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
