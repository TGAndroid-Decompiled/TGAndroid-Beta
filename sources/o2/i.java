package o2;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import b2.p1;
import b2.x;
import e2.l0;
import e9.m2;
import e9.n0;
import e9.x1;
import e9.y0;
import g2.d0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import li.c0;
import n2.u;
import p2.w;
import v7.c8;
public final class i {
    public final c f13985a;
    public final g2.h f13986b;
    public final g2.h f13987c;
    public final m2.t d;
    public final w[] e;
    public final x[] f13988f;
    public final p2.d f13989g;
    public final p1 h;
    public final List f13990i;
    public final j2.l f13992k;
    public boolean f13993l;
    public u2.b f13995n;
    public Uri f13996o;
    public Uri f13997p;
    public boolean f13998q;
    public x2.q f13999r;
    public final u f13991j = new u(2);
    public byte[] f13994m = l0.f6166b;
    public long f14000s = -9223372036854775807L;

    public i(c cVar, p2.d dVar, w[] wVarArr, x[] xVarArr, l2.f fVar, d0 d0Var, m2.t tVar, List list, j2.l lVar) {
        this.f13985a = cVar;
        this.f13989g = dVar;
        this.e = wVarArr;
        this.f13988f = xVarArr;
        this.d = tVar;
        this.f13990i = list;
        this.f13992k = lVar;
        g2.h createDataSource = ((g2.g) fVar.f11588b).createDataSource();
        this.f13986b = createDataSource;
        if (d0Var != null) {
            createDataSource.addTransferListener(d0Var);
        }
        this.f13987c = ((g2.g) fVar.f11588b).createDataSource();
        this.h = new p1("", xVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            if ((xVarArr[i10].f2411f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        p1 p1Var = this.h;
        int[] f7 = c8.f(arrayList);
        ?? cVar2 = new x2.c(p1Var, f7);
        cVar2.f13981g = cVar2.s(p1Var.d[f7[0]]);
        this.f13999r = cVar2;
    }

    public static h f(p2.m mVar, long j10, int i10) {
        long j11 = mVar.f44627k;
        n0 n0Var = mVar.f44635s;
        int i11 = (int) (j10 - j11);
        n0 n0Var2 = mVar.f44634r;
        if (i11 == n0Var2.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < n0Var.size()) {
                return new h((p2.k) n0Var.get(i10), j10, i10);
            }
            return null;
        }
        p2.j jVar = (p2.j) n0Var2.get(i11);
        if (i10 == -1) {
            return new h(jVar, j10, -1);
        }
        if (i10 < jVar.f44611y.size()) {
            return new h((p2.k) jVar.f44611y.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < n0Var2.size()) {
            return new h((p2.k) n0Var2.get(i12), j10 + 1, -1);
        }
        if (!n0Var.isEmpty()) {
            return new h((p2.k) n0Var.get(0), j10 + 1, 0);
        }
        return null;
    }

    public final c0 a(Uri uri) {
        w wVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        p2.d dVar = this.f13989g;
        p2.c cVar = (p2.c) dVar.d.get(uri);
        if (cVar != null) {
            wVar = cVar.f44555a;
        } else {
            wVar = null;
        }
        wVar.getClass();
        HashMap hashMap = wVar.f44698b;
        int size = hashMap.size();
        m2 it = y0.u(hashMap.values()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            p2.c cVar2 = (p2.c) dVar.d.get(uri2);
            if (cVar2 != null) {
                p2.b bVar = (p2.b) i0.a.h(cVar2.f44556b, uri2, uri2);
                bVar.getClass();
                if (elapsedRealtime <= bVar.f44550r) {
                    i10++;
                }
            }
        }
        return new c0(size, i10, this.f13999r.length(), d(elapsedRealtime));
    }

    public final v2.m[] b(j jVar, long j10) {
        int a2;
        boolean z10;
        List list;
        i iVar = this;
        j jVar2 = jVar;
        if (jVar2 == null) {
            a2 = -1;
        } else {
            a2 = iVar.h.a(jVar2.d);
        }
        int length = iVar.f13999r.length();
        v2.m[] mVarArr = new v2.m[length];
        boolean z11 = false;
        int i10 = 0;
        while (i10 < length) {
            int h = iVar.f13999r.h(i10);
            Uri c10 = iVar.e[h].c();
            p2.d dVar = iVar.f13989g;
            if (!dVar.f(c10)) {
                mVarArr[i10] = v2.m.v;
            } else {
                p2.m b10 = dVar.b(c10, z11);
                b10.getClass();
                long j11 = b10.h - dVar.I;
                if (h != a2) {
                    z10 = true;
                } else {
                    z10 = z11;
                }
                Pair e = iVar.e(jVar2, z10, b10, j11, j10);
                long longValue = ((Long) e.first).longValue();
                int intValue = ((Integer) e.second).intValue();
                long j12 = b10.f44627k;
                n0 n0Var = b10.f44635s;
                n0 n0Var2 = b10.f44634r;
                int i11 = (int) (longValue - j12);
                if (i11 >= 0 && n0Var2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < n0Var2.size()) {
                        if (intValue != -1) {
                            p2.j jVar3 = (p2.j) n0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(jVar3);
                            } else if (intValue < jVar3.f44611y.size()) {
                                n0 n0Var3 = jVar3.f44611y;
                                arrayList.addAll(n0Var3.subList(intValue, n0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(n0Var2.subList(i11, n0Var2.size()));
                        intValue = 0;
                    }
                    if (b10.f44630n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < n0Var.size()) {
                            arrayList.addAll(n0Var.subList(intValue, n0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    e9.l0 l0Var = n0.f6390b;
                    list = x1.e;
                }
                mVarArr[i10] = new f(j11, list);
            }
            i10++;
            iVar = this;
            jVar2 = jVar;
            z11 = false;
        }
        return mVarArr;
    }

    public final int c(j jVar) {
        n0 n0Var;
        int i10 = jVar.E;
        if (i10 != -1) {
            p2.m b10 = this.f13989g.b(jVar.f14006y, false);
            b10.getClass();
            n0 n0Var2 = b10.f44634r;
            int i11 = (int) (jVar.f50342s - b10.f44627k);
            if (i11 >= 0) {
                if (i11 < n0Var2.size()) {
                    n0Var = ((p2.j) n0Var2.get(i11)).f44611y;
                } else {
                    n0Var = b10.f44635s;
                }
                if (i10 < n0Var.size()) {
                    p2.h hVar = (p2.h) n0Var.get(i10);
                    if (hVar.f44606y) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(e2.e.f(b10.f44656a, hVar.f44612a)), jVar.f50320b.f7315a)) {
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

    public final int d(long j10) {
        x2.q qVar = this.f13999r;
        int length = qVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int h = qVar.h(i11);
            if (!qVar.a(i11, j10)) {
                if (!this.f13989g.e(this.e[h], j10)) {
                }
            }
            i10++;
        }
        return i10;
    }

    public final android.util.Pair e(o2.j r17, boolean r18, p2.m r19, long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: o2.i.e(o2.j, boolean, p2.m, long, long):android.util.Pair");
    }

    public final e g(Uri uri, int i10, boolean z10) {
        if (uri == null) {
            return null;
        }
        u uVar = this.f13991j;
        byte[] bArr = (byte[]) ((d) uVar.f13481b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) uVar.f13481b).put(uri, bArr);
            return null;
        }
        g2.n nVar = new g2.n(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        x xVar = this.f13988f[i10];
        int n10 = this.f13999r.n();
        Object q6 = this.f13999r.q();
        byte[] bArr3 = this.f13994m;
        ?? fVar = new v2.f(this.f13987c, nVar, 3, xVar, n10, q6, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = l0.f6166b;
        }
        fVar.f13978s = bArr3;
        return fVar;
    }
}
