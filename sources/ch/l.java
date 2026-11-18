package ch;

import android.view.ViewPropertyAnimator;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.j1;
import org.telegram.ui.ActionBar.s4;
public final class l extends j1 {
    public final ai.k0 f5402x;

    public l(ai.k0 k0Var, ai.k0 k0Var2) {
        super(k0Var2);
        this.f5402x = k0Var;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        p pVar = (p) this.f5402x.f1264c;
        s4 parentLayout = pVar.getParentLayout();
        z10 = ((h2) pVar).inPreviewMode;
        if (!z10 && !org.telegram.messenger.g0.Q1()) {
            z11 = ((h2) pVar).inBubbleMode;
            if (!z11 && !org.telegram.messenger.g0.E && parentLayout != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z10) {
        p pVar = (p) this.f5402x.f1264c;
        if (pVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) pVar.getParentLayout()).f28708n;
        }
    }

    @Override
    public final void g(int i7, boolean z10) {
        float f10;
        p pVar = (p) this.f5402x.f1264c;
        pVar.f5471w.setVisibility(0);
        ViewPropertyAnimator animate = pVar.f5471w.animate();
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
