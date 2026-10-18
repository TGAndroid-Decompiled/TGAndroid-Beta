package ci;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class w5 extends z4.g {
    public boolean f6118w0;
    public final c6 f6119x0;
    public final c6 f6120y0;

    public w5(c6 c6Var, Context context) {
        super(context);
        this.f6120y0 = c6Var;
        this.f6119x0 = c6Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f6118w0 = true;
        }
        if (this.f6118w0 && this.f6119x0.f5288x <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f6118w0 = true;
        }
        if (this.f6118w0 && this.f6119x0.f5288x <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y3 = motionEvent.getY();
        currentTopOffset = this.f6120y0.getCurrentTopOffset();
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
        c6 c6Var = this.f6120y0;
        currentTopOffset = c6Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = c6Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - c6Var.d) > AndroidUtilities.dp(1.0f)) {
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
        c6 c6Var = this.f6120y0;
        currentTopOffset = c6Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = c6Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - c6Var.d) > AndroidUtilities.dp(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
