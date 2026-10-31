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
import v7.t6;
public final class p0 {
    public static final p0 f2175g;
    public static final String h;
    public static final String f2176i;
    public static final String f2177j;
    public static final String f2178k;
    public static final String f2179l;
    public static final String f2180m;
    public final String f2181a;
    public final k0 f2182b;
    public final j0 f2183c;
    public final s0 d;
    public final f0 e;
    public final l0 f2184f;

    static {
        d0 d0Var = new d0();
        e9.l0 l0Var = e9.n0.f6390b;
        e9.x1 x1Var = e9.x1.e;
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var2 = e9.x1.e;
        i0 i0Var = new i0();
        f2175g = new p0("", new e0(d0Var), null, new j0(i0Var), s0.L, l0.d);
        h = Integer.toString(0, 36);
        f2176i = Integer.toString(1, 36);
        f2177j = Integer.toString(2, 36);
        f2178k = Integer.toString(3, 36);
        f2179l = Integer.toString(4, 36);
        f2180m = Integer.toString(5, 36);
    }

    public p0(String str, f0 f0Var, k0 k0Var, j0 j0Var, s0 s0Var, l0 l0Var) {
        this.f2181a = str;
        this.f2182b = k0Var;
        this.f2183c = j0Var;
        this.d = s0Var;
        this.e = f0Var;
        this.f2184f = l0Var;
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
        Bundle bundle2 = bundle.getBundle(f2176i);
        if (bundle2 == null) {
            j0Var = j0.f2072f;
        } else {
            i0 i0Var = new i0();
            String str = j0.f2073g;
            j0 j0Var2 = j0.f2072f;
            i0Var.f2064a = bundle2.getLong(str, j0Var2.f2077a);
            i0Var.f2065b = bundle2.getLong(j0.h, j0Var2.f2078b);
            i0Var.f2066c = bundle2.getLong(j0.f2074i, j0Var2.f2079c);
            i0Var.d = bundle2.getFloat(j0.f2075j, j0Var2.d);
            i0Var.e = bundle2.getFloat(j0.f2076k, j0Var2.e);
            j0Var = new j0(i0Var);
        }
        j0 j0Var3 = j0Var;
        Bundle bundle3 = bundle.getBundle(f2177j);
        if (bundle3 == null) {
            b10 = s0.L;
        } else {
            b10 = s0.b(i10, bundle3);
        }
        s0 s0Var = b10;
        Bundle bundle4 = bundle.getBundle(f2178k);
        if (bundle4 == null) {
            f0Var = f0.f2040r;
        } else {
            d0 d0Var = new d0();
            String str2 = e0.f2001j;
            e0 e0Var = e0.f2000i;
            long j10 = e0Var.f2009a;
            long j11 = e0Var.d;
            long j12 = e0Var.f2010b;
            long S = e2.l0.S(bundle4.getLong(str2, j10));
            boolean z13 = true;
            if (S >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            t6.f(z10);
            d0Var.f1996a = S;
            long S2 = e2.l0.S(bundle4.getLong(e0.f2002k, e0Var.f2011c));
            if (S2 != Long.MIN_VALUE && S2 < 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            t6.f(z11);
            d0Var.f1997b = S2;
            d0Var.f1998c = bundle4.getBoolean(e0.f2003l, e0Var.e);
            d0Var.d = bundle4.getBoolean(e0.f2004m, e0Var.f2012f);
            d0Var.e = bundle4.getBoolean(e0.f2005n, e0Var.f2013g);
            d0Var.f1999f = bundle4.getBoolean(e0.f2008q, e0Var.h);
            long j13 = bundle4.getLong(e0.f2006o, j12);
            if (j13 != j12) {
                if (j13 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                t6.f(z12);
                d0Var.f1996a = j13;
            }
            long j14 = bundle4.getLong(e0.f2007p, j11);
            if (j14 != j11) {
                if (j14 != Long.MIN_VALUE && j14 < 0) {
                    z13 = false;
                }
                t6.f(z13);
                d0Var.f1997b = j14;
            }
            f0Var = new e0(d0Var);
        }
        f0 f0Var2 = f0Var;
        Bundle bundle5 = bundle.getBundle(f2179l);
        if (bundle5 == null) {
            l0Var = l0.d;
        } else {
            android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(4);
            a0Var.f875b = (Uri) bundle5.getParcelable(l0.e);
            a0Var.f876c = bundle5.getString(l0.f2098f);
            a0Var.d = e2.l0.o(bundle5.getBundle(l0.f2099g));
            l0Var = new l0(a0Var);
        }
        l0 l0Var2 = l0Var;
        Bundle bundle6 = bundle.getBundle(f2180m);
        if (bundle6 == null) {
            k0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(k0.f2085k);
            if (bundle7 == null) {
                h0Var = null;
            } else {
                String string2 = bundle7.getString(h0.f2048i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(h0.f2049j);
                String str3 = h0.f2050k;
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
                boolean z14 = bundle7.getBoolean(h0.f2051l, false);
                boolean z15 = bundle7.getBoolean(h0.f2052m, false);
                boolean z16 = bundle7.getBoolean(h0.f2053n, false);
                String str5 = h0.f2054o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                e9.n0 u10 = e9.n0.u(arrayList);
                byte[] byteArray = bundle7.getByteArray(h0.f2055p);
                g0 g0Var = new g0();
                g0Var.f2041a = fromString;
                g0Var.f2042b = uri;
                g0Var.f2043c = e9.q0.a(a2);
                g0Var.d = z14;
                g0Var.f2044f = z16;
                g0Var.e = z15;
                g0Var.f2045g = e9.n0.u(u10);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                g0Var.h = bArr;
                h0Var = new h0(g0Var);
            }
            Bundle bundle10 = bundle6.getBundle(k0.f2086l);
            if (bundle10 == null) {
                c0Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(c0.f1993b);
                uri2.getClass();
                ?? obj = new Object();
                obj.f1978a = uri2;
                c0Var = new c0(obj);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(k0.f2087m);
            if (parcelableArrayList == null) {
                e9.l0 l0Var3 = e9.n0.f6390b;
                f7 = e9.x1.e;
            } else {
                e9.k0 t10 = e9.n0.t();
                int i11 = 0;
                while (i11 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i11);
                    bundle11.getClass();
                    t10.c(new i1(bundle11.getInt(i1.d, 0), bundle11.getInt(i1.e, 0), bundle11.getInt(i1.f2067f, 0)));
                    i11++;
                    parcelableArrayList = parcelableArrayList;
                }
                f7 = t10.f();
            }
            e9.x1 x1Var = f7;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(k0.f2089o);
            if (parcelableArrayList2 == null) {
                e9.l0 l0Var4 = e9.n0.f6390b;
                b11 = e9.x1.e;
            } else {
                b11 = e2.e.b(new aa.a(16), parcelableArrayList2);
            }
            e9.x1 x1Var2 = b11;
            long j15 = bundle6.getLong(k0.f2090p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(k0.f2083i);
            uri3.getClass();
            k0Var = new k0(uri3, bundle6.getString(k0.f2084j), h0Var, c0Var, x1Var, bundle6.getString(k0.f2088n), x1Var2, j15);
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
        if (g0Var.f2042b != null && g0Var.f2041a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        t6.p(z10);
        h0 h0Var = null;
        if (uri != null) {
            if (g0Var.f2041a != null) {
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
        String str = this.f2181a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        j0 j0Var = j0.f2072f;
        j0 j0Var2 = this.f2183c;
        if (!j0Var2.equals(j0Var)) {
            bundle.putBundle(f2176i, j0Var2.b());
        }
        s0 s0Var = s0.L;
        s0 s0Var2 = this.d;
        if (!s0Var2.equals(s0Var)) {
            bundle.putBundle(f2177j, s0Var2.c(i10));
        }
        e0 e0Var = e0.f2000i;
        f0 f0Var = this.e;
        if (!f0Var.equals(e0Var)) {
            Bundle bundle2 = new Bundle();
            long j10 = f0Var.f2009a;
            if (j10 != e0Var.f2009a) {
                bundle2.putLong(e0.f2001j, j10);
            }
            long j11 = f0Var.f2011c;
            if (j11 != e0Var.f2011c) {
                bundle2.putLong(e0.f2002k, j11);
            }
            long j12 = f0Var.f2010b;
            if (j12 != e0Var.f2010b) {
                bundle2.putLong(e0.f2006o, j12);
            }
            long j13 = f0Var.d;
            if (j13 != e0Var.d) {
                bundle2.putLong(e0.f2007p, j13);
            }
            boolean z11 = f0Var.e;
            if (z11 != e0Var.e) {
                bundle2.putBoolean(e0.f2003l, z11);
            }
            boolean z12 = f0Var.f2012f;
            if (z12 != e0Var.f2012f) {
                bundle2.putBoolean(e0.f2004m, z12);
            }
            boolean z13 = f0Var.f2013g;
            if (z13 != e0Var.f2013g) {
                bundle2.putBoolean(e0.f2005n, z13);
            }
            boolean z14 = f0Var.h;
            if (z14 != e0Var.h) {
                bundle2.putBoolean(e0.f2008q, z14);
            }
            bundle.putBundle(f2178k, bundle2);
        }
        l0 l0Var = l0.d;
        l0 l0Var2 = this.f2184f;
        if (!l0Var2.equals(l0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = l0Var2.f2100a;
            if (uri != null) {
                bundle3.putParcelable(l0.e, uri);
            }
            String str2 = l0Var2.f2101b;
            if (str2 != null) {
                bundle3.putString(l0.f2098f, str2);
            }
            Bundle bundle4 = l0Var2.f2102c;
            if (bundle4 != null) {
                bundle3.putBundle(l0.f2099g, bundle4);
            }
            bundle.putBundle(f2179l, bundle3);
        }
        if (z10 && (k0Var = this.f2182b) != null) {
            e9.n0 n0Var = k0Var.f2095g;
            List list = k0Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(k0.f2083i, k0Var.f2091a);
            String str3 = k0Var.f2092b;
            if (str3 != null) {
                bundle5.putString(k0.f2084j, str3);
            }
            h0 h0Var = k0Var.f2093c;
            if (h0Var != null) {
                String str4 = k0.f2085k;
                e9.n0 n0Var2 = h0Var.f2060g;
                e9.q0 q0Var = h0Var.f2058c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(h0.f2048i, h0Var.f2056a.toString());
                Uri uri2 = h0Var.f2057b;
                if (uri2 != null) {
                    bundle6.putParcelable(h0.f2049j, uri2);
                }
                if (!q0Var.isEmpty()) {
                    String str5 = h0.f2050k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : q0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = h0Var.d;
                if (z15) {
                    bundle6.putBoolean(h0.f2051l, z15);
                }
                boolean z16 = h0Var.e;
                if (z16) {
                    bundle6.putBoolean(h0.f2052m, z16);
                }
                boolean z17 = h0Var.f2059f;
                if (z17) {
                    bundle6.putBoolean(h0.f2053n, z17);
                }
                if (!n0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(h0.f2054o, new ArrayList<>(n0Var2));
                }
                byte[] bArr = h0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(h0.f2055p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            c0 c0Var = k0Var.d;
            if (c0Var != null) {
                String str6 = k0.f2086l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(c0.f1993b, c0Var.f1994a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(k0.f2087m, e2.e.h(list, new aa.a(14)));
            }
            String str7 = k0Var.f2094f;
            if (str7 != null) {
                bundle5.putString(k0.f2088n, str7);
            }
            if (!n0Var.isEmpty()) {
                bundle5.putParcelableArrayList(k0.f2089o, e2.e.h(n0Var, new aa.a(15)));
            }
            long j14 = k0Var.h;
            if (j14 != -9223372036854775807L) {
                bundle5.putLong(k0.f2090p, j14);
            }
            bundle.putBundle(f2180m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p0) {
                p0 p0Var = (p0) obj;
                if (Objects.equals(this.f2181a, p0Var.f2181a) && this.e.equals(p0Var.e) && Objects.equals(this.f2182b, p0Var.f2182b) && Objects.equals(this.f2183c, p0Var.f2183c) && Objects.equals(this.d, p0Var.d) && Objects.equals(this.f2184f, p0Var.f2184f)) {
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
        int hashCode = this.f2181a.hashCode() * 31;
        k0 k0Var = this.f2182b;
        if (k0Var != null) {
            i10 = k0Var.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f2183c.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f2184f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
