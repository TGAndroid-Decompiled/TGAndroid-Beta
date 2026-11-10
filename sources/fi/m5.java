package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.hc;
public final class m5 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float T;
    public float U;
    public final hc V;
    public boolean W;

    public m5(o5 o5Var, Context context) {
        super(context, o5Var.f12542p1);
        this.V = new hc(this);
        this.W = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float a10 = this.V.a(0.05f);
        int i7 = (a10 > 1.0f ? 1 : (a10 == 1.0f ? 0 : -1));
        if (i7 < 0) {
            canvas.save();
            canvas.scale(a10, a10, this.T, this.U);
        }
        super.dispatchDraw(canvas);
        if (i7 < 0) {
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        hc hcVar = this.V;
        if (action == 0) {
            this.T = motionEvent.getX();
            this.U = motionEvent.getY();
            hcVar.c(this.W);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            hcVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
