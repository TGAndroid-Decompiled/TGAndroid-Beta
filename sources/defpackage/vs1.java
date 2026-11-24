package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class vs1 extends pc8 {
    @Override
    public final void c(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        if (f > 0.0f) {
            ViewGroup viewGroup = this.e;
            if (viewGroup instanceof rc2) {
                rc2 rc2Var = (rc2) viewGroup;
                RectF rectF = gm.P;
                rectF.set(f2, (int) Math.max(f4, f3), rc2Var.getMeasuredWidth() + f2, (int) Math.min(f5, rc2Var.getMeasuredHeight() + f3));
                canvas.saveLayerAlpha(rectF, (int) (f * 255.0f), 31);
                canvas.translate(f2, f3 + rc2Var.getPaddingTop());
                rc2Var.Yb = true;
                rc2Var.j1(canvas);
                if (rc2Var.I3() && rc2Var.getCurrentMessagesGroup() == null) {
                    rc2Var.A1(1.0f, canvas, false);
                }
                rc2Var.Yb = false;
                canvas.restore();
            }
        }
    }
}
