package ei;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.im0;
public final class m7 implements ch.a {
    public final int f9473a;
    public final Object f9474b;

    public m7(Object obj, int i10) {
        this.f9473a = i10;
        this.f9474b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f9473a) {
            case 0:
            default:
                aVar.f4356a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f9473a) {
            case 0:
                s7 s7Var = (s7) this.f9474b;
                im0 im0Var = s7Var.d;
                hh.d.b(im0Var, canvas, rectF, im0Var, s7Var.getContainerView(), 255);
                return;
            default:
                yh.q2 q2Var = (yh.q2) this.f9474b;
                for (View view : q2Var.h.getViewPages()) {
                    if (view instanceof yh.m2) {
                        yh.m2 m2Var = (yh.m2) view;
                        if (m2Var.h == null) {
                            yh.h2 h2Var = m2Var.f50397f;
                            ViewGroup viewGroup = q2Var.S;
                            Objects.requireNonNull(h2Var);
                            m2Var.h = new bh.l(h2Var, viewGroup, new org.telegram.ui.x8(h2Var, 0));
                        }
                        m2Var.h.f(canvas, rectF);
                    }
                }
                return;
        }
    }
}
