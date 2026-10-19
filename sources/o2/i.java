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
    public final c f17586a;
    public final g2.h f17587b;
    public final g2.h f17588c;
    public final w0 d;
    public final x[] e;
    public final w[] f17589f;
    public final p2.e f17590g;
    public final p1 h;
    public final List f17591i;
    public final j2.k f17593k;
    public boolean f17594l;
    public u2.b f17596n;
    public Uri f17597o;
    public Uri f17598p;
    public boolean f17599q;
    public x2.p f17600r;
    public final t1 f17592j = new t1(10);
    public byte[] f17595m = m0.f8255b;
    public long f17601s = -9223372036854775807L;

    public i(c cVar, p2.e eVar, x[] xVarArr, w[] wVarArr, l2.f fVar, c0 c0Var, w0 w0Var, List list, j2.k kVar) {
        this.f17586a = cVar;
        this.f17590g = eVar;
        this.e = xVarArr;
        this.f17589f = wVarArr;
        this.d = w0Var;
        this.f17591i = list;
        this.f17593k = kVar;
        g2.h createDataSource = ((g2.g) fVar.f15845b).createDataSource();
        this.f17587b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.f17588c = ((g2.g) fVar.f15845b).createDataSource();
        this.h = new p1("", wVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            if ((wVarArr[i10].f4118f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        p1 p1Var = this.h;
        int[] f7 = b8.f(arrayList);
        ?? cVar2 = new x2.c(p1Var, f7);
        cVar2.f17582g = cVar2.s(p1Var.d[f7[0]]);
        this.f17600r = cVar2;
    }

    public static h f(p2.n nVar, long j10, int i10) {
        long j11 = nVar.f43996k;
        n0 n0Var = nVar.f44004s;
        int i11 = (int) (j10 - j11);
        n0 n0Var2 = nVar.f44003r;
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
        if (i10 < kVar.f43981x.size()) {
            return new h((p2.l) kVar.f43981x.get(i10), j10, i10);
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
        p2.e eVar = this.f17590g;
        p2.d dVar = (p2.d) eVar.d.get(uri);
        if (dVar != null) {
            xVar = dVar.f43925a;
        } else {
            xVar = null;
        }
        xVar.getClass();
        HashMap hashMap = xVar.f44067b;
        int size = hashMap.size();
        m2 it = y0.u(hashMap.values()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            p2.d dVar2 = (p2.d) eVar.d.get(uri2);
            if (dVar2 != null) {
                p2.c cVar = (p2.c) i2.e.i(dVar2.f43926b, uri2, uri2);
                cVar.getClass();
                if (elapsedRealtime <= cVar.f43921r) {
                    i10++;
                }
            }
        }
        return new z(size, i10, this.f17600r.length(), d(elapsedRealtime));
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
        int length = iVar.f17600r.length();
        v2.m[] mVarArr = new v2.m[length];
        boolean z11 = false;
        int i10 = 0;
        while (i10 < length) {
            int h = iVar.f17600r.h(i10);
            Uri c10 = iVar.e[h].c();
            p2.e eVar = iVar.f17590g;
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
                long j12 = b10.f43996k;
                n0 n0Var = b10.f44004s;
                n0 n0Var2 = b10.f44003r;
                int i11 = (int) (longValue - j12);
                if (i11 >= 0 && n0Var2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < n0Var2.size()) {
                        if (intValue != -1) {
                            p2.k kVar = (p2.k) n0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(kVar);
                            } else if (intValue < kVar.f43981x.size()) {
                                n0 n0Var3 = kVar.f43981x;
                                arrayList.addAll(n0Var3.subList(intValue, n0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(n0Var2.subList(i11, n0Var2.size()));
                        intValue = 0;
                    }
                    if (b10.f43999n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < n0Var.size()) {
                            arrayList.addAll(n0Var.subList(intValue, n0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    l0 l0Var = n0.f8476b;
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
            p2.n b10 = this.f17590g.b(jVar.f17606x, false);
            b10.getClass();
            n0 n0Var2 = b10.f44003r;
            int i11 = (int) (jVar.f47906s - b10.f43996k);
            if (i11 >= 0) {
                if (i11 < n0Var2.size()) {
                    n0Var = ((p2.k) n0Var2.get(i11)).f43981x;
                } else {
                    n0Var = b10.f44004s;
                }
                if (i10 < n0Var.size()) {
                    p2.i iVar = (p2.i) n0Var.get(i10);
                    if (iVar.f43976x) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(e2.e.f(b10.f44025a, iVar.f43982a)), jVar.f47885b.f10793a)) {
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
        x2.p pVar = this.f17600r;
        int length = pVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int h = pVar.h(i11);
            if (!pVar.a(i11, j10)) {
                if (!this.f17590g.f(this.e[h], j10)) {
                }
            }
            i10++;
        }
        return i10;
    }

    public final android.util.Pair e(o2.j r17, boolean r18, p2.n r19, long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: o2.i.e(o2.j, boolean, p2.n, long, long):android.util.Pair");
    }

    public final e g(int i10, Uri uri, boolean z10) {
        if (uri == null) {
            return null;
        }
        t1 t1Var = this.f17592j;
        byte[] bArr = (byte[]) ((d) t1Var.f15527b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) t1Var.f15527b).put(uri, bArr);
            return null;
        }
        g2.m mVar = new g2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        w wVar = this.f17589f[i10];
        int n10 = this.f17600r.n();
        Object q6 = this.f17600r.q();
        byte[] bArr3 = this.f17595m;
        ?? fVar = new v2.f(this.f17588c, mVar, 3, wVar, n10, q6, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = m0.f8255b;
        }
        fVar.f17580s = bArr3;
        return fVar;
    }
}
