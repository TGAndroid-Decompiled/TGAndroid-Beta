package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class c6 extends FrameLayout {
    public final float f10521a;

    public c6(Context context, float f10) {
        super(context);
        this.f10521a = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f10521a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
