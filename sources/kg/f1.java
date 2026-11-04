package kg;

import ei.i7;
import org.telegram.messenger.hp;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.wm;
public final class f1 implements p2 {
    public final i1 f17026a;

    public f1(i1 i1Var) {
        this.f17026a = i1Var;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void u(t2 t2Var) {
        i1 i1Var = this.f17026a;
        wm wmVar = i1Var.f17045f;
        if (hp.s1(i1Var.f17047r).P1().K(t2Var.getDialogId())) {
            wmVar.getOrCreateStoryViewer().getClass();
            wmVar.getOrCreateStoryViewer().R(i1Var.f17043c, t2Var.getDialogId(), i7.a((tj0) t2Var.getParent()));
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
