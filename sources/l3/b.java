package l3;

import b8.sd;
import e3.d0;
import e3.l;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.List;
public final class b implements o {
    public final o f17738a;
    public final boolean f17739b;

    public b(int i3) {
        boolean z10 = (i3 & 1) != 0;
        this.f17739b = z10;
        if (z10) {
            this.f17738a = new d0(-1, -1, "image/heif");
        } else {
            this.f17738a = new a();
        }
    }

    @Override
    public final boolean b(p pVar) {
        if (this.f17739b) {
            return sd.a((l) pVar, false);
        }
        return this.f17738a.b(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f17738a.c(qVar);
    }

    @Override
    public final void d(long j10, long j11) {
        this.f17738a.d(j10, j11);
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        return this.f17738a.f(pVar, sVar);
    }

    @Override
    public final void release() {
        this.f17738a.release();
    }

    @Override
    public final o a() {
        return this;
    }
}
