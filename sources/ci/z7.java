package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.wl0;
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
                wl0 wl0Var = g8Var.d;
                gh.d.b(wl0Var, canvas, rectF, wl0Var, g8Var.getContainerView(), 255);
                return;
            default:
                xh.s2 s2Var = (xh.s2) this.f5873b;
                for (View view : s2Var.h.getViewPages()) {
                    if (view instanceof xh.o2) {
                        xh.o2 o2Var = (xh.o2) view;
                        if (o2Var.h == null) {
                            xh.j2 j2Var = o2Var.f46303f;
                            ViewGroup viewGroup = s2Var.S;
                            Objects.requireNonNull(j2Var);
                            o2Var.h = new ah.o(j2Var, viewGroup, new org.telegram.ui.w8(j2Var, 0));
                        }
                        o2Var.h.f(canvas, rectF);
                    }
                }
                return;
        }
    }
}
