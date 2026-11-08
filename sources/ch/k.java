package ch;

import android.view.ViewPropertyAnimator;
import bi.k1;
import bi.x5;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.q4;
public final class k extends i1 {
    public final x5 f6281x;

    public k(x5 x5Var, x5 x5Var2) {
        super(x5Var2);
        this.f6281x = x5Var;
    }

    @Override
    public final boolean b() {
        boolean z9;
        boolean z10;
        o oVar = (o) this.f6281x.f5027c;
        q4 parentLayout = oVar.getParentLayout();
        z9 = ((f2) oVar).inPreviewMode;
        if (!z9 && !org.telegram.messenger.g0.Q1()) {
            z10 = ((f2) oVar).inBubbleMode;
            if (!z10 && !org.telegram.messenger.g0.E && parentLayout != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z9) {
        o oVar = (o) this.f6281x.f5027c;
        if (oVar.getParentLayout() != null) {
            boolean z10 = ((ActionBarLayout) oVar.getParentLayout()).f27259n;
        }
    }

    @Override
    public final void g(int i7, boolean z9) {
        float f10;
        o oVar = (o) this.f6281x.f5027c;
        oVar.f6349w.setVisibility(0);
        ViewPropertyAnimator animate = oVar.f6349w.animate();
        if (!z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).withEndAction(new k1(3, this, z9)).start();
    }

    @Override
    public final void f() {
    }
}
