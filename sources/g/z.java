package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class z extends n0 {
    public final int f9321a;
    public final b0 f9322b;

    public z(b0 b0Var, int i10) {
        this.f9321a = i10;
        this.f9322b = b0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f9321a;
        b0 b0Var = this.f9322b;
        switch (i10) {
            case 0:
                if (b0Var.f9214o && (view = b0Var.f9207g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.f9218s = null;
                n4.y yVar = b0Var.f9210k;
                if (yVar != null) {
                    yVar.T(b0Var.f9209j);
                    b0Var.f9209j = null;
                    b0Var.f9210k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = b0Var.f9205c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f42233a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                b0Var.f9218s = null;
                b0Var.d.requestLayout();
                return;
        }
    }
}
