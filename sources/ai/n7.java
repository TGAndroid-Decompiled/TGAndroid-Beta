package ai;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class n7 extends z4.g {
    public boolean f1477w0;
    public final t7 f1478x0;
    public final t7 f1479y0;

    public n7(t7 t7Var, Context context) {
        super(context);
        this.f1479y0 = t7Var;
        this.f1478x0 = t7Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1477w0 = true;
        }
        if (this.f1477w0 && this.f1478x0.f1747x <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1477w0 = true;
        }
        if (this.f1477w0 && this.f1478x0.f1747x <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y3 = motionEvent.getY();
        currentTopOffset = this.f1479y0.getCurrentTopOffset();
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
        t7 t7Var = this.f1479y0;
        currentTopOffset = t7Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = t7Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - t7Var.d) > AndroidUtilities.dp(1.0f)) {
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
        t7 t7Var = this.f1479y0;
        currentTopOffset = t7Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = t7Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - t7Var.d) > AndroidUtilities.dp(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
