package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class z extends n0 {
    public final int f10270a;
    public final b0 f10271b;

    public z(b0 b0Var, int i10) {
        this.f10270a = i10;
        this.f10271b = b0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f10270a;
        b0 b0Var = this.f10271b;
        switch (i10) {
            case 0:
                if (b0Var.f10155o && (view = b0Var.f10148g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.f10159s = null;
                n4.y yVar = b0Var.f10151k;
                if (yVar != null) {
                    yVar.I(b0Var.f10150j);
                    b0Var.f10150j = null;
                    b0Var.f10151k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = b0Var.f10145c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f44697a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                b0Var.f10159s = null;
                b0Var.d.requestLayout();
                return;
        }
    }
}
