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
    public final v f7244a;
    public final l f7245b;
    public final boolean f7246c;
    public final rb.a d;
    public int e;
    public q f7247f;
    public c f7248g;
    public long h;
    public e[] f7249i;
    public long f7250j;
    public e f7251k;
    public int f7252l;
    public long f7253m;
    public long f7254n;
    public int f7255o;
    public boolean f7256p;

    public b(int i10, rb.a aVar) {
        this.d = aVar;
        this.f7246c = (i10 & 1) == 0;
        this.f7244a = new v(12);
        this.f7245b = new Object();
        this.f7247f = new na.d(6);
        this.f7249i = new e[0];
        this.f7253m = -1L;
        this.f7254n = -1L;
        this.f7252l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean b(p pVar) {
        v vVar = this.f7244a;
        pVar.b(0, 12, vVar.f7234a);
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
        if (this.f7246c) {
            qVar = new m(qVar, this.d);
        }
        this.f7247f = qVar;
        this.f7250j = -1L;
    }

    @Override
    public final void h(long j3, long j10) {
        e[] eVarArr;
        this.f7250j = -1L;
        this.f7251k = null;
        for (e eVar : this.f7249i) {
            if (eVar.f7271k == 0) {
                eVar.f7269i = 0;
            } else {
                eVar.f7269i = eVar.f7274n[d0.e(eVar.f7273m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f7249i.length == 0) {
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
        g0 g0Var = i0.f7384b;
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
