package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.h0;
import r0.m0;
public final class z extends m0 {
    public final int f7260a;
    public final b0 f7261b;

    public z(b0 b0Var, int i10) {
        this.f7260a = i10;
        this.f7261b = b0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f7260a;
        b0 b0Var = this.f7261b;
        switch (i10) {
            case 0:
                if (b0Var.f7161o && (view = b0Var.f7154g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.f7165s = null;
                n4.q qVar = b0Var.f7157k;
                if (qVar != null) {
                    qVar.B(b0Var.f7156j);
                    b0Var.f7156j = null;
                    b0Var.f7157k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = b0Var.f7152c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = h0.f46134a;
                    r0.x.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                b0Var.f7165s = null;
                b0Var.d.requestLayout();
                return;
        }
    }
}
