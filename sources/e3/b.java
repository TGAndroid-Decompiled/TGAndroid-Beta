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
    public final v f8594a;
    public final l f8595b;
    public final boolean f8596c;
    public final ob.a d;
    public int f8597e;
    public q f8598f;
    public c f8599g;
    public long h;
    public e[] f8600i;
    public long f8601j;
    public e f8602k;
    public int f8603l;
    public long f8604m;
    public long f8605n;
    public int f8606o;
    public boolean f8607p;

    public b(int i10, ob.a aVar) {
        this.d = aVar;
        this.f8596c = (i10 & 1) == 0;
        this.f8594a = new v(12);
        this.f8595b = new Object();
        this.f8598f = new ob.a(5);
        this.f8600i = new e[0];
        this.f8604m = -1L;
        this.f8605n = -1L;
        this.f8603l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean a(p pVar) {
        v vVar = this.f8594a;
        pVar.a(0, 12, vVar.f8584a);
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
        this.f8597e = 0;
        if (this.f8596c) {
            qVar = new m(qVar, this.d);
        }
        this.f8598f = qVar;
        this.f8601j = -1L;
    }

    @Override
    public final void h(long j3, long j10) {
        e[] eVarArr;
        this.f8601j = -1L;
        this.f8602k = null;
        for (e eVar : this.f8600i) {
            if (eVar.f8624k == 0) {
                eVar.f8622i = 0;
            } else {
                eVar.f8622i = eVar.f8627n[d0.e(eVar.f8626m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f8600i.length == 0) {
                this.f8597e = 0;
                return;
            } else {
                this.f8597e = 3;
                return;
            }
        }
        this.f8597e = 6;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8752b;
        return a1.f8715e;
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
