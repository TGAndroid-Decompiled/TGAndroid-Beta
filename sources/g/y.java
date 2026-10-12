package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;
public final class y extends o0 {
    public final int f9829a;
    public final a0 f9830b;

    public y(a0 a0Var, int i10) {
        this.f9829a = i10;
        this.f9830b = a0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f9829a;
        a0 a0Var = this.f9830b;
        switch (i10) {
            case 0:
                if (a0Var.f9722o && (view = a0Var.f9715g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.f9726s = null;
                n4.s sVar = a0Var.f9718k;
                if (sVar != null) {
                    sVar.r(a0Var.f9717j);
                    a0Var.f9717j = null;
                    a0Var.f9718k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.f9713c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = j0.f43732a;
                    r0.z.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                a0Var.f9726s = null;
                a0Var.d.requestLayout();
                return;
        }
    }
}
