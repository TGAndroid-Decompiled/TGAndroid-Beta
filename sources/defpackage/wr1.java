package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class wr1 extends de8 {
    @Override
    public final void c(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        if (f > 0.0f) {
            ViewGroup viewGroup = this.e;
            if (viewGroup instanceof wb2) {
                wb2 wb2Var = (wb2) viewGroup;
                RectF rectF = hl.P;
                rectF.set(f2, (int) Math.max(f4, f3), wb2Var.getMeasuredWidth() + f2, (int) Math.min(f5, wb2Var.getMeasuredHeight() + f3));
                canvas.saveLayerAlpha(rectF, (int) (f * 255.0f), 31);
                canvas.translate(f2, f3 + wb2Var.getPaddingTop());
                wb2Var.Yb = true;
                wb2Var.j1(canvas);
                if (wb2Var.I3() && wb2Var.getCurrentMessagesGroup() == null) {
                    wb2Var.A1(1.0f, canvas, false);
                }
                wb2Var.Yb = false;
                canvas.restore();
            }
        }
    }
}
