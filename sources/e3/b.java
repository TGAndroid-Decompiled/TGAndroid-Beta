package e3;

import a3.l;
import c3.o;
import c3.p;
import c3.q;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
import t7.u;
public final class b implements o {
    public final x f8422a;
    public final l f8423b;
    public final boolean f8424c;
    public final u d;
    public int e;
    public q f8425f;
    public c f8426g;
    public long h;
    public e[] f8427i;
    public long f8428j;
    public e f8429k;
    public int f8430l;
    public long f8431m;
    public long f8432n;
    public int f8433o;
    public boolean f8434p;

    public b(int i10, u uVar) {
        this.d = uVar;
        this.f8424c = (i10 & 1) == 0;
        this.f8422a = new x(12);
        this.f8423b = new Object();
        this.f8425f = new pb.a(4);
        this.f8427i = new e[0];
        this.f8431m = -1L;
        this.f8432n = -1L;
        this.f8430l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean a(p pVar) {
        x xVar = this.f8422a;
        pVar.b(0, 12, xVar.f8414a);
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
        if (this.f8424c) {
            qVar = new c2.b(qVar, this.d);
        }
        this.f8425f = qVar;
        this.f8428j = -1L;
    }

    @Override
    public final void d(long j10, long j11) {
        e[] eVarArr;
        this.f8428j = -1L;
        this.f8429k = null;
        for (e eVar : this.f8427i) {
            if (eVar.f8449k == 0) {
                eVar.f8447i = 0;
            } else {
                eVar.f8447i = eVar.f8452n[m0.f(eVar.f8451m, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f8427i.length == 0) {
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
        l0 l0Var = n0.f8595b;
        return x1.e;
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
