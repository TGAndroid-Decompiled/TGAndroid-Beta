package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;
public final class y extends o0 {
    public final int f7047a;
    public final a0 f7048b;

    public y(a0 a0Var, int i9) {
        this.f7047a = i9;
        this.f7048b = a0Var;
    }

    @Override
    public final void c() {
        View view;
        int i9 = this.f7047a;
        a0 a0Var = this.f7048b;
        switch (i9) {
            case 0:
                if (a0Var.f6936o && (view = a0Var.f6929g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.f6940s = null;
                we.b bVar = a0Var.f6932k;
                if (bVar != null) {
                    bVar.H(a0Var.f6931j);
                    a0Var.f6931j = null;
                    a0Var.f6932k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.f6926c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = j0.f46915a;
                    r0.z.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                a0Var.f6940s = null;
                a0Var.d.requestLayout();
                return;
        }
    }
}
