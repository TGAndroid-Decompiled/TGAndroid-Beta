package h3;

import f3.o;
import f3.p;
import f3.q;
import h2.l0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.List;
public final class b implements o {
    public final x f13870a;
    public final b7.d f13871b;
    public final boolean f13872c;
    public final nb.a d;
    public int f13873e;
    public q f13874f;
    public c f13875g;
    public long h;
    public e[] f13876i;
    public long f13877j;
    public e f13878k;
    public int f13879l;
    public long f13880m;
    public long f13881n;
    public int f13882o;
    public boolean f13883p;

    public b(int i7, nb.a aVar) {
        this.d = aVar;
        this.f13872c = (i7 & 1) == 0;
        this.f13870a = new x(12);
        this.f13871b = new Object();
        this.f13874f = new sa.d(8);
        this.f13876i = new e[0];
        this.f13880m = -1L;
        this.f13881n = -1L;
        this.f13879l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean b(p pVar) {
        x xVar = this.f13870a;
        pVar.b(0, 12, xVar.f13862a);
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
        this.f13873e = 0;
        if (this.f13872c) {
            qVar = new ab.q(qVar, this.d);
        }
        this.f13874f = qVar;
        this.f13877j = -1L;
    }

    @Override
    public final void d(long j3, long j10) {
        e[] eVarArr;
        this.f13877j = -1L;
        this.f13878k = null;
        for (e eVar : this.f13876i) {
            if (eVar.f13900k == 0) {
                eVar.f13898i = 0;
            } else {
                eVar.f13898i = eVar.f13903n[l0.f(eVar.f13902m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f13876i.length == 0) {
                this.f13873e = 0;
                return;
            } else {
                this.f13873e = 3;
                return;
            }
        }
        this.f13873e = 6;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14032b;
        return t1.f14100e;
    }

    @Override
    public final int f(f3.p r24, f3.s r25) {
        throw new UnsupportedOperationException("Method not decompiled: h3.b.f(f3.p, f3.s):int");
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
