package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class e6 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float P;
    public float Q;
    public final org.telegram.ui.Components.pc R;
    public boolean S;

    public e6(g6 g6Var, Context context) {
        super(context, g6Var.C1);
        this.R = new org.telegram.ui.Components.pc(this);
        this.S = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float a2 = this.R.a(0.05f);
        int i9 = (a2 > 1.0f ? 1 : (a2 == 1.0f ? 0 : -1));
        if (i9 < 0) {
            canvas.save();
            canvas.scale(a2, a2, this.P, this.Q);
        }
        super.dispatchDraw(canvas);
        if (i9 < 0) {
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        org.telegram.ui.Components.pc pcVar = this.R;
        if (action == 0) {
            this.P = motionEvent.getX();
            this.Q = motionEvent.getY();
            pcVar.c(this.S);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            pcVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
