package fi;

import android.content.Context;
import android.view.MotionEvent;
public final class d5 extends c5.l {
    public boolean f11891x0;
    public final j5 f11892y0;
    public final j5 f11893z0;

    public d5(j5 j5Var, Context context) {
        super(context);
        this.f11893z0 = j5Var;
        this.f11892y0 = j5Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f11891x0 = true;
        }
        if (this.f11891x0 && this.f11892y0.f12197y <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f11891x0 = true;
        }
        if (this.f11891x0 && this.f11892y0.f12197y <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y10 = motionEvent.getY();
        currentTopOffset = this.f11893z0.getCurrentTopOffset();
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
        j5 j5Var = this.f11893z0;
        currentTopOffset = j5Var.getCurrentTopOffset();
        if (y10 >= currentTopOffset) {
            currentTopOffset2 = j5Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - j5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
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
        j5 j5Var = this.f11893z0;
        currentTopOffset = j5Var.getCurrentTopOffset();
        if (y10 >= currentTopOffset) {
            currentTopOffset2 = j5Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - j5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
