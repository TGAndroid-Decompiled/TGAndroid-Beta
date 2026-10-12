package e3;

import a3.l;
import c3.o;
import c3.p;
import c3.q;
import com.google.firebase.messaging.m;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.List;
public final class b implements o {
    public final v f8591a;
    public final l f8592b;
    public final boolean f8593c;
    public final qb.b d;
    public int f8594e;
    public q f8595f;
    public c f8596g;
    public long h;
    public e[] f8597i;
    public long f8598j;
    public e f8599k;
    public int f8600l;
    public long f8601m;
    public long f8602n;
    public int f8603o;
    public boolean f8604p;

    public b(int i10, qb.b bVar) {
        this.d = bVar;
        this.f8593c = (i10 & 1) == 0;
        this.f8591a = new v(12);
        this.f8592b = new Object();
        this.f8595f = new ob.a(5);
        this.f8597i = new e[0];
        this.f8601m = -1L;
        this.f8602n = -1L;
        this.f8600l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean b(p pVar) {
        v vVar = this.f8591a;
        pVar.b(0, 12, vVar.f8581a);
        vVar.J(0);
        if (vVar.l() == 1179011410) {
            vVar.K(4);
            if (vVar.l() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void g(q qVar) {
        this.f8594e = 0;
        if (this.f8593c) {
            qVar = new m(qVar, this.d);
        }
        this.f8595f = qVar;
        this.f8598j = -1L;
    }

    @Override
    public final void h(long j3, long j10) {
        e[] eVarArr;
        this.f8598j = -1L;
        this.f8599k = null;
        for (e eVar : this.f8597i) {
            if (eVar.f8621k == 0) {
                eVar.f8619i = 0;
            } else {
                eVar.f8619i = eVar.f8624n[d0.e(eVar.f8623m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f8597i.length == 0) {
                this.f8594e = 0;
                return;
            } else {
                this.f8594e = 3;
                return;
            }
        }
        this.f8594e = 6;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8749b;
        return a1.f8712e;
    }

    @Override
    public final int m(c3.p r24, c3.s r25) {
        throw new UnsupportedOperationException("Method not decompiled: e3.b.m(c3.p, c3.s):int");
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
