package defpackage;

import android.graphics.Canvas;
public final class p36 extends ahb {
    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
    }
}
