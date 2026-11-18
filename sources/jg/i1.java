package jg;

import fi.y6;
import org.telegram.messenger.mp;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.bn;
public final class i1 implements q2 {
    public final l1 f17536a;

    public i1(l1 l1Var) {
        this.f17536a = l1Var;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void u(u2 u2Var) {
        l1 l1Var = this.f17536a;
        bn bnVar = l1Var.f17566f;
        if (mp.u1(l1Var.f17568r).R1().K(u2Var.getDialogId())) {
            bnVar.getOrCreateStoryViewer().getClass();
            bnVar.getOrCreateStoryViewer().J(l1Var.f17564c, u2Var.getDialogId(), y6.a((ck0) u2Var.getParent()));
        }
    }

    @Override
    public final void l(u2 u2Var) {
    }

    @Override
    public final void r(u2 u2Var) {
    }

    @Override
    public final void w(u2 u2Var) {
    }

    @Override
    public final void q() {
    }
}
