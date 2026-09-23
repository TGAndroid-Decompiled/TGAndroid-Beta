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
    public final v f7927a;
    public final l f7928b;
    public final boolean f7929c;
    public final qb.b d;
    public int e;
    public q f7930f;
    public c f7931g;
    public long h;
    public e[] f7932i;
    public long f7933j;
    public e f7934k;
    public int f7935l;
    public long f7936m;
    public long f7937n;
    public int f7938o;
    public boolean f7939p;

    public b(int i10, qb.b bVar) {
        this.d = bVar;
        this.f7929c = (i10 & 1) == 0;
        this.f7927a = new v(12);
        this.f7928b = new Object();
        this.f7930f = new ob.a(5);
        this.f7932i = new e[0];
        this.f7936m = -1L;
        this.f7937n = -1L;
        this.f7935l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean a(p pVar) {
        v vVar = this.f7927a;
        pVar.a(0, 12, vVar.f7917a);
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
        if (this.f7929c) {
            qVar = new m(qVar, this.d);
        }
        this.f7930f = qVar;
        this.f7933j = -1L;
    }

    @Override
    public final void h(long j3, long j10) {
        e[] eVarArr;
        this.f7933j = -1L;
        this.f7934k = null;
        for (e eVar : this.f7932i) {
            if (eVar.f7954k == 0) {
                eVar.f7952i = 0;
            } else {
                eVar.f7952i = eVar.f7957n[d0.e(eVar.f7956m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f7932i.length == 0) {
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
        g0 g0Var = i0.f8067b;
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
