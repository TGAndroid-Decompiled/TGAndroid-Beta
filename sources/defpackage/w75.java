package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class w75 extends pc8 {
    public final g95 T;

    public w75(g95 g95Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = g95Var;
    }

    @Override
    public final void c(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        g95 g95Var = this.T;
        e75 e75Var = g95Var.l1;
        g75 g75Var = g95Var.s4;
        if (f > 0.0f) {
            float x = g95Var.b.getX() + g75Var.getX();
            float y = g95Var.b.getY() + g75Var.getY();
            RectF rectF = gm.P;
            rectF.set(x, y, e75Var.getMeasuredWidth() + x, e75Var.getMeasuredHeight() + y);
            canvas.saveLayerAlpha(rectF, (int) (f * 255.0f), 31);
            canvas.translate(x, y);
            g75Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        e75 e75Var = this.T.l1;
        super.e();
        for (int i = 0; i < e75Var.getChildCount(); i++) {
            e75Var.getChildAt(i).invalidate();
        }
    }
}
