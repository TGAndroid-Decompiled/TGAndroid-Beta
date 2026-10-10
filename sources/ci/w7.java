package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.rm0;
public final class w7 implements bh.a {
    public final int f6214a;
    public final Object f6215b;

    public w7(Object obj, int i10) {
        this.f6214a = i10;
        this.f6215b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f6214a) {
            case 0:
            default:
                aVar.f536a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f6214a) {
            case 0:
                d8 d8Var = (d8) this.f6215b;
                rm0 rm0Var = d8Var.d;
                gh.d.b(rm0Var, canvas, rectF, rm0Var, d8Var.getContainerView(), 255);
                return;
            default:
                xh.s2 s2Var = (xh.s2) this.f6215b;
                for (View view : s2Var.h.getViewPages()) {
                    if (view instanceof xh.o2) {
                        xh.o2 o2Var = (xh.o2) view;
                        if (o2Var.h == null) {
                            xh.j2 j2Var = o2Var.f51483f;
                            ViewGroup viewGroup = s2Var.S;
                            Objects.requireNonNull(j2Var);
                            o2Var.h = new ah.n(j2Var, viewGroup, new org.telegram.ui.u8(j2Var, 0));
                        }
                        o2Var.h.f(canvas, rectF);
                    }
                }
                return;
        }
    }
}
