package defpackage;

import java.util.ArrayList;
public final class me9 extends fib {
    public final we9 F0;
    public final ye9 G0;

    public me9(ye9 ye9Var, we9 we9Var) {
        this.G0 = ye9Var;
        this.F0 = we9Var;
    }

    @Override
    public final boolean B() {
        ye9 ye9Var = this.G0;
        CharSequence q = ye9Var.v3.q();
        if (q != null && q.length() != 0) {
            ye9Var.f5(q);
            return true;
        }
        return true;
    }

    @Override
    public final void C() {
        ye9 ye9Var = this.G0;
        CharSequence q = ye9Var.v3.q();
        if (q != null && q.length() > 0) {
            ye9Var.f5(q);
        }
        ye9Var.A2();
    }

    @Override
    public final void E() {
        super.E();
        this.F0.e();
    }

    @Override
    public final void G() {
        this.G0.c4();
    }

    @Override
    public final boolean I() {
        if (Z()) {
            return true;
        }
        return this.G0.V4();
    }

    @Override
    public final void J(float f, float f2) {
        ye9 ye9Var = this.G0;
        ye9Var.A3 = true;
        ye9Var.B3 = f;
        ye9Var.C3 = f2;
    }

    @Override
    public final boolean i() {
        int size;
        String str;
        int length;
        ye9 ye9Var = this.G0;
        me9 me9Var = ye9Var.v3;
        ArrayList arrayList = ye9Var.t3;
        boolean z = false;
        if (!arrayList.isEmpty() && me9Var.w() && me9Var.p0 == 0 && me9Var.q0 == 0 && me9Var.r0 <= 0 && me9Var.s0 == (size = arrayList.size() - 1)) {
            lk0 lk0Var = (lk0) arrayList.get(size);
            if (wi9.n(lk0Var.b)) {
                str = yi9.l(wi9.h(lk0Var.b));
            } else {
                str = "";
            }
            int i = !str.isEmpty();
            if (me9Var.t0 == i) {
                if (i == 1) {
                    length = str.length();
                } else {
                    length = wi9.y(lk0Var.b).length();
                }
                if (me9Var.u0 >= length) {
                    z = true;
                }
            }
        }
        return !z;
    }

    @Override
    public final int n() {
        return this.G0.getPaddingBottom();
    }

    @Override
    public final int o() {
        return this.G0.getPaddingTop();
    }
}
