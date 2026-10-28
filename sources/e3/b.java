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
    public final x f9739a;
    public final l f9740b;
    public final boolean f9741c;
    public final qb.a d;
    public int e;
    public q f9742f;
    public c f9743g;
    public long h;
    public e[] f9744i;
    public long f9745j;
    public e f9746k;
    public int f9747l;
    public long f9748m;
    public long f9749n;
    public int f9750o;
    public boolean f9751p;

    public b(int i10, qb.a aVar) {
        this.d = aVar;
        this.f9741c = (i10 & 1) == 0;
        this.f9739a = new x(12);
        this.f9740b = new Object();
        this.f9742f = new qb.a(4);
        this.f9744i = new e[0];
        this.f9748m = -1L;
        this.f9749n = -1L;
        this.f9747l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean a(p pVar) {
        x xVar = this.f9739a;
        pVar.b(0, 12, xVar.f9731a);
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
        if (this.f9741c) {
            qVar = new c2.b(qVar, this.d);
        }
        this.f9742f = qVar;
        this.f9745j = -1L;
    }

    @Override
    public final void d(long j10, long j11) {
        e[] eVarArr;
        this.f9745j = -1L;
        this.f9746k = null;
        for (e eVar : this.f9744i) {
            if (eVar.f9766k == 0) {
                eVar.f9764i = 0;
            } else {
                eVar.f9764i = eVar.f9769n[n0.f(eVar.f9768m, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f9744i.length == 0) {
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
        g0 g0Var = i0.f10286b;
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
