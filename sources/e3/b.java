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
    public final v f8827a;
    public final l f8828b;
    public final boolean f8829c;
    public final rb.a d;
    public int f8830e;
    public q f8831f;
    public c f8832g;
    public long h;
    public e[] f8833i;
    public long f8834j;
    public e f8835k;
    public int f8836l;
    public long f8837m;
    public long f8838n;
    public int f8839o;
    public boolean f8840p;

    public b(int i10, rb.a aVar) {
        this.d = aVar;
        this.f8829c = (i10 & 1) == 0;
        this.f8827a = new v(12);
        this.f8828b = new Object();
        this.f8831f = new qb.b(5);
        this.f8833i = new e[0];
        this.f8837m = -1L;
        this.f8838n = -1L;
        this.f8836l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean b(p pVar) {
        v vVar = this.f8827a;
        pVar.b(0, 12, vVar.f8817a);
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
        this.f8830e = 0;
        if (this.f8829c) {
            qVar = new m(qVar, this.d);
        }
        this.f8831f = qVar;
        this.f8834j = -1L;
    }

    @Override
    public final void h(long j3, long j10) {
        e[] eVarArr;
        this.f8834j = -1L;
        this.f8835k = null;
        for (e eVar : this.f8833i) {
            if (eVar.f8857k == 0) {
                eVar.f8855i = 0;
            } else {
                eVar.f8855i = eVar.f8860n[d0.e(eVar.f8859m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f8833i.length == 0) {
                this.f8830e = 0;
                return;
            } else {
                this.f8830e = 3;
                return;
            }
        }
        this.f8830e = 6;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8985b;
        return a1.f8948e;
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
