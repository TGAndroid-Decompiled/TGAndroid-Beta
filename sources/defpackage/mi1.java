package defpackage;

import android.view.View;
import java.io.Serializable;
public final class mi1 implements ska, fd, ncc {
    public final ij1 a;

    public mi1(ij1 ij1Var) {
        this.a = ij1Var;
    }

    @Override
    public final int c() {
        return this.a.R0;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        ij1 ij1Var = this.a;
        ni1 ni1Var = ij1Var.s1;
        int i = ij1Var.o0;
        long j = ij1Var.p0;
        int i2 = ((b8c) obj).d;
        if (i2 == 1) {
            if (ij1Var.r0 < uc7.s1(i).l4.b2.f()) {
                if (ij1Var.q0 != null) {
                    w1b w1bVar = ij1Var.m0;
                    l46 l46Var = new l46(30, ij1Var.o0, ij1Var.n0, ij1Var.getContext(), w1bVar);
                    l46Var.t1(j);
                    l46Var.r1(ij1Var.q0, true);
                    uc7.s1(i).G0().b(j, ij1Var.q0, new y0(ij1Var, l46Var, (byte) 16));
                    return;
                }
                return;
            }
            ij1Var.j1 = !ij1Var.j1;
            hl.r(ni1Var);
            hl.d3(ni1Var, 1000L);
            ij1Var.X0.g3.O(true);
        } else if (i2 == 4) {
            ij1Var.m0.presentFragment(new ng1(j));
        }
    }

    @Override
    public final void w(id idVar, int i) {
        this.a.m0.presentFragment(new o7c(6, null));
    }
}
