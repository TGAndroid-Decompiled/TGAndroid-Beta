package defpackage;

import android.graphics.Canvas;
public final class zzb extends wla {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        ama.a(canvas, getLayout());
        canvas.restore();
    }
}
