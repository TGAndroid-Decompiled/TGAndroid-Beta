package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class z extends n0 {
    public final int f12744a;
    public final b0 f12745b;

    public z(b0 b0Var, int i7) {
        this.f12744a = i7;
        this.f12745b = b0Var;
    }

    @Override
    public final void c() {
        View view;
        int i7 = this.f12744a;
        b0 b0Var = this.f12745b;
        switch (i7) {
            case 0:
                if (b0Var.f12638o && (view = b0Var.f12631g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.f12642s = null;
                q4.q qVar = b0Var.f12634k;
                if (qVar != null) {
                    qVar.c(b0Var.f12633j);
                    b0Var.f12633j = null;
                    b0Var.f12634k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = b0Var.f12628c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f55671a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                b0Var.f12642s = null;
                b0Var.d.requestLayout();
                return;
        }
    }
}
