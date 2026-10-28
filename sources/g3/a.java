package g3;

import c3.d0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.List;
public final class a implements o {
    public final int f12291a;
    public final d0 f12292b;

    public a(int i10) {
        this.f12291a = i10;
        switch (i10) {
            case 1:
                this.f12292b = new d0(35152, 2, "image/png");
                return;
            default:
                this.f12292b = new d0(16973, 2, "image/bmp");
                return;
        }
    }

    @Override
    public final boolean a(p pVar) {
        switch (this.f12291a) {
            case 0:
                return this.f12292b.a(pVar);
            default:
                return this.f12292b.a(pVar);
        }
    }

    @Override
    public final o b() {
        int i10 = this.f12291a;
        return this;
    }

    @Override
    public final void c(q qVar) {
        switch (this.f12291a) {
            case 0:
                this.f12292b.c(qVar);
                return;
            default:
                this.f12292b.c(qVar);
                return;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        switch (this.f12291a) {
            case 0:
                this.f12292b.d(j10, j11);
                return;
            default:
                this.f12292b.d(j10, j11);
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f12291a) {
            case 0:
            default:
                g0 g0Var = i0.f10286b;
                return s1.e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f12291a) {
            case 0:
                return this.f12292b.f(pVar, sVar);
            default:
                return this.f12292b.f(pVar, sVar);
        }
    }

    @Override
    public final void release() {
        int i10 = this.f12291a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
