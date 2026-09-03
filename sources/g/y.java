package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;
public final class y extends o0 {
    public final int f6328a;
    public final a0 f6329b;

    public y(a0 a0Var, int i10) {
        this.f6328a = i10;
        this.f6329b = a0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f6328a;
        a0 a0Var = this.f6329b;
        switch (i10) {
            case 0:
                if (a0Var.f6224o && (view = a0Var.f6217g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.f6228s = null;
                f7.b bVar = a0Var.f6220k;
                if (bVar != null) {
                    bVar.u(a0Var.f6219j);
                    a0Var.f6219j = null;
                    a0Var.f6220k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.f6215c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = j0.f43142a;
                    r0.z.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                a0Var.f6228s = null;
                a0Var.d.requestLayout();
                return;
        }
    }
}
