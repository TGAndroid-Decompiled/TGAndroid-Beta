package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class y extends n0 {
    public final int f12203a;
    public final a0 f12204b;

    public y(a0 a0Var, int i10) {
        this.f12203a = i10;
        this.f12204b = a0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f12203a;
        a0 a0Var = this.f12204b;
        switch (i10) {
            case 0:
                if (a0Var.f12096o && (view = a0Var.f12089g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.f12100s = null;
                n4.s sVar = a0Var.f12092k;
                if (sVar != null) {
                    sVar.A(a0Var.f12091j);
                    a0Var.f12091j = null;
                    a0Var.f12092k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.f12087c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f47143a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                a0Var.f12100s = null;
                a0Var.d.requestLayout();
                return;
        }
    }
}
