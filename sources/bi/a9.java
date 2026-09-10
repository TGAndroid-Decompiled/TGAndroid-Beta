package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.vl0;
public final class a9 implements ah.a {
    public final int f2320a;
    public final Object f2321b;

    public a9(Object obj, int i10) {
        this.f2320a = i10;
        this.f2321b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages;
        switch (this.f2320a) {
            case 0:
                i9 i9Var = (i9) this.f2321b;
                vl0 vl0Var = i9Var.d;
                fh.d.a(vl0Var, canvas, rectF, vl0Var, i9Var.getContainerView(), 255);
                return;
            default:
                wh.q2 q2Var = (wh.q2) this.f2321b;
                for (View view : q2Var.h.getViewPages()) {
                    if (view instanceof wh.m2) {
                        wh.m2 m2Var = (wh.m2) view;
                        if (m2Var.h == null) {
                            wh.h2 h2Var = m2Var.f44249f;
                            ViewGroup viewGroup = q2Var.S;
                            Objects.requireNonNull(h2Var);
                            m2Var.h = new zg.k(h2Var, viewGroup, new org.telegram.ui.v8(h2Var, 0));
                        }
                        m2Var.h.e(canvas, rectF);
                    }
                }
                return;
        }
    }

    @Override
    public final void g(g.z zVar, RectF rectF) {
        switch (this.f2320a) {
            case 0:
            default:
                zVar.f8456b = true;
                return;
        }
    }
}
