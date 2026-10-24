package o2;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import b2.p1;
import b2.w;
import e2.m0;
import e9.l0;
import e9.m2;
import e9.n0;
import e9.x1;
import e9.y0;
import g2.c0;
import i2.o1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import k2.w0;
import ki.t1;
import p2.x;
import si.z;
import v7.b8;
public final class i {
    public final c f17647a;
    public final g2.h f17648b;
    public final g2.h f17649c;
    public final w0 d;
    public final x[] e;
    public final w[] f17650f;
    public final p2.e f17651g;
    public final p1 h;
    public final List f17652i;
    public final j2.j f17654k;
    public boolean f17655l;
    public u2.b f17657n;
    public Uri f17658o;
    public Uri f17659p;
    public boolean f17660q;
    public x2.p f17661r;
    public final t1 f17653j = new t1(10);
    public byte[] f17656m = m0.f8260b;
    public long f17662s = -9223372036854775807L;

    public i(c cVar, p2.e eVar, x[] xVarArr, w[] wVarArr, l2.f fVar, c0 c0Var, w0 w0Var, List list, j2.j jVar) {
        this.f17647a = cVar;
        this.f17651g = eVar;
        this.e = xVarArr;
        this.f17650f = wVarArr;
        this.d = w0Var;
        this.f17652i = list;
        this.f17654k = jVar;
        g2.h createDataSource = ((g2.g) fVar.f15906b).createDataSource();
        this.f17648b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.f17649c = ((g2.g) fVar.f15906b).createDataSource();
        this.h = new p1("", wVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            if ((wVarArr[i10].f4123f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        p1 p1Var = this.h;
        int[] f7 = b8.f(arrayList);
        ?? cVar2 = new x2.c(p1Var, f7);
        cVar2.f17643g = cVar2.s(p1Var.d[f7[0]]);
        this.f17661r = cVar2;
    }

    public static h f(p2.n nVar, long j10, int i10) {
        long j11 = nVar.f44424k;
        n0 n0Var = nVar.f44432s;
        int i11 = (int) (j10 - j11);
        n0 n0Var2 = nVar.f44431r;
        if (i11 == n0Var2.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < n0Var.size()) {
                return new h((p2.l) n0Var.get(i10), j10, i10);
            }
            return null;
        }
        p2.k kVar = (p2.k) n0Var2.get(i11);
        if (i10 == -1) {
            return new h(kVar, j10, -1);
        }
        if (i10 < kVar.f44409x.size()) {
            return new h((p2.l) kVar.f44409x.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < n0Var2.size()) {
            return new h((p2.l) n0Var2.get(i12), j10 + 1, -1);
        }
        if (!n0Var.isEmpty()) {
            return new h((p2.l) n0Var.get(0), j10 + 1, 0);
        }
        return null;
    }

    public final z a(Uri uri) {
        x xVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        p2.e eVar = this.f17651g;
        p2.d dVar = (p2.d) eVar.d.get(uri);
        if (dVar != null) {
            xVar = dVar.f44353a;
        } else {
            xVar = null;
        }
        xVar.getClass();
        HashMap hashMap = xVar.f44495b;
        int size = hashMap.size();
        m2 it = y0.u(hashMap.values()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            p2.d dVar2 = (p2.d) eVar.d.get(uri2);
            if (dVar2 != null) {
                p2.c cVar = (p2.c) o1.j(dVar2.f44354b, uri2, uri2);
                cVar.getClass();
                if (elapsedRealtime <= cVar.f44349r) {
                    i10++;
                }
            }
        }
        return new z(size, i10, this.f17661r.length(), d(elapsedRealtime));
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
        int length = iVar.f17661r.length();
        v2.m[] mVarArr = new v2.m[length];
        boolean z11 = false;
        int i10 = 0;
        while (i10 < length) {
            int h = iVar.f17661r.h(i10);
            Uri c10 = iVar.e[h].c();
            p2.e eVar = iVar.f17651g;
            if (!eVar.g(c10)) {
                mVarArr[i10] = v2.m.B;
            } else {
                p2.n b10 = eVar.b(c10, z11);
                b10.getClass();
                long j11 = b10.h - eVar.I;
                if (h != a2) {
                    z10 = true;
                } else {
                    z10 = z11;
                }
                Pair e = iVar.e(jVar2, z10, b10, j11, j10);
                long longValue = ((Long) e.first).longValue();
                int intValue = ((Integer) e.second).intValue();
                long j12 = b10.f44424k;
                n0 n0Var = b10.f44432s;
                n0 n0Var2 = b10.f44431r;
                int i11 = (int) (longValue - j12);
                if (i11 >= 0 && n0Var2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < n0Var2.size()) {
                        if (intValue != -1) {
                            p2.k kVar = (p2.k) n0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(kVar);
                            } else if (intValue < kVar.f44409x.size()) {
                                n0 n0Var3 = kVar.f44409x;
                                arrayList.addAll(n0Var3.subList(intValue, n0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(n0Var2.subList(i11, n0Var2.size()));
                        intValue = 0;
                    }
                    if (b10.f44427n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < n0Var.size()) {
                            arrayList.addAll(n0Var.subList(intValue, n0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    l0 l0Var = n0.f8481b;
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
            p2.n b10 = this.f17651g.b(jVar.f17667x, false);
            b10.getClass();
            n0 n0Var2 = b10.f44431r;
            int i11 = (int) (jVar.f48354s - b10.f44424k);
            if (i11 >= 0) {
                if (i11 < n0Var2.size()) {
                    n0Var = ((p2.k) n0Var2.get(i11)).f44409x;
                } else {
                    n0Var = b10.f44432s;
                }
                if (i10 < n0Var.size()) {
                    p2.i iVar = (p2.i) n0Var.get(i10);
                    if (iVar.f44404x) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(e2.e.f(b10.f44453a, iVar.f44410a)), jVar.f48333b.f10810a)) {
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
        x2.p pVar = this.f17661r;
        int length = pVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int h = pVar.h(i11);
            if (!pVar.a(i11, j10)) {
                if (!this.f17651g.f(this.e[h], j10)) {
                }
            }
            i10++;
        }
        return i10;
    }

    public final android.util.Pair e(o2.j r17, boolean r18, p2.n r19, long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: o2.i.e(o2.j, boolean, p2.n, long, long):android.util.Pair");
    }

    public final e g(Uri uri, int i10, boolean z10) {
        if (uri == null) {
            return null;
        }
        t1 t1Var = this.f17653j;
        byte[] bArr = (byte[]) ((d) t1Var.f15585b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) t1Var.f15585b).put(uri, bArr);
            return null;
        }
        g2.m mVar = new g2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        w wVar = this.f17650f[i10];
        int n10 = this.f17661r.n();
        Object q6 = this.f17661r.q();
        byte[] bArr3 = this.f17656m;
        ?? fVar = new v2.f(this.f17649c, mVar, 3, wVar, n10, q6, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = m0.f8260b;
        }
        fVar.f17641s = bArr3;
        return fVar;
    }
}
