package fi;

import android.content.Context;
import android.view.MotionEvent;
public final class e5 extends c5.l {
    public boolean f11673x0;
    public final k5 f11674y0;
    public final k5 f11675z0;

    public e5(k5 k5Var, Context context) {
        super(context);
        this.f11675z0 = k5Var;
        this.f11674y0 = k5Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f11673x0 = true;
        }
        if (this.f11673x0 && this.f11674y0.f11937y <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f11673x0 = true;
        }
        if (this.f11673x0 && this.f11674y0.f11937y <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y10 = motionEvent.getY();
        currentTopOffset = this.f11675z0.getCurrentTopOffset();
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
        k5 k5Var = this.f11675z0;
        currentTopOffset = k5Var.getCurrentTopOffset();
        if (y10 >= currentTopOffset) {
            currentTopOffset2 = k5Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - k5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
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
        k5 k5Var = this.f11675z0;
        currentTopOffset = k5Var.getCurrentTopOffset();
        if (y10 >= currentTopOffset) {
            currentTopOffset2 = k5Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - k5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
