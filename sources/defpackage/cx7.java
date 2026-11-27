package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cx7 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float U;
    public float V;
    public final v41 W;
    public boolean a0;

    public cx7(dx7 dx7Var, Context context) {
        super(context, dx7Var.q1);
        this.W = new v41(this);
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
        v41 v41Var = this.W;
        if (action == 0) {
            this.U = motionEvent.getX();
            this.V = motionEvent.getY();
            v41Var.c(this.a0);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            v41Var.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
