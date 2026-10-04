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
    public final v f8599a;
    public final l f8600b;
    public final boolean f8601c;
    public final qb.b d;
    public int f8602e;
    public q f8603f;
    public c f8604g;
    public long h;
    public e[] f8605i;
    public long f8606j;
    public e f8607k;
    public int f8608l;
    public long f8609m;
    public long f8610n;
    public int f8611o;
    public boolean f8612p;

    public b(int i10, qb.b bVar) {
        this.d = bVar;
        this.f8601c = (i10 & 1) == 0;
        this.f8599a = new v(12);
        this.f8600b = new Object();
        this.f8603f = new ob.a(5);
        this.f8605i = new e[0];
        this.f8609m = -1L;
        this.f8610n = -1L;
        this.f8608l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean b(p pVar) {
        v vVar = this.f8599a;
        pVar.b(0, 12, vVar.f8589a);
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
        this.f8602e = 0;
        if (this.f8601c) {
            qVar = new m(qVar, this.d);
        }
        this.f8603f = qVar;
        this.f8606j = -1L;
    }

    @Override
    public final void h(long j3, long j10) {
        e[] eVarArr;
        this.f8606j = -1L;
        this.f8607k = null;
        for (e eVar : this.f8605i) {
            if (eVar.f8629k == 0) {
                eVar.f8627i = 0;
            } else {
                eVar.f8627i = eVar.f8632n[d0.e(eVar.f8631m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f8605i.length == 0) {
                this.f8602e = 0;
                return;
            } else {
                this.f8602e = 3;
                return;
            }
        }
        this.f8602e = 6;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8757b;
        return a1.f8720e;
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
