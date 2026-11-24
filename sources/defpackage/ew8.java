package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class ew8 extends sv8 {
    public final gw8 N;

    public ew8(gw8 gw8Var, Activity activity, int i, dw8 dw8Var) {
        super(activity, i, dw8Var);
        this.N = gw8Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        gw8 gw8Var = this.N;
        float min = Math.min(getHeight(), gw8Var.w - (getTranslationY() + getTop()));
        sx3 sx3Var = gw8Var.y;
        if (sx3Var != null) {
            sx3Var.H = min;
        }
        gw8Var.L = min;
        if (sx3Var != null) {
            sx3Var.V = gw8Var.s - sx3Var.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gw8 gw8Var = this.N;
        vw8 vw8Var = gw8Var.d;
        if (vw8Var != null && (vw8Var.m1 > 0.5f || vw8Var.l1 > 0.5f)) {
            if (motionEvent.getActionMasked() == 1) {
                vw8 vw8Var2 = gw8Var.d;
                vw8Var2.m1 = 0.0f;
                vw8Var2.invalidate();
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
