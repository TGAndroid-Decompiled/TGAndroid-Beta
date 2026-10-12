package o2;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import b2.q1;
import b2.x;
import e2.m0;
import e9.l0;
import e9.m2;
import e9.n0;
import e9.x1;
import e9.y0;
import g2.c0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ji.d4;
import ji.w4;
import li.a0;
import p2.w;
import v7.b8;
public final class i {
    public final c f16493a;
    public final g2.h f16494b;
    public final g2.h f16495c;
    public final d4 d;
    public final w[] e;
    public final x[] f16496f;
    public final p2.d f16497g;
    public final q1 h;
    public final List f16498i;
    public final j2.k f16500k;
    public boolean f16501l;
    public u2.b f16503n;
    public Uri f16504o;
    public Uri f16505p;
    public boolean f16506q;
    public x2.p f16507r;
    public final w4 f16499j = new w4(10);
    public byte[] f16502m = m0.f8373b;
    public long f16508s = -9223372036854775807L;

    public i(c cVar, p2.d dVar, w[] wVarArr, x[] xVarArr, l2.f fVar, c0 c0Var, d4 d4Var, List list, j2.k kVar) {
        this.f16493a = cVar;
        this.f16497g = dVar;
        this.e = wVarArr;
        this.f16496f = xVarArr;
        this.d = d4Var;
        this.f16498i = list;
        this.f16500k = kVar;
        g2.h createDataSource = ((g2.g) fVar.f14503b).createDataSource();
        this.f16494b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.f16495c = ((g2.g) fVar.f14503b).createDataSource();
        this.h = new q1("", xVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            if ((xVarArr[i10].f2507f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        q1 q1Var = this.h;
        int[] f7 = b8.f(arrayList);
        ?? cVar2 = new x2.c(q1Var, f7);
        cVar2.f16489g = cVar2.s(q1Var.d[f7[0]]);
        this.f16507r = cVar2;
    }

    public static h f(p2.m mVar, long j10, int i10) {
        long j11 = mVar.f42914k;
        n0 n0Var = mVar.f42922s;
        int i11 = (int) (j10 - j11);
        n0 n0Var2 = mVar.f42921r;
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
        if (i10 < jVar.f42899x.size()) {
            return new h((p2.k) jVar.f42899x.get(i10), j10, i10);
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

    public final a0 a(Uri uri) {
        w wVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        p2.d dVar = this.f16497g;
        p2.c cVar = (p2.c) dVar.d.get(uri);
        if (cVar != null) {
            wVar = cVar.f42843a;
        } else {
            wVar = null;
        }
        wVar.getClass();
        HashMap hashMap = wVar.f42985b;
        int size = hashMap.size();
        m2 it = y0.u(hashMap.values()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            p2.c cVar2 = (p2.c) dVar.d.get(uri2);
            if (cVar2 != null) {
                p2.b bVar = (p2.b) i2.d.h(cVar2.f42844b, uri2, uri2);
                bVar.getClass();
                if (elapsedRealtime <= bVar.f42839r) {
                    i10++;
                }
            }
        }
        return new a0(size, i10, this.f16507r.length(), d(elapsedRealtime));
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
        int length = iVar.f16507r.length();
        v2.m[] mVarArr = new v2.m[length];
        boolean z11 = false;
        int i10 = 0;
        while (i10 < length) {
            int h = iVar.f16507r.h(i10);
            Uri c10 = iVar.e[h].c();
            p2.d dVar = iVar.f16497g;
            if (!dVar.f(c10)) {
                mVarArr[i10] = v2.m.B;
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
                long j12 = b10.f42914k;
                n0 n0Var = b10.f42922s;
                n0 n0Var2 = b10.f42921r;
                int i11 = (int) (longValue - j12);
                if (i11 >= 0 && n0Var2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < n0Var2.size()) {
                        if (intValue != -1) {
                            p2.j jVar3 = (p2.j) n0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(jVar3);
                            } else if (intValue < jVar3.f42899x.size()) {
                                n0 n0Var3 = jVar3.f42899x;
                                arrayList.addAll(n0Var3.subList(intValue, n0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(n0Var2.subList(i11, n0Var2.size()));
                        intValue = 0;
                    }
                    if (b10.f42917n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < n0Var.size()) {
                            arrayList.addAll(n0Var.subList(intValue, n0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    l0 l0Var = n0.f8592b;
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
            p2.m b10 = this.f16497g.b(jVar.f16513x, false);
            b10.getClass();
            n0 n0Var2 = b10.f42921r;
            int i11 = (int) (jVar.f46520s - b10.f42914k);
            if (i11 >= 0) {
                if (i11 < n0Var2.size()) {
                    n0Var = ((p2.j) n0Var2.get(i11)).f42899x;
                } else {
                    n0Var = b10.f42922s;
                }
                if (i10 < n0Var.size()) {
                    p2.h hVar = (p2.h) n0Var.get(i10);
                    if (hVar.f42894x) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(e2.e.f(b10.f42943a, hVar.f42900a)), jVar.f46499b.f9883a)) {
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
        x2.p pVar = this.f16507r;
        int length = pVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int h = pVar.h(i11);
            if (!pVar.a(i11, j10)) {
                if (!this.f16497g.e(this.e[h], j10)) {
                }
            }
            i10++;
        }
        return i10;
    }

    public final android.util.Pair e(o2.j r17, boolean r18, p2.m r19, long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: o2.i.e(o2.j, boolean, p2.m, long, long):android.util.Pair");
    }

    public final e g(int i10, Uri uri, boolean z10) {
        if (uri == null) {
            return null;
        }
        w4 w4Var = this.f16499j;
        byte[] bArr = (byte[]) ((d) w4Var.f13592b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) w4Var.f13592b).put(uri, bArr);
            return null;
        }
        g2.m mVar = new g2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        x xVar = this.f16496f[i10];
        int n10 = this.f16507r.n();
        Object q6 = this.f16507r.q();
        byte[] bArr3 = this.f16502m;
        ?? fVar = new v2.f(this.f16495c, mVar, 3, xVar, n10, q6, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = m0.f8373b;
        }
        fVar.f16487s = bArr3;
        return fVar;
    }
}
