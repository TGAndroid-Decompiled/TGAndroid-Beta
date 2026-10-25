package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class y extends n0 {
    public final int f12204a;
    public final a0 f12205b;

    public y(a0 a0Var, int i10) {
        this.f12204a = i10;
        this.f12205b = a0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f12204a;
        a0 a0Var = this.f12205b;
        switch (i10) {
            case 0:
                if (a0Var.f12097o && (view = a0Var.f12090g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.f12101s = null;
                n4.s sVar = a0Var.f12093k;
                if (sVar != null) {
                    sVar.A(a0Var.f12092j);
                    a0Var.f12092j = null;
                    a0Var.f12093k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.f12088c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f47105a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                a0Var.f12101s = null;
                a0Var.d.requestLayout();
                return;
        }
    }
}
