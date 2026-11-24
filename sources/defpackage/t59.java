package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public abstract class t59 extends r59 {
    public boolean f3;

    @Override
    public final void K0(Canvas canvas, RectF rectF, long j) {
        super.K0(canvas, rectF, j);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof s59) {
                float x = childAt.getX();
                float y = childAt.getY();
                if (rectF.intersects(x, y, childAt.getWidth() + x, childAt.getHeight() + y)) {
                    canvas.save();
                    canvas.translate(x, y);
                    y0b y0bVar = (y0b) ((s59) childAt);
                    if (y0bVar.M) {
                        y0bVar.b(canvas, this);
                    }
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        this.f3 = false;
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) instanceof s59) {
                s59 s59Var = (s59) getChildAt(i);
                canvas.save();
                canvas.translate(s59Var.getX(), s59Var.getY());
                y0b y0bVar = (y0b) s59Var;
                if (y0bVar.M) {
                    y0bVar.b(canvas, this);
                }
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void invalidate() {
        if (this.f3) {
            return;
        }
        super.invalidate();
        this.f3 = true;
    }
}
