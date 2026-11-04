package e3;

import b8.zb;
import d2.u0;
import g9.s1;
import java.util.List;
import org.telegram.ui.Cells.f1;
public final class d0 implements o {
    public final int f9449a;
    public final int f9450b;
    public final String f9451c;
    public int d;
    public int f9452e;
    public q f9453f;
    public i0 f9454g;

    public d0(int i3, int i10, String str) {
        this.f9449a = i3;
        this.f9450b = i10;
        this.f9451c = str;
    }

    @Override
    public final boolean b(p pVar) {
        boolean z10;
        int i3 = this.f9450b;
        int i10 = this.f9449a;
        if (i10 != -1 && i3 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        g2.y yVar = new g2.y(i3);
        ((l) pVar).h(yVar.f11923a, 0, i3, false);
        if (yVar.H() == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(q qVar) {
        this.f9453f = qVar;
        i0 i02 = qVar.i0(1024, 4);
        this.f9454g = i02;
        d2.u uVar = new d2.u();
        String str = this.f9451c;
        uVar.f8430q = u0.n(str);
        uVar.f8431r = u0.n(str);
        f1.w(uVar, i02);
        this.f9453f.L();
        this.f9453f.f(new Object());
        this.f9452e = 1;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 != 0 && this.f9452e != 1) {
            return;
        }
        this.f9452e = 1;
        this.d = 0;
    }

    @Override
    public final List e() {
        g9.g0 g0Var = g9.i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        int i3 = this.f9452e;
        if (i3 != 1) {
            if (i3 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        i0 i0Var = this.f9454g;
        i0Var.getClass();
        int a10 = i0Var.a(pVar, 1024, true);
        if (a10 == -1) {
            this.f9452e = 2;
            this.f9454g.d(0L, 1, this.d, 0, null);
            this.d = 0;
            return 0;
        }
        this.d += a10;
        return 0;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
