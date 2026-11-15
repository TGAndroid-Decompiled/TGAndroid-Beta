package h3;

import f3.o;
import f3.p;
import f3.q;
import h2.l0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.s1;
import java.util.List;
public final class b implements o {
    public final x f13529a;
    public final b7.d f13530b;
    public final boolean f13531c;
    public final nb.a d;
    public int f13532e;
    public q f13533f;
    public c f13534g;
    public long h;
    public e[] f13535i;
    public long f13536j;
    public e f13537k;
    public int f13538l;
    public long f13539m;
    public long f13540n;
    public int f13541o;
    public boolean f13542p;

    public b(int i7, nb.a aVar) {
        this.d = aVar;
        this.f13531c = (i7 & 1) == 0;
        this.f13529a = new x(12);
        this.f13530b = new Object();
        this.f13533f = new sa.d(8);
        this.f13535i = new e[0];
        this.f13539m = -1L;
        this.f13540n = -1L;
        this.f13538l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean b(p pVar) {
        x xVar = this.f13529a;
        pVar.c(0, 12, xVar.f13521a);
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
        this.f13532e = 0;
        if (this.f13531c) {
            qVar = new ab.q(qVar, this.d);
        }
        this.f13533f = qVar;
        this.f13536j = -1L;
    }

    @Override
    public final void d(long j3, long j10) {
        e[] eVarArr;
        this.f13536j = -1L;
        this.f13537k = null;
        for (e eVar : this.f13535i) {
            if (eVar.f13559k == 0) {
                eVar.f13557i = 0;
            } else {
                eVar.f13557i = eVar.f13562n[l0.f(eVar.f13561m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f13535i.length == 0) {
                this.f13532e = 0;
                return;
            } else {
                this.f13532e = 3;
                return;
            }
        }
        this.f13532e = 6;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f13686b;
        return s1.f13749e;
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
