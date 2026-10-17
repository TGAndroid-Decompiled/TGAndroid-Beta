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
import ki.t1;
import org.telegram.ui.Wallet.x5;
import p2.x;
import v7.b8;
public final class i {
    public final c f17580a;
    public final g2.h f17581b;
    public final g2.h f17582c;
    public final k0.b d;
    public final x[] e;
    public final w[] f17583f;
    public final p2.e f17584g;
    public final p1 h;
    public final List f17585i;
    public final j2.k f17587k;
    public boolean f17588l;
    public u2.b f17590n;
    public Uri f17591o;
    public Uri f17592p;
    public boolean f17593q;
    public x2.p f17594r;
    public final t1 f17586j = new t1(10);
    public byte[] f17589m = m0.f8255b;
    public long f17595s = -9223372036854775807L;

    public i(c cVar, p2.e eVar, x[] xVarArr, w[] wVarArr, l2.f fVar, c0 c0Var, k0.b bVar, List list, j2.k kVar) {
        this.f17580a = cVar;
        this.f17584g = eVar;
        this.e = xVarArr;
        this.f17583f = wVarArr;
        this.d = bVar;
        this.f17585i = list;
        this.f17587k = kVar;
        g2.h createDataSource = ((g2.g) fVar.f15837b).createDataSource();
        this.f17581b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.f17582c = ((g2.g) fVar.f15837b).createDataSource();
        this.h = new p1("", wVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            if ((wVarArr[i10].f4119f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        p1 p1Var = this.h;
        int[] f7 = b8.f(arrayList);
        ?? cVar2 = new x2.c(p1Var, f7);
        cVar2.f17576g = cVar2.s(p1Var.d[f7[0]]);
        this.f17594r = cVar2;
    }

    public static h f(p2.n nVar, long j10, int i10) {
        long j11 = nVar.f44024k;
        n0 n0Var = nVar.f44032s;
        int i11 = (int) (j10 - j11);
        n0 n0Var2 = nVar.f44031r;
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
        if (i10 < kVar.f44009x.size()) {
            return new h((p2.l) kVar.f44009x.get(i10), j10, i10);
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

    public final x5 a(Uri uri) {
        x xVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        p2.e eVar = this.f17584g;
        p2.d dVar = (p2.d) eVar.d.get(uri);
        if (dVar != null) {
            xVar = dVar.f43953a;
        } else {
            xVar = null;
        }
        xVar.getClass();
        HashMap hashMap = xVar.f44095b;
        int size = hashMap.size();
        m2 it = y0.u(hashMap.values()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            p2.d dVar2 = (p2.d) eVar.d.get(uri2);
            if (dVar2 != null) {
                p2.c cVar = (p2.c) i0.a.i(dVar2.f43954b, uri2, uri2);
                cVar.getClass();
                if (elapsedRealtime <= cVar.f43949r) {
                    i10++;
                }
            }
        }
        return new x5(size, i10, this.f17594r.length(), d(elapsedRealtime));
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
        int length = iVar.f17594r.length();
        v2.m[] mVarArr = new v2.m[length];
        boolean z11 = false;
        int i10 = 0;
        while (i10 < length) {
            int h = iVar.f17594r.h(i10);
            Uri c10 = iVar.e[h].c();
            p2.e eVar = iVar.f17584g;
            if (!eVar.f(c10)) {
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
                long j12 = b10.f44024k;
                n0 n0Var = b10.f44032s;
                n0 n0Var2 = b10.f44031r;
                int i11 = (int) (longValue - j12);
                if (i11 >= 0 && n0Var2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < n0Var2.size()) {
                        if (intValue != -1) {
                            p2.k kVar = (p2.k) n0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(kVar);
                            } else if (intValue < kVar.f44009x.size()) {
                                n0 n0Var3 = kVar.f44009x;
                                arrayList.addAll(n0Var3.subList(intValue, n0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(n0Var2.subList(i11, n0Var2.size()));
                        intValue = 0;
                    }
                    if (b10.f44027n != -9223372036854775807L) {
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
            p2.n b10 = this.f17584g.b(jVar.f17600x, false);
            b10.getClass();
            n0 n0Var2 = b10.f44031r;
            int i11 = (int) (jVar.f47928s - b10.f44024k);
            if (i11 >= 0) {
                if (i11 < n0Var2.size()) {
                    n0Var = ((p2.k) n0Var2.get(i11)).f44009x;
                } else {
                    n0Var = b10.f44032s;
                }
                if (i10 < n0Var.size()) {
                    p2.i iVar = (p2.i) n0Var.get(i10);
                    if (iVar.f44004x) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(e2.e.f(b10.f44053a, iVar.f44010a)), jVar.f47907b.f10792a)) {
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
        x2.p pVar = this.f17594r;
        int length = pVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int h = pVar.h(i11);
            if (!pVar.a(i11, j10)) {
                if (!this.f17584g.e(this.e[h], j10)) {
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
        t1 t1Var = this.f17586j;
        byte[] bArr = (byte[]) ((d) t1Var.f15519b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) t1Var.f15519b).put(uri, bArr);
            return null;
        }
        g2.m mVar = new g2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        w wVar = this.f17583f[i10];
        int n10 = this.f17594r.n();
        Object q6 = this.f17594r.q();
        byte[] bArr3 = this.f17589m;
        ?? fVar = new v2.f(this.f17582c, mVar, 3, wVar, n10, q6, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = m0.f8255b;
        }
        fVar.f17574s = bArr3;
        return fVar;
    }
}
