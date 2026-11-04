package bi;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class h0 extends s {
    public final j0 N;

    public h0(j0 j0Var, Activity activity, int i3, g0 g0Var) {
        super(activity, i3, g0Var);
        this.N = j0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j0 j0Var = this.N;
        float min = Math.min(getHeight(), j0Var.f3774w - (getTranslationY() + getTop()));
        c cVar = j0Var.f3776y;
        if (cVar != null) {
            cVar.H = min;
        }
        j0Var.L = min;
        if (cVar != null) {
            cVar.V = j0Var.f3772s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        j0 j0Var = this.N;
        a1 a1Var = j0Var.d;
        if (a1Var != null && (a1Var.m1 > 0.5f || a1Var.f3504l1 > 0.5f)) {
            if (motionEvent.getActionMasked() == 1) {
                a1 a1Var2 = j0Var.d;
                a1Var2.m1 = 0.0f;
                a1Var2.invalidate();
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
