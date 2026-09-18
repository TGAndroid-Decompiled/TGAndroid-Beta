package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.ml0;
public final class z7 implements bh.a {
    public final int f5872a;
    public final Object f5873b;

    public z7(Object obj, int i10) {
        this.f5872a = i10;
        this.f5873b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f5872a) {
            case 0:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f5872a) {
            case 0:
                g8 g8Var = (g8) this.f5873b;
                ml0 ml0Var = g8Var.d;
                gh.d.b(ml0Var, canvas, rectF, ml0Var, g8Var.getContainerView(), 255);
                return;
            default:
                xh.r2 r2Var = (xh.r2) this.f5873b;
                for (View view : r2Var.h.getViewPages()) {
                    if (view instanceof xh.n2) {
                        xh.n2 n2Var = (xh.n2) view;
                        if (n2Var.h == null) {
                            xh.i2 i2Var = n2Var.f46065f;
                            ViewGroup viewGroup = r2Var.S;
                            Objects.requireNonNull(i2Var);
                            n2Var.h = new ah.o(i2Var, viewGroup, new org.telegram.ui.x8(i2Var, 0));
                        }
                        n2Var.h.f(canvas, rectF);
                    }
                }
                return;
        }
    }
}
