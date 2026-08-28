package hg;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.q1;
public final class o extends q1 {
    public final fh.v f10679x;

    public o(fh.v vVar, fh.v vVar2) {
        super(vVar2);
        this.f10679x = vVar;
    }

    @Override
    public final boolean b() {
        s sVar = (s) this.f10679x.f6809b;
        b5 parentLayout = sVar.getParentLayout();
        if (!s.T(sVar) && !AndroidUtilities.isTablet() && !s.U(sVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z10) {
        s sVar = (s) this.f10679x.f6809b;
        if (sVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) sVar.getParentLayout()).f22672n;
        }
    }

    @Override
    public final void g(int i9, boolean z10) {
        float f10;
        s sVar = (s) this.f10679x.f6809b;
        sVar.f10727w.setVisibility(0);
        ViewPropertyAnimator animate = sVar.f10727w.animate();
        if (!z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).withEndAction(new eh.f(4, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
