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
public final class qg5 {
    public final bc3 a;
    public final a83 b;
    public final a83 c;
    public final et8 d;
    public final nh5[] e;
    public final go4[] f;
    public final fc3 g;
    public final rg5 h;
    public final uzb i;
    public final List j;
    public final we8 l;
    public boolean m;
    public ji0 o;
    public Uri p;
    public Uri q;
    public boolean r;
    public t74 s;
    public final k44 k = new k44((byte) 5);
    public byte[] n = hac.b;
    public long t = -9223372036854775807L;

    public qg5(bc3 bc3Var, fc3 fc3Var, nh5[] nh5VarArr, go4[] go4VarArr, k6d k6dVar, w0c w0cVar, et8 et8Var, List list, we8 we8Var) {
        this.a = bc3Var;
        this.g = fc3Var;
        this.h = fc3Var.y;
        this.e = nh5VarArr;
        this.f = go4VarArr;
        this.d = et8Var;
        this.j = list;
        this.l = we8Var;
        y73 y73Var = (y73) k6dVar.b;
        a83 createDataSource = y73Var.createDataSource();
        this.b = createDataSource;
        if (w0cVar != null) {
            createDataSource.addTransferListener(w0cVar);
        }
        this.c = y73Var.createDataSource();
        this.i = new uzb("", go4VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < nh5VarArr.length; i++) {
            if ((go4VarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        uzb uzbVar = this.i;
        int[] e = ine.e(arrayList);
        ?? vh0Var = new vh0(0, uzbVar, e);
        vh0Var.h = vh0Var.e(uzbVar.d[e[0]]);
        this.s = vh0Var;
    }

    public static pg5 f(ch5 ch5Var, long j, int i) {
        long j2 = ch5Var.k;
        mo5 mo5Var = ch5Var.s;
        int i2 = (int) (j - j2);
        mo5 mo5Var2 = ch5Var.r;
        if (i2 == mo5Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < mo5Var.size()) {
                return new pg5((ah5) mo5Var.get(i), j, i);
            }
            return null;
        }
        zg5 zg5Var = (zg5) mo5Var2.get(i2);
        if (i == -1) {
            return new pg5(zg5Var, j, -1);
        }
        if (i < zg5Var.y.size()) {
            return new pg5((ah5) zg5Var.y.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < mo5Var2.size()) {
            return new pg5((ah5) mo5Var2.get(i3), j + 1, -1);
        }
        if (!mo5Var.isEmpty()) {
            return new pg5((ah5) mo5Var.get(0), j + 1, 0);
        }
        return null;
    }

    public final ba6 a(Uri uri) {
        nh5 nh5Var;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        fc3 fc3Var = this.g;
        ec3 ec3Var = (ec3) fc3Var.d.get(uri);
        if (ec3Var != null) {
            nh5Var = ec3Var.a;
        } else {
            nh5Var = null;
        }
        nh5Var.getClass();
        HashMap hashMap = nh5Var.b;
        int size = hashMap.size();
        v7c n = yo5.q(hashMap.values()).n();
        boolean z = false;
        int i = 0;
        while (n.hasNext()) {
            if (fc3Var.e(elapsedRealtime, (Uri) n.next())) {
                i++;
            }
        }
        int length = this.s.length();
        rg5 rg5Var = this.h;
        if (rg5Var != null && rg5Var.k) {
            z = true;
        }
        boolean z2 = z;
        return new ba6(z2, size, i, length, d(elapsedRealtime, z2));
    }

    public final em6[] b(sg5 sg5Var, long j) {
        int a;
        boolean z;
        List list;
        qg5 qg5Var = this;
        sg5 sg5Var2 = sg5Var;
        if (sg5Var2 == null) {
            a = -1;
        } else {
            a = qg5Var.i.a(sg5Var2.d);
        }
        int length = qg5Var.s.length();
        em6[] em6VarArr = new em6[length];
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            int k = qg5Var.s.k(i);
            Uri b = qg5Var.e[k].b();
            fc3 fc3Var = qg5Var.g;
            if (!fc3Var.g(b)) {
                em6VarArr[i] = em6.z;
            } else {
                ch5 b2 = fc3Var.b(b, z2);
                b2.getClass();
                long j2 = b2.h - fc3Var.M;
                if (k != a) {
                    z = true;
                } else {
                    z = z2;
                }
                Pair e = qg5Var.e(sg5Var2, z, b2, j2, j);
                long longValue = ((Long) e.first).longValue();
                int intValue = ((Integer) e.second).intValue();
                long j3 = b2.k;
                mo5 mo5Var = b2.s;
                mo5 mo5Var2 = b2.r;
                int i2 = (int) (longValue - j3);
                if (i2 >= 0 && mo5Var2.size() >= i2) {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < mo5Var2.size()) {
                        if (intValue != -1) {
                            zg5 zg5Var = (zg5) mo5Var2.get(i2);
                            if (intValue == 0) {
                                arrayList.add(zg5Var);
                            } else if (intValue < zg5Var.y.size()) {
                                mo5 mo5Var3 = zg5Var.y;
                                arrayList.addAll(mo5Var3.subList(intValue, mo5Var3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(mo5Var2.subList(i2, mo5Var2.size()));
                        intValue = 0;
                    }
                    if (b2.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < mo5Var.size()) {
                            arrayList.addAll(mo5Var.subList(intValue, mo5Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    ko5 ko5Var = mo5.b;
                    list = y79.e;
                }
                em6VarArr[i] = new ng5(j2, list);
            }
            i++;
            qg5Var = this;
            sg5Var2 = sg5Var;
            z2 = false;
        }
        return em6VarArr;
    }

    public final int c(sg5 sg5Var) {
        mo5 mo5Var;
        int i = sg5Var.F;
        if (i != -1) {
            ch5 b = this.g.b(sg5Var.y, false);
            b.getClass();
            mo5 mo5Var2 = b.r;
            int i2 = (int) (sg5Var.s - b.k);
            if (i2 >= 0) {
                if (i2 < mo5Var2.size()) {
                    mo5Var = ((zg5) mo5Var2.get(i2)).y;
                } else {
                    mo5Var = b.s;
                }
                if (i < mo5Var.size()) {
                    xg5 xg5Var = (xg5) mo5Var.get(i);
                    if (xg5Var.y) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(lze.c(b.a, xg5Var.a)), sg5Var.b.a)) {
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
        t74 t74Var = this.s;
        int length = t74Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int k = t74Var.k(i2);
            nh5[] nh5VarArr = this.e;
            fc3 fc3Var = this.g;
            if (z) {
                if (!t74Var.a(i2, j) && !fc3Var.e(j, nh5VarArr[k].b())) {
                }
                i++;
            } else {
                if (!t74Var.a(i2, j) && !fc3Var.f(nh5VarArr[k], j)) {
                }
                i++;
            }
        }
        return i;
    }

    public final android.util.Pair e(defpackage.sg5 r17, boolean r18, defpackage.ch5 r19, long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg5.e(sg5, boolean, ch5, long, long):android.util.Pair");
    }

    public final mg5 g(Uri uri, int i, boolean z) {
        or4 or4Var = (or4) this.k.b;
        if (uri == null) {
            return null;
        }
        byte[] bArr = (byte[]) or4Var.remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) or4Var.put(uri, bArr);
            return null;
        }
        g83 g83Var = new g83(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        go4 go4Var = this.f[i];
        int p = this.s.p();
        Object s = this.s.s();
        byte[] bArr3 = this.n;
        ?? ni2Var = new ni2(this.c, g83Var, 3, go4Var, p, s, -9223372036854775807L, -9223372036854775807L, null);
        if (bArr3 == null) {
            bArr3 = hac.b;
        }
        ni2Var.s = bArr3;
        return ni2Var;
    }
}
