package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class y extends n0 {
    public final int f10740a;
    public final a0 f10741b;

    public y(a0 a0Var, int i10) {
        this.f10740a = i10;
        this.f10741b = a0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f10740a;
        a0 a0Var = this.f10741b;
        switch (i10) {
            case 0:
                if (a0Var.f10633o && (view = a0Var.f10626g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.f10637s = null;
                n4.s sVar = a0Var.f10629k;
                if (sVar != null) {
                    sVar.B(a0Var.f10628j);
                    a0Var.f10628j = null;
                    a0Var.f10629k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.f10624c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f44864a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                a0Var.f10637s = null;
                a0Var.d.requestLayout();
                return;
        }
    }
}
