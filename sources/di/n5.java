package di;

import android.content.Context;
import android.view.MotionEvent;
public final class n5 extends c5.k {
    public boolean f9392w0;
    public final t5 f9393x0;
    public final t5 f9394y0;

    public n5(t5 t5Var, Context context) {
        super(context);
        this.f9394y0 = t5Var;
        this.f9393x0 = t5Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9392w0 = true;
        }
        if (this.f9392w0 && this.f9393x0.f9794y <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9392w0 = true;
        }
        if (this.f9392w0 && this.f9393x0.f9794y <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y10 = motionEvent.getY();
        currentTopOffset = this.f9394y0.getCurrentTopOffset();
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
        t5 t5Var = this.f9394y0;
        currentTopOffset = t5Var.getCurrentTopOffset();
        if (y10 >= currentTopOffset) {
            currentTopOffset2 = t5Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - t5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
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
        t5 t5Var = this.f9394y0;
        currentTopOffset = t5Var.getCurrentTopOffset();
        if (y10 >= currentTopOffset) {
            currentTopOffset2 = t5Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - t5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
