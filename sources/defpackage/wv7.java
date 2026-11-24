package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class wv7 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float U;
    public float V;
    public final u51 W;
    public boolean a0;

    public wv7(xv7 xv7Var, Context context) {
        super(context, xv7Var.w1);
        this.W = new u51(this);
        this.a0 = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float a = this.W.a(0.05f);
        int i = (a > 1.0f ? 1 : (a == 1.0f ? 0 : -1));
        if (i < 0) {
            canvas.save();
            canvas.scale(a, a, this.U, this.V);
        }
        super.dispatchDraw(canvas);
        if (i < 0) {
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        u51 u51Var = this.W;
        if (action == 0) {
            this.U = motionEvent.getX();
            this.V = motionEvent.getY();
            u51Var.c(this.a0);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            u51Var.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
