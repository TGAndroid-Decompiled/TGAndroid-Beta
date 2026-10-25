package c3;

import a8.yb;
import b2.w0;
import f9.s1;
import java.util.List;
public final class d0 implements o {
    public final int f6042a;
    public final int f6043b;
    public final String f6044c;
    public int d;
    public int e;
    public q f6045f;
    public j0 f6046g;

    public d0(int i10, int i11, String str) {
        this.f6042a = i10;
        this.f6043b = i11;
        this.f6044c = str;
    }

    @Override
    public final boolean a(p pVar) {
        boolean z10;
        int i10 = this.f6043b;
        int i11 = this.f6042a;
        if (i11 != -1 && i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        e2.x xVar = new e2.x(i10);
        ((l) pVar).h(xVar.f9732a, 0, i10, false);
        if (xVar.H() == i11) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(q qVar) {
        this.f6045f = qVar;
        j0 F1 = qVar.F1(1024, 4);
        this.f6046g = F1;
        b2.w wVar = new b2.w();
        String str = this.f6044c;
        wVar.f3532q = w0.n(str);
        wVar.f3533r = w0.n(str);
        ic.a.u(wVar, F1);
        this.f6045f.Q0();
        this.f6045f.D1(new Object());
        this.e = 1;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 != 0 && this.e != 1) {
            return;
        }
        this.e = 1;
        this.d = 0;
    }

    @Override
    public final List e() {
        f9.g0 g0Var = f9.i0.f10287b;
        return s1.e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        int i10 = this.e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        j0 j0Var = this.f6046g;
        j0Var.getClass();
        int a2 = j0Var.a(pVar, 1024, true);
        if (a2 == -1) {
            this.e = 2;
            this.f6046g.c(0L, 1, this.d, 0, null);
            this.d = 0;
            return 0;
        }
        this.d += a2;
        return 0;
    }

    @Override
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
