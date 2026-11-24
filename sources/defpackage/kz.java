package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class kz extends FrameLayout {
    public final float a;

    public kz(Context context, float f) {
        super(context);
        this.a = f;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
