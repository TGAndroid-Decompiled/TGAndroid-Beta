package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class z extends n0 {
    public final int f11778a;
    public final b0 f11779b;

    public z(b0 b0Var, int i3) {
        this.f11778a = i3;
        this.f11779b = b0Var;
    }

    @Override
    public final void c() {
        View view;
        int i3 = this.f11778a;
        b0 b0Var = this.f11779b;
        switch (i3) {
            case 0:
                if (b0Var.f11672o && (view = b0Var.f11665g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.f11676s = null;
                tf.b bVar = b0Var.f11668k;
                if (bVar != null) {
                    bVar.v(b0Var.f11667j);
                    b0Var.f11667j = null;
                    b0Var.f11668k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = b0Var.f11662c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f54015a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                b0Var.f11676s = null;
                b0Var.d.requestLayout();
                return;
        }
    }
}
