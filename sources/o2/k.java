package o2;

import android.net.Uri;
import android.util.SparseArray;
import b2.p0;
import b2.r0;
import b2.s0;
import e9.a1;
import e9.i0;
import i2.p1;
import i2.q0;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import ji.b5;
import ji.u4;
import k2.g0;
import u2.c0;
import u2.d0;
import u2.o1;
public final class k implements d0, p2.t {
    public final j2.k E;
    public final mg.n F = new mg.n(this, 3);
    public c0 G;
    public int H;
    public o1 I;
    public q[] J;
    public q[] K;
    public int L;
    public u2.n M;
    public final c f16902a;
    public final p2.c f16903b;
    public final u4 f16904c;
    public final g2.c0 d;
    public final n2.m f16905e;
    public final n2.j f16906f;
    public final rb.a h;
    public final a5.a f16907n;
    public final y2.d f16908r;
    public final IdentityHashMap f16909s;
    public final g0 v;
    public final qb.b f16910w;
    public final boolean f16911x;
    public final int f16912y;

    public k(c cVar, p2.c cVar2, u4 u4Var, g2.c0 c0Var, n2.m mVar, n2.j jVar, rb.a aVar, a5.a aVar2, y2.d dVar, qb.b bVar, boolean z10, int i10, j2.k kVar) {
        this.f16902a = cVar;
        this.f16903b = cVar2;
        this.f16904c = u4Var;
        this.d = c0Var;
        this.f16905e = mVar;
        this.f16906f = jVar;
        this.h = aVar;
        this.f16907n = aVar2;
        this.f16908r = dVar;
        this.f16910w = bVar;
        this.f16911x = z10;
        this.f16912y = i10;
        this.E = kVar;
        bVar.getClass();
        e9.g0 g0Var = i0.f8985b;
        a1 a1Var = a1.f8948e;
        this.M = new u2.n(a1Var, a1Var);
        this.f16909s = new IdentityHashMap();
        this.v = new g0(7);
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
        e9.g0 g0Var = i0.f8985b;
        a1 a1Var = a1.f8948e;
        int i14 = -1;
        if (sVar2 != null) {
            str2 = sVar2.f2390k;
            p0Var = sVar2.f2391l;
            i11 = sVar2.J;
            i10 = sVar2.f2385e;
            i12 = sVar2.f2386f;
            str = sVar2.d;
            str3 = sVar2.f2383b;
            i0Var = sVar2.f2384c;
        } else {
            String v = e2.d0.v(1, sVar.f2390k);
            p0Var = sVar.f2391l;
            if (z10) {
                i11 = sVar.J;
                i10 = sVar.f2385e;
                i12 = sVar.f2386f;
                str = sVar.d;
                str3 = sVar.f2383b;
                str2 = v;
                i0Var = sVar.f2384c;
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
            i14 = sVar.f2388i;
        }
        b2.r rVar = new b2.r();
        rVar.f2325a = sVar.f2382a;
        rVar.f2326b = str3;
        rVar.f2327c = i0.v(i0Var);
        rVar.f2338p = r0.n(sVar.f2396q);
        rVar.f2339q = r0.n(d);
        rVar.f2332j = str2;
        rVar.f2333k = p0Var;
        rVar.h = i13;
        rVar.f2331i = i14;
        rVar.I = i11;
        rVar.f2328e = i10;
        rVar.f2329f = i12;
        rVar.d = str;
        return new b2.s(rVar);
    }

    @Override
    public final void a() {
        q[] qVarArr;
        i0 i0Var;
        long j3;
        for (q qVar : this.J) {
            y2.m mVar = qVar.f16956s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.f16959y;
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
                        p2.l a2 = iVar.f16884g.a(iVar.f16882e[iVar.h.a(jVar.d)], false);
                        a2.getClass();
                        i0 i0Var2 = a2.f43752r;
                        int i11 = (int) (jVar.f47351s - a2.f43745k);
                        if (i11 < 0) {
                            j3 = 0;
                        } else {
                            if (i11 < i0Var2.size()) {
                                i0Var = ((p2.i) i0Var2.get(i11)).f43727x;
                            } else {
                                i0Var = a2.f43753s;
                            }
                            j3 = ((p2.g) i0Var.get(i10)).f43730c;
                        }
                        jVar.f16897a0 = j3;
                    }
                } else if (b10 == 0) {
                    qVar.H.post(new b5(13, qVar, jVar));
                } else if (b10 == 2 && !qVar.f16950j0 && mVar.d()) {
                    mVar.a();
                }
            }
        }
        this.G.b(this);
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
        return new q(str, i10, this.F, new i(this.f16902a, this.f16903b, uriArr, sVarArr, this.f16904c, this.d, this.v, list, this.E), map, this.f16908r, j3, sVar, this.f16905e, this.f16906f, this.h, this.f16907n, this.f16912y);
    }

    @Override
    public final void j() {
        q[] qVarArr;
        for (q qVar : this.J) {
            qVar.D();
            if (qVar.f16950j0 && !qVar.T) {
                throw s0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override
    public final long k(long j3) {
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
                ((SparseArray) this.v.f14604b).clear();
            }
        }
        return j3;
    }

    @Override
    public final void l(long j3) {
        q[] qVarArr;
        for (q qVar : this.K) {
            if (qVar.S && !qVar.B()) {
                int length = qVar.L.length;
                for (int i10 = 0; i10 < length; i10++) {
                    qVar.L[i10].j(j3, qVar.f16942d0[i10]);
                }
            }
        }
    }

    @Override
    public final void n(u2.c0 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.n(u2.c0, long):void");
    }

    @Override
    public final long o() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean p(i2.r0 r0Var) {
        q[] qVarArr;
        if (this.I == null) {
            for (q qVar : this.J) {
                if (!qVar.T) {
                    q0 q0Var = new q0();
                    q0Var.f11745a = qVar.f16946f0;
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
                p2.c cVar = iVar.f16884g;
                int c10 = iVar.f16894r.c();
                Uri[] uriArr = iVar.f16882e;
                if (c10 < uriArr.length && c10 != -1) {
                    lVar = cVar.a(uriArr[iVar.f16894r.l()], true);
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    i0 i0Var = lVar.f43752r;
                    if (!i0Var.isEmpty()) {
                        long j11 = lVar.h - cVar.f43687y;
                        long j12 = j3 - j11;
                        int c11 = e2.d0.c(i0Var, Long.valueOf(j12), true);
                        long j13 = ((p2.i) i0Var.get(c11)).f43731e;
                        if (lVar.f43776c && c11 != i0Var.size() - 1) {
                            j10 = ((p2.i) i0Var.get(c11 + 1)).f43731e;
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
