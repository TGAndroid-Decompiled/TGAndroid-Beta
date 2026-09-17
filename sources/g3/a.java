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
    public final int f10396a;
    public final d0 f10397b;

    public a(int i10) {
        this.f10396a = i10;
        switch (i10) {
            case 1:
                this.f10397b = new d0(35152, 2, "image/png");
                return;
            default:
                this.f10397b = new d0(16973, 2, "image/bmp");
                return;
        }
    }

    @Override
    public final boolean b(p pVar) {
        switch (this.f10396a) {
            case 0:
                return this.f10397b.b(pVar);
            default:
                return this.f10397b.b(pVar);
        }
    }

    @Override
    public final o c() {
        int i10 = this.f10396a;
        return this;
    }

    @Override
    public final void g(q qVar) {
        switch (this.f10396a) {
            case 0:
                this.f10397b.g(qVar);
                return;
            default:
                this.f10397b.g(qVar);
                return;
        }
    }

    @Override
    public final void h(long j3, long j10) {
        switch (this.f10396a) {
            case 0:
                this.f10397b.h(j3, j10);
                return;
            default:
                this.f10397b.h(j3, j10);
                return;
        }
    }

    @Override
    public final List i() {
        switch (this.f10396a) {
            case 0:
            default:
                g0 g0Var = i0.f8985b;
                return a1.f8948e;
        }
    }

    @Override
    public final int m(p pVar, s sVar) {
        switch (this.f10396a) {
            case 0:
                return this.f10397b.m(pVar, sVar);
            default:
                return this.f10397b.m(pVar, sVar);
        }
    }

    @Override
    public final void release() {
        int i10 = this.f10396a;
    }

    private final void a() {
    }

    private final void d() {
    }
}
