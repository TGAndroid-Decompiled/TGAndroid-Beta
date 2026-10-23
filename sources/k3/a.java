package k3;

import b2.v0;
import b2.w;
import c3.g0;
import c3.l0;
import c3.q;
import c3.r;
import c3.s;
import c3.u;
import c3.v;
import e9.n0;
import e9.x1;
import i2.o1;
import java.util.List;
public final class a implements q {
    public final int f14911a = 0;
    public final Object f14912b;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f14912b = new g0(65496, 2, "image/jpeg");
        } else {
            this.f14912b = new b();
        }
    }

    @Override
    public final boolean a(r rVar) {
        switch (this.f14911a) {
            case 0:
                return ((q) this.f14912b).a(rVar);
            default:
                return true;
        }
    }

    @Override
    public final q b() {
        int i10 = this.f14911a;
        return this;
    }

    @Override
    public final void c(s sVar) {
        switch (this.f14911a) {
            case 0:
                ((q) this.f14912b).c(sVar);
                return;
            default:
                l0 j02 = sVar.j0(0, 3);
                sVar.g0(new v(-9223372036854775807L));
                sVar.C();
                w wVar = (w) this.f14912b;
                b2.v a2 = wVar.a();
                a2.f4082r = v0.n("text/x-unknown");
                a2.f4074j = wVar.f4135s;
                o1.v(a2, j02);
                return;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        switch (this.f14911a) {
            case 0:
                ((q) this.f14912b).d(j10, j11);
                return;
            default:
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f14911a) {
            case 0:
            default:
                e9.l0 l0Var = n0.f8481b;
                return x1.e;
        }
    }

    @Override
    public final int f(r rVar, u uVar) {
        switch (this.f14911a) {
            case 0:
                return ((q) this.f14912b).f(rVar, uVar);
            default:
                if (rVar.skip(Integer.MAX_VALUE) == -1) {
                    return -1;
                }
                return 0;
        }
    }

    @Override
    public final void release() {
        switch (this.f14911a) {
            case 0:
                ((q) this.f14912b).release();
                return;
            default:
                return;
        }
    }

    public a(w wVar) {
        this.f14912b = wVar;
    }

    private final void g() {
    }

    private final void h(long j10, long j11) {
    }
}
