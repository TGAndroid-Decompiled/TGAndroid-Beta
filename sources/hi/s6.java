package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.Components.ck0;
public final class s6 implements eh.a {
    public final int f15386a;
    public final org.telegram.ui.ActionBar.x2 f15387b;

    public s6(org.telegram.ui.ActionBar.x2 x2Var, int i7) {
        this.f15386a = i7;
        this.f15387b = x2Var;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f15386a) {
            case 0:
            default:
                aVar.f8372a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        switch (this.f15386a) {
            case 0:
                v6 v6Var = (v6) this.f15387b;
                ck0 ck0Var = v6Var.f39534o1;
                ih.d.b(ck0Var, canvas, rectF, ck0Var, v6Var.f30192b, 255);
                return;
            default:
                org.telegram.ui.ActionBar.x2 x2Var = this.f15387b;
                ViewGroup viewGroup = x2Var.f30192b;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getParent() == x2Var.f30195c) {
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
