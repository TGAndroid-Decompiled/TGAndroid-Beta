package ch;

import android.view.ViewPropertyAnimator;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.r4;
public final class l extends i1 {
    public final ai.g0 f5394x;

    public l(ai.g0 g0Var, ai.g0 g0Var2) {
        super(g0Var2);
        this.f5394x = g0Var;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        p pVar = (p) this.f5394x.f1200c;
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
        p pVar = (p) this.f5394x.f1200c;
        if (pVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) pVar.getParentLayout()).f28705n;
        }
    }

    @Override
    public final void g(int i7, boolean z10) {
        float f10;
        p pVar = (p) this.f5394x.f1200c;
        pVar.f5463w.setVisibility(0);
        ViewPropertyAnimator animate = pVar.f5463w.animate();
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
