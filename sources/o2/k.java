package o2;

import android.net.Uri;
import android.util.SparseArray;
import b2.p0;
import b2.r0;
import b2.s0;
import e9.a1;
import e9.g0;
import e9.i0;
import i2.p1;
import i2.q0;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k2.u;
import u2.c0;
import u2.d0;
import u2.o1;
public final class k implements d0, p2.t {
    public final j2.k E;
    public final ka.c F = new ka.c(this, 7);
    public c0 G;
    public int H;
    public o1 I;
    public q[] J;
    public q[] K;
    public int L;
    public u2.n M;
    public final c f15536a;
    public final p2.c f15537b;
    public final l.d f15538c;
    public final g2.c0 d;
    public final n2.n e;
    public final n2.k f15539f;
    public final qb.b h;
    public final a5.a f15540n;
    public final y2.d f15541r;
    public final IdentityHashMap f15542s;
    public final u v;
    public final ob.a f15543w;
    public final boolean f15544x;
    public final int f15545y;

    public k(c cVar, p2.c cVar2, l.d dVar, g2.c0 c0Var, n2.n nVar, n2.k kVar, qb.b bVar, a5.a aVar, y2.d dVar2, ob.a aVar2, boolean z10, int i10, j2.k kVar2) {
        this.f15536a = cVar;
        this.f15537b = cVar2;
        this.f15538c = dVar;
        this.d = c0Var;
        this.e = nVar;
        this.f15539f = kVar;
        this.h = bVar;
        this.f15540n = aVar;
        this.f15541r = dVar2;
        this.f15543w = aVar2;
        this.f15544x = z10;
        this.f15545y = i10;
        this.E = kVar2;
        aVar2.getClass();
        g0 g0Var = i0.f8083b;
        a1 a1Var = a1.e;
        this.M = new u2.n(a1Var, a1Var);
        this.f15542s = new IdentityHashMap();
        this.v = new u(10);
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
        g0 g0Var = i0.f8083b;
        a1 a1Var = a1.e;
        int i14 = -1;
        if (sVar2 != null) {
            str2 = sVar2.f3302k;
            p0Var = sVar2.f3303l;
            i11 = sVar2.J;
            i10 = sVar2.e;
            i12 = sVar2.f3298f;
            str = sVar2.d;
            str3 = sVar2.f3296b;
            i0Var = sVar2.f3297c;
        } else {
            String v = e2.d0.v(1, sVar.f3302k);
            p0Var = sVar.f3303l;
            if (z10) {
                i11 = sVar.J;
                i10 = sVar.e;
                i12 = sVar.f3298f;
                str = sVar.d;
                str3 = sVar.f3296b;
                str2 = v;
                i0Var = sVar.f3297c;
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
            i14 = sVar.f3300i;
        }
        b2.r rVar = new b2.r();
        rVar.f3240a = sVar.f3295a;
        rVar.f3241b = str3;
        rVar.f3242c = i0.v(i0Var);
        rVar.f3252p = r0.n(sVar.f3308q);
        rVar.f3253q = r0.n(d);
        rVar.f3246j = str2;
        rVar.f3247k = p0Var;
        rVar.h = i13;
        rVar.f3245i = i14;
        rVar.I = i11;
        rVar.e = i10;
        rVar.f3243f = i12;
        rVar.d = str;
        return new b2.s(rVar);
    }

    @Override
    public final void a() {
        q[] qVarArr;
        i0 i0Var;
        long j3;
        for (q qVar : this.J) {
            y2.m mVar = qVar.f15587s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.f15590y;
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
                        p2.l a2 = iVar.f15518g.a(iVar.e[iVar.h.a(jVar.d)], false);
                        a2.getClass();
                        i0 i0Var2 = a2.f40729r;
                        int i11 = (int) (jVar.f44118s - a2.f40722k);
                        if (i11 < 0) {
                            j3 = 0;
                        } else {
                            if (i11 < i0Var2.size()) {
                                i0Var = ((p2.i) i0Var2.get(i11)).f40707x;
                            } else {
                                i0Var = a2.f40730s;
                            }
                            j3 = ((p2.g) i0Var.get(i10)).f40710c;
                        }
                        jVar.f15531a0 = j3;
                    }
                } else if (b10 == 0) {
                    qVar.H.post(new ki.c0(9, qVar, jVar));
                } else if (b10 == 2 && !qVar.f15581j0 && mVar.d()) {
                    mVar.b();
                }
            }
        }
        this.G.m(this);
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
        return new q(str, i10, this.F, new i(this.f15536a, this.f15537b, uriArr, sVarArr, this.f15538c, this.d, this.v, list, this.E), map, this.f15541r, j3, sVar, this.e, this.f15539f, this.h, this.f15540n, this.f15545y);
    }

    @Override
    public final void g() {
        q[] qVarArr;
        for (q qVar : this.J) {
            qVar.C();
            if (qVar.f15581j0 && !qVar.T) {
                throw s0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override
    public final long h(long j3) {
        q[] qVarArr = this.K;
        if (qVarArr.length > 0) {
            boolean G = qVarArr[0].G(j3, false);
            int i10 = 1;
            while (true) {
                q[] qVarArr2 = this.K;
                if (i10 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i10].G(j3, G);
                i10++;
            }
            if (G) {
                ((SparseArray) this.v.f13383b).clear();
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
                    qVar.L[i10].j(j3, qVar.f15574d0[i10]);
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
    public final boolean p(i2.r0 r0Var) {
        q[] qVarArr;
        if (this.I == null) {
            for (q qVar : this.J) {
                if (!qVar.T) {
                    q0 q0Var = new q0();
                    q0Var.f10863a = qVar.f15577f0;
                    qVar.p(new i2.r0(q0Var));
                }
            }
            return false;
        }
        return this.M.p(r0Var);
    }

    @Override
    public final long q(x2.r[] r40, boolean[] r41, u2.b1[] r42, boolean[] r43, long r44) {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.q(x2.r[], boolean[], u2.b1[], boolean[], long):long");
    }

    @Override
    public final o1 r() {
        o1 o1Var = this.I;
        o1Var.getClass();
        return o1Var;
    }

    @Override
    public final long s() {
        return this.M.s();
    }

    @Override
    public final long t(long j3, p1 p1Var) {
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
                p2.c cVar = iVar.f15518g;
                int c10 = iVar.f15528r.c();
                Uri[] uriArr = iVar.e;
                if (c10 < uriArr.length && c10 != -1) {
                    lVar = cVar.a(uriArr[iVar.f15528r.l()], true);
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    i0 i0Var = lVar.f40729r;
                    if (!i0Var.isEmpty()) {
                        long j11 = lVar.h - cVar.f40669y;
                        long j12 = j3 - j11;
                        int c11 = e2.d0.c(i0Var, Long.valueOf(j12), true);
                        long j13 = ((p2.i) i0Var.get(c11)).e;
                        if (lVar.f40751c && c11 != i0Var.size() - 1) {
                            j10 = ((p2.i) i0Var.get(c11 + 1)).e;
                        } else {
                            j10 = j13;
                        }
                        return p1Var.a(j12, j13, j10) + j11;
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
