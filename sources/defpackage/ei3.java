package defpackage;

import android.graphics.Canvas;
public final class ei3 extends ul {
    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(gl.L(-2.0f), gl.L(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
