package h3;

import f3.o;
import f3.p;
import f3.q;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.List;
import w7.s;
public final class b implements o {
    public final x f14172a;
    public final b7.d f14173b;
    public final boolean f14174c;
    public final s d;
    public int f14175e;
    public q f14176f;
    public c f14177g;
    public long h;
    public e[] f14178i;
    public long f14179j;
    public e f14180k;
    public int f14181l;
    public long f14182m;
    public long f14183n;
    public int f14184o;
    public boolean f14185p;

    public b(int i7, s sVar) {
        this.d = sVar;
        this.f14174c = (i7 & 1) == 0;
        this.f14172a = new x(12);
        this.f14173b = new Object();
        this.f14176f = new qb.a(8);
        this.f14178i = new e[0];
        this.f14182m = -1L;
        this.f14183n = -1L;
        this.f14181l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean b(p pVar) {
        x xVar = this.f14172a;
        pVar.b(0, 12, xVar.f14164a);
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
        this.f14175e = 0;
        if (this.f14174c) {
            qVar = new ab.q(qVar, this.d);
        }
        this.f14176f = qVar;
        this.f14179j = -1L;
    }

    @Override
    public final void d(long j3, long j10) {
        e[] eVarArr;
        this.f14179j = -1L;
        this.f14180k = null;
        for (e eVar : this.f14178i) {
            if (eVar.f14202k == 0) {
                eVar.f14200i = 0;
            } else {
                eVar.f14200i = eVar.f14205n[m0.f(eVar.f14204m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f14178i.length == 0) {
                this.f14175e = 0;
                return;
            } else {
                this.f14175e = 3;
                return;
            }
        }
        this.f14175e = 6;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14331b;
        return t1.f14399e;
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
