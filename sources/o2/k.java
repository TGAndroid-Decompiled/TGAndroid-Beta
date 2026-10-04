package o2;

import android.net.Uri;
import android.util.SparseArray;
import b2.p0;
import b2.r0;
import b2.s0;
import e9.a1;
import e9.g0;
import e9.i0;
import i2.q1;
import ii.n4;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import ki.h0;
import u2.c0;
import u2.d0;
import u2.p1;
public final class k implements d0, p2.t {
    public final j2.k E;
    public final l2.g F = new l2.g(this, 6);
    public c0 G;
    public int H;
    public p1 I;
    public q[] J;
    public q[] K;
    public int L;
    public u2.n M;
    public final c f17038a;
    public final p2.c f17039b;
    public final n4 f17040c;
    public final g2.c0 d;
    public final n2.n f17041e;
    public final n2.k f17042f;
    public final qb.b h;
    public final a5.a f17043n;
    public final y2.d f17044r;
    public final IdentityHashMap f17045s;
    public final t v;
    public final ob.a f17046w;
    public final boolean f17047x;
    public final int f17048y;

    public k(c cVar, p2.c cVar2, n4 n4Var, g2.c0 c0Var, n2.n nVar, n2.k kVar, qb.b bVar, a5.a aVar, y2.d dVar, ob.a aVar2, boolean z10, int i10, j2.k kVar2) {
        this.f17038a = cVar;
        this.f17039b = cVar2;
        this.f17040c = n4Var;
        this.d = c0Var;
        this.f17041e = nVar;
        this.f17042f = kVar;
        this.h = bVar;
        this.f17043n = aVar;
        this.f17044r = dVar;
        this.f17046w = aVar2;
        this.f17047x = z10;
        this.f17048y = i10;
        this.E = kVar2;
        aVar2.getClass();
        g0 g0Var = i0.f8758b;
        a1 a1Var = a1.f8721e;
        this.M = new u2.n(a1Var, a1Var);
        this.f17045s = new IdentityHashMap();
        ?? obj = new Object();
        obj.f17104a = new SparseArray();
        this.v = obj;
        this.J = new q[0];
        this.K = new q[0];
    }

    public static b2.s f(b2.s sVar, b2.s sVar2, boolean z10) {
        p0 p0Var;
        int i10;
        String str;
        String str2;
        i0 i0Var;
        String str3;
        int i11;
        int i12;
        int i13;
        g0 g0Var = i0.f8758b;
        a1 a1Var = a1.f8721e;
        int i14 = -1;
        if (sVar2 != null) {
            str2 = sVar2.f3557k;
            p0Var = sVar2.f3558l;
            i11 = sVar2.J;
            i10 = sVar2.f3552e;
            i12 = sVar2.f3553f;
            str = sVar2.d;
            str3 = sVar2.f3550b;
            i0Var = sVar2.f3551c;
        } else {
            String v = e2.d0.v(1, sVar.f3557k);
            p0Var = sVar.f3558l;
            if (z10) {
                i11 = sVar.J;
                i10 = sVar.f3552e;
                i12 = sVar.f3553f;
                str = sVar.d;
                str3 = sVar.f3550b;
                str2 = v;
                i0Var = sVar.f3551c;
            } else {
                i10 = 0;
                str = null;
                str2 = v;
                i0Var = a1Var;
                str3 = null;
                i11 = -1;
                i12 = 0;
            }
        }
        String d = r0.d(str2);
        if (z10) {
            i13 = sVar.h;
        } else {
            i13 = -1;
        }
        if (z10) {
            i14 = sVar.f3555i;
        }
        b2.r rVar = new b2.r();
        rVar.f3492a = sVar.f3549a;
        rVar.f3493b = str3;
        rVar.f3494c = i0.v(i0Var);
        rVar.f3505p = r0.n(sVar.f3563q);
        rVar.f3506q = r0.n(d);
        rVar.f3499j = str2;
        rVar.f3500k = p0Var;
        rVar.h = i13;
        rVar.f3498i = i14;
        rVar.I = i11;
        rVar.f3495e = i10;
        rVar.f3496f = i12;
        rVar.d = str;
        return new b2.s(rVar);
    }

    @Override
    public final void a() {
        q[] qVarArr;
        i0 i0Var;
        long j3;
        for (q qVar : this.J) {
            y2.l lVar = qVar.f17092s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.f17095y;
            if (!arrayList.isEmpty()) {
                j jVar = (j) e9.q.l(arrayList);
                int b10 = iVar.b(jVar);
                int i10 = jVar.E;
                boolean z10 = true;
                if (b10 == 1) {
                    if (!jVar.g()) {
                        if (i10 == -1) {
                            z10 = false;
                        }
                        e2.d.g(z10);
                        p2.l a2 = iVar.f17020g.a(iVar.f17018e[iVar.h.a(jVar.d)], false);
                        a2.getClass();
                        i0 i0Var2 = a2.f44074r;
                        int i11 = (int) (jVar.f47811s - a2.f44067k);
                        if (i11 < 0) {
                            j3 = 0;
                        } else {
                            if (i11 < i0Var2.size()) {
                                i0Var = ((p2.i) i0Var2.get(i11)).f44049x;
                            } else {
                                i0Var = a2.f44075s;
                            }
                            j3 = ((p2.g) i0Var.get(i10)).f44052c;
                        }
                        jVar.f17033a0 = j3;
                    }
                } else if (b10 == 0) {
                    qVar.H.post(new h0(10, qVar, jVar));
                } else if (b10 == 2 && !qVar.f17086j0 && lVar.d()) {
                    lVar.b();
                }
            }
        }
        this.G.f(this);
    }

    @Override
    public final boolean b(android.net.Uri r18, c5.b0 r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.b(android.net.Uri, c5.b0, boolean):boolean");
    }

    @Override
    public final boolean c() {
        return this.M.c();
    }

    @Override
    public final long d() {
        return this.M.d();
    }

    public final q e(String str, int i10, Uri[] uriArr, b2.s[] sVarArr, b2.s sVar, List list, Map map, long j3) {
        return new q(str, i10, this.F, new i(this.f17038a, this.f17039b, uriArr, sVarArr, this.f17040c, this.d, this.v, list, this.E), map, this.f17044r, j3, sVar, this.f17041e, this.f17042f, this.h, this.f17043n, this.f17048y);
    }

    @Override
    public final void g() {
        q[] qVarArr;
        for (q qVar : this.J) {
            qVar.C();
            if (qVar.f17086j0 && !qVar.T) {
                throw s0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override
    public final long h(long j3) {
        q[] qVarArr = this.K;
        if (qVarArr.length > 0) {
            boolean F = qVarArr[0].F(j3, false);
            int i10 = 1;
            while (true) {
                q[] qVarArr2 = this.K;
                if (i10 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i10].F(j3, F);
                i10++;
            }
            if (F) {
                this.v.f17104a.clear();
            }
        }
        return j3;
    }

    @Override
    public final void i(long j3) {
        q[] qVarArr;
        for (q qVar : this.K) {
            if (qVar.S && !qVar.A()) {
                int length = qVar.L.length;
                for (int i10 = 0; i10 < length; i10++) {
                    qVar.L[i10].j(j3, qVar.f17078d0[i10]);
                }
            }
        }
    }

    @Override
    public final void k(u2.c0 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.k(u2.c0, long):void");
    }

    @Override
    public final long l() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean m(i2.s0 s0Var) {
        q[] qVarArr;
        if (this.I == null) {
            for (q qVar : this.J) {
                if (!qVar.T) {
                    i2.r0 r0Var = new i2.r0();
                    r0Var.f11826a = qVar.f17082f0;
                    qVar.m(new i2.s0(r0Var));
                }
            }
            return false;
        }
        return this.M.m(s0Var);
    }

    @Override
    public final long n(x2.r[] r40, boolean[] r41, u2.c1[] r42, boolean[] r43, long r44) {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.n(x2.r[], boolean[], u2.c1[], boolean[], long):long");
    }

    @Override
    public final p1 o() {
        p1 p1Var = this.I;
        p1Var.getClass();
        return p1Var;
    }

    @Override
    public final long p() {
        return this.M.p();
    }

    @Override
    public final long q(long j3, q1 q1Var) {
        p2.l lVar;
        long j10;
        q[] qVarArr = this.K;
        int length = qVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            q qVar = qVarArr[i10];
            if (qVar.Q == 2) {
                i iVar = qVar.d;
                p2.c cVar = iVar.f17020g;
                int c10 = iVar.f17030r.c();
                Uri[] uriArr = iVar.f17018e;
                if (c10 < uriArr.length && c10 != -1) {
                    lVar = cVar.a(uriArr[iVar.f17030r.l()], true);
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    i0 i0Var = lVar.f44074r;
                    if (!i0Var.isEmpty()) {
                        long j11 = lVar.h - cVar.f44009y;
                        long j12 = j3 - j11;
                        int c11 = e2.d0.c(i0Var, Long.valueOf(j12), true);
                        long j13 = ((p2.i) i0Var.get(c11)).f44053e;
                        if (lVar.f44098c && c11 != i0Var.size() - 1) {
                            j10 = ((p2.i) i0Var.get(c11 + 1)).f44053e;
                        } else {
                            j10 = j13;
                        }
                        return q1Var.a(j12, j13, j10) + j11;
                    }
                }
            } else {
                i10++;
            }
        }
        return j3;
    }

    @Override
    public final void r(long j3) {
        this.M.r(j3);
    }
}
