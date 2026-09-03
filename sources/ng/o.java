package ng;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.r1;
public final class o extends r1 {
    public final ag.l f16143x;

    public o(ag.l lVar, ag.l lVar2) {
        super(lVar2);
        this.f16143x = lVar;
    }

    @Override
    public final boolean b() {
        s sVar = (s) this.f16143x.f213c;
        f5 parentLayout = sVar.getParentLayout();
        if (!s.U(sVar) && !AndroidUtilities.isTablet() && !s.V(sVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z4) {
        s sVar = (s) this.f16143x.f213c;
        if (sVar.getParentLayout() != null) {
            boolean z10 = ((ActionBarLayout) sVar.getParentLayout()).f21138n;
        }
    }

    @Override
    public final void g(int i10, boolean z4) {
        float f10;
        s sVar = (s) this.f16143x.f213c;
        sVar.f16217w.setVisibility(0);
        ViewPropertyAnimator animate = sVar.f16217w.animate();
        if (!z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).withEndAction(new kh.f(5, this, z4)).start();
    }

    @Override
    public final void f() {
    }
}
