package fg;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.eo;
import zh.s5;
public final class m1 implements n2 {
    public final p1 f8147a;

    public m1(p1 p1Var) {
        this.f8147a = p1Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void e(r2 r2Var) {
        p1 p1Var = this.f8147a;
        eo eoVar = p1Var.f8170f;
        if (MessagesController.getInstance(p1Var.f8172r).getStoriesController().I(r2Var.getDialogId())) {
            eoVar.getOrCreateStoryViewer().getClass();
            eoVar.getOrCreateStoryViewer().D(p1Var.f8169c, r2Var.getDialogId(), s5.a((vl0) r2Var.getParent()));
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
