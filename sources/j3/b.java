package j3;

import a8.ad;
import c3.d0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.List;
public final class b implements o {
    public final o f15235a;
    public final boolean f15236b;

    public b(int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f15236b = z10;
        if (z10) {
            this.f15235a = new d0(-1, -1, "image/heif");
        } else {
            this.f15235a = new a();
        }
    }

    @Override
    public final boolean a(p pVar) {
        if (this.f15236b) {
            return ad.a((l) pVar, false);
        }
        return this.f15235a.a(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f15235a.c(qVar);
    }

    @Override
    public final void d(long j10, long j11) {
        this.f15235a.d(j10, j11);
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f10286b;
        return s1.e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        return this.f15235a.f(pVar, sVar);
    }

    @Override
    public final void release() {
        this.f15235a.release();
    }

    @Override
    public final o b() {
        return this;
    }
}
