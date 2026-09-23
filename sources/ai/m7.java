package ai;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class m7 extends z4.g {
    public boolean f1259w0;
    public final s7 f1260x0;
    public final s7 f1261y0;

    public m7(s7 s7Var, Context context) {
        super(context);
        this.f1261y0 = s7Var;
        this.f1260x0 = s7Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1259w0 = true;
        }
        if (this.f1259w0 && this.f1260x0.f1506x <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1259w0 = true;
        }
        if (this.f1259w0 && this.f1260x0.f1506x <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y3 = motionEvent.getY();
        currentTopOffset = this.f1261y0.getCurrentTopOffset();
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
        s7 s7Var = this.f1261y0;
        currentTopOffset = s7Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = s7Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - s7Var.d) > AndroidUtilities.dp(1.0f)) {
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
        s7 s7Var = this.f1261y0;
        currentTopOffset = s7Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = s7Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - s7Var.d) > AndroidUtilities.dp(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
