package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.mm0;
public final class v7 implements ch.a {
    public final int f8006a;
    public final Object f8007b;

    public v7(Object obj, int i10) {
        this.f8006a = i10;
        this.f8007b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f8006a) {
            case 0:
            default:
                aVar.f2740a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f8006a) {
            case 0:
                c8 c8Var = (c8) this.f8007b;
                mm0 mm0Var = c8Var.d;
                hh.d.b(mm0Var, canvas, rectF, mm0Var, c8Var.getContainerView(), 255);
                return;
            default:
                yh.q2 q2Var = (yh.q2) this.f8007b;
                for (View view : q2Var.h.getViewPages()) {
                    if (view instanceof yh.m2) {
                        yh.m2 m2Var = (yh.m2) view;
                        if (m2Var.h == null) {
                            yh.h2 h2Var = m2Var.f48997f;
                            ViewGroup viewGroup = q2Var.S;
                            Objects.requireNonNull(h2Var);
                            m2Var.h = new bh.l(h2Var, viewGroup, new org.telegram.ui.y8(h2Var, 0));
                        }
                        m2Var.h.f(canvas, rectF);
                    }
                }
                return;
        }
    }
}
