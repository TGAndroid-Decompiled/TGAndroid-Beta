package fi;

import android.content.Context;
import android.view.MotionEvent;
public final class c5 extends c5.l {
    public boolean f11805x0;
    public final i5 f11806y0;
    public final i5 f11807z0;

    public c5(i5 i5Var, Context context) {
        super(context);
        this.f11807z0 = i5Var;
        this.f11806y0 = i5Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f11805x0 = true;
        }
        if (this.f11805x0 && this.f11806y0.f12103y <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f11805x0 = true;
        }
        if (this.f11805x0 && this.f11806y0.f12103y <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y10 = motionEvent.getY();
        currentTopOffset = this.f11807z0.getCurrentTopOffset();
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
        i5 i5Var = this.f11807z0;
        currentTopOffset = i5Var.getCurrentTopOffset();
        if (y10 >= currentTopOffset) {
            currentTopOffset2 = i5Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - i5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
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
        i5 i5Var = this.f11807z0;
        currentTopOffset = i5Var.getCurrentTopOffset();
        if (y10 >= currentTopOffset) {
            currentTopOffset2 = i5Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - i5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
