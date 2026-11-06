package f3;

import a8.ia;
import e2.s0;
import h9.t1;
import java.util.List;
import org.telegram.ui.Cells.f1;
public final class e0 implements o {
    public final int f11018a;
    public final int f11019b;
    public final String f11020c;
    public int d;
    public int f11021e;
    public q f11022f;
    public j0 f11023g;

    public e0(int i7, int i10, String str) {
        this.f11018a = i7;
        this.f11019b = i10;
        this.f11020c = str;
    }

    @Override
    public final boolean b(p pVar) {
        boolean z9;
        int i7 = this.f11019b;
        int i10 = this.f11018a;
        if (i10 != -1 && i7 != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        h2.x xVar = new h2.x(i7);
        ((l) pVar).k(xVar.f14162a, 0, i7, false);
        if (xVar.H() == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(q qVar) {
        this.f11022f = qVar;
        j0 O1 = qVar.O1(1024, 4);
        this.f11023g = O1;
        e2.t tVar = new e2.t();
        String str = this.f11020c;
        tVar.f10562q = s0.n(str);
        tVar.f10563r = s0.n(str);
        f1.s(tVar, O1);
        this.f11022f.U0();
        this.f11022f.f(new Object());
        this.f11021e = 1;
    }

    @Override
    public final void d(long j3, long j10) {
        if (j3 != 0 && this.f11021e != 1) {
            return;
        }
        this.f11021e = 1;
        this.d = 0;
    }

    @Override
    public final List e() {
        h9.g0 g0Var = h9.i0.f14329b;
        return t1.f14397e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        int i7 = this.f11021e;
        if (i7 != 1) {
            if (i7 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        j0 j0Var = this.f11023g;
        j0Var.getClass();
        int e10 = j0Var.e(pVar, 1024, true);
        if (e10 == -1) {
            this.f11021e = 2;
            this.f11023g.c(0L, 1, this.d, 0, null);
            this.d = 0;
            return 0;
        }
        this.d += e10;
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
