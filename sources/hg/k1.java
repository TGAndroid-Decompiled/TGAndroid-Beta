package hg;

import ci.r7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.im0;
import org.telegram.ui.sn;
public final class k1 implements n2 {
    public final n1 f11964a;

    public k1(n1 n1Var) {
        this.f11964a = n1Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void f(r2 r2Var) {
        n1 n1Var = this.f11964a;
        sn snVar = n1Var.f11995f;
        if (MessagesController.getInstance(n1Var.f11997r).getStoriesController().I(r2Var.getDialogId())) {
            snVar.getOrCreateStoryViewer().getClass();
            snVar.getOrCreateStoryViewer().D(n1Var.f11994c, r2Var.getDialogId(), r7.a((im0) r2Var.getParent()));
        }
    }

    @Override
    public final void a(r2 r2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void e(r2 r2Var) {
    }

    @Override
    public final void g(r2 r2Var) {
    }
}
