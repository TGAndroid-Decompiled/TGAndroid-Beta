package ng;

import android.graphics.Canvas;
import org.telegram.ui.Cells.g8;
import org.telegram.ui.Components.vl0;
public abstract class d extends vl0 {
    public boolean X2;

    @Override
    public final void dispatchDraw(Canvas canvas) {
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
