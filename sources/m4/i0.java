package m4;

import android.os.Bundle;
import v7.q8;
public final class i0 implements p0 {
    public final int f15458a;
    public final q0 f15459b;

    public i0(q0 q0Var, int i10) {
        this.f15458a = i10;
        this.f15459b = q0Var;
    }

    @Override
    public final void f(w wVar) {
        int i10 = this.f15458a;
        q0 q0Var = this.f15459b;
        switch (i10) {
            case 0:
                q0Var.f15573g.n(wVar);
                return;
            case 1:
                f0 f0Var = q0Var.f15573g;
                if (f0Var.f15440t.S0() != null) {
                    pb.a aVar = f0Var.e;
                    f0Var.s(wVar);
                    aVar.getClass();
                    q8.b(new t1(-6));
                    return;
                }
                return;
            case 2:
                q0Var.f15573g.f15440t.V();
                return;
            case 3:
                q0Var.f15573g.f15440t.E();
                return;
            case 4:
                q0Var.f15573g.f15440t.I0();
                return;
            case 5:
                q0Var.f15573g.f15440t.J0();
                return;
            case 6:
                q0Var.f15573g.g(wVar, true);
                return;
            case 7:
                q0Var.f15573g.f15440t.b();
                return;
            case 8:
                q0Var.f15573g.f15440t.stop();
                return;
            case 9:
                f0 f0Var2 = q0Var.f15573g;
                n1 n1Var = f0Var2.f15440t;
                if (e2.m0.c0(n1Var, f0Var2.f15436p)) {
                    e2.m0.J(n1Var);
                    return;
                } else if (n1Var != null && n1Var.o0(1)) {
                    n1Var.e();
                    return;
                } else {
                    return;
                }
            case 10:
                q0Var.f15573g.f15440t.H0();
                return;
            case 11:
                q0Var.f15573g.f15440t.f0();
                return;
            default:
                n1 n1Var2 = q0Var.f15573g.f15440t;
                String str = e2.m0.f8372a;
                if (n1Var2 != null && n1Var2.o0(1)) {
                    n1Var2.e();
                    return;
                }
                return;
        }
    }

    public i0(q0 q0Var, b2.h1 h1Var) {
        this.f15458a = 1;
        this.f15459b = q0Var;
    }

    public i0(q0 q0Var, p1 p1Var, Bundle bundle) {
        this.f15458a = 0;
        this.f15459b = q0Var;
    }
}
