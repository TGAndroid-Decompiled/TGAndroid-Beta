package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.uc;
public final class s5 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float P;
    public float Q;
    public final uc R;
    public boolean S;

    public s5(t5 t5Var, Context context) {
        super(context, t5Var.C1);
        this.R = new uc(this);
        this.S = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float a2 = this.R.a(0.05f);
        int i10 = (a2 > 1.0f ? 1 : (a2 == 1.0f ? 0 : -1));
        if (i10 < 0) {
            canvas.save();
            canvas.scale(a2, a2, this.P, this.Q);
        }
        super.dispatchDraw(canvas);
        if (i10 < 0) {
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        uc ucVar = this.R;
        if (action == 0) {
            this.P = motionEvent.getX();
            this.Q = motionEvent.getY();
            ucVar.c(this.S);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ucVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
