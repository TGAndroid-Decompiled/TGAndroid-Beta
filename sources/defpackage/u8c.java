package defpackage;

import android.graphics.Canvas;
public final class u8c extends um {
    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, gm.L(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
