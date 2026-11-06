package jg;

import di.h7;
import org.telegram.messenger.qp;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.an;
public final class j1 implements p2 {
    public final m1 f16811a;

    public j1(m1 m1Var) {
        this.f16811a = m1Var;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void u(t2 t2Var) {
        m1 m1Var = this.f16811a;
        an anVar = m1Var.f16840f;
        if (qp.s1(m1Var.f16842r).P1().K(t2Var.getDialogId())) {
            anVar.getOrCreateStoryViewer().getClass();
            anVar.getOrCreateStoryViewer().J(m1Var.f16838c, t2Var.getDialogId(), h7.a((pj0) t2Var.getParent()));
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
