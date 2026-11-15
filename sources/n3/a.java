package n3;

import e2.s0;
import e2.u;
import f3.d0;
import f3.i0;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import f3.t;
import h9.g0;
import h9.s1;
import java.util.List;
public final class a implements o {
    public final int f20931a = 0;
    public final Object f20932b;

    public a(int i7) {
        if ((i7 & 1) != 0) {
            this.f20932b = new d0(65496, 2, "image/jpeg");
        } else {
            this.f20932b = new b();
        }
    }

    @Override
    public final o a() {
        int i7 = this.f20931a;
        return this;
    }

    @Override
    public final boolean b(p pVar) {
        switch (this.f20931a) {
            case 0:
                return ((o) this.f20932b).b(pVar);
            default:
                return true;
        }
    }

    @Override
    public final void c(q qVar) {
        switch (this.f20931a) {
            case 0:
                ((o) this.f20932b).c(qVar);
                return;
            default:
                i0 d2 = qVar.d2(0, 3);
                qVar.f(new t(-9223372036854775807L));
                qVar.d1();
                u uVar = (u) this.f20932b;
                e2.t a10 = uVar.a();
                a10.f10399r = s0.n("text/x-unknown");
                a10.f10391j = uVar.f10451s;
                r.b.s(a10, d2);
                return;
        }
    }

    @Override
    public final void d(long j3, long j10) {
        switch (this.f20931a) {
            case 0:
                ((o) this.f20932b).d(j3, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f20931a) {
            case 0:
            default:
                g0 g0Var = h9.i0.f13686b;
                return s1.f13749e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f20931a) {
            case 0:
                return ((o) this.f20932b).f(pVar, sVar);
            default:
                if (pVar.skip(Integer.MAX_VALUE) == -1) {
                    return -1;
                }
                return 0;
        }
    }

    @Override
    public final void release() {
        switch (this.f20931a) {
            case 0:
                ((o) this.f20932b).release();
                return;
            default:
                return;
        }
    }

    public a(u uVar) {
        this.f20932b = uVar;
    }

    private final void g() {
    }

    private final void h(long j3, long j10) {
    }
}
