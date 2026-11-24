package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class kx0 extends FrameLayout implements wx0 {
    public final wx0 a;

    public kx0(wx0 wx0Var) {
        super(wx0Var.getContext());
        this.a = wx0Var;
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
