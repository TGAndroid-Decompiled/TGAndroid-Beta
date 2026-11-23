package i3;

import f3.d0;
import f3.l;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.List;
public final class a implements o {
    public final int f15992a;
    public final x f15993b;
    public final d0 f15994c;

    public a(int i7) {
        this.f15992a = i7;
        switch (i7) {
            case 1:
                this.f15993b = new x(4);
                this.f15994c = new d0(-1, -1, "image/webp");
                return;
            default:
                this.f15993b = new x(4);
                this.f15994c = new d0(-1, -1, "image/avif");
                return;
        }
    }

    @Override
    public final o a() {
        int i7 = this.f15992a;
        return this;
    }

    @Override
    public final boolean b(p pVar) {
        switch (this.f15992a) {
            case 0:
                l lVar = (l) pVar;
                lVar.x(4, false);
                x xVar = this.f15993b;
                xVar.K(4);
                lVar.g(xVar.f13828a, 0, 4, false);
                if (xVar.C() != 1718909296) {
                    return false;
                }
                xVar.K(4);
                lVar.g(xVar.f13828a, 0, 4, false);
                if (xVar.C() != 1635150182) {
                    return false;
                }
                return true;
            default:
                x xVar2 = this.f15993b;
                xVar2.K(4);
                l lVar2 = (l) pVar;
                lVar2.g(xVar2.f13828a, 0, 4, false);
                if (xVar2.C() != 1380533830) {
                    return false;
                }
                lVar2.x(4, false);
                xVar2.K(4);
                lVar2.g(xVar2.f13828a, 0, 4, false);
                if (xVar2.C() != 1464156752) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void c(q qVar) {
        switch (this.f15992a) {
            case 0:
                this.f15994c.c(qVar);
                return;
            default:
                this.f15994c.c(qVar);
                return;
        }
    }

    @Override
    public final void d(long j3, long j10) {
        switch (this.f15992a) {
            case 0:
                this.f15994c.d(j3, j10);
                return;
            default:
                this.f15994c.d(j3, j10);
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f15992a) {
            case 0:
            default:
                g0 g0Var = i0.f13998b;
                return t1.f14066e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f15992a) {
            case 0:
                return this.f15994c.f(pVar, sVar);
            default:
                return this.f15994c.f(pVar, sVar);
        }
    }

    @Override
    public final void release() {
        int i7 = this.f15992a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
