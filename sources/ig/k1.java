package ig;

import di.q7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.wn;
public final class k1 implements l2 {
    public final n1 f14148a;

    public k1(n1 n1Var) {
        this.f14148a = n1Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void e(p2 p2Var) {
        n1 n1Var = this.f14148a;
        wn wnVar = n1Var.f14181f;
        if (MessagesController.getInstance(n1Var.f14183r).getStoriesController().K(p2Var.getDialogId())) {
            wnVar.getOrCreateStoryViewer().getClass();
            wnVar.getOrCreateStoryViewer().E(n1Var.f14180c, p2Var.getDialogId(), q7.a((nm0) p2Var.getParent()));
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void a(p2 p2Var) {
    }

    @Override
    public final void d(p2 p2Var) {
    }

    @Override
    public final void f(p2 p2Var) {
    }
}
