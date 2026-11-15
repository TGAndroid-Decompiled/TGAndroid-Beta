package f3;

import a8.ja;
import e2.s0;
import h9.s1;
import java.util.List;
public final class d0 implements o {
    public final int f10820a;
    public final int f10821b;
    public final String f10822c;
    public int d;
    public int f10823e;
    public q f10824f;
    public i0 f10825g;

    public d0(int i7, int i10, String str) {
        this.f10820a = i7;
        this.f10821b = i10;
        this.f10822c = str;
    }

    @Override
    public final boolean b(p pVar) {
        boolean z10;
        int i7 = this.f10821b;
        int i10 = this.f10820a;
        if (i10 != -1 && i7 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.p(z10);
        h2.x xVar = new h2.x(i7);
        ((l) pVar).h(xVar.f13521a, 0, i7, false);
        if (xVar.H() == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(q qVar) {
        this.f10824f = qVar;
        i0 d2 = qVar.d2(1024, 4);
        this.f10825g = d2;
        e2.t tVar = new e2.t();
        String str = this.f10822c;
        tVar.f10398q = s0.n(str);
        tVar.f10399r = s0.n(str);
        r.b.s(tVar, d2);
        this.f10824f.d1();
        this.f10824f.f(new Object());
        this.f10823e = 1;
    }

    @Override
    public final void d(long j3, long j10) {
        if (j3 != 0 && this.f10823e != 1) {
            return;
        }
        this.f10823e = 1;
        this.d = 0;
    }

    @Override
    public final List e() {
        h9.g0 g0Var = h9.i0.f13686b;
        return s1.f13749e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        int i7 = this.f10823e;
        if (i7 != 1) {
            if (i7 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        i0 i0Var = this.f10825g;
        i0Var.getClass();
        int e10 = i0Var.e(pVar, 1024, true);
        if (e10 == -1) {
            this.f10823e = 2;
            this.f10825g.c(0L, 1, this.d, 0, null);
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
