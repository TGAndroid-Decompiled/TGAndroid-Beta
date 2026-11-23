package n3;

import e2.s0;
import e2.u;
import f3.e0;
import f3.j0;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import f3.t;
import h9.g0;
import h9.i0;
import h9.s1;
import java.util.List;
public final class a implements o {
    public final int f21388a = 0;
    public final Object f21389b;

    public a(int i7) {
        if ((i7 & 1) != 0) {
            this.f21389b = new e0(65496, 2, "image/jpeg");
        } else {
            this.f21389b = new b();
        }
    }

    @Override
    public final o a() {
        int i7 = this.f21388a;
        return this;
    }

    @Override
    public final boolean b(p pVar) {
        switch (this.f21388a) {
            case 0:
                return ((o) this.f21389b).b(pVar);
            default:
                return true;
        }
    }

    @Override
    public final void c(q qVar) {
        switch (this.f21388a) {
            case 0:
                ((o) this.f21389b).c(qVar);
                return;
            default:
                j0 d2 = qVar.d2(0, 3);
                qVar.h(new t(-9223372036854775807L));
                qVar.Z0();
                u uVar = (u) this.f21389b;
                e2.t a10 = uVar.a();
                a10.f10707r = s0.n("text/x-unknown");
                a10.f10699j = uVar.f10759s;
                p5.c.r(a10, d2);
                return;
        }
    }

    @Override
    public final void d(long j3, long j10) {
        switch (this.f21388a) {
            case 0:
                ((o) this.f21389b).d(j3, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f21388a) {
            case 0:
            default:
                g0 g0Var = i0.f13995b;
                return s1.f14058e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f21388a) {
            case 0:
                return ((o) this.f21389b).f(pVar, sVar);
            default:
                if (pVar.skip(Integer.MAX_VALUE) == -1) {
                    return -1;
                }
                return 0;
        }
    }

    @Override
    public final void release() {
        switch (this.f21388a) {
            case 0:
                ((o) this.f21389b).release();
                return;
            default:
                return;
        }
    }

    public a(u uVar) {
        this.f21389b = uVar;
    }

    private final void g() {
    }

    private final void h(long j3, long j10) {
    }
}
