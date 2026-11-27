package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class s5c extends d79 {
    public final z5c f3;
    public final d6c g3;

    public s5c(d6c d6cVar, Context context, z5c z5cVar) {
        super(context, null);
        this.g3 = d6cVar;
        this.f3 = z5cVar;
    }

    @Override
    public final boolean G0(float f) {
        if (f >= hl.L(58.0f) + this.g3.F) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.g3.G = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean d = this.f3.d(this, motionEvent);
        if (!super.onInterceptTouchEvent(motionEvent) && !d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.g3.M != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (!this.g3.I) {
            super.requestLayout();
        }
    }
}
