package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class u0b extends vic {
    public boolean W;
    public final w1b a0;

    public u0b(w1b w1bVar, Activity activity) {
        super(activity, null);
        this.a0 = w1bVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            w1b w1bVar = this.a0;
            if (w1bVar.k0 != null) {
                View currentView = getCurrentView();
                ij1 ij1Var = w1bVar.k0;
                if (currentView == ij1Var) {
                    boolean H = ij1Var.H(motionEvent.getX() - w1bVar.k0.getX(), motionEvent.getY() - w1bVar.k0.getY());
                    ij1Var.Q0 = H;
                    if (H && ij1Var.a1.b.canScrollHorizontally(-1)) {
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
        if (!this.W && C(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void v() {
        w1b w1bVar = this.a0;
        w1bVar.o0(w1bVar.i0.getCurrentPosition(), true);
        w1bVar.p0(false, 0.0f);
    }

    @Override
    public final void x(boolean z) {
        w1b w1bVar = this.a0;
        float positionAnimated = w1bVar.i0.getPositionAnimated();
        w1bVar.p0(!z, positionAnimated);
        if (!z) {
            w1bVar.o0(Math.round(positionAnimated), true);
        }
    }
}
