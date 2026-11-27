package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
public final class ft6 {
    public static final ft6 g = new ts6().a();
    public static final String h = "0";
    public static final String i = "1";
    public static final String j = "2";
    public static final String k = "3";
    public static final String l = "4";
    public static final String m = "5";
    public final String a;
    public final bt6 b;
    public final at6 c;
    public final nt6 d;
    public final ws6 e;
    public final ct6 f;

    public ft6(String str, ws6 ws6Var, bt6 bt6Var, at6 at6Var, nt6 nt6Var, ct6 ct6Var) {
        this.a = str;
        this.b = bt6Var;
        this.c = at6Var;
        this.d = nt6Var;
        this.e = ws6Var;
        this.f = ct6Var;
    }

    public static ft6 a(int i2, Bundle bundle) {
        at6 at6Var;
        nt6 b;
        boolean z;
        boolean z2;
        boolean z3;
        ws6 ws6Var;
        ct6 ct6Var;
        Map b2;
        byte[] bArr;
        ys6 ys6Var;
        ss6 ss6Var;
        j99 f;
        j99 b3;
        bt6 bt6Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        if (bundle2 == null) {
            at6Var = at6.f;
        } else {
            zs6 zs6Var = new zs6();
            String str = at6.g;
            at6 at6Var2 = at6.f;
            zs6Var.a = bundle2.getLong(str, at6Var2.a);
            zs6Var.b = bundle2.getLong(at6.h, at6Var2.b);
            zs6Var.c = bundle2.getLong(at6.i, at6Var2.c);
            zs6Var.d = bundle2.getFloat(at6.j, at6Var2.d);
            zs6Var.e = bundle2.getFloat(at6.k, at6Var2.e);
            at6Var = new at6(zs6Var);
        }
        at6 at6Var3 = at6Var;
        Bundle bundle3 = bundle.getBundle(j);
        if (bundle3 == null) {
            b = nt6.M;
        } else {
            b = nt6.b(i2, bundle3);
        }
        nt6 nt6Var = b;
        Bundle bundle4 = bundle.getBundle(k);
        if (bundle4 == null) {
            ws6Var = ws6.r;
        } else {
            us6 us6Var = new us6();
            String str2 = vs6.j;
            vs6 vs6Var = vs6.i;
            long j2 = vs6Var.a;
            long j3 = vs6Var.d;
            long j4 = vs6Var.b;
            long T = gcc.T(bundle4.getLong(str2, j2));
            boolean z4 = true;
            if (T >= 0) {
                z = true;
            } else {
                z = false;
            }
            yve.f(z);
            us6Var.a = T;
            long T2 = gcc.T(bundle4.getLong(vs6.k, vs6Var.c));
            if (T2 != Long.MIN_VALUE && T2 < 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            yve.f(z2);
            us6Var.b = T2;
            us6Var.c = bundle4.getBoolean(vs6.l, vs6Var.e);
            us6Var.d = bundle4.getBoolean(vs6.m, vs6Var.f);
            us6Var.e = bundle4.getBoolean(vs6.n, vs6Var.g);
            us6Var.f = bundle4.getBoolean(vs6.q, vs6Var.h);
            long j5 = bundle4.getLong(vs6.o, j4);
            if (j5 != j4) {
                if (j5 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                yve.f(z3);
                us6Var.a = j5;
            }
            long j6 = bundle4.getLong(vs6.p, j3);
            if (j6 != j3) {
                if (j6 != Long.MIN_VALUE && j6 < 0) {
                    z4 = false;
                }
                yve.f(z4);
                us6Var.b = j6;
            }
            ws6Var = new vs6(us6Var);
        }
        ws6 ws6Var2 = ws6Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            ct6Var = ct6.d;
        } else {
            pm3 pm3Var = new pm3((byte) 16, false);
            pm3Var.b = (Uri) bundle5.getParcelable(ct6.e);
            pm3Var.c = bundle5.getString(ct6.f);
            pm3Var.d = gcc.o(bundle5.getBundle(ct6.g));
            ct6Var = new ct6(pm3Var);
        }
        ct6 ct6Var2 = ct6Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            bt6Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(bt6.k);
            if (bundle7 == null) {
                ys6Var = null;
            } else {
                String string2 = bundle7.getString(ys6.i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(ys6.j);
                String str3 = ys6.k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    b2 = o99.h;
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
                    b2 = to5.b(hashMap);
                }
                boolean z5 = bundle7.getBoolean(ys6.l, false);
                boolean z6 = bundle7.getBoolean(ys6.m, false);
                boolean z7 = bundle7.getBoolean(ys6.n, false);
                String str5 = ys6.o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                po5 q = po5.q(arrayList);
                byte[] byteArray = bundle7.getByteArray(ys6.p);
                xs6 xs6Var = new xs6();
                xs6Var.a = fromString;
                xs6Var.b = uri;
                xs6Var.c = to5.b(b2);
                xs6Var.d = z5;
                xs6Var.f = z7;
                xs6Var.e = z6;
                xs6Var.g = po5.q(q);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                xs6Var.h = bArr;
                ys6Var = new ys6(xs6Var);
            }
            Bundle bundle10 = bundle6.getBundle(bt6.l);
            if (bundle10 == null) {
                ss6Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(ss6.b);
                uri2.getClass();
                xh4 xh4Var = new xh4((byte) 14, false);
                xh4Var.b = uri2;
                ss6Var = new ss6(xh4Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(bt6.m);
            if (parcelableArrayList == null) {
                no5 no5Var = po5.b;
                f = j99.e;
            } else {
                mo5 p = po5.p();
                int i3 = 0;
                while (i3 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i3);
                    bundle11.getClass();
                    p.c(new scb(bundle11.getInt(scb.d, 0), bundle11.getInt(scb.e, 0), bundle11.getInt(scb.f, 0)));
                    i3++;
                    parcelableArrayList = parcelableArrayList;
                }
                f = p.f();
            }
            j99 j99Var = f;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(bt6.o);
            if (parcelableArrayList2 == null) {
                no5 no5Var2 = po5.b;
                b3 = j99.e;
            } else {
                b3 = e31.b(new p31((byte) 11), parcelableArrayList2);
            }
            j99 j99Var2 = b3;
            long j7 = bundle6.getLong(bt6.p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(bt6.i);
            uri3.getClass();
            bt6Var = new bt6(uri3, bundle6.getString(bt6.j), ys6Var, ss6Var, j99Var, bundle6.getString(bt6.n), j99Var2, j7);
        }
        return new ft6(string, ws6Var2, bt6Var, at6Var3, nt6Var, ct6Var2);
    }

    public final Bundle b(int i2, boolean z) {
        bt6 bt6Var;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        at6 at6Var = at6.f;
        at6 at6Var2 = this.c;
        if (!at6Var2.equals(at6Var)) {
            bundle.putBundle(i, at6Var2.b());
        }
        nt6 nt6Var = nt6.M;
        nt6 nt6Var2 = this.d;
        if (!nt6Var2.equals(nt6Var)) {
            bundle.putBundle(j, nt6Var2.c(i2));
        }
        vs6 vs6Var = vs6.i;
        ws6 ws6Var = this.e;
        if (!ws6Var.equals(vs6Var)) {
            Bundle bundle2 = new Bundle();
            long j2 = ws6Var.a;
            if (j2 != vs6Var.a) {
                bundle2.putLong(vs6.j, j2);
            }
            long j3 = ws6Var.c;
            if (j3 != vs6Var.c) {
                bundle2.putLong(vs6.k, j3);
            }
            long j4 = ws6Var.b;
            if (j4 != vs6Var.b) {
                bundle2.putLong(vs6.o, j4);
            }
            long j5 = ws6Var.d;
            if (j5 != vs6Var.d) {
                bundle2.putLong(vs6.p, j5);
            }
            boolean z2 = ws6Var.e;
            if (z2 != vs6Var.e) {
                bundle2.putBoolean(vs6.l, z2);
            }
            boolean z3 = ws6Var.f;
            if (z3 != vs6Var.f) {
                bundle2.putBoolean(vs6.m, z3);
            }
            boolean z4 = ws6Var.g;
            if (z4 != vs6Var.g) {
                bundle2.putBoolean(vs6.n, z4);
            }
            boolean z5 = ws6Var.h;
            if (z5 != vs6Var.h) {
                bundle2.putBoolean(vs6.q, z5);
            }
            bundle.putBundle(k, bundle2);
        }
        ct6 ct6Var = ct6.d;
        ct6 ct6Var2 = this.f;
        if (!ct6Var2.equals(ct6Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = ct6Var2.a;
            if (uri != null) {
                bundle3.putParcelable(ct6.e, uri);
            }
            String str2 = ct6Var2.b;
            if (str2 != null) {
                bundle3.putString(ct6.f, str2);
            }
            Bundle bundle4 = ct6Var2.c;
            if (bundle4 != null) {
                bundle3.putBundle(ct6.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z && (bt6Var = this.b) != null) {
            po5 po5Var = bt6Var.g;
            List list = bt6Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(bt6.i, bt6Var.a);
            String str3 = bt6Var.b;
            if (str3 != null) {
                bundle5.putString(bt6.j, str3);
            }
            ys6 ys6Var = bt6Var.c;
            if (ys6Var != null) {
                String str4 = bt6.k;
                po5 po5Var2 = ys6Var.g;
                to5 to5Var = ys6Var.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(ys6.i, ys6Var.a.toString());
                Uri uri2 = ys6Var.b;
                if (uri2 != null) {
                    bundle6.putParcelable(ys6.j, uri2);
                }
                if (!to5Var.isEmpty()) {
                    String str5 = ys6.k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : to5Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z6 = ys6Var.d;
                if (z6) {
                    bundle6.putBoolean(ys6.l, z6);
                }
                boolean z7 = ys6Var.e;
                if (z7) {
                    bundle6.putBoolean(ys6.m, z7);
                }
                boolean z8 = ys6Var.f;
                if (z8) {
                    bundle6.putBoolean(ys6.n, z8);
                }
                if (!po5Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(ys6.o, new ArrayList<>(po5Var2));
                }
                byte[] bArr = ys6Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(ys6.p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            ss6 ss6Var = bt6Var.d;
            if (ss6Var != null) {
                String str6 = bt6.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(ss6.b, ss6Var.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(bt6.m, e31.c(list, new p31((byte) 9)));
            }
            String str7 = bt6Var.f;
            if (str7 != null) {
                bundle5.putString(bt6.n, str7);
            }
            if (!po5Var.isEmpty()) {
                bundle5.putParcelableArrayList(bt6.o, e31.c(po5Var, new p31((byte) 10)));
            }
            long j6 = bt6Var.h;
            if (j6 != -9223372036854775807L) {
                bundle5.putLong(bt6.p, j6);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ft6) {
                ft6 ft6Var = (ft6) obj;
                if (Objects.equals(this.a, ft6Var.a) && this.e.equals(ft6Var.e) && Objects.equals(this.b, ft6Var.b) && this.c.equals(ft6Var.c) && Objects.equals(this.d, ft6Var.d) && Objects.equals(this.f, ft6Var.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.a.hashCode() * 31;
        bt6 bt6Var = this.b;
        if (bt6Var != null) {
            i2 = bt6Var.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i2) * 31)) * 31)) * 31)) * 31);
    }
}
