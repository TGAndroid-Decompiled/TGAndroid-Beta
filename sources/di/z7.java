package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.ll0;
public final class z7 implements ch.a {
    public final int f8550a;
    public final Object f8551b;

    public z7(Object obj, int i10) {
        this.f8550a = i10;
        this.f8551b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f8550a) {
            case 0:
            default:
                aVar.f2675a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f8550a) {
            case 0:
                g8 g8Var = (g8) this.f8551b;
                ll0 ll0Var = g8Var.d;
                hh.d.a(ll0Var, canvas, rectF, ll0Var, g8Var.getContainerView(), 255);
                return;
            default:
                yh.q2 q2Var = (yh.q2) this.f8551b;
                for (View view : q2Var.h.getViewPages()) {
                    if (view instanceof yh.m2) {
                        yh.m2 m2Var = (yh.m2) view;
                        if (m2Var.h == null) {
                            yh.h2 h2Var = m2Var.f50472f;
                            ViewGroup viewGroup = q2Var.S;
                            Objects.requireNonNull(h2Var);
                            m2Var.h = new bh.l(h2Var, viewGroup, new org.telegram.ui.v8(h2Var, 0));
                        }
                        m2Var.h.f(canvas, rectF);
                    }
                }
                return;
        }
    }
}
