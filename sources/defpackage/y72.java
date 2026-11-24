package defpackage;

import android.view.ViewPropertyAnimator;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
public final class y72 extends gb {
    public final st x;

    public y72(st stVar, st stVar2) {
        super(stVar2);
        this.x = stVar;
    }

    @Override
    public final boolean b() {
        boolean z;
        boolean z2;
        c82 c82Var = (c82) this.x.c;
        ui5 parentLayout = c82Var.getParentLayout();
        z = ((d) c82Var).inPreviewMode;
        if (!z && !gl.O1()) {
            z2 = ((d) c82Var).inBubbleMode;
            if (!z2 && !gl.E && parentLayout != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e(float f, float f2, boolean z) {
        c82 c82Var = (c82) this.x.c;
        if (c82Var.getParentLayout() != null) {
            boolean z2 = ((ActionBarLayout) c82Var.getParentLayout()).n;
        }
    }

    @Override
    public final void g(int i, boolean z) {
        float f;
        c82 c82Var = (c82) this.x.c;
        c82Var.w.setVisibility(0);
        ViewPropertyAnimator animate = c82Var.w.animate();
        if (!z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animate.alpha(f).withEndAction(new x6c((byte) 10, this, z)).start();
    }
}
