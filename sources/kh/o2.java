package kh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.x8;
import ph.m6;
public final class o2 implements og.a {
    public final int f10733a;
    public final Object f10734b;

    public o2(Object obj, int i10) {
        this.f10733a = i10;
        this.f10734b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f10733a) {
            case 0:
                x3 x3Var = (x3) this.f10734b;
                for (View view : x3Var.h.getViewPages()) {
                    if (view instanceof n3) {
                        n3 n3Var = (n3) view;
                        if (n3Var.h == null) {
                            h3 h3Var = n3Var.f10722f;
                            ViewGroup viewGroup = x3Var.P;
                            Objects.requireNonNull(h3Var);
                            n3Var.h = new ng.k(h3Var, viewGroup, new x8(h3Var, 0));
                        }
                        n3Var.h.e(canvas, rectF);
                    }
                }
                return;
            default:
                m6 m6Var = (m6) this.f10734b;
                sl0 sl0Var = m6Var.d;
                tg.c.a(sl0Var, canvas, rectF, sl0Var, m6Var.getContainerView(), 255);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f10733a) {
            case 0:
            default:
                xVar.f6327b = true;
                return;
        }
    }
}
