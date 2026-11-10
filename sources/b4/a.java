package b4;

import f3.e0;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.List;
public final class a implements o {
    public final int f2979a;
    public final e0 f2980b;

    public a(int i7) {
        this.f2979a = i7;
        switch (i7) {
            case 1:
                this.f2980b = new e0(16973, 2, "image/bmp");
                return;
            default:
                this.f2980b = new e0(35152, 2, "image/png");
                return;
        }
    }

    @Override
    public final o a() {
        int i7 = this.f2979a;
        return this;
    }

    @Override
    public final boolean b(p pVar) {
        switch (this.f2979a) {
            case 0:
                return this.f2980b.b(pVar);
            default:
                return this.f2980b.b(pVar);
        }
    }

    @Override
    public final void c(q qVar) {
        switch (this.f2979a) {
            case 0:
                this.f2980b.c(qVar);
                return;
            default:
                this.f2980b.c(qVar);
                return;
        }
    }

    @Override
    public final void d(long j3, long j10) {
        switch (this.f2979a) {
            case 0:
                this.f2980b.d(j3, j10);
                return;
            default:
                this.f2980b.d(j3, j10);
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f2979a) {
            case 0:
            default:
                g0 g0Var = i0.f14331b;
                return t1.f14399e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f2979a) {
            case 0:
                return this.f2980b.f(pVar, sVar);
            default:
                return this.f2980b.f(pVar, sVar);
        }
    }

    @Override
    public final void release() {
        int i7 = this.f2979a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
