package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public abstract class q39 extends o39 {
    public boolean f3;

    @Override
    public final void K0(Canvas canvas, RectF rectF, long j) {
        super.K0(canvas, rectF, j);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof p39) {
                float x = childAt.getX();
                float y = childAt.getY();
                if (rectF.intersects(x, y, childAt.getWidth() + x, childAt.getHeight() + y)) {
                    canvas.save();
                    canvas.translate(x, y);
                    xya xyaVar = (xya) ((p39) childAt);
                    if (xyaVar.M) {
                        xyaVar.b(canvas, this);
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
            if (getChildAt(i) instanceof p39) {
                p39 p39Var = (p39) getChildAt(i);
                canvas.save();
                canvas.translate(p39Var.getX(), p39Var.getY());
                xya xyaVar = (xya) p39Var;
                if (xyaVar.M) {
                    xyaVar.b(canvas, this);
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
