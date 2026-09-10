package o2;

import android.net.Uri;
import android.util.SparseArray;
import b2.p0;
import b2.r0;
import b2.s0;
import e9.a1;
import e9.g0;
import e9.i0;
import g2.c0;
import i2.o1;
import i2.q0;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import m4.w;
import u2.d0;
import u2.e0;
import u2.q1;
public final class k implements e0, p2.t {
    public final j2.k E;
    public final o0.b F = new o0.b(this);
    public d0 G;
    public int H;
    public q1 I;
    public q[] J;
    public q[] K;
    public int L;
    public u2.o M;
    public final c f14180a;
    public final p2.c f14181b;
    public final l2.h f14182c;
    public final c0 d;
    public final n2.n e;
    public final n2.j f14183f;
    public final rb.a h;
    public final a5.a f14184n;
    public final y2.d f14185r;
    public final IdentityHashMap f14186s;
    public final ji.a v;
    public final ob.a f14187w;
    public final boolean f14188x;
    public final int f14189y;

    public k(c cVar, p2.c cVar2, l2.h hVar, c0 c0Var, n2.n nVar, n2.j jVar, rb.a aVar, a5.a aVar2, y2.d dVar, ob.a aVar3, boolean z10, int i10, j2.k kVar) {
        this.f14180a = cVar;
        this.f14181b = cVar2;
        this.f14182c = hVar;
        this.d = c0Var;
        this.e = nVar;
        this.f14183f = jVar;
        this.h = aVar;
        this.f14184n = aVar2;
        this.f14185r = dVar;
        this.f14187w = aVar3;
        this.f14188x = z10;
        this.f14189y = i10;
        this.E = kVar;
        aVar3.getClass();
        g0 g0Var = i0.f7384b;
        a1 a1Var = a1.e;
        this.M = new u2.o(a1Var, a1Var);
        this.f14186s = new IdentityHashMap();
        ?? obj = new Object();
        obj.f11945a = new SparseArray();
        this.v = obj;
        this.J = new q[0];
        this.K = new q[0];
    }

    public static b2.s g(b2.s sVar, b2.s sVar2, boolean z10) {
        p0 p0Var;
        int i10;
        String str;
        String str2;
        i0 i0Var;
        String str3;
        int i11;
        int i12;
        int i13;
        g0 g0Var = i0.f7384b;
        a1 a1Var = a1.e;
        int i14 = -1;
        if (sVar2 != null) {
            str2 = sVar2.f1995k;
            p0Var = sVar2.f1996l;
            i11 = sVar2.J;
            i10 = sVar2.e;
            i12 = sVar2.f1991f;
            str = sVar2.d;
            str3 = sVar2.f1989b;
            i0Var = sVar2.f1990c;
        } else {
            String v = e2.d0.v(1, sVar.f1995k);
            p0Var = sVar.f1996l;
            if (z10) {
                i11 = sVar.J;
                i10 = sVar.e;
                i12 = sVar.f1991f;
                str = sVar.d;
                str3 = sVar.f1989b;
                str2 = v;
                i0Var = sVar.f1990c;
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
            i14 = sVar.f1993i;
        }
        b2.r rVar = new b2.r();
        rVar.f1933a = sVar.f1988a;
        rVar.f1934b = str3;
        rVar.f1935c = i0.v(i0Var);
        rVar.f1945p = r0.n(sVar.f2001q);
        rVar.f1946q = r0.n(d);
        rVar.f1939j = str2;
        rVar.f1940k = p0Var;
        rVar.h = i13;
        rVar.f1938i = i14;
        rVar.I = i11;
        rVar.e = i10;
        rVar.f1936f = i12;
        rVar.d = str;
        return new b2.s(rVar);
    }

    @Override
    public final void a() {
        q[] qVarArr;
        i0 i0Var;
        long j3;
        for (q qVar : this.J) {
            y2.n nVar = qVar.f14231s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.f14234y;
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
                        p2.l a2 = iVar.f14162g.a(iVar.e[iVar.h.a(jVar.d)], false);
                        a2.getClass();
                        i0 i0Var2 = a2.f39601r;
                        int i11 = (int) (jVar.f42884s - a2.f39594k);
                        if (i11 < 0) {
                            j3 = 0;
                        } else {
                            if (i11 < i0Var2.size()) {
                                i0Var = ((p2.i) i0Var2.get(i11)).f39579x;
                            } else {
                                i0Var = a2.f39602s;
                            }
                            j3 = ((p2.g) i0Var.get(i10)).f39582c;
                        }
                        jVar.f14175a0 = j3;
                    }
                } else if (b10 == 0) {
                    qVar.H.post(new w(8, qVar, jVar));
                } else if (b10 == 2 && !qVar.f14225j0 && nVar.d()) {
                    nVar.b();
                }
            }
        }
        this.G.g(this);
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
        return new q(str, i10, this.F, new i(this.f14180a, this.f14181b, uriArr, sVarArr, this.f14182c, this.d, this.v, list, this.E), map, this.f14185r, j3, sVar, this.e, this.f14183f, this.h, this.f14184n, this.f14189y);
    }

    @Override
    public final void f() {
        q[] qVarArr;
        for (q qVar : this.J) {
            qVar.E();
            if (qVar.f14225j0 && !qVar.T) {
                throw s0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override
    public final long h(long j3) {
        q[] qVarArr = this.K;
        if (qVarArr.length > 0) {
            boolean J = qVarArr[0].J(j3, false);
            int i10 = 1;
            while (true) {
                q[] qVarArr2 = this.K;
                if (i10 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i10].J(j3, J);
                i10++;
            }
            if (J) {
                this.v.f11945a.clear();
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
                    qVar.L[i10].j(j3, qVar.f14218d0[i10]);
                }
            }
        }
    }

    @Override
    public final void j(u2.d0 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.j(u2.d0, long):void");
    }

    @Override
    public final long m() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean n(q0 q0Var) {
        q[] qVarArr;
        if (this.I == null) {
            for (q qVar : this.J) {
                if (!qVar.T) {
                    i2.p0 p0Var = new i2.p0();
                    p0Var.f10340a = qVar.f14221f0;
                    qVar.n(new q0(p0Var));
                }
            }
            return false;
        }
        return this.M.n(q0Var);
    }

    @Override
    public final long o(x2.r[] r40, boolean[] r41, u2.d1[] r42, boolean[] r43, long r44) {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.o(x2.r[], boolean[], u2.d1[], boolean[], long):long");
    }

    @Override
    public final q1 q() {
        q1 q1Var = this.I;
        q1Var.getClass();
        return q1Var;
    }

    @Override
    public final long r() {
        return this.M.r();
    }

    @Override
    public final long s(long j3, o1 o1Var) {
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
                p2.c cVar = iVar.f14162g;
                int c10 = iVar.f14172r.c();
                Uri[] uriArr = iVar.e;
                if (c10 < uriArr.length && c10 != -1) {
                    lVar = cVar.a(uriArr[iVar.f14172r.l()], true);
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    i0 i0Var = lVar.f39601r;
                    if (!i0Var.isEmpty()) {
                        long j11 = lVar.h - cVar.f39541y;
                        long j12 = j3 - j11;
                        int c11 = e2.d0.c(i0Var, Long.valueOf(j12), true);
                        long j13 = ((p2.i) i0Var.get(c11)).e;
                        if (lVar.f39623c && c11 != i0Var.size() - 1) {
                            j10 = ((p2.i) i0Var.get(c11 + 1)).e;
                        } else {
                            j10 = j13;
                        }
                        return o1Var.a(j12, j13, j10) + j11;
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
