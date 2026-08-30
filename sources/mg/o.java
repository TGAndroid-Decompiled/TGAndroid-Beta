package mg;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.r1;
public final class o extends r1 {
    public final ah.d f14072x;

    public o(ah.d dVar, ah.d dVar2) {
        super(dVar2);
        this.f14072x = dVar;
    }

    @Override
    public final boolean b() {
        s sVar = (s) this.f14072x.f198c;
        e5 parentLayout = sVar.getParentLayout();
        if (!s.U(sVar) && !AndroidUtilities.isTablet() && !s.V(sVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z4) {
        s sVar = (s) this.f14072x.f198c;
        if (sVar.getParentLayout() != null) {
            boolean z10 = ((ActionBarLayout) sVar.getParentLayout()).f19474n;
        }
    }

    @Override
    public final void g(int i10, boolean z4) {
        float f10;
        s sVar = (s) this.f14072x.f198c;
        sVar.f14142w.setVisibility(0);
        ViewPropertyAnimator animate = sVar.f14142w.animate();
        if (!z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).withEndAction(new jh.f(5, this, z4)).start();
    }

    @Override
    public final void f() {
    }
}
