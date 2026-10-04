package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class z extends n0 {
    public final int f10134a;
    public final b0 f10135b;

    public z(b0 b0Var, int i10) {
        this.f10134a = i10;
        this.f10135b = b0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f10134a;
        b0 b0Var = this.f10135b;
        switch (i10) {
            case 0:
                if (b0Var.f10019o && (view = b0Var.f10012g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.f10023s = null;
                n4.y yVar = b0Var.f10015k;
                if (yVar != null) {
                    yVar.V(b0Var.f10014j);
                    b0Var.f10014j = null;
                    b0Var.f10015k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = b0Var.f10009c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f45603a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                b0Var.f10023s = null;
                b0Var.d.requestLayout();
                return;
        }
    }
}
