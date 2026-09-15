package k3;

import c3.l;
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
import w3.k;
public final class b implements o {
    public q f13402b;
    public int f13403c;
    public int d;
    public int e;
    public r3.a f13405g;
    public p h;
    public n f13406i;
    public k f13407j;
    public final v f13401a = new v(2);
    public long f13404f = -1;

    @Override
    public final boolean a(p pVar) {
        l lVar = (l) pVar;
        v vVar = this.f13401a;
        vVar.G(2);
        lVar.h(vVar.f7929a, 0, 2, false);
        if (vVar.D() == 65496) {
            vVar.G(2);
            lVar.h(vVar.f7929a, 0, 2, false);
            int D = vVar.D();
            this.d = D;
            if (D == 65504) {
                vVar.G(2);
                lVar.h(vVar.f7929a, 0, 2, false);
                lVar.s(vVar.D() - 2, false);
                vVar.G(2);
                lVar.h(vVar.f7929a, 0, 2, false);
                this.d = vVar.D();
            }
            if (this.d == 65505) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        q qVar = this.f13402b;
        qVar.getClass();
        qVar.e1();
        this.f13402b.X1(new t(-9223372036854775807L));
        this.f13403c = 6;
    }

    @Override
    public final void g(q qVar) {
        this.f13402b = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.f13403c = 0;
            this.f13407j = null;
        } else if (this.f13403c == 5) {
            k kVar = this.f13407j;
            kVar.getClass();
            kVar.h(j3, j10);
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8079b;
        return a1.e;
    }

    @Override
    public final int m(c3.p r26, c3.s r27) {
        throw new UnsupportedOperationException("Method not decompiled: k3.b.m(c3.p, c3.s):int");
    }

    @Override
    public final void release() {
        k kVar = this.f13407j;
        if (kVar != null) {
            kVar.getClass();
        }
    }

    @Override
    public final o c() {
        return this;
    }
}
