package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class z extends n0 {
    public final int f13090a;
    public final b0 f13091b;

    public z(b0 b0Var, int i7) {
        this.f13090a = i7;
        this.f13091b = b0Var;
    }

    @Override
    public final void c() {
        View view;
        int i7 = this.f13090a;
        b0 b0Var = this.f13091b;
        switch (i7) {
            case 0:
                if (b0Var.f12984o && (view = b0Var.f12977g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.f12988s = null;
                q4.q qVar = b0Var.f12980k;
                if (qVar != null) {
                    qVar.c(b0Var.f12979j);
                    b0Var.f12979j = null;
                    b0Var.f12980k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = b0Var.f12974c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f56289a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                b0Var.f12988s = null;
                b0Var.d.requestLayout();
                return;
        }
    }
}
