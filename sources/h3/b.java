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
    public final x f14170a;
    public final b7.d f14171b;
    public final boolean f14172c;
    public final s d;
    public int f14173e;
    public q f14174f;
    public c f14175g;
    public long h;
    public e[] f14176i;
    public long f14177j;
    public e f14178k;
    public int f14179l;
    public long f14180m;
    public long f14181n;
    public int f14182o;
    public boolean f14183p;

    public b(int i7, s sVar) {
        this.d = sVar;
        this.f14172c = (i7 & 1) == 0;
        this.f14170a = new x(12);
        this.f14171b = new Object();
        this.f14174f = new qb.a(8);
        this.f14176i = new e[0];
        this.f14180m = -1L;
        this.f14181n = -1L;
        this.f14179l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean b(p pVar) {
        x xVar = this.f14170a;
        pVar.b(0, 12, xVar.f14162a);
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
        this.f14173e = 0;
        if (this.f14172c) {
            qVar = new ab.q(qVar, this.d);
        }
        this.f14174f = qVar;
        this.f14177j = -1L;
    }

    @Override
    public final void d(long j3, long j10) {
        e[] eVarArr;
        this.f14177j = -1L;
        this.f14178k = null;
        for (e eVar : this.f14176i) {
            if (eVar.f14200k == 0) {
                eVar.f14198i = 0;
            } else {
                eVar.f14198i = eVar.f14203n[m0.f(eVar.f14202m, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f14176i.length == 0) {
                this.f14173e = 0;
                return;
            } else {
                this.f14173e = 3;
                return;
            }
        }
        this.f14173e = 6;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14329b;
        return t1.f14397e;
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
