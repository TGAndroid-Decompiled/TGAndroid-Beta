package ch;

import android.view.ViewPropertyAnimator;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.o4;
public final class k extends i1 {
    public final ai.j0 f5100x;

    public k(ai.j0 j0Var, ai.j0 j0Var2) {
        super(j0Var2);
        this.f5100x = j0Var;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        o oVar = (o) this.f5100x.f1266c;
        o4 parentLayout = oVar.getParentLayout();
        z10 = ((e2) oVar).inPreviewMode;
        if (!z10 && !org.telegram.messenger.g0.Q1()) {
            z11 = ((e2) oVar).inBubbleMode;
            if (!z11 && !org.telegram.messenger.g0.E && parentLayout != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z10) {
        o oVar = (o) this.f5100x.f1266c;
        if (oVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) oVar.getParentLayout()).f28354n;
        }
    }

    @Override
    public final void g(int i7, boolean z10) {
        float f10;
        o oVar = (o) this.f5100x.f1266c;
        oVar.f5178w.setVisibility(0);
        ViewPropertyAnimator animate = oVar.f5178w.animate();
        if (!z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).withEndAction(new ai.q(1, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
