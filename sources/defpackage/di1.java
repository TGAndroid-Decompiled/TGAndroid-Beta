package defpackage;

import android.view.View;
import java.io.Serializable;
public final class di1 implements zga, ed, n8c {
    public final zi1 a;

    public di1(zi1 zi1Var) {
        this.a = zi1Var;
    }

    @Override
    public final int b() {
        return this.a.R0;
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        zi1 zi1Var = this.a;
        ei1 ei1Var = zi1Var.s1;
        int i = zi1Var.o0;
        long j = zi1Var.p0;
        int i2 = ((c4c) obj).d;
        if (i2 == 1) {
            if (zi1Var.r0 < na7.q1(i).k4.T1.f()) {
                if (zi1Var.q0 != null) {
                    uxa uxaVar = zi1Var.m0;
                    h26 h26Var = new h26(30, zi1Var.o0, zi1Var.n0, zi1Var.getContext(), uxaVar);
                    h26Var.s1(j);
                    h26Var.q1(zi1Var.q0, true);
                    na7.q1(i).E0().b(j, zi1Var.q0, new x0(zi1Var, h26Var, (byte) 16));
                    return;
                }
                return;
            }
            zi1Var.j1 = !zi1Var.j1;
            gl.r(ei1Var);
            gl.d3(ei1Var, 1000L);
            zi1Var.X0.g3.O(true);
        } else if (i2 == 4) {
            zi1Var.m0.presentFragment(new eg1(j));
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        this.a.m0.presentFragment(new p3c(6, null));
    }
}
