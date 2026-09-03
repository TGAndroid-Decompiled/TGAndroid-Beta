package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;
public final class y extends o0 {
    public final int f6801a;
    public final a0 f6802b;

    public y(a0 a0Var, int i10) {
        this.f6801a = i10;
        this.f6802b = a0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f6801a;
        a0 a0Var = this.f6802b;
        switch (i10) {
            case 0:
                if (a0Var.f6689o && (view = a0Var.f6682g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.f6693s = null;
                f7.b bVar = a0Var.f6685k;
                if (bVar != null) {
                    bVar.t(a0Var.f6684j);
                    a0Var.f6684j = null;
                    a0Var.f6685k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.f6679c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = j0.f46469a;
                    r0.z.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                a0Var.f6693s = null;
                a0Var.d.requestLayout();
                return;
        }
    }
}
