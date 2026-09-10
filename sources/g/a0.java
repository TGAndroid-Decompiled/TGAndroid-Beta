package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class a0 extends n0 {
    public final int f8329a;
    public final c0 f8330b;

    public a0(c0 c0Var, int i10) {
        this.f8329a = i10;
        this.f8330b = c0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f8329a;
        c0 c0Var = this.f8330b;
        switch (i10) {
            case 0:
                if (c0Var.f8358o && (view = c0Var.f8351g) != null) {
                    view.setTranslationY(0.0f);
                    c0Var.d.setTranslationY(0.0f);
                }
                c0Var.d.setVisibility(8);
                c0Var.d.setTransitioning(false);
                c0Var.f8362s = null;
                of.b bVar = c0Var.f8354k;
                if (bVar != null) {
                    bVar.j0(c0Var.f8353j);
                    c0Var.f8353j = null;
                    c0Var.f8354k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c0Var.f8349c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f41062a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                c0Var.f8362s = null;
                c0Var.d.requestLayout();
                return;
        }
    }
}
