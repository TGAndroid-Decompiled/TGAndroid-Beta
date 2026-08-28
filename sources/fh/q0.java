package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class q0 extends FrameLayout {
    public final float f6723a;

    public q0(Context context, float f10) {
        super(context);
        this.f6723a = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f6723a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
