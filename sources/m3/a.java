package m3;

import d2.u;
import d2.u0;
import d2.v;
import e3.d0;
import e3.i0;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import e3.t;
import g9.g0;
import g9.s1;
import java.util.List;
import org.telegram.ui.Cells.f1;
public final class a implements o {
    public final int f19050a = 0;
    public final Object f19051b;

    public a(int i3) {
        if ((i3 & 1) != 0) {
            this.f19051b = new d0(65496, 2, "image/jpeg");
        } else {
            this.f19051b = new b();
        }
    }

    @Override
    public final o a() {
        int i3 = this.f19050a;
        return this;
    }

    @Override
    public final boolean b(p pVar) {
        switch (this.f19050a) {
            case 0:
                return ((o) this.f19051b).b(pVar);
            default:
                return true;
        }
    }

    @Override
    public final void c(q qVar) {
        switch (this.f19050a) {
            case 0:
                ((o) this.f19051b).c(qVar);
                return;
            default:
                i0 i02 = qVar.i0(0, 3);
                qVar.f(new t(-9223372036854775807L));
                qVar.L();
                v vVar = (v) this.f19051b;
                u a10 = vVar.a();
                a10.f8431r = u0.n("text/x-unknown");
                a10.f8423j = vVar.f8489s;
                f1.w(a10, i02);
                return;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        switch (this.f19050a) {
            case 0:
                ((o) this.f19051b).d(j10, j11);
                return;
            default:
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f19050a) {
            case 0:
            default:
                g0 g0Var = g9.i0.f12083b;
                return s1.f12146e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f19050a) {
            case 0:
                return ((o) this.f19051b).f(pVar, sVar);
            default:
                if (pVar.skip(Integer.MAX_VALUE) == -1) {
                    return -1;
                }
                return 0;
        }
    }

    @Override
    public final void release() {
        switch (this.f19050a) {
            case 0:
                ((o) this.f19051b).release();
                return;
            default:
                return;
        }
    }

    public a(v vVar) {
        this.f19051b = vVar;
    }

    private final void g() {
    }

    private final void h(long j10, long j11) {
    }
}
