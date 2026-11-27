package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class a85 extends de8 {
    public final j95 T;

    public a85(j95 j95Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = j95Var;
    }

    @Override
    public final void c(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        j95 j95Var = this.T;
        i75 i75Var = j95Var.l1;
        k75 k75Var = j95Var.s4;
        if (f > 0.0f) {
            float x = j95Var.b.getX() + k75Var.getX();
            float y = j95Var.b.getY() + k75Var.getY();
            RectF rectF = hl.P;
            rectF.set(x, y, i75Var.getMeasuredWidth() + x, i75Var.getMeasuredHeight() + y);
            canvas.saveLayerAlpha(rectF, (int) (f * 255.0f), 31);
            canvas.translate(x, y);
            k75Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        i75 i75Var = this.T.l1;
        super.e();
        for (int i = 0; i < i75Var.getChildCount(); i++) {
            i75Var.getChildAt(i).invalidate();
        }
    }
}
