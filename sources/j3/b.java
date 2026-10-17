package j3;

import c3.e0;
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
    public final o f13973a;
    public final boolean f13974b;

    public b(int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f13974b = z10;
        if (z10) {
            this.f13973a = new e0(-1, -1, "image/heif");
        } else {
            this.f13973a = new a();
        }
    }

    @Override
    public final boolean a(p pVar) {
        if (this.f13974b) {
            return k8.a((l) pVar, false);
        }
        return this.f13973a.a(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f13973a.c(qVar);
    }

    @Override
    public final void d(long j10, long j11) {
        this.f13973a.d(j10, j11);
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8476b;
        return x1.e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        return this.f13973a.f(pVar, sVar);
    }

    @Override
    public final void release() {
        this.f13973a.release();
    }

    @Override
    public final o b() {
        return this;
    }
}
