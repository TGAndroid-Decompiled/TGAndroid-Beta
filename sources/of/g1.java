package of;

import ih.e7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.qn;
public final class g1 implements n2 {
    public final j1 f19356a;

    public g1(j1 j1Var) {
        this.f19356a = j1Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void e(r2 r2Var) {
        j1 j1Var = this.f19356a;
        qn qnVar = j1Var.f19378f;
        if (MessagesController.getInstance(j1Var.f19380r).getStoriesController().I(r2Var.getDialogId())) {
            qnVar.getOrCreateStoryViewer().getClass();
            qnVar.getOrCreateStoryViewer().D(j1Var.f19376c, r2Var.getDialogId(), e7.a((wk0) r2Var.getParent()));
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
