package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
public final class ar9 extends jl0 {
    public final RectF j0;

    public ar9(br9 br9Var) {
        super(br9Var, br9Var, br9Var);
        this.j0 = new RectF();
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        il0 il0Var = this.S;
        Rect rect = il0Var.m;
        if (!rect.isEmpty() && this.c != 0) {
            RectF rectF = this.j0;
            rectF.set(rect);
            canvas.save();
            canvas.clipPath(il0Var.k);
            fz8.c(canvas, rectF, 0.0f, this.c / 255.0f);
            canvas.restore();
        }
    }
}
