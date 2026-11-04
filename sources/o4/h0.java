package o4;

import android.os.Bundle;
import b8.yd;
public final class h0 implements n0 {
    public final int f20658a;
    public final o0 f20659b;

    public h0(o0 o0Var, int i3) {
        this.f20658a = i3;
        this.f20659b = o0Var;
    }

    @Override
    public final void c(v vVar) {
        int i3 = this.f20658a;
        o0 o0Var = this.f20659b;
        switch (i3) {
            case 0:
                o0Var.h.n(vVar);
                return;
            case 1:
                e0 e0Var = o0Var.h;
                if (e0Var.f20636t.S0() != null) {
                    kb.a aVar = e0Var.f20622e;
                    e0Var.s(vVar);
                    aVar.getClass();
                    yd.b(new r1(-6));
                    return;
                }
                return;
            case 2:
                o0Var.h.f20636t.S();
                return;
            case 3:
                o0Var.h.f20636t.D();
                return;
            case 4:
                o0Var.h.f20636t.J0();
                return;
            case 5:
                o0Var.h.f20636t.K0();
                return;
            case 6:
                o0Var.h.g(vVar, true);
                return;
            case 7:
                o0Var.h.f20636t.a();
                return;
            case 8:
                o0Var.h.f20636t.stop();
                return;
            case 9:
                e0 e0Var2 = o0Var.h;
                l1 l1Var = e0Var2.f20636t;
                if (g2.n0.c0(l1Var, e0Var2.f20632p)) {
                    g2.n0.J(l1Var);
                    return;
                } else if (l1Var != null && l1Var.m0(1)) {
                    l1Var.e();
                    return;
                } else {
                    return;
                }
            case 10:
                o0Var.h.f20636t.I0();
                return;
            case 11:
                o0Var.h.f20636t.d0();
                return;
            default:
                l1 l1Var2 = o0Var.h.f20636t;
                String str = g2.n0.f11873a;
                if (l1Var2 != null && l1Var2.m0(1)) {
                    l1Var2.e();
                    return;
                }
                return;
        }
    }

    public h0(o0 o0Var, d2.f1 f1Var) {
        this.f20658a = 1;
        this.f20659b = o0Var;
    }

    public h0(o0 o0Var, n1 n1Var, Bundle bundle) {
        this.f20658a = 0;
        this.f20659b = o0Var;
    }
}
