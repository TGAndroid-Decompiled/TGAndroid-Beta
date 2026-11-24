package defpackage;

import java.util.ArrayList;
public final class nd5 implements au9 {
    public final od5 a;

    public nd5(od5 od5Var) {
        this.a = od5Var;
    }

    @Override
    public final boolean F1(int i) {
        return true;
    }

    @Override
    public final vh6 G0() {
        return this.a.x.Y1;
    }

    @Override
    public final vh6 e1() {
        return null;
    }

    @Override
    public final void o(int i) {
        od5 od5Var = this.a;
        pd5 pd5Var = od5Var.x;
        if (i >= 0 && i == od5Var.n && !od5Var.h) {
            boolean z = true;
            int i2 = od5Var.f - 1;
            if (pd5Var.t1.getVisibility() != 0) {
                z = false;
            }
            od5Var.f();
            if (od5Var.f > i2) {
                pd5Var.J0(i2);
            }
            if (!od5Var.d.e() && pd5Var.n1.S0()) {
                pd5Var.t1.e(false, z);
            }
        }
    }

    @Override
    public final void a2(ArrayList arrayList) {
    }
}
