package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class l0 extends FrameLayout {
    public final float f12838a;

    public l0(Context context, float f10) {
        super(context);
        this.f12838a = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f12838a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
