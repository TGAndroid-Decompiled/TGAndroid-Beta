package i3;

import f3.e0;
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
    public final int f15231a;
    public final x f15232b;
    public final e0 f15233c;

    public a(int i7) {
        this.f15231a = i7;
        switch (i7) {
            case 1:
                this.f15232b = new x(4);
                this.f15233c = new e0(-1, -1, "image/webp");
                return;
            default:
                this.f15232b = new x(4);
                this.f15233c = new e0(-1, -1, "image/avif");
                return;
        }
    }

    @Override
    public final o a() {
        int i7 = this.f15231a;
        return this;
    }

    @Override
    public final boolean b(p pVar) {
        switch (this.f15231a) {
            case 0:
                l lVar = (l) pVar;
                lVar.v(4, false);
                x xVar = this.f15232b;
                xVar.K(4);
                lVar.k(xVar.f14164a, 0, 4, false);
                if (xVar.C() != 1718909296) {
                    return false;
                }
                xVar.K(4);
                lVar.k(xVar.f14164a, 0, 4, false);
                if (xVar.C() != 1635150182) {
                    return false;
                }
                return true;
            default:
                x xVar2 = this.f15232b;
                xVar2.K(4);
                l lVar2 = (l) pVar;
                lVar2.k(xVar2.f14164a, 0, 4, false);
                if (xVar2.C() != 1380533830) {
                    return false;
                }
                lVar2.v(4, false);
                xVar2.K(4);
                lVar2.k(xVar2.f14164a, 0, 4, false);
                if (xVar2.C() != 1464156752) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void c(q qVar) {
        switch (this.f15231a) {
            case 0:
                this.f15233c.c(qVar);
                return;
            default:
                this.f15233c.c(qVar);
                return;
        }
    }

    @Override
    public final void d(long j3, long j10) {
        switch (this.f15231a) {
            case 0:
                this.f15233c.d(j3, j10);
                return;
            default:
                this.f15233c.d(j3, j10);
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f15231a) {
            case 0:
            default:
                g0 g0Var = i0.f14331b;
                return t1.f14399e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f15231a) {
            case 0:
                return this.f15233c.f(pVar, sVar);
            default:
                return this.f15233c.f(pVar, sVar);
        }
    }

    @Override
    public final void release() {
        int i7 = this.f15231a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
