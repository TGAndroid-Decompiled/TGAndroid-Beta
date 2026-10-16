package b2;

import android.net.Uri;
import android.os.Bundle;
import e9.c2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import v7.u6;
public final class p0 {
    public static final p0 f2275g;
    public static final String h;
    public static final String f2276i;
    public static final String f2277j;
    public static final String f2278k;
    public static final String f2279l;
    public static final String f2280m;
    public final String f2281a;
    public final k0 f2282b;
    public final j0 f2283c;
    public final s0 d;
    public final f0 e;
    public final l0 f2284f;

    static {
        d0 d0Var = new d0();
        e9.l0 l0Var = e9.n0.f8595b;
        e9.x1 x1Var = e9.x1.e;
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var2 = e9.x1.e;
        i0 i0Var = new i0();
        f2275g = new p0("", new e0(d0Var), null, new j0(i0Var), s0.L, l0.d);
        h = Integer.toString(0, 36);
        f2276i = Integer.toString(1, 36);
        f2277j = Integer.toString(2, 36);
        f2278k = Integer.toString(3, 36);
        f2279l = Integer.toString(4, 36);
        f2280m = Integer.toString(5, 36);
    }

    public p0(String str, f0 f0Var, k0 k0Var, j0 j0Var, s0 s0Var, l0 l0Var) {
        this.f2281a = str;
        this.f2282b = k0Var;
        this.f2283c = j0Var;
        this.d = s0Var;
        this.e = f0Var;
        this.f2284f = l0Var;
    }

    public static p0 a(int i10, Bundle bundle) {
        j0 j0Var;
        s0 b10;
        boolean z10;
        boolean z11;
        boolean z12;
        f0 f0Var;
        l0 l0Var;
        Map a2;
        byte[] bArr;
        h0 h0Var;
        c0 c0Var;
        e9.x1 f7;
        e9.x1 b11;
        k0 k0Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(f2276i);
        if (bundle2 == null) {
            j0Var = j0.f2171f;
        } else {
            i0 i0Var = new i0();
            String str = j0.f2172g;
            j0 j0Var2 = j0.f2171f;
            i0Var.f2165a = bundle2.getLong(str, j0Var2.f2176a);
            i0Var.f2166b = bundle2.getLong(j0.h, j0Var2.f2177b);
            i0Var.f2167c = bundle2.getLong(j0.f2173i, j0Var2.f2178c);
            i0Var.d = bundle2.getFloat(j0.f2174j, j0Var2.d);
            i0Var.e = bundle2.getFloat(j0.f2175k, j0Var2.e);
            j0Var = new j0(i0Var);
        }
        j0 j0Var3 = j0Var;
        Bundle bundle3 = bundle.getBundle(f2277j);
        if (bundle3 == null) {
            b10 = s0.L;
        } else {
            b10 = s0.b(i10, bundle3);
        }
        s0 s0Var = b10;
        Bundle bundle4 = bundle.getBundle(f2278k);
        if (bundle4 == null) {
            f0Var = f0.f2130r;
        } else {
            d0 d0Var = new d0();
            String str2 = e0.f2104j;
            e0 e0Var = e0.f2103i;
            long j10 = e0Var.f2112a;
            long j11 = e0Var.d;
            long j12 = e0Var.f2113b;
            long S = e2.m0.S(bundle4.getLong(str2, j10));
            boolean z13 = true;
            if (S >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.g(z10);
            d0Var.f2098a = S;
            long S2 = e2.m0.S(bundle4.getLong(e0.f2105k, e0Var.f2114c));
            if (S2 != Long.MIN_VALUE && S2 < 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            u6.g(z11);
            d0Var.f2099b = S2;
            d0Var.f2100c = bundle4.getBoolean(e0.f2106l, e0Var.e);
            d0Var.d = bundle4.getBoolean(e0.f2107m, e0Var.f2115f);
            d0Var.e = bundle4.getBoolean(e0.f2108n, e0Var.f2116g);
            d0Var.f2101f = bundle4.getBoolean(e0.f2111q, e0Var.h);
            long j13 = bundle4.getLong(e0.f2109o, j12);
            if (j13 != j12) {
                if (j13 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u6.g(z12);
                d0Var.f2098a = j13;
            }
            long j14 = bundle4.getLong(e0.f2110p, j11);
            if (j14 != j11) {
                if (j14 != Long.MIN_VALUE && j14 < 0) {
                    z13 = false;
                }
                u6.g(z13);
                d0Var.f2099b = j14;
            }
            f0Var = new e0(d0Var);
        }
        f0 f0Var2 = f0Var;
        Bundle bundle5 = bundle.getBundle(f2279l);
        if (bundle5 == null) {
            l0Var = l0.d;
        } else {
            androidx.biometric.e eVar = new androidx.biometric.e(3);
            eVar.f1200b = (Uri) bundle5.getParcelable(l0.e);
            eVar.f1201c = bundle5.getString(l0.f2201f);
            eVar.d = e2.m0.o(bundle5.getBundle(l0.f2202g));
            l0Var = new l0(eVar);
        }
        l0 l0Var2 = l0Var;
        Bundle bundle6 = bundle.getBundle(f2280m);
        if (bundle6 == null) {
            k0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(k0.f2186k);
            if (bundle7 == null) {
                h0Var = null;
            } else {
                String string2 = bundle7.getString(h0.f2150i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(h0.f2151j);
                String str3 = h0.f2152k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    a2 = c2.h;
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
                    a2 = e9.q0.a(hashMap);
                }
                boolean z14 = bundle7.getBoolean(h0.f2153l, false);
                boolean z15 = bundle7.getBoolean(h0.f2154m, false);
                boolean z16 = bundle7.getBoolean(h0.f2155n, false);
                String str5 = h0.f2156o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                e9.n0 u10 = e9.n0.u(arrayList);
                byte[] byteArray = bundle7.getByteArray(h0.f2157p);
                g0 g0Var = new g0();
                g0Var.f2144a = fromString;
                g0Var.f2145b = uri;
                g0Var.f2146c = e9.q0.a(a2);
                g0Var.d = z14;
                g0Var.f2147f = z16;
                g0Var.e = z15;
                g0Var.f2148g = e9.n0.u(u10);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                g0Var.h = bArr;
                h0Var = new h0(g0Var);
            }
            Bundle bundle10 = bundle6.getBundle(k0.f2187l);
            if (bundle10 == null) {
                c0Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(c0.f2093b);
                uri2.getClass();
                ?? obj = new Object();
                obj.f2084a = uri2;
                c0Var = new c0(obj);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(k0.f2188m);
            if (parcelableArrayList == null) {
                e9.l0 l0Var3 = e9.n0.f8595b;
                f7 = e9.x1.e;
            } else {
                e9.k0 t10 = e9.n0.t();
                int i11 = 0;
                while (i11 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i11);
                    bundle11.getClass();
                    t10.c(new j1(bundle11.getInt(j1.d, 0), bundle11.getInt(j1.e, 0), bundle11.getInt(j1.f2179f, 0)));
                    i11++;
                    parcelableArrayList = parcelableArrayList;
                }
                f7 = t10.f();
            }
            e9.x1 x1Var = f7;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(k0.f2190o);
            if (parcelableArrayList2 == null) {
                e9.l0 l0Var4 = e9.n0.f8595b;
                b11 = e9.x1.e;
            } else {
                b11 = e2.e.b(new aa.a(20), parcelableArrayList2);
            }
            e9.x1 x1Var2 = b11;
            long j15 = bundle6.getLong(k0.f2191p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(k0.f2184i);
            uri3.getClass();
            k0Var = new k0(uri3, bundle6.getString(k0.f2185j), h0Var, c0Var, x1Var, bundle6.getString(k0.f2189n), x1Var2, j15);
        }
        return new p0(string, f0Var2, k0Var, j0Var3, s0Var, l0Var2);
    }

    public static p0 b(Uri uri) {
        boolean z10;
        k0 k0Var;
        d0 d0Var = new d0();
        g0 g0Var = new g0();
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var = e9.x1.e;
        i0 i0Var = new i0();
        l0 l0Var = l0.d;
        if (g0Var.f2145b != null && g0Var.f2144a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        h0 h0Var = null;
        if (uri != null) {
            if (g0Var.f2144a != null) {
                h0Var = new h0(g0Var);
            }
            k0Var = new k0(uri, null, h0Var, null, list, null, x1Var, -9223372036854775807L);
        } else {
            k0Var = null;
        }
        return new p0("", new e0(d0Var), k0Var, new j0(i0Var), s0.L, l0Var);
    }

    public final Bundle c(int i10, boolean z10) {
        k0 k0Var;
        Bundle bundle = new Bundle();
        String str = this.f2281a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        j0 j0Var = j0.f2171f;
        j0 j0Var2 = this.f2283c;
        if (!j0Var2.equals(j0Var)) {
            bundle.putBundle(f2276i, j0Var2.b());
        }
        s0 s0Var = s0.L;
        s0 s0Var2 = this.d;
        if (!s0Var2.equals(s0Var)) {
            bundle.putBundle(f2277j, s0Var2.c(i10));
        }
        e0 e0Var = e0.f2103i;
        f0 f0Var = this.e;
        if (!f0Var.equals(e0Var)) {
            Bundle bundle2 = new Bundle();
            long j10 = f0Var.f2112a;
            if (j10 != e0Var.f2112a) {
                bundle2.putLong(e0.f2104j, j10);
            }
            long j11 = f0Var.f2114c;
            if (j11 != e0Var.f2114c) {
                bundle2.putLong(e0.f2105k, j11);
            }
            long j12 = f0Var.f2113b;
            if (j12 != e0Var.f2113b) {
                bundle2.putLong(e0.f2109o, j12);
            }
            long j13 = f0Var.d;
            if (j13 != e0Var.d) {
                bundle2.putLong(e0.f2110p, j13);
            }
            boolean z11 = f0Var.e;
            if (z11 != e0Var.e) {
                bundle2.putBoolean(e0.f2106l, z11);
            }
            boolean z12 = f0Var.f2115f;
            if (z12 != e0Var.f2115f) {
                bundle2.putBoolean(e0.f2107m, z12);
            }
            boolean z13 = f0Var.f2116g;
            if (z13 != e0Var.f2116g) {
                bundle2.putBoolean(e0.f2108n, z13);
            }
            boolean z14 = f0Var.h;
            if (z14 != e0Var.h) {
                bundle2.putBoolean(e0.f2111q, z14);
            }
            bundle.putBundle(f2278k, bundle2);
        }
        l0 l0Var = l0.d;
        l0 l0Var2 = this.f2284f;
        if (!l0Var2.equals(l0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = l0Var2.f2203a;
            if (uri != null) {
                bundle3.putParcelable(l0.e, uri);
            }
            String str2 = l0Var2.f2204b;
            if (str2 != null) {
                bundle3.putString(l0.f2201f, str2);
            }
            Bundle bundle4 = l0Var2.f2205c;
            if (bundle4 != null) {
                bundle3.putBundle(l0.f2202g, bundle4);
            }
            bundle.putBundle(f2279l, bundle3);
        }
        if (z10 && (k0Var = this.f2282b) != null) {
            e9.n0 n0Var = k0Var.f2196g;
            List list = k0Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(k0.f2184i, k0Var.f2192a);
            String str3 = k0Var.f2193b;
            if (str3 != null) {
                bundle5.putString(k0.f2185j, str3);
            }
            h0 h0Var = k0Var.f2194c;
            if (h0Var != null) {
                String str4 = k0.f2186k;
                e9.n0 n0Var2 = h0Var.f2162g;
                e9.q0 q0Var = h0Var.f2160c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(h0.f2150i, h0Var.f2158a.toString());
                Uri uri2 = h0Var.f2159b;
                if (uri2 != null) {
                    bundle6.putParcelable(h0.f2151j, uri2);
                }
                if (!q0Var.isEmpty()) {
                    String str5 = h0.f2152k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : q0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = h0Var.d;
                if (z15) {
                    bundle6.putBoolean(h0.f2153l, z15);
                }
                boolean z16 = h0Var.e;
                if (z16) {
                    bundle6.putBoolean(h0.f2154m, z16);
                }
                boolean z17 = h0Var.f2161f;
                if (z17) {
                    bundle6.putBoolean(h0.f2155n, z17);
                }
                if (!n0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(h0.f2156o, new ArrayList<>(n0Var2));
                }
                byte[] bArr = h0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(h0.f2157p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            c0 c0Var = k0Var.d;
            if (c0Var != null) {
                String str6 = k0.f2187l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(c0.f2093b, c0Var.f2094a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(k0.f2188m, e2.e.h(list, new aa.a(18)));
            }
            String str7 = k0Var.f2195f;
            if (str7 != null) {
                bundle5.putString(k0.f2189n, str7);
            }
            if (!n0Var.isEmpty()) {
                bundle5.putParcelableArrayList(k0.f2190o, e2.e.h(n0Var, new aa.a(19)));
            }
            long j14 = k0Var.h;
            if (j14 != -9223372036854775807L) {
                bundle5.putLong(k0.f2191p, j14);
            }
            bundle.putBundle(f2280m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p0) {
                p0 p0Var = (p0) obj;
                if (Objects.equals(this.f2281a, p0Var.f2281a) && this.e.equals(p0Var.e) && Objects.equals(this.f2282b, p0Var.f2282b) && Objects.equals(this.f2283c, p0Var.f2283c) && Objects.equals(this.d, p0Var.d) && Objects.equals(this.f2284f, p0Var.f2284f)) {
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
        int hashCode = this.f2281a.hashCode() * 31;
        k0 k0Var = this.f2282b;
        if (k0Var != null) {
            i10 = k0Var.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f2283c.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f2284f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
