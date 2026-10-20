package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class y extends n0 {
    public final int f10737a;
    public final a0 f10738b;

    public y(a0 a0Var, int i10) {
        this.f10737a = i10;
        this.f10738b = a0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f10737a;
        a0 a0Var = this.f10738b;
        switch (i10) {
            case 0:
                if (a0Var.f10630o && (view = a0Var.f10623g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.f10634s = null;
                n4.s sVar = a0Var.f10626k;
                if (sVar != null) {
                    sVar.w(a0Var.f10625j);
                    a0Var.f10625j = null;
                    a0Var.f10626k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.f10621c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f44826a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                a0Var.f10634s = null;
                a0Var.d.requestLayout();
                return;
        }
    }
}
