package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.Components.pj0;
public final class u6 implements eh.a {
    public final int f12896a;
    public final org.telegram.ui.ActionBar.w2 f12897b;

    public u6(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.f12896a = i7;
        this.f12897b = w2Var;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f12896a) {
            case 0:
            default:
                aVar.f8703a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        switch (this.f12896a) {
            case 0:
                w6 w6Var = (w6) this.f12897b;
                pj0 pj0Var = w6Var.n1;
                ih.d.b(pj0Var, canvas, rectF, pj0Var, w6Var.f28672b, 255);
                return;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = this.f12897b;
                ViewGroup viewGroup = w2Var.f28672b;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getParent() == w2Var.f28675c) {
                    canvas.save();
                    canvas.translate(viewGroup.getX(), viewGroup.getY());
                    viewGroup.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }
}
