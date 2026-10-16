package k3;

import b2.w;
import b2.w0;
import b2.x;
import c3.d0;
import c3.i0;
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
    public final int f14064a = 0;
    public final Object f14065b;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f14065b = new d0(65496, 2, "image/jpeg");
        } else {
            this.f14065b = new b();
        }
    }

    @Override
    public final boolean a(p pVar) {
        switch (this.f14064a) {
            case 0:
                return ((o) this.f14065b).a(pVar);
            default:
                return true;
        }
    }

    @Override
    public final o b() {
        int i10 = this.f14064a;
        return this;
    }

    @Override
    public final void c(q qVar) {
        switch (this.f14064a) {
            case 0:
                ((o) this.f14065b).c(qVar);
                return;
            default:
                i0 W = qVar.W(0, 3);
                qVar.K(new t(-9223372036854775807L));
                qVar.D();
                x xVar = (x) this.f14065b;
                w a2 = xVar.a();
                a2.f2470r = w0.n("text/x-unknown");
                a2.f2462j = xVar.f2523s;
                i2.d.u(a2, W);
                return;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        switch (this.f14064a) {
            case 0:
                ((o) this.f14065b).d(j10, j11);
                return;
            default:
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f14064a) {
            case 0:
            default:
                l0 l0Var = n0.f8595b;
                return x1.e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f14064a) {
            case 0:
                return ((o) this.f14065b).f(pVar, sVar);
            default:
                if (pVar.skip(Integer.MAX_VALUE) == -1) {
                    return -1;
                }
                return 0;
        }
    }

    @Override
    public final void release() {
        switch (this.f14064a) {
            case 0:
                ((o) this.f14065b).release();
                return;
            default:
                return;
        }
    }

    public a(x xVar) {
        this.f14065b = xVar;
    }

    private final void g() {
    }

    private final void h(long j10, long j11) {
    }
}
