package gg;

import ai.u9;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.xn;
public final class l1 implements n2 {
    public final o1 f9832a;

    public l1(o1 o1Var) {
        this.f9832a = o1Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void e(r2 r2Var) {
        o1 o1Var = this.f9832a;
        xn xnVar = o1Var.f9860f;
        if (MessagesController.getInstance(o1Var.f9862r).getStoriesController().I(r2Var.getDialogId())) {
            xnVar.getOrCreateStoryViewer().getClass();
            xnVar.getOrCreateStoryViewer().D(o1Var.f9859c, r2Var.getDialogId(), u9.a((ml0) r2Var.getParent()));
        }
    }

    @Override
    public final void a(r2 r2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(r2 r2Var) {
    }

    @Override
    public final void f(r2 r2Var) {
    }
}
