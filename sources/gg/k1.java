package gg;

import ai.v9;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.zn;
public final class k1 implements o2 {
    public final n1 f10710a;

    public k1(n1 n1Var) {
        this.f10710a = n1Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void f(s2 s2Var) {
        n1 n1Var = this.f10710a;
        zn znVar = n1Var.f10741f;
        if (MessagesController.getInstance(n1Var.f10743r).getStoriesController().I(s2Var.getDialogId())) {
            znVar.getOrCreateStoryViewer().getClass();
            znVar.getOrCreateStoryViewer().D(n1Var.f10739c, s2Var.getDialogId(), v9.a((qm0) s2Var.getParent()));
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
