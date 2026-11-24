package defpackage;

import android.graphics.Canvas;
public final class z1c extends xna {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        boa.a(canvas, getLayout());
        canvas.restore();
    }
}
