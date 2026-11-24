package defpackage;

import java.util.List;
public final class vw6 implements ix6, jx6 {
    public final byte a;
    public final ox6 b;
    public final int c;

    public vw6(ox6 ox6Var, int i, byte b) {
        this.a = b;
        this.b = ox6Var;
        this.c = i;
    }

    @Override
    public final void b(ad8 ad8Var, su6 su6Var, List list) {
        byte b = this.a;
        int i = this.c;
        ox6 ox6Var = this.b;
        switch (b) {
            case 1:
                ad8Var.Z(ox6Var.f(su6Var, ad8Var, i), list);
                return;
            case 2:
                if (list.size() == 1) {
                    ad8Var.A0(ox6Var.f(su6Var, ad8Var, i), (br6) list.get(0));
                    return;
                } else {
                    ad8Var.r0(list, ox6Var.f(su6Var, ad8Var, i), ox6Var.f(su6Var, ad8Var, i + 1));
                    return;
                }
            default:
                ad8Var.Z(ox6Var.f(su6Var, ad8Var, i), list);
                return;
        }
    }

    @Override
    public final void g(ad8 ad8Var, su6 su6Var) {
        byte b = this.a;
        int i = this.c;
        ox6 ox6Var = this.b;
        switch (b) {
            case 0:
                ad8Var.W(ox6Var.f(su6Var, ad8Var, i));
                return;
            default:
                ad8Var.O(ox6Var.f(su6Var, ad8Var, i));
                return;
        }
    }
}
