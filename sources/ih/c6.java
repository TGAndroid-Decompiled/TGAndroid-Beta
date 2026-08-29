package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class c6 extends FrameLayout {
    public final float f9087a;

    public c6(Context context, float f9) {
        super(context);
        this.f9087a = f9;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f9087a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
