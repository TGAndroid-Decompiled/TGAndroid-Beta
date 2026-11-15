package ci;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class g0 extends s {
    public final i0 N;

    public g0(i0 i0Var, Activity activity, int i7, f0 f0Var) {
        super(activity, i7, f0Var);
        this.N = i0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i0 i0Var = this.N;
        float min = Math.min(getHeight(), i0Var.f5413w - (getTranslationY() + getTop()));
        c cVar = i0Var.f5415y;
        if (cVar != null) {
            cVar.H = min;
        }
        i0Var.L = min;
        if (cVar != null) {
            cVar.V = i0Var.f5411s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i0 i0Var = this.N;
        z0 z0Var = i0Var.d;
        if (z0Var != null && (z0Var.f5687m1 > 0.5f || z0Var.l1 > 0.5f)) {
            if (motionEvent.getActionMasked() == 1) {
                z0 z0Var2 = i0Var.d;
                z0Var2.f5687m1 = 0.0f;
                z0Var2.invalidate();
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
