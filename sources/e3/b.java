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
    public final v f8593a;
    public final l f8594b;
    public final boolean f8595c;
    public final ob.a d;
    public int f8596e;
    public q f8597f;
    public c f8598g;
    public long h;
    public e[] f8599i;
    public long f8600j;
    public e f8601k;
    public int f8602l;
    public long f8603m;
    public long f8604n;
    public int f8605o;
    public boolean f8606p;

    public b(int i10, ob.a aVar) {
        this.d = aVar;
        this.f8595c = (i10 & 1) == 0;
        this.f8593a = new v(12);
        this.f8594b = new Object();
        this.f8597f = new ob.a(5);
        this.f8599i = new e[0];
        this.f8603m = -1L;
        this.f8604n = -1L;
        this.f8602l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean a(p pVar) {
        v vVar = this.f8593a;
        pVar.a(0, 12, vVar.f8583a);
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
        this.f8596e = 0;
        if (this.f8595c) {
            qVar = new m(qVar, this.d);
        }
        this.f8597f = qVar;
        this.f8600j = -1L;
    }

    @Override
    public final void h(long j3, long j10) {
        e[] eVarArr;
        this.f8600j = -1L;
        this.f8601k = null;
        for (e eVar : this.f8599i) {
            if (eVar.f8623k == 0) {
                eVar.f8621i = 0;
            } else {
                eVar.f8621i = eVar.f8626n[d0.e(eVar.f8625m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f8599i.length == 0) {
                this.f8596e = 0;
                return;
            } else {
                this.f8596e = 3;
                return;
            }
        }
        this.f8596e = 6;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8751b;
        return a1.f8714e;
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
