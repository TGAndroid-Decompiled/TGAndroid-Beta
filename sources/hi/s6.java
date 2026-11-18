package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.Components.ck0;
public final class s6 implements eh.a {
    public final int f15383a;
    public final org.telegram.ui.ActionBar.x2 f15384b;

    public s6(org.telegram.ui.ActionBar.x2 x2Var, int i7) {
        this.f15383a = i7;
        this.f15384b = x2Var;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f15383a) {
            case 0:
            default:
                aVar.f8369a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        switch (this.f15383a) {
            case 0:
                v6 v6Var = (v6) this.f15384b;
                ck0 ck0Var = v6Var.f39534o1;
                ih.d.b(ck0Var, canvas, rectF, ck0Var, v6Var.f30190b, 255);
                return;
            default:
                org.telegram.ui.ActionBar.x2 x2Var = this.f15384b;
                ViewGroup viewGroup = x2Var.f30190b;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getParent() == x2Var.f30193c) {
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
