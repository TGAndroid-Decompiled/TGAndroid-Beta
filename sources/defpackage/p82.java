package defpackage;

import android.view.ViewPropertyAnimator;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
public final class p82 extends hb {
    public final tt x;

    public p82(tt ttVar, tt ttVar2) {
        super(ttVar2);
        this.x = ttVar;
    }

    @Override
    public final boolean b() {
        boolean z;
        boolean z2;
        t82 t82Var = (t82) this.x.c;
        wk5 parentLayout = t82Var.getParentLayout();
        z = ((e) t82Var).inPreviewMode;
        if (!z && !hl.O1()) {
            z2 = ((e) t82Var).inBubbleMode;
            if (!z2 && !hl.E && parentLayout != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e(float f, float f2, boolean z) {
        t82 t82Var = (t82) this.x.c;
        if (t82Var.getParentLayout() != null) {
            boolean z2 = ((ActionBarLayout) t82Var.getParentLayout()).n;
        }
    }

    @Override
    public final void g(int i, boolean z) {
        float f;
        t82 t82Var = (t82) this.x.c;
        t82Var.w.setVisibility(0);
        ViewPropertyAnimator animate = t82Var.w.animate();
        if (!z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animate.alpha(f).withEndAction(new xac((byte) 10, this, z)).start();
    }
}
