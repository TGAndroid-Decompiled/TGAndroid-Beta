package defpackage;

import android.view.ViewPropertyAnimator;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
public final class j92 extends gb {
    public final su x;

    public j92(su suVar, su suVar2) {
        super(suVar2);
        this.x = suVar;
    }

    @Override
    public final boolean b() {
        boolean z;
        boolean z2;
        n92 n92Var = (n92) this.x.c;
        tk5 parentLayout = n92Var.getParentLayout();
        z = ((d) n92Var).inPreviewMode;
        if (!z && !gm.O1()) {
            z2 = ((d) n92Var).inBubbleMode;
            if (!z2 && !gm.E && parentLayout != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e(float f, float f2, boolean z) {
        n92 n92Var = (n92) this.x.c;
        if (n92Var.getParentLayout() != null) {
            boolean z2 = ((ActionBarLayout) n92Var.getParentLayout()).n;
        }
    }

    @Override
    public final void g(int i, boolean z) {
        float f;
        n92 n92Var = (n92) this.x.c;
        n92Var.w.setVisibility(0);
        ViewPropertyAnimator animate = n92Var.w.animate();
        if (!z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animate.alpha(f).withEndAction(new y8c((byte) 10, this, z)).start();
    }
}
