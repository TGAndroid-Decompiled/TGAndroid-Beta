package h3;

import e3.d0;
import e3.l;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.List;
public final class a implements o {
    public final int f14182a;
    public final y f14183b;
    public final d0 f14184c;

    public a(int i3) {
        this.f14182a = i3;
        switch (i3) {
            case 1:
                this.f14183b = new y(4);
                this.f14184c = new d0(-1, -1, "image/webp");
                return;
            default:
                this.f14183b = new y(4);
                this.f14184c = new d0(-1, -1, "image/avif");
                return;
        }
    }

    @Override
    public final o a() {
        int i3 = this.f14182a;
        return this;
    }

    @Override
    public final boolean b(p pVar) {
        switch (this.f14182a) {
            case 0:
                l lVar = (l) pVar;
                lVar.w(4, false);
                y yVar = this.f14183b;
                yVar.K(4);
                lVar.h(yVar.f11923a, 0, 4, false);
                if (yVar.C() != 1718909296) {
                    return false;
                }
                yVar.K(4);
                lVar.h(yVar.f11923a, 0, 4, false);
                if (yVar.C() != 1635150182) {
                    return false;
                }
                return true;
            default:
                y yVar2 = this.f14183b;
                yVar2.K(4);
                l lVar2 = (l) pVar;
                lVar2.h(yVar2.f11923a, 0, 4, false);
                if (yVar2.C() != 1380533830) {
                    return false;
                }
                lVar2.w(4, false);
                yVar2.K(4);
                lVar2.h(yVar2.f11923a, 0, 4, false);
                if (yVar2.C() != 1464156752) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void c(q qVar) {
        switch (this.f14182a) {
            case 0:
                this.f14184c.c(qVar);
                return;
            default:
                this.f14184c.c(qVar);
                return;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        switch (this.f14182a) {
            case 0:
                this.f14184c.d(j10, j11);
                return;
            default:
                this.f14184c.d(j10, j11);
                return;
        }
    }

    @Override
    public final List e() {
        switch (this.f14182a) {
            case 0:
            default:
                g0 g0Var = i0.f12083b;
                return s1.f12146e;
        }
    }

    @Override
    public final int f(p pVar, s sVar) {
        switch (this.f14182a) {
            case 0:
                return this.f14184c.f(pVar, sVar);
            default:
                return this.f14184c.f(pVar, sVar);
        }
    }

    @Override
    public final void release() {
        int i3 = this.f14182a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
