package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class y extends n0 {
    public final int f10756a;
    public final a0 f10757b;

    public y(a0 a0Var, int i10) {
        this.f10756a = i10;
        this.f10757b = a0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f10756a;
        a0 a0Var = this.f10757b;
        switch (i10) {
            case 0:
                if (a0Var.f10649o && (view = a0Var.f10642g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.f10653s = null;
                n4.s sVar = a0Var.f10645k;
                if (sVar != null) {
                    sVar.w(a0Var.f10644j);
                    a0Var.f10644j = null;
                    a0Var.f10645k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.f10640c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f45241a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                a0Var.f10653s = null;
                a0Var.d.requestLayout();
                return;
        }
    }
}
