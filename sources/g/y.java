package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class y extends n0 {
    public final int f10204a;
    public final a0 f10205b;

    public y(a0 a0Var, int i10) {
        this.f10204a = i10;
        this.f10205b = a0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f10204a;
        a0 a0Var = this.f10205b;
        switch (i10) {
            case 0:
                if (a0Var.f10089o && (view = a0Var.f10082g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.f10093s = null;
                n4.x xVar = a0Var.f10085k;
                if (xVar != null) {
                    xVar.X(a0Var.f10084j);
                    a0Var.f10084j = null;
                    a0Var.f10085k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.f10079c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f46764a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                a0Var.f10093s = null;
                a0Var.d.requestLayout();
                return;
        }
    }
}
