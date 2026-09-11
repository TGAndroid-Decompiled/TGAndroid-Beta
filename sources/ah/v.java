package ah;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.p1;
public final class v extends p1 {
    public final w f708x;

    public v(w wVar, w wVar2) {
        super(wVar2);
        this.f708x = wVar;
    }

    @Override
    public final boolean b() {
        b0 b0Var = (b0) this.f708x.f713c;
        d5 parentLayout = b0Var.getParentLayout();
        if (!b0.U(b0Var) && !AndroidUtilities.isTablet() && !b0.V(b0Var) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        b0 b0Var = (b0) this.f708x.f713c;
        if (b0Var.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) b0Var.getParentLayout()).f20166n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f7;
        b0 b0Var = (b0) this.f708x.f713c;
        b0Var.f451w.setVisibility(0);
        ViewPropertyAnimator animate = b0Var.f451w.animate();
        if (!z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).withEndAction(new u(0, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
