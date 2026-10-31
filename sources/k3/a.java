package k3;

import b2.v0;
import b2.w;
import b2.x;
import c3.d0;
import c3.k0;
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
    public final int f10828a = 0;
    public final Object f10829b;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f10829b = new d0(65496, 2, "image/jpeg");
        } else {
            this.f10829b = new b();
        }
    }

    @Override
    public final boolean a(p pVar) {
        switch (this.f10828a) {
            case 0:
                return ((o) this.f10829b).a(pVar);
            default:
                return true;
        }
    }

    @Override
    public final o b() {
        int i10 = this.f10828a;
        return this;
    }

    @Override
    public final void c(q qVar) {
        switch (this.f10828a) {
            case 0:
                ((o) this.f10829b).c(qVar);
                return;
            default:
                k0 I1 = qVar.I1(0, 3);
                qVar.G1(new t(-9223372036854775807L));
                qVar.Q0();
                x xVar = (x) this.f10829b;
                w a2 = xVar.a();
                a2.f2370r = v0.n("text/x-unknown");
                a2.f2362j = xVar.f2423s;
                i0.a.r(a2, I1);
                return;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        switch (this.f10828a) {
            case 0:
                ((o) this.f10829b).d(j10, j11);
                return;
            default:
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f10828a) {
            case 0:
            default:
                l0 l0Var = n0.f6390b;
                return x1.e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f10828a) {
            case 0:
                return ((o) this.f10829b).f(pVar, sVar);
            default:
                if (pVar.skip(Integer.MAX_VALUE) == -1) {
                    return -1;
                }
                return 0;
        }
    }

    @Override
    public final void release() {
        switch (this.f10828a) {
            case 0:
                ((o) this.f10829b).release();
                return;
            default:
                return;
        }
    }

    public a(x xVar) {
        this.f10829b = xVar;
    }

    private final void g() {
    }

    private final void h(long j10, long j11) {
    }
}
