package m3;

import c8.o9;
import f3.e0;
import f3.l;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import h9.g0;
import h9.i0;
import h9.s1;
import java.util.List;
public final class b implements o {
    public final o f20622a;
    public final boolean f20623b;

    public b(int i7) {
        boolean z10 = (i7 & 1) != 0;
        this.f20623b = z10;
        if (z10) {
            this.f20622a = new e0(-1, -1, "image/heif");
        } else {
            this.f20622a = new a();
        }
    }

    @Override
    public final boolean b(p pVar) {
        if (this.f20623b) {
            return o9.a((l) pVar, false);
        }
        return this.f20622a.b(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f20622a.c(qVar);
    }

    @Override
    public final void d(long j3, long j10) {
        this.f20622a.d(j3, j10);
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f13995b;
        return s1.f14058e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        return this.f20622a.f(pVar, sVar);
    }

    @Override
    public final void release() {
        this.f20622a.release();
    }

    @Override
    public final o a() {
        return this;
    }
}
