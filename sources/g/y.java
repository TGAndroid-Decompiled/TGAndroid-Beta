package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;
public final class y extends n0 {
    public final int f10202a;
    public final a0 f10203b;

    public y(a0 a0Var, int i10) {
        this.f10202a = i10;
        this.f10203b = a0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f10202a;
        a0 a0Var = this.f10203b;
        switch (i10) {
            case 0:
                if (a0Var.f10087o && (view = a0Var.f10080g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.f10091s = null;
                n4.y yVar = a0Var.f10083k;
                if (yVar != null) {
                    yVar.O(a0Var.f10082j);
                    a0Var.f10082j = null;
                    a0Var.f10083k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.f10077c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i0.f46981a;
                    r0.y.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                a0Var.f10091s = null;
                a0Var.d.requestLayout();
                return;
        }
    }
}
