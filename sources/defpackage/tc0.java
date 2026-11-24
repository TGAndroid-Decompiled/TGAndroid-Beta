package defpackage;

import java.util.List;
public final class tc0 implements j74 {
    public final byte a;
    public final xu7 b;
    public final qia c;

    public tc0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new xu7(4);
                this.c = new qia(-1, -1, "image/webp");
                return;
            default:
                this.b = new xu7(4);
                this.c = new qia(-1, -1, "image/avif");
                return;
        }
    }

    @Override
    public final j74 a() {
        byte b = this.a;
        return this;
    }

    @Override
    public final int b(k74 k74Var, m11 m11Var) {
        byte b = this.a;
        qia qiaVar = this.c;
        switch (b) {
            case 0:
                return qiaVar.b(k74Var, m11Var);
            default:
                return qiaVar.b(k74Var, m11Var);
        }
    }

    @Override
    public final boolean c(k74 k74Var) {
        byte b = this.a;
        xu7 xu7Var = this.b;
        switch (b) {
            case 0:
                ja3 ja3Var = (ja3) k74Var;
                ja3Var.a(4, false);
                xu7Var.K(4);
                ja3Var.d(xu7Var.a, 0, 4, false);
                if (xu7Var.C() == 1718909296) {
                    xu7Var.K(4);
                    ja3Var.d(xu7Var.a, 0, 4, false);
                    if (xu7Var.C() == 1635150182) {
                        return true;
                    }
                }
                return false;
            default:
                xu7Var.K(4);
                ja3 ja3Var2 = (ja3) k74Var;
                ja3Var2.d(xu7Var.a, 0, 4, false);
                if (xu7Var.C() == 1380533830) {
                    ja3Var2.a(4, false);
                    xu7Var.K(4);
                    ja3Var2.d(xu7Var.a, 0, 4, false);
                    if (xu7Var.C() == 1464156752) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public final void d(long j, long j2) {
        byte b = this.a;
        qia qiaVar = this.c;
        switch (b) {
            case 0:
                qiaVar.d(j, j2);
                return;
            default:
                qiaVar.d(j, j2);
                return;
        }
    }

    @Override
    public final List e() {
        byte b = this.a;
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        byte b = this.a;
        qia qiaVar = this.c;
        switch (b) {
            case 0:
                qiaVar.f(l74Var);
                return;
            default:
                qiaVar.f(l74Var);
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
