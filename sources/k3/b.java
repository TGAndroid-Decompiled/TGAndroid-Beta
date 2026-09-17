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
    public q f14698b;
    public int f14699c;
    public int d;
    public int f14700e;
    public r3.a f14702g;
    public p h;
    public n f14703i;
    public k f14704j;
    public final v f14697a = new v(2);
    public long f14701f = -1;

    public final void a() {
        q qVar = this.f14698b;
        qVar.getClass();
        qVar.Z0();
        this.f14698b.P1(new t(-9223372036854775807L));
        this.f14699c = 6;
    }

    @Override
    public final boolean b(p pVar) {
        l lVar = (l) pVar;
        v vVar = this.f14697a;
        vVar.G(2);
        lVar.j(vVar.f8789a, 0, 2, false);
        if (vVar.D() == 65496) {
            vVar.G(2);
            lVar.j(vVar.f8789a, 0, 2, false);
            int D = vVar.D();
            this.d = D;
            if (D == 65504) {
                vVar.G(2);
                lVar.j(vVar.f8789a, 0, 2, false);
                lVar.v(vVar.D() - 2, false);
                vVar.G(2);
                lVar.j(vVar.f8789a, 0, 2, false);
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
        this.f14698b = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.f14699c = 0;
            this.f14704j = null;
        } else if (this.f14699c == 5) {
            k kVar = this.f14704j;
            kVar.getClass();
            kVar.h(j3, j10);
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8957b;
        return a1.f8920e;
    }

    @Override
    public final int m(c3.p r26, c3.s r27) {
        throw new UnsupportedOperationException("Method not decompiled: k3.b.m(c3.p, c3.s):int");
    }

    @Override
    public final void release() {
        k kVar = this.f14704j;
        if (kVar != null) {
            kVar.getClass();
        }
    }

    @Override
    public final o c() {
        return this;
    }
}
