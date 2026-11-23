package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.Components.ek0;
public final class r6 implements eh.a {
    public final int f15338a;
    public final org.telegram.ui.ActionBar.w2 f15339b;

    public r6(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.f15338a = i7;
        this.f15339b = w2Var;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f15338a) {
            case 0:
            default:
                aVar.f8401a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        switch (this.f15338a) {
            case 0:
                u6 u6Var = (u6) this.f15339b;
                ek0 ek0Var = u6Var.f39531o1;
                ih.d.b(ek0Var, canvas, rectF, ek0Var, u6Var.f30176b, 255);
                return;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = this.f15339b;
                ViewGroup viewGroup = w2Var.f30176b;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getParent() == w2Var.f30179c) {
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
