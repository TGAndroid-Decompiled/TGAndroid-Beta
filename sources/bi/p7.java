package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class p7 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float T;
    public float U;
    public final org.telegram.ui.Components.xc V;
    public boolean W;

    public p7(r7 r7Var, Context context) {
        super(context, r7Var.G1);
        this.V = new org.telegram.ui.Components.xc(this);
        this.W = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float a2 = this.V.a(0.05f);
        int i10 = (a2 > 1.0f ? 1 : (a2 == 1.0f ? 0 : -1));
        if (i10 < 0) {
            canvas.save();
            canvas.scale(a2, a2, this.T, this.U);
        }
        super.dispatchDraw(canvas);
        if (i10 < 0) {
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        org.telegram.ui.Components.xc xcVar = this.V;
        if (action == 0) {
            this.T = motionEvent.getX();
            this.U = motionEvent.getY();
            xcVar.c(this.W);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            xcVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
