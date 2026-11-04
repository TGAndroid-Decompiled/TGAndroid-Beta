package dh;

import android.view.ViewPropertyAnimator;
import ci.e1;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.h1;
import org.telegram.ui.ActionBar.q4;
public final class k extends h1 {
    public final ai.c0 f9057x;

    public k(ai.c0 c0Var, ai.c0 c0Var2) {
        super(c0Var2);
        this.f9057x = c0Var;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        o oVar = (o) this.f9057x.f537c;
        q4 parentLayout = oVar.getParentLayout();
        z10 = ((d2) oVar).inPreviewMode;
        if (!z10 && !org.telegram.messenger.g0.Q1()) {
            z11 = ((d2) oVar).inBubbleMode;
            if (!z11 && !org.telegram.messenger.g0.E && parentLayout != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z10) {
        o oVar = (o) this.f9057x.f537c;
        if (oVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) oVar.getParentLayout()).f27304n;
        }
    }

    @Override
    public final void g(int i3, boolean z10) {
        float f10;
        o oVar = (o) this.f9057x.f537c;
        oVar.f9109w.setVisibility(0);
        ViewPropertyAnimator animate = oVar.f9109w.animate();
        if (!z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).withEndAction(new e1(3, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
