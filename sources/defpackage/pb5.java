package defpackage;

import java.util.ArrayList;
public final class pb5 implements yr9 {
    public final qb5 a;

    public pb5(qb5 qb5Var) {
        this.a = qb5Var;
    }

    @Override
    public final vf6 O0() {
        return this.a.x.Y1;
    }

    @Override
    public final boolean U1(int i) {
        return true;
    }

    @Override
    public final void r(int i) {
        qb5 qb5Var = this.a;
        rb5 rb5Var = qb5Var.x;
        if (i >= 0 && i == qb5Var.n && !qb5Var.h) {
            boolean z = true;
            int i2 = qb5Var.f - 1;
            if (rb5Var.t1.getVisibility() != 0) {
                z = false;
            }
            qb5Var.f();
            if (qb5Var.f > i2) {
                rb5Var.J0(i2);
            }
            if (!qb5Var.d.e() && rb5Var.n1.S0()) {
                rb5Var.t1.e(false, z);
            }
        }
    }

    @Override
    public final vf6 t1() {
        return null;
    }

    @Override
    public final void m2(ArrayList arrayList) {
    }
}
