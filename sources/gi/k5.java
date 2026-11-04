package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.gc;
public final class k5 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float U;
    public float V;
    public final gc W;
    public boolean f13034a0;

    public k5(m5 m5Var, Context context) {
        super(context, m5Var.f13224q1);
        this.W = new gc(this);
        this.f13034a0 = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float a10 = this.W.a(0.05f);
        int i3 = (a10 > 1.0f ? 1 : (a10 == 1.0f ? 0 : -1));
        if (i3 < 0) {
            canvas.save();
            canvas.scale(a10, a10, this.U, this.V);
        }
        super.dispatchDraw(canvas);
        if (i3 < 0) {
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        gc gcVar = this.W;
        if (action == 0) {
            this.U = motionEvent.getX();
            this.V = motionEvent.getY();
            gcVar.c(this.f13034a0);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gcVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
