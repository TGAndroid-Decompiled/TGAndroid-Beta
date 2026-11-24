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
public final class br6 {
    public static final br6 g = new pq6().a();
    public static final String h = "0";
    public static final String i = "1";
    public static final String j = "2";
    public static final String k = "3";
    public static final String l = "4";
    public static final String m = "5";
    public final String a;
    public final xq6 b;
    public final wq6 c;
    public final jr6 d;
    public final sq6 e;
    public final yq6 f;

    public br6(String str, sq6 sq6Var, xq6 xq6Var, wq6 wq6Var, jr6 jr6Var, yq6 yq6Var) {
        this.a = str;
        this.b = xq6Var;
        this.c = wq6Var;
        this.d = jr6Var;
        this.e = sq6Var;
        this.f = yq6Var;
    }

    public static br6 a(int i2, Bundle bundle) {
        wq6 wq6Var;
        jr6 b;
        boolean z;
        boolean z2;
        boolean z3;
        sq6 sq6Var;
        yq6 yq6Var;
        Map b2;
        byte[] bArr;
        uq6 uq6Var;
        oq6 oq6Var;
        w59 f;
        w59 b3;
        xq6 xq6Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        if (bundle2 == null) {
            wq6Var = wq6.f;
        } else {
            vq6 vq6Var = new vq6();
            String str = wq6.g;
            wq6 wq6Var2 = wq6.f;
            vq6Var.a = bundle2.getLong(str, wq6Var2.a);
            vq6Var.b = bundle2.getLong(wq6.h, wq6Var2.b);
            vq6Var.c = bundle2.getLong(wq6.i, wq6Var2.c);
            vq6Var.d = bundle2.getFloat(wq6.j, wq6Var2.d);
            vq6Var.e = bundle2.getFloat(wq6.k, wq6Var2.e);
            wq6Var = new wq6(vq6Var);
        }
        wq6 wq6Var3 = wq6Var;
        Bundle bundle3 = bundle.getBundle(j);
        if (bundle3 == null) {
            b = jr6.M;
        } else {
            b = jr6.b(i2, bundle3);
        }
        jr6 jr6Var = b;
        Bundle bundle4 = bundle.getBundle(k);
        if (bundle4 == null) {
            sq6Var = sq6.r;
        } else {
            qq6 qq6Var = new qq6();
            String str2 = rq6.j;
            rq6 rq6Var = rq6.i;
            long j2 = rq6Var.a;
            long j3 = rq6Var.d;
            long j4 = rq6Var.b;
            long T = g8c.T(bundle4.getLong(str2, j2));
            boolean z4 = true;
            if (T >= 0) {
                z = true;
            } else {
                z = false;
            }
            gre.f(z);
            qq6Var.a = T;
            long T2 = g8c.T(bundle4.getLong(rq6.k, rq6Var.c));
            if (T2 != Long.MIN_VALUE && T2 < 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            gre.f(z2);
            qq6Var.b = T2;
            qq6Var.c = bundle4.getBoolean(rq6.l, rq6Var.e);
            qq6Var.d = bundle4.getBoolean(rq6.m, rq6Var.f);
            qq6Var.e = bundle4.getBoolean(rq6.n, rq6Var.g);
            qq6Var.f = bundle4.getBoolean(rq6.q, rq6Var.h);
            long j5 = bundle4.getLong(rq6.o, j4);
            if (j5 != j4) {
                if (j5 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                gre.f(z3);
                qq6Var.a = j5;
            }
            long j6 = bundle4.getLong(rq6.p, j3);
            if (j6 != j3) {
                if (j6 != Long.MIN_VALUE && j6 < 0) {
                    z4 = false;
                }
                gre.f(z4);
                qq6Var.b = j6;
            }
            sq6Var = new rq6(qq6Var);
        }
        sq6 sq6Var2 = sq6Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            yq6Var = yq6.d;
        } else {
            xl3 xl3Var = new xl3((byte) 16, false);
            xl3Var.b = (Uri) bundle5.getParcelable(yq6.e);
            xl3Var.c = bundle5.getString(yq6.f);
            xl3Var.d = g8c.o(bundle5.getBundle(yq6.g));
            yq6Var = new yq6(xl3Var);
        }
        yq6 yq6Var2 = yq6Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            xq6Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(xq6.k);
            if (bundle7 == null) {
                uq6Var = null;
            } else {
                String string2 = bundle7.getString(uq6.i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(uq6.j);
                String str3 = uq6.k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    b2 = b69.h;
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
                    b2 = qm5.b(hashMap);
                }
                boolean z5 = bundle7.getBoolean(uq6.l, false);
                boolean z6 = bundle7.getBoolean(uq6.m, false);
                boolean z7 = bundle7.getBoolean(uq6.n, false);
                String str5 = uq6.o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                mm5 q = mm5.q(arrayList);
                byte[] byteArray = bundle7.getByteArray(uq6.p);
                tq6 tq6Var = new tq6();
                tq6Var.a = fromString;
                tq6Var.b = uri;
                tq6Var.c = qm5.b(b2);
                tq6Var.d = z5;
                tq6Var.f = z7;
                tq6Var.e = z6;
                tq6Var.g = mm5.q(q);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                tq6Var.h = bArr;
                uq6Var = new uq6(tq6Var);
            }
            Bundle bundle10 = bundle6.getBundle(xq6.l);
            if (bundle10 == null) {
                oq6Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(oq6.b);
                uri2.getClass();
                z24 z24Var = new z24((byte) 17, false);
                z24Var.b = uri2;
                oq6Var = new oq6(z24Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(xq6.m);
            if (parcelableArrayList == null) {
                km5 km5Var = mm5.b;
                f = w59.e;
            } else {
                jm5 p = mm5.p();
                int i3 = 0;
                while (i3 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i3);
                    bundle11.getClass();
                    p.c(new t8b(bundle11.getInt(t8b.d, 0), bundle11.getInt(t8b.e, 0), bundle11.getInt(t8b.f, 0)));
                    i3++;
                    parcelableArrayList = parcelableArrayList;
                }
                f = p.f();
            }
            w59 w59Var = f;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(xq6.o);
            if (parcelableArrayList2 == null) {
                km5 km5Var2 = mm5.b;
                b3 = w59.e;
            } else {
                b3 = v21.b(new g31((byte) 11), parcelableArrayList2);
            }
            w59 w59Var2 = b3;
            long j7 = bundle6.getLong(xq6.p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(xq6.i);
            uri3.getClass();
            xq6Var = new xq6(uri3, bundle6.getString(xq6.j), uq6Var, oq6Var, w59Var, bundle6.getString(xq6.n), w59Var2, j7);
        }
        return new br6(string, sq6Var2, xq6Var, wq6Var3, jr6Var, yq6Var2);
    }

    public final Bundle b(int i2, boolean z) {
        xq6 xq6Var;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        wq6 wq6Var = wq6.f;
        wq6 wq6Var2 = this.c;
        if (!wq6Var2.equals(wq6Var)) {
            bundle.putBundle(i, wq6Var2.b());
        }
        jr6 jr6Var = jr6.M;
        jr6 jr6Var2 = this.d;
        if (!jr6Var2.equals(jr6Var)) {
            bundle.putBundle(j, jr6Var2.c(i2));
        }
        rq6 rq6Var = rq6.i;
        sq6 sq6Var = this.e;
        if (!sq6Var.equals(rq6Var)) {
            Bundle bundle2 = new Bundle();
            long j2 = sq6Var.a;
            if (j2 != rq6Var.a) {
                bundle2.putLong(rq6.j, j2);
            }
            long j3 = sq6Var.c;
            if (j3 != rq6Var.c) {
                bundle2.putLong(rq6.k, j3);
            }
            long j4 = sq6Var.b;
            if (j4 != rq6Var.b) {
                bundle2.putLong(rq6.o, j4);
            }
            long j5 = sq6Var.d;
            if (j5 != rq6Var.d) {
                bundle2.putLong(rq6.p, j5);
            }
            boolean z2 = sq6Var.e;
            if (z2 != rq6Var.e) {
                bundle2.putBoolean(rq6.l, z2);
            }
            boolean z3 = sq6Var.f;
            if (z3 != rq6Var.f) {
                bundle2.putBoolean(rq6.m, z3);
            }
            boolean z4 = sq6Var.g;
            if (z4 != rq6Var.g) {
                bundle2.putBoolean(rq6.n, z4);
            }
            boolean z5 = sq6Var.h;
            if (z5 != rq6Var.h) {
                bundle2.putBoolean(rq6.q, z5);
            }
            bundle.putBundle(k, bundle2);
        }
        yq6 yq6Var = yq6.d;
        yq6 yq6Var2 = this.f;
        if (!yq6Var2.equals(yq6Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = yq6Var2.a;
            if (uri != null) {
                bundle3.putParcelable(yq6.e, uri);
            }
            String str2 = yq6Var2.b;
            if (str2 != null) {
                bundle3.putString(yq6.f, str2);
            }
            Bundle bundle4 = yq6Var2.c;
            if (bundle4 != null) {
                bundle3.putBundle(yq6.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z && (xq6Var = this.b) != null) {
            mm5 mm5Var = xq6Var.g;
            List list = xq6Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(xq6.i, xq6Var.a);
            String str3 = xq6Var.b;
            if (str3 != null) {
                bundle5.putString(xq6.j, str3);
            }
            uq6 uq6Var = xq6Var.c;
            if (uq6Var != null) {
                String str4 = xq6.k;
                mm5 mm5Var2 = uq6Var.g;
                qm5 qm5Var = uq6Var.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(uq6.i, uq6Var.a.toString());
                Uri uri2 = uq6Var.b;
                if (uri2 != null) {
                    bundle6.putParcelable(uq6.j, uri2);
                }
                if (!qm5Var.isEmpty()) {
                    String str5 = uq6.k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : qm5Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z6 = uq6Var.d;
                if (z6) {
                    bundle6.putBoolean(uq6.l, z6);
                }
                boolean z7 = uq6Var.e;
                if (z7) {
                    bundle6.putBoolean(uq6.m, z7);
                }
                boolean z8 = uq6Var.f;
                if (z8) {
                    bundle6.putBoolean(uq6.n, z8);
                }
                if (!mm5Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(uq6.o, new ArrayList<>(mm5Var2));
                }
                byte[] bArr = uq6Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(uq6.p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            oq6 oq6Var = xq6Var.d;
            if (oq6Var != null) {
                String str6 = xq6.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(oq6.b, oq6Var.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(xq6.m, v21.c(list, new g31((byte) 9)));
            }
            String str7 = xq6Var.f;
            if (str7 != null) {
                bundle5.putString(xq6.n, str7);
            }
            if (!mm5Var.isEmpty()) {
                bundle5.putParcelableArrayList(xq6.o, v21.c(mm5Var, new g31((byte) 10)));
            }
            long j6 = xq6Var.h;
            if (j6 != -9223372036854775807L) {
                bundle5.putLong(xq6.p, j6);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof br6) {
                br6 br6Var = (br6) obj;
                if (Objects.equals(this.a, br6Var.a) && this.e.equals(br6Var.e) && Objects.equals(this.b, br6Var.b) && this.c.equals(br6Var.c) && Objects.equals(this.d, br6Var.d) && Objects.equals(this.f, br6Var.f)) {
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
        xq6 xq6Var = this.b;
        if (xq6Var != null) {
            i2 = xq6Var.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i2) * 31)) * 31)) * 31)) * 31);
    }
}
