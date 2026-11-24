package defpackage;

import java.util.List;
public final class vy6 implements iz6, jz6 {
    public final byte a;
    public final oz6 b;
    public final int c;

    public vy6(oz6 oz6Var, int i, byte b) {
        this.a = b;
        this.b = oz6Var;
        this.c = i;
    }

    @Override
    public final void a(cf8 cf8Var, sw6 sw6Var, List list) {
        byte b = this.a;
        int i = this.c;
        oz6 oz6Var = this.b;
        switch (b) {
            case 1:
                cf8Var.Z(oz6Var.f(sw6Var, cf8Var, i), list);
                return;
            case 2:
                if (list.size() == 1) {
                    cf8Var.A0(oz6Var.f(sw6Var, cf8Var, i), (bt6) list.get(0));
                    return;
                } else {
                    cf8Var.r0(list, oz6Var.f(sw6Var, cf8Var, i), oz6Var.f(sw6Var, cf8Var, i + 1));
                    return;
                }
            default:
                cf8Var.Z(oz6Var.f(sw6Var, cf8Var, i), list);
                return;
        }
    }

    @Override
    public final void e(cf8 cf8Var, sw6 sw6Var) {
        byte b = this.a;
        int i = this.c;
        oz6 oz6Var = this.b;
        switch (b) {
            case 0:
                cf8Var.W(oz6Var.f(sw6Var, cf8Var, i));
                return;
            default:
                cf8Var.O(oz6Var.f(sw6Var, cf8Var, i));
                return;
        }
    }
}
