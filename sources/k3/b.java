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
    public q f14557b;
    public int f14558c;
    public int d;
    public int f14559e;
    public r3.a f14561g;
    public p h;
    public n f14562i;
    public k f14563j;
    public final v f14556a = new v(2);
    public long f14560f = -1;

    public final void a() {
        q qVar = this.f14557b;
        qVar.getClass();
        qVar.e1();
        this.f14557b.X1(new t(-9223372036854775807L));
        this.f14558c = 6;
    }

    @Override
    public final boolean b(p pVar) {
        l lVar = (l) pVar;
        v vVar = this.f14556a;
        vVar.G(2);
        lVar.f(vVar.f8590a, 0, 2, false);
        if (vVar.D() == 65496) {
            vVar.G(2);
            lVar.f(vVar.f8590a, 0, 2, false);
            int D = vVar.D();
            this.d = D;
            if (D == 65504) {
                vVar.G(2);
                lVar.f(vVar.f8590a, 0, 2, false);
                lVar.s(vVar.D() - 2, false);
                vVar.G(2);
                lVar.f(vVar.f8590a, 0, 2, false);
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
        this.f14557b = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.f14558c = 0;
            this.f14563j = null;
        } else if (this.f14558c == 5) {
            k kVar = this.f14563j;
            kVar.getClass();
            kVar.h(j3, j10);
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8758b;
        return a1.f8721e;
    }

    @Override
    public final int m(c3.p r26, c3.s r27) {
        throw new UnsupportedOperationException("Method not decompiled: k3.b.m(c3.p, c3.s):int");
    }

    @Override
    public final void release() {
        k kVar = this.f14563j;
        if (kVar != null) {
            kVar.getClass();
        }
    }

    @Override
    public final o c() {
        return this;
    }
}
