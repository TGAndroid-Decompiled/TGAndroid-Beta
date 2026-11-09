package jg;

import di.i7;
import org.telegram.messenger.qp;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.cn;
public final class j1 implements p2 {
    public final m1 f16814a;

    public j1(m1 m1Var) {
        this.f16814a = m1Var;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void u(t2 t2Var) {
        m1 m1Var = this.f16814a;
        cn cnVar = m1Var.f16843f;
        if (qp.s1(m1Var.f16845r).P1().K(t2Var.getDialogId())) {
            cnVar.getOrCreateStoryViewer().getClass();
            cnVar.getOrCreateStoryViewer().J(m1Var.f16841c, t2Var.getDialogId(), i7.a((qj0) t2Var.getParent()));
        }
    }

    @Override
    public final void l(t2 t2Var) {
    }

    @Override
    public final void r(t2 t2Var) {
    }

    @Override
    public final void w(t2 t2Var) {
    }

    @Override
    public final void q() {
    }
}
