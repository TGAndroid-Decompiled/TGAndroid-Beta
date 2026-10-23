package g3;

import c3.g0;
import c3.q;
import c3.r;
import c3.s;
import c3.u;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class a implements q {
    public final int f10844a;
    public final g0 f10845b;

    public a(int i10) {
        this.f10844a = i10;
        switch (i10) {
            case 1:
                this.f10845b = new g0(35152, 2, "image/png");
                return;
            default:
                this.f10845b = new g0(16973, 2, "image/bmp");
                return;
        }
    }

    @Override
    public final boolean a(r rVar) {
        switch (this.f10844a) {
            case 0:
                return this.f10845b.a(rVar);
            default:
                return this.f10845b.a(rVar);
        }
    }

    @Override
    public final q b() {
        int i10 = this.f10844a;
        return this;
    }

    @Override
    public final void c(s sVar) {
        switch (this.f10844a) {
            case 0:
                this.f10845b.c(sVar);
                return;
            default:
                this.f10845b.c(sVar);
                return;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        switch (this.f10844a) {
            case 0:
                this.f10845b.d(j10, j11);
                return;
            default:
                this.f10845b.d(j10, j11);
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f10844a) {
            case 0:
            default:
                l0 l0Var = n0.f8481b;
                return x1.e;
        }
    }

    @Override
    public final int f(r rVar, u uVar) {
        switch (this.f10844a) {
            case 0:
                return this.f10845b.f(rVar, uVar);
            default:
                return this.f10845b.f(rVar, uVar);
        }
    }

    @Override
    public final void release() {
        int i10 = this.f10844a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
