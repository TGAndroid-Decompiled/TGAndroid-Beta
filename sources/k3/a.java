package k3;

import b2.r;
import b2.r0;
import b2.s;
import c3.d0;
import c3.h0;
import c3.o;
import c3.p;
import c3.q;
import c3.t;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.List;
public final class a implements o {
    public final int f13389a = 0;
    public final Object f13390b;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f13390b = new d0(65496, 2, "image/jpeg");
        } else {
            this.f13390b = new b();
        }
    }

    @Override
    public final boolean a(p pVar) {
        switch (this.f13389a) {
            case 0:
                return ((o) this.f13390b).a(pVar);
            default:
                return true;
        }
    }

    @Override
    public final o c() {
        int i10 = this.f13389a;
        return this;
    }

    @Override
    public final void g(q qVar) {
        switch (this.f13389a) {
            case 0:
                ((o) this.f13390b).g(qVar);
                return;
            default:
                h0 Z1 = qVar.Z1(0, 3);
                qVar.X1(new t(-9223372036854775807L));
                qVar.e1();
                s sVar = (s) this.f13390b;
                r a2 = sVar.a();
                a2.f3245q = r0.n("text/x-unknown");
                a2.f3238j = sVar.f3301r;
                hg.c.u(a2, Z1);
                return;
        }
    }

    @Override
    public final void h(long j3, long j10) {
        switch (this.f13389a) {
            case 0:
                ((o) this.f13390b).h(j3, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final List i() {
        switch (this.f13389a) {
            case 0:
            default:
                g0 g0Var = i0.f8067b;
                return a1.e;
        }
    }

    @Override
    public final int m(p pVar, c3.s sVar) {
        switch (this.f13389a) {
            case 0:
                return ((o) this.f13390b).m(pVar, sVar);
            default:
                if (pVar.skip(Integer.MAX_VALUE) == -1) {
                    return -1;
                }
                return 0;
        }
    }

    @Override
    public final void release() {
        switch (this.f13389a) {
            case 0:
                ((o) this.f13390b).release();
                return;
            default:
                return;
        }
    }

    public a(s sVar) {
        this.f13390b = sVar;
    }

    private final void b() {
    }

    private final void d(long j3, long j10) {
    }
}
