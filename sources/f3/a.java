package f3;

import c3.g0;
import c3.l;
import c3.q;
import c3.r;
import c3.s;
import c3.u;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class a implements q {
    public final int f10374a;
    public final x f10375b;
    public final g0 f10376c;

    public a(int i10) {
        this.f10374a = i10;
        switch (i10) {
            case 1:
                this.f10375b = new x(4);
                this.f10376c = new g0(-1, -1, "image/webp");
                return;
            default:
                this.f10375b = new x(4);
                this.f10376c = new g0(-1, -1, "image/avif");
                return;
        }
    }

    @Override
    public final boolean a(r rVar) {
        switch (this.f10374a) {
            case 0:
                l lVar = (l) rVar;
                lVar.u(4, false);
                x xVar = this.f10375b;
                xVar.K(4);
                lVar.j(xVar.f8298a, 0, 4, false);
                if (xVar.C() != 1718909296) {
                    return false;
                }
                xVar.K(4);
                lVar.j(xVar.f8298a, 0, 4, false);
                if (xVar.C() != 1635150182) {
                    return false;
                }
                return true;
            default:
                x xVar2 = this.f10375b;
                xVar2.K(4);
                l lVar2 = (l) rVar;
                lVar2.j(xVar2.f8298a, 0, 4, false);
                if (xVar2.C() != 1380533830) {
                    return false;
                }
                lVar2.u(4, false);
                xVar2.K(4);
                lVar2.j(xVar2.f8298a, 0, 4, false);
                if (xVar2.C() != 1464156752) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final q b() {
        int i10 = this.f10374a;
        return this;
    }

    @Override
    public final void c(s sVar) {
        switch (this.f10374a) {
            case 0:
                this.f10376c.c(sVar);
                return;
            default:
                this.f10376c.c(sVar);
                return;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        switch (this.f10374a) {
            case 0:
                this.f10376c.d(j10, j11);
                return;
            default:
                this.f10376c.d(j10, j11);
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f10374a) {
            case 0:
            default:
                l0 l0Var = n0.f8481b;
                return x1.e;
        }
    }

    @Override
    public final int f(r rVar, u uVar) {
        switch (this.f10374a) {
            case 0:
                return this.f10376c.f(rVar, uVar);
            default:
                return this.f10376c.f(rVar, uVar);
        }
    }

    @Override
    public final void release() {
        int i10 = this.f10374a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
