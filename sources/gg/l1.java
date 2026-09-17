package gg;

import ai.u9;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.bo;
public final class l1 implements n2 {
    public final o1 f9850a;

    public l1(o1 o1Var) {
        this.f9850a = o1Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void e(r2 r2Var) {
        o1 o1Var = this.f9850a;
        bo boVar = o1Var.f9878f;
        if (MessagesController.getInstance(o1Var.f9880r).getStoriesController().I(r2Var.getDialogId())) {
            boVar.getOrCreateStoryViewer().getClass();
            boVar.getOrCreateStoryViewer().D(o1Var.f9877c, r2Var.getDialogId(), u9.a((ml0) r2Var.getParent()));
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
