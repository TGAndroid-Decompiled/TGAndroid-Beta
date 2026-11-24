package defpackage;

import java.util.ArrayList;
public final class qg9 extends gkb {
    public final ah9 F0;
    public final ch9 G0;

    public qg9(ch9 ch9Var, ah9 ah9Var) {
        this.G0 = ch9Var;
        this.F0 = ah9Var;
    }

    @Override
    public final boolean B() {
        ch9 ch9Var = this.G0;
        CharSequence q = ch9Var.v3.q();
        if (q != null && q.length() != 0) {
            ch9Var.f5(q);
            return true;
        }
        return true;
    }

    @Override
    public final void C() {
        ch9 ch9Var = this.G0;
        CharSequence q = ch9Var.v3.q();
        if (q != null && q.length() > 0) {
            ch9Var.f5(q);
        }
        ch9Var.A2();
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
        ch9 ch9Var = this.G0;
        ch9Var.A3 = true;
        ch9Var.B3 = f;
        ch9Var.C3 = f2;
    }

    @Override
    public final boolean i() {
        int size;
        String str;
        int length;
        ch9 ch9Var = this.G0;
        qg9 qg9Var = ch9Var.v3;
        ArrayList arrayList = ch9Var.t3;
        boolean z = false;
        if (!arrayList.isEmpty() && qg9Var.w() && qg9Var.p0 == 0 && qg9Var.q0 == 0 && qg9Var.r0 <= 0 && qg9Var.s0 == (size = arrayList.size() - 1)) {
            ll0 ll0Var = (ll0) arrayList.get(size);
            if (xk9.n(ll0Var.b)) {
                str = zk9.l(xk9.h(ll0Var.b));
            } else {
                str = "";
            }
            int i = !str.isEmpty();
            if (qg9Var.t0 == i) {
                if (i == 1) {
                    length = str.length();
                } else {
                    length = xk9.y(ll0Var.b).length();
                }
                if (qg9Var.u0 >= length) {
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
