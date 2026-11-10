package e2;

import a8.ia;
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
    public static final l0 f10348g;
    public static final String h;
    public static final String f10349i;
    public static final String f10350j;
    public static final String f10351k;
    public static final String f10352l;
    public static final String f10353m;
    public final String f10354a;
    public final g0 f10355b;
    public final f0 f10356c;
    public final o0 d;
    public final b0 f10357e;
    public final h0 f10358f;

    static {
        z zVar = new z();
        h9.g0 g0Var = h9.i0.f14331b;
        h9.t1 t1Var = h9.t1.f14399e;
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var2 = h9.t1.f14399e;
        e0 e0Var = new e0();
        f10348g = new l0("", new a0(zVar), null, new f0(e0Var), o0.L, h0.d);
        h = Integer.toString(0, 36);
        f10349i = Integer.toString(1, 36);
        f10350j = Integer.toString(2, 36);
        f10351k = Integer.toString(3, 36);
        f10352l = Integer.toString(4, 36);
        f10353m = Integer.toString(5, 36);
    }

    public l0(String str, b0 b0Var, g0 g0Var, f0 f0Var, o0 o0Var, h0 h0Var) {
        this.f10354a = str;
        this.f10355b = g0Var;
        this.f10356c = f0Var;
        this.d = o0Var;
        this.f10357e = b0Var;
        this.f10358f = h0Var;
    }

    public static l0 a(int i7, Bundle bundle) {
        f0 f0Var;
        o0 b10;
        boolean z9;
        boolean z10;
        boolean z11;
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
        Bundle bundle2 = bundle.getBundle(f10349i);
        if (bundle2 == null) {
            f0Var = f0.f10241f;
        } else {
            e0 e0Var = new e0();
            String str = f0.f10242g;
            f0 f0Var2 = f0.f10241f;
            e0Var.f10234a = bundle2.getLong(str, f0Var2.f10246a);
            e0Var.f10235b = bundle2.getLong(f0.h, f0Var2.f10247b);
            e0Var.f10236c = bundle2.getLong(f0.f10243i, f0Var2.f10248c);
            e0Var.d = bundle2.getFloat(f0.f10244j, f0Var2.d);
            e0Var.f10237e = bundle2.getFloat(f0.f10245k, f0Var2.f10249e);
            f0Var = new f0(e0Var);
        }
        f0 f0Var3 = f0Var;
        Bundle bundle3 = bundle.getBundle(f10350j);
        if (bundle3 == null) {
            b10 = o0.L;
        } else {
            b10 = o0.b(i7, bundle3);
        }
        o0 o0Var = b10;
        Bundle bundle4 = bundle.getBundle(f10351k);
        if (bundle4 == null) {
            b0Var = b0.f10180r;
        } else {
            z zVar = new z();
            String str2 = a0.f10166j;
            a0 a0Var = a0.f10165i;
            long j3 = a0Var.f10174a;
            long j10 = a0Var.d;
            long j11 = a0Var.f10175b;
            long S = h2.m0.S(bundle4.getLong(str2, j3));
            boolean z12 = true;
            if (S >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.f(z9);
            zVar.f10662a = S;
            long S2 = h2.m0.S(bundle4.getLong(a0.f10167k, a0Var.f10176c));
            if (S2 != Long.MIN_VALUE && S2 < 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            ia.f(z10);
            zVar.f10663b = S2;
            zVar.f10664c = bundle4.getBoolean(a0.f10168l, a0Var.f10177e);
            zVar.d = bundle4.getBoolean(a0.f10169m, a0Var.f10178f);
            zVar.f10665e = bundle4.getBoolean(a0.f10170n, a0Var.f10179g);
            zVar.f10666f = bundle4.getBoolean(a0.f10173q, a0Var.h);
            long j12 = bundle4.getLong(a0.f10171o, j11);
            if (j12 != j11) {
                if (j12 >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ia.f(z11);
                zVar.f10662a = j12;
            }
            long j13 = bundle4.getLong(a0.f10172p, j10);
            if (j13 != j10) {
                if (j13 != Long.MIN_VALUE && j13 < 0) {
                    z12 = false;
                }
                ia.f(z12);
                zVar.f10663b = j13;
            }
            b0Var = new a0(zVar);
        }
        b0 b0Var2 = b0Var;
        Bundle bundle5 = bundle.getBundle(f10352l);
        if (bundle5 == null) {
            h0Var = h0.d;
        } else {
            android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(20, false);
            a0Var2.f1763b = (Uri) bundle5.getParcelable(h0.f10274e);
            a0Var2.f1764c = bundle5.getString(h0.f10275f);
            a0Var2.d = h2.m0.o(bundle5.getBundle(h0.f10276g));
            h0Var = new h0(a0Var2);
        }
        h0 h0Var2 = h0Var;
        Bundle bundle6 = bundle.getBundle(f10353m);
        if (bundle6 == null) {
            g0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(g0.f10258k);
            if (bundle7 == null) {
                d0Var = null;
            } else {
                String string2 = bundle7.getString(d0.f10205i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(d0.f10206j);
                String str3 = d0.f10207k;
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
                boolean z13 = bundle7.getBoolean(d0.f10208l, false);
                boolean z14 = bundle7.getBoolean(d0.f10209m, false);
                boolean z15 = bundle7.getBoolean(d0.f10210n, false);
                String str5 = d0.f10211o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                h9.i0 q10 = h9.i0.q(arrayList);
                byte[] byteArray = bundle7.getByteArray(d0.f10212p);
                c0 c0Var = new c0();
                c0Var.f10199a = fromString;
                c0Var.f10200b = uri;
                c0Var.f10201c = h9.l0.b(b11);
                c0Var.d = z13;
                c0Var.f10203f = z15;
                c0Var.f10202e = z14;
                c0Var.f10204g = h9.i0.q(q10);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                c0Var.h = bArr;
                d0Var = new d0(c0Var);
            }
            Bundle bundle10 = bundle6.getBundle(g0.f10259l);
            if (bundle10 == null) {
                yVar = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(y.f10657b);
                uri2.getClass();
                ?? obj = new Object();
                obj.f10650a = uri2;
                yVar = new y(obj);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(g0.f10260m);
            if (parcelableArrayList == null) {
                h9.g0 g0Var2 = h9.i0.f14331b;
                f10 = h9.t1.f14399e;
            } else {
                h9.f0 p10 = h9.i0.p();
                int i10 = 0;
                while (i10 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i10);
                    bundle11.getClass();
                    p10.c(new f1(bundle11.getInt(f1.d, 0), bundle11.getInt(f1.f10250e, 0), bundle11.getInt(f1.f10251f, 0)));
                    i10++;
                    parcelableArrayList = parcelableArrayList;
                }
                f10 = p10.f();
            }
            h9.t1 t1Var = f10;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(g0.f10262o);
            if (parcelableArrayList2 == null) {
                h9.g0 g0Var3 = h9.i0.f14331b;
                b12 = h9.t1.f14399e;
            } else {
                b12 = h2.e.b(new di.a1(7), parcelableArrayList2);
            }
            h9.t1 t1Var2 = b12;
            long j14 = bundle6.getLong(g0.f10263p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(g0.f10256i);
            uri3.getClass();
            g0Var = new g0(uri3, bundle6.getString(g0.f10257j), d0Var, yVar, t1Var, bundle6.getString(g0.f10261n), t1Var2, j14);
        }
        return new l0(string, b0Var2, g0Var, f0Var3, o0Var, h0Var2);
    }

    public static l0 b(Uri uri) {
        boolean z9;
        g0 g0Var;
        z zVar = new z();
        c0 c0Var = new c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.f14399e;
        e0 e0Var = new e0();
        h0 h0Var = h0.d;
        if (c0Var.f10200b != null && c0Var.f10199a == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.p(z9);
        d0 d0Var = null;
        if (uri != null) {
            if (c0Var.f10199a != null) {
                d0Var = new d0(c0Var);
            }
            g0Var = new g0(uri, null, d0Var, null, list, null, t1Var, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        return new l0("", new a0(zVar), g0Var, new f0(e0Var), o0.L, h0Var);
    }

    public final Bundle c(int i7, boolean z9) {
        g0 g0Var;
        Bundle bundle = new Bundle();
        String str = this.f10354a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        f0 f0Var = f0.f10241f;
        f0 f0Var2 = this.f10356c;
        if (!f0Var2.equals(f0Var)) {
            bundle.putBundle(f10349i, f0Var2.b());
        }
        o0 o0Var = o0.L;
        o0 o0Var2 = this.d;
        if (!o0Var2.equals(o0Var)) {
            bundle.putBundle(f10350j, o0Var2.c(i7));
        }
        a0 a0Var = a0.f10165i;
        b0 b0Var = this.f10357e;
        if (!b0Var.equals(a0Var)) {
            Bundle bundle2 = new Bundle();
            long j3 = b0Var.f10174a;
            if (j3 != a0Var.f10174a) {
                bundle2.putLong(a0.f10166j, j3);
            }
            long j10 = b0Var.f10176c;
            if (j10 != a0Var.f10176c) {
                bundle2.putLong(a0.f10167k, j10);
            }
            long j11 = b0Var.f10175b;
            if (j11 != a0Var.f10175b) {
                bundle2.putLong(a0.f10171o, j11);
            }
            long j12 = b0Var.d;
            if (j12 != a0Var.d) {
                bundle2.putLong(a0.f10172p, j12);
            }
            boolean z10 = b0Var.f10177e;
            if (z10 != a0Var.f10177e) {
                bundle2.putBoolean(a0.f10168l, z10);
            }
            boolean z11 = b0Var.f10178f;
            if (z11 != a0Var.f10178f) {
                bundle2.putBoolean(a0.f10169m, z11);
            }
            boolean z12 = b0Var.f10179g;
            if (z12 != a0Var.f10179g) {
                bundle2.putBoolean(a0.f10170n, z12);
            }
            boolean z13 = b0Var.h;
            if (z13 != a0Var.h) {
                bundle2.putBoolean(a0.f10173q, z13);
            }
            bundle.putBundle(f10351k, bundle2);
        }
        h0 h0Var = h0.d;
        h0 h0Var2 = this.f10358f;
        if (!h0Var2.equals(h0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = h0Var2.f10277a;
            if (uri != null) {
                bundle3.putParcelable(h0.f10274e, uri);
            }
            String str2 = h0Var2.f10278b;
            if (str2 != null) {
                bundle3.putString(h0.f10275f, str2);
            }
            Bundle bundle4 = h0Var2.f10279c;
            if (bundle4 != null) {
                bundle3.putBundle(h0.f10276g, bundle4);
            }
            bundle.putBundle(f10352l, bundle3);
        }
        if (z9 && (g0Var = this.f10355b) != null) {
            h9.i0 i0Var = g0Var.f10269g;
            List list = g0Var.f10267e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(g0.f10256i, g0Var.f10264a);
            String str3 = g0Var.f10265b;
            if (str3 != null) {
                bundle5.putString(g0.f10257j, str3);
            }
            d0 d0Var = g0Var.f10266c;
            if (d0Var != null) {
                String str4 = g0.f10258k;
                h9.i0 i0Var2 = d0Var.f10218g;
                h9.l0 l0Var = d0Var.f10215c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(d0.f10205i, d0Var.f10213a.toString());
                Uri uri2 = d0Var.f10214b;
                if (uri2 != null) {
                    bundle6.putParcelable(d0.f10206j, uri2);
                }
                if (!l0Var.isEmpty()) {
                    String str5 = d0.f10207k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : l0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z14 = d0Var.d;
                if (z14) {
                    bundle6.putBoolean(d0.f10208l, z14);
                }
                boolean z15 = d0Var.f10216e;
                if (z15) {
                    bundle6.putBoolean(d0.f10209m, z15);
                }
                boolean z16 = d0Var.f10217f;
                if (z16) {
                    bundle6.putBoolean(d0.f10210n, z16);
                }
                if (!i0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(d0.f10211o, new ArrayList<>(i0Var2));
                }
                byte[] bArr = d0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(d0.f10212p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            y yVar = g0Var.d;
            if (yVar != null) {
                String str6 = g0.f10259l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(y.f10657b, yVar.f10658a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(g0.f10260m, h2.e.h(list, new di.a1(5)));
            }
            String str7 = g0Var.f10268f;
            if (str7 != null) {
                bundle5.putString(g0.f10261n, str7);
            }
            if (!i0Var.isEmpty()) {
                bundle5.putParcelableArrayList(g0.f10262o, h2.e.h(i0Var, new di.a1(6)));
            }
            long j13 = g0Var.h;
            if (j13 != -9223372036854775807L) {
                bundle5.putLong(g0.f10263p, j13);
            }
            bundle.putBundle(f10353m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l0) {
                l0 l0Var = (l0) obj;
                if (Objects.equals(this.f10354a, l0Var.f10354a) && this.f10357e.equals(l0Var.f10357e) && Objects.equals(this.f10355b, l0Var.f10355b) && Objects.equals(this.f10356c, l0Var.f10356c) && Objects.equals(this.d, l0Var.d) && Objects.equals(this.f10358f, l0Var.f10358f)) {
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
        int hashCode = this.f10354a.hashCode() * 31;
        g0 g0Var = this.f10355b;
        if (g0Var != null) {
            i7 = g0Var.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f10356c.hashCode();
        int hashCode3 = this.f10357e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f10358f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i7) * 31)) * 31)) * 31)) * 31);
    }
}
