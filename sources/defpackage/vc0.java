package defpackage;

import java.util.List;
public final class vc0 implements e84 {
    public final byte a;
    public final ey7 b;
    public final lma c;

    public vc0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new ey7(4);
                this.c = new lma(-1, -1, "image/webp");
                return;
            default:
                this.b = new ey7(4);
                this.c = new lma(-1, -1, "image/avif");
                return;
        }
    }

    @Override
    public final e84 a() {
        byte b = this.a;
        return this;
    }

    @Override
    public final int b(f84 f84Var, v11 v11Var) {
        byte b = this.a;
        lma lmaVar = this.c;
        switch (b) {
            case 0:
                return lmaVar.b(f84Var, v11Var);
            default:
                return lmaVar.b(f84Var, v11Var);
        }
    }

    @Override
    public final boolean c(f84 f84Var) {
        byte b = this.a;
        ey7 ey7Var = this.b;
        switch (b) {
            case 0:
                cb3 cb3Var = (cb3) f84Var;
                cb3Var.a(4, false);
                ey7Var.K(4);
                cb3Var.d(ey7Var.a, 0, 4, false);
                if (ey7Var.C() == 1718909296) {
                    ey7Var.K(4);
                    cb3Var.d(ey7Var.a, 0, 4, false);
                    if (ey7Var.C() == 1635150182) {
                        return true;
                    }
                }
                return false;
            default:
                ey7Var.K(4);
                cb3 cb3Var2 = (cb3) f84Var;
                cb3Var2.d(ey7Var.a, 0, 4, false);
                if (ey7Var.C() == 1380533830) {
                    cb3Var2.a(4, false);
                    ey7Var.K(4);
                    cb3Var2.d(ey7Var.a, 0, 4, false);
                    if (ey7Var.C() == 1464156752) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public final void d(long j, long j2) {
        byte b = this.a;
        lma lmaVar = this.c;
        switch (b) {
            case 0:
                lmaVar.d(j, j2);
                return;
            default:
                lmaVar.d(j, j2);
                return;
        }
    }

    @Override
    public final List e() {
        byte b = this.a;
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        byte b = this.a;
        lma lmaVar = this.c;
        switch (b) {
            case 0:
                lmaVar.f(g84Var);
                return;
            default:
                lmaVar.f(g84Var);
                return;
        }
    }

    @Override
    public final void release() {
        byte b = this.a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
