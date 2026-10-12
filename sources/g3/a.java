package g3;

import c3.d0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class a implements o {
    public final int f9917a;
    public final d0 f9918b;

    public a(int i10) {
        this.f9917a = i10;
        switch (i10) {
            case 1:
                this.f9918b = new d0(35152, 2, "image/png");
                return;
            default:
                this.f9918b = new d0(16973, 2, "image/bmp");
                return;
        }
    }

    @Override
    public final boolean a(p pVar) {
        switch (this.f9917a) {
            case 0:
                return this.f9918b.a(pVar);
            default:
                return this.f9918b.a(pVar);
        }
    }

    @Override
    public final o b() {
        int i10 = this.f9917a;
        return this;
    }

    @Override
    public final void c(q qVar) {
        switch (this.f9917a) {
            case 0:
                this.f9918b.c(qVar);
                return;
            default:
                this.f9918b.c(qVar);
                return;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        switch (this.f9917a) {
            case 0:
                this.f9918b.d(j10, j11);
                return;
            default:
                this.f9918b.d(j10, j11);
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f9917a) {
            case 0:
            default:
                l0 l0Var = n0.f8592b;
                return x1.e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f9917a) {
            case 0:
                return this.f9918b.f(pVar, sVar);
            default:
                return this.f9918b.f(pVar, sVar);
        }
    }

    @Override
    public final void release() {
        int i10 = this.f9917a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
