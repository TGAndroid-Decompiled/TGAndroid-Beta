package fh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import kh.s7;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.u8;
public final class x2 implements jg.a {
    public final int f6862a;
    public final Object f6863b;

    public x2(Object obj, int i9) {
        this.f6862a = i9;
        this.f6863b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f6862a) {
            case 0:
                j4 j4Var = (j4) this.f6863b;
                for (View view : j4Var.h.getViewPages()) {
                    if (view instanceof y3) {
                        y3 y3Var = (y3) view;
                        if (y3Var.h == null) {
                            s3 s3Var = y3Var.f6884f;
                            ViewGroup viewGroup = j4Var.O;
                            Objects.requireNonNull(s3Var);
                            y3Var.h = new ig.k(s3Var, viewGroup, new u8(s3Var, 0));
                        }
                        y3Var.h.e(canvas, rectF);
                    }
                }
                return;
            default:
                s7 s7Var = (s7) this.f6863b;
                wk0 wk0Var = s7Var.d;
                og.d.a(wk0Var, canvas, rectF, wk0Var, s7Var.getContainerView(), 255);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f6862a) {
            case 0:
            default:
                xVar.f7046b = true;
                return;
        }
    }
}
