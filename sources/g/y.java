package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class y extends n0 {
    public final int f10739a;
    public final a0 f10740b;

    public y(a0 a0Var, int i10) {
        this.f10739a = i10;
        this.f10740b = a0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f10739a;
        a0 a0Var = this.f10740b;
        switch (i10) {
            case 0:
                if (a0Var.f10632o && (view = a0Var.f10625g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.f10636s = null;
                n4.s sVar = a0Var.f10628k;
                if (sVar != null) {
                    sVar.w(a0Var.f10627j);
                    a0Var.f10627j = null;
                    a0Var.f10628k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.f10623c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f44816a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                a0Var.f10636s = null;
                a0Var.d.requestLayout();
                return;
        }
    }
}
