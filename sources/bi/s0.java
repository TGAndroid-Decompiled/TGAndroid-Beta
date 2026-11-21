package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class s0 extends FrameLayout {
    public final float f4057a;

    public s0(Context context, float f10) {
        super(context);
        this.f4057a = f10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.f4057a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
