package f3;

import c3.d0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.List;
public final class a implements o {
    public final int f7739a;
    public final v f7740b;
    public final d0 f7741c;

    public a(int i10) {
        this.f7739a = i10;
        switch (i10) {
            case 1:
                this.f7740b = new v(4);
                this.f7741c = new d0(-1, -1, "image/heif");
                return;
            case 2:
                this.f7740b = new v(4);
                this.f7741c = new d0(-1, -1, "image/webp");
                return;
            default:
                this.f7740b = new v(4);
                this.f7741c = new d0(-1, -1, "image/avif");
                return;
        }
    }

    @Override
    public final boolean b(p pVar) {
        switch (this.f7739a) {
            case 0:
                l lVar = (l) pVar;
                lVar.s(4, false);
                v vVar = this.f7740b;
                vVar.G(4);
                lVar.g(vVar.f7234a, 0, 4, false);
                if (vVar.z() != 1718909296) {
                    return false;
                }
                vVar.G(4);
                lVar.g(vVar.f7234a, 0, 4, false);
                if (vVar.z() != 1635150182) {
                    return false;
                }
                return true;
            case 1:
                l lVar2 = (l) pVar;
                lVar2.s(4, false);
                v vVar2 = this.f7740b;
                vVar2.G(4);
                lVar2.g(vVar2.f7234a, 0, 4, false);
                if (vVar2.z() != 1718909296) {
                    return false;
                }
                vVar2.G(4);
                lVar2.g(vVar2.f7234a, 0, 4, false);
                if (vVar2.z() != 1751476579) {
                    return false;
                }
                return true;
            default:
                v vVar3 = this.f7740b;
                vVar3.G(4);
                l lVar3 = (l) pVar;
                lVar3.g(vVar3.f7234a, 0, 4, false);
                if (vVar3.z() != 1380533830) {
                    return false;
                }
                lVar3.s(4, false);
                vVar3.G(4);
                lVar3.g(vVar3.f7234a, 0, 4, false);
                if (vVar3.z() != 1464156752) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final o c() {
        int i10 = this.f7739a;
        return this;
    }

    @Override
    public final void g(q qVar) {
        switch (this.f7739a) {
            case 0:
                this.f7741c.g(qVar);
                return;
            case 1:
                this.f7741c.g(qVar);
                return;
            default:
                this.f7741c.g(qVar);
                return;
        }
    }

    @Override
    public final void h(long j3, long j10) {
        switch (this.f7739a) {
            case 0:
                this.f7741c.h(j3, j10);
                return;
            case 1:
                this.f7741c.h(j3, j10);
                return;
            default:
                this.f7741c.h(j3, j10);
                return;
        }
    }

    @Override
    public final List i() {
        switch (this.f7739a) {
            case 0:
            case 1:
            default:
                g0 g0Var = i0.f7384b;
                return a1.e;
        }
    }

    @Override
    public final int m(p pVar, s sVar) {
        switch (this.f7739a) {
            case 0:
                return this.f7741c.m(pVar, sVar);
            case 1:
                return this.f7741c.m(pVar, sVar);
            default:
                return this.f7741c.m(pVar, sVar);
        }
    }

    @Override
    public final void release() {
        int i10 = this.f7739a;
    }

    private final void a() {
    }

    private final void d() {
    }

    private final void e() {
    }
}
