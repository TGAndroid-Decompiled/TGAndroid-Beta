package defpackage;

import java.util.ArrayList;
public final class qd5 implements rv9 {
    public final rd5 a;

    public qd5(rd5 rd5Var) {
        this.a = rd5Var;
    }

    @Override
    public final boolean C1(int i) {
        return true;
    }

    @Override
    public final zh6 D0() {
        return this.a.x.Y1;
    }

    @Override
    public final zh6 Z0() {
        return null;
    }

    @Override
    public final void p(int i) {
        rd5 rd5Var = this.a;
        sd5 sd5Var = rd5Var.x;
        if (i >= 0 && i == rd5Var.n && !rd5Var.h) {
            boolean z = true;
            int i2 = rd5Var.f - 1;
            if (sd5Var.t1.getVisibility() != 0) {
                z = false;
            }
            rd5Var.f();
            if (rd5Var.f > i2) {
                sd5Var.K0(i2);
            }
            if (!rd5Var.d.e() && sd5Var.n1.T0()) {
                sd5Var.t1.e(false, z);
            }
        }
    }

    @Override
    public final void X1(ArrayList arrayList) {
    }
}
