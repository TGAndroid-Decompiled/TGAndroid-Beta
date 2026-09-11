package hg;

import bi.d9;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.co;
public final class l1 implements n2 {
    public final o1 f11164a;

    public l1(o1 o1Var) {
        this.f11164a = o1Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void e(r2 r2Var) {
        o1 o1Var = this.f11164a;
        co coVar = o1Var.f11195f;
        if (MessagesController.getInstance(o1Var.f11197r).getStoriesController().I(r2Var.getDialogId())) {
            coVar.getOrCreateStoryViewer().getClass();
            coVar.getOrCreateStoryViewer().D(o1Var.f11193c, r2Var.getDialogId(), d9.a((ll0) r2Var.getParent()));
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
