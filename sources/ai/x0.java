package ai;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class x0 extends y {
    public final z0 M;

    public x0(z0 z0Var, Activity activity, int i10, w0 w0Var) {
        super(activity, i10, w0Var);
        this.M = z0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        z0 z0Var = this.M;
        float min = Math.min(getHeight(), z0Var.v - (getTranslationY() + getTop()));
        d dVar = z0Var.f2011x;
        if (dVar != null) {
            dVar.G = min;
        }
        z0Var.K = min;
        if (dVar != null) {
            dVar.U = z0Var.f2009s - dVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        z0 z0Var = this.M;
        t1 t1Var = z0Var.d;
        if (t1Var != null && (t1Var.l1 > 0.5f || t1Var.f1782k1 > 0.5f)) {
            if (motionEvent.getActionMasked() == 1) {
                t1 t1Var2 = z0Var.d;
                t1Var2.l1 = 0.0f;
                t1Var2.invalidate();
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
