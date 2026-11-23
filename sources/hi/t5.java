package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class t5 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float U;
    public float V;
    public final org.telegram.ui.Components.lc W;
    public boolean f15438a0;

    public t5(v5 v5Var, Context context) {
        super(context, v5Var.f15585q1);
        this.W = new org.telegram.ui.Components.lc(this);
        this.f15438a0 = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float a10 = this.W.a(0.05f);
        int i7 = (a10 > 1.0f ? 1 : (a10 == 1.0f ? 0 : -1));
        if (i7 < 0) {
            canvas.save();
            canvas.scale(a10, a10, this.U, this.V);
        }
        super.dispatchDraw(canvas);
        if (i7 < 0) {
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        org.telegram.ui.Components.lc lcVar = this.W;
        if (action == 0) {
            this.U = motionEvent.getX();
            this.V = motionEvent.getY();
            lcVar.c(this.f15438a0);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            lcVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
