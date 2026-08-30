package nh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class g5 extends m2.h {
    public boolean f15361t0;
    public final m5 f15362u0;
    public final m5 f15363v0;

    public g5(m5 m5Var, Context context) {
        super(context);
        this.f15363v0 = m5Var;
        this.f15362u0 = m5Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f15361t0 = true;
        }
        if (this.f15361t0 && this.f15362u0.f15616x <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f15361t0 = true;
        }
        if (this.f15361t0 && this.f15362u0.f15616x <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y10 = motionEvent.getY();
        currentTopOffset = this.f15363v0.getCurrentTopOffset();
        if (y10 < currentTopOffset && motionEvent.getAction() == 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y10 = motionEvent.getY();
        m5 m5Var = this.f15363v0;
        currentTopOffset = m5Var.getCurrentTopOffset();
        if (y10 >= currentTopOffset) {
            currentTopOffset2 = m5Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - m5Var.d) > AndroidUtilities.dp(1.0f)) {
                return false;
            }
            return A(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y10 = motionEvent.getY();
        m5 m5Var = this.f15363v0;
        currentTopOffset = m5Var.getCurrentTopOffset();
        if (y10 >= currentTopOffset) {
            currentTopOffset2 = m5Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - m5Var.d) > AndroidUtilities.dp(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
