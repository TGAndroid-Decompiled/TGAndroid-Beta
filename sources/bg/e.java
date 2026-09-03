package bg;

import android.graphics.Canvas;
import org.telegram.ui.Cells.c8;
import org.telegram.ui.Components.rl0;
public abstract class e extends rl0 {
    public boolean U2;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.U2 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof d) {
                d dVar = (d) getChildAt(i10);
                canvas.save();
                canvas.translate(dVar.getX(), dVar.getY());
                c8 c8Var = (c8) dVar;
                if (c8Var.I) {
                    c8Var.b(canvas, this);
                }
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void invalidate() {
        if (this.U2) {
            return;
        }
        super.invalidate();
        this.U2 = true;
    }
}
