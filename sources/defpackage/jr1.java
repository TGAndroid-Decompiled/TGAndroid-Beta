package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class jr1 extends ma8 {
    @Override
    public final void c(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        if (f > 0.0f) {
            ViewGroup viewGroup = this.e;
            if (viewGroup instanceof gb2) {
                gb2 gb2Var = (gb2) viewGroup;
                RectF rectF = gl.P;
                rectF.set(f2, (int) Math.max(f4, f3), gb2Var.getMeasuredWidth() + f2, (int) Math.min(f5, gb2Var.getMeasuredHeight() + f3));
                canvas.saveLayerAlpha(rectF, (int) (f * 255.0f), 31);
                canvas.translate(f2, f3 + gb2Var.getPaddingTop());
                gb2Var.Yb = true;
                gb2Var.j1(canvas);
                if (gb2Var.I3() && gb2Var.getCurrentMessagesGroup() == null) {
                    gb2Var.A1(1.0f, canvas, false);
                }
                gb2Var.Yb = false;
                canvas.restore();
            }
        }
    }
}
