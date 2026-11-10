package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class z extends n0 {
    public final int f13395a;
    public final b0 f13396b;

    public z(b0 b0Var, int i7) {
        this.f13395a = i7;
        this.f13396b = b0Var;
    }

    @Override
    public final void c() {
        View view;
        int i7 = this.f13395a;
        b0 b0Var = this.f13396b;
        switch (i7) {
            case 0:
                if (b0Var.f13290o && (view = b0Var.f13283g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.f13294s = null;
                q4.q qVar = b0Var.f13286k;
                if (qVar != null) {
                    qVar.c(b0Var.f13285j);
                    b0Var.f13285j = null;
                    b0Var.f13286k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = b0Var.f13280c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f54202a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                b0Var.f13294s = null;
                b0Var.d.requestLayout();
                return;
        }
    }
}
