package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

public final class k6 extends FrameLayout {

    public final float f7404a;

    public k6(Context context, float f10) {
        super(context);
        this.f7404a = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f7404a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
