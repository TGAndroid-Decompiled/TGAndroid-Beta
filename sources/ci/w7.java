package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.wl0;
public final class w7 implements bh.a {
    public final int f5732a;
    public final Object f5733b;

    public w7(Object obj, int i10) {
        this.f5732a = i10;
        this.f5733b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f5732a) {
            case 0:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f5732a) {
            case 0:
                d8 d8Var = (d8) this.f5733b;
                wl0 wl0Var = d8Var.d;
                gh.d.b(wl0Var, canvas, rectF, wl0Var, d8Var.getContainerView(), 255);
                return;
            default:
                xh.s2 s2Var = (xh.s2) this.f5733b;
                for (View view : s2Var.h.getViewPages()) {
                    if (view instanceof xh.o2) {
                        xh.o2 o2Var = (xh.o2) view;
                        if (o2Var.h == null) {
                            xh.j2 j2Var = o2Var.f46316f;
                            ViewGroup viewGroup = s2Var.S;
                            Objects.requireNonNull(j2Var);
                            o2Var.h = new ah.n(j2Var, viewGroup, new org.telegram.ui.v8(j2Var, 0));
                        }
                        o2Var.h.f(canvas, rectF);
                    }
                }
                return;
        }
    }
}
