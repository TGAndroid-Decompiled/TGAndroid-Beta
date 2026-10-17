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
    public final x f8301a;
    public final l f8302b;
    public final boolean f8303c;
    public final u d;
    public int e;
    public q f8304f;
    public c f8305g;
    public long h;
    public e[] f8306i;
    public long f8307j;
    public e f8308k;
    public int f8309l;
    public long f8310m;
    public long f8311n;
    public int f8312o;
    public boolean f8313p;

    public b(int i10, u uVar) {
        this.d = uVar;
        this.f8303c = (i10 & 1) == 0;
        this.f8301a = new x(12);
        this.f8302b = new Object();
        this.f8304f = new pb.a(4);
        this.f8306i = new e[0];
        this.f8310m = -1L;
        this.f8311n = -1L;
        this.f8309l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean a(p pVar) {
        x xVar = this.f8301a;
        pVar.b(0, 12, xVar.f8293a);
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
        if (this.f8303c) {
            qVar = new c2.b(qVar, this.d);
        }
        this.f8304f = qVar;
        this.f8307j = -1L;
    }

    @Override
    public final void d(long j10, long j11) {
        e[] eVarArr;
        this.f8307j = -1L;
        this.f8308k = null;
        for (e eVar : this.f8306i) {
            if (eVar.f8328k == 0) {
                eVar.f8326i = 0;
            } else {
                eVar.f8326i = eVar.f8331n[m0.f(eVar.f8330m, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f8306i.length == 0) {
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
        l0 l0Var = n0.f8476b;
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
