package ig;

import di.q7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.un;
public final class k1 implements l2 {
    public final n1 f14149a;

    public k1(n1 n1Var) {
        this.f14149a = n1Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void e(p2 p2Var) {
        n1 n1Var = this.f14149a;
        un unVar = n1Var.f14182f;
        if (MessagesController.getInstance(n1Var.f14184r).getStoriesController().I(p2Var.getDialogId())) {
            unVar.getOrCreateStoryViewer().getClass();
            unVar.getOrCreateStoryViewer().D(n1Var.f14181c, p2Var.getDialogId(), q7.a((mm0) p2Var.getParent()));
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
