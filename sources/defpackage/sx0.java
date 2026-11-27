package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class sx0 extends FrameLayout implements ey0 {
    public final ey0 a;

    public sx0(ey0 ey0Var) {
        super(ey0Var.getContext());
        this.a = ey0Var;
    }

    @Override
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z) {
        this.a.setDrawingFromOverlay(z);
    }

    @Override
    public final float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2) {
        return this.a.y(canvas, rectF, f, rectF2, f2);
    }
}
