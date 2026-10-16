package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class y extends n0 {
    public final int f9832a;
    public final a0 f9833b;

    public y(a0 a0Var, int i10) {
        this.f9832a = i10;
        this.f9833b = a0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f9832a;
        a0 a0Var = this.f9833b;
        switch (i10) {
            case 0:
                if (a0Var.f9725o && (view = a0Var.f9718g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.f9729s = null;
                n4.s sVar = a0Var.f9721k;
                if (sVar != null) {
                    sVar.t(a0Var.f9720j);
                    a0Var.f9720j = null;
                    a0Var.f9721k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.f9716c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f43485a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                a0Var.f9729s = null;
                a0Var.d.requestLayout();
                return;
        }
    }
}
