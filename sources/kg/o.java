package kg;

import android.view.ViewPropertyAnimator;
import bg.d1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.q1;
public final class o extends q1 {
    public final d1 f13789x;

    public o(d1 d1Var, d1 d1Var2) {
        super(d1Var2);
        this.f13789x = d1Var;
    }

    @Override
    public final boolean b() {
        s sVar = (s) this.f13789x.f2147c;
        b5 parentLayout = sVar.getParentLayout();
        if (!s.U(sVar) && !AndroidUtilities.isTablet() && !s.V(sVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f9, float f10, boolean z10) {
        s sVar = (s) this.f13789x.f2147c;
        if (sVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) sVar.getParentLayout()).f22684n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f9;
        s sVar = (s) this.f13789x.f2147c;
        sVar.f13862w.setVisibility(0);
        ViewPropertyAnimator animate = sVar.f13862w.animate();
        if (!z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        animate.alpha(f9).withEndAction(new hh.f(4, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
