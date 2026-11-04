package a4;

import e3.d0;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.List;
public final class a implements o {
    public final int f125a;
    public final d0 f126b;

    public a(int i3) {
        this.f125a = i3;
        switch (i3) {
            case 1:
                this.f126b = new d0(16973, 2, "image/bmp");
                return;
            default:
                this.f126b = new d0(35152, 2, "image/png");
                return;
        }
    }

    @Override
    public final o a() {
        int i3 = this.f125a;
        return this;
    }

    @Override
    public final boolean b(p pVar) {
        switch (this.f125a) {
            case 0:
                return this.f126b.b(pVar);
            default:
                return this.f126b.b(pVar);
        }
    }

    @Override
    public final void c(q qVar) {
        switch (this.f125a) {
            case 0:
                this.f126b.c(qVar);
                return;
            default:
                this.f126b.c(qVar);
                return;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        switch (this.f125a) {
            case 0:
                this.f126b.d(j10, j11);
                return;
            default:
                this.f126b.d(j10, j11);
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f125a) {
            case 0:
            default:
                g0 g0Var = i0.f12083b;
                return s1.f12146e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f125a) {
            case 0:
                return this.f126b.f(pVar, sVar);
            default:
                return this.f126b.f(pVar, sVar);
        }
    }

    @Override
    public final void release() {
        int i3 = this.f125a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
