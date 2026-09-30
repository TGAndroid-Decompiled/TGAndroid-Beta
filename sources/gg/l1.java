package gg;

import ai.u9;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.wn;
public final class l1 implements o2 {
    public final o1 f9843a;

    public l1(o1 o1Var) {
        this.f9843a = o1Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void e(s2 s2Var) {
        o1 o1Var = this.f9843a;
        wn wnVar = o1Var.f9871f;
        if (MessagesController.getInstance(o1Var.f9873r).getStoriesController().I(s2Var.getDialogId())) {
            wnVar.getOrCreateStoryViewer().getClass();
            wnVar.getOrCreateStoryViewer().D(o1Var.f9870c, s2Var.getDialogId(), u9.a((zl0) s2Var.getParent()));
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
    public final void f(s2 s2Var) {
    }
}
