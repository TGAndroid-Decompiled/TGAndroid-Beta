package ch;

import android.view.ViewPropertyAnimator;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.r4;
public final class l extends i1 {
    public final ai.l0 f5428x;

    public l(ai.l0 l0Var, ai.l0 l0Var2) {
        super(l0Var2);
        this.f5428x = l0Var;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        p pVar = (p) this.f5428x.f1275c;
        r4 parentLayout = pVar.getParentLayout();
        z10 = ((g2) pVar).inPreviewMode;
        if (!z10 && !org.telegram.messenger.g0.Q1()) {
            z11 = ((g2) pVar).inBubbleMode;
            if (!z11 && !org.telegram.messenger.g0.E && parentLayout != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z10) {
        p pVar = (p) this.f5428x.f1275c;
        if (pVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) pVar.getParentLayout()).f28736n;
        }
    }

    @Override
    public final void g(int i7, boolean z10) {
        float f10;
        p pVar = (p) this.f5428x.f1275c;
        pVar.f5497w.setVisibility(0);
        ViewPropertyAnimator animate = pVar.f5497w.animate();
        if (!z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).withEndAction(new k(0, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
