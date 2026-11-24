package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
public final class lp9 extends im0 {
    public final RectF j0;

    public lp9(mp9 mp9Var) {
        super(mp9Var, mp9Var, mp9Var);
        this.j0 = new RectF();
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        hm0 hm0Var = this.S;
        Rect rect = hm0Var.m;
        if (!rect.isEmpty() && this.c != 0) {
            RectF rectF = this.j0;
            rectF.set(rect);
            canvas.save();
            canvas.clipPath(hm0Var.k);
            vx8.c(canvas, rectF, 0.0f, this.c / 255.0f);
            canvas.restore();
        }
    }
}
