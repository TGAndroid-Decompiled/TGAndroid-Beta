package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;

public final class z extends o0 {

    public final int f6328a;

    public final b0 f6329b;

    public z(b0 b0Var, int i10) {
        this.f6328a = i10;
        this.f6329b = b0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f6328a;
        b0 b0Var = this.f6329b;
        switch (i10) {
            case 0:
                if (b0Var.f6217o && (view = b0Var.f6210g) != null) {
                    view.setTranslationY(0.0f);
                    b0Var.d.setTranslationY(0.0f);
                }
                b0Var.d.setVisibility(8);
                b0Var.d.setTransitioning(false);
                b0Var.f6221s = null;
                xe.b bVar = b0Var.f6213k;
                if (bVar != null) {
                    bVar.J(b0Var.f6212j);
                    b0Var.f6212j = null;
                    b0Var.f6213k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = b0Var.f6207c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = j0.f46605a;
                    r0.z.c(actionBarOverlayLayout);
                }
                break;
            default:
                b0Var.f6221s = null;
                b0Var.d.requestLayout();
                break;
        }
    }
}
