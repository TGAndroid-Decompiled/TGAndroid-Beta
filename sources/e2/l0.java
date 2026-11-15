package e2;

import a8.ja;
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
public final class l0 {
    public static final l0 f10179g;
    public static final String h;
    public static final String f10180i;
    public static final String f10181j;
    public static final String f10182k;
    public static final String f10183l;
    public static final String f10184m;
    public final String f10185a;
    public final g0 f10186b;
    public final f0 f10187c;
    public final o0 d;
    public final b0 f10188e;
    public final h0 f10189f;

    static {
        z zVar = new z();
        h9.g0 g0Var = h9.i0.f13686b;
        h9.s1 s1Var = h9.s1.f13749e;
        List list = Collections.EMPTY_LIST;
        h9.s1 s1Var2 = h9.s1.f13749e;
        e0 e0Var = new e0();
        f10179g = new l0("", new a0(zVar), null, new f0(e0Var), o0.L, h0.d);
        h = Integer.toString(0, 36);
        f10180i = Integer.toString(1, 36);
        f10181j = Integer.toString(2, 36);
        f10182k = Integer.toString(3, 36);
        f10183l = Integer.toString(4, 36);
        f10184m = Integer.toString(5, 36);
    }

    public l0(String str, b0 b0Var, g0 g0Var, f0 f0Var, o0 o0Var, h0 h0Var) {
        this.f10185a = str;
        this.f10186b = g0Var;
        this.f10187c = f0Var;
        this.d = o0Var;
        this.f10188e = b0Var;
        this.f10189f = h0Var;
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
        h9.s1 f10;
        h9.s1 b12;
        g0 g0Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(f10180i);
        if (bundle2 == null) {
            f0Var = f0.f10072f;
        } else {
            e0 e0Var = new e0();
            String str = f0.f10073g;
            f0 f0Var2 = f0.f10072f;
            e0Var.f10065a = bundle2.getLong(str, f0Var2.f10077a);
            e0Var.f10066b = bundle2.getLong(f0.h, f0Var2.f10078b);
            e0Var.f10067c = bundle2.getLong(f0.f10074i, f0Var2.f10079c);
            e0Var.d = bundle2.getFloat(f0.f10075j, f0Var2.d);
            e0Var.f10068e = bundle2.getFloat(f0.f10076k, f0Var2.f10080e);
            f0Var = new f0(e0Var);
        }
        f0 f0Var3 = f0Var;
        Bundle bundle3 = bundle.getBundle(f10181j);
        if (bundle3 == null) {
            b10 = o0.L;
        } else {
            b10 = o0.b(i7, bundle3);
        }
        o0 o0Var = b10;
        Bundle bundle4 = bundle.getBundle(f10182k);
        if (bundle4 == null) {
            b0Var = b0.f10011r;
        } else {
            z zVar = new z();
            String str2 = a0.f9997j;
            a0 a0Var = a0.f9996i;
            long j3 = a0Var.f10005a;
            long j10 = a0Var.d;
            long j11 = a0Var.f10006b;
            long S = h2.l0.S(bundle4.getLong(str2, j3));
            boolean z13 = true;
            if (S >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ja.f(z10);
            zVar.f10493a = S;
            long S2 = h2.l0.S(bundle4.getLong(a0.f9998k, a0Var.f10007c));
            if (S2 != Long.MIN_VALUE && S2 < 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            ja.f(z11);
            zVar.f10494b = S2;
            zVar.f10495c = bundle4.getBoolean(a0.f9999l, a0Var.f10008e);
            zVar.d = bundle4.getBoolean(a0.f10000m, a0Var.f10009f);
            zVar.f10496e = bundle4.getBoolean(a0.f10001n, a0Var.f10010g);
            zVar.f10497f = bundle4.getBoolean(a0.f10004q, a0Var.h);
            long j12 = bundle4.getLong(a0.f10002o, j11);
            if (j12 != j11) {
                if (j12 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ja.f(z12);
                zVar.f10493a = j12;
            }
            long j13 = bundle4.getLong(a0.f10003p, j10);
            if (j13 != j10) {
                if (j13 != Long.MIN_VALUE && j13 < 0) {
                    z13 = false;
                }
                ja.f(z13);
                zVar.f10494b = j13;
            }
            b0Var = new a0(zVar);
        }
        b0 b0Var2 = b0Var;
        Bundle bundle5 = bundle.getBundle(f10183l);
        if (bundle5 == null) {
            h0Var = h0.d;
        } else {
            android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(21, false);
            a0Var2.f1706b = (Uri) bundle5.getParcelable(h0.f10105e);
            a0Var2.f1707c = bundle5.getString(h0.f10106f);
            a0Var2.d = h2.l0.o(bundle5.getBundle(h0.f10107g));
            h0Var = new h0(a0Var2);
        }
        h0 h0Var2 = h0Var;
        Bundle bundle6 = bundle.getBundle(f10184m);
        if (bundle6 == null) {
            g0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(g0.f10089k);
            if (bundle7 == null) {
                d0Var = null;
            } else {
                String string2 = bundle7.getString(d0.f10036i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(d0.f10037j);
                String str3 = d0.f10038k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    b11 = h9.x1.h;
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
                boolean z14 = bundle7.getBoolean(d0.f10039l, false);
                boolean z15 = bundle7.getBoolean(d0.f10040m, false);
                boolean z16 = bundle7.getBoolean(d0.f10041n, false);
                String str5 = d0.f10042o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                h9.i0 q10 = h9.i0.q(arrayList);
                byte[] byteArray = bundle7.getByteArray(d0.f10043p);
                c0 c0Var = new c0();
                c0Var.f10030a = fromString;
                c0Var.f10031b = uri;
                c0Var.f10032c = h9.l0.b(b11);
                c0Var.d = z14;
                c0Var.f10034f = z16;
                c0Var.f10033e = z15;
                c0Var.f10035g = h9.i0.q(q10);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                c0Var.h = bArr;
                d0Var = new d0(c0Var);
            }
            Bundle bundle10 = bundle6.getBundle(g0.f10090l);
            if (bundle10 == null) {
                yVar = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(y.f10488b);
                uri2.getClass();
                ?? obj = new Object();
                obj.f10481a = uri2;
                yVar = new y(obj);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(g0.f10091m);
            if (parcelableArrayList == null) {
                h9.g0 g0Var2 = h9.i0.f13686b;
                f10 = h9.s1.f13749e;
            } else {
                h9.f0 p10 = h9.i0.p();
                int i10 = 0;
                while (i10 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i10);
                    bundle11.getClass();
                    p10.c(new f1(bundle11.getInt(f1.d, 0), bundle11.getInt(f1.f10081e, 0), bundle11.getInt(f1.f10082f, 0)));
                    i10++;
                    parcelableArrayList = parcelableArrayList;
                }
                f10 = p10.f();
            }
            h9.s1 s1Var = f10;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(g0.f10093o);
            if (parcelableArrayList2 == null) {
                h9.g0 g0Var3 = h9.i0.f13686b;
                b12 = h9.s1.f13749e;
            } else {
                b12 = h2.e.b(new di.o(10), parcelableArrayList2);
            }
            h9.s1 s1Var2 = b12;
            long j14 = bundle6.getLong(g0.f10094p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(g0.f10087i);
            uri3.getClass();
            g0Var = new g0(uri3, bundle6.getString(g0.f10088j), d0Var, yVar, s1Var, bundle6.getString(g0.f10092n), s1Var2, j14);
        }
        return new l0(string, b0Var2, g0Var, f0Var3, o0Var, h0Var2);
    }

    public static l0 b(Uri uri) {
        boolean z10;
        g0 g0Var;
        z zVar = new z();
        c0 c0Var = new c0();
        List list = Collections.EMPTY_LIST;
        h9.s1 s1Var = h9.s1.f13749e;
        e0 e0Var = new e0();
        h0 h0Var = h0.d;
        if (c0Var.f10031b != null && c0Var.f10030a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ja.p(z10);
        d0 d0Var = null;
        if (uri != null) {
            if (c0Var.f10030a != null) {
                d0Var = new d0(c0Var);
            }
            g0Var = new g0(uri, null, d0Var, null, list, null, s1Var, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        return new l0("", new a0(zVar), g0Var, new f0(e0Var), o0.L, h0Var);
    }

    public final Bundle c(int i7, boolean z10) {
        g0 g0Var;
        Bundle bundle = new Bundle();
        String str = this.f10185a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        f0 f0Var = f0.f10072f;
        f0 f0Var2 = this.f10187c;
        if (!f0Var2.equals(f0Var)) {
            bundle.putBundle(f10180i, f0Var2.b());
        }
        o0 o0Var = o0.L;
        o0 o0Var2 = this.d;
        if (!o0Var2.equals(o0Var)) {
            bundle.putBundle(f10181j, o0Var2.c(i7));
        }
        a0 a0Var = a0.f9996i;
        b0 b0Var = this.f10188e;
        if (!b0Var.equals(a0Var)) {
            Bundle bundle2 = new Bundle();
            long j3 = b0Var.f10005a;
            if (j3 != a0Var.f10005a) {
                bundle2.putLong(a0.f9997j, j3);
            }
            long j10 = b0Var.f10007c;
            if (j10 != a0Var.f10007c) {
                bundle2.putLong(a0.f9998k, j10);
            }
            long j11 = b0Var.f10006b;
            if (j11 != a0Var.f10006b) {
                bundle2.putLong(a0.f10002o, j11);
            }
            long j12 = b0Var.d;
            if (j12 != a0Var.d) {
                bundle2.putLong(a0.f10003p, j12);
            }
            boolean z11 = b0Var.f10008e;
            if (z11 != a0Var.f10008e) {
                bundle2.putBoolean(a0.f9999l, z11);
            }
            boolean z12 = b0Var.f10009f;
            if (z12 != a0Var.f10009f) {
                bundle2.putBoolean(a0.f10000m, z12);
            }
            boolean z13 = b0Var.f10010g;
            if (z13 != a0Var.f10010g) {
                bundle2.putBoolean(a0.f10001n, z13);
            }
            boolean z14 = b0Var.h;
            if (z14 != a0Var.h) {
                bundle2.putBoolean(a0.f10004q, z14);
            }
            bundle.putBundle(f10182k, bundle2);
        }
        h0 h0Var = h0.d;
        h0 h0Var2 = this.f10189f;
        if (!h0Var2.equals(h0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = h0Var2.f10108a;
            if (uri != null) {
                bundle3.putParcelable(h0.f10105e, uri);
            }
            String str2 = h0Var2.f10109b;
            if (str2 != null) {
                bundle3.putString(h0.f10106f, str2);
            }
            Bundle bundle4 = h0Var2.f10110c;
            if (bundle4 != null) {
                bundle3.putBundle(h0.f10107g, bundle4);
            }
            bundle.putBundle(f10183l, bundle3);
        }
        if (z10 && (g0Var = this.f10186b) != null) {
            h9.i0 i0Var = g0Var.f10100g;
            List list = g0Var.f10098e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(g0.f10087i, g0Var.f10095a);
            String str3 = g0Var.f10096b;
            if (str3 != null) {
                bundle5.putString(g0.f10088j, str3);
            }
            d0 d0Var = g0Var.f10097c;
            if (d0Var != null) {
                String str4 = g0.f10089k;
                h9.i0 i0Var2 = d0Var.f10049g;
                h9.l0 l0Var = d0Var.f10046c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(d0.f10036i, d0Var.f10044a.toString());
                Uri uri2 = d0Var.f10045b;
                if (uri2 != null) {
                    bundle6.putParcelable(d0.f10037j, uri2);
                }
                if (!l0Var.isEmpty()) {
                    String str5 = d0.f10038k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : l0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = d0Var.d;
                if (z15) {
                    bundle6.putBoolean(d0.f10039l, z15);
                }
                boolean z16 = d0Var.f10047e;
                if (z16) {
                    bundle6.putBoolean(d0.f10040m, z16);
                }
                boolean z17 = d0Var.f10048f;
                if (z17) {
                    bundle6.putBoolean(d0.f10041n, z17);
                }
                if (!i0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(d0.f10042o, new ArrayList<>(i0Var2));
                }
                byte[] bArr = d0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(d0.f10043p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            y yVar = g0Var.d;
            if (yVar != null) {
                String str6 = g0.f10090l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(y.f10488b, yVar.f10489a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(g0.f10091m, h2.e.h(list, new di.o(8)));
            }
            String str7 = g0Var.f10099f;
            if (str7 != null) {
                bundle5.putString(g0.f10092n, str7);
            }
            if (!i0Var.isEmpty()) {
                bundle5.putParcelableArrayList(g0.f10093o, h2.e.h(i0Var, new di.o(9)));
            }
            long j13 = g0Var.h;
            if (j13 != -9223372036854775807L) {
                bundle5.putLong(g0.f10094p, j13);
            }
            bundle.putBundle(f10184m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l0) {
                l0 l0Var = (l0) obj;
                if (Objects.equals(this.f10185a, l0Var.f10185a) && this.f10188e.equals(l0Var.f10188e) && Objects.equals(this.f10186b, l0Var.f10186b) && Objects.equals(this.f10187c, l0Var.f10187c) && Objects.equals(this.d, l0Var.d) && Objects.equals(this.f10189f, l0Var.f10189f)) {
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
        int hashCode = this.f10185a.hashCode() * 31;
        g0 g0Var = this.f10186b;
        if (g0Var != null) {
            i7 = g0Var.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f10187c.hashCode();
        int hashCode3 = this.f10188e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f10189f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i7) * 31)) * 31)) * 31)) * 31);
    }
}
