package ah;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.o1;
public final class u extends o1 {
    public final v f890x;

    public u(v vVar, v vVar2) {
        super(vVar2);
        this.f890x = vVar;
    }

    @Override
    public final boolean b() {
        a0 a0Var = (a0) this.f890x.f895c;
        d5 parentLayout = a0Var.getParentLayout();
        if (!a0.U(a0Var) && !AndroidUtilities.isTablet() && !a0.V(a0Var) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        a0 a0Var = (a0) this.f890x.f895c;
        if (a0Var.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) a0Var.getParentLayout()).f20573n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f7;
        a0 a0Var = (a0) this.f890x.f895c;
        a0Var.f646w.setVisibility(0);
        ViewPropertyAnimator animate = a0Var.f646w.animate();
        if (!z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).withEndAction(new t(0, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
