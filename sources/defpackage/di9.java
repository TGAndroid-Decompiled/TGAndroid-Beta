package defpackage;

import java.util.ArrayList;
public final class di9 extends amb {
    public final ni9 F0;
    public final pi9 G0;

    public di9(pi9 pi9Var, ni9 ni9Var) {
        this.G0 = pi9Var;
        this.F0 = ni9Var;
    }

    @Override
    public final boolean B() {
        pi9 pi9Var = this.G0;
        CharSequence q = pi9Var.v3.q();
        if (q != null && q.length() != 0) {
            pi9Var.g5(q);
            return true;
        }
        return true;
    }

    @Override
    public final void C() {
        pi9 pi9Var = this.G0;
        CharSequence q = pi9Var.v3.q();
        if (q != null && q.length() > 0) {
            pi9Var.g5(q);
        }
        pi9Var.B2();
    }

    @Override
    public final void E() {
        super.E();
        this.F0.f();
    }

    @Override
    public final void G() {
        this.G0.d4();
    }

    @Override
    public final boolean I() {
        if (Z()) {
            return true;
        }
        return this.G0.W4();
    }

    @Override
    public final void J(float f, float f2) {
        pi9 pi9Var = this.G0;
        pi9Var.A3 = true;
        pi9Var.B3 = f;
        pi9Var.C3 = f2;
    }

    @Override
    public final boolean i() {
        int size;
        String str;
        int length;
        pi9 pi9Var = this.G0;
        di9 di9Var = pi9Var.v3;
        ArrayList arrayList = pi9Var.t3;
        boolean z = false;
        if (!arrayList.isEmpty() && di9Var.w() && di9Var.p0 == 0 && di9Var.q0 == 0 && di9Var.r0 <= 0 && di9Var.s0 == (size = arrayList.size() - 1)) {
            mk0 mk0Var = (mk0) arrayList.get(size);
            if (km9.n(mk0Var.b)) {
                str = mm9.l(km9.h(mk0Var.b));
            } else {
                str = "";
            }
            int i = !str.isEmpty();
            if (di9Var.t0 == i) {
                if (i == 1) {
                    length = str.length();
                } else {
                    length = km9.y(mk0Var.b).length();
                }
                if (di9Var.u0 >= length) {
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
