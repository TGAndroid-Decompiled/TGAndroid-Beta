package jg;

import fi.y6;
import org.telegram.messenger.mp;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.bn;
public final class i1 implements q2 {
    public final l1 f17632a;

    public i1(l1 l1Var) {
        this.f17632a = l1Var;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void u(u2 u2Var) {
        l1 l1Var = this.f17632a;
        bn bnVar = l1Var.f17662f;
        if (mp.u1(l1Var.f17664r).R1().K(u2Var.getDialogId())) {
            bnVar.getOrCreateStoryViewer().getClass();
            bnVar.getOrCreateStoryViewer().J(l1Var.f17660c, u2Var.getDialogId(), y6.a((ek0) u2Var.getParent()));
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
