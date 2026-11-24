package defpackage;

import android.graphics.Canvas;
public final class ub5 extends um {
    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(gm.L(-2.0f), gm.L(0.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
