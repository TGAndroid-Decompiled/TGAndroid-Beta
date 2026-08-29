package lh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class f5 extends m2.g {
    public boolean f15595s0;
    public final l5 f15596t0;
    public final l5 f15597u0;

    public f5(l5 l5Var, Context context) {
        super(context);
        this.f15597u0 = l5Var;
        this.f15596t0 = l5Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f15595s0 = true;
        }
        if (this.f15595s0 && this.f15596t0.f15891x <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f15595s0 = true;
        }
        if (this.f15595s0 && this.f15596t0.f15891x <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y8 = motionEvent.getY();
        currentTopOffset = this.f15597u0.getCurrentTopOffset();
        if (y8 < currentTopOffset && motionEvent.getAction() == 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y8 = motionEvent.getY();
        l5 l5Var = this.f15597u0;
        currentTopOffset = l5Var.getCurrentTopOffset();
        if (y8 >= currentTopOffset) {
            currentTopOffset2 = l5Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - l5Var.d) > AndroidUtilities.dp(1.0f)) {
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
        float y8 = motionEvent.getY();
        l5 l5Var = this.f15597u0;
        currentTopOffset = l5Var.getCurrentTopOffset();
        if (y8 >= currentTopOffset) {
            currentTopOffset2 = l5Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - l5Var.d) > AndroidUtilities.dp(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
