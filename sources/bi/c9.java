package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class c9 extends FrameLayout {
    public final float f3447a;

    public c9(Context context, float f10) {
        super(context);
        this.f3447a = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f3447a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
