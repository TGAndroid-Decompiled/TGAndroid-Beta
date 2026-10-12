package gg;

import ai.v9;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.eo;
public final class k1 implements o2 {
    public final n1 f10708a;

    public k1(n1 n1Var) {
        this.f10708a = n1Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void f(s2 s2Var) {
        n1 n1Var = this.f10708a;
        eo eoVar = n1Var.f10739f;
        if (MessagesController.getInstance(n1Var.f10741r).getStoriesController().I(s2Var.getDialogId())) {
            eoVar.getOrCreateStoryViewer().getClass();
            eoVar.getOrCreateStoryViewer().D(n1Var.f10737c, s2Var.getDialogId(), v9.a((wm0) s2Var.getParent()));
        }
    }

    @Override
    public final void a(s2 s2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(s2 s2Var) {
    }

    @Override
    public final void g(s2 s2Var) {
    }
}
