package k3;

import b2.v;
import b2.v0;
import b2.w;
import c3.e0;
import c3.j0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class a implements o {
    public final int f14866a = 0;
    public final Object f14867b;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f14867b = new e0(65496, 2, "image/jpeg");
        } else {
            this.f14867b = new b();
        }
    }

    @Override
    public final boolean a(p pVar) {
        switch (this.f14866a) {
            case 0:
                return ((o) this.f14867b).a(pVar);
            default:
                return true;
        }
    }

    @Override
    public final o b() {
        int i10 = this.f14866a;
        return this;
    }

    @Override
    public final void c(q qVar) {
        switch (this.f14866a) {
            case 0:
                ((o) this.f14867b).c(qVar);
                return;
            default:
                j0 j02 = qVar.j0(0, 3);
                qVar.g0(new t(-9223372036854775807L));
                qVar.H();
                w wVar = (w) this.f14867b;
                v a2 = wVar.a();
                a2.f4079r = v0.n("text/x-unknown");
                a2.f4071j = wVar.f4132s;
                i2.d.u(a2, j02);
                return;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        switch (this.f14866a) {
            case 0:
                ((o) this.f14867b).d(j10, j11);
                return;
            default:
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f14866a) {
            case 0:
            default:
                l0 l0Var = n0.f8477b;
                return x1.e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f14866a) {
            case 0:
                return ((o) this.f14867b).f(pVar, sVar);
            default:
                if (pVar.skip(Integer.MAX_VALUE) == -1) {
                    return -1;
                }
                return 0;
        }
    }

    @Override
    public final void release() {
        switch (this.f14866a) {
            case 0:
                ((o) this.f14867b).release();
                return;
            default:
                return;
        }
    }

    public a(w wVar) {
        this.f14867b = wVar;
    }

    private final void g() {
    }

    private final void h(long j10, long j11) {
    }
}
