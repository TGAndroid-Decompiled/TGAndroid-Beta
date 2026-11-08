package m3;

import c8.m9;
import f3.e0;
import f3.l;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.List;
public final class b implements o {
    public final o f19572a;
    public final boolean f19573b;

    public b(int i7) {
        boolean z9 = (i7 & 1) != 0;
        this.f19573b = z9;
        if (z9) {
            this.f19572a = new e0(-1, -1, "image/heif");
        } else {
            this.f19572a = new a();
        }
    }

    @Override
    public final boolean b(p pVar) {
        if (this.f19573b) {
            return m9.a((l) pVar, false);
        }
        return this.f19572a.b(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f19572a.c(qVar);
    }

    @Override
    public final void d(long j3, long j10) {
        this.f19572a.d(j3, j10);
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14329b;
        return t1.f14397e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        return this.f19572a.f(pVar, sVar);
    }

    @Override
    public final void release() {
        this.f19572a.release();
    }

    @Override
    public final o a() {
        return this;
    }
}
