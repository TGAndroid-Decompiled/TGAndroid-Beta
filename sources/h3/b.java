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
    public final x f13841a;
    public final b7.d f13842b;
    public final boolean f13843c;
    public final nb.a d;
    public int f13844e;
    public q f13845f;
    public c f13846g;
    public long h;
    public e[] f13847i;
    public long f13848j;
    public e f13849k;
    public int f13850l;
    public long f13851m;
    public long f13852n;
    public int f13853o;
    public boolean f13854p;

    public b(int i7, nb.a aVar) {
        this.d = aVar;
        this.f13843c = (i7 & 1) == 0;
        this.f13841a = new x(12);
        this.f13842b = new Object();
        this.f13845f = new sa.d(8);
        this.f13847i = new e[0];
        this.f13851m = -1L;
        this.f13852n = -1L;
        this.f13850l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean b(p pVar) {
        x xVar = this.f13841a;
        pVar.b(0, 12, xVar.f13833a);
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
        this.f13844e = 0;
        if (this.f13843c) {
            qVar = new ab.q(qVar, this.d);
        }
        this.f13845f = qVar;
        this.f13848j = -1L;
    }

    @Override
    public final void d(long j3, long j10) {
        e[] eVarArr;
        this.f13848j = -1L;
        this.f13849k = null;
        for (e eVar : this.f13847i) {
            if (eVar.f13871k == 0) {
                eVar.f13869i = 0;
            } else {
                eVar.f13869i = eVar.f13874n[l0.f(eVar.f13873m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f13847i.length == 0) {
                this.f13844e = 0;
                return;
            } else {
                this.f13844e = 3;
                return;
            }
        }
        this.f13844e = 6;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14003b;
        return t1.f14071e;
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
