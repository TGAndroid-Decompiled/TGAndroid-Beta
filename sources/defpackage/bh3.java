package defpackage;

import android.graphics.Canvas;
public final class bh3 extends um {
    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(gm.L(-2.0f), gm.L(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
