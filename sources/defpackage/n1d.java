package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
public final class n1d extends djc {
    public final byte a;
    public final p1d b;

    public n1d(p1d p1dVar, byte b) {
        this.a = b;
        this.b = p1dVar;
    }

    @Override
    public final void c() {
        View view;
        byte b = this.a;
        p1d p1dVar = this.b;
        switch (b) {
            case 0:
                if (p1dVar.o && (view = p1dVar.g) != null) {
                    view.setTranslationY(0.0f);
                    p1dVar.d.setTranslationY(0.0f);
                }
                p1dVar.d.setVisibility(8);
                p1dVar.d.setTransitioning(false);
                p1dVar.s = null;
                lh2 lh2Var = p1dVar.k;
                if (lh2Var != null) {
                    lh2Var.F(p1dVar.j);
                    p1dVar.j = null;
                    p1dVar.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = p1dVar.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = ihc.a;
                    ygc.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                p1dVar.s = null;
                p1dVar.d.requestLayout();
                return;
        }
    }
}
