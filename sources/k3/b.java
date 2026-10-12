package k3;

import c3.o;
import c3.p;
import c3.q;
import c3.t;
import e2.v;
import e6.n;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.List;
import w3.l;
public final class b implements o {
    public q f14585b;
    public int f14586c;
    public int d;
    public int f14587e;
    public r3.a f14589g;
    public p h;
    public n f14590i;
    public l f14591j;
    public final v f14584a = new v(2);
    public long f14588f = -1;

    public final void a() {
        q qVar = this.f14585b;
        qVar.getClass();
        qVar.k1();
        this.f14585b.d2(new t(-9223372036854775807L));
        this.f14586c = 6;
    }

    @Override
    public final boolean b(p pVar) {
        c3.l lVar = (c3.l) pVar;
        v vVar = this.f14584a;
        vVar.G(2);
        lVar.f(vVar.f8581a, 0, 2, false);
        if (vVar.D() == 65496) {
            vVar.G(2);
            lVar.f(vVar.f8581a, 0, 2, false);
            int D = vVar.D();
            this.d = D;
            if (D == 65504) {
                vVar.G(2);
                lVar.f(vVar.f8581a, 0, 2, false);
                lVar.s(vVar.D() - 2, false);
                vVar.G(2);
                lVar.f(vVar.f8581a, 0, 2, false);
                this.d = vVar.D();
            }
            if (this.d == 65505) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void g(q qVar) {
        this.f14585b = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.f14586c = 0;
            this.f14591j = null;
        } else if (this.f14586c == 5) {
            l lVar = this.f14591j;
            lVar.getClass();
            lVar.h(j3, j10);
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8749b;
        return a1.f8712e;
    }

    @Override
    public final int m(c3.p r26, c3.s r27) {
        throw new UnsupportedOperationException("Method not decompiled: k3.b.m(c3.p, c3.s):int");
    }

    @Override
    public final void release() {
        l lVar = this.f14591j;
        if (lVar != null) {
            lVar.getClass();
        }
    }

    @Override
    public final o c() {
        return this;
    }
}
