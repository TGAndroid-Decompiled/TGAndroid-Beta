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
import h9.t1;
import java.util.List;
import org.telegram.ui.Cells.f1;
public final class a implements o {
    public final int f20367a = 0;
    public final Object f20368b;

    public a(int i7) {
        if ((i7 & 1) != 0) {
            this.f20368b = new e0(65496, 2, "image/jpeg");
        } else {
            this.f20368b = new b();
        }
    }

    @Override
    public final o a() {
        int i7 = this.f20367a;
        return this;
    }

    @Override
    public final boolean b(p pVar) {
        switch (this.f20367a) {
            case 0:
                return ((o) this.f20368b).b(pVar);
            default:
                return true;
        }
    }

    @Override
    public final void c(q qVar) {
        switch (this.f20367a) {
            case 0:
                ((o) this.f20368b).c(qVar);
                return;
            default:
                j0 O1 = qVar.O1(0, 3);
                qVar.f(new t(-9223372036854775807L));
                qVar.U0();
                u uVar = (u) this.f20368b;
                e2.t a10 = uVar.a();
                a10.f10568r = s0.n("text/x-unknown");
                a10.f10560j = uVar.f10620s;
                f1.s(a10, O1);
                return;
        }
    }

    @Override
    public final void d(long j3, long j10) {
        switch (this.f20367a) {
            case 0:
                ((o) this.f20368b).d(j3, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f20367a) {
            case 0:
            default:
                g0 g0Var = i0.f14331b;
                return t1.f14399e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f20367a) {
            case 0:
                return ((o) this.f20368b).f(pVar, sVar);
            default:
                if (pVar.skip(Integer.MAX_VALUE) == -1) {
                    return -1;
                }
                return 0;
        }
    }

    @Override
    public final void release() {
        switch (this.f20367a) {
            case 0:
                ((o) this.f20368b).release();
                return;
            default:
                return;
        }
    }

    public a(u uVar) {
        this.f20368b = uVar;
    }

    private final void g() {
    }

    private final void h(long j3, long j10) {
    }
}
