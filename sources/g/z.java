package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class z extends n0 {
    public final int f13058a;
    public final b0 f13059b;

    public z(b0 b0Var, int i7) {
        this.f13058a = i7;
        this.f13059b = b0Var;
    }

    @Override
    public final void c() {
        View view;
        int i7 = this.f13058a;
        b0 b0Var = this.f13059b;
        switch (i7) {
            case 0:
                if (b0Var.f12952o && (view = b0Var.f12945g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.f12956s = null;
                q4.q qVar = b0Var.f12948k;
                if (qVar != null) {
                    qVar.c(b0Var.f12947j);
                    b0Var.f12947j = null;
                    b0Var.f12948k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = b0Var.f12942c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f56244a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                b0Var.f12956s = null;
                b0Var.d.requestLayout();
                return;
        }
    }
}
