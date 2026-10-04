package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.zl0;
public final class x7 implements bh.a {
    public final int f6298a;
    public final Object f6299b;

    public x7(Object obj, int i10) {
        this.f6298a = i10;
        this.f6299b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f6298a) {
            case 0:
            default:
                aVar.f450a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f6298a) {
            case 0:
                c8 c8Var = (c8) this.f6299b;
                zl0 zl0Var = c8Var.d;
                gh.d.b(zl0Var, canvas, rectF, zl0Var, c8Var.getContainerView(), 255);
                return;
            default:
                xh.s2 s2Var = (xh.s2) this.f6299b;
                for (View view : s2Var.h.getViewPages()) {
                    if (view instanceof xh.o2) {
                        xh.o2 o2Var = (xh.o2) view;
                        if (o2Var.h == null) {
                            final xh.j2 j2Var = o2Var.f50156f;
                            ViewGroup viewGroup = s2Var.S;
                            Objects.requireNonNull(j2Var);
                            o2Var.h = new ah.n(j2Var, viewGroup, new ah.m() {
                                @Override
                                public final boolean a(Canvas canvas2, View view2, long j3) {
                                    return c71.this.drawChild(canvas2, view2, j3);
                                }
                            });
                        }
                        o2Var.h.f(canvas, rectF);
                    }
                }
                return;
        }
    }
}
