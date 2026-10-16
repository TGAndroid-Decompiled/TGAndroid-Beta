package m4;

import android.os.Bundle;
import v7.q8;
public final class h0 implements o0 {
    public final int f15188a;
    public final p0 f15189b;

    public h0(p0 p0Var, int i10) {
        this.f15188a = i10;
        this.f15189b = p0Var;
    }

    @Override
    public final void e(v vVar) {
        int i10 = this.f15188a;
        p0 p0Var = this.f15189b;
        switch (i10) {
            case 0:
                p0Var.f15303g.n(vVar);
                return;
            case 1:
                e0 e0Var = p0Var.f15303g;
                if (e0Var.f15170t.S0() != null) {
                    pb.a aVar = e0Var.e;
                    e0Var.s(vVar);
                    aVar.getClass();
                    q8.b(new s1(-6));
                    return;
                }
                return;
            case 2:
                p0Var.f15303g.f15170t.V();
                return;
            case 3:
                p0Var.f15303g.f15170t.E();
                return;
            case 4:
                p0Var.f15303g.f15170t.I0();
                return;
            case 5:
                p0Var.f15303g.f15170t.J0();
                return;
            case 6:
                p0Var.f15303g.g(vVar, true);
                return;
            case 7:
                p0Var.f15303g.f15170t.b();
                return;
            case 8:
                p0Var.f15303g.f15170t.stop();
                return;
            case 9:
                e0 e0Var2 = p0Var.f15303g;
                m1 m1Var = e0Var2.f15170t;
                if (e2.m0.c0(m1Var, e0Var2.f15166p)) {
                    e2.m0.J(m1Var);
                    return;
                } else if (m1Var != null && m1Var.o0(1)) {
                    m1Var.e();
                    return;
                } else {
                    return;
                }
            case 10:
                p0Var.f15303g.f15170t.H0();
                return;
            case 11:
                p0Var.f15303g.f15170t.f0();
                return;
            default:
                m1 m1Var2 = p0Var.f15303g.f15170t;
                String str = e2.m0.f8375a;
                if (m1Var2 != null && m1Var2.o0(1)) {
                    m1Var2.e();
                    return;
                }
                return;
        }
    }

    public h0(p0 p0Var, b2.h1 h1Var) {
        this.f15188a = 1;
        this.f15189b = p0Var;
    }

    public h0(p0 p0Var, o1 o1Var, Bundle bundle) {
        this.f15188a = 0;
        this.f15189b = p0Var;
    }
}
