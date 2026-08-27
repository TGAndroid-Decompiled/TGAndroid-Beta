package ig;

import ag.y1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p1;

public final class o extends p1 {

    public final y1 f11376x;

    public o(y1 y1Var, y1 y1Var2) {
        super(y1Var2);
        this.f11376x = y1Var;
    }

    @Override
    public final boolean b() {
        s sVar = (s) this.f11376x.f707c;
        return (((n2) sVar).inPreviewMode || AndroidUtilities.isTablet() || ((n2) sVar).inBubbleMode || AndroidUtilities.isInMultiwindow || sVar.getParentLayout() == null) ? false : true;
    }

    @Override
    public final void e(float f10, float f11, boolean z10) {
        s sVar = (s) this.f11376x.f707c;
        if (sVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) sVar.getParentLayout()).f22672n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        s sVar = (s) this.f11376x.f707c;
        sVar.f11449w.setVisibility(0);
        sVar.f11449w.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new fh.f(4, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
