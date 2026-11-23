package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.Components.ek0;
public final class s6 implements eh.a {
    public final int f15333a;
    public final org.telegram.ui.ActionBar.w2 f15334b;

    public s6(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.f15333a = i7;
        this.f15334b = w2Var;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f15333a) {
            case 0:
            default:
                aVar.f8364a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        switch (this.f15333a) {
            case 0:
                v6 v6Var = (v6) this.f15334b;
                ek0 ek0Var = v6Var.f39487o1;
                ih.d.b(ek0Var, canvas, rectF, ek0Var, v6Var.f30142b, 255);
                return;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = this.f15334b;
                ViewGroup viewGroup = w2Var.f30142b;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getParent() == w2Var.f30145c) {
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
