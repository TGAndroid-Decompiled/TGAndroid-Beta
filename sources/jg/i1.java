package jg;

import fi.y6;
import org.telegram.messenger.mp;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.bn;
public final class i1 implements p2 {
    public final l1 f17539a;

    public i1(l1 l1Var) {
        this.f17539a = l1Var;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void u(t2 t2Var) {
        l1 l1Var = this.f17539a;
        bn bnVar = l1Var.f17569f;
        if (mp.u1(l1Var.f17571r).R1().K(t2Var.getDialogId())) {
            bnVar.getOrCreateStoryViewer().getClass();
            bnVar.getOrCreateStoryViewer().J(l1Var.f17567c, t2Var.getDialogId(), y6.a((ck0) t2Var.getParent()));
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
