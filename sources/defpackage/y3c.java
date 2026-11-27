package defpackage;

import android.graphics.Canvas;
public final class y3c extends tpa {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        xpa.a(canvas, getLayout());
        canvas.restore();
    }
}
