package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class z extends n0 {
    public final int f9327a;
    public final b0 f9328b;

    public z(b0 b0Var, int i10) {
        this.f9327a = i10;
        this.f9328b = b0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f9327a;
        b0 b0Var = this.f9328b;
        switch (i10) {
            case 0:
                if (b0Var.f9220o && (view = b0Var.f9213g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.f9224s = null;
                n4.y yVar = b0Var.f9216k;
                if (yVar != null) {
                    yVar.T(b0Var.f9215j);
                    b0Var.f9215j = null;
                    b0Var.f9216k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = b0Var.f9211c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f41870a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                b0Var.f9224s = null;
                b0Var.d.requestLayout();
                return;
        }
    }
}
