package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class ry0 extends FrameLayout implements dz0 {
    public final dz0 a;

    public ry0(dz0 dz0Var) {
        super(dz0Var.getContext());
        this.a = dz0Var;
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
