package hg;

import bi.g9;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.fo;
public final class k1 implements o2 {
    public final n1 f10657a;

    public k1(n1 n1Var) {
        this.f10657a = n1Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void f(s2 s2Var) {
        n1 n1Var = this.f10657a;
        fo foVar = n1Var.f10685f;
        if (MessagesController.getInstance(n1Var.f10687r).getStoriesController().I(s2Var.getDialogId())) {
            foVar.getOrCreateStoryViewer().getClass();
            foVar.getOrCreateStoryViewer().D(n1Var.f10684c, s2Var.getDialogId(), g9.a((mm0) s2Var.getParent()));
        }
    }

    @Override
    public final void a(s2 s2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void e(s2 s2Var) {
    }

    @Override
    public final void g(s2 s2Var) {
    }
}
