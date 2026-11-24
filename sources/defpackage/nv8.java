package defpackage;

import android.graphics.Canvas;
public final class nv8 extends o39 {
    public ay2 f3;
    public aw8 g3;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        if (this.g3 != null) {
            canvas2 = canvas;
            i = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i = -1;
        }
        ay2 ay2Var = this.f3;
        if (ay2Var != null) {
            ay2Var.accept(canvas2);
        }
        super.dispatchDraw(canvas2);
        aw8 aw8Var = this.g3;
        if (aw8Var != null) {
            aw8Var.accept(canvas2);
            canvas2.restoreToCount(i);
        }
    }
}
