package o2;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import b2.p1;
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
import ki.t1;
import p2.w;
import si.z;
import v7.b8;
public final class i {
    public final c f17583a;
    public final g2.h f17584b;
    public final g2.h f17585c;
    public final k0.b d;
    public final w[] e;
    public final b2.w[] f17586f;
    public final p2.d f17587g;
    public final p1 h;
    public final List f17588i;
    public final j2.k f17590k;
    public boolean f17591l;
    public u2.b f17593n;
    public Uri f17594o;
    public Uri f17595p;
    public boolean f17596q;
    public x2.p f17597r;
    public final t1 f17589j = new t1(10);
    public byte[] f17592m = m0.f8254b;
    public long f17598s = -9223372036854775807L;

    public i(c cVar, p2.d dVar, w[] wVarArr, b2.w[] wVarArr2, l2.f fVar, c0 c0Var, k0.b bVar, List list, j2.k kVar) {
        this.f17583a = cVar;
        this.f17587g = dVar;
        this.e = wVarArr;
        this.f17586f = wVarArr2;
        this.d = bVar;
        this.f17588i = list;
        this.f17590k = kVar;
        g2.h createDataSource = ((g2.g) fVar.f15842b).createDataSource();
        this.f17584b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.f17585c = ((g2.g) fVar.f15842b).createDataSource();
        this.h = new p1("", wVarArr2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            if ((wVarArr2[i10].f4120f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        p1 p1Var = this.h;
        int[] f7 = b8.f(arrayList);
        ?? cVar2 = new x2.c(p1Var, f7);
        cVar2.f17579g = cVar2.s(p1Var.d[f7[0]]);
        this.f17597r = cVar2;
    }

    public static h f(p2.m mVar, long j10, int i10) {
        long j11 = mVar.f44001k;
        n0 n0Var = mVar.f44009s;
        int i11 = (int) (j10 - j11);
        n0 n0Var2 = mVar.f44008r;
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
        if (i10 < jVar.f43986x.size()) {
            return new h((p2.k) jVar.f43986x.get(i10), j10, i10);
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

    public final z a(Uri uri) {
        w wVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        p2.d dVar = this.f17587g;
        p2.c cVar = (p2.c) dVar.d.get(uri);
        if (cVar != null) {
            wVar = cVar.f43930a;
        } else {
            wVar = null;
        }
        wVar.getClass();
        HashMap hashMap = wVar.f44072b;
        int size = hashMap.size();
        m2 it = y0.u(hashMap.values()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            p2.c cVar2 = (p2.c) dVar.d.get(uri2);
            if (cVar2 != null) {
                p2.b bVar = (p2.b) i2.d.i(cVar2.f43931b, uri2, uri2);
                bVar.getClass();
                if (elapsedRealtime <= bVar.f43926r) {
                    i10++;
                }
            }
        }
        return new z(size, i10, this.f17597r.length(), d(elapsedRealtime));
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
        int length = iVar.f17597r.length();
        v2.m[] mVarArr = new v2.m[length];
        boolean z11 = false;
        int i10 = 0;
        while (i10 < length) {
            int h = iVar.f17597r.h(i10);
            Uri c10 = iVar.e[h].c();
            p2.d dVar = iVar.f17587g;
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
                long j12 = b10.f44001k;
                n0 n0Var = b10.f44009s;
                n0 n0Var2 = b10.f44008r;
                int i11 = (int) (longValue - j12);
                if (i11 >= 0 && n0Var2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < n0Var2.size()) {
                        if (intValue != -1) {
                            p2.j jVar3 = (p2.j) n0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(jVar3);
                            } else if (intValue < jVar3.f43986x.size()) {
                                n0 n0Var3 = jVar3.f43986x;
                                arrayList.addAll(n0Var3.subList(intValue, n0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(n0Var2.subList(i11, n0Var2.size()));
                        intValue = 0;
                    }
                    if (b10.f44004n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < n0Var.size()) {
                            arrayList.addAll(n0Var.subList(intValue, n0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    l0 l0Var = n0.f8475b;
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
            p2.m b10 = this.f17587g.b(jVar.f17603x, false);
            b10.getClass();
            n0 n0Var2 = b10.f44008r;
            int i11 = (int) (jVar.f47906s - b10.f44001k);
            if (i11 >= 0) {
                if (i11 < n0Var2.size()) {
                    n0Var = ((p2.j) n0Var2.get(i11)).f43986x;
                } else {
                    n0Var = b10.f44009s;
                }
                if (i10 < n0Var.size()) {
                    p2.h hVar = (p2.h) n0Var.get(i10);
                    if (hVar.f43981x) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(e2.e.f(b10.f44030a, hVar.f43987a)), jVar.f47885b.f10792a)) {
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
        x2.p pVar = this.f17597r;
        int length = pVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int h = pVar.h(i11);
            if (!pVar.a(i11, j10)) {
                if (!this.f17587g.e(this.e[h], j10)) {
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
        t1 t1Var = this.f17589j;
        byte[] bArr = (byte[]) ((d) t1Var.f15524b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) t1Var.f15524b).put(uri, bArr);
            return null;
        }
        g2.m mVar = new g2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        b2.w wVar = this.f17586f[i10];
        int n10 = this.f17597r.n();
        Object q6 = this.f17597r.q();
        byte[] bArr3 = this.f17592m;
        ?? fVar = new v2.f(this.f17585c, mVar, 3, wVar, n10, q6, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = m0.f8254b;
        }
        fVar.f17577s = bArr3;
        return fVar;
    }
}
