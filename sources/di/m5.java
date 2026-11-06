package di;

import android.content.Context;
import android.view.MotionEvent;
public final class m5 extends c5.k {
    public boolean f9351w0;
    public final s5 f9352x0;
    public final s5 f9353y0;

    public m5(s5 s5Var, Context context) {
        super(context);
        this.f9353y0 = s5Var;
        this.f9352x0 = s5Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9351w0 = true;
        }
        if (this.f9351w0 && this.f9352x0.f9765y <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9351w0 = true;
        }
        if (this.f9351w0 && this.f9352x0.f9765y <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y10 = motionEvent.getY();
        currentTopOffset = this.f9353y0.getCurrentTopOffset();
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
        s5 s5Var = this.f9353y0;
        currentTopOffset = s5Var.getCurrentTopOffset();
        if (y10 >= currentTopOffset) {
            currentTopOffset2 = s5Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - s5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
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
        s5 s5Var = this.f9353y0;
        currentTopOffset = s5Var.getCurrentTopOffset();
        if (y10 >= currentTopOffset) {
            currentTopOffset2 = s5Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - s5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
