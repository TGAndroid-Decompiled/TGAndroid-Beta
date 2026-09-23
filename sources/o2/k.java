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
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import p2.u;
import u2.c0;
import u2.d0;
import u2.n1;
public final class k implements d0, u {
    public final j2.k E;
    public final a4.m F = new a4.m(this, 29);
    public c0 G;
    public int H;
    public n1 I;
    public q[] J;
    public q[] K;
    public int L;
    public u2.n M;
    public final c f15372a;
    public final p2.d f15373b;
    public final k2.u f15374c;
    public final g2.c0 d;
    public final n2.m e;
    public final n2.j f15375f;
    public final qb.b h;
    public final a5.a f15376n;
    public final y2.d f15377r;
    public final IdentityHashMap f15378s;
    public final mi.a v;
    public final ob.a f15379w;
    public final boolean f15380x;
    public final int f15381y;

    public k(c cVar, p2.d dVar, k2.u uVar, g2.c0 c0Var, n2.m mVar, n2.j jVar, qb.b bVar, a5.a aVar, y2.d dVar2, ob.a aVar2, boolean z10, int i10, j2.k kVar) {
        this.f15372a = cVar;
        this.f15373b = dVar;
        this.f15374c = uVar;
        this.d = c0Var;
        this.e = mVar;
        this.f15375f = jVar;
        this.h = bVar;
        this.f15376n = aVar;
        this.f15377r = dVar2;
        this.f15379w = aVar2;
        this.f15380x = z10;
        this.f15381y = i10;
        this.E = kVar;
        aVar2.getClass();
        g0 g0Var = i0.f8067b;
        a1 a1Var = a1.e;
        this.M = new u2.n(a1Var, a1Var);
        this.f15378s = new IdentityHashMap();
        ?? obj = new Object();
        obj.f14810a = new SparseArray();
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
        g0 g0Var = i0.f8067b;
        a1 a1Var = a1.e;
        int i14 = -1;
        if (sVar2 != null) {
            str2 = sVar2.f3294k;
            p0Var = sVar2.f3295l;
            i11 = sVar2.J;
            i10 = sVar2.e;
            i12 = sVar2.f3290f;
            str = sVar2.d;
            str3 = sVar2.f3288b;
            i0Var = sVar2.f3289c;
        } else {
            String v = e2.d0.v(1, sVar.f3294k);
            p0Var = sVar.f3295l;
            if (z10) {
                i11 = sVar.J;
                i10 = sVar.e;
                i12 = sVar.f3290f;
                str = sVar.d;
                str3 = sVar.f3288b;
                str2 = v;
                i0Var = sVar.f3289c;
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
            i14 = sVar.f3292i;
        }
        b2.r rVar = new b2.r();
        rVar.f3232a = sVar.f3287a;
        rVar.f3233b = str3;
        rVar.f3234c = i0.v(i0Var);
        rVar.f3244p = r0.n(sVar.f3300q);
        rVar.f3245q = r0.n(d);
        rVar.f3238j = str2;
        rVar.f3239k = p0Var;
        rVar.h = i13;
        rVar.f3237i = i14;
        rVar.I = i11;
        rVar.e = i10;
        rVar.f3235f = i12;
        rVar.d = str;
        return new b2.s(rVar);
    }

    @Override
    public final void a() {
        q[] qVarArr;
        i0 i0Var;
        long j3;
        for (q qVar : this.J) {
            y2.m mVar = qVar.f15423s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.f15426y;
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
                        p2.m a2 = iVar.f15354g.a(iVar.e[iVar.h.a(jVar.d)], false);
                        a2.getClass();
                        i0 i0Var2 = a2.f40427r;
                        int i11 = (int) (jVar.f43813s - a2.f40420k);
                        if (i11 < 0) {
                            j3 = 0;
                        } else {
                            if (i11 < i0Var2.size()) {
                                i0Var = ((p2.j) i0Var2.get(i11)).f40405x;
                            } else {
                                i0Var = a2.f40428s;
                            }
                            j3 = ((p2.h) i0Var.get(i10)).f40408c;
                        }
                        jVar.f15367a0 = j3;
                    }
                } else if (b10 == 0) {
                    qVar.H.post(new m4.g0(7, qVar, jVar));
                } else if (b10 == 2 && !qVar.f15417j0 && mVar.d()) {
                    mVar.b();
                }
            }
        }
        this.G.v(this);
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
        return new q(str, i10, this.F, new i(this.f15372a, this.f15373b, uriArr, sVarArr, this.f15374c, this.d, this.v, list, this.E), map, this.f15377r, j3, sVar, this.e, this.f15375f, this.h, this.f15376n, this.f15381y);
    }

    @Override
    public final void g() {
        q[] qVarArr;
        for (q qVar : this.J) {
            qVar.C();
            if (qVar.f15417j0 && !qVar.T) {
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
                this.v.f14810a.clear();
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
                    qVar.L[i10].j(j3, qVar.f15410d0[i10]);
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
                    r0Var.f10854a = qVar.f15413f0;
                    qVar.m(new i2.s0(r0Var));
                }
            }
            return false;
        }
        return this.M.m(s0Var);
    }

    @Override
    public final long p(x2.r[] r40, boolean[] r41, u2.a1[] r42, boolean[] r43, long r44) {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.p(x2.r[], boolean[], u2.a1[], boolean[], long):long");
    }

    @Override
    public final n1 r() {
        n1 n1Var = this.I;
        n1Var.getClass();
        return n1Var;
    }

    @Override
    public final long s() {
        return this.M.s();
    }

    @Override
    public final long t(long j3, q1 q1Var) {
        p2.m mVar;
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
                p2.d dVar = iVar.f15354g;
                int c10 = iVar.f15364r.c();
                Uri[] uriArr = iVar.e;
                if (c10 < uriArr.length && c10 != -1) {
                    mVar = dVar.a(uriArr[iVar.f15364r.l()], true);
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    i0 i0Var = mVar.f40427r;
                    if (!i0Var.isEmpty()) {
                        long j11 = mVar.h - dVar.f40367y;
                        long j12 = j3 - j11;
                        int c11 = e2.d0.c(i0Var, Long.valueOf(j12), true);
                        long j13 = ((p2.j) i0Var.get(c11)).e;
                        if (mVar.f40449c && c11 != i0Var.size() - 1) {
                            j10 = ((p2.j) i0Var.get(c11 + 1)).e;
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
    public final void u(long j3) {
        this.M.u(j3);
    }
}
