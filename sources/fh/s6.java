package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class s6 extends FrameLayout {
    public final float f6757a;

    public s6(Context context, float f10) {
        super(context);
        this.f6757a = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f6757a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
