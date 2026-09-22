package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.ll0;
public final class z7 implements bh.a {
    public final int f5869a;
    public final Object f5870b;

    public z7(Object obj, int i10) {
        this.f5869a = i10;
        this.f5870b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f5869a) {
            case 0:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f5869a) {
            case 0:
                g8 g8Var = (g8) this.f5870b;
                ll0 ll0Var = g8Var.d;
                gh.d.b(ll0Var, canvas, rectF, ll0Var, g8Var.getContainerView(), 255);
                return;
            default:
                xh.r2 r2Var = (xh.r2) this.f5870b;
                for (View view : r2Var.h.getViewPages()) {
                    if (view instanceof xh.n2) {
                        xh.n2 n2Var = (xh.n2) view;
                        if (n2Var.h == null) {
                            xh.i2 i2Var = n2Var.f46033f;
                            ViewGroup viewGroup = r2Var.S;
                            Objects.requireNonNull(i2Var);
                            n2Var.h = new ah.n(i2Var, viewGroup, new org.telegram.ui.v8(i2Var, 0));
                        }
                        n2Var.h.f(canvas, rectF);
                    }
                }
                return;
        }
    }
}
