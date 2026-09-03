package kh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.z8;
import ph.l6;
public final class n2 implements og.a {
    public final int f10832a;
    public final Object f10833b;

    public n2(Object obj, int i10) {
        this.f10832a = i10;
        this.f10833b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f10832a) {
            case 0:
                w3 w3Var = (w3) this.f10833b;
                for (View view : w3Var.h.getViewPages()) {
                    if (view instanceof m3) {
                        m3 m3Var = (m3) view;
                        if (m3Var.h == null) {
                            g3 g3Var = m3Var.f10820f;
                            ViewGroup viewGroup = w3Var.P;
                            Objects.requireNonNull(g3Var);
                            m3Var.h = new ng.k(g3Var, viewGroup, new z8(g3Var, 0));
                        }
                        m3Var.h.e(canvas, rectF);
                    }
                }
                return;
            default:
                l6 l6Var = (l6) this.f10833b;
                rl0 rl0Var = l6Var.d;
                tg.c.a(rl0Var, canvas, rectF, rl0Var, l6Var.getContainerView(), 255);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f10832a) {
            case 0:
            default:
                xVar.f6327b = true;
                return;
        }
    }
}
