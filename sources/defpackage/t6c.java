package defpackage;

import android.graphics.Canvas;
public final class t6c extends ul {
    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, gl.L(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
