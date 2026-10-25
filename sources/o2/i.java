package o2;

import a8.ed;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import b2.q1;
import b2.x;
import e2.n0;
import f9.g0;
import f9.g2;
import f9.i0;
import f9.s1;
import f9.t0;
import g2.c0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import jg.s0;
import li.e3;
import li.h5;
import p2.w;
import vi.y;
public final class i {
    public final c f18994a;
    public final g2.h f18995b;
    public final g2.h f18996c;
    public final s0 d;
    public final w[] e;
    public final x[] f18997f;
    public final p2.d f18998g;
    public final q1 h;
    public final List f18999i;
    public final h5 f19000j;
    public final j2.j f19001k;
    public boolean f19002l;
    public byte[] f19003m;
    public u2.b f19004n;
    public Uri f19005o;
    public Uri f19006p;
    public boolean f19007q;
    public x2.q f19008r;
    public long f19009s;

    public i(c cVar, p2.d dVar, w[] wVarArr, x[] xVarArr, e3 e3Var, c0 c0Var, s0 s0Var, List list, j2.j jVar) {
        this.f18994a = cVar;
        this.f18998g = dVar;
        this.e = wVarArr;
        this.f18997f = xVarArr;
        this.d = s0Var;
        this.f18999i = list;
        this.f19001k = jVar;
        ?? obj = new Object();
        obj.f17285a = new d(1.0f, 5, 0, false);
        this.f19000j = obj;
        this.f19003m = n0.f9693b;
        this.f19009s = -9223372036854775807L;
        g2.h createDataSource = ((g2.g) e3Var.f17210b).createDataSource();
        this.f18995b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.f18996c = ((g2.g) e3Var.f17210b).createDataSource();
        this.h = new q1("", xVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            if ((xVarArr[i10].f3574f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        q1 q1Var = this.h;
        int[] f7 = ed.f(arrayList);
        ?? cVar2 = new x2.c(q1Var, f7);
        cVar2.f18990g = cVar2.s(q1Var.d[f7[0]]);
        this.f19008r = cVar2;
    }

    public static h f(p2.m mVar, long j10, int i10) {
        long j11 = mVar.f46564k;
        i0 i0Var = mVar.f46572s;
        int i11 = (int) (j10 - j11);
        i0 i0Var2 = mVar.f46571r;
        if (i11 == i0Var2.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < i0Var.size()) {
                return new h((p2.k) i0Var.get(i10), j10, i10);
            }
            return null;
        }
        p2.j jVar = (p2.j) i0Var2.get(i11);
        if (i10 == -1) {
            return new h(jVar, j10, -1);
        }
        if (i10 < jVar.f46549x.size()) {
            return new h((p2.k) jVar.f46549x.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < i0Var2.size()) {
            return new h((p2.k) i0Var2.get(i12), j10 + 1, -1);
        }
        if (!i0Var.isEmpty()) {
            return new h((p2.k) i0Var.get(0), j10 + 1, 0);
        }
        return null;
    }

    public final y a(Uri uri) {
        w wVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        p2.d dVar = this.f18998g;
        p2.c cVar = (p2.c) dVar.d.get(uri);
        if (cVar != null) {
            wVar = cVar.f46493a;
        } else {
            wVar = null;
        }
        wVar.getClass();
        HashMap hashMap = wVar.f46635b;
        int size = hashMap.size();
        g2 it = t0.u(hashMap.values()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            p2.c cVar2 = (p2.c) dVar.d.get(uri2);
            if (cVar2 != null) {
                p2.b bVar = (p2.b) ic.a.h(cVar2.f46494b, uri2, uri2);
                bVar.getClass();
                if (elapsedRealtime <= bVar.f46489r) {
                    i10++;
                }
            }
        }
        return new y(size, i10, this.f19008r.length(), d(elapsedRealtime));
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
        int length = iVar.f19008r.length();
        v2.m[] mVarArr = new v2.m[length];
        boolean z11 = false;
        int i10 = 0;
        while (i10 < length) {
            int h = iVar.f19008r.h(i10);
            Uri c10 = iVar.e[h].c();
            p2.d dVar = iVar.f18998g;
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
                long j12 = b10.f46564k;
                i0 i0Var = b10.f46572s;
                i0 i0Var2 = b10.f46571r;
                int i11 = (int) (longValue - j12);
                if (i11 >= 0 && i0Var2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < i0Var2.size()) {
                        if (intValue != -1) {
                            p2.j jVar3 = (p2.j) i0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(jVar3);
                            } else if (intValue < jVar3.f46549x.size()) {
                                i0 i0Var3 = jVar3.f46549x;
                                arrayList.addAll(i0Var3.subList(intValue, i0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(i0Var2.subList(i11, i0Var2.size()));
                        intValue = 0;
                    }
                    if (b10.f46567n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < i0Var.size()) {
                            arrayList.addAll(i0Var.subList(intValue, i0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    g0 g0Var = i0.f10287b;
                    list = s1.e;
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
        i0 i0Var;
        int i10 = jVar.E;
        if (i10 != -1) {
            p2.m b10 = this.f18998g.b(jVar.f19014x, false);
            b10.getClass();
            i0 i0Var2 = b10.f46571r;
            int i11 = (int) (jVar.f50025s - b10.f46564k);
            if (i11 >= 0) {
                if (i11 < i0Var2.size()) {
                    i0Var = ((p2.j) i0Var2.get(i11)).f46549x;
                } else {
                    i0Var = b10.f46572s;
                }
                if (i10 < i0Var.size()) {
                    p2.h hVar = (p2.h) i0Var.get(i10);
                    if (hVar.f46544x) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(e2.e.f(b10.f46593a, hVar.f46550a)), jVar.f50004b.f12258a)) {
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
        x2.q qVar = this.f19008r;
        int length = qVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int h = qVar.h(i11);
            if (!qVar.a(i11, j10)) {
                if (!this.f18998g.e(this.e[h], j10)) {
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
        h5 h5Var = this.f19000j;
        byte[] bArr = (byte[]) ((d) h5Var.f17285a).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) h5Var.f17285a).put(uri, bArr);
            return null;
        }
        g2.m mVar = new g2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        x xVar = this.f18997f[i10];
        int n10 = this.f19008r.n();
        Object q5 = this.f19008r.q();
        byte[] bArr3 = this.f19003m;
        ?? fVar = new v2.f(this.f18996c, mVar, 3, xVar, n10, q5, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = n0.f9693b;
        }
        fVar.f18988s = bArr3;
        return fVar;
    }
}
