package lh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.x8;
import qh.i6;
public final class n2 implements pg.a {
    public final int f12860a;
    public final Object f12861b;

    public n2(Object obj, int i10) {
        this.f12860a = i10;
        this.f12861b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f12860a) {
            case 0:
                x3 x3Var = (x3) this.f12861b;
                for (View view : x3Var.h.getViewPages()) {
                    if (view instanceof n3) {
                        n3 n3Var = (n3) view;
                        if (n3Var.h == null) {
                            h3 h3Var = n3Var.f12866f;
                            ViewGroup viewGroup = x3Var.P;
                            Objects.requireNonNull(h3Var);
                            n3Var.h = new og.k(h3Var, viewGroup, new x8(h3Var, 0));
                        }
                        n3Var.h.e(canvas, rectF);
                    }
                }
                return;
            default:
                i6 i6Var = (i6) this.f12861b;
                sl0 sl0Var = i6Var.d;
                ug.c.a(sl0Var, canvas, rectF, sl0Var, i6Var.getContainerView(), 255);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f12860a) {
            case 0:
            default:
                xVar.f6800b = true;
                return;
        }
    }
}
