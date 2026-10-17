package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.yc;
public final class d6 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float T;
    public float U;
    public final yc V;
    public boolean W;

    public d6(f6 f6Var, Context context) {
        super(context, f6Var.G1);
        this.V = new yc(this);
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
        yc ycVar = this.V;
        if (action == 0) {
            this.T = motionEvent.getX();
            this.U = motionEvent.getY();
            ycVar.c(this.W);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ycVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
