package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class uya extends wgc {
    public boolean W;
    public final xza a0;

    public uya(xza xzaVar, Activity activity) {
        super(activity, null);
        this.a0 = xzaVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            xza xzaVar = this.a0;
            if (xzaVar.k0 != null) {
                View currentView = getCurrentView();
                ik1 ik1Var = xzaVar.k0;
                if (currentView == ik1Var) {
                    boolean H = ik1Var.H(motionEvent.getX() - xzaVar.k0.getX(), motionEvent.getY() - xzaVar.k0.getY());
                    ik1Var.Q0 = H;
                    if (H && ik1Var.a1.b.canScrollHorizontally(-1)) {
                        z = true;
                        this.W = z;
                    }
                }
            }
            z = false;
            this.W = z;
        }
        try {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked != 1 && actionMasked != 3) {
                return dispatchTouchEvent;
            }
            this.W = false;
            return dispatchTouchEvent;
        } catch (Throwable th) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.W = false;
            }
            throw th;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.W && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.W && B(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void t() {
        xza xzaVar = this.a0;
        xzaVar.p0(xzaVar.i0.getCurrentPosition(), true);
        xzaVar.q0(false, 0.0f);
    }

    @Override
    public final void w(boolean z) {
        xza xzaVar = this.a0;
        float positionAnimated = xzaVar.i0.getPositionAnimated();
        xzaVar.q0(!z, positionAnimated);
        if (!z) {
            xzaVar.p0(Math.round(positionAnimated), true);
        }
    }
}
