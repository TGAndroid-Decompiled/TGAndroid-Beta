package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class t1c extends o39 {
    public final a2c f3;
    public final d2c g3;

    public t1c(d2c d2cVar, Context context, a2c a2cVar) {
        super(context, null);
        this.g3 = d2cVar;
        this.f3 = a2cVar;
    }

    @Override
    public final boolean F0(float f) {
        if (f >= gl.L(58.0f) + this.g3.F) {
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
