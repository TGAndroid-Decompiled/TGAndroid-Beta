package j3;

import c3.g0;
import c3.l;
import c3.q;
import c3.r;
import c3.s;
import c3.u;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
import v7.k8;
public final class b implements q {
    public final q f14023a;
    public final boolean f14024b;

    public b(int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f14024b = z10;
        if (z10) {
            this.f14023a = new g0(-1, -1, "image/heif");
        } else {
            this.f14023a = new a();
        }
    }

    @Override
    public final boolean a(r rVar) {
        if (this.f14024b) {
            return k8.a((l) rVar, false);
        }
        return this.f14023a.a(rVar);
    }

    @Override
    public final void c(s sVar) {
        this.f14023a.c(sVar);
    }

    @Override
    public final void d(long j10, long j11) {
        this.f14023a.d(j10, j11);
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(r rVar, u uVar) {
        return this.f14023a.f(rVar, uVar);
    }

    @Override
    public final void release() {
        this.f14023a.release();
    }

    @Override
    public final q b() {
        return this;
    }
}
