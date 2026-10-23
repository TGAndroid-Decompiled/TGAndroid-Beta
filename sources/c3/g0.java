package c3;

import b2.v0;
import e9.x1;
import i2.o1;
import java.util.List;
import v7.u6;
public final class g0 implements q {
    public final int f4623a;
    public final int f4624b;
    public final String f4625c;
    public int d;
    public int e;
    public s f4626f;
    public l0 f4627g;

    public g0(int i10, int i11, String str) {
        this.f4623a = i10;
        this.f4624b = i11;
        this.f4625c = str;
    }

    @Override
    public final boolean a(r rVar) {
        boolean z10;
        int i10 = this.f4624b;
        int i11 = this.f4623a;
        if (i11 != -1 && i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        e2.x xVar = new e2.x(i10);
        ((l) rVar).j(xVar.f8298a, 0, i10, false);
        if (xVar.H() == i11) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(s sVar) {
        this.f4626f = sVar;
        l0 j02 = sVar.j0(1024, 4);
        this.f4627g = j02;
        b2.v vVar = new b2.v();
        String str = this.f4625c;
        vVar.f4081q = v0.n(str);
        vVar.f4082r = v0.n(str);
        o1.v(vVar, j02);
        this.f4626f.C();
        this.f4626f.g0(new Object());
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
        e9.l0 l0Var = e9.n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(r rVar, u uVar) {
        int i10 = this.e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        l0 l0Var = this.f4627g;
        l0Var.getClass();
        int a2 = l0Var.a(rVar, 1024, true);
        if (a2 == -1) {
            this.e = 2;
            this.f4627g.c(0L, 1, this.d, 0, null);
            this.d = 0;
            return 0;
        }
        this.d += a2;
        return 0;
    }

    @Override
    public final q b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
