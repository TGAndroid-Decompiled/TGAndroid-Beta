package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class y extends n0 {
    public final int f10738a;
    public final a0 f10739b;

    public y(a0 a0Var, int i10) {
        this.f10738a = i10;
        this.f10739b = a0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f10738a;
        a0 a0Var = this.f10739b;
        switch (i10) {
            case 0:
                if (a0Var.f10631o && (view = a0Var.f10624g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.f10635s = null;
                n4.s sVar = a0Var.f10627k;
                if (sVar != null) {
                    sVar.B(a0Var.f10626j);
                    a0Var.f10626j = null;
                    a0Var.f10627k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.f10622c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f44818a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                a0Var.f10635s = null;
                a0Var.d.requestLayout();
                return;
        }
    }
}
