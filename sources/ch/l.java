package ch;

import android.view.ViewPropertyAnimator;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.r4;
public final class l extends i1 {
    public final ai.h0 f5394x;

    public l(ai.h0 h0Var, ai.h0 h0Var2) {
        super(h0Var2);
        this.f5394x = h0Var;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        p pVar = (p) this.f5394x.f1215c;
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
        p pVar = (p) this.f5394x.f1215c;
        if (pVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) pVar.getParentLayout()).f28797n;
        }
    }

    @Override
    public final void g(int i7, boolean z10) {
        float f10;
        p pVar = (p) this.f5394x.f1215c;
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
