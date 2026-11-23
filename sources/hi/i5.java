package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.mc;
public final class i5 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float U;
    public float V;
    public final mc W;
    public boolean f14790a0;

    public i5(k5 k5Var, Context context) {
        super(context, k5Var.f14899q1);
        this.W = new mc(this);
        this.f14790a0 = true;
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
        mc mcVar = this.W;
        if (action == 0) {
            this.U = motionEvent.getX();
            this.V = motionEvent.getY();
            mcVar.c(this.f14790a0);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            mcVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
