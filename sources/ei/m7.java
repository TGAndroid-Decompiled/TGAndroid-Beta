package ei;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.mm0;
public final class m7 implements ch.a {
    public final int f9482a;
    public final Object f9483b;

    public m7(Object obj, int i10) {
        this.f9482a = i10;
        this.f9483b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f9482a) {
            case 0:
            default:
                aVar.f4360a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f9482a) {
            case 0:
                s7 s7Var = (s7) this.f9483b;
                mm0 mm0Var = s7Var.d;
                hh.d.b(mm0Var, canvas, rectF, mm0Var, s7Var.getContainerView(), 255);
                return;
            default:
                yh.p2 p2Var = (yh.p2) this.f9483b;
                for (View view : p2Var.h.getViewPages()) {
                    if (view instanceof yh.l2) {
                        yh.l2 l2Var = (yh.l2) view;
                        if (l2Var.h == null) {
                            yh.g2 g2Var = l2Var.f50828f;
                            ViewGroup viewGroup = p2Var.T;
                            Objects.requireNonNull(g2Var);
                            l2Var.h = new bh.l(g2Var, viewGroup, new org.telegram.ui.x8(g2Var, 0));
                        }
                        l2Var.h.f(canvas, rectF);
                    }
                }
                return;
        }
    }
}
