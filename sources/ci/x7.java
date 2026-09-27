package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.yl0;
public final class x7 implements bh.a {
    public final int f5845a;
    public final Object f5846b;

    public x7(Object obj, int i10) {
        this.f5845a = i10;
        this.f5846b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f5845a) {
            case 0:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f5845a) {
            case 0:
                c8 c8Var = (c8) this.f5846b;
                yl0 yl0Var = c8Var.d;
                gh.d.b(yl0Var, canvas, rectF, yl0Var, c8Var.getContainerView(), 255);
                return;
            default:
                xh.t2 t2Var = (xh.t2) this.f5846b;
                for (View view : t2Var.h.getViewPages()) {
                    if (view instanceof xh.p2) {
                        xh.p2 p2Var = (xh.p2) view;
                        if (p2Var.h == null) {
                            final xh.k2 k2Var = p2Var.f46408f;
                            ViewGroup viewGroup = t2Var.S;
                            Objects.requireNonNull(k2Var);
                            p2Var.h = new ah.n(k2Var, viewGroup, new ah.m() {
                                @Override
                                public final boolean a(Canvas canvas2, View view2, long j3) {
                                    return t61.this.drawChild(canvas2, view2, j3);
                                }
                            });
                        }
                        p2Var.h.f(canvas, rectF);
                    }
                }
                return;
        }
    }
}
