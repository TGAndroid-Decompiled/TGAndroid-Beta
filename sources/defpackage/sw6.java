package defpackage;

import java.util.List;
public final class sw6 implements ix6, jx6, us2 {
    public final ox6 a;
    public final int b;
    public final int c;

    public sw6(ox6 ox6Var, int i, int i2) {
        this.a = ox6Var;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void accept(Object obj) {
        ad8 ad8Var = (ad8) obj;
        ox6 ox6Var = this.a;
        ((tv6) ox6Var.a.get()).getClass();
        mx6 mx6Var = ox6Var.n;
        if (mx6Var != null) {
            mx6Var.setFixedSize(this.b, this.c);
        }
    }

    @Override
    public final void b(ad8 ad8Var, su6 su6Var, List list) {
        ox6 ox6Var = this.a;
        ad8Var.r0(list, ox6Var.f(su6Var, ad8Var, this.b), ox6Var.f(su6Var, ad8Var, this.c));
    }

    @Override
    public final void g(ad8 ad8Var, su6 su6Var) {
        ox6 ox6Var = this.a;
        ad8Var.P(ox6Var.f(su6Var, ad8Var, this.b), ox6Var.f(su6Var, ad8Var, this.c));
    }
}
