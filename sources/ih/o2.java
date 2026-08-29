package ih;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import nh.g7;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.t8;
public final class o2 implements mg.a {
    public final int f9309a;
    public final Object f9310b;

    public o2(Object obj, int i10) {
        this.f9309a = i10;
        this.f9310b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f9309a) {
            case 0:
                x3 x3Var = (x3) this.f9310b;
                for (View view : x3Var.h.getViewPages()) {
                    if (view instanceof n3) {
                        n3 n3Var = (n3) view;
                        if (n3Var.h == null) {
                            h3 h3Var = n3Var.f9297f;
                            ViewGroup viewGroup = x3Var.O;
                            Objects.requireNonNull(h3Var);
                            n3Var.h = new lg.k(h3Var, viewGroup, new t8(h3Var, 0));
                        }
                        n3Var.h.e(canvas, rectF);
                    }
                }
                return;
            default:
                g7 g7Var = (g7) this.f9310b;
                jl0 jl0Var = g7Var.d;
                rg.c.a(jl0Var, canvas, rectF, jl0Var, g7Var.getContainerView(), 255);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f9309a) {
            case 0:
            default:
                xVar.f6956b = true;
                return;
        }
    }
}
