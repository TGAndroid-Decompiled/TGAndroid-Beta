package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class r6 extends FrameLayout {
    public final float f3837a;

    public r6(Context context, float f10) {
        super(context);
        this.f3837a = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f3837a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
