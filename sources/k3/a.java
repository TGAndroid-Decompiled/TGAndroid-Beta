package k3;

import b2.w;
import b2.w0;
import b2.x;
import c3.d0;
import c3.j0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.List;
public final class a implements o {
    public final int f16345a = 0;
    public final Object f16346b;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f16346b = new d0(65496, 2, "image/jpeg");
        } else {
            this.f16346b = new b();
        }
    }

    @Override
    public final boolean a(p pVar) {
        switch (this.f16345a) {
            case 0:
                return ((o) this.f16346b).a(pVar);
            default:
                return true;
        }
    }

    @Override
    public final o b() {
        int i10 = this.f16345a;
        return this;
    }

    @Override
    public final void c(q qVar) {
        switch (this.f16345a) {
            case 0:
                ((o) this.f16346b).c(qVar);
                return;
            default:
                j0 F1 = qVar.F1(0, 3);
                qVar.D1(new t(-9223372036854775807L));
                qVar.Q0();
                x xVar = (x) this.f16346b;
                w a2 = xVar.a();
                a2.f3533r = w0.n("text/x-unknown");
                a2.f3525j = xVar.f3586s;
                ic.a.u(a2, F1);
                return;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        switch (this.f16345a) {
            case 0:
                ((o) this.f16346b).d(j10, j11);
                return;
            default:
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f16345a) {
            case 0:
            default:
                g0 g0Var = i0.f10286b;
                return s1.e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f16345a) {
            case 0:
                return ((o) this.f16346b).f(pVar, sVar);
            default:
                if (pVar.skip(Integer.MAX_VALUE) == -1) {
                    return -1;
                }
                return 0;
        }
    }

    @Override
    public final void release() {
        switch (this.f16345a) {
            case 0:
                ((o) this.f16346b).release();
                return;
            default:
                return;
        }
    }

    public a(x xVar) {
        this.f16346b = xVar;
    }

    private final void g() {
    }

    private final void h(long j10, long j11) {
    }
}
