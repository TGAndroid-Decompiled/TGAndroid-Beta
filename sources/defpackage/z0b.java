package defpackage;

import android.graphics.Canvas;
public final class z0b extends z1b {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(aob.w0(null, aob.d6, false));
        }
        super.onDraw(canvas);
    }
}
