package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class rwa extends wec {
    public boolean W;
    public final uxa a0;

    public rwa(uxa uxaVar, Activity activity) {
        super(activity, null);
        this.a0 = uxaVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            uxa uxaVar = this.a0;
            if (uxaVar.k0 != null) {
                View currentView = getCurrentView();
                zi1 zi1Var = uxaVar.k0;
                if (currentView == zi1Var) {
                    boolean H = zi1Var.H(motionEvent.getX() - uxaVar.k0.getX(), motionEvent.getY() - uxaVar.k0.getY());
                    zi1Var.Q0 = H;
                    if (H && zi1Var.a1.b.canScrollHorizontally(-1)) {
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
    public final void u() {
        uxa uxaVar = this.a0;
        uxaVar.o0(uxaVar.i0.getCurrentPosition(), true);
        uxaVar.p0(false, 0.0f);
    }

    @Override
    public final void w(boolean z) {
        uxa uxaVar = this.a0;
        float positionAnimated = uxaVar.i0.getPositionAnimated();
        uxaVar.p0(!z, positionAnimated);
        if (!z) {
            uxaVar.o0(Math.round(positionAnimated), true);
        }
    }
}
