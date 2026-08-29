package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;
public final class y extends o0 {
    public final int f6957a;
    public final a0 f6958b;

    public y(a0 a0Var, int i10) {
        this.f6957a = i10;
        this.f6958b = a0Var;
    }

    @Override
    public final void c() {
        View view;
        int i10 = this.f6957a;
        a0 a0Var = this.f6958b;
        switch (i10) {
            case 0:
                if (a0Var.f6846o && (view = a0Var.f6839g) != null) {
                    view.setTranslationY(0.0f);
                    a0Var.d.setTranslationY(0.0f);
                }
                a0Var.d.setVisibility(8);
                a0Var.d.setTransitioning(false);
                a0Var.f6850s = null;
                ze.b bVar = a0Var.f6842k;
                if (bVar != null) {
                    bVar.O(a0Var.f6841j);
                    a0Var.f6841j = null;
                    a0Var.f6842k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = a0Var.f6836c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = j0.f46829a;
                    r0.z.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                a0Var.f6850s = null;
                a0Var.d.requestLayout();
                return;
        }
    }
}
