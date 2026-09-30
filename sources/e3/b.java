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
    public final v f7938a;
    public final l f7939b;
    public final boolean f7940c;
    public final qb.b d;
    public int e;
    public q f7941f;
    public c f7942g;
    public long h;
    public e[] f7943i;
    public long f7944j;
    public e f7945k;
    public int f7946l;
    public long f7947m;
    public long f7948n;
    public int f7949o;
    public boolean f7950p;

    public b(int i10, qb.b bVar) {
        this.d = bVar;
        this.f7940c = (i10 & 1) == 0;
        this.f7938a = new v(12);
        this.f7939b = new Object();
        this.f7941f = new ob.a(5);
        this.f7943i = new e[0];
        this.f7947m = -1L;
        this.f7948n = -1L;
        this.f7946l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean a(p pVar) {
        v vVar = this.f7938a;
        pVar.a(0, 12, vVar.f7928a);
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
        if (this.f7940c) {
            qVar = new m(qVar, this.d);
        }
        this.f7941f = qVar;
        this.f7944j = -1L;
    }

    @Override
    public final void h(long j3, long j10) {
        e[] eVarArr;
        this.f7944j = -1L;
        this.f7945k = null;
        for (e eVar : this.f7943i) {
            if (eVar.f7965k == 0) {
                eVar.f7963i = 0;
            } else {
                eVar.f7963i = eVar.f7968n[d0.e(eVar.f7967m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f7943i.length == 0) {
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
        g0 g0Var = i0.f8078b;
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
