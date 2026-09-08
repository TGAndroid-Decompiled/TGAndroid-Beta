package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class z extends n0 {
    public final int f10298a;
    public final b0 f10299b;

    public z(b0 b0Var, int i10) {
        this.f10298a = i10;
        this.f10299b = b0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f10298a;
        b0 b0Var = this.f10299b;
        switch (i10) {
            case 0:
                if (b0Var.f10183o && (view = b0Var.f10176g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.f10187s = null;
                n4.y yVar = b0Var.f10179k;
                if (yVar != null) {
                    yVar.I(b0Var.f10178j);
                    b0Var.f10178j = null;
                    b0Var.f10179k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = b0Var.f10173c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f44725a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                b0Var.f10187s = null;
                b0Var.d.requestLayout();
                return;
        }
    }
}
