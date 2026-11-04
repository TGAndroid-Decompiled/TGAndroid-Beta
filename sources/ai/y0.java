package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class y0 extends FrameLayout {
    public final float f1107a;

    public y0(Context context, float f10) {
        super(context);
        this.f1107a = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f1107a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
