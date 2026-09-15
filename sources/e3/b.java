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
    public final v f7939a;
    public final l f7940b;
    public final boolean f7941c;
    public final qb.b d;
    public int e;
    public q f7942f;
    public c f7943g;
    public long h;
    public e[] f7944i;
    public long f7945j;
    public e f7946k;
    public int f7947l;
    public long f7948m;
    public long f7949n;
    public int f7950o;
    public boolean f7951p;

    public b(int i10, qb.b bVar) {
        this.d = bVar;
        this.f7941c = (i10 & 1) == 0;
        this.f7939a = new v(12);
        this.f7940b = new Object();
        this.f7942f = new ob.a(5);
        this.f7944i = new e[0];
        this.f7948m = -1L;
        this.f7949n = -1L;
        this.f7947l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean a(p pVar) {
        v vVar = this.f7939a;
        pVar.a(0, 12, vVar.f7929a);
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
        this.e = 0;
        if (this.f7941c) {
            qVar = new m(qVar, this.d);
        }
        this.f7942f = qVar;
        this.f7945j = -1L;
    }

    @Override
    public final void h(long j3, long j10) {
        e[] eVarArr;
        this.f7945j = -1L;
        this.f7946k = null;
        for (e eVar : this.f7944i) {
            if (eVar.f7966k == 0) {
                eVar.f7964i = 0;
            } else {
                eVar.f7964i = eVar.f7969n[d0.e(eVar.f7968m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f7944i.length == 0) {
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
    public final List i() {
        g0 g0Var = i0.f8079b;
        return a1.e;
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
