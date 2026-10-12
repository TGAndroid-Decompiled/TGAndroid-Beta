package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.wm0;
public final class w7 implements bh.a {
    public final int f6212a;
    public final Object f6213b;

    public w7(Object obj, int i10) {
        this.f6212a = i10;
        this.f6213b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f6212a) {
            case 0:
            default:
                aVar.f538a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f6212a) {
            case 0:
                d8 d8Var = (d8) this.f6213b;
                wm0 wm0Var = d8Var.d;
                gh.d.b(wm0Var, canvas, rectF, wm0Var, d8Var.getContainerView(), 255);
                return;
            default:
                xh.r2 r2Var = (xh.r2) this.f6213b;
                for (View view : r2Var.h.getViewPages()) {
                    if (view instanceof xh.n2) {
                        xh.n2 n2Var = (xh.n2) view;
                        if (n2Var.h == null) {
                            xh.i2 i2Var = n2Var.f51626f;
                            ViewGroup viewGroup = r2Var.S;
                            Objects.requireNonNull(i2Var);
                            n2Var.h = new ah.n(i2Var, viewGroup, new org.telegram.ui.x8(i2Var, 0));
                        }
                        n2Var.h.f(canvas, rectF);
                    }
                }
                return;
        }
    }
}
