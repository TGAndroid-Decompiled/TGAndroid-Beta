package lh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.x8;
import qh.k6;
public final class n2 implements pg.a {
    public final int f12858a;
    public final Object f12859b;

    public n2(Object obj, int i10) {
        this.f12858a = i10;
        this.f12859b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f12858a) {
            case 0:
                x3 x3Var = (x3) this.f12859b;
                for (View view : x3Var.h.getViewPages()) {
                    if (view instanceof n3) {
                        n3 n3Var = (n3) view;
                        if (n3Var.h == null) {
                            h3 h3Var = n3Var.f12864f;
                            ViewGroup viewGroup = x3Var.P;
                            Objects.requireNonNull(h3Var);
                            n3Var.h = new og.k(h3Var, viewGroup, new x8(h3Var, 0));
                        }
                        n3Var.h.e(canvas, rectF);
                    }
                }
                return;
            default:
                k6 k6Var = (k6) this.f12859b;
                tl0 tl0Var = k6Var.d;
                ug.c.a(tl0Var, canvas, rectF, tl0Var, k6Var.getContainerView(), 255);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f12858a) {
            case 0:
            default:
                xVar.f6800b = true;
                return;
        }
    }
}
