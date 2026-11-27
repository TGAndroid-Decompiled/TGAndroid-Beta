package defpackage;

import java.util.List;
public final class xy6 implements mz6, nz6, ot2 {
    public final sz6 a;
    public final int b;
    public final int c;

    public xy6(sz6 sz6Var, int i, int i2) {
        this.a = sz6Var;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void a(og8 og8Var, xw6 xw6Var, List list) {
        sz6 sz6Var = this.a;
        og8Var.r0(list, sz6Var.f(xw6Var, og8Var, this.b), sz6Var.f(xw6Var, og8Var, this.c));
    }

    @Override
    public final void accept(Object obj) {
        og8 og8Var = (og8) obj;
        sz6 sz6Var = this.a;
        ((yx6) sz6Var.a.get()).getClass();
        qz6 qz6Var = sz6Var.n;
        if (qz6Var != null) {
            qz6Var.setFixedSize(this.b, this.c);
        }
    }

    @Override
    public final void d(og8 og8Var, xw6 xw6Var) {
        sz6 sz6Var = this.a;
        og8Var.P(sz6Var.f(xw6Var, og8Var, this.b), sz6Var.f(xw6Var, og8Var, this.c));
    }
}
