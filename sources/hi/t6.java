package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.Components.uj0;
public final class t6 implements eh.a {
    public final int f15153a;
    public final org.telegram.ui.ActionBar.u2 f15154b;

    public t6(org.telegram.ui.ActionBar.u2 u2Var, int i7) {
        this.f15153a = i7;
        this.f15154b = u2Var;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f15153a) {
            case 0:
            default:
                aVar.f8090a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        switch (this.f15153a) {
            case 0:
                v6 v6Var = (v6) this.f15154b;
                uj0 uj0Var = v6Var.f35931o1;
                ih.d.b(uj0Var, canvas, rectF, uj0Var, v6Var.f29682b, 255);
                return;
            default:
                org.telegram.ui.ActionBar.u2 u2Var = this.f15154b;
                ViewGroup viewGroup = u2Var.f29682b;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getParent() == u2Var.f29685c) {
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
