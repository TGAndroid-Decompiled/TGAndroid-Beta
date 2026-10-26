package bh;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.q1;
public final class o extends q1 {
    public final p f4097x;

    public o(p pVar, p pVar2) {
        super(pVar2);
        this.f4097x = pVar;
    }

    @Override
    public final boolean b() {
        u uVar = (u) this.f4097x.f4102c;
        j5 parentLayout = uVar.getParentLayout();
        if (!u.V(uVar) && !AndroidUtilities.isTablet() && !u.W(uVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        u uVar = (u) this.f4097x.f4102c;
        if (uVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) uVar.getParentLayout()).f22331n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f7;
        u uVar = (u) this.f4097x.f4102c;
        uVar.v.setVisibility(0);
        ViewPropertyAnimator animate = uVar.v.animate();
        if (!z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).withEndAction(new n(0, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
