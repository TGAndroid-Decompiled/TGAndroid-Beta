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
    public final x f13844a;
    public final b7.d f13845b;
    public final boolean f13846c;
    public final nb.a d;
    public int f13847e;
    public q f13848f;
    public c f13849g;
    public long h;
    public e[] f13850i;
    public long f13851j;
    public e f13852k;
    public int f13853l;
    public long f13854m;
    public long f13855n;
    public int f13856o;
    public boolean f13857p;

    public b(int i7, nb.a aVar) {
        this.d = aVar;
        this.f13846c = (i7 & 1) == 0;
        this.f13844a = new x(12);
        this.f13845b = new Object();
        this.f13848f = new sa.d(8);
        this.f13850i = new e[0];
        this.f13854m = -1L;
        this.f13855n = -1L;
        this.f13853l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean b(p pVar) {
        x xVar = this.f13844a;
        pVar.b(0, 12, xVar.f13836a);
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
        this.f13847e = 0;
        if (this.f13846c) {
            qVar = new ab.q(qVar, this.d);
        }
        this.f13848f = qVar;
        this.f13851j = -1L;
    }

    @Override
    public final void d(long j3, long j10) {
        e[] eVarArr;
        this.f13851j = -1L;
        this.f13852k = null;
        for (e eVar : this.f13850i) {
            if (eVar.f13874k == 0) {
                eVar.f13872i = 0;
            } else {
                eVar.f13872i = eVar.f13877n[l0.f(eVar.f13876m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f13850i.length == 0) {
                this.f13847e = 0;
                return;
            } else {
                this.f13847e = 3;
                return;
            }
        }
        this.f13847e = 6;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14006b;
        return t1.f14074e;
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
