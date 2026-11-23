package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.Components.ek0;
public final class b7 implements eh.a {
    public final int f14233a;
    public final org.telegram.ui.ActionBar.w2 f14234b;

    public b7(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.f14233a = i7;
        this.f14234b = w2Var;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f14233a) {
            case 0:
            default:
                aVar.f8363a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        switch (this.f14233a) {
            case 0:
                e7 e7Var = (e7) this.f14234b;
                ek0 ek0Var = e7Var.f39246o1;
                ih.d.b(ek0Var, canvas, rectF, ek0Var, e7Var.f30226b, 255);
                return;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = this.f14234b;
                ViewGroup viewGroup = w2Var.f30226b;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getParent() == w2Var.f30229c) {
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
