package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class a9 extends FrameLayout {
    public final float f3411a;

    public a9(Context context, float f10) {
        super(context);
        this.f3411a = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f3411a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
