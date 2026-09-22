package ai;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class l7 extends z4.g {
    public boolean f1183w0;
    public final r7 f1184x0;
    public final r7 f1185y0;

    public l7(r7 r7Var, Context context) {
        super(context);
        this.f1185y0 = r7Var;
        this.f1184x0 = r7Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1183w0 = true;
        }
        if (this.f1183w0 && this.f1184x0.f1476x <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1183w0 = true;
        }
        if (this.f1183w0 && this.f1184x0.f1476x <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y3 = motionEvent.getY();
        currentTopOffset = this.f1185y0.getCurrentTopOffset();
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
        r7 r7Var = this.f1185y0;
        currentTopOffset = r7Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = r7Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - r7Var.d) > AndroidUtilities.dp(1.0f)) {
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
        r7 r7Var = this.f1185y0;
        currentTopOffset = r7Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = r7Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - r7Var.d) > AndroidUtilities.dp(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
