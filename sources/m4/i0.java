package m4;

import android.os.Bundle;
import v7.q8;
public final class i0 implements o0 {
    public final int f16561a;
    public final p0 f16562b;

    public i0(p0 p0Var, int i10) {
        this.f16561a = i10;
        this.f16562b = p0Var;
    }

    @Override
    public final void f(v vVar) {
        int i10 = this.f16561a;
        p0 p0Var = this.f16562b;
        switch (i10) {
            case 0:
                p0Var.f16661g.n(vVar);
                return;
            case 1:
                f0 f0Var = p0Var.f16661g;
                if (f0Var.f16534t.S0() != null) {
                    pb.a aVar = f0Var.e;
                    f0Var.s(vVar);
                    aVar.getClass();
                    q8.b(new s1(-6));
                    return;
                }
                return;
            case 2:
                p0Var.f16661g.f16534t.V();
                return;
            case 3:
                p0Var.f16661g.f16534t.E();
                return;
            case 4:
                p0Var.f16661g.f16534t.I0();
                return;
            case 5:
                p0Var.f16661g.f16534t.J0();
                return;
            case 6:
                p0Var.f16661g.g(vVar, true);
                return;
            case 7:
                p0Var.f16661g.f16534t.b();
                return;
            case 8:
                p0Var.f16661g.f16534t.stop();
                return;
            case 9:
                f0 f0Var2 = p0Var.f16661g;
                m1 m1Var = f0Var2.f16534t;
                if (e2.m0.c0(m1Var, f0Var2.f16530p)) {
                    e2.m0.J(m1Var);
                    return;
                } else if (m1Var != null && m1Var.o0(1)) {
                    m1Var.e();
                    return;
                } else {
                    return;
                }
            case 10:
                p0Var.f16661g.f16534t.H0();
                return;
            case 11:
                p0Var.f16661g.f16534t.f0();
                return;
            default:
                m1 m1Var2 = p0Var.f16661g.f16534t;
                String str = e2.m0.f8252a;
                if (m1Var2 != null && m1Var2.o0(1)) {
                    m1Var2.e();
                    return;
                }
                return;
        }
    }

    public i0(p0 p0Var, b2.g1 g1Var) {
        this.f16561a = 1;
        this.f16562b = p0Var;
    }

    public i0(p0 p0Var, o1 o1Var, Bundle bundle) {
        this.f16561a = 0;
        this.f16562b = p0Var;
    }
}
