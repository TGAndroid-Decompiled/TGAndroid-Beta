package ci;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class h0 extends s {
    public final j0 N;

    public h0(j0 j0Var, Activity activity, int i7, g0 g0Var) {
        super(activity, i7, g0Var);
        this.N = j0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j0 j0Var = this.N;
        float min = Math.min(getHeight(), j0Var.f5699w - (getTranslationY() + getTop()));
        c cVar = j0Var.f5701y;
        if (cVar != null) {
            cVar.H = min;
        }
        j0Var.L = min;
        if (cVar != null) {
            cVar.V = j0Var.f5697s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        j0 j0Var = this.N;
        z0 z0Var = j0Var.d;
        if (z0Var != null && (z0Var.f5970m1 > 0.5f || z0Var.l1 > 0.5f)) {
            if (motionEvent.getActionMasked() == 1) {
                z0 z0Var2 = j0Var.d;
                z0Var2.f5970m1 = 0.0f;
                z0Var2.invalidate();
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
