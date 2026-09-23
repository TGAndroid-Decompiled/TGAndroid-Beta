package og;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Cells.g8;
import org.telegram.ui.Components.ml0;
public abstract class d extends ml0 {
    public boolean X2;

    @Override
    public final void J0(Canvas canvas, RectF rectF, long j3) {
        super.J0(canvas, rectF, j3);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof c) {
                float x10 = childAt.getX();
                float y3 = childAt.getY();
                if (rectF.intersects(x10, y3, childAt.getWidth() + x10, childAt.getHeight() + y3)) {
                    canvas.save();
                    canvas.translate(x10, y3);
                    g8 g8Var = (g8) ((c) childAt);
                    if (g8Var.L) {
                        g8Var.b(canvas, this);
                    }
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        this.X2 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof c) {
                c cVar = (c) getChildAt(i10);
                canvas.save();
                canvas.translate(cVar.getX(), cVar.getY());
                g8 g8Var = (g8) cVar;
                if (g8Var.L) {
                    g8Var.b(canvas, this);
                }
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void invalidate() {
        if (this.X2) {
            return;
        }
        super.invalidate();
        this.X2 = true;
    }
}
