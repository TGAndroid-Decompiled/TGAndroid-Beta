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
import h9.s1;
import java.util.List;
public final class a implements o {
    public final int f16087a;
    public final x f16088b;
    public final e0 f16089c;

    public a(int i7) {
        this.f16087a = i7;
        switch (i7) {
            case 1:
                this.f16088b = new x(4);
                this.f16089c = new e0(-1, -1, "image/webp");
                return;
            default:
                this.f16088b = new x(4);
                this.f16089c = new e0(-1, -1, "image/avif");
                return;
        }
    }

    @Override
    public final o a() {
        int i7 = this.f16087a;
        return this;
    }

    @Override
    public final boolean b(p pVar) {
        switch (this.f16087a) {
            case 0:
                l lVar = (l) pVar;
                lVar.t(4, false);
                x xVar = this.f16088b;
                xVar.K(4);
                lVar.k(xVar.f13828a, 0, 4, false);
                if (xVar.C() != 1718909296) {
                    return false;
                }
                xVar.K(4);
                lVar.k(xVar.f13828a, 0, 4, false);
                if (xVar.C() != 1635150182) {
                    return false;
                }
                return true;
            default:
                x xVar2 = this.f16088b;
                xVar2.K(4);
                l lVar2 = (l) pVar;
                lVar2.k(xVar2.f13828a, 0, 4, false);
                if (xVar2.C() != 1380533830) {
                    return false;
                }
                lVar2.t(4, false);
                xVar2.K(4);
                lVar2.k(xVar2.f13828a, 0, 4, false);
                if (xVar2.C() != 1464156752) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void c(q qVar) {
        switch (this.f16087a) {
            case 0:
                this.f16089c.c(qVar);
                return;
            default:
                this.f16089c.c(qVar);
                return;
        }
    }

    @Override
    public final void d(long j3, long j10) {
        switch (this.f16087a) {
            case 0:
                this.f16089c.d(j3, j10);
                return;
            default:
                this.f16089c.d(j3, j10);
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f16087a) {
            case 0:
            default:
                g0 g0Var = i0.f13995b;
                return s1.f14058e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f16087a) {
            case 0:
                return this.f16089c.f(pVar, sVar);
            default:
                return this.f16089c.f(pVar, sVar);
        }
    }

    @Override
    public final void release() {
        int i7 = this.f16087a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
