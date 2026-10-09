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
import w3.m;
public final class b implements o {
    public q f14589b;
    public int f14590c;
    public int d;
    public int f14591e;
    public r3.a f14593g;
    public p h;
    public n f14594i;
    public m f14595j;
    public final v f14588a = new v(2);
    public long f14592f = -1;

    @Override
    public final boolean a(p pVar) {
        l lVar = (l) pVar;
        v vVar = this.f14588a;
        vVar.G(2);
        lVar.h(vVar.f8584a, 0, 2, false);
        if (vVar.D() == 65496) {
            vVar.G(2);
            lVar.h(vVar.f8584a, 0, 2, false);
            int D = vVar.D();
            this.d = D;
            if (D == 65504) {
                vVar.G(2);
                lVar.h(vVar.f8584a, 0, 2, false);
                lVar.v(vVar.D() - 2, false);
                vVar.G(2);
                lVar.h(vVar.f8584a, 0, 2, false);
                this.d = vVar.D();
            }
            if (this.d == 65505) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        q qVar = this.f14589b;
        qVar.getClass();
        qVar.k1();
        this.f14589b.d2(new t(-9223372036854775807L));
        this.f14590c = 6;
    }

    @Override
    public final void g(q qVar) {
        this.f14589b = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.f14590c = 0;
            this.f14595j = null;
        } else if (this.f14590c == 5) {
            m mVar = this.f14595j;
            mVar.getClass();
            mVar.h(j3, j10);
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8752b;
        return a1.f8715e;
    }

    @Override
    public final int m(c3.p r26, c3.s r27) {
        throw new UnsupportedOperationException("Method not decompiled: k3.b.m(c3.p, c3.s):int");
    }

    @Override
    public final void release() {
        m mVar = this.f14595j;
        if (mVar != null) {
            mVar.getClass();
        }
    }

    @Override
    public final o c() {
        return this;
    }
}
