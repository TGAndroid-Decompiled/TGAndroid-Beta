package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.dc;
public final class k5 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float U;
    public float V;
    public final dc W;
    public boolean f14503a0;

    public k5(m5 m5Var, Context context) {
        super(context, m5Var.f14685q1);
        this.W = new dc(this);
        this.f14503a0 = true;
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
        dc dcVar = this.W;
        if (action == 0) {
            this.U = motionEvent.getX();
            this.V = motionEvent.getY();
            dcVar.c(this.f14503a0);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            dcVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
