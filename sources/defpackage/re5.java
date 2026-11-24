package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class re5 {
    public final pa3 a;
    public final o63 b;
    public final o63 c;
    public final g29 d;
    public final of5[] e;
    public final fm4[] f;
    public final ta3 g;
    public final se5 h;
    public final sxb i;
    public final List j;
    public final uc8 l;
    public boolean m;
    public jh0 o;
    public Uri p;
    public Uri q;
    public boolean r;
    public k64 s;
    public final pj4 k = new pj4((byte) 2);
    public byte[] n = g8c.b;
    public long t = -9223372036854775807L;

    public re5(pa3 pa3Var, ta3 ta3Var, of5[] of5VarArr, fm4[] fm4VarArr, l69 l69Var, vyb vybVar, g29 g29Var, List list, uc8 uc8Var) {
        this.a = pa3Var;
        this.g = ta3Var;
        this.h = ta3Var.y;
        this.e = of5VarArr;
        this.f = fm4VarArr;
        this.d = g29Var;
        this.j = list;
        this.l = uc8Var;
        m63 m63Var = (m63) l69Var.b;
        o63 createDataSource = m63Var.createDataSource();
        this.b = createDataSource;
        if (vybVar != null) {
            createDataSource.addTransferListener(vybVar);
        }
        this.c = m63Var.createDataSource();
        this.i = new sxb("", fm4VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < of5VarArr.length; i++) {
            if ((fm4VarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        sxb sxbVar = this.i;
        int[] e = gle.e(arrayList);
        ?? vg0Var = new vg0(0, sxbVar, e);
        vg0Var.h = vg0Var.e(sxbVar.d[e[0]]);
        this.s = vg0Var;
    }

    public static qe5 f(df5 df5Var, long j, int i) {
        long j2 = df5Var.k;
        mm5 mm5Var = df5Var.s;
        int i2 = (int) (j - j2);
        mm5 mm5Var2 = df5Var.r;
        if (i2 == mm5Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < mm5Var.size()) {
                return new qe5((bf5) mm5Var.get(i), j, i);
            }
            return null;
        }
        af5 af5Var = (af5) mm5Var2.get(i2);
        if (i == -1) {
            return new qe5(af5Var, j, -1);
        }
        if (i < af5Var.y.size()) {
            return new qe5((bf5) af5Var.y.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < mm5Var2.size()) {
            return new qe5((bf5) mm5Var2.get(i3), j + 1, -1);
        }
        if (!mm5Var.isEmpty()) {
            return new qe5((bf5) mm5Var.get(0), j + 1, 0);
        }
        return null;
    }

    public final c86 a(Uri uri) {
        of5 of5Var;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ta3 ta3Var = this.g;
        sa3 sa3Var = (sa3) ta3Var.d.get(uri);
        if (sa3Var != null) {
            of5Var = sa3Var.a;
        } else {
            of5Var = null;
        }
        of5Var.getClass();
        HashMap hashMap = of5Var.b;
        int size = hashMap.size();
        v5c n = ym5.q(hashMap.values()).n();
        boolean z = false;
        int i = 0;
        while (n.hasNext()) {
            if (ta3Var.e(elapsedRealtime, (Uri) n.next())) {
                i++;
            }
        }
        int length = this.s.length();
        se5 se5Var = this.h;
        if (se5Var != null && se5Var.k) {
            z = true;
        }
        boolean z2 = z;
        return new c86(z2, size, i, length, d(elapsedRealtime, z2));
    }

    public final bk6[] b(te5 te5Var, long j) {
        int a;
        boolean z;
        List list;
        re5 re5Var = this;
        te5 te5Var2 = te5Var;
        if (te5Var2 == null) {
            a = -1;
        } else {
            a = re5Var.i.a(te5Var2.d);
        }
        int length = re5Var.s.length();
        bk6[] bk6VarArr = new bk6[length];
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            int k = re5Var.s.k(i);
            Uri b = re5Var.e[k].b();
            ta3 ta3Var = re5Var.g;
            if (!ta3Var.g(b)) {
                bk6VarArr[i] = bk6.z;
            } else {
                df5 b2 = ta3Var.b(b, z2);
                b2.getClass();
                long j2 = b2.h - ta3Var.M;
                if (k != a) {
                    z = true;
                } else {
                    z = z2;
                }
                Pair e = re5Var.e(te5Var2, z, b2, j2, j);
                long longValue = ((Long) e.first).longValue();
                int intValue = ((Integer) e.second).intValue();
                long j3 = b2.k;
                mm5 mm5Var = b2.s;
                mm5 mm5Var2 = b2.r;
                int i2 = (int) (longValue - j3);
                if (i2 >= 0 && mm5Var2.size() >= i2) {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < mm5Var2.size()) {
                        if (intValue != -1) {
                            af5 af5Var = (af5) mm5Var2.get(i2);
                            if (intValue == 0) {
                                arrayList.add(af5Var);
                            } else if (intValue < af5Var.y.size()) {
                                mm5 mm5Var3 = af5Var.y;
                                arrayList.addAll(mm5Var3.subList(intValue, mm5Var3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(mm5Var2.subList(i2, mm5Var2.size()));
                        intValue = 0;
                    }
                    if (b2.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < mm5Var.size()) {
                            arrayList.addAll(mm5Var.subList(intValue, mm5Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    km5 km5Var = mm5.b;
                    list = w59.e;
                }
                bk6VarArr[i] = new oe5(j2, list);
            }
            i++;
            re5Var = this;
            te5Var2 = te5Var;
            z2 = false;
        }
        return bk6VarArr;
    }

    public final int c(te5 te5Var) {
        mm5 mm5Var;
        int i = te5Var.F;
        if (i != -1) {
            df5 b = this.g.b(te5Var.y, false);
            b.getClass();
            mm5 mm5Var2 = b.r;
            int i2 = (int) (te5Var.s - b.k);
            if (i2 >= 0) {
                if (i2 < mm5Var2.size()) {
                    mm5Var = ((af5) mm5Var2.get(i2)).y;
                } else {
                    mm5Var = b.s;
                }
                if (i < mm5Var.size()) {
                    ye5 ye5Var = (ye5) mm5Var.get(i);
                    if (ye5Var.y) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(jxe.c(b.a, ye5Var.a)), te5Var.b.a)) {
                        return 1;
                    }
                    return 2;
                }
                return 2;
            }
            return 1;
        }
        return 1;
    }

    public final int d(long j, boolean z) {
        k64 k64Var = this.s;
        int length = k64Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int k = k64Var.k(i2);
            of5[] of5VarArr = this.e;
            ta3 ta3Var = this.g;
            if (z) {
                if (!k64Var.a(i2, j) && !ta3Var.e(j, of5VarArr[k].b())) {
                }
                i++;
            } else {
                if (!k64Var.a(i2, j) && !ta3Var.f(of5VarArr[k], j)) {
                }
                i++;
            }
        }
        return i;
    }

    public final android.util.Pair e(defpackage.te5 r17, boolean r18, defpackage.df5 r19, long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re5.e(te5, boolean, df5, long, long):android.util.Pair");
    }

    public final ne5 g(Uri uri, int i, boolean z) {
        np4 np4Var = (np4) this.k.b;
        if (uri == null) {
            return null;
        }
        byte[] bArr = (byte[]) np4Var.remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) np4Var.put(uri, bArr);
            return null;
        }
        u63 u63Var = new u63(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        fm4 fm4Var = this.f[i];
        int p = this.s.p();
        Object s = this.s.s();
        byte[] bArr3 = this.n;
        ?? zg2Var = new zg2(this.c, u63Var, 3, fm4Var, p, s, -9223372036854775807L, -9223372036854775807L, null);
        if (bArr3 == null) {
            bArr3 = g8c.b;
        }
        zg2Var.s = bArr3;
        return zg2Var;
    }
}
