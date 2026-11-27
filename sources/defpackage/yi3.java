package defpackage;

import android.graphics.Canvas;
public final class yi3 extends vl {
    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(hl.L(-2.0f), hl.L(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
