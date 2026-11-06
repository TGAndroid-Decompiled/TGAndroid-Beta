package ai;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class q0 extends x {
    public final s0 M;

    public q0(s0 s0Var, Activity activity, int i7, p0 p0Var) {
        super(activity, i7, p0Var);
        this.M = s0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s0 s0Var = this.M;
        float min = Math.min(getHeight(), s0Var.f1638w - (getTranslationY() + getTop()));
        d dVar = s0Var.f1640y;
        if (dVar != null) {
            dVar.G = min;
        }
        s0Var.K = min;
        if (dVar != null) {
            dVar.U = s0Var.f1637s - dVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        s0 s0Var = this.M;
        l1 l1Var = s0Var.d;
        if (l1Var != null && (l1Var.l1 > 0.5f || l1Var.f1419k1 > 0.5f)) {
            if (motionEvent.getActionMasked() == 1) {
                l1 l1Var2 = s0Var.d;
                l1Var2.l1 = 0.0f;
                l1Var2.invalidate();
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
