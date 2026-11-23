package e2;

import a8.ma;
import android.net.Uri;
import android.os.Bundle;
import h9.y1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
public final class l0 {
    public static final l0 f10489g;
    public static final String h;
    public static final String f10490i;
    public static final String f10491j;
    public static final String f10492k;
    public static final String f10493l;
    public static final String f10494m;
    public final String f10495a;
    public final g0 f10496b;
    public final f0 f10497c;
    public final o0 d;
    public final b0 f10498e;
    public final h0 f10499f;

    static {
        z zVar = new z();
        h9.g0 g0Var = h9.i0.f13998b;
        h9.t1 t1Var = h9.t1.f14066e;
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var2 = h9.t1.f14066e;
        e0 e0Var = new e0();
        f10489g = new l0("", new a0(zVar), null, new f0(e0Var), o0.L, h0.d);
        h = Integer.toString(0, 36);
        f10490i = Integer.toString(1, 36);
        f10491j = Integer.toString(2, 36);
        f10492k = Integer.toString(3, 36);
        f10493l = Integer.toString(4, 36);
        f10494m = Integer.toString(5, 36);
    }

    public l0(String str, b0 b0Var, g0 g0Var, f0 f0Var, o0 o0Var, h0 h0Var) {
        this.f10495a = str;
        this.f10496b = g0Var;
        this.f10497c = f0Var;
        this.d = o0Var;
        this.f10498e = b0Var;
        this.f10499f = h0Var;
    }

    public static l0 a(int i7, Bundle bundle) {
        f0 f0Var;
        o0 b10;
        boolean z10;
        boolean z11;
        boolean z12;
        b0 b0Var;
        h0 h0Var;
        Map b11;
        byte[] bArr;
        d0 d0Var;
        y yVar;
        h9.t1 f10;
        h9.t1 b12;
        g0 g0Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(f10490i);
        if (bundle2 == null) {
            f0Var = f0.f10382f;
        } else {
            e0 e0Var = new e0();
            String str = f0.f10383g;
            f0 f0Var2 = f0.f10382f;
            e0Var.f10375a = bundle2.getLong(str, f0Var2.f10387a);
            e0Var.f10376b = bundle2.getLong(f0.h, f0Var2.f10388b);
            e0Var.f10377c = bundle2.getLong(f0.f10384i, f0Var2.f10389c);
            e0Var.d = bundle2.getFloat(f0.f10385j, f0Var2.d);
            e0Var.f10378e = bundle2.getFloat(f0.f10386k, f0Var2.f10390e);
            f0Var = new f0(e0Var);
        }
        f0 f0Var3 = f0Var;
        Bundle bundle3 = bundle.getBundle(f10491j);
        if (bundle3 == null) {
            b10 = o0.L;
        } else {
            b10 = o0.b(i7, bundle3);
        }
        o0 o0Var = b10;
        Bundle bundle4 = bundle.getBundle(f10492k);
        if (bundle4 == null) {
            b0Var = b0.f10321r;
        } else {
            z zVar = new z();
            String str2 = a0.f10307j;
            a0 a0Var = a0.f10306i;
            long j3 = a0Var.f10315a;
            long j10 = a0Var.d;
            long j11 = a0Var.f10316b;
            long S = h2.l0.S(bundle4.getLong(str2, j3));
            boolean z13 = true;
            if (S >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ma.f(z10);
            zVar.f10803a = S;
            long S2 = h2.l0.S(bundle4.getLong(a0.f10308k, a0Var.f10317c));
            if (S2 != Long.MIN_VALUE && S2 < 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            ma.f(z11);
            zVar.f10804b = S2;
            zVar.f10805c = bundle4.getBoolean(a0.f10309l, a0Var.f10318e);
            zVar.d = bundle4.getBoolean(a0.f10310m, a0Var.f10319f);
            zVar.f10806e = bundle4.getBoolean(a0.f10311n, a0Var.f10320g);
            zVar.f10807f = bundle4.getBoolean(a0.f10314q, a0Var.h);
            long j12 = bundle4.getLong(a0.f10312o, j11);
            if (j12 != j11) {
                if (j12 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ma.f(z12);
                zVar.f10803a = j12;
            }
            long j13 = bundle4.getLong(a0.f10313p, j10);
            if (j13 != j10) {
                if (j13 != Long.MIN_VALUE && j13 < 0) {
                    z13 = false;
                }
                ma.f(z13);
                zVar.f10804b = j13;
            }
            b0Var = new a0(zVar);
        }
        b0 b0Var2 = b0Var;
        Bundle bundle5 = bundle.getBundle(f10493l);
        if (bundle5 == null) {
            h0Var = h0.d;
        } else {
            android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(21, false);
            a0Var2.f1675b = (Uri) bundle5.getParcelable(h0.f10415e);
            a0Var2.f1676c = bundle5.getString(h0.f10416f);
            a0Var2.d = h2.l0.o(bundle5.getBundle(h0.f10417g));
            h0Var = new h0(a0Var2);
        }
        h0 h0Var2 = h0Var;
        Bundle bundle6 = bundle.getBundle(f10494m);
        if (bundle6 == null) {
            g0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(g0.f10399k);
            if (bundle7 == null) {
                d0Var = null;
            } else {
                String string2 = bundle7.getString(d0.f10346i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(d0.f10347j);
                String str3 = d0.f10348k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    b11 = y1.h;
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
                    b11 = h9.l0.b(hashMap);
                }
                boolean z14 = bundle7.getBoolean(d0.f10349l, false);
                boolean z15 = bundle7.getBoolean(d0.f10350m, false);
                boolean z16 = bundle7.getBoolean(d0.f10351n, false);
                String str5 = d0.f10352o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                h9.i0 q10 = h9.i0.q(arrayList);
                byte[] byteArray = bundle7.getByteArray(d0.f10353p);
                c0 c0Var = new c0();
                c0Var.f10340a = fromString;
                c0Var.f10341b = uri;
                c0Var.f10342c = h9.l0.b(b11);
                c0Var.d = z14;
                c0Var.f10344f = z16;
                c0Var.f10343e = z15;
                c0Var.f10345g = h9.i0.q(q10);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                c0Var.h = bArr;
                d0Var = new d0(c0Var);
            }
            Bundle bundle10 = bundle6.getBundle(g0.f10400l);
            if (bundle10 == null) {
                yVar = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(y.f10798b);
                uri2.getClass();
                ?? obj = new Object();
                obj.f10791a = uri2;
                yVar = new y(obj);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(g0.f10401m);
            if (parcelableArrayList == null) {
                h9.g0 g0Var2 = h9.i0.f13998b;
                f10 = h9.t1.f14066e;
            } else {
                h9.f0 p10 = h9.i0.p();
                int i10 = 0;
                while (i10 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i10);
                    bundle11.getClass();
                    p10.c(new f1(bundle11.getInt(f1.d, 0), bundle11.getInt(f1.f10391e, 0), bundle11.getInt(f1.f10392f, 0)));
                    i10++;
                    parcelableArrayList = parcelableArrayList;
                }
                f10 = p10.f();
            }
            h9.t1 t1Var = f10;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(g0.f10403o);
            if (parcelableArrayList2 == null) {
                h9.g0 g0Var3 = h9.i0.f13998b;
                b12 = h9.t1.f14066e;
            } else {
                b12 = h2.e.b(new ci.v(11), parcelableArrayList2);
            }
            h9.t1 t1Var2 = b12;
            long j14 = bundle6.getLong(g0.f10404p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(g0.f10397i);
            uri3.getClass();
            g0Var = new g0(uri3, bundle6.getString(g0.f10398j), d0Var, yVar, t1Var, bundle6.getString(g0.f10402n), t1Var2, j14);
        }
        return new l0(string, b0Var2, g0Var, f0Var3, o0Var, h0Var2);
    }

    public static l0 b(Uri uri) {
        boolean z10;
        g0 g0Var;
        z zVar = new z();
        c0 c0Var = new c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.f14066e;
        e0 e0Var = new e0();
        h0 h0Var = h0.d;
        if (c0Var.f10341b != null && c0Var.f10340a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ma.p(z10);
        d0 d0Var = null;
        if (uri != null) {
            if (c0Var.f10340a != null) {
                d0Var = new d0(c0Var);
            }
            g0Var = new g0(uri, null, d0Var, null, list, null, t1Var, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        return new l0("", new a0(zVar), g0Var, new f0(e0Var), o0.L, h0Var);
    }

    public final Bundle c(int i7, boolean z10) {
        g0 g0Var;
        Bundle bundle = new Bundle();
        String str = this.f10495a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        f0 f0Var = f0.f10382f;
        f0 f0Var2 = this.f10497c;
        if (!f0Var2.equals(f0Var)) {
            bundle.putBundle(f10490i, f0Var2.b());
        }
        o0 o0Var = o0.L;
        o0 o0Var2 = this.d;
        if (!o0Var2.equals(o0Var)) {
            bundle.putBundle(f10491j, o0Var2.c(i7));
        }
        a0 a0Var = a0.f10306i;
        b0 b0Var = this.f10498e;
        if (!b0Var.equals(a0Var)) {
            Bundle bundle2 = new Bundle();
            long j3 = b0Var.f10315a;
            if (j3 != a0Var.f10315a) {
                bundle2.putLong(a0.f10307j, j3);
            }
            long j10 = b0Var.f10317c;
            if (j10 != a0Var.f10317c) {
                bundle2.putLong(a0.f10308k, j10);
            }
            long j11 = b0Var.f10316b;
            if (j11 != a0Var.f10316b) {
                bundle2.putLong(a0.f10312o, j11);
            }
            long j12 = b0Var.d;
            if (j12 != a0Var.d) {
                bundle2.putLong(a0.f10313p, j12);
            }
            boolean z11 = b0Var.f10318e;
            if (z11 != a0Var.f10318e) {
                bundle2.putBoolean(a0.f10309l, z11);
            }
            boolean z12 = b0Var.f10319f;
            if (z12 != a0Var.f10319f) {
                bundle2.putBoolean(a0.f10310m, z12);
            }
            boolean z13 = b0Var.f10320g;
            if (z13 != a0Var.f10320g) {
                bundle2.putBoolean(a0.f10311n, z13);
            }
            boolean z14 = b0Var.h;
            if (z14 != a0Var.h) {
                bundle2.putBoolean(a0.f10314q, z14);
            }
            bundle.putBundle(f10492k, bundle2);
        }
        h0 h0Var = h0.d;
        h0 h0Var2 = this.f10499f;
        if (!h0Var2.equals(h0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = h0Var2.f10418a;
            if (uri != null) {
                bundle3.putParcelable(h0.f10415e, uri);
            }
            String str2 = h0Var2.f10419b;
            if (str2 != null) {
                bundle3.putString(h0.f10416f, str2);
            }
            Bundle bundle4 = h0Var2.f10420c;
            if (bundle4 != null) {
                bundle3.putBundle(h0.f10417g, bundle4);
            }
            bundle.putBundle(f10493l, bundle3);
        }
        if (z10 && (g0Var = this.f10496b) != null) {
            h9.i0 i0Var = g0Var.f10410g;
            List list = g0Var.f10408e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(g0.f10397i, g0Var.f10405a);
            String str3 = g0Var.f10406b;
            if (str3 != null) {
                bundle5.putString(g0.f10398j, str3);
            }
            d0 d0Var = g0Var.f10407c;
            if (d0Var != null) {
                String str4 = g0.f10399k;
                h9.i0 i0Var2 = d0Var.f10359g;
                h9.l0 l0Var = d0Var.f10356c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(d0.f10346i, d0Var.f10354a.toString());
                Uri uri2 = d0Var.f10355b;
                if (uri2 != null) {
                    bundle6.putParcelable(d0.f10347j, uri2);
                }
                if (!l0Var.isEmpty()) {
                    String str5 = d0.f10348k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : l0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = d0Var.d;
                if (z15) {
                    bundle6.putBoolean(d0.f10349l, z15);
                }
                boolean z16 = d0Var.f10357e;
                if (z16) {
                    bundle6.putBoolean(d0.f10350m, z16);
                }
                boolean z17 = d0Var.f10358f;
                if (z17) {
                    bundle6.putBoolean(d0.f10351n, z17);
                }
                if (!i0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(d0.f10352o, new ArrayList<>(i0Var2));
                }
                byte[] bArr = d0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(d0.f10353p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            y yVar = g0Var.d;
            if (yVar != null) {
                String str6 = g0.f10400l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(y.f10798b, yVar.f10799a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(g0.f10401m, h2.e.h(list, new ci.v(9)));
            }
            String str7 = g0Var.f10409f;
            if (str7 != null) {
                bundle5.putString(g0.f10402n, str7);
            }
            if (!i0Var.isEmpty()) {
                bundle5.putParcelableArrayList(g0.f10403o, h2.e.h(i0Var, new ci.v(10)));
            }
            long j13 = g0Var.h;
            if (j13 != -9223372036854775807L) {
                bundle5.putLong(g0.f10404p, j13);
            }
            bundle.putBundle(f10494m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l0) {
                l0 l0Var = (l0) obj;
                if (Objects.equals(this.f10495a, l0Var.f10495a) && this.f10498e.equals(l0Var.f10498e) && Objects.equals(this.f10496b, l0Var.f10496b) && Objects.equals(this.f10497c, l0Var.f10497c) && Objects.equals(this.d, l0Var.d) && Objects.equals(this.f10499f, l0Var.f10499f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10495a.hashCode() * 31;
        g0 g0Var = this.f10496b;
        if (g0Var != null) {
            i7 = g0Var.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f10497c.hashCode();
        int hashCode3 = this.f10498e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f10499f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i7) * 31)) * 31)) * 31)) * 31);
    }
}
