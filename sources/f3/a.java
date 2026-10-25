package f3;

import c3.d0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import e2.x;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.List;
public final class a implements o {
    public final int f10133a;
    public final x f10134b;
    public final d0 f10135c;

    public a(int i10) {
        this.f10133a = i10;
        switch (i10) {
            case 1:
                this.f10134b = new x(4);
                this.f10135c = new d0(-1, -1, "image/webp");
                return;
            default:
                this.f10134b = new x(4);
                this.f10135c = new d0(-1, -1, "image/avif");
                return;
        }
    }

    @Override
    public final boolean a(p pVar) {
        switch (this.f10133a) {
            case 0:
                l lVar = (l) pVar;
                lVar.s(4, false);
                x xVar = this.f10134b;
                xVar.K(4);
                lVar.h(xVar.f9732a, 0, 4, false);
                if (xVar.C() != 1718909296) {
                    return false;
                }
                xVar.K(4);
                lVar.h(xVar.f9732a, 0, 4, false);
                if (xVar.C() != 1635150182) {
                    return false;
                }
                return true;
            default:
                x xVar2 = this.f10134b;
                xVar2.K(4);
                l lVar2 = (l) pVar;
                lVar2.h(xVar2.f9732a, 0, 4, false);
                if (xVar2.C() != 1380533830) {
                    return false;
                }
                lVar2.s(4, false);
                xVar2.K(4);
                lVar2.h(xVar2.f9732a, 0, 4, false);
                if (xVar2.C() != 1464156752) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final o b() {
        int i10 = this.f10133a;
        return this;
    }

    @Override
    public final void c(q qVar) {
        switch (this.f10133a) {
            case 0:
                this.f10135c.c(qVar);
                return;
            default:
                this.f10135c.c(qVar);
                return;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        switch (this.f10133a) {
            case 0:
                this.f10135c.d(j10, j11);
                return;
            default:
                this.f10135c.d(j10, j11);
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f10133a) {
            case 0:
            default:
                g0 g0Var = i0.f10287b;
                return s1.e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f10133a) {
            case 0:
                return this.f10135c.f(pVar, sVar);
            default:
                return this.f10135c.f(pVar, sVar);
        }
    }

    @Override
    public final void release() {
        int i10 = this.f10133a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
