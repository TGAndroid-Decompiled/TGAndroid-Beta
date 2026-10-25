package e3;

import a3.l;
import c3.o;
import c3.p;
import c3.q;
import e2.n0;
import e2.x;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.List;
public final class b implements o {
    public final x f9740a;
    public final l f9741b;
    public final boolean f9742c;
    public final qb.a d;
    public int e;
    public q f9743f;
    public c f9744g;
    public long h;
    public e[] f9745i;
    public long f9746j;
    public e f9747k;
    public int f9748l;
    public long f9749m;
    public long f9750n;
    public int f9751o;
    public boolean f9752p;

    public b(int i10, qb.a aVar) {
        this.d = aVar;
        this.f9742c = (i10 & 1) == 0;
        this.f9740a = new x(12);
        this.f9741b = new Object();
        this.f9743f = new qb.a(4);
        this.f9745i = new e[0];
        this.f9749m = -1L;
        this.f9750n = -1L;
        this.f9748l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean a(p pVar) {
        x xVar = this.f9740a;
        pVar.b(0, 12, xVar.f9732a);
        xVar.N(0);
        if (xVar.o() != 1179011410) {
            return false;
        }
        xVar.O(4);
        if (xVar.o() != 541677121) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(q qVar) {
        this.e = 0;
        if (this.f9742c) {
            qVar = new c2.b(qVar, this.d);
        }
        this.f9743f = qVar;
        this.f9746j = -1L;
    }

    @Override
    public final void d(long j10, long j11) {
        e[] eVarArr;
        this.f9746j = -1L;
        this.f9747k = null;
        for (e eVar : this.f9745i) {
            if (eVar.f9767k == 0) {
                eVar.f9765i = 0;
            } else {
                eVar.f9765i = eVar.f9770n[n0.f(eVar.f9769m, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f9745i.length == 0) {
                this.e = 0;
                return;
            } else {
                this.e = 3;
                return;
            }
        }
        this.e = 6;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f10287b;
        return s1.e;
    }

    @Override
    public final int f(c3.p r24, c3.s r25) {
        throw new UnsupportedOperationException("Method not decompiled: e3.b.f(c3.p, c3.s):int");
    }

    @Override
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
