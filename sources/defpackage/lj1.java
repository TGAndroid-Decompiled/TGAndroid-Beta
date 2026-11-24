package defpackage;

import android.view.View;
import java.io.Serializable;
public final class lj1 implements bja, ee, oac {
    public final ik1 a;

    public lj1(ik1 ik1Var) {
        this.a = ik1Var;
    }

    @Override
    public final int b() {
        return this.a.R0;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        ik1 ik1Var = this.a;
        mj1 mj1Var = ik1Var.s1;
        int i = ik1Var.o0;
        long j = ik1Var.p0;
        int i2 = ((c6c) obj).d;
        if (i2 == 1) {
            if (ik1Var.r0 < oc7.r1(i).l4.T1.f()) {
                if (ik1Var.q0 != null) {
                    xza xzaVar = ik1Var.m0;
                    i46 i46Var = new i46(30, ik1Var.o0, ik1Var.n0, ik1Var.getContext(), xzaVar);
                    i46Var.s1(j);
                    i46Var.q1(ik1Var.q0, true);
                    oc7.r1(i).F0().b(j, ik1Var.q0, new x0(ik1Var, i46Var, (byte) 17));
                    return;
                }
                return;
            }
            ik1Var.j1 = !ik1Var.j1;
            gm.r(mj1Var);
            gm.d3(mj1Var, 1000L);
            ik1Var.X0.g3.O(true);
        } else if (i2 == 4) {
            ik1Var.m0.presentFragment(new mh1(j));
        }
    }

    @Override
    public final void r(he heVar, int i) {
        this.a.m0.presentFragment(new p5c(6, null));
    }
}
