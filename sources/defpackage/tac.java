package defpackage;

import android.graphics.Canvas;
public final class tac extends vl {
    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, hl.L(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
