package di;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class v5 extends a5.m {
    public boolean f9256w0;
    public final b6 f9257x0;
    public final b6 f9258y0;

    public v5(b6 b6Var, Context context) {
        super(context);
        this.f9258y0 = b6Var;
        this.f9257x0 = b6Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9256w0 = true;
        }
        if (this.f9256w0 && this.f9257x0.f8434x <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9256w0 = true;
        }
        if (this.f9256w0 && this.f9257x0.f8434x <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y3 = motionEvent.getY();
        currentTopOffset = this.f9258y0.getCurrentTopOffset();
        if (y3 < currentTopOffset && motionEvent.getAction() == 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y3 = motionEvent.getY();
        b6 b6Var = this.f9258y0;
        currentTopOffset = b6Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = b6Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - b6Var.d) > AndroidUtilities.dp(1.0f)) {
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
        float y3 = motionEvent.getY();
        b6 b6Var = this.f9258y0;
        currentTopOffset = b6Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = b6Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - b6Var.d) > AndroidUtilities.dp(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
