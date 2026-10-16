package f3;

import c3.d0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class a implements o {
    public final int f8914a;
    public final x f8915b;
    public final d0 f8916c;

    public a(int i10) {
        this.f8914a = i10;
        switch (i10) {
            case 1:
                this.f8915b = new x(4);
                this.f8916c = new d0(-1, -1, "image/webp");
                return;
            default:
                this.f8915b = new x(4);
                this.f8916c = new d0(-1, -1, "image/avif");
                return;
        }
    }

    @Override
    public final boolean a(p pVar) {
        switch (this.f8914a) {
            case 0:
                l lVar = (l) pVar;
                lVar.v(4, false);
                x xVar = this.f8915b;
                xVar.K(4);
                lVar.j(xVar.f8414a, 0, 4, false);
                if (xVar.C() != 1718909296) {
                    return false;
                }
                xVar.K(4);
                lVar.j(xVar.f8414a, 0, 4, false);
                if (xVar.C() != 1635150182) {
                    return false;
                }
                return true;
            default:
                x xVar2 = this.f8915b;
                xVar2.K(4);
                l lVar2 = (l) pVar;
                lVar2.j(xVar2.f8414a, 0, 4, false);
                if (xVar2.C() != 1380533830) {
                    return false;
                }
                lVar2.v(4, false);
                xVar2.K(4);
                lVar2.j(xVar2.f8414a, 0, 4, false);
                if (xVar2.C() != 1464156752) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final o b() {
        int i10 = this.f8914a;
        return this;
    }

    @Override
    public final void c(q qVar) {
        switch (this.f8914a) {
            case 0:
                this.f8916c.c(qVar);
                return;
            default:
                this.f8916c.c(qVar);
                return;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        switch (this.f8914a) {
            case 0:
                this.f8916c.d(j10, j11);
                return;
            default:
                this.f8916c.d(j10, j11);
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f8914a) {
            case 0:
            default:
                l0 l0Var = n0.f8595b;
                return x1.e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f8914a) {
            case 0:
                return this.f8916c.f(pVar, sVar);
            default:
                return this.f8916c.f(pVar, sVar);
        }
    }

    @Override
    public final void release() {
        int i10 = this.f8914a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
