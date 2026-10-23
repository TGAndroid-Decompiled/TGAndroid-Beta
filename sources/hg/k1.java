package hg;

import ci.q7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.sn;
public final class k1 implements m2 {
    public final n1 f11989a;

    public k1(n1 n1Var) {
        this.f11989a = n1Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void e(q2 q2Var) {
        n1 n1Var = this.f11989a;
        sn snVar = n1Var.f12019f;
        if (MessagesController.getInstance(n1Var.f12021r).getStoriesController().I(q2Var.getDialogId())) {
            snVar.getOrCreateStoryViewer().getClass();
            snVar.getOrCreateStoryViewer().D(n1Var.f12018c, q2Var.getDialogId(), q7.a((mm0) q2Var.getParent()));
        }
    }

    @Override
    public final void a(q2 q2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(q2 q2Var) {
    }

    @Override
    public final void f(q2 q2Var) {
    }
}
