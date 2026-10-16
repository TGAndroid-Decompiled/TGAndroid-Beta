package j3;

import c3.d0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
import v7.k8;
public final class b implements o {
    public final o f12568a;
    public final boolean f12569b;

    public b(int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f12569b = z10;
        if (z10) {
            this.f12568a = new d0(-1, -1, "image/heif");
        } else {
            this.f12568a = new a();
        }
    }

    @Override
    public final boolean a(p pVar) {
        if (this.f12569b) {
            return k8.a((l) pVar, false);
        }
        return this.f12568a.a(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f12568a.c(qVar);
    }

    @Override
    public final void d(long j10, long j11) {
        this.f12568a.d(j10, j11);
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8595b;
        return x1.e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        return this.f12568a.f(pVar, sVar);
    }

    @Override
    public final void release() {
        this.f12568a.release();
    }

    @Override
    public final o b() {
        return this;
    }
}
