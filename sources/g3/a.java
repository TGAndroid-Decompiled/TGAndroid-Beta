package g3;

import c3.d0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.List;
public final class a implements o {
    public final int f9395a;
    public final d0 f9396b;

    public a(int i10) {
        this.f9395a = i10;
        switch (i10) {
            case 1:
                this.f9396b = new d0(35152, 2, "image/png");
                return;
            default:
                this.f9396b = new d0(16973, 2, "image/bmp");
                return;
        }
    }

    @Override
    public final boolean a(p pVar) {
        switch (this.f9395a) {
            case 0:
                return this.f9396b.a(pVar);
            default:
                return this.f9396b.a(pVar);
        }
    }

    @Override
    public final o c() {
        int i10 = this.f9395a;
        return this;
    }

    @Override
    public final void g(q qVar) {
        switch (this.f9395a) {
            case 0:
                this.f9396b.g(qVar);
                return;
            default:
                this.f9396b.g(qVar);
                return;
        }
    }

    @Override
    public final void h(long j3, long j10) {
        switch (this.f9395a) {
            case 0:
                this.f9396b.h(j3, j10);
                return;
            default:
                this.f9396b.h(j3, j10);
                return;
        }
    }

    @Override
    public final List i() {
        switch (this.f9395a) {
            case 0:
            default:
                g0 g0Var = i0.f8066b;
                return a1.e;
        }
    }

    @Override
    public final int m(p pVar, s sVar) {
        switch (this.f9395a) {
            case 0:
                return this.f9396b.m(pVar, sVar);
            default:
                return this.f9396b.m(pVar, sVar);
        }
    }

    @Override
    public final void release() {
        int i10 = this.f9395a;
    }

    private final void b() {
    }

    private final void d() {
    }
}
