package jg;

import fi.b7;
import org.telegram.messenger.np;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.an;
public final class i1 implements p2 {
    public final l1 f17153a;

    public i1(l1 l1Var) {
        this.f17153a = l1Var;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void u(t2 t2Var) {
        l1 l1Var = this.f17153a;
        an anVar = l1Var.f17183f;
        if (np.s1(l1Var.f17185r).P1().K(t2Var.getDialogId())) {
            anVar.getOrCreateStoryViewer().getClass();
            anVar.getOrCreateStoryViewer().J(l1Var.f17181c, t2Var.getDialogId(), b7.a((uj0) t2Var.getParent()));
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
