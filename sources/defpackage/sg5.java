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
public final class sg5 {
    public final ib3 a;
    public final h73 b;
    public final h73 c;
    public final pq8 d;
    public final qh5[] e;
    public final ko4[] f;
    public final mb3 g;
    public final ug5 h;
    public final t1c i;
    public final List j;
    public final ig8 l;
    public boolean m;
    public kh0 o;
    public Uri p;
    public Uri q;
    public boolean r;
    public e74 s;
    public final v34 k = new v34((byte) 4);
    public byte[] n = gcc.b;
    public long t = -9223372036854775807L;

    public sg5(ib3 ib3Var, mb3 mb3Var, qh5[] qh5VarArr, ko4[] ko4VarArr, z8d z8dVar, v2c v2cVar, pq8 pq8Var, List list, ig8 ig8Var) {
        this.a = ib3Var;
        this.g = mb3Var;
        this.h = mb3Var.y;
        this.e = qh5VarArr;
        this.f = ko4VarArr;
        this.d = pq8Var;
        this.j = list;
        this.l = ig8Var;
        f73 f73Var = (f73) z8dVar.b;
        h73 createDataSource = f73Var.createDataSource();
        this.b = createDataSource;
        if (v2cVar != null) {
            createDataSource.addTransferListener(v2cVar);
        }
        this.c = f73Var.createDataSource();
        this.i = new t1c("", ko4VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < qh5VarArr.length; i++) {
            if ((ko4VarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        t1c t1cVar = this.i;
        int[] e = ype.e(arrayList);
        ?? wg0Var = new wg0(0, t1cVar, e);
        wg0Var.h = wg0Var.e(t1cVar.d[e[0]]);
        this.s = wg0Var;
    }

    public static rg5 f(fh5 fh5Var, long j, int i) {
        long j2 = fh5Var.k;
        po5 po5Var = fh5Var.s;
        int i2 = (int) (j - j2);
        po5 po5Var2 = fh5Var.r;
        if (i2 == po5Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < po5Var.size()) {
                return new rg5((dh5) po5Var.get(i), j, i);
            }
            return null;
        }
        ch5 ch5Var = (ch5) po5Var2.get(i2);
        if (i == -1) {
            return new rg5(ch5Var, j, -1);
        }
        if (i < ch5Var.y.size()) {
            return new rg5((dh5) ch5Var.y.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < po5Var2.size()) {
            return new rg5((dh5) po5Var2.get(i3), j + 1, -1);
        }
        if (!po5Var.isEmpty()) {
            return new rg5((dh5) po5Var.get(0), j + 1, 0);
        }
        return null;
    }

    public final ga6 a(Uri uri) {
        qh5 qh5Var;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        mb3 mb3Var = this.g;
        lb3 lb3Var = (lb3) mb3Var.d.get(uri);
        if (lb3Var != null) {
            qh5Var = lb3Var.a;
        } else {
            qh5Var = null;
        }
        qh5Var.getClass();
        HashMap hashMap = qh5Var.b;
        int size = hashMap.size();
        v9c n = bp5.q(hashMap.values()).n();
        boolean z = false;
        int i = 0;
        while (n.hasNext()) {
            if (mb3Var.e(elapsedRealtime, (Uri) n.next())) {
                i++;
            }
        }
        int length = this.s.length();
        ug5 ug5Var = this.h;
        if (ug5Var != null && ug5Var.k) {
            z = true;
        }
        boolean z2 = z;
        return new ga6(z2, size, i, length, d(elapsedRealtime, z2));
    }

    public final gm6[] b(vg5 vg5Var, long j) {
        int a;
        boolean z;
        List list;
        sg5 sg5Var = this;
        vg5 vg5Var2 = vg5Var;
        if (vg5Var2 == null) {
            a = -1;
        } else {
            a = sg5Var.i.a(vg5Var2.d);
        }
        int length = sg5Var.s.length();
        gm6[] gm6VarArr = new gm6[length];
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            int j2 = sg5Var.s.j(i);
            Uri b = sg5Var.e[j2].b();
            mb3 mb3Var = sg5Var.g;
            if (!mb3Var.h(b)) {
                gm6VarArr[i] = gm6.z;
            } else {
                fh5 b2 = mb3Var.b(b, z2);
                b2.getClass();
                long j3 = b2.h - mb3Var.M;
                if (j2 != a) {
                    z = true;
                } else {
                    z = z2;
                }
                Pair e = sg5Var.e(vg5Var2, z, b2, j3, j);
                long longValue = ((Long) e.first).longValue();
                int intValue = ((Integer) e.second).intValue();
                long j4 = b2.k;
                po5 po5Var = b2.s;
                po5 po5Var2 = b2.r;
                int i2 = (int) (longValue - j4);
                if (i2 >= 0 && po5Var2.size() >= i2) {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < po5Var2.size()) {
                        if (intValue != -1) {
                            ch5 ch5Var = (ch5) po5Var2.get(i2);
                            if (intValue == 0) {
                                arrayList.add(ch5Var);
                            } else if (intValue < ch5Var.y.size()) {
                                po5 po5Var3 = ch5Var.y;
                                arrayList.addAll(po5Var3.subList(intValue, po5Var3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(po5Var2.subList(i2, po5Var2.size()));
                        intValue = 0;
                    }
                    if (b2.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < po5Var.size()) {
                            arrayList.addAll(po5Var.subList(intValue, po5Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    no5 no5Var = po5.b;
                    list = j99.e;
                }
                gm6VarArr[i] = new pg5(j3, list);
            }
            i++;
            sg5Var = this;
            vg5Var2 = vg5Var;
            z2 = false;
        }
        return gm6VarArr;
    }

    public final int c(vg5 vg5Var) {
        po5 po5Var;
        int i = vg5Var.F;
        if (i != -1) {
            fh5 b = this.g.b(vg5Var.y, false);
            b.getClass();
            po5 po5Var2 = b.r;
            int i2 = (int) (vg5Var.s - b.k);
            if (i2 >= 0) {
                if (i2 < po5Var2.size()) {
                    po5Var = ((ch5) po5Var2.get(i2)).y;
                } else {
                    po5Var = b.s;
                }
                if (i < po5Var.size()) {
                    ah5 ah5Var = (ah5) po5Var.get(i);
                    if (ah5Var.y) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(d2f.c(b.a, ah5Var.a)), vg5Var.b.a)) {
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
        e74 e74Var = this.s;
        int length = e74Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int j2 = e74Var.j(i2);
            qh5[] qh5VarArr = this.e;
            mb3 mb3Var = this.g;
            if (z) {
                if (!e74Var.a(i2, j) && !mb3Var.e(j, qh5VarArr[j2].b())) {
                }
                i++;
            } else {
                if (!e74Var.a(i2, j) && !mb3Var.g(qh5VarArr[j2], j)) {
                }
                i++;
            }
        }
        return i;
    }

    public final android.util.Pair e(defpackage.vg5 r17, boolean r18, defpackage.fh5 r19, long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg5.e(vg5, boolean, fh5, long, long):android.util.Pair");
    }

    public final og5 g(Uri uri, int i, boolean z) {
        rr4 rr4Var = (rr4) this.k.b;
        if (uri == null) {
            return null;
        }
        byte[] bArr = (byte[]) rr4Var.remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) rr4Var.put(uri, bArr);
            return null;
        }
        n73 n73Var = new n73(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        ko4 ko4Var = this.f[i];
        int o = this.s.o();
        Object r = this.s.r();
        byte[] bArr3 = this.n;
        ?? rh2Var = new rh2(this.c, n73Var, 3, ko4Var, o, r, -9223372036854775807L, -9223372036854775807L, null);
        if (bArr3 == null) {
            bArr3 = gcc.b;
        }
        rh2Var.s = bArr3;
        return rh2Var;
    }
}
