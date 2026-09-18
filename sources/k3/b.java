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
    public q f13403b;
    public int f13404c;
    public int d;
    public int e;
    public r3.a f13406g;
    public p h;
    public n f13407i;
    public l f13408j;
    public final v f13402a = new v(2);
    public long f13405f = -1;

    @Override
    public final boolean a(p pVar) {
        c3.l lVar = (c3.l) pVar;
        v vVar = this.f13402a;
        vVar.G(2);
        lVar.h(vVar.f7933a, 0, 2, false);
        if (vVar.D() == 65496) {
            vVar.G(2);
            lVar.h(vVar.f7933a, 0, 2, false);
            int D = vVar.D();
            this.d = D;
            if (D == 65504) {
                vVar.G(2);
                lVar.h(vVar.f7933a, 0, 2, false);
                lVar.t(vVar.D() - 2, false);
                vVar.G(2);
                lVar.h(vVar.f7933a, 0, 2, false);
                this.d = vVar.D();
            }
            if (this.d == 65505) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        q qVar = this.f13403b;
        qVar.getClass();
        qVar.e1();
        this.f13403b.X1(new t(-9223372036854775807L));
        this.f13404c = 6;
    }

    @Override
    public final void g(q qVar) {
        this.f13403b = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.f13404c = 0;
            this.f13408j = null;
        } else if (this.f13404c == 5) {
            l lVar = this.f13408j;
            lVar.getClass();
            lVar.h(j3, j10);
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8083b;
        return a1.e;
    }

    @Override
    public final int m(c3.p r26, c3.s r27) {
        throw new UnsupportedOperationException("Method not decompiled: k3.b.m(c3.p, c3.s):int");
    }

    @Override
    public final void release() {
        l lVar = this.f13408j;
        if (lVar != null) {
            lVar.getClass();
        }
    }

    @Override
    public final o c() {
        return this;
    }
}
