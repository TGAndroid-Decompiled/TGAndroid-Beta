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
import v7.j8;
public final class b implements o {
    public final o f9391a;
    public final boolean f9392b;

    public b(int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f9392b = z10;
        if (z10) {
            this.f9391a = new d0(-1, -1, "image/heif");
        } else {
            this.f9391a = new a();
        }
    }

    @Override
    public final boolean a(p pVar) {
        if (this.f9392b) {
            return j8.a((l) pVar, false);
        }
        return this.f9391a.a(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f9391a.c(qVar);
    }

    @Override
    public final void d(long j10, long j11) {
        this.f9391a.d(j10, j11);
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f6390b;
        return x1.e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        return this.f9391a.f(pVar, sVar);
    }

    @Override
    public final void release() {
        this.f9391a.release();
    }

    @Override
    public final o b() {
        return this;
    }
}
