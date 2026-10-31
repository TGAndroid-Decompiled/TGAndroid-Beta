package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.h0;
import r0.m0;
public final class z extends m0 {
    public final int f7259a;
    public final b0 f7260b;

    public z(b0 b0Var, int i10) {
        this.f7259a = i10;
        this.f7260b = b0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f7259a;
        b0 b0Var = this.f7260b;
        switch (i10) {
            case 0:
                if (b0Var.f7160o && (view = b0Var.f7153g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.f7164s = null;
                n4.q qVar = b0Var.f7156k;
                if (qVar != null) {
                    qVar.B(b0Var.f7155j);
                    b0Var.f7155j = null;
                    b0Var.f7156k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = b0Var.f7151c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = h0.f46123a;
                    r0.x.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                b0Var.f7164s = null;
                b0Var.d.requestLayout();
                return;
        }
    }
}
