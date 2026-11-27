package defpackage;

import java.util.List;
public final class az6 implements mz6, nz6 {
    public final byte a;
    public final sz6 b;
    public final int c;

    public az6(sz6 sz6Var, int i, byte b) {
        this.a = b;
        this.b = sz6Var;
        this.c = i;
    }

    @Override
    public final void a(og8 og8Var, xw6 xw6Var, List list) {
        byte b = this.a;
        int i = this.c;
        sz6 sz6Var = this.b;
        switch (b) {
            case 1:
                og8Var.Z(sz6Var.f(xw6Var, og8Var, i), list);
                return;
            case 2:
                if (list.size() == 1) {
                    og8Var.A0(sz6Var.f(xw6Var, og8Var, i), (ft6) list.get(0));
                    return;
                } else {
                    og8Var.r0(list, sz6Var.f(xw6Var, og8Var, i), sz6Var.f(xw6Var, og8Var, i + 1));
                    return;
                }
            default:
                og8Var.Z(sz6Var.f(xw6Var, og8Var, i), list);
                return;
        }
    }

    @Override
    public final void d(og8 og8Var, xw6 xw6Var) {
        byte b = this.a;
        int i = this.c;
        sz6 sz6Var = this.b;
        switch (b) {
            case 0:
                og8Var.W(sz6Var.f(xw6Var, og8Var, i));
                return;
            default:
                og8Var.O(sz6Var.f(xw6Var, og8Var, i));
                return;
        }
    }
}
