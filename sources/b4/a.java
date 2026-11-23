package b4;

import f3.e0;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import h9.g0;
import h9.i0;
import h9.s1;
import java.util.List;
public final class a implements o {
    public final int f2902a;
    public final e0 f2903b;

    public a(int i7) {
        this.f2902a = i7;
        switch (i7) {
            case 1:
                this.f2903b = new e0(16973, 2, "image/bmp");
                return;
            default:
                this.f2903b = new e0(35152, 2, "image/png");
                return;
        }
    }

    @Override
    public final o a() {
        int i7 = this.f2902a;
        return this;
    }

    @Override
    public final boolean b(p pVar) {
        switch (this.f2902a) {
            case 0:
                return this.f2903b.b(pVar);
            default:
                return this.f2903b.b(pVar);
        }
    }

    @Override
    public final void c(q qVar) {
        switch (this.f2902a) {
            case 0:
                this.f2903b.c(qVar);
                return;
            default:
                this.f2903b.c(qVar);
                return;
        }
    }

    @Override
    public final void d(long j3, long j10) {
        switch (this.f2902a) {
            case 0:
                this.f2903b.d(j3, j10);
                return;
            default:
                this.f2903b.d(j3, j10);
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f2902a) {
            case 0:
            default:
                g0 g0Var = i0.f13995b;
                return s1.f14058e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f2902a) {
            case 0:
                return this.f2903b.f(pVar, sVar);
            default:
                return this.f2903b.f(pVar, sVar);
        }
    }

    @Override
    public final void release() {
        int i7 = this.f2902a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
