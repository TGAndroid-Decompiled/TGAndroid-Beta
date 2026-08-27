package jh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

public final class e5 extends m2.g {

    public boolean f13302s0;

    public final k5 f13303t0;

    public final k5 f13304u0;

    public e5(k5 k5Var, Context context) {
        super(context);
        this.f13304u0 = k5Var;
        this.f13303t0 = k5Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f13302s0 = true;
        }
        if (this.f13302s0 && this.f13303t0.f13586x <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f13302s0 = true;
        }
        if (!this.f13302s0 || this.f13303t0.f13586x > 0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() >= this.f13304u0.getCurrentTopOffset() || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        k5 k5Var = this.f13304u0;
        if (y10 >= k5Var.getCurrentTopOffset() && Math.abs(k5Var.getCurrentTopOffset() - k5Var.d) <= AndroidUtilities.dp(1.0f)) {
            return A(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        k5 k5Var = this.f13304u0;
        if (y10 >= k5Var.getCurrentTopOffset() && Math.abs(k5Var.getCurrentTopOffset() - k5Var.d) <= AndroidUtilities.dp(1.0f)) {
            return B(motionEvent);
        }
        return false;
    }
}
