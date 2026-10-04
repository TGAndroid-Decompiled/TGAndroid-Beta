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
    public final v f8600a;
    public final l f8601b;
    public final boolean f8602c;
    public final qb.b d;
    public int f8603e;
    public q f8604f;
    public c f8605g;
    public long h;
    public e[] f8606i;
    public long f8607j;
    public e f8608k;
    public int f8609l;
    public long f8610m;
    public long f8611n;
    public int f8612o;
    public boolean f8613p;

    public b(int i10, qb.b bVar) {
        this.d = bVar;
        this.f8602c = (i10 & 1) == 0;
        this.f8600a = new v(12);
        this.f8601b = new Object();
        this.f8604f = new ob.a(5);
        this.f8606i = new e[0];
        this.f8610m = -1L;
        this.f8611n = -1L;
        this.f8609l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean b(p pVar) {
        v vVar = this.f8600a;
        pVar.b(0, 12, vVar.f8590a);
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
        this.f8603e = 0;
        if (this.f8602c) {
            qVar = new m(qVar, this.d);
        }
        this.f8604f = qVar;
        this.f8607j = -1L;
    }

    @Override
    public final void h(long j3, long j10) {
        e[] eVarArr;
        this.f8607j = -1L;
        this.f8608k = null;
        for (e eVar : this.f8606i) {
            if (eVar.f8630k == 0) {
                eVar.f8628i = 0;
            } else {
                eVar.f8628i = eVar.f8633n[d0.e(eVar.f8632m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f8606i.length == 0) {
                this.f8603e = 0;
                return;
            } else {
                this.f8603e = 3;
                return;
            }
        }
        this.f8603e = 6;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8758b;
        return a1.f8721e;
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
