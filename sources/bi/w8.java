package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class w8 extends FrameLayout {
    public final float f4161a;

    public w8(Context context, float f10) {
        super(context);
        this.f4161a = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f4161a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
