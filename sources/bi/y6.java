package bi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class y6 extends z4.g {
    public boolean f4020w0;
    public final e7 f4021x0;
    public final e7 f4022y0;

    public y6(e7 e7Var, Context context) {
        super(context);
        this.f4022y0 = e7Var;
        this.f4021x0 = e7Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4020w0 = true;
        }
        if (this.f4020w0 && this.f4021x0.f2996x <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4020w0 = true;
        }
        if (this.f4020w0 && this.f4021x0.f2996x <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y3 = motionEvent.getY();
        currentTopOffset = this.f4022y0.getCurrentTopOffset();
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
        e7 e7Var = this.f4022y0;
        currentTopOffset = e7Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = e7Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - e7Var.d) > AndroidUtilities.dp(1.0f)) {
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
        e7 e7Var = this.f4022y0;
        currentTopOffset = e7Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = e7Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - e7Var.d) > AndroidUtilities.dp(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
