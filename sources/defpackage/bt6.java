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
public final class bt6 {
    public static final bt6 g = new ps6().a();
    public static final String h = "0";
    public static final String i = "1";
    public static final String j = "2";
    public static final String k = "3";
    public static final String l = "4";
    public static final String m = "5";
    public final String a;
    public final xs6 b;
    public final ws6 c;
    public final jt6 d;
    public final ss6 e;
    public final ys6 f;

    public bt6(String str, ss6 ss6Var, xs6 xs6Var, ws6 ws6Var, jt6 jt6Var, ys6 ys6Var) {
        this.a = str;
        this.b = xs6Var;
        this.c = ws6Var;
        this.d = jt6Var;
        this.e = ss6Var;
        this.f = ys6Var;
    }

    public static bt6 a(int i2, Bundle bundle) {
        ws6 ws6Var;
        jt6 b;
        boolean z;
        boolean z2;
        boolean z3;
        ss6 ss6Var;
        ys6 ys6Var;
        Map b2;
        byte[] bArr;
        us6 us6Var;
        os6 os6Var;
        y79 f;
        y79 b3;
        xs6 xs6Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        if (bundle2 == null) {
            ws6Var = ws6.f;
        } else {
            vs6 vs6Var = new vs6();
            String str = ws6.g;
            ws6 ws6Var2 = ws6.f;
            vs6Var.a = bundle2.getLong(str, ws6Var2.a);
            vs6Var.b = bundle2.getLong(ws6.h, ws6Var2.b);
            vs6Var.c = bundle2.getLong(ws6.i, ws6Var2.c);
            vs6Var.d = bundle2.getFloat(ws6.j, ws6Var2.d);
            vs6Var.e = bundle2.getFloat(ws6.k, ws6Var2.e);
            ws6Var = new ws6(vs6Var);
        }
        ws6 ws6Var3 = ws6Var;
        Bundle bundle3 = bundle.getBundle(j);
        if (bundle3 == null) {
            b = jt6.M;
        } else {
            b = jt6.b(i2, bundle3);
        }
        jt6 jt6Var = b;
        Bundle bundle4 = bundle.getBundle(k);
        if (bundle4 == null) {
            ss6Var = ss6.r;
        } else {
            qs6 qs6Var = new qs6();
            String str2 = rs6.j;
            rs6 rs6Var = rs6.i;
            long j2 = rs6Var.a;
            long j3 = rs6Var.d;
            long j4 = rs6Var.b;
            long T = hac.T(bundle4.getLong(str2, j2));
            boolean z4 = true;
            if (T >= 0) {
                z = true;
            } else {
                z = false;
            }
            jte.f(z);
            qs6Var.a = T;
            long T2 = hac.T(bundle4.getLong(rs6.k, rs6Var.c));
            if (T2 != Long.MIN_VALUE && T2 < 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            jte.f(z2);
            qs6Var.b = T2;
            qs6Var.c = bundle4.getBoolean(rs6.l, rs6Var.e);
            qs6Var.d = bundle4.getBoolean(rs6.m, rs6Var.f);
            qs6Var.e = bundle4.getBoolean(rs6.n, rs6Var.g);
            qs6Var.f = bundle4.getBoolean(rs6.q, rs6Var.h);
            long j5 = bundle4.getLong(rs6.o, j4);
            if (j5 != j4) {
                if (j5 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                jte.f(z3);
                qs6Var.a = j5;
            }
            long j6 = bundle4.getLong(rs6.p, j3);
            if (j6 != j3) {
                if (j6 != Long.MIN_VALUE && j6 < 0) {
                    z4 = false;
                }
                jte.f(z4);
                qs6Var.b = j6;
            }
            ss6Var = new rs6(qs6Var);
        }
        ss6 ss6Var2 = ss6Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            ys6Var = ys6.d;
        } else {
            in3 in3Var = new in3((byte) 16, false);
            in3Var.b = (Uri) bundle5.getParcelable(ys6.e);
            in3Var.c = bundle5.getString(ys6.f);
            in3Var.d = hac.o(bundle5.getBundle(ys6.g));
            ys6Var = new ys6(in3Var);
        }
        ys6 ys6Var2 = ys6Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            xs6Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(xs6.k);
            if (bundle7 == null) {
                us6Var = null;
            } else {
                String string2 = bundle7.getString(us6.i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(us6.j);
                String str3 = us6.k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    b2 = d89.h;
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
                    b2 = qo5.b(hashMap);
                }
                boolean z5 = bundle7.getBoolean(us6.l, false);
                boolean z6 = bundle7.getBoolean(us6.m, false);
                boolean z7 = bundle7.getBoolean(us6.n, false);
                String str5 = us6.o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                mo5 q = mo5.q(arrayList);
                byte[] byteArray = bundle7.getByteArray(us6.p);
                ts6 ts6Var = new ts6();
                ts6Var.a = fromString;
                ts6Var.b = uri;
                ts6Var.c = qo5.b(b2);
                ts6Var.d = z5;
                ts6Var.f = z7;
                ts6Var.e = z6;
                ts6Var.g = mo5.q(q);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                ts6Var.h = bArr;
                us6Var = new us6(ts6Var);
            }
            Bundle bundle10 = bundle6.getBundle(xs6.l);
            if (bundle10 == null) {
                os6Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(os6.b);
                uri2.getClass();
                ai4 ai4Var = new ai4((byte) 14, false);
                ai4Var.b = uri2;
                os6Var = new os6(ai4Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(xs6.m);
            if (parcelableArrayList == null) {
                ko5 ko5Var = mo5.b;
                f = y79.e;
            } else {
                jo5 p = mo5.p();
                int i3 = 0;
                while (i3 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i3);
                    bundle11.getClass();
                    p.c(new vab(bundle11.getInt(vab.d, 0), bundle11.getInt(vab.e, 0), bundle11.getInt(vab.f, 0)));
                    i3++;
                    parcelableArrayList = parcelableArrayList;
                }
                f = p.f();
            }
            y79 y79Var = f;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(xs6.o);
            if (parcelableArrayList2 == null) {
                ko5 ko5Var2 = mo5.b;
                b3 = y79.e;
            } else {
                b3 = d41.b(new o41((byte) 11), parcelableArrayList2);
            }
            y79 y79Var2 = b3;
            long j7 = bundle6.getLong(xs6.p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(xs6.i);
            uri3.getClass();
            xs6Var = new xs6(uri3, bundle6.getString(xs6.j), us6Var, os6Var, y79Var, bundle6.getString(xs6.n), y79Var2, j7);
        }
        return new bt6(string, ss6Var2, xs6Var, ws6Var3, jt6Var, ys6Var2);
    }

    public final Bundle b(int i2, boolean z) {
        xs6 xs6Var;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        ws6 ws6Var = ws6.f;
        ws6 ws6Var2 = this.c;
        if (!ws6Var2.equals(ws6Var)) {
            bundle.putBundle(i, ws6Var2.b());
        }
        jt6 jt6Var = jt6.M;
        jt6 jt6Var2 = this.d;
        if (!jt6Var2.equals(jt6Var)) {
            bundle.putBundle(j, jt6Var2.c(i2));
        }
        rs6 rs6Var = rs6.i;
        ss6 ss6Var = this.e;
        if (!ss6Var.equals(rs6Var)) {
            Bundle bundle2 = new Bundle();
            long j2 = ss6Var.a;
            if (j2 != rs6Var.a) {
                bundle2.putLong(rs6.j, j2);
            }
            long j3 = ss6Var.c;
            if (j3 != rs6Var.c) {
                bundle2.putLong(rs6.k, j3);
            }
            long j4 = ss6Var.b;
            if (j4 != rs6Var.b) {
                bundle2.putLong(rs6.o, j4);
            }
            long j5 = ss6Var.d;
            if (j5 != rs6Var.d) {
                bundle2.putLong(rs6.p, j5);
            }
            boolean z2 = ss6Var.e;
            if (z2 != rs6Var.e) {
                bundle2.putBoolean(rs6.l, z2);
            }
            boolean z3 = ss6Var.f;
            if (z3 != rs6Var.f) {
                bundle2.putBoolean(rs6.m, z3);
            }
            boolean z4 = ss6Var.g;
            if (z4 != rs6Var.g) {
                bundle2.putBoolean(rs6.n, z4);
            }
            boolean z5 = ss6Var.h;
            if (z5 != rs6Var.h) {
                bundle2.putBoolean(rs6.q, z5);
            }
            bundle.putBundle(k, bundle2);
        }
        ys6 ys6Var = ys6.d;
        ys6 ys6Var2 = this.f;
        if (!ys6Var2.equals(ys6Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = ys6Var2.a;
            if (uri != null) {
                bundle3.putParcelable(ys6.e, uri);
            }
            String str2 = ys6Var2.b;
            if (str2 != null) {
                bundle3.putString(ys6.f, str2);
            }
            Bundle bundle4 = ys6Var2.c;
            if (bundle4 != null) {
                bundle3.putBundle(ys6.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z && (xs6Var = this.b) != null) {
            mo5 mo5Var = xs6Var.g;
            List list = xs6Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(xs6.i, xs6Var.a);
            String str3 = xs6Var.b;
            if (str3 != null) {
                bundle5.putString(xs6.j, str3);
            }
            us6 us6Var = xs6Var.c;
            if (us6Var != null) {
                String str4 = xs6.k;
                mo5 mo5Var2 = us6Var.g;
                qo5 qo5Var = us6Var.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(us6.i, us6Var.a.toString());
                Uri uri2 = us6Var.b;
                if (uri2 != null) {
                    bundle6.putParcelable(us6.j, uri2);
                }
                if (!qo5Var.isEmpty()) {
                    String str5 = us6.k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : qo5Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z6 = us6Var.d;
                if (z6) {
                    bundle6.putBoolean(us6.l, z6);
                }
                boolean z7 = us6Var.e;
                if (z7) {
                    bundle6.putBoolean(us6.m, z7);
                }
                boolean z8 = us6Var.f;
                if (z8) {
                    bundle6.putBoolean(us6.n, z8);
                }
                if (!mo5Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(us6.o, new ArrayList<>(mo5Var2));
                }
                byte[] bArr = us6Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(us6.p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            os6 os6Var = xs6Var.d;
            if (os6Var != null) {
                String str6 = xs6.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(os6.b, os6Var.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(xs6.m, d41.c(list, new o41((byte) 9)));
            }
            String str7 = xs6Var.f;
            if (str7 != null) {
                bundle5.putString(xs6.n, str7);
            }
            if (!mo5Var.isEmpty()) {
                bundle5.putParcelableArrayList(xs6.o, d41.c(mo5Var, new o41((byte) 10)));
            }
            long j6 = xs6Var.h;
            if (j6 != -9223372036854775807L) {
                bundle5.putLong(xs6.p, j6);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bt6) {
                bt6 bt6Var = (bt6) obj;
                if (Objects.equals(this.a, bt6Var.a) && this.e.equals(bt6Var.e) && Objects.equals(this.b, bt6Var.b) && this.c.equals(bt6Var.c) && Objects.equals(this.d, bt6Var.d) && Objects.equals(this.f, bt6Var.f)) {
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
        xs6 xs6Var = this.b;
        if (xs6Var != null) {
            i2 = xs6Var.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i2) * 31)) * 31)) * 31)) * 31);
    }
}
