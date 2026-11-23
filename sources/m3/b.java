package m3;

import c8.o9;
import f3.d0;
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
    public final o f20526a;
    public final boolean f20527b;

    public b(int i7) {
        boolean z10 = (i7 & 1) != 0;
        this.f20527b = z10;
        if (z10) {
            this.f20526a = new d0(-1, -1, "image/heif");
        } else {
            this.f20526a = new a();
        }
    }

    @Override
    public final boolean b(p pVar) {
        if (this.f20527b) {
            return o9.a((l) pVar, false);
        }
        return this.f20526a.b(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f20526a.c(qVar);
    }

    @Override
    public final void d(long j3, long j10) {
        this.f20526a.d(j3, j10);
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f13998b;
        return t1.f14066e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        return this.f20526a.f(pVar, sVar);
    }

    @Override
    public final void release() {
        this.f20526a.release();
    }

    @Override
    public final o a() {
        return this;
    }
}
