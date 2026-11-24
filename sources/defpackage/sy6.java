package defpackage;

import java.util.List;
public final class sy6 implements iz6, jz6, fu2 {
    public final oz6 a;
    public final int b;
    public final int c;

    public sy6(oz6 oz6Var, int i, int i2) {
        this.a = oz6Var;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void a(cf8 cf8Var, sw6 sw6Var, List list) {
        oz6 oz6Var = this.a;
        cf8Var.r0(list, oz6Var.f(sw6Var, cf8Var, this.b), oz6Var.f(sw6Var, cf8Var, this.c));
    }

    @Override
    public final void accept(Object obj) {
        cf8 cf8Var = (cf8) obj;
        oz6 oz6Var = this.a;
        ((tx6) oz6Var.a.get()).getClass();
        mz6 mz6Var = oz6Var.n;
        if (mz6Var != null) {
            mz6Var.setFixedSize(this.b, this.c);
        }
    }

    @Override
    public final void e(cf8 cf8Var, sw6 sw6Var) {
        oz6 oz6Var = this.a;
        cf8Var.P(oz6Var.f(sw6Var, cf8Var, this.b), oz6Var.f(sw6Var, cf8Var, this.c));
    }
}
